import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class OutputHelper {
    public static void outputSolution(String fileName, Slideshow show) {
        try (PrintWriter out = new PrintWriter("outputs//"+fileName+".txt")) {
            out.println(show.getSlides().size());
            for(Slide slide: show.getSlides()){
                for (Photo photo : slide.getPhotos()) {
                    out.print(photo.getId() + " ");
                }
                out.println();
            }
        } catch (FileNotFoundException e) {
            System.out.println("not ok...");
        }
    }
}