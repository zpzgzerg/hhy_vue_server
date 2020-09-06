DROP TABLE IF EXISTS tb_hhy_board;

CREATE TABLE tb_hhy_board (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(255) NOT NULL,
  email VARCHAR(255) NOT NULL,
  title VARCHAR(255) NOT NULL,
  contents VARCHAR(4000) NOT NULL,
  reg_dt VARCHAR(14) NOT NULL
);

INSERT INTO tb_hhy_board (name, email, title, contents, reg_dt) VALUES
  ('김재용','zpzgzerg@naver.com','첫번째 게시물', '첫번째 내용', TO_CHAR(SYSDATE, 'YYYYMMDDHH24MISS') ),
  ('고아람','fate1004@naver.com','두번째 게시물', '두번째 내용', TO_CHAR(SYSDATE, 'YYYYMMDDHH24MISS') ),
  ('김윤호','yoonho@naver.com','세번째 게시물', '세번째 내용', TO_CHAR(SYSDATE, 'YYYYMMDDHH24MISS') ),
  ('김선호','sunho@naver.com','네번째 게시물', '네번째 내용', TO_CHAR(SYSDATE, 'YYYYMMDDHH24MISS') ),
  ('김지유','jiyu@naver.com','다섯번째 게시물', '다섯번째 내용', TO_CHAR(SYSDATE, 'YYYYMMDDHH24MISS') );
