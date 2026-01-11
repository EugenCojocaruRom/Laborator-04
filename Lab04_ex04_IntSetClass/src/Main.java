public class Main {
    public static void main(String[] args) {

        //Declare a set of integers (size 10), add some values and call the 'toString', 'add' and 'contains' methods
        IntSet mySet = new IntSet(10);
        mySet.add(5);
        mySet.add(10);
        mySet.add(15);
        mySet.add(5); // Duplicate - should not be added
        mySet.add(20);

        System.out.println("Set content: " + mySet.toString());
        System.out.println("Contains 10? " + mySet.contains(10));
        System.out.println("Contains 7? " + mySet.contains(7));
    }
}