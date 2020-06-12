package com.example.db.mapper;

import java.util.List; 
import com.example.db.vo.TestVo; 
import org.apache.ibatis.annotations.Mapper; 
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service; 

@Repository 
@Mapper 
public interface TestMapper { 
	List<TestVo> selectTest(); 
}

