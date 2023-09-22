class CSphere
{
   private int x;   //圓心的x座標
   private int y;   //圓心的y座標
   private int z;   //圓心的z座標
   private int radius;   //圓心的半徑

    void setLocation(int i, int j, int k)
   {
    x=i;                
    y=j;
    z = k;
   }
   void setRadius(int r)
   {
    radius=r;
   }
   double surfaceArea()
   {
    return (double)4*3.1416*radius*radius; 
   }
   double volume()
   {
    return ((double)3.1416*radius*radius);
   
   }
   void showCenter()
   {
    System.out.println("Circle center"+"x="+x+" "+"y="+y+" "+"z="+z+" "+"radius="+radius);
   }
}
 
 
  public class hw08_16
  {
   public static void main(String args[])
   {
   CSphere cs=new CSphere();
   cs.setLocation(3,4,5);
   cs.setRadius(1);
   System.out.println("surface area="+cs.surfaceArea());
   cs.showCenter();
   
   }
  }
