package viope_10;

class Item {
	private Product product;
	private int quantity;
	
	public  Item (Product product, int quantity) {
		this.product = product;
		this.quantity = quantity;
	}
	
	public  Product getProduct() {
		return this.product;
	}
	
	public int getQuantity() {
		return this.quantity;
	}
	
	public  double getSubtotal(){
		return this.product.getPrice() * this.quantity;
	}

}


