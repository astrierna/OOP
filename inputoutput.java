import  java.util.Scanner; 

public class inputoutput {
	public static void main (String[]args) {
		Scanner input = new Scanner(System.in);
		String nama;
		int umur;
		final char jeniskelamin = p;

		System.out.print (" Masukkan nama = "); 
		nama = input.nextLine();
		System.out.print (" Masukkan umur = "); 
		umur = input.nextInt();
		System.out.print (" Masukkan Jenis Kelamin (p/l)= "); 
		jeniskelamin = input.next().charAt(0);
		System.out.println ("nama yang anda masukkan adalah = " +nama + " umur =" +umur+ " Jenis Kelamin = "+ jeniskelamin); 
		}
	}  