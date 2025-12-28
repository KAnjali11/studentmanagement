package studentmanagementsystem1;

public class student {
	private int id;
	private String name;
	private int marks;
	public student(int id,String name,int marks) {
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	public int getId() {
		return id;
		
	}
	public int getMarks() {
		return marks;
		
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setMarks(int marks) {
		this.marks=marks;
	}
	public String toString() {
	return "Id:"+id+",Name:"+name+",Marks:"+marks;
	}

}
