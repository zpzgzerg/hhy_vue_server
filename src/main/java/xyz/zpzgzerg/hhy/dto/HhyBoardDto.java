package xyz.zpzgzerg.hhy.dto;

import lombok.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class HhyBoardDto {

  private int id;
  @NotBlank(message = "이름은 필수값입니다.")
  private String name;
  @NotBlank(message = "이메일은 필수값입니다.")
  @Email(message = "이메일 형식에 맞춰주십시오.")
  private String email;
  @NotBlank(message = "제목은 필수값입니다.")
  private String title;
  @NotEmpty(message = "내용은 필수값입니다.")
  private String contents;
  private String reg_dt;

}
