package com.jose1593.web;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper  // mapper로 연결하면 toSize를 자동으로 찾아간다
public interface BoardDAO {
	public Integer toSize();

}
