import java.util.HashMap;

public class roman_to_integer {
    public static void main(String[] args) {
        int arr[]={3,2,5,1,2,2,5,3,2,3};
        HashMap<Integer,Integer> mp=new HashMap<>();

        for(int ele: arr)
        {
            if(mp.containsKey(ele)) {
                mp.put(ele,mp.get(ele)+1);
            }
            else
            {

                mp.put(ele,1);
            }
            System.out.println(mp);

        }
        int maxkey=-1;
        int  maxfreq=0;

//        for(var e:mp.entrySet())
//        {
//            if(e.getValue()>maxfreq)
//            {
//                maxfreq=e.getValue();
//                maxkey=e.getKey();
//
//            }
//        }

        for (var key :mp.keySet()) {
            if(mp.get(key)>maxfreq)
            {
                maxfreq=mp.get(key);
                maxkey=key;
            }

        }

        System.out.println(maxkey+" "+maxfreq);






    }
}
