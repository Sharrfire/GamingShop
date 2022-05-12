package entity;

import java.io.Serializable;
import java.util.List;

public class Order implements Serializable {
	private int oderID;
	private Account acc;
	private List<Product> items;
	private int status;
	
	
	public Order() {
		super();
	}
	@Override
	public String toString() {
		return "Order [oderID=" + oderID + ", acc=" + acc + ", items=" + items + ", status=" + status + "]";
	}
	public int getOderID() {
		return oderID;
	}
	public void setOderID(int oderID) {
		this.oderID = oderID;
	}
	public Account getAcc() {
		return acc;
	}
	public void setAcc(Account acc) {
		this.acc = acc;
	}
	public List<Product> getItems() {
		return items;
	}
	public void setItems(List<Product> items) {
		this.items = items;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}

	
	
}
