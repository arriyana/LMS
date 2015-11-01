package ukma.baratheons.lms.data;

public class Test {

	private Integer id;	
	private Integer number;
	
	public Test(){}
	
	public Test(int id, int number){
		this.id = id;
		this.number = number;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}
	
	@Override
	public String toString(){
		return getId()+" is "+getNumber();
	}
}