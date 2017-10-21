
public class  Mahasiswa {
	public static void main (String[]args) {
		System.out.println (" ini adalah method utama");
		Mahasiswa astri = new Mahasiswa ();
		astri.printnama();
		System.out.println(astri.calculateumur());

	}

	public void printnama (){
		System.out.println (" Astri Ernawati");
	}
	public int calculateumur(){
		int tahunlahir = 1995;
		int tahunsekarang = 2017;
		int umur;
		umur = tahunsekarang - tahunlahir;

		return umur;
	}
}