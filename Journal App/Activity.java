/**
 * This class has a name, icon, state and a description of the Activity
 * @author (Wambyat)
 * @version (0.1)
 */
 
public class Activity
{
    private int icon;
    private boolean state;
    private String name;
    private String description;
    public Activity(int icon,String name, String description)
    {
        this.icon = icon;
        this.name =name;
        this.description = description;
    }
    
    public String toString()
    {
        return "Name: "+ this.name + "\nDescription: " + this.description;
    }
}
