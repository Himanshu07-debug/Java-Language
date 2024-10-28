import java.util.*;

public class Lists {
    
    // Theory :

    // LISTS ---------------->>
    
    // 1. Lists are collections that maintain their ele in order and can contain duplicates.
    // 2. ele in list are ordered
    // 3. Ele are position based, starting from index 0.

    // IMPLEMENTATION OF LIST INTERFACE ------->>>
    
    // 1. ArrayList
    // 2. LinkedList
    // 3. Vector

    // ARRAYLIST
    
    // 1. Its a dynamic array
    // 2. Used when size is unknown of the array.
    // 3. When size increases, and its double its size, older array is garbage collected in the next garbage collection.

    // VECTOR

    // 1. Vector class is a legacy class which implements the list interface.
    // 2. Same like Arraylist
    // 3. The difference with ArrayList is that it is Thread-Safe, meaning that concurrent calls to the vector will not compromise its integrity.
    // 4. Vectors suffers a slight performance penalty due to synchronization.

    // LINKED LIST

    // 1. The implementation uses a DLL. It also implements the Deque interface alongwith List
    // 2. insertion and deletions in DLL are very efficient. Directly by pointer.


    // ARRAYLIST vs LINKEDLIST

    // 1. Position based access has constant time performance for the Arraylist and vector classes
    // 2. Position based access is linear time for a Linked List
    // 3. frequent insertions and deletions --> LinkedList > ArrayList
    // 4. Overall, ArrayList is the best choice for implementing lists.


    public static void main(String[] args) {

        List<Integer> lst = new ArrayList<>();

        // addition
        lst.add(1);
        lst.add(2);
        lst.add(3);

        // updation
        lst.set(1, 100);

        // to get the position index
        System.out.println(lst.indexOf(100));

        // set() returns the value that is replaced
        System.out.println("Element updated is " + lst.set(2, 200));

        // printing in a single line
        System.out.println(lst);

        for(int x : lst){
            System.out.print(x + " ");
        }

        System.out.println();

        // creating a new list from the other list
        List<Integer> lst2 = new ArrayList<>(lst);

        lst2.add(5);

        System.out.println(lst2);

        List<Integer> lst3 = new ArrayList<>();

        lst3.add(1);
        lst3.add(2);
        lst3.addAll(lst2);

        lst3.add(2);

        System.out.println(lst3.lastIndexOf(2));

        
        // sublist --> Remember, new list nhi bnti.. sirf view rhta hai orginal ka.. so changes in this will reflect in the original one also
        List<Integer> sub = lst2.subList(1, 3);

        System.out.println(sub);

        sub.set(0, 1000);  // 0th index of sublist

        System.out.println(lst2);


    }

}
