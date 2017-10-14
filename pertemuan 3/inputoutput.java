import java.util.Scanner; 

public class inputoutput {
	public static void main (String[]args) {
		String data;
		Scanner scan = new Scanner(System.in);
		System.out.print (" Masukkan data = "); 
		data = scan.nextLine();
		System.out.println (" Data yang anda masukkan adalah = " +data); 
		}
	}