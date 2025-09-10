package aop1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class AppCtx {
	@Bean
	public SimpleService simpleService() {
		return new SimpleService();
	}
	
	@Bean
	public SimpleLogginAspect simpleLogginAspect() {
		return new SimpleLogginAspect();
	}
}
