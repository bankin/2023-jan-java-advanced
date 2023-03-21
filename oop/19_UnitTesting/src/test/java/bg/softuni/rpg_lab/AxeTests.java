package bg.softuni.rpg_lab;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AxeTests {
    private static int DUMMY_INITIAL_HEALTH = 10;

    private Dummy target;

    @Before
    public void setupDummy() {
        this.target = new Dummy(10, 10);
    }

    @Test
    public void attackDropsDurability() {
        int durability = 10;
        // Arrange
        Axe axe = new Axe(10, durability);

        // Act
        axe.attack(target);

        // Assert
        Assert.assertEquals( durability - 1, axe.getDurabilityPoints());
    }

    // Assert
    @Test(expected = IllegalStateException.class)
    public void cannotAttackWithBrokenAxe() {
        // Arrange
        Axe axe = new Axe(10, 0);

        // Act
        axe.attack(target);

    }

}
