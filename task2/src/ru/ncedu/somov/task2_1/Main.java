package ru.ncedu.somov.task2_1;

public class Main {

    public static void main(String[] args) {

        Voice voiceCat = new Cat();
        voiceCat.voice();

        Voice voiceDog = new Dog();
        voiceDog.voice();

        Voice voiceCow = new Cow();
        voiceCow.voice();
    }
}
