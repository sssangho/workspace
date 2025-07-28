package sec01.exam01;

public class Order {
	private OrderStatus status;
	
	public Order() {
		status = OrderStatus.PENDING;
	}
	
	public void nextStatus() {
		switch (status) {
		case PENDING:
			status = OrderStatus.PROCESSING;
			break;
		case PROCESSING:
			status = OrderStatus.SHIPPED;
			break;
		case SHIPPED:
			status = OrderStatus.DELIVERED;
			break;
		case DELIVERED:
			System.out.println("이미 배송 완료된 주문입니다.");
		}
	}

	public void printStatus() {
		System.out.println("현재 주문 상태: " + status);
	}
	
}
