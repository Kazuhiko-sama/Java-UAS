package shape;
 
public class Circle {
    protected float radius; 
    protected float pi = 22/7;
 
    public Circle(float r) {
        this.radius = r;
    }
    
    public float getArea() {
        return this.pi * Math.pow(this.radius, 2);
    }
}
