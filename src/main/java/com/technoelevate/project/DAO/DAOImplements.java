package com.technoelevate.project.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.technoelevate.project.DTO.DTOClass;
@Component
public class DAOImplements implements DAOInterface{
	ApplicationContext context = new ClassPathXmlApplicationContext("com/technoelevate/project/ServiceLayer/config.xml");
	JdbcTemplate template= context.getBean("daoObject",JdbcTemplate.class);

	
	@Override
	public boolean add(DTOClass dto) {
		boolean insert=false;
		try {
		String query="insert into employee_details.emp_details values(?,?,?)";
		template.update(query,dto.getUserid(),dto.getUsername(),dto.getPasskey());
		insert= true;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return insert;
	}

	@Override
	public DTOClass authenticate(DTOClass dto) {
		String id=dto.getUserid();
		String query = "select * from emp_details where emp_id=?";
		return template.queryForObject(query,new RowMapperImpl(), id);
	
	}

	@Override
	public boolean update(DTOClass dto) {
		boolean insert=false;
		String empId =dto.getUserid();
		String empName =dto.getUserid();
		String empPass =dto.getUserid();
		try {
		String query = "update emp_details set emp_name=?,emp_pass=? where emp_id=?";
		template.update(query,empName,empPass,empId);
		insert= true;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return insert;
		
	}

	@Override
	public boolean delete(DTOClass dto) {
		boolean insert=false;
		String id=dto.getUserid();
		System.out.println(id);
		try {
		String query = "delete from emp_details where emp_id=?";
		template.update(query,id);
		insert=true;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return insert;
		
	}

	@Override
	public DTOClass getUsingId(DTOClass dto) {
		String id= dto.getUserid();
		String query = "select * from emp_details where emp_id=?";
		return template.queryForObject(query,new RowMapperImpl(), id);
		
	}

	@Override
	public List<DTOClass> getAllEmp() {
		RowMapper<DTOClass> rowMapper = new RowMapperImpl();
		String query = "select * from emp_details";
		List<DTOClass> dto = template.query(query,rowMapper);
		return dto;
	}

}
