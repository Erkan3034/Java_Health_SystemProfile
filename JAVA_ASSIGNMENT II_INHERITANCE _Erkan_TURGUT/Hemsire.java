package Erkan_TURGUT_Hafta5_ODEV;

//Hemsire.java
public class Hemsire extends Kisi {
 private String vardiya;  //hemsirye özel alan.

 public Hemsire(String ad, int yas, String kimlikNo, String vardiya) {
     super(ad, yas, kimlikNo); // Kisi sınıfının constructor'ını çağırır
     this.vardiya = vardiya;
 }

 @Override
 public void calis() { // Polymorphism (Metod Override) uygulanıyor
     System.out.println("Hemşire vardiya: " + vardiya + " olarak hasta bakımı yapıyor.");
 }

 // Hemşireye özgü ilaç dağıtımı metodu
 public void ilacDagit() {
     System.out.println("Hemşire ilaç dağıtımı yapıyor");
 }
}
