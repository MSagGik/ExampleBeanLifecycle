package ru.msaggik.spring;

public class ClassicalMusic implements Music {
    private ClassicalMusic() {} // ограничение создания объектов данного класса
    // нужно использовать фабричный метод
    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    public void doMyInit() {
        System.out.println("Doing my initialization");
    }
    public void doMyDestroy() {
        System.out.println("Doing my destruction");
    }
    @Override
    public String getSong() {
        return "I.S. Bach Musette in D major";
    }
}
