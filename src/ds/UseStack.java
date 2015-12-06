package ds;

import java.util.Iterator;
import java.util.Stack;

/**
 * Created by rrt on 12/6/2015.
 */
public class UseStack {

    public static void main(String[] args) {
        Stack<String> list = new Stack<String>();

        list.push("LA");
        list.push("Phonix");
        list.push("Kansan");
        for(int i=0; i<=list.size()+1; i++){
                 System.out.println(list.pop());
        }

    }
}
