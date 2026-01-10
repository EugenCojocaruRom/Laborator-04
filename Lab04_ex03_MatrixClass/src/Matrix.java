public class Matrix {
    //Declare bidimensional array of type double
    public double[][] array;
    //Declare size (unique, bc. square matrix, so length of line = height of column)
    public int size;

    //Set constructor for creating a matrix of size n x n
    public Matrix(int n) {
        //Set the size of line/column to n
        this.size = n;
        //Set the values of the matrix to n (for both lines and columns)
        this.array = new double[n][n];
    }

    //Set a value for a specific position in the array --> for setting the elements of the matrix
    public void arrElement(int x, int y, double value) {
        array[x][y] = value;
    }

    //Add 2 matrices (A + B = C)
    public Matrix add(Matrix m) {
        //Declare a variable of type matrix, with the size defined for the original one
        //It will hold the added elements of the 2 matrices
        Matrix sum = new Matrix(size);
        //Loop through each line of the matrix from i = 0 to the value of size, incrementing i by 1
        for (int i = 0; i < size; i++) {
            //Loop through each column of the matrix from j = 0 to the value of size, incrementing j by 1
            for (int j = 0; j < size; j++) {
                //Add the elements of the 2 matrices
                sum.array[i][j] = this.array[i][j] + m.array[i][j];
            }
        }
        //Return the value of the sum matrix
        return sum;
    }

    //Multiply 2 matrices (A * B = C)
    public Matrix multiply(Matrix m) {
        //Declare a variable of type matrix, with the size defined for the original one
        //It will hold the multiplied elements of the 2 matrices
        Matrix product = new Matrix(size);
        //Loop through the lines of the original matrix from i = 0 to the value of size, incrementing i by 1
        for (int i = 0; i < size; i++) {
            //Loop through the columns of the m matrix from j = 0 to the value of size, incrementing j by 1
            for (int j = 0; j < size; j++) {
                //Loop through the 'product' matrix from k = 0 to the value of size, incrementing k by 1
                for (int k = 0; k < size; k++) {
                    //Add the results to the product matrix
                    product.array[i][j] += this.array[i][k] * m.array[k][j];
                }
            }
        }
        //Return the value of the product matrix
        return product;
    }

    //Method for  creating an Identity matrix (1's on the diagonal, 0's everywhere else)
    public static Matrix identity(int n) {
        //Declare variable of type matrix, with the size of the rows/column set to n
        Matrix id = new Matrix(n);
        //Loop through every row
        for (int i = 0; i < n; i++) {
            //Loop through every column
            for (int j = 0; j < n; j++) {
                //When the row index is equal to the column index
                if (i == j) {
                    //Set the value of the element to 1 (on the diagonal)
                    id.array[i][j] = 1;
                }
                else {
                    //Set the value of the element to 0 (everywhere else)
                    id.array[i][j] = 0;
                }
            }
        }
        //Return the matrix
        return id;
    }

    //Method for raising the matrix to a power ('x')
    public Matrix toPower(int x) {
        //If the power is 0
        if (x == 0) {
            //The returned value is that of the identity matrix
            return identity(size);
        }
        //Declare variable of type matrix and initialize it with the current matrix (i.e. this)
        Matrix array2 = this;
        //Loop for the number of time indicated by the value of the power (x), from i = 1
        for (int i = 1; i < x; i++) {
            //At each iteration, the current matrix is multiplied by the original matrix
            array2 = array2.multiply(this);
        }
        //Return the result (i.e. the array at power x)
        return array2;
    }

    //Method for displaying the matrix as a string
    @Override
    public String toString() {
        //Using StringBuilder - more efficient
        StringBuilder sb = new StringBuilder();
        //Loop through every row of the original matrix
        for (double[] row : array) {
            //Loop through every individual value from each row
            for (double value : row) {
                //Add each value to the string, in a formatted manner
                sb.append(String.format("%8.2f ", value));
            }
            //Add a 'new line' after each row (for nicer look of the matrix)
            sb.append("\n");
        }
        //Return the StringBuilder as a string, to be displayed
        return sb.toString();
    }
}
