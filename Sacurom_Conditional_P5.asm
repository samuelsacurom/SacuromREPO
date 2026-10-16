section .data   ; start of the data section
    number dd 17  ; the number to check
    msg_even db "Even number.", 10  ; message text followed by a newline 
    len_even equ $ - msg_even  ; length of msg_even in bytes
    msg_odd db "Odd number.", 10  ; message text followed by a newline 
    len_odd equ $ - msg_odd   ; length of msg_odd in bytes

section .text     ; start of the code section
    global _start  ; the start

_start:     ; program entry point
    mov eax, [number]   ; copy the number into eax the dividend
    xor edx, edx   ; clear edx so the 64-bit dividend edx:eax holds only eax's value
    mov ecx, 2    ; put the divisor 2 in ecx
    div ecx   ; divide edx:eax by ecx: quotient goes to eax, remainder to edx

    cmp edx, 0  ; compare the remainder with 0
    je  .even   ; jump to .even if the remainder is 0

    mov ecx, msg_odd   ; the remainder is not 0, so put the "odd" message address in ecx
    mov edx, len_odd  ; put its length in edx
    jmp .print    ; skip the even branch and go to the print step

.even:     ; label for the even case
    mov ecx, msg_even  ; put the address of the "even" message in ecx
    mov edx, len_even  ; put its length in edx

.print:      ; label for the print step
    mov eax, 4    ;sys_write
    mov ebx, 1   ; file descriptor 
    int 0x80   ; call the kernel to print the message

    mov eax, 1     ;sys_exit
    xor ebx, ebx  ; exit code 0
    int 0x80   ; call the kernel to end the program