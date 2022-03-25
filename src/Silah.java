
public class Silah {
	
	private Sarjor sarjor;
	private int menzil;
	
	//Yap�land�r�c� method parametre(menzil)
	public Silah (int menzil) {
		this.menzil = menzil;
	}
	
	//Ate� etme i�lemi silah�n �arjor�nden ger�ekle�tirilir
	//E�er hedefin menzili silah menzilinin d���ndaysa mermi ate�lenmez.
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
