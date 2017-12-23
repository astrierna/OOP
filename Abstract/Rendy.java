public class Rendy extends Mahasiswa {

	protected String getNama(){
		return super.getNama();

	}
	public void printNama(){
		System.out.println(getNama());
	} 
	public static void main(String[]args){
		Rendy rendy = new Rendy();
		rendy.printNama();
	}
}