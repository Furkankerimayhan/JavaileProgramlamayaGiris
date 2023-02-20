package classesWithAttributes;

public class Product {
	
	public Product(int id, String name, String description,double price, int stockAmount,String renk) {
		System.out.println("Yapıcı blok calıstı");
		this.setId(id);
		this.setRenk(renk);
		this.setName(name);
		this.setDescription(description);
		this.setPrice(price);
		this.setStockAmount(stockAmount);
		
		
	}
	private int id;
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	private String renk;
	private String kod;
	
	public Product() {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	public int getStockAmount() {
		return stockAmount;
	}
	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	public String getRenk() {
		return renk;
	}
	public void setRenk(String renk) {
		this.renk = renk;
	}

	public String getKod() {
		return kod;
	}
	public void setKod(String kod) {
		this.kod = kod;
	}	
}
