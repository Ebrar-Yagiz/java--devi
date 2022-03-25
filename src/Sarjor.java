
public class Sarjor {
	//Mermi kapasitesi tamsay� de�er (int)
	private int mermiKapasitesi;
	//Mermi say�s� tamsay� de�er (int)
	private int mermiSayisi;
	
	//Yap�land�r� method parametre(mermiKapasitesi, mermiSayisi)
	public Sarjor(int mermiKapasitesi, int mermiSayisi) {
		this.mermiKapasitesi = mermiKapasitesi;
		this.mermiSayisi = mermiSayisi;
	}
	
	//Mermiyi ate�ler, e�er mermi say�s� mevcut de�ilse ate�leme yap�lmaz
	public boolean mermiAtesle() {
		if (mermiSayisi > 0 ) {
			mermiSayisi = mermiSayisi -1;
			return true;
		} else {
			return false;
		}
	}
	
	//Mermiyi doldurur, doldurma i�lemi maksimum mermi kapasitesine kadard�r.
	public void doldur() {
		mermiSayisi = mermiKapasitesi;
	}
}
