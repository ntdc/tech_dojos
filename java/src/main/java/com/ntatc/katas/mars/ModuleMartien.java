package com.ntatc.katas.mars;

public interface ModuleMartien {

    Position getPosition();

    void avancer();

    void reculer();

    void monter(); // Interface segregation

    void descendre(); // Interface segregation

    void activerRecuperation();

    boolean isPretPourRecuperation();
}