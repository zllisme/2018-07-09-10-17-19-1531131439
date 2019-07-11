package practice06;

public class Teacher extends Person{
    private int Klass;

    public Teacher(String name, int age, int klass) {
        super(name, age);
        Klass = klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public int getKlass() {
        return Klass;
    }

    public void setKlass(int klass) {
        Klass = klass;
    }

    @Override
    public String introduce() {
        return this.Klass != 0 ?
                String.format("%s I am a Teacher. I teach Class %d.", super.introduce(), this.Klass)
                : String.format("%s I am a Teacher. I teach No Class.", super.introduce());
    }
}
