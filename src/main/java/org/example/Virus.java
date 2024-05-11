package org.example;

// Материнский класс для представления вируса
abstract class Virus {
    String type;
    double incubationPeriod;
    double infectionProbability;
    double mortalityRate;

    // Конструктор
    public Virus(String type, double incubationPeriod, double infectionProbability, double mortalityRate) {
        this.type = type;
        this.incubationPeriod = incubationPeriod;
        this.infectionProbability = infectionProbability;
        this.mortalityRate = mortalityRate;
    }

    // Метод для настройки характеристик вируса
    public void setCharacteristics(double incubationPeriod, double infectionProbability, double mortalityRate) {
        this.incubationPeriod = incubationPeriod;
        this.infectionProbability = infectionProbability;
        this.mortalityRate = mortalityRate;
    }

    // Переопределение метода для получения пути передачи вируса
    public abstract String getTransmissionRoute();
}

// Дочерний класс для вируса дыхательных путей
class RespiratoryVirus extends Virus {
    // Конструктор
    public RespiratoryVirus(double incubationPeriod, double infectionProbability, double mortalityRate) {
        super("Respiratory", incubationPeriod, infectionProbability, mortalityRate);
    }

    // Переопределение метода для получения пути передачи вируса
    @Override
    public String getTransmissionRoute() {
        return "Airborne";
    }
}

// Дочерний класс для контактного вируса
class ContactVirus extends Virus {
    // Конструктор
    public ContactVirus(double incubationPeriod, double infectionProbability, double mortalityRate) {
        super("Contact", incubationPeriod, infectionProbability, mortalityRate);
    }

    // Переопределение метода для получения пути передачи вируса
    @Override
    public String getTransmissionRoute() {
        return "Contact";
    }

}

// Дочерний класс для пищевого вируса
class FoodborneVirus extends Virus {
    // Конструктор
    public FoodborneVirus(double incubationPeriod, double infectionProbability, double mortalityRate) {
        super("Foodborne", incubationPeriod, infectionProbability, mortalityRate);
    }

    // Переопределение метода для получения пути передачи вируса
    @Override
    public String getTransmissionRoute() {
        return "Foodborne";
    }
}

// Дочерний класс для других типов вирусов
// Можно создать дополнительные классы для других видов вируса по аналогии с вышеуказанными классами

