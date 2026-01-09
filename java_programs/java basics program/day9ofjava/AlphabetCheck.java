class AlphabetCheck {
    public static void main(String[] args) {
        char ch1 = 'a';
        char ch2 = 'G';
        char ch3 = '6';
        char ch4 = '#';

        checkAlphabet(ch1);
        checkAlphabet(ch2);
        checkAlphabet(ch3);
        checkAlphabet(ch4);
    }

    public static void checkAlphabet(char ch) {
        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            System.out.println(ch + " is an alphabet");
        } else {
            System.out.println(ch + " is not an alphabet");
        }
    }
}
