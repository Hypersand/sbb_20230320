package com.mysite.sbb.user;


import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PasswordUpdateForm {
    @NotEmpty(message = "기존 비밀번호는 필수항목입니다.")
    String oldPassword;

    @NotEmpty(message = "새로운 비밀번호는 필수항목입니다.")
    String newPassword1;

    @NotEmpty(message = "새로운 비밀번호 확인은 필수항목입니다.")
    String newPassword2;
}
