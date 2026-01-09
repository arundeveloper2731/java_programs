class VowelConsonant {
    public static void main(String[] args) {
        char ch1 = 'a';
        char ch2 = 'i';
        char ch3 = 'z';

        checkVowelConsonant(ch1);
        checkVowelConsonant(ch2);
        checkVowelConsonant(ch3);
    }

    public static void checkVowelConsonant(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println(ch + " is a vowel");
        } else {
            System.out.println(ch + " is a consonant");
        }
    }
}
