package cl.chokkoazul.hashsetmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * Created by cristian.osorio on 05-03-17.
 */
public class Test {

    public static void main(String []args){
        Alumno person1 = new Alumno("Juan",18);
        Alumno person2 = new Alumno("Miguel",25);
        Alumno person3 = new Alumno("Luis",18);
        Alumno person4 = new Alumno("Luis",18);

        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
        System.out.println(person3.hashCode());
        System.out.println(person4.hashCode());


        HashSet<Alumno> personas = new HashSet<Alumno>();
        personas.add(person1);
        personas.add(person2);
        personas.add(person3);
        personas.add(person4);

        System.out.println(personas.size());


        Map<Alumno, String> personasMap = new HashMap<Alumno, String>();
        personasMap.put(person1, "valor1");
        personasMap.put(person2, "valor2");
        personasMap.put(person3, "valor123");
        personasMap.put(person4, "otro valor");


        System.out.println(personasMap.keySet());
        System.out.println(personasMap.size());

    }
}
