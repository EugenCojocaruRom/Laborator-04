public class Main {
    public static void main(String[] args) {

        System.out.println("Addition of complex numbers");
        Complex num1 = new Complex(5.5, 4); // First complex number (5.5 + 4i)
        Complex num2 = new Complex(1.2, 3.5); // Second complex number (1.2 + 3.5i)
        Complex sum = Complex.add(num1, num2); // Add the two numbers
        sum.displayAdd(); // Result (6.7 + i7.5)
        System.out.println("====================");

        //====================
        System.out.println("Multiplication of complex numbers");
        Complex num3 = new Complex(2, 4);
        Complex num4 = new Complex(3, 5);
        Complex product = Complex.multiply(num3, num4); //Multiply the 2 numbers
        product.displayMulti();
        System.out.println("====================");

        //====================
        System.out.println("Raise complex number to a natural power");
        Complex num5 = new Complex(4, 3);
        Complex power = Complex.toPower(num5, 5);
        power.displayComplexToPower();
        System.out.println("====================");

        //====================
        System.out.println("Check if two complex numbers are identical (Equals)");
        Complex num6 = new Complex(3, 4);
        Complex num7 = new Complex(3, 4);
        Complex num8 = new Complex(3, 5);
        boolean numbersAreEqual = num6.equals(num7);
        System.out.println("Is c1 equal to c2? - " + numbersAreEqual);
        System.out.println("Is c2 equal to c3? - " + num7.equals(num8));
        System.out.println("====================");

        //====================
        System.out.println("Display the complex number as a string (toString)");
        Complex num9 = new Complex(10.5, 4.8);
        String asString = num9.toString();
        num9.displayString(asString);
    }
}