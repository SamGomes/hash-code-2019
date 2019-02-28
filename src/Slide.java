import java.util.ArrayList;
import java.util.HashSet;

public class Slide {
    private ArrayList<Photo> photos;
    private HashSet<String> tags;

    public Slide(ArrayList<Photo> photos) {
        this.photos = photos;
        HashSet<String> allTags = new HashSet<String>();
        for(Photo photo: photos){
            allTags.addAll(photo.getTags());
        }
    }

    public ArrayList<Photo> getPhotos() {
        return photos;
    }
}
