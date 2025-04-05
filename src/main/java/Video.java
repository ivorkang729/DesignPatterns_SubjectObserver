public class Video {
    private String title;
    private String description;
    private Integer length;

    public Video(String title, String description, Integer length) {
        this.title = title;
        this.description = description;
        this.length = length;
    }

    public Object getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    public String getDescription() {
        return description;
    }

    public void like(ChannelSubscriber user){
        System.out.println(String.format("%s 對影片 \"%s\" 按讚。", user.getName(), title));
    }
}
