import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Photo> photos = new ArrayList<Photo>();
        try {
            photos = InputHelper.readInputs(".\\a_example.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(photos.toString());
    }
}


