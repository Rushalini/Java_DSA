public class finalinstance {
    final int ID;
    finalinstance(){
        ID = 10;
    }                                           
    public static void main(String[] args) {
        finalinstance f = new finalinstance();
        System.out.println(f.ID);
        //f.ID = 20;//Exception final int id cannot be use again
    }
}
