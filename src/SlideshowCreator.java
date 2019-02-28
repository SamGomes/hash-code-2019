import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SlideshowCreator {
    public static Slideshow createSlideshow(ArrayList<Photo> photos) {
        List<Photo> horizontalPhotos = photos.stream().filter(photo -> photo.getOrientation() == 0)
                .collect(Collectors.toList());
        List<Photo> verticalPhotos = photos.stream().filter(photo -> photo.getOrientation() == 1)
                .collect(Collectors.toList());


        return new Slideshow(new ArrayList<>());
    }
}
