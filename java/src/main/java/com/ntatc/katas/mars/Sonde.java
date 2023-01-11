package com.ntatc.katas.mars;

public class Sonde {
    // Single Responsability OK - La sonde ne fait que lancer la demande de récupération

    public void preparerRecuperation(ModuleMartien2D moduleMartien) {
        // Liskov OK - Peu importe le type de module. Tous les modules savent activer leur propre récupération
        moduleMartien.activerRecuperation();
    }

}