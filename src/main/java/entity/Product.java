package entity;

public class Product {
	private int id;
	private String name;
	private double price;
	private String image;
	private String shortDescription;
	private String description;
	private int soldAmount;
	private int cID;
    private int amount;

	public Product() {

	}

	public Product(int id, String name, double price,  String image,int amount) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.image = image;
		this.amount=amount;
	}
	public Product(int id, String name, double price,  String image,String shortDescription, String description,
			 int soldAmount ,int cID) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.image = image;
		this.description = description;
		this.shortDescription = shortDescription;
		this.soldAmount = soldAmount;
		this.cID=cID;
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


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getImage() {
		return image;
	}


	public void setImage(String image) {
		this.image = image;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getShortDescription() {
		return shortDescription;
	}


	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}


	public int getSoldAmount() {
		return soldAmount;
	}


	public void setSoldAmount(int soldAmount) {
		this.soldAmount = soldAmount;
	}

	
	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	
	public int getcID() {
		return cID;
	}

	public void setcID(int cID) {
		this.cID = cID;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", image=" + image + ", shortDescription="
				+ shortDescription + ", description=" + description + ", soldAmount=" + soldAmount + ", cID=" + cID
				+ "]";
	}

	

}
