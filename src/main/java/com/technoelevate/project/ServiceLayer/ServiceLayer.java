package com.technoelevate.project.ServiceLayer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.technoelevate.project.DAO.*;

import com.technoelevate.project.DTO.DTOClass;
@Component
public class ServiceLayer implements ServiceInterface{
	@Autowired
	DAOImplements dao;
	
	@Override
	public boolean add(DTOClass dto) {
		if(dto==null) {
			return false;
		}
		return dao.add(dto);
	}

	@Override
	public DTOClass authenticate(DTOClass dto) {
		DTOClass authen = dao.authenticate(dto);
		if(dto.getUserid().equals(authen.getUserid()) &&
				dto.getPasskey().equals(authen.getPasskey())) {
			return authen;
		}else
			return null;
	}

	@Override
	public boolean update(DTOClass dto) {
		return dao.update(dto);
	}

	@Override
	public boolean delete(DTOClass dto) {
		if(dto==null) {
			return false;
		}
		return dao.delete(dto);
	}

	@Override
	public DTOClass getUsingId(DTOClass dto) {
		DTOClass loginInfo = dao.getUsingId(dto);
		return loginInfo;
	}

	@Override
	public List<DTOClass> getAllEmp() {
		List<DTOClass> list = dao.getAllEmp();
		return list;
	}
	
}
