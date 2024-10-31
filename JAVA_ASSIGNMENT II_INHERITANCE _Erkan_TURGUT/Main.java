package Erkan_TURGUT_Hafta5_ODEV;
//SaglikSistemiTest.java
public class Main {
 public static void main(String[] args) {
     // Kisi türünden nesneler oluşturuluyor
     Kisi doktor = new Doktor("Ayşe", 40, "D12345", "Kardiyoloji");
     Kisi hemsire = new Hemsire("Ali", 30, "H67890", "Gece");
     Kisi yonetici = new Yonetici("Mehmet", 50, "Y34567", "İnsan Kaynakları");

     // Bilgileri göster ve çalış metotlarını çağır
     doktor.bilgileriGoster();
     System.out.println();
     doktor.calis(); // Doktor'un override edilen metodu çağrılır
     System.out.println();
     hemsire.bilgileriGoster();
     System.out.println();
     hemsire.calis(); // Hemşire'nin override edilen metodu çağrılır
     System.out.println();
     yonetici.bilgileriGoster();
     System.out.println();
     yonetici.calis(); // Yönetici'nin override edilen metodu çağrılır
     System.out.println();
     
     // Casting
     ((Doktor) doktor).operasyonYap();    // Doktor'a özgü metot
     System.out.println();
     ((Hemsire) hemsire).ilacDagit();     // Hemşire'ye özgü 
     System.out.println();
     ((Yonetici) yonetici).raporYaz();    // Yönetici'ye özgü metot
 } 
}
