section .data  ; start of the data section 
    first dd 15  ;first number
    second dd 9  ;second number

    msg_smaller db "First number is smaller.", 10  ; message text followed by a newline 
    len_smaller equ $ - msg_smaller   ;length of msg_smaller in bytes

    msg_other db "Second number is smaller or equal.", 10 ; message text followed by a newline
    len_other equ $ - msg_other ;length of msg_other in bytes

section .text  ; start of the code section
    global _start  ;entry point

_start:  ; program entry point
    mov eax, [first]   ; copy the first number into eax
    cmp eax, [second]  ; compare the first number with the second 
    jl .first_smaller  ; jump if the first number is less than the second

    mov ecx, msg_other  ; first is not smaller
    mov edx, len_other  ; put its length in edx
    jmp .print    ; skip the other branch and go to the print step

.first_smaller:   ; label for the case where the first number is smaller
    mov ecx, msg_smaller  ; put the address of the "first is smaller" message in ecx
    mov edx, len_smaller ; put its length in edx

.print:       ; label for the print step
    mov eax, 4  ;sys_write
    mov ebx, 1  ; file descriptor 
    int 0x80   ; call the kernel to print the message

    mov eax, 1   ; sys_exit
    xor ebx, ebx  ; exit code 0 (xor with itself gives zero)
    int 0x80   ; call the kernel to end the program