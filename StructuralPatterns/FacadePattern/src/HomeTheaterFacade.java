public class HomeTheaterFacade {
    private Amplifier amp;
    private DvdPlayer dvd;
    private Projector projector;

    public HomeTheaterFacade(Amplifier amp, DvdPlayer dvd, Projector projector) {
        this.amp = amp;
        this.dvd = dvd;
        this.projector = projector;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        amp.on();
        amp.setVolume(5);
        dvd.on();
        dvd.play(movie);
        projector.on();
        projector.setInput("DVD");
    }

    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        projector.off();
        dvd.off();
        amp.off();
    }
}