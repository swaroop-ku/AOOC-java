import Ecommerce.product;
import Ecommerce.customer;
import Ecommerce.order;
import java.util.*;
class another
{
	public static void main(String args[]){
		product p = new product();
		customer c = new customer();
		order o = new order();
		c.cust();
		p.order();
		o.total(p.c1,p.c2,p.c3);
		System.out.println();
		System.out.println("***Receipt***");
		c.cdetail();
		p.details();
		o.bill();
		System.out.println("Order placed successfully");
	}
}