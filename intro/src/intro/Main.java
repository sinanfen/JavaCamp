package intro;

public class Main {

	public static void main(String[] args) {
		String internetSubeButonu = "�nternet �ubesi";
		int vade = 36;
		double dolarDun = 8.18;
		double dolarBugun = 8.18;
		boolean dustuMu = true; 
		System.out.println(internetSubeButonu);
	
		if(dolarBugun<dolarDun) 
		{			
			System.out.println("Dolar d��t� g�rseli.");
		}
		else if(dolarBugun>dolarDun)
		{
			System.out.println("Dolar artt� g�rseli.");
		}else {
			System.out.println("Dolar e�ittir g�rseli");
		}
		
		String kredi1 = "H�zl� Kredi";
		String kredi2 = "Yava� Kredi";
		String kredi3 = "Orta h�zl� Kredi";
		String kredi4 = "Fena h�zl� jet Kredi";
		String kredi5 = "�ok yava� Kredi";
		
		
		System.out.println(kredi1);
		System.out.println(kredi2);
		System.out.println(kredi3);
		System.out.println(kredi4);
		System.out.println(kredi5);
		
		String[] krediler = { 
				"H�zl� kredi",
				"mutlu kredi",
				"konut kredisi",
				"ta��t kredisi",
				"msb kredisi",
				"meb kredisi"
		};
		
		//Foreach
		for(String kredi: krediler) 
		{
			System.out.println(kredi);
		}
	}

}
