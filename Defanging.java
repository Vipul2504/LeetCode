public class Defanging {
    public static void main(String[] args) {
        String address = "255.100.50.0";
        String ans = DefangingIpAdd(address);
        System.out.println(ans);
        System.out.println(ans);
    }

    private static String DefangingIpAdd(String address) {
        return address.replace(".", "[.]");
    }
}
