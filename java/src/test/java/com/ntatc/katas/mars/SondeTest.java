package com.ntatc.katas.mars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SondeTest {

    @Test
    void roverDoitEtreRecupere() {
        // Arrange
        Sonde sut = new Sonde();
        ModuleMartien2D curiosity = new Rover(Direction.NORD, new Position(4, 4, 0));

        // Act
        sut.preparerRecuperation(curiosity);

        // Assert
        assertTrue(curiosity.isPretPourRecuperation());
        assertEquals(new Position(4, 4, 0), curiosity.getPosition());
    }

    @Test
    void helicoptereDoitEtreRecupere() {
        // Arrange
        Sonde sut = new Sonde();
        ModuleMartien3D ingenuity = new Helicoptere(Direction.NORD, new Position(4, 4, 50));

        // Act
        sut.preparerRecuperation(ingenuity);

        // Assert
        assertTrue(ingenuity.isPretPourRecuperation());
        assertEquals(new Position(4, 4, 0), ingenuity.getPosition());
    }
}
