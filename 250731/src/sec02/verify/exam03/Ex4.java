package sec02.verify.exam03;

class Controller {
	private MemberService service;  // has-a 

	public MemberService getService() {
		return service;
	}

	public void setService(MemberService service) {
		this.service = service;
	}
	
	public void method(MemberService memberService) {
		this.setService(memberService);
		this.service.login();
	}
}
class Service {
	public void login() {
		System.out.println("로그인");
	}
}
class MemberService extends Service {
	public void login() {
		System.out.println("로그인");
	}
}
class AService extends MemberService {
	public void login() {
		System.out.println("A로그인");
	}
}
class BService extends MemberService {
	public void login() {
		System.out.println("B로그인");
	}
}
class BoardService extends Service {}
class DService extends BoardService {}


public class Ex4 {
	

	public static void main(String[] args) {
		Controller controller = new Controller();
		controller.method(new AService());  // 반복되는 문장을 메소드로 만듬
//		controller.setService(new AService());
//		controller.getService().login();
	}
}
