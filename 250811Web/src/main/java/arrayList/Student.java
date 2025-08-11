package arrayList;

public class Student {
	String sno; // 학번
	String name; // 이름
	
	
	public Student(String sno, String name) {
		super();
		this.sno = sno;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return sno.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student) obj;
			if(sno.equals(student.sno) && name.equals(student.name)) {
				return true;
			}
		}
		return false;
	}
}
