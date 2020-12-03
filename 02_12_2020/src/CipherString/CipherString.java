package CipherString;

public class CipherString {
    private String str;

    public CipherString(String str) {
        this.str = str;
    }

    public String Ciphering() {
        String cipherStr = "";
        int positionElement = 0;
        int i = 0;
        while (i < str.length() - 1) {
            char element = str.charAt(positionElement);
            int count = 0;
            for (int j = positionElement; j < this.str.length(); j++) {
                if (element == str.charAt(j)) {
                    count++;
                    i = j;
                } else {
                    positionElement = j;
                    break;
                }
            }
            cipherStr += (count > 1 ? count + "" + element : element);
        }
        return cipherStr;
    }
}
