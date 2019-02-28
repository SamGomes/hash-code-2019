import java.util.ArrayList;

public class Main {
    public static void main(String [ ] args)
    {

        ArrayList<Slide> slides = new ArrayList<Slide>();
        ArrayList<Photo> photos = new ArrayList<Photo>();
        slides.add(new Slide(photos));
        slides.add(new Slide(photos));
        slides.add(new Slide(photos));
        Slideshow slideshow = new Slideshow(slides);


        System.out.println(slideshow.toString());
    }
}
