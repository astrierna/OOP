public class MainHewan{
	public static void main (String[] args){
		Hewan ayamboiler = new Ayam();
		Hewan bebekangsa = new Bebek();
		Object obj = new Hewan();
		/* Object objAyam = new Ayam();
		Object objBebek = new Bebek();
		Object objMain = new MainHewan();*/6
 

		ayamboiler.nama();
		bebekangsa.nama();
		obj.nama();
	}
}
//ayam adalah Hewan, Hewan adalah Object, Ayam adalah Object.