import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class HumanTest {

    private Human humanName = new Human("Shane");
    private Human humanName2 = humanName;
    private Human humanName3 = new Human("Lauren");
    private Human humanName4 = new Human("Dimitri");

    String message = "This is a time out message";


    @Test
    public void getHumanName() {//object equality

        assertEquals(humanName2.getHumanName(), humanName.getHumanName());
    }// end of the getter

    @Test
    public void testGetName() {//Object Identity

        if(humanName == humanName){
            //true
        }
        if (humanName == humanName){
            //true
        }
        if (humanName == humanName){
            //false
        }

    }//end of the getter


    @Test
    public void testGetHumanName() {//fail test
        assertEquals(humanName.getHumanName(), humanName4.getHumanName());
    }


    @Test(timeout = 10)
    public void timeOutTest(){
        Human animalMessage = new  Human();
        animalMessage.setMessage(message);

        System.out.println("Inside timeOutTest()");
        animalMessage.getMessage();
    }// en dof timeout method
    @Ignore("not ready yet")
    @Test
    public void testMethod(){

        System.out.println("This method is not ready");
    }


}