package tr.edu.medipol.yova;

import static org.junit.Assert.*;

import org.junit.Test;

public class HesaplamaTest {

	@Test
	public void testToplama() {
		int sayi1 = 42;
		int sayi2 = 28;
		
		long gerceklesen = Hesaplama.toplama(sayi1, sayi2);
			assertEquals(30, gerceklesen);
	}
	@Test
	public void testCikarma() {
		int sayi1 = 42;
		int sayi2 = 28;
		
		long gerceklesen = Hesaplama.cikarma(sayi1, sayi2);
			assertEquals(30, gerceklesen);
	}
	@Test
	public void testCarpma() {
		int sayi1 = 42;
		int sayi2 = 28;
		
		long gerceklesen = Hesaplama.carpma(sayi1, sayi2);
			assertEquals(30, gerceklesen);
	}
	@Test
	public void testBolme() {
		int sayi1 = 42;
		int sayi2 = 28;
		
		long gerceklesen = Hesaplama.bolme(sayi1, sayi2);
			assertEquals(30, gerceklesen);
	}
	@Test
	public void testUsAlma() {
		int sayi1 = 42;
		int sayi2 = 28;
		
		double gerceklesen = Hesaplama.usAlma(sayi1, sayi2);
			assertEquals(30, gerceklesen);	
	}
	
	

}
