package com.ntatc.katas.mars;

import java.util.stream.IntStream;

public class Sonde {

    // FIXME : Single Responsability - La sonde tente de faire trop de chose alors
    //  que c'est au module martien de savoir activer sa propre récupération (bouger, se poser...)

    public void preparerRecuperation(ModuleMartien moduleMartien) {
        if (moduleMartien instanceof Helicoptere) {
            // FIXME : Liskov - Révélé grâce au non respect de la Single Responsability.
            //  En voulant faire trop de choses, comme poser l'hélico avant la récupération,
            //  on est obligé de faire un instanceOf pour savoir que c'est un hélico.
            //  En faisant l'analogie avec l'exemple "du carré qui est un rectangle",
            //  ceci nous indique que l'hélico (le carré) est un ModuleMartien (un rectangle)
            //  mais n'est pas substituable car tous les modules martiens ne volent pas (un carré à 4 côtés égaux).
            poserHelicoptere(moduleMartien);
        }
        moduleMartien.activerRecuperation();
    }

    private void poserHelicoptere(ModuleMartien moduleMartien) {
        int altitude = moduleMartien.getPosition().getZ();
        atterir(moduleMartien, altitude);
    }

    private void atterir(ModuleMartien moduleMartien, int altitude) {
        IntStream.range(0, altitude)
                .forEach((i -> moduleMartien.descendre()));
    }

}