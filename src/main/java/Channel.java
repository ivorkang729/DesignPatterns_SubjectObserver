import java.util.HashSet;
import java.util.Set;

public class Channel {
    private String name;
    private Set<ChannelSubscriber> subscribers;

    public Channel(String name){
        this.name = name;
        this.subscribers = new HashSet<>();
    }

    public void subscribe(ChannelSubscriber user){
        subscribers.add(user);
        System.out.println(String.format("%s 訂閱了 %s。", user.getName(), name));
    }

    public void unsubscribe(ChannelSubscriber user){
        subscribers.remove(user);
        System.out.println(String.format("%s 解除訂閱了 %s。", user.getName(), name));
    }

    /**上傳新影片*/
    public void upload(Video video){
        System.out.println(String.format("頻道 %s 上架了一則新影片。%s", name, video.getTitle()));
        publishEvent(video);
    }

    private void publishEvent(Video video){
        for (var subscriber : new HashSet<>(subscribers)){
            subscriber.handleEvent(this, video);
        }
    }
}
