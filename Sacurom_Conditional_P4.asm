section .data    ; start of the data section 
    letter          db 'm'     ; the character to check

    msg_upper db "Uppercase letter.", 10  ; message text followed by a newline 
    len_upper equ $ - msg_upper           ; length of msg_upper in bytes

    msg_lower db "Lowercase letter.", 10  ; message text followed by a newline 
    len_lower equ $ - msg_lower   ; length of msg_lower in bytes
    msg_other db "Not a letter.", 10      ; message text followed by a newline
    len_other equ $ - msg_other   ; length of msg_other in bytes

section .text  ; start of the code section
    global _start  ; the start

_start:      ; program entry point
    movzx eax, byte [letter]    ; read the 8-bit character and zero-extend it into eax 

    cmp eax, 'A'    ; compare the code with a
    jl  .not_letter    ; jump to .not_letter if it is below 'A'
    cmp eax, 'Z'     ; compare the code with z
    jg  .check_lower  ; jump to .check_lower if it is above z

    mov ecx, msg_upper   ; code between a and z so put the uppercase message address in ecx
    mov edx, len_upper  ; put its length in edx
    jmp .print     ; skip the other branches and go to the print step

.check_lower:       ; label for checking the lowercase range
    cmp eax, 'a'     ; compare the code with a
    jl  .not_letter   ; jump to .not_letter if it is below a
    cmp eax, 'z'    ; compare the code with z 
    jg  .not_letter  ; jump to .not_letter if it is above z

    mov ecx, msg_lower  ; the code is between 'a' and z, so put the lowercase message address in ecx
    mov edx, len_lower  ; put its length in edx
    jmp .print    ; skip the not-a-letter branch and go to the print step

.not_letter:  ; label for characters that are not letters
    mov ecx, msg_other   ; put the address of the "not a letter" message in ecx
    mov edx, len_other  ; put its length in edx

.print:    ; label for the print step
    mov eax, 4   ; sys_write
    mov ebx, 1    ; file descriptor 
    int 0x80  ; call the kernel to print the message

    mov eax, 1  ;sys_exit
    xor ebx, ebx  ; exit code 0
    int 0x80    ; call the kernel to end the program