public class ComplexNumber {
    private double real;
    private double imaginary;
 
    //constructor
 
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
 
    //getters
 
    public double getReal() {
        return real;
    }
 
    public double getImaginary() {
        return imaginary;
    }
 
    //method to add we are passing parameters
    public void add(double real, double imaginary) {
 
        this.real = this.real + real;
        this.imaginary = this.imaginary + imaginary;
 
    }
    //method to add we are passing Complex number
    public  void  add(ComplexNumber another){//here the parameter we are passing ie another  is an object of class ComplexNumber
        this.real = this.real + another.real;
        this.imaginary = this.imaginary+ another.imaginary;
    }
 
    //method to subtract we are passing parameters
    public void subtract(double real, double imaginary) {
 
        this.real = this.real - real;
        this.imaginary = this.imaginary - imaginary;
 
    }
    //method to subtract we are passing Complex number
    public  void  subtract(ComplexNumber another){//here the parameter we are passing ie another  is an object of class ComplexNumber
        this.real = this.real - another.real;
        this.imaginary = this.imaginary - another.imaginary;
    }
}
