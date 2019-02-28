import java.util.ArrayList;
import java.util.HashSet;

public class Photo {
    private float value;
    private int id;
    private int orientation; //0 - Horizontal, 1 - Vertical

    private HashSet<String> tags;

    public Photo(int id, int orientation, HashSet<String> tags) {
        this.id = id;
        this.orientation = orientation;
        this.tags = tags;
    }

    public void setValue(float value){
        this.value = value;
    }
    public int getId() {
        return id;
    }

    public float getImportance() {
        return this.value;
    }

    public int getOrientation() {
        return orientation;
    }

    public HashSet<String> getTags() {
        return tags;
    }
}
