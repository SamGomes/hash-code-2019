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

    public HashSet<String> getTags() {
        return tags;
    }

    public int calculateInterest(Slide otherSlide) {

        int result;

        HashSet<String> commonTags = new HashSet<String>(this.getTags());
        commonTags.retainAll(otherSlide.getTags());
        int nCommonTags = commonTags.size();

        int nTagsOnlyOnMe = this.getTags().size() - nCommonTags;
        int nTagsOnlyOnOther = otherSlide.getTags().size() - nCommonTags;

        result = Math.min(nCommonTags, nTagsOnlyOnMe);
        result = Math.min(result, nTagsOnlyOnOther);

        return result;
    }
}
