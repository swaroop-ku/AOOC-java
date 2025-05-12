package mathematical.convert;

public class conversion
{
	public void answer(int a){
		System.out.println("Binary: "+Integer.toBinaryString(a));
		System.out.println("Octal: "+Integer.toOctalString(a));
		System.out.println("Hexadecimal: "+Integer.toHexString(a).toUpperCase());
	}
	public void binary(String a){
		System.out.println("Decimal: "+Integer.parseInt(a,2));
	}
	public void octal(String b){
		System.out.println("Decimal: "+Integer.parseInt(b,8));
	}
	public void hexadecimal(String c){
		System.out.println("Decimal: "+Integer.parseInt(c,16));
	}
}