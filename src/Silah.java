
public class Silah {
	
	private Sarjor sarjor;
	private int menzil;
	
	//Yapýlandýrýcý method parametre(menzil)
	public Silah (int menzil) {
		this.menzil = menzil;
	}
	
	//Ateþ etme iþlemi silahýn þarjoründen gerçekleþtirilir
	//Eðer hedefin menzili silah menzilinin dýþýndaysa mermi ateþlenmez.
	public boolean atesEt(int hedefinMenzili) {
		if(sarjor == null)
			return false;
		if (hedefinMenzili <= menzil)
			return sarjor.mermiAtesle();
		else 
			return false;
	}
	
	public void setSarjor(Sarjor sarjor) {
		this.sarjor = sarjor;
	}
	
	public boolean sarjorDoldur() {
		if (sarjor == null) {
			return false;
		} else {
			sarjor.doldur();
			return true;
		}
	}
}
