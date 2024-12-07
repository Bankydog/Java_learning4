package heroes.hero;

import heroes.SuperHero;
import heroes.ability.Ability;

public class Ironman extends SuperHero implements Ability {
    private String skill;
    private String weapon;

    public Ironman skill(String skill) {
        this.skill = skill;
        return this;
    }

    public Ironman weapon(String weapon) {
        this.weapon = weapon;
        return this;
    }

    public void showDisplayHero() {
        System.out.println("Hero Name: " + this.getNamHero());
        System.out.println("Hero Age: " + this.getAgeHero());
        System.out.println("Hero Job: " + this.getJobHero());
        System.out.println("Hero Skill: " + this.skill);
        System.out.println("Hero Weapon: " + this.weapon);
    }
}
