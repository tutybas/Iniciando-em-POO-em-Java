package Triangulo;

public class Triangulo {
    
    float base,altura,area;
    
    Triangulo(){
        float base = 0;
        float altura = 0;
        float area = 0;
    }
    
    public void SetterTriangulo(float b, float a){
        base = b;
        altura = a;
    }
    
    public float GetTriangulo(){
        area = (base*altura)/2;
        return area;
    }
}
