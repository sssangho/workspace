package spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
//		MemberRegisterService meService = new MemberRegisterService(new MemberDao());
//		meService.memberRegister();
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);
		MemberRegisterService meService = ctx.getBean("memberRegisterService", MemberRegisterService.class);
		meService.memberRegister();
	}
}
