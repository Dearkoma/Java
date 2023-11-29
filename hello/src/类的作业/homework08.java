package 类的作业;

public class homework08 {
    public static void main(String[] args) {
        Music music = new Music("病变", 200);
        music.play();
        System.out.print(music.getInfo());
        }
}

class Music {
    String name;
    int times;

    public Music(String name, int times) {
        this.name = name;
        this.times = times;
    }

    public void play() {
        System.out.println("音乐:" + name + "正在播放...时常为" + times + "秒");
    }

    public String getInfo() {
        return "音乐" + name + "播放时间为" + times;
    }
}
