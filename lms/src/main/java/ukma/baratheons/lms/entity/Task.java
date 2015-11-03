package ukma.baratheons.lms.entity;

public class Task {
	private int id;
	private int parentId;
	private int taskStatusId;
	private int taskTypeId;
	private int eqptId;
	private int userId;
	private int staffId;
	private long creationTime;
	private long completionTime;
	private boolean urgency;
	private boolean visibility;

	public Task() {
	}

	public Task(int parentId, int taskStatusId, int taskTypeId, int eqptId,
				int userId, int staffId, long creationTime, long completionTime,
				boolean urgency, boolean visibility) {
		this.parentId = parentId;
		this.taskStatusId = taskStatusId;
		this.taskTypeId = taskTypeId;
		this.eqptId = eqptId;
		this.userId = userId;
		this.staffId = staffId;
		this.creationTime = creationTime;
		this.completionTime = completionTime;
		this.urgency = urgency;
		this.visibility = visibility;
	}

	public Task(int id, int parentId, int taskStatusId, int taskTypeId, int eqptId,
				int userId, int staffId, long creationTime, long completionTime,
				boolean urgency, boolean visibility) {
		this.id = id;
		this.parentId = parentId;
		this.taskStatusId = taskStatusId;
		this.taskTypeId = taskTypeId;
		this.eqptId = eqptId;
		this.userId = userId;
		this.staffId = staffId;
		this.creationTime = creationTime;
		this.completionTime = completionTime;
		this.urgency = urgency;
		this.visibility = visibility;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getParentId() {
		return parentId;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

	public int getTaskStatusId() {
		return taskStatusId;
	}

	public void setTaskStatusId(int taskStatusId) {
		this.taskStatusId = taskStatusId;
	}

	public int getTaskTypeId() {
		return taskTypeId;
	}

	public void setTaskTypeId(int taskTypeId) {
		this.taskTypeId = taskTypeId;
	}

	public int getEqptId() {
		return eqptId;
	}

	public void setEqptId(int eqptId) {
		this.eqptId = eqptId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getStaffId() {
		return staffId;
	}

	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}

	public long getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(long creationTime) {
		this.creationTime = creationTime;
	}

	public long getCompletionTime() {
		return completionTime;
	}

	public void setCompletionTime(long completionTime) {
		this.completionTime = completionTime;
	}

	public boolean isUrgency() {
		return urgency;
	}

	public void setUrgency(boolean urgency) {
		this.urgency = urgency;
	}

	public boolean isVisibility() {
		return visibility;
	}

	public void setVisibility(boolean visibility) {
		this.visibility = visibility;
	}
}
