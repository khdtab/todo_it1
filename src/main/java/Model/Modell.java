package Model;
import java.util.*;

public class Modell {
    public static void main( String[] args )
    {
Person prs = new Person();
prs.setpersonId(5);
prs.setfirstName("Khaled");
prs.setlastName("Tayeb");
System.out.println("This is the ID: "+prs.getpersonId());
System.out.println("This is the first name: "+prs.firstName) ;
System.out.println("This is the last name: "+prs.lastName);
    }
}
