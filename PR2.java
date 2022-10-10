import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;
import java.lang.Math;
class RegularPolygon
{
    private int n=3;
    private double side=1;
    private double x=0;
    private double y=0;
    RegularPolygon(){}
    RegularPolygon(int n, double side)
    {
        this.n=n;
        this.side=side;
        this.x=0;
        this.y=0;
    }
    RegularPolygon(int n, double side, double x, double y)
    {
        this.n=n;
        this.side=side;
        this.x=x;
        this.y=y;
    }
    public int getN()
    {
        return n;
    }
    public void setN(int n)
    {
        this.n=n;
    }
    public double getSide()
    {
        return side;
    }
    public void setSide(double side)
    {
        this.side=side;
    }
    public double getX()
    {
        return x;
    }
    public void setX(Double x)
    {
        this.x=x;
    }
    public double getY()
    {
        return y;
    }
    public void setY(Double y)
    {
        this.y=y;
    }
    public double getPerimeter()
    {
        return (this.n)*(this.side);
    }
    public double getArea()
    {
        double Area=(this.n * Math.pow(this.side,2)) / (4 * Math.tan(Math.PI/this.n));
        return Area;
    }
}
public class PR2 {
    public static void main(String[] args) {
        RegularPolygon R1 = new RegularPolygon();
        RegularPolygon R2 = new RegularPolygon(4,10);
        RegularPolygon R3 = new RegularPolygon(7,6,8,1);
        double P1=R1.getPerimeter();
        double A1=R1.getArea();
        double P2=R2.getPerimeter();
        double A2=R2.getArea();
        double P3=R3.getPerimeter();
        double A3=R3.getArea();
        System.out.println("+++++R1+++++");
        System.out.println(P1);
        System.out.println(A1);
        System.out.println("+++++R2+++++");
        System.out.println(P2);
        System.out.println(A2);
        System.out.println("+++++R3+++++");
        System.out.println(P3);
        System.out.println(A3);
    }
    
}