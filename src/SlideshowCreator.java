import java.util.*;
import java.util.stream.Collectors;

public class SlideshowCreator {
    public static Slideshow createSlideshow(ArrayList<Photo> photos, HashMap<String, Float> tf) {

        ArrayList<Slide> slides = new ArrayList<Slide>();
        for(Photo photo: photos){
            Float photoTf = 0.0f;
            for(String tag: photo.getTags()){
                photoTf+=tf.get(tag);
            }
            photo.setValue(photoTf);
        }
        photos.sort(Comparator.comparingDouble(o -> o.getValue()));

        List<Photo> horizontalPhotos = photos.stream().filter(photo -> photo.getOrientation() == 0)
                .collect(Collectors.toList());
        List<Photo> verticalPhotos = photos.stream().filter(photo -> photo.getOrientation() == 1)
                .collect(Collectors.toList());

        for(Photo photo: horizontalPhotos){
            ArrayList<Photo> photoList = new ArrayList<Photo>();
            photoList.add(photo);
            slides.add(new Slide(photoList));
        }
        for(int i=0; i < verticalPhotos.size(); i+=2){

            ArrayList<Photo> photoList = new ArrayList<Photo>();
            photoList.add(verticalPhotos.get(i));
            if(verticalPhotos.get(i+1)!=null) {
                photoList.add(verticalPhotos.get(i + 1));
            }
            slides.add(new Slide(photoList));
        }

        return new Slideshow(slides);
    }
}
