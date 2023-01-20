class Box
{
    double width;
    double height;
    double depth;
}
public class oopobject
{
    public static void main(String arg[])
    {
        Box obj=new Box();
        obj.width=5;
        obj.height=10;
        obj.depth=15;
        double volume=obj.width*obj.height*obj.depth;
        System.out.println("Volume of Box:"+volume);
    }
}
