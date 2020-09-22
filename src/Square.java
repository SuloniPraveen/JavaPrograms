public class Square {
    int add_sq(int a,int b)
    {
        return (a+b)*(a+b);
    }
    int add_sq(int a,int b,int c)
    {
        return (a+b+c)*(a+b+c);
    }
    int add_sq(int a,int b,int c,int d)
    {
        return (a+b+c+d)*(a+b+c+d);
    }
    public static void main(String[] args)
    {
      Square obj = new Square();
      System.out.println("Square of sum of 2 no.s: "+obj.add_sq(10,20));
      System.out.println("Square of sum of 3 no.s: "+obj.add_sq(10,20,30));
      System.out.println("Square of sum of 4 no.s: "+obj.add_sq(10,20,30,40));
    }
}
