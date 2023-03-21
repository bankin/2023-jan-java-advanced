package bg.softuni.rpg_lab;

public interface Weapon {
    int getAttackPoints();

    int getDurabilityPoints();

    void attack(Target dummy);
}
