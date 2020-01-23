package com.nt.controller;

import com.nt.dto.CustomerDTO;
import com.nt.service.BankServiceMgmt;
import com.nt.vo.CustomerVO;

public class MainController {
	private BankServiceMgmt service;

	public MainController(BankServiceMgmt service) {
		System.out.println("MainController:: 1-param constructor");
		this.service = service;
	}
	
	public  String  processCustomer(CustomerVO vo) throws Exception{
		CustomerDTO dto=null;
		String result=null;
		// Convert VO class obj to DTO class object
		dto=new CustomerDTO();
		dto.setCustNo(Integer.parseInt(vo.getCustNo()));
		dto.setCustName(vo.getCustName());
		dto.setCustAddrs(vo.getCustAddrs());
		dto.setpAmt(Float.parseFloat(vo.getpAmt()));
		dto.setRate(Float.parseFloat(vo.getRate()));
		dto.setTime(Float.parseFloat(vo.getTime()));
		//use service
		result=service.registerCustomer(dto);
		return result;
		
	}

}
