package hb;

public class Book {
	String name;
	Author a=new Author("name","Abc","m");
	double price;
	int quty;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuty() {
		return quty;
	}
	public void setQuty(int quty) {
		this.quty = quty;
	}
	public Book(String name, double price, int quty, Author a) {
		super();
		this.name = name;
		this.price = price;
		this.quty = quty;
	    this.a=a;
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", a=" + a + ", price=" + price + ", quty=" + quty + "]";
	}

}
