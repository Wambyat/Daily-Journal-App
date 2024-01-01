/**
 * This class has all Photos for a given entry.
 * @author (Wambyat)
 * @version (0.1)
 */
import java.util.Arrays;
public class Photo
{
    private int[] photos;
    public Photo(int[] Photo)
    {
        this.photos = Photo;
    }
    
    public String toString()
    {
        return "All Photos: "+ Arrays.toString(this.photos);
    }
}
