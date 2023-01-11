package com.ntatc.katas.mars;

public interface ModuleMartien {

    Position getPosition();

    void avancer();

    void reculer();

    void monter();  // FIXME : Interface Segregation - Un module martien ne peut pas forcément voler

    void descendre();   // FIXME : Interface Segregation - Un module martien ne peut pas forcément voler

    void activerRecuperation();

    boolean isPretPourRecuperation();
}