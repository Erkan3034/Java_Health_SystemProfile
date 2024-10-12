package paket;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form {
    public static void main(String[] args) {
        // Pencere oluşturuluyor
        JFrame frame = new JFrame("Sağlık Profili Uygulaması");
        frame.setSize(400, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        
        // Kullanıcıdan bilgileri alacak form alanları
        JLabel nameLabel = new JLabel("Ad:");
        nameLabel.setBounds(10, 10, 120, 25);
        frame.add(nameLabel);
        
        JTextField nameField = new JTextField();
        nameField.setBounds(140, 10, 200, 25);
        frame.add(nameField);
        
        JLabel lastNameLabel = new JLabel("Soyad:");
        lastNameLabel.setBounds(10, 40, 120, 25);
        frame.add(lastNameLabel);
        
        JTextField lastNameField = new JTextField();
        lastNameField.setBounds(140, 40, 200, 25);
        frame.add(lastNameField);
        
        JLabel genderLabel = new JLabel("Cinsiyet:");
        genderLabel.setBounds(10, 70, 120, 25);
        frame.add(genderLabel);
        
        JTextField genderField = new JTextField();
        genderField.setBounds(140, 70, 200, 25);
        frame.add(genderField);
        
        JLabel birthYearLabel = new JLabel("Doğum Yılı:");
        birthYearLabel.setBounds(10, 100, 120, 25);
        frame.add(birthYearLabel);
        
        JTextField birthYearField = new JTextField();
        birthYearField.setBounds(140, 100, 200, 25);
        frame.add(birthYearField);
        
        JLabel birthMonthLabel = new JLabel("Doğum Ayı:");
        birthMonthLabel.setBounds(10, 130, 120, 25);
        frame.add(birthMonthLabel);
        
        JTextField birthMonthField = new JTextField();
        birthMonthField.setBounds(140, 130, 200, 25);
        frame.add(birthMonthField);
        
        JLabel birthDayLabel = new JLabel("Doğum Günü:");
        birthDayLabel.setBounds(10, 160, 120, 25);
        frame.add(birthDayLabel);
        
        JTextField birthDayField = new JTextField();
        birthDayField.setBounds(140, 160, 200, 25);
        frame.add(birthDayField);
        
        JLabel heightLabel = new JLabel("Boy (metre):");
        heightLabel.setBounds(10, 190, 120, 25);
        frame.add(heightLabel);
        
        JTextField heightField = new JTextField();
        heightField.setBounds(140, 190, 200, 25);
        frame.add(heightField);
        
        JLabel weightLabel = new JLabel("Kilo (kg):");
        weightLabel.setBounds(10, 220, 120, 25);
        frame.add(weightLabel);
        
        JTextField weightField = new JTextField();
        weightField.setBounds(140, 220, 200, 25);
        frame.add(weightField);
        
        // Hesapla butonu
        JButton calculateButton = new JButton("Hesapla");
        calculateButton.setBounds(140, 260, 100, 25);
        frame.add(calculateButton);
        
        // Sonuçlar için etiketler
        JLabel resultLabel = new JLabel("");
        resultLabel.setBounds(10, 290, 350, 100);
        frame.add(resultLabel);
        
        // Hesaplama butonu için ActionListener ekleniyor
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Kullanıcıdan bilgileri al
                    String firstName = nameField.getText();
                    String lastName = lastNameField.getText();
                    String gender = genderField.getText();
                    int birthYear = Integer.parseInt(birthYearField.getText());
                    int birthMonth = Integer.parseInt(birthMonthField.getText());
                    int birthDay = Integer.parseInt(birthDayField.getText());
                    double height = Double.parseDouble(heightField.getText());
                    double weight = Double.parseDouble(weightField.getText());
                    
                    // Sağlık profili oluştur
                    HealthProfile profile = new HealthProfile(firstName, lastName, gender, birthYear, birthMonth, birthDay, height, weight);
                   
                    // Sonuçları oluştur
                    String result = "<html>"
                    +"<br> <br> ";
                    result += "Ad - Soyad :   " + firstName  + " " +  lastName + "<br>";
                    result += "Yaş: " + profile.calculateAge() + "<br>";
                    result += String.format("BMI: %.2f<br>", profile.calculateBMI());
                    result += "Sağlık Durumu: " + profile.getHealthStatus() + "<br>";
                    result += "Max Kalp Atış Hızı: " + profile.calculateMaxHeartRate() + "<br>";
                    result += profile.calculateTargetHeartRate() + "<br>";
                    result += "İşlem Tarihi: " + profile.getFormattedDate() + "<br> <br>";
                    result += "</html>";
                    
                    // Sonuçları ekrana yazdır
                    resultLabel.setText(result);
                } catch (Exception ex) {
                    resultLabel.setText("Lütfen geçerli değerler girin.");
                }
            }
        });
        
        frame.setVisible(true);
    }
}

