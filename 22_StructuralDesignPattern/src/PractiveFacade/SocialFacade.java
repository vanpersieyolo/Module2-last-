package PractiveFacade;

public class SocialFacade {
    private Facebook facebook;
    private Twitter twitter;
    private LinkedIn linkedIn;

    public SocialFacade(Facebook facebook, Twitter twitter, LinkedIn linkedIn){
        this.facebook = facebook;
        this.twitter = twitter;
        this.linkedIn = linkedIn;
    }
    public void share (String message){
        this.twitter.setMassage(message);
        this.facebook.setMassage(message);
        this.linkedIn.setMassage(message);
        this.twitter.share();
        this.linkedIn.share();
        this.facebook.share();
    }
}
