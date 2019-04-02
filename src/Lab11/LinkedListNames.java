package Lab11;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListNames {


    public static void main(String[] args) {

        List<String> names = new LinkedList<>();

        names.add("Kay");
        names.add("Jay");
        names.add("May");
        names.add("Fay");

        ListIterator<String> iterator = names.listIterator();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.add("Ray");

        iterator.previous();
        iterator.previous();
        iterator.previous();
        iterator.remove();

        while(iterator.hasNext())
        {
            String name = iterator.next();
            System.out.println("Names from the start: \n" + name);
        }

        System.out.println("\n==================\n");

        for(String name : names)
        {
            name = iterator.previous();
            System.out.println("Name From the end: \n" + name);
        }




        /*if(iterator.hasPrevious())
        {

            System.out.println("Names from the end: \n" + ((LinkedList<String>) names).getLast());

        }*/






    }

}
