import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;


public class Main {
    public static void main(String[] args) {

        Slideshow slideshow;
        HashMap<String, Float> tf = new HashMap<String, Float>();

        ArrayList<Photo> photos = new ArrayList<Photo>();
        String[] exampleNames = {"a_example","b_lovely_landscapes","c_memorable_moments","d_pet_pictures","e_shiny_selfies"};
        try {
            for(String exampleName : exampleNames){
                photos = InputHelper.readInputs(".\\examples\\"+exampleName+".txt", tf);

                //Create slideshow from the photos
                slideshow = SlideshowCreator.createSlideshow(photos, tf);
                OutputHelper.outputSolution(exampleName, slideshow);
                System.out.println(photos.toString());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}


