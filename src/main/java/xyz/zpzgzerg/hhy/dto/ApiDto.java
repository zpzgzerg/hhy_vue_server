package xyz.zpzgzerg.hhy.dto;

import lombok.*;

@Setter
@Getter
@ToString
@AllArgsConstructor
public class ApiDto {

  private String status;
  private String errorCode;
  private String errorMessage;
  private int id;

  // 기본생성자
  public ApiDto() {
    this.status = "success";
    this.errorCode = "";
    this.errorMessage = "";
  }

  public ApiDto(String status, String errorCode, String errorMessage) {
    this.status = status;
    this.errorCode = errorCode;
    this.errorMessage = errorMessage;
  }
}
