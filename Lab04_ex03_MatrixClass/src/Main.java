public class Main {
    public static void main(String[] args) {
        //Declare new matrix
        Matrix testMatrix = new Matrix(2);
        testMatrix.arrElement(0, 0, 1);
        testMatrix.arrElement(0, 1, 2);
        testMatrix.arrElement(1, 0, 3);
        testMatrix.arrElement(1, 1, 4);
        //Call the 'square' method
        System.out.println("The original matrix is:\n" + testMatrix);
        System.out.println("The matrix squared is:\n" + testMatrix.toPower(2));
    }
}
