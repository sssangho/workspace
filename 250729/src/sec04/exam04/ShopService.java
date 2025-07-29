package sec04.exam04;

public class ShopService {
	private static ShopService s = new ShopService();
	private ShopService() {}
	
	public static ShopService getInstance() {
		return s;
	}

}
