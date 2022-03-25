
public class Sarjor {
	//Mermi kapasitesi tamsayı değer (int)
	private int mermiKapasitesi;
	//Mermi sayısı tamsayı değer (int)
	private int mermiSayisi;
	
	//Yapılandırı method parametre(mermiKapasitesi, mermiSayisi)
	public Sarjor(int mermiKapasitesi, int mermiSayisi) {
		this.mermiKapasitesi = mermiKapasitesi;
		this.mermiSayisi = mermiSayisi;
	}
	
	//Mermiyi ateşler, eğer mermi sayısı mevcut değilse ateşleme yapılmaz
	public boolean mermiAtesle() {
		if (mermiSayisi > 0 ) {
			mermiSayisi = mermiSayisi -1;
			return true;
		} else {
			return false;
		}
	}
	
	//Mermiyi doldurur, doldurma işlemi maksimum mermi kapasitesine kadardır.
	public void doldur() {
		mermiSayisi = mermiKapasitesi;
	}
}
