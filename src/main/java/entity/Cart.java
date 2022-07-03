package entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

public class Cart implements Serializable {

    private static final long serialVersionUID = 1L;
    Map<Integer, Product> data = new HashMap<>();

    public Cart() {
    }

//	public void put(Product p) {
//
//		/**
//		 * if (p == null) return; if (data.containsKey(Integer.toString(p.getId()))) {
//		 * // Convert int to String
//		 *
//		 * data.get(Integer.toString(p.getId())).add(); } p.setAmount(1);
//		 * data.put(Integer.toString(p.getId()), p);
//		 **/
//		if (p == null) return;
//		String pid=String.valueOf(p.getId());
//
//		if (data.containsKey(pid)) {
//			update(pid,p.getAmount()+1);
//			data.get(pid).add();
//		}
//		p.setAmount(1);
//		data.put(Integer.toString(p.getId()), p);
//	}

    public void put(Product p) {

        /**
         * if (p == null) return; if (data.containsKey(Integer.toString(p.getId()))) {
         * // Convert int to String
         *
         * data.get(Integer.toString(p.getId())).add(); } p.setAmount(1);
         * data.put(Integer.toString(p.getId()), p);
         **/
        if (p == null)
            return;
        if (data.containsKey(p.getId())) {
            update(p.getId(), p.getAmount());
            data.get(p.getId()).add();
        }
        p.setAmount(1);


        data.put(p.getId(), p);
    }

    public void update(int id, int amount) {
        if
        (data.containsKey(id))
            data.get(id).setAmount(amount++);
        if (amount < 0)
            return;


    }

    public void remove(String id) {
        int tempId = Integer.parseInt(id);
        data.remove(tempId);
    }

    public double total() {
        double sum = 0;
        for (Product p : data.values()) {
            sum += p.getPrice() * p.getAmount();
        }
        return sum;
    }

    public static Cart getCart(HttpSession session) {
        return session.getAttribute("cart") == null ? new Cart() : (Cart) session.getAttribute("cart");
    }

    public Collection<Product> getData() {
        return data.values();
    }

    public void commit(HttpSession session) {
        session.setAttribute("cart", this);
    }
}