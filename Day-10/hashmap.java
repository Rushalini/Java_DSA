import java.util.HashMap;
import java.util.Map;
public class hashmap {
    public static void main(String[] args) {
        HashMap<Integer,String> h=new HashMap<Integer,String>();
        h.put(1,"Ananth");
        h.put(2,"Ajith");
        h.put(3,"Rahul");
        h.put(2,"Gow");
        h.put(5,"Kevin");
        System.out.println(h.get(1));//Ananth
        System.out.println(h.get(3));//Rahul
        System.out.println(h.get(5));//Kevin
        System.out.println(h.get(2));//Gow

        // for (int i : h.keySet()) {
        //     System.out.println(i);//1\n2\n3\n5
        // }
        // for (String s:h.values()) {
        //     System.out.println(s);//Ananth\nGow\nRahul\nKevin
        // }
        // for (Map.Entry<Integer,String>es:h.entrySet()){
        //     System.out.println(es.getKey()+":"+es.getValue());//1:Ananth\n//2:Gow\n3:Rahul\n5:Kevin
        // }
        h.remove(2);
        System.out.println(h.containsKey(2));//false
        System.out.println(h.containsValue("Kevin"));//true
        System.out.println(h.size());//3
        h.clear();
        System.out.println(h.size());//0
        System.out.println(h.getOrDefault(7, "no key"));//no key
    }
}
