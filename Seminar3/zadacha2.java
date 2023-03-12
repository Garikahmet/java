// Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
// Вывести название каждой планеты и количество его повторений в списке.

package Seminar3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class zadacha2 {
    public static void main(String[] args) {
        // решение 1
    //     String[] solarSystem1 = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
    //     ArrayList<String> solarSystemRes = new ArrayList<String>();
    //     Random rnd = new Random();
    //     for (int i = 0; i < 20; i++) {
    //         solarSystemRes.add(solarSystem1[rnd.nextInt(0,7)]);
    //     }
    // System.out.println(solarSystemRes);
    // for (int i = 0; i < solarSystem1.length; i++) {
    //     System.out.printf("%s встречается %d раз \n",solarSystem1[i],Collections.frequency(solarSystemRes, solarSystem1[i]));
    
        // решение 2

        // String[] planets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto"};
        // List<String> planetList = new ArrayList<>();
        // Random random = new Random();
        // for (int i = 0; i < 20; i++) {
        //     int index = random.nextInt(planets.length);
        //     planetList.add(planets[index]);
        // }
        // Map<String, Integer> planetCounts = new HashMap<>();
        // for (String planet : planetList) {
        //     Integer count = planetCounts.get(planet);
        //     if (count == null) {
        //         planetCounts.put(planet, 1);
        //     } else {
        //         planetCounts.put(planet, count + 1);
        //         }
        //     }
        // for (String planet : planetCounts.keySet()) {
        //     int count = planetCounts.get(planet);
        //     System.out.println(planet + ": " + count);
        // }

    // решение 3
    ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList("Venera", "Saturn", "Venera", "Mars", "Jupiter", "Earth", "Earth"));
    arrayList.sort(Comparator.naturalOrder());
    int count = 1;
    for (int i = arrayList.size()-1; i > 0 ; i--) {
        if (arrayList.get(i).equals(arrayList.get(i-1))){
            count++;
        }
        else {
            System.out.println(arrayList.get(i) + " повторяется " + count + " раз.");
            count = 1;
        }
    
    }
    System.out.println(arrayList.get(0) + " повторяется " + count + " раз.");
    }
}  
