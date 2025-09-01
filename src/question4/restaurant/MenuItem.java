package question4.restaurant;

public class MenuItem implements Comparable<MenuItem> {
	
	private String category;
	private String name;
	private Double price;
	
	public MenuItem() {}

	public MenuItem(String category, String name, Double price) {
		super();
		this.category = category;
		this.name = name;
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public int compareTo(MenuItem o) {
		int result = this.category.compareTo(o.category);
		if (result != 0) {
			return result;
		} else {
			result = this.name.compareTo(o.name);
		}
		return result != 0 ? result : this.price.compareTo(o.price);
	}

	@Override
	public String toString() {
		return "MenuItem [category=" + category + ", name=" + name + ", price=" + price + "]";
	}

}
 