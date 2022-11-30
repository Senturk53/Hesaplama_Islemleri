package tr.edu.medipol.yova;

public class Hesaplama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			int sayi1 = 24;
			int sayi2 = 20;
			int x = Hesaplama.toplama(sayi1, sayi2);
			int y =  Hesaplama.cikarma(sayi1, sayi2);
			int z =  Hesaplama.carpma(sayi1, sayi2);
			int u =  Hesaplama.bolme(sayi1, sayi2);
			double v =  Hesaplama.usAlma(sayi1, sayi2);
			System.out.println(x);
			System.out.println(y);
			System.out.println(z);
			System.out.println(u);
			System.out.println(v);
	}
	public static int toplama(int a, int b) {
		 int sonuc = a + b;
		return sonuc;
	}
	
	public static int cikarma(int a, int b) {
		int sonuc = a-b;
		return sonuc;
	}
	
	public static int carpma(int a, int b) {
		int sonuc = a*b;
		return sonuc;
	}
	
	public static int bolme(int a, int b) {
		int sonuc = a/b;
		return sonuc;
	}
	
	public static double usAlma(int a, int b) {
		double sonuc = Math.pow(a, b);
		return sonuc;
	}

}
