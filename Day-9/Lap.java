class Lap{
    private Lap{

    }
    
}
class Basic12 extends Lap{ //cant inherit class
    public static void main(String[] args) {
        Basic12 ob=new Basic12();
        Lap obj=new Lap(); //cannot create object from other class
    }
}