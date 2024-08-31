public class VideoProxy implements Video {
    private RealVideo realVideo;
    private String fileName;

    public VideoProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void play() {
        if (realVideo == null) {
            realVideo = new RealVideo(fileName);
        }
        realVideo.play();
    }
}