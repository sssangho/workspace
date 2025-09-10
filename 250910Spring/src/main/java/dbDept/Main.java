package dbDept;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import chap8.Member;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);
		DeptDao dao = ctx.getBean(DeptDao.class);
		
//		Dept dept = new Dept(50, "Cleaner", "Seoul");
//		dao.insert(dept);
//		System.out.println("입력!");
	
		dao.delete(50);
		System.out.println("삭제!");
		
//		Dept dept2 = dao.selectDeptno(40);
//		System.out.println(dept2);
//		System.out.println("선택!");
		
//		Dept dept3 = new Dept(50, "KeyGroup", "Seoul");
//		dao.update(dept3);
//		System.out.println("변경!");
		
		for (Dept dept1 : dao.selectAll()) {
			System.out.println(dept1);
		}
	}
}
