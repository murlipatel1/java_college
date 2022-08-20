public class Primitivedatasize {
    
    public static void main(String args[])
    {
        System.out.println(
            "S.No.   Data Type   Size   Min. Value    Max. Value ");
        System.out.println("1   Byte  " + Byte.SIZE
                           + "MIN " + Byte.MIN_VALUE
                           + "  MAX " + Byte.MAX_VALUE);
        System.out.println("2   Short  " + Short.SIZE
                           + "MIN " + Short.MIN_VALUE
                           + " MAX  " + Short.MAX_VALUE);
        System.out.println("3   Integer " + Integer.SIZE
                           + "MIN " + Integer.MIN_VALUE
                           + " MAX " + Integer.MAX_VALUE);
        System.out.println("4   Float  " + Float.SIZE
                           + " MIN" + Float.MIN_VALUE
                           + "  MAX " + Float.MAX_VALUE);
        System.out.println("5   Long  " + Long.SIZE
                           + " MIN" + Long.MIN_VALUE + " MAX"
                           + Long.MAX_VALUE);
        System.out.println("6   Double " + Double.SIZE
                           + " MIN" + Double.MIN_VALUE
                           + " MAX " + Short.MAX_VALUE);
        System.out.println("7   Character "
                           + Character.SIZE);
    }
}
