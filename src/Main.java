import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Photo> photos = new ArrayList<Photo>();
        try {
            photos = readInputs("a_examples.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(photos.toString());
    }

    public static ArrayList<Photo> readInputs(String filename) throws FileNotFoundException {

        //read input
        ArrayList<Photo> photos = new ArrayList<Photo>();
        try {
            Scanner inputScanner = new Scanner(new File(filename, filename + ".in"));


            int idCounter = 0;

            int numPhotos = inputScanner.nextInt();

            //build slides
            for (int i = 0; i < numPhotos; i++) {
                String photoText = inputScanner.nextLine();
                String[] photoAttributes = photoText.split(" ");
                int numTags = Integer.parseInt(photoAttributes[1]);
                HashSet<String> photoTags = new HashSet<String>();
                for (int j = 0; j < numTags; j++) {
                    photoTags.add(photoAttributes[j + 2]);
                }
                int orientation = (photoAttributes[0].equals("H")) ? 0 : 1;
                photos.add(new Photo(idCounter++, orientation, photoTags));
            }

        } catch (FileNotFoundException e) {
            System.out.println("file not found!");
        }

        return photos;
    }
}


