package xyz.zpzgzerg.hhy.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import xyz.zpzgzerg.hhy.dto.ApiDto;
import xyz.zpzgzerg.hhy.dto.HhyBoardDto;
import xyz.zpzgzerg.hhy.service.HhyBoardService;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/hhy_board")
public class HhyBoardController {

  @Autowired
  private HhyBoardService hhyBoardService;

  // 리스트
  @GetMapping
  public ResponseEntity<List<HhyBoardDto>> select() {
    return ResponseEntity.ok().body(hhyBoardService.selectList());
  }

  // 상세
  @GetMapping("{id}")
  public ResponseEntity<HhyBoardDto> detail(@PathVariable("id") int id) {
    return ResponseEntity.ok().body(hhyBoardService.select(id));
  }

  // 등록
  @PostMapping
  public ResponseEntity insert(@RequestBody @Valid HhyBoardDto dto) {
    int idx = hhyBoardService.insert(dto);
    return ResponseEntity.ok().body(new ApiDto("success", "", "", dto.getId()));
  }

  // 수정
  @PutMapping("{id}")
  public ResponseEntity<ApiDto> update(@PathVariable("id") int id, @RequestBody @Valid HhyBoardDto dto) {

    int cnt = hhyBoardService.update(dto);

    if(!(cnt > 0)) {
      return ResponseEntity.ok().body(new ApiDto("fail", "9999", "수정 0건"));
    } else {
      return ResponseEntity.ok().body(new ApiDto());
    }
  }

  // 삭제
  @DeleteMapping("{id}")
  public ResponseEntity<ApiDto> delete(@PathVariable("id") int id) {
    int cnt = hhyBoardService.delete(id);

    if(!(cnt > 0)) {
      return ResponseEntity.ok().body(new ApiDto("fail", "9999", "삭제 0건"));
    } else {
      return ResponseEntity.ok().body(new ApiDto());
    }
  }


}
