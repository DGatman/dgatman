package CW;

public class Cw3 {
    public static void main(String[] args) {
        System.out.println(isNumberExists("380637931850"));
    }
    static boolean isNumberExists(String phoneNumber){
        System.out.println(phoneNumber);
        String existingPhoneNumber = "380637931850";
        return existingPhoneNumber.equals(phoneNumber.trim());
    }
}
