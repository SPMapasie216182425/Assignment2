public class Human {

    private String humanName;
    private String message;



    public Human(String aniName){

        humanName = aniName;

    }

    public Human(){}

    public String getHumanName() {
        return humanName;
    }

    public void setMessage(String msg){

        message = msg;
    }

    public String getMessage(){

        return message;
    }
}

