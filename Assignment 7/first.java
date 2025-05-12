import java.io.*;
class first
{
	public static void main(String args[]){
		//System.out.println("Hello");
		try{
			FileInputStream fin = new FileInputStream("../sample2.txt");
			int a = 0;
			char c;
			while(a != -1){
				a = fin.read();
				if(a == -1){
					break;
				}
				c = (char)a;
				System.out.print(""+c);
			}

		}
		catch(FileNotFoundException e){
			System.out.println(e);
		}
		catch(IOException e){
			System.out.println(e);
		}
	}
}