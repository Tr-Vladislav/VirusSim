package org.example;

import java.util.Random;
// Класс для представления популяции
class Population {
    String country;
    double populationDensity;
    int population;
    int infected;
    double stability;
    double averageTemperature;
    boolean borders;
    int medicalLevel;

    // Конструктор
    public Population(String country, double populationDensity, int population, double stability, double averageTemperature, boolean borders, int medicalLevel) {
        this.country = country;
        this.populationDensity = populationDensity;
        this.population = population;
        this.stability = stability;
        this.averageTemperature = averageTemperature;
        this.borders = borders;
        this.medicalLevel = medicalLevel;
        this.infected = 0;
    }

    // Метод для расчета одного шага симуляции заражения
    public void simulateInfectionStep(Virus virus) {
        Random random = new Random();

        // Рассчитываем вероятность передачи вируса текущему человеку
        double transmissionProbability = virus.infectionProbability - medicalLevel - stability ;

        // Генерируем случайное число от 0 до 1
        double randomNumber = random.nextDouble();

    }
}
