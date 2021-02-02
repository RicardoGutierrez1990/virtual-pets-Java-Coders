package virtual_pet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VirtualPetTest {

    @Test
    public void petShouldHaveName() {
        VirtualPet underTest = new VirtualPet("Jeff", 1, 1, 1);

        String expected = underTest.getName();

        assertEquals(expected, "Jeff");
    }

}