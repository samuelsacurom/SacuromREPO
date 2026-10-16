section .data  ; start of the data section 
    num1 dd 20 ; first number
    num2 dd 20 ; second number

    msg_equal db "The numbers are equal.", 10 ; message text followed by a newline
    len_equal equ $ - msg_equal  ; length of msg_equal in bytes, computed by the assembler

    msg_nequal db "The numbers are not equal.", 10 ; message text followed by a newline 
    len_nequal equ $ - msg_nequal  ; length of msg_nequal in bytes

section .text   ; start of the code section
    global _start    ; make _start visible to the linker as the entry point

_start:  ; program entry point
    mov eax, [num1]  ;copy the first number into eax
    cmp eax, [num2]  ; compare eax with the second number and set the flags
    je .equal     ; jump to .equal if the numbers are equal
    jne .not_equal  ; jump to .not_equal if the numbers are not equal 

.equal:   ; label for the equal 
    mov ecx, msg_equal ; put the address of the equal message in ecx
    mov edx, len_equal ; put the length of the equal message in edx
    jmp .print ; skip the not-equal setup and go to the print step

.not_equal:   ; label for the not equal 
    mov ecx, msg_nequal ; put the address of the not-equal message in ecx
    mov edx, len_nequal ; put the length of the not-equal message in edx

.print:    ; label for the print step
    mov eax, 4  ; sys_write
    mov ebx, 1  ; file descriptor 
    int 0x80  ; call the kernel to print the message

    mov eax, 1  ;sys_exit
    xor ebx, ebx  ; exit code 0 
    int 0x80   ; call the kernel to end the program