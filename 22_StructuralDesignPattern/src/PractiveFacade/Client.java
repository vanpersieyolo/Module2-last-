package PractiveFacade;

public class Client {
    public void share(String message){
        SocialFacade socialFacade  = new SocialFacade(new Facebook(),new Twitter(),new LinkedIn());
        socialFacade.share(message);

    }

    public static void main(String[] args) {
        Client client = new Client();
        client.share("This is post");

    }
}
