package ukma.baratheons.lms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import ukma.baratheons.lms.entity.Room;
import ukma.baratheons.lms.service.RoomService;

@Controller
@RequestMapping("/tasks")
public class TaskController {
	
	@Autowired
	private RoomService roomService;

	@RequestMapping(path="/create")
	public String createTaskForm(Model model) {
		List<Room> rooms = roomService.getAll();
		model.addAttribute("rooms", rooms);
		return "create_task_form";
	}
	
}