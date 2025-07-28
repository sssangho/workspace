package sec01.exam01;

public class EnumEx1 {

	public static void main(String[] args) {
		Day today = Day.MONDAY;
		
		switch (today) {
		case MONDAY:
			System.out.println("월요일입니다.");
			break;
		case SUNDAY:
			System.out.println("일요일입니다. 쉬는 날이에요!");
			break;
		default:
			System.out.println("평일입니다.");
		}

	}

}
