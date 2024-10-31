package Erkan_TURGUT_Hafta5_ODEV;

//Yonetici.java
public class Yonetici extends Kisi {
 private String departman; //yönetıciye özel alan

 public Yonetici(String ad, int yas, String kimlikNo, String departman) {
     super(ad, yas, kimlikNo); // Kisi sınıfının constructor'ını çağırır
     this.departman = departman;
 }

 @Override
 public void calis() { // Polymorphism (Metod Override) uygulanıyor
     System.out.println("Yönetici " + departman + " departmanını yönetiyor.");
 }

 // Yöneticilere özel rapor yazma metodu
 public void raporYaz() {
     System.out.println("Yönetici aylık rapor hazırlıyor.");
 }
}
