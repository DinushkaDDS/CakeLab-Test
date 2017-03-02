import java.util.IllegalFormatCodePointException;
import java.util.IllegalFormatException;

/**
 * Created by ddsdi on 3/2/2017.
 */
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Person person = new Person();
        person.setName("Peter");
        person.setEmail("peter@gmail.com");
        System.out.println(person);
    }

    public Person savePerson(Person person){
        if (person == null){
            throw new IllegalArgumentException();
        }
        else{
            person.setId("P1000");
            return person;
        }
    }
}
