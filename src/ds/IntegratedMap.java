package ds;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by rrt on 12/6/2015.
 */
public class IntegratedMap {

    public static void main(String[] args) {
        List<String> cityNameOfUSA = new ArrayList<String>();
        cityNameOfUSA.add("NY");
        cityNameOfUSA.add("LA");
        cityNameOfUSA.add("FL");
        cityNameOfUSA.add("Boston");
        cityNameOfUSA.add("Austin");
        cityNameOfUSA.add("Seattle");

        List<String> cityNameOfUK = new ArrayList<String>();
        cityNameOfUK.add("London");
        cityNameOfUK.add("manchester");
        cityNameOfUK.add("Birmingham");
        cityNameOfUK.add("Brighton");
        cityNameOfUK.add("Wells");

        List<String> cityNameOfAustralia = new ArrayList<String>();
        cityNameOfAustralia.add("Sydney");
        cityNameOfAustralia.add("Melbrone");
        cityNameOfAustralia.add("Cranbera");
        cityNameOfAustralia.add("Brisbone");
        cityNameOfAustralia.add("Perth");
        cityNameOfAustralia.add("New Catsle");

        List<String> cityNameOfBangladesh = new ArrayList<String>();
        cityNameOfBangladesh.add("Dhaka");
        cityNameOfBangladesh.add("Comilla");
        cityNameOfBangladesh.add("Barishal");
        cityNameOfBangladesh.add("Sylhet");
        cityNameOfBangladesh.add("Chittagonj");
        cityNameOfBangladesh.add("Feni");

        Map<String, List<String>> map = new HashMap<String, List<String>>();
        map.put("USA", cityNameOfUSA);
        map.put("UK", cityNameOfUK);
        map.put("Bangladesh", cityNameOfBangladesh);
        map.put("Australia", cityNameOfAustralia);

        for(Map.Entry<String, List<String>> city: map.entrySet()){

            System.out.println(city.getKey()+"----> "+ city.getValue());
        }

    }
}
