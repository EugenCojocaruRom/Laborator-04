public class Complex {
    //Declare public member variable for the real part
    public double re;
    //Declare public member variable for the imaginary part
    public double im;

    //Constructor with 2 arguments
    public Complex(double real, double imaginary) {
        this.re = real;
        this.im = imaginary;
    }

    //Constructor without arguments (the values are set to 0)
    public Complex() {
        this.re = 0;
        this.im = 0;
    }

    //complex number ==> a + b*i

    //Define the method for performing the addition
    //(a + b*i) + (c + d*i) = (a + b) + (b + d) * i
    public static Complex add(Complex c1, Complex c2) {
        //Create a new complex object for the result
        Complex additionResult = new Complex(0, 0);
        //Add the real parts
        additionResult.re = c1.re + c2.re;
        //Add the imaginary parts
        additionResult.im = c1.im + c2.im;
        //Return the new complex number
        return additionResult;
    }

    //Method to display the result of adding the complex numbers
    public void displayAdd() {
        System.out.println("Sum is: " + re + " + i" + im);
    }

    //Define the method for performing the multiplication
    //(a + b*i) * (c + d*i) = (a * c - b * d) + (b * c + a * d) * i
    public static Complex multiply(Complex c1, Complex c2) {
        Complex multiplicationResult = new Complex(0, 0);
        multiplicationResult.re = (c1.re * c2.re - c1.im * c2.im);
        multiplicationResult.im = (c1.im * c2.re) + (c1.re * c2.im);
        return multiplicationResult;
    }

    //Method to display the result of multiplying the complex numbers
    public void displayMulti() {
        System.out.println("Multiplication is: " + re + " + i" + im);
    }

    //Define the method for performing the multiplication
    static Complex toPower(Complex c3, int n) {
        //Declare and initialize the result of raising the complex number to power n
        Complex toPowerResult = new Complex(1, 0);
        //Loop from i = 0 to n, incrementing i by 1
        for (int i = 0; i < n; i++) {
            //Multiply the result by the value c3 at each iteration
            toPowerResult = multiply(toPowerResult, c3);
        }
        //Return the result
        return toPowerResult;
    }

    //Method to display the result of raising a complex number to a natural power
    public void displayComplexToPower() {
        System.out.println("Result of complex to power: " + re + " + i" + im);
    }

    //Define the method for checking if two complex numbers are identical
    @Override
    public boolean equals(Object obj) {
        //Set the condition for comparing the 2 variables
        if (this == obj) {
            return true;
        }
        //Set the condition for checking if the number is null or if it is indeed a complex number
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        //Convert the object into a complex number (by casting)
        Complex other = (Complex) obj;
        //Return the result by comparing the real and imaginary parts of the 2 numbers
        return Double.compare(this.re, other.re) == 0 && Double.compare(this.im, other.im) == 0;
    }


    //Define method for returning the complex number as a string in the form (re, im)
    @Override
    public String toString() {
        return "(" + re + ", " + im + ")";
    }

    //Method for displaying the complex number as a string
    public void displayString(String str) {
        System.out.println("String: " + str);
    }
}
