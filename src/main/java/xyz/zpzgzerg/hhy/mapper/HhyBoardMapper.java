package xyz.zpzgzerg.hhy.mapper;

import xyz.zpzgzerg.hhy.dto.HhyBoardDto;

import java.util.List;

public interface HhyBoardMapper {
  List<HhyBoardDto> selectList();
  HhyBoardDto select(int id);
  int insert(HhyBoardDto dto);
  int update(HhyBoardDto dto);
  int delete(int id);
}
