package com.ntatc.katas.mars;

import java.util.stream.IntStream;

public class Sonde {

	// single responsability ; la sonde s'est faire trop de chose

	public void preparerRecuperation(ModuleMartien moduleMartien) {
		if (moduleMartien instanceof Helicoptere) { // Liskov
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