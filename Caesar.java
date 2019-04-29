
public class Caesar {

    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    public static String encrypt(String msg, int shiftKey) {
        msg = msg.toLowerCase();
        String result = "";
        for (int i = 0; i < msg.length(); i++) {
            if (msg.charAt(i) >= 'a' && msg.charAt(i) <= 'z') {
                int charPosition = ALPHABET.indexOf(msg.charAt(i));
                int keyValue = (shiftKey + charPosition) % 26;
                char replaceValue = ALPHABET.charAt(keyValue);
                result += replaceValue;
            }
        }
        return result;
    }

    public static String decrypt(String msg, int shiftKey) {
        msg = msg.toLowerCase();
        String result = "";

        for (int i = 0; i < msg.length(); i++) {

            int charPosition = ALPHABET.indexOf(msg.charAt(i));
            int keyValue = (charPosition - shiftKey) % 26;
            if (keyValue < 0) {
                keyValue = ALPHABET.length() + keyValue;
            }
            char replaceValue = ALPHABET.charAt(keyValue);
            result += replaceValue;
        }
        return result;
    }

    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Enter a string for encryption");
        String msg = input.nextLine();
        System.out.println(encrypt(msg, 5));
        System.out.println(decrypt(encrypt(msg, 5), 5));
        input.close();
    }
}