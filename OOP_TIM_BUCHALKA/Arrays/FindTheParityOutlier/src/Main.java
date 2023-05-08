public class Main {
    public static void main(String[] args) {
        String pin = "4233221";
        System.out.println(checkPin(pin));
    }
    public static boolean checkPin(String pin) {
        if(pin.length() == 4 || pin.length() == 6) {
            try {
                Integer.parseInt(pin);
                return true;
            } catch (Exception e) {
                return false;
            }
        }
        return false;
    }
}