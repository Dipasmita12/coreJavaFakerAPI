package a.b;

import com.github.javafaker.Faker;

/**
 * Faker API
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
        Faker f = new Faker();
        String fname = f.name().firstName();
        String lname = f.name().lastName();
        String email = f.internet().emailAddress();
        
        Person p = new Person(fname, lname, email);
        System.out.println(p.getFname()+" "+p.getLname()+" "+p.getEmail());
    }
}
