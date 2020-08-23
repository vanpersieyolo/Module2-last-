package PractiveFacade;

public class Facebook implements ISocialShare{
    private String massage;
    @Override
    public void setMassage(String massage) {
        this.massage = massage;
    }

    @Override
    public void share() {
        System.out.println("Facebook share: " + this.massage);
    }
}
