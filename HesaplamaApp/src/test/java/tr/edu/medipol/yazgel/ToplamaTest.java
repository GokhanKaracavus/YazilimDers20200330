package tr.edu.medipol.yazgel;

import static org.junit.Assert.assertEquals;

import org.junit.*;  

public class ToplamaTest {
  
  @Test
  public void testPozitifSayiToplama() {
    //Given - KoSullar / Ön Sartlar
    Hesap toplama = new Toplama ();
    String sayi1 = "10";
    String sayi2 = "100";
    
    //When - Yapilan Ýslem
    String sonuc = toplama.sonucuBul(sayi1, sayi2);
    
    //Then - Kontrol
    assertEquals("110", sonuc);
  }
  

  @Test
  public void testNegatifSayiToplama() {
    //Given - Koþullar / Ön Sartlar
    Hesap toplama = new Toplama ();
    String sayi1 = "100";
    String sayi2 = "0";
    
    //When - Yapilan Ýslem
    String sonuc = toplama.sonucuBul(sayi1, sayi2);
    
    //Then - Kontrol
    assertEquals("100", sonuc);
  }
  
  @Test
  public void testBuyukSayiToplama() {
    //Given - Koþullar / Ön Sartlar
    Hesap toplama = new Toplama ();
    String sayi1 = "1907";
    String sayi2 = "1905";
    
    //When - Yapilan Ýslem
    String sonuc = toplama.sonucuBul(sayi1, sayi2);
    
    //Then - Kontrol
    assertEquals("3812", sonuc);
  }
  

}