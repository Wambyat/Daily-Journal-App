public class Base
{
    public static void main(String args[])
    {
        int[] a = {1,2,3,4};
        Photo test = new Photo(a);
        Activity[] allActivity = new Activity[2];
        allActivity[0] = new Activity(1,"First Acitvity", "This is a test");
        allActivity[1] = new Activity(0,"Second Acitvity", "This is another test");
        Entry e = new Entry(3,allActivity,test);
        System.out.println("Hello World");
        System.out.println(e);
    }
}