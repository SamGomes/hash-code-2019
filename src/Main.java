import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;


public class Main {
    public static void main(String[] args) {

        Slideshow slideshow;
        HashMap<String, Float> tfIdf = new HashMap<String, Float>();


        ArrayList<Photo> photos = new ArrayList<Photo>();
        try {
            photos = InputHelper.readInputs(".\\examples\\a_example.txt", tfIdf);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //Create slideshow from the photos
        slideshow = SlideshowCreator.createSlideshow(photos, tfIdf);
        OutputHelper.outputSolution(slideshow);
        System.out.println(photos.toString());
    }
}


