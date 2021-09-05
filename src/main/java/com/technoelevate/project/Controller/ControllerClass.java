package com.technoelevate.project.Controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.technoelevate.project.DAO.DAOImplements;
import com.technoelevate.project.DTO.DTOClass;
import com.technoelevate.project.ServiceLayer.*;

@Controller
@ComponentScan("com.technoelevate.project.ServiceLayer")
@ComponentScan("com.technoelevate.project.DAO")
public class ControllerClass {
	@Autowired
	ServiceLayer service;
	@Autowired
	DTOClass dto;

	@GetMapping(path="/home")
	public String home() {
		return "addAccount";
	}

	@PostMapping("/create")
	public String add(ModelMap map, DTOClass dto) {
		if (dto.getUserid() != null && dto.getUserid() != "") {
			service.add(dto);
			map.addAttribute("DTO", dto);
			return "employeePage";
		} else
			return "invalidPage";
	}

	@GetMapping("/login")
	public String getEmployee() {
		return "Login";
	}

	@PostMapping("/fetch")
	public String authenticate(ModelMap map, DTOClass dto, HttpServletRequest request) {
		if (dto.getUserid() != (null) && dto.getUserid() != ("")) {
			DTOClass loginInfo = service.authenticate(dto);
			HttpSession session = request.getSession();
			session.setAttribute("DTO", loginInfo);
			if (loginInfo != null) {
				map.addAttribute("DTO", loginInfo);
				map.addAttribute("msg", "LOGIN SUCCESSFULL");
				return "LoginDetails";
			}
		}
		return "error";
	}

	@PostMapping("/update")
	public String update(ModelMap map, DTOClass dto) {
		map.addAttribute("DTOObject", dto);
		if (service.update(dto)) {
			map.addAttribute("status", "Update Successfull");
		} else {
			map.addAttribute("status", "Update unSuccessfull");
		}
		return "Updated";
	}

	@PostMapping("/delete")
	public String dlt(ModelMap map, DTOClass dto) {
		boolean in=service.delete(dto);
		if(in==true) {
			return "delete";
		}
		return "error";
	}

	@PostMapping(path = "/details")
	public String showDetails() {
		return "viewDetails";
	}

	@PostMapping(path = "/showdetails")
	public String allDetails(ModelMap map) {

		List<DTOClass> details = service.getAllEmp();
		map.addAttribute("empd", details);
		return "allDetails";
	}

	@PostMapping(path = "/searchdetails")
	public String search(ModelMap map, DTOClass dto) {
		if (dto.getUserid() != (null) && dto.getUserid() != ("")) {
			DTOClass loginInfo = service.getUsingId(dto);
			map.addAttribute("dto", loginInfo);
			return "search";
		} else {
			return "error";
		}
	}
	@PostMapping(path="/logout")
	public String logout() {
		return "logout";
	}
}
