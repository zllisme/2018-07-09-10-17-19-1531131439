package practice07;

public class Teacher extends Person{
    private Klass Klass;

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        Klass = klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public practice07.Klass getKlass() {
        return Klass;
    }

    public void setKlass(practice07.Klass klass) {
        Klass = klass;
    }

    @Override
    public String introduce() {
        return this.Klass != null ?
                String.format("%s I am a Teacher. I teach Class %d.", super.introduce(), this.Klass.getNumber())
                : String.format("%s I am a Teacher. I teach No Class.", super.introduce());
    }

    public String introduceWith(Student student) {
        return student.getKlass().getNumber()== this.Klass.getNumber() ?
                String.format("%s I am a Teacher. I teach %s.", super.introduce(), student.getName())
                : String.format("%s I am a Teacher. I don't teach %s.", super.introduce(), student.getName());
    }
}

