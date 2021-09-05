package com.technoelevate.project.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.technoelevate.project.DTO.DTOClass;

public class RowMapperImpl implements RowMapper<DTOClass>{

	@Override
	public DTOClass mapRow(ResultSet rs, int rowNum) throws SQLException {

		DTOClass empInfo = new DTOClass();
		empInfo.setUserid(rs.getString(1));
		empInfo.setUsername(rs.getString(2));
		empInfo.setPasskey(rs.getString(3));
		return empInfo;
	}

}
