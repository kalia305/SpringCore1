package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.nt.bo.EmployeeBO;
import com.nt.dao.EmployeeDAO;
import com.nt.dto.EmployeeDTO;

@Service("empService")
public class EmployeeMgmtServiceImpl implements EmployeeMgmtService {
   
	private  EmployeeDAO  dao;
	
	  public EmployeeMgmtServiceImpl(EmployeeDAO dao,String location) {
			this.dao = dao;
			System.out.println(location);
		}

     
	@Override
	public List<EmployeeDTO> fetchEmpsByDesgs(String desg1, String desg2) throws Exception {
		List<EmployeeBO> listBO=null;
		List<EmployeeDTO> listDTO=new ArrayList();

		//use DAO
		listBO=dao.getEmpsByDesgs(desg1, desg2);
		//convert listBO to listDTO
		/*	listDTO=new ArrayList();
			for(EmployeeBO bo:listBO) {
				dto=new EmployeeDTO();
				BeanUtils.copyProperties(bo, dto);
				dto.setSrNo(listDTO.size()+1);
				listDTO.add(dto);
			}*/
		  listBO.forEach(bo->{
			  EmployeeDTO dto=new EmployeeDTO();
			  BeanUtils.copyProperties(bo,dto);
			  dto.setSrNo(listDTO.size()+1);
			  listDTO.add(dto);
		  });
			
		return listDTO;
	}//method

}
