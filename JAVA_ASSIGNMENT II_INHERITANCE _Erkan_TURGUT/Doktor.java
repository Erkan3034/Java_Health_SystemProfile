package Erkan_TURGUT_Hafta5_ODEV;

//Doktor.java
public class Doktor extends Kisi {
 private String uzmanlikAlani; //Doktora özel alan.

 public Doktor(String ad, int yas, String kimlikNo, String uzmanlikAlani) {
     super(ad, yas, kimlikNo); // Kisi sınıfının constructor'ını çağırır
     this.uzmanlikAlani = uzmanlikAlani;
 }

 @Override
 public void calis() {   // Polymorphism (Metod Overide) uygulanıyor
     System.out.println("Doktor " + uzmanlikAlani + " alanında hastaları tedavi ediyor.");
 }
 
 // Doktora özgü operasyon yapma metodu
 public void operasyonYap() {
     System.out.println("Doktor operasyon yapıyor.");
 }
}
