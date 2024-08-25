public class Wrapper {
    public static void main(String[] args) {

        byte myByte = 100;

        Byte myBoxingByte = myByte;
        System.out.println(myBoxingByte); // auto unboxing

        short myShort = 10000;
        int myInt = 100_000_000;
        long myLong = 1000000000000000L; // ใส่ L ด้านหลังเพื่อระบุให้ compiler รู้ว่าเป็น long

        double myDouble = 10.00;
        float myFloat = 10.0f; // ใส่ โ ด้านหลังเพื่อระบุให้ compiler รู้ว่าเป้น float

        char myChar = 'D';

        boolean myBoo = true;
    }

    public static void parseTechnique (){
        // auto unboxing Integer (wrapper) => int (primitive)
        int opl1 = Integer.parseInt("444");
        int opl2 = Integer.parseInt("222");
    }

}

