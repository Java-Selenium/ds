package ds;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rrt on 12/6/2015.
 */
public class UseList {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("LA");
        list.add("NY");
        list.add("FL");

        for(String st:list){
            System.out.println(st);
        }
    }
}
