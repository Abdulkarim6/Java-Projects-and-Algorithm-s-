class RemovesVowelsS38 {
    String str;
    String modifiedStr = "";

    void show() {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            char lch = Character.toLowerCase(ch);
            // ছোট এবং বড় হাতের ভাওল বাদ দাও
            if (lch == 'a' || lch == 'e' || lch == 'i' || lch == 'o' || lch == 'u') {
                continue;
            }
            modifiedStr = modifiedStr + ch;
        }
        System.out.println("Original: " + str);
        System.out.println("Without Vowels: " + modifiedStr);
    }
}

class Main {
    public static void main(String[] args) {
        RemovesVowelsS38 obj = new RemovesVowelsS38();
        obj.str = "My name is Karim";
        obj.show();
    }
}
