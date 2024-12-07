package enroll;

public abstract class Student {
    private String id;
    private String name;

    public abstract void register();

    public abstract void pretest();

    public abstract void posttest();

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
