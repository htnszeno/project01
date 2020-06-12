package com.example.service;

import com.example.db.mapper.TestMapper; 
import com.example.db.vo.TestVo; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service; 
import java.util.List; 
//test
@Service 
@Qualifier("mapper")
public class TestService { 
	
	@Autowired(required = true)
	public TestMapper mapper; 
	
	public List<TestVo> selectTest() { 
		return mapper.selectTest(); 
	} 
}

