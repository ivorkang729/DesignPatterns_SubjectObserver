public class Waterball extends ChannelSubscriber{

    public Waterball() {
        super("水球");
    }

    @Override
    public void handleEvent(Channel channel, Video video) {
        if (video.getLength() >= 3*60){
            video.like(this);
        }
    }
}
