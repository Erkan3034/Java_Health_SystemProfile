package Erkan_TURGUT_Hafta5_ODEV;

//Kisi.java
public class Kisi {
 protected String ad;
 protected int yas;
 protected String kimlikNo;

 // Constructor
 public Kisi(String ad, int yas, String kimlikNo) {
     this.ad = ad;
     this.yas = yas;
     this.kimlikNo = kimlikNo;
 }

 // Kişi bilgilerini gösteren metot
 public void bilgileriGoster() {
     System.out.println("Ad: " + ad + ", Yaş: " + yas + ", Kimlik No: " + kimlikNo);
 }

 // Ortak bir çalışma metodu
 public void calis() {
     System.out.println("Kişi sağlık merkezinde çalışıyor.");
 }
}
