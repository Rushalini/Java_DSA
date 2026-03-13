import java.util.Vector;

public class VectorMethods {
    public static void main(String[] args) {
        Vector<Integer> al=new Vector<Integer>();
        // Vector<Integer> al=new Vector<>();
        al.add(12);
        al.add(53);
        al.add(77);
        al.add(96);
        System.out.println(al);//[12, 53, 77, 96]
        System.out.println(al.indexOf(53));//1
        System.out.println(al.set(1,78));//53
        System.out.println(al.get(1));//78
        System.out.println(al.isEmpty());//false
        System.out.println(al.contains(77));//true
        System.out.println(al.toString());//[12, 78, 77, 96]
        System.out.println(al);//[12, 78, 77, 96]
        System.out.println(al.remove(0));//12
        System.out.println(al);//[78, 77, 96]
    }
}
