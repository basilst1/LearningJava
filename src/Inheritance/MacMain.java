package Inheritance;

public class MacMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Macbook macs = new Macbook();
		macs.mac13inch();
		macs.MacM1Chip();
		macs.mac14inch();

		macs.MacM1proChip();

		MacbookAir macAir = new MacbookAir();
		macAir.mac13inch();
		macAir.MacM1Chip();
		macAir.mac14inch();
		macAir.MacM1MaxChip();

		MacbookPro macPro = new MacbookPro();
		macPro.mac16inch();
		macPro.MacM1maxChip();

	}

}
