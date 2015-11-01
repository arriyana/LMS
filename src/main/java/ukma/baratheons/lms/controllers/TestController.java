package ukma.baratheons.lms.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import ukma.baratheons.lms.data.Test;
import ukma.baratheons.lms.services.DAO;
import ukma.baratheons.lms.services.DAOImpl;

@Controller
public class TestController {
	
	@Autowired
	private DAO dao;
	
	public void setDao(DAOImpl dao) {
		this.dao = dao;
	}

	@RequestMapping("/{userName}")
	public String showMessage(@PathVariable("userName") String name, Model model) {
	
		List<Test> tests = dao.getTest();
		
		model.addAttribute("tests", tests);
		model.addAttribute("msg", "Hi, "+name);
		
		return "HelloPage";
	}
	
}