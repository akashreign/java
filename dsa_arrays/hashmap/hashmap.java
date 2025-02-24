package hashmap;

import java.util.HashMap;
import java.util.Map;

public class hashmap {
    public static void main(String[] args)
    {

        Map<String,Integer> mp=new HashMap<>();
        mp.put("Ananya",57);
        mp.put("shiva",68);
        mp.put("rahul",57);
        mp.put("Ananya",78);
        mp.put("Akash",87);
        mp.put("ravi",28);


        System.out.println(mp.values());

        for(var e:mp.keySet())
        {

            System.out.println(mp.get(e)+" "+e);



        }



    }
}
