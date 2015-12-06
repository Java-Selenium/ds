package ds;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;


/**
 * Created by rrt on 12/6/2015.
 */
public class UseQueue {
    public static void main(String[] args) {

        Queue<String> line = new LinkedList<String>();
        line.add("LA");
        line.add("Phoneix");
        line.add("Kansas");

        Iterator it = line.iterator();


        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.print(line.peek());
    }
}
