import enroll.Person;
import heroes.hero.Ironman;
import heroes.hero.Spiderman;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.register();

        Ironman h1 = new Ironman();
        h1.setNameHero("Tony Stack")
                .setAgeHero("45")
                .setJobHero("Engineer")
                .skill("Flying and Shooting Lasers");
        h1.weapon("Axe");
        h1.showDisplayHero();

        Spiderman spider = new Spiderman();
        spider.setNameHero("Peter Parker")
                .setAgeHero("32")
                .setJobHero("Bad Luck Guy")
                .skill("Bad in bad bad bad bad luck");
        spider.showDisplayHero();
    }
}
