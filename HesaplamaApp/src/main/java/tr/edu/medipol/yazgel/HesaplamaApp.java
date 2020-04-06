package tr.edu.medipol.yazgel;

public class HesaplamaApp {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    Hesap toplama = new Toplama ();
    String sonuc = toplama.sonucuBul("100", "10000");
    System.out.println(sonuc);
    
  }

}