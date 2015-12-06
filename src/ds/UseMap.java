package ds;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by rrt on 12/6/2015.
 */
public class UseMap {

    public static void main(String[] args) {
        Map<String, String>  map = new LinkedHashMap<String,String>();
        map.put("UK", "London");
        map.put("Australia", "Sydney");
        map.put("USA", "New York");
        map.put("Germany", "Berlin");
        //for each loop
        for(Map.Entry<String,String> st:map.entrySet()){
            System.out.println(st.getKey()+" ------> "+ st.getValue().toUpperCase());
        }
        //Iterator to retrieve data from the Map
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
          while(it.hasNext()){
              System.out.println(it.next().toString().toUpperCase());
          }

    }
}
