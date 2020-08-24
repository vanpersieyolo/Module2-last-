package PractiveFacade;

public class LinkedIn implements ISocialShare{
    private String message;


    @Override
    public void setMassage(String massage) {
        this.message = massage;
    }

    @Override
    public void share() {
        System.out.println("Linkedln share: " + this.message);
    }
}
