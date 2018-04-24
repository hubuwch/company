package com.lefu.company.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/company")
public class PayController {
	
	@RequestMapping("/openMachine")
	public String openMachine(Integer status){
		//status == 0 免费使用
		String res = null;
		try {
			
		
		if(status == 0){
			//与机器通信
			
			//通信返回
			res = "1";  //1 成功  0 失败
			
		}else if(status == 1){
			
		}
		} catch (Exception e) {
			e.printStackTrace();
			res = "0";
		}
		return res;
	}

}
