package com.technoelevate.project.DAO;

import java.util.List;

import com.technoelevate.project.DTO.DTOClass;

public interface DAOInterface {
	
	public boolean add(DTOClass dto);
	public DTOClass authenticate(DTOClass dto);
	public boolean update(DTOClass dto);
    public boolean delete(DTOClass dto);
    public DTOClass getUsingId(DTOClass dto);
    public List<DTOClass> getAllEmp();
}
