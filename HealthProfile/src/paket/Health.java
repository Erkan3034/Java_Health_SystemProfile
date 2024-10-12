package paket;
import java.time.LocalDate;
import java.time.Period;

class HealthProfile {
    private String firstName;
    private String lastName;
    private String gender;
    private int birthYear;
    private int birthMonth;
    private int birthDay;
    private double height; // Metre cinsinden
    private double weight; // Kilogram cinsinden

    public HealthProfile(String firstName, String lastName, String gender, int birthYear, int birthMonth, int birthDay, double height, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthYear = birthYear;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.height = height;
        this.weight = weight;
    }

    public int calculateAge() {
        LocalDate today = LocalDate.now();
        LocalDate birthDate = LocalDate.of(birthYear, birthMonth, birthDay);
        return Period.between(birthDate, today).getYears();
    }

    public double calculateBMI() {
        return weight / (height * height); // Boy metre olarak alınıyor
    }

    public String getHealthStatus() {
        double bmi = calculateBMI();
        if (bmi < 18.5) {
            return "Zayıf";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal";
        } else if (bmi >= 25 && bmi < 29.9) {
            return "Kilolu";
        } else {
            return "Obez";
        }
    }

    public int calculateMaxHeartRate() {
        int age = calculateAge();
        return 220 - age;
    }

    public String calculateTargetHeartRate() {
        int maxHeartRate = calculateMaxHeartRate();
        double minTargetHeartRate = maxHeartRate * 0.50;
        double maxTargetHeartRate = maxHeartRate * 0.85;
        return String.format("Hedef Kalp Atış Hızı: %.0f - %.0f", minTargetHeartRate, maxTargetHeartRate);
    }

    public String getFormattedDate() {
        LocalDate today = LocalDate.now();
        return String.format("%02d-%02d-%04d", today.getDayOfMonth(), today.getMonthValue(), today.getYear());
    }
}
