import java.util.ArrayList;

public class Slideshow {
    public ArrayList<Slide> getSlides() {
        return slides;
    }

    private ArrayList<Slide> slides;

    public Slideshow(ArrayList<Slide> slides) {
        this.slides = slides;
    }
}
