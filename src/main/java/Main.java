import javax.swing.text.View;

public class Main {
    public static void main(String[] args){
        // 用戶
        var waterball = new Waterball();
        var fireball = new Fireball();

        // 頻道
        var channelWaterball = new Channel("水球軟體學院");
        var channelPewDiePie = new Channel("PewDiePie");

        //
        waterball.subscribe(channelWaterball);
        waterball.subscribe(channelPewDiePie);
        fireball.subscribe(channelWaterball);
        fireball.subscribe(channelPewDiePie);

        //
        channelWaterball.upload(new Video("C1M1S2", "這個世界正是物件導向的呢！", 4*60));
        channelPewDiePie.upload(new Video("Hello guys", "Clickbait", 30));
        //
        channelWaterball.upload(new Video("C1M1S3", "物件 vs. 類別", 1*60));
        channelPewDiePie.upload(new Video("Minecraft", "Let’s play Minecraft", 30*60));
    }
}
