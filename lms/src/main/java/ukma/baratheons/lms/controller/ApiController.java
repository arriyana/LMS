package ukma.baratheons.lms.controller;

import java.util.List;

import org.springframework.stereotype.Controller;

import ukma.baratheons.lms.entity.Comment;
import ukma.baratheons.lms.entity.Equipment;
import ukma.baratheons.lms.entity.Room;
import ukma.baratheons.lms.entity.Task;
import ukma.baratheons.lms.entity.Task.TaskType;

//Controller for AJAX requests

@Controller
public class ApiController {
	
	/**
	 * 
	 * @return List of all Rooms
	 */
	public List<Room> getAllRooms() {
		
		return null;
	}

	/**
	 * 
	 * @param room
	 * @return List of Equipment belonging to room
	 */
	public List<Equipment> getEquipmentByRoom(Room room) {
		
		return null;
	}
	
	/**
	 * 
	 * @param room
	 * @return List of Tasks belonging to room
	 */
	public List<Task> getTasksByRoom(Room room) {
		
		return null;
	}
	
	/**
	 * 
	 * @param room
	 * @return List of Tasks belonging to User of type Staff Member
	 */
	public List<Task> getTasksByStaffMember(Room room) {
		
		return null;
	}


	/**
	 * 
	 * @param equipment
	 * @return List of Tasks attached to equipment with status Opened
	 */
	public List<Task> getOpenedTasksByEquipment(Equipment equipment) {
		
		return null;
	}


	/**
	 * 
	 * @return List of Tasks belonging to User of type Client
	 */
	public List<Task> getTasksByUser() {
		return null;
	}
	
	/**
	 * 
	 * @param type
	 * @return
	 */
	public List<Task> getTasksByUser(TaskType type) {
		return null;
	}

//	returns of all tasks which were attached to this task	
	public List<Comment> getCommentsByTasks(Task task) {
		return null;
	}
	
//	returns list of all tasks attached to current user by using filter 
	//public List<Task> getTasksByUser(Filter filter) {

}
