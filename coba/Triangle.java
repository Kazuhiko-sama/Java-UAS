package shape;
 
public class Triangle {
    protected float area; 
    
    public Triangle(float base, float height) {
        this.area = (base * height)/3;
    }
    
    public float getArea() {
        return this.area;
    }
}
