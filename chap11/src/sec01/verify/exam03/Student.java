package sec01.verify.exam03;

public class Student{
	private String studentNum;
	public Student(String studentNum){
		this.studentNum=studentNum;
	}
	public String getStudentNum(){
		return studentNum;
	}
	@Override
	public boolean equals(Object obj){
		if(obj instanceof Student){
			Student compareStudent=(Student)obj;
			if(studentNum.equals(compareStudent.studentNum)){
				return true;
			}
		}
		return false;
	}
	@Override
	public int hashCode(){
		return studentNum.hashCode();
	}
}