package java0717_3;

public class CartItem<T extends Product> {
	private T item;
	private int quantity;
	
	public CartItem( T item , int quantity) {
		this.item =item;
		this.quantity=quantity;
	}
	
	@Override
	public String toString() {
		return "��ǰ : " + item +" , ���� : " +quantity;
	}
	
	public int getQuantity() {
		return this.quantity;
	}
	public T getItem() {
		return this.item;
	}
}
