package PractiveFacade;

public class Twitter implements ISocialShare{
    private String massage;
    @Override
    public void setMassage(String massage) {
        this.massage = massage;
    }

    @Override
    public void share() {
        System.out.println("Twitter share: " + this.massage);
    }
}
