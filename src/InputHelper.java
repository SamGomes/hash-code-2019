import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class InputHelper {
    public static ArrayList<Photo> readInputs(String filename, HashMap<String, Float> tfIdf) throws FileNotFoundException {

        //read input
        ArrayList<Photo> photos = new ArrayList<Photo>();
        try {
            Scanner inputScanner = new Scanner(new File(filename));


            int idCounter = 0;
            int numPhotos = inputScanner.nextInt();
            inputScanner.nextLine();
            //build slides
            for (int i = 0; i < numPhotos; i++) {
                String photoText = inputScanner.nextLine();
                String[] photoAttributes = photoText.split(" ");
                int numTags = Integer.parseInt(photoAttributes[1]);
                HashSet<String> photoTags = new HashSet<String>();
                for (int j = 0; j < numTags; j++) {
                    String photoTag = photoAttributes[j + 2];

                    if (!tfIdf.containsKey(photoTag)) {
                        tfIdf.put(photoTag, 1.0f);
                    }else{
                        tfIdf.replace(photoTag, tfIdf.get(photoTag)+1);
                    }

                    photoTags.add(photoTag);
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
