section .data   ; start of the data section 
    number          dd 7   ; the number to check

    msg_inside db "Number is within the range.", 10   ; message text followed by a newline
    len_inside equ $ - msg_inside  ; length of msg_inside in bytes

    msg_outside db "Number is outside the range.", 10  ; message text followed by a newline 
    len_outside equ $ - msg_outside  ; length of msg_outside in bytes

section .text   ; start of the code section
    global _start ; the entry point

_start:   ; the start
    mov eax, [number]  ; copy the number into eax

    cmp eax, 1   ; compare the number with the lower bound 1
    jl  .outside  ;jump to .outside if the number is below 1

    cmp eax, 10   ; compare the number with the upper bound 10
    jg  .outside  ; jump to .outside if the number is above 10

    mov ecx, msg_inside   ; the number is from 1 to 10, so put the "within" message address in ecx
    mov edx, len_inside  ; put its length in edx
    jmp .print     ; skip the outside branch and go to the print step

.outside:        ; label for the outside-the-range case
    mov ecx, msg_outside   ; put the address of the "outside" message in ecx
    mov edx, len_outside  ; put its length in edx

.print:        ; label for the print step
    mov eax, 4     ; sys_write
    mov ebx, 1   ; file descriptor 1 = standard output
    int 0x80    ; call the kernel to print the message

    mov eax, 1    ; sys_exit
    xor ebx, ebx     ; exit code 0 
    int 0x80   ; call the kernel to end the program