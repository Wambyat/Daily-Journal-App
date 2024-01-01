/**
 * This will have all the parts of a single Entry.
 * @author (Wambyat)
 * @version (0.1)
 */
public class Entry
{
    private int mood;
    private Activity forline;
    private Activity[] allActivity;
    private Photo allPhoto;
    public Entry(int mood, Activity[] allActivity, Photo allPhoto)
    {
        this.mood = mood;
        this.allActivity = allActivity;
        this.allPhoto = allPhoto;
    }
    public String actiPrint()
    {
        String res = "";
        for (Activity i : this.allActivity)
        {
            res += i + " ";
        }
        return res;
    }
    public String toString()
    {
        return "Mood: " + this.mood + "\nActivity: " + actiPrint() + "\nPhotos: " + this.allPhoto;
    }
}