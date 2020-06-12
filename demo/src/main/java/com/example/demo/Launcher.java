package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

import com.example.db.vo.TestVo;
import com.example.service.TestService;

@Service
public final class Launcher {
	
	@Autowired(required=true)
	static TestService testService;
	
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringContext.class);
        MainFrame mainFrame = (MainFrame) context.getBean("mainFrame");
        mainFrame.setArgs(args);
        mainFrame.init();
        
        //dbTest();
    }
    
    public static void dbTest() {
    	
		List<TestVo> testList = testService.selectTest();
		System.out.print("result : " + testList.get(0));


	}
}
