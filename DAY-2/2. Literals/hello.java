class hello
{
    public static void main(String[] args) {
        byte b = 123;
        int a = b;

        int c = 2343;
        byte d =(byte)c;

        int result = c*b;

        // (byte)c in d variable will perform modular operation like 2343/256 and will show remainder in the console as result.

        System.out.println(a);
        System.out.println(d);
        System.out.println(result);
    }
}