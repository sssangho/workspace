package sec01.exam02;

public class Student extends People {
	public int studentNo;

	public Student(String name, String ssn, int studentNo) {
		super(name, ssn); // 부모생성자 호출
		this.studentNo = studentNo;
	}

	@Override
	void method1() {
		System.out.println(name + "Student");
		super.method1(); // 부모가 가지고 있는 것 중
	}
	

}

