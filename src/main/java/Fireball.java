public class Fireball extends ChannelSubscriber{

    public Fireball() {
        super("火球");
    }

    @Override
    public void handleEvent(Channel channel, Video video) {
        if (video.getLength() <= 1*60){
            channel.unsubscribe(this);
        }
    }
}
