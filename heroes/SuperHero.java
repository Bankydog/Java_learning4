package heroes;

public abstract class SuperHero {

    private String name;
    private String age;
    private String job;

    public SuperHero setNameHero(String name) {
        this.name = name;
        return this;
    }

    public SuperHero setAgeHero(String age) {
        this.age = age;
        return this;

    }

    public SuperHero setJobHero(String job) {
        this.job = job;
        return this;

    }

    public String getNamHero() {
        return name;
    }

    public String getAgeHero() {
        return age;
    }

    public String getJobHero() {
        return job;
    }

    public abstract SuperHero skill(String skill);

    public void showDisplayHero() {
        System.out.println("name : " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Job: " + this.job);
    }
}