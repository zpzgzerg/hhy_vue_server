package xyz.zpzgzerg.hhy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xyz.zpzgzerg.hhy.dto.HhyBoardDto;
import xyz.zpzgzerg.hhy.mapper.HhyBoardMapper;

import java.util.HashMap;
import java.util.List;

@Service
public class HhyBoardService {

  @Autowired
  private HhyBoardMapper mapper;

  public List<HhyBoardDto> selectList() {
    return mapper.selectList();
  }

  public HhyBoardDto select(int id) {
    return mapper.select(id);
  }

  @Transactional
  public int insert(HhyBoardDto dto) {
    return mapper.insert(dto);
  }

  @Transactional
  public int update(HhyBoardDto dto) {
    return mapper.update(dto);
  }

  @Transactional
  public int delete(int id) {
    return mapper.delete(id);
  }

}
