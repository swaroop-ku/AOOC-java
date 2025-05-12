package Ecommerce;
import java.util.*;
public class order
{	
	float sum;
	public void total(float a,float b,float c){
		sum = a+b+c;
	}
	public void bill(){
		System.out.println("Total:"+sum+" Rs");
	}
}