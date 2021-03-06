
public class Program {

	public static void main(String[] args) {
		Sarjor sarjor = new Sarjor(120, 6);
		boolean ateslemeDurumu = sarjor.mermiAtesle();
		
		if(ateslemeDurumu == true) {
			System.out.println("Mermi ateşlendi.");
		} else {
			System.out.println("Mermi ateşlenemedi.");
		}
		
		sarjor.doldur();
		
		//...
		
		Silah silah = new Silah(1000);
		silah.setSarjor(sarjor);
		
		boolean hedefVurulduMu = silah.atesEt(500);
		
		if(hedefVurulduMu == true) {
			System.out.println("Hedef vuruldu.");
		} else {
			System.out.println("Hedef vurulamadı, hedef uzakta.");
		}
		
		silah.sarjorDoldur();
	}

}
