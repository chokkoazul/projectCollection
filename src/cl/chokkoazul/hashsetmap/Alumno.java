package cl.chokkoazul.hashsetmap;

/**
 * Created by cristian.osorio on 05-03-17.
 */
public class Alumno {
    private int age;
    private String name;

    Alumno(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        //return true;
        if (o instanceof Alumno) {
            Alumno p = (Alumno)o;
            return this.age == p.age;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        //return 1;
        return age * this.name.length();
    }
}