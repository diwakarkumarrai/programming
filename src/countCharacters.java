class countCharacters {
    public static void main(String[] args) {
        String str = "Hello DK Welcome to Java";

        // Remove all white spaces
        String noSpace = str.replaceAll("\\s", "");

        // Count characters
        int count = noSpace.length();

        System.out.println("Original String: " + str);
        System.out.println("After removing spaces: " + noSpace);
        System.out.println("Total characters (without spaces): " + count);
    }
}