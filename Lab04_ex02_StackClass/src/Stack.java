public class Stack {
    //Declare array of ints
    public int[] elements;
    //Declare variable of type int for the element at the top of the stack
    public int top;

    //Constructor without parameters - default size 100
    public Stack() {
        //Calls the other constructor, with the value 100
        this(100);
    }

    //Constructor with a parameter (stack size)
    public Stack(int size) {
        //Set the number of the 'elements' array to the value 'size' of the stack
        elements = new int[size];
        //Set the stack as empty
        top = -1;
    }

    //Check if the stack is empty
    public boolean isEmpty() {
        //If the stack is empty, return -1
        return top == -1;
    }

    //Adding an element to the stack (push)
    public void Push(int num) {
        //Check if the stack is full
        if (top == elements.length - 1) {
            System.out.println("The stack is full. Cannot add " + num);
        }
        //Set the condition for adding an element to the stack
        else {
            //Add element at the top of the stack
            top++;
            //The top element gets the value of the int
            elements[top] = num;
        }
    }

    //Removing the element at the top of the stack
    public int Pop() {
        //Check if the stack is empty
        if (isEmpty()) {
            System.out.println("The stack is empty. Cannot remove any element.");
            //Return -1 to indicate that the 'pop' operation cannot be performed
            return -1;
        }
        //Set the condition for removing the top element
        else {
            //Declare variable of type int for the removed element and give it the value of the top element
            int removedNum = elements[top];
            //Decrement the value of top
            top--;
            //Return the value of the returned element
            return removedNum;
        }
    }

    //Main method for testing push and pop
    public static void main(String[] args) {
        //Declare stack and set the number of its elements to 5
        Stack myStack = new Stack(5);
        //Add (push) some elements to the stack
        myStack.Push(5);
        myStack.Push(13);
        myStack.Push(20);
        myStack.Push(47);
        myStack.Push(70);
        //Attempt to push extra element to get error message
//        myStack.Push(90);
        //Display message for empty (or not) stack
        System.out.println("Stack empty: " + myStack.isEmpty());
        //Display message for removed element (pop)
        System.out.println("Removed element: " + myStack.Pop());
        //Remove (pop) some elements from the stack
        myStack.Pop();
        myStack.Pop();
        myStack.Pop();
        myStack.Pop();
        //Attempt to pop extra element to get error message
//        myStack.Pop();

    }
}
