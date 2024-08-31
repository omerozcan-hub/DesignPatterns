public class Main {
    public static void main(String[] args) {

        Video video = new VideoProxy("my_video.mp4");

        // Video yüklenir ve oynatılır
        video.play();

        // İkinci çağrıda video yüklenmez, yalnızca oynatılır
        video.play();
    }
}