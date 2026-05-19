import java.security.SecureRandom;

public class RandomPasswordGenerator {

    private static final String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWER = "abcdefghijklmnopqrstuvwxyz";
    private static final String DIGITS = "0123456789";
    private static final String SPECIAL = "!@#$%^&*()-_+=<>?/";

    private static final String ALL_CHARS = UPPER + LOWER + DIGITS + SPECIAL;

    public static String generatePassword(int length) {
        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();

        // Ensure at least one character from each category
        password.append(UPPER.charAt(random.nextInt(UPPER.length())));
        password.append(LOWER.charAt(random.nextInt(LOWER.length())));
        password.append(DIGITS.charAt(random.nextInt(DIGITS.length())));
        password.append(SPECIAL.charAt(random.nextInt(SPECIAL.length())));

        // Fill remaining length randomly
        for (int i = 4; i < length; i++) {
            password.append(ALL_CHARS.charAt(random.nextInt(ALL_CHARS.length())));
        }

        // Shuffle the result so pattern is not predictable
        return shuffle(password.toString(), random);
    }

    private static String shuffle(String input, SecureRandom random) {
        char[] arr = input.toCharArray();

        for (int i = arr.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);

            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        return new String(arr);
    }

    public static void main(String[] args) {
        int length = 10; // you can change length
        String password = generatePassword(length);

        System.out.println("Generated Password: " + password);
    }
}