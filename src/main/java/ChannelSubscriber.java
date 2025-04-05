public abstract class ChannelSubscriber {
    private String name;

    public ChannelSubscriber(String name) {
        this.name = name;
    }

    public void subscribe(Channel channel){
        channel.subscribe(this);
    }

    public String getName() {
        return name;
    }

    public abstract void handleEvent(Channel channel, Video video);
}
