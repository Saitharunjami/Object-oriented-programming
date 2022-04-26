//2)Write a program that implements the working of a Java SetInterface using HashSet Class- Create two sets- Add elements to both sets- Perform Union operation on these sets.
//CODE:

import java.util.Set;
import java.util.HashSet;
class Main {
    public static void main(String[] args) {
       Set<Integer> set1 = new HashSet<>();
       
       set1.add(3);
       set1.add(6);
       set1.add(7);
       set1.add(8);
       set1.add(9);

       System.out.println("Set1: "+set1);

       Set<Integer> set2 = new HashSet<>();

       set2.add(1);
       set2.add(4);
       set2.add(5);
       set2.add(6);
       set2.add(9);

       System.out.println("Set2: "+set2);
       
       // Union
       set2.addAll(set1);
       System.out.println("Union of the two sets is: "+ set2);
    }
}
