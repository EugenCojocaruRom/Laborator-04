public class IntSet {
    //Declare the array that will store the numbers of type integer
    public int[] numbers;
    //Declare variable to count the number of elements in the set
    public int count;

    //Constructor with 1 argument (size of array)
    public IntSet(int size) {
        //Initialize the array with the size provided
        numbers = new int[size];
        //Initialize the element counter
        count = 0;
    }

    //Check whether a specific number is in the array or not
    public boolean contains(int value) {
        //Loop through the number of elements (count) from i = 0 to the value of count, incrementing i by 1
        for (int i = 0; i < count; i++) {
            //Compare each number from the array with the given value
            if (numbers[i] == value) {
                //Return true if the 2 values match
                return true;
            }
        }
        //Return false in case there is no match (the number is not in the array)
        return false;
    }

    //Add element to the array if it does not exist
    public void add(int num) {
        //Check whether the number is in the array and the counter value is smaller than the array size
        //This also prevents displaying duplicates
        if (!contains(num) && count < numbers.length) {
            //The new number is placed at the first available position in the array
            numbers[count] = num;
            //Increment the counter
            count++;
        }
    }

    //Method for displaying the integer set as a string
    @Override
    public String toString() {
        //Declare StringBuilder and initialize it to "{"
        StringBuilder sb = new StringBuilder("{");
        //Loop from i = 0 to the value of 'count', so that any empty zeros at the end of the array are not displayed
        for (int i = 0; i < count; i++) {
            //Add each number (that qualifies) from the array to the StringBuilder
            sb.append(numbers[i]);
            //Add a comma and a space after each number, except after the last one
            if (i < count - 1) {
                sb.append(", ");
            }
        }
        //Add final "}" at the end of the StringBuilder
        sb.append("}");
        //Return the StringBuilder as a string
        return sb.toString();
    }
}
