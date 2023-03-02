package animal.animals;

public class Puppy extends Dog {

    public void weep() {
        System.out.println("weeping...");
    }

    @Override
    public void bark() {
        System.out.println("wof-bark-wof");
    }

    @Override
    protected void walk() {
        super.walk();
        System.out.println("child walk");
    }
}
