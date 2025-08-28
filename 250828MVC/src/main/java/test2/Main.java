package test2;

import java.lang.reflect.InvocationTargetException;

public class Main {

	public static void main(String[] args) {
		// 리플렉션으로 불러올 클래스 이름 (패키지 포함)	
		String handlerClassName = "test2.ByeCommandHandler";
		
		// 클래스 로드
		try {
			Class<?> handlerClass = Class.forName(handlerClassName);
			// 인스턴스 생성 (getDeclaredConstruction 사용 권장)
			CommandHandler handlerInstance 
				= (CommandHandler) handlerClass.getDeclaredConstructor().newInstance();
			
			// 실행
			handlerInstance.execute();
			
		} catch (ClassNotFoundException 
				| InstantiationException 
				| IllegalAccessException 
				| IllegalArgumentException 
				| InvocationTargetException | NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
