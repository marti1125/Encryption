package simple;

/**
 * Created by willy on 21/06/17.
 */
public class Cesar {

    public Cesar(){
    }

    public String encryption(String text, int position) {
        System.out.print("Original Word ==>" + text);
        System.out.println("\n");
        String alphabet="abcdefghijklmnñopqrstuvwxyz";
        String textoToEncrypt = text.trim().replaceAll("\\s+","");
        StringBuilder encryptText = new StringBuilder();
        for (char c : textoToEncrypt.toLowerCase().toCharArray()) {
            int p = alphabet.indexOf(c)+position;
            if( (position / alphabet.length()) >= 2){
                int divide = Math.abs(position / alphabet.length());
                int post = divide * 27;
                p = Math.abs(post + alphabet.indexOf(c) - position);
            }
            if((alphabet.indexOf(c) + position) > 26 && position < 53) {
                if((alphabet.indexOf(c) + position) > 53) {
                    p = Math.abs((alphabet.indexOf(c)+position) - 54);
                } else {
                    p = Math.abs((alphabet.indexOf(c)+position) - 27);
                }
            }
            System.out.println("New positions ==>" + p);
            encryptText.append(alphabet.charAt(p));
        }
        System.out.println("Result ==>" + encryptText.toString());
        System.out.println("\n");
        return encryptText.toString();
    }

    public String desencryption(String text) {
        String textoToDesEncrypt = text.trim().replaceAll("\\s+","");
        String alphabet="abcdefghijklmnopqrstuvwxyz";
        for(int i = 26; i >= 0; i--) {
            System.out.println("ROT"+i);
            for(char c : textoToDesEncrypt.toLowerCase().toCharArray()) {
                if(alphabet.indexOf(c)-i < 0){
                    System.out.print( alphabet.charAt( Math.abs(26 + (alphabet.indexOf(c)-i))) );
                } else {
                    System.out.print( alphabet.charAt( Math.abs(alphabet.indexOf(c)-i)) );
                }
            }
            System.out.println("\n");
        }
        return "";
    }

    public String desencryptionSpanish(String text) {
        String textoToDesEncrypt = text.trim().replaceAll("\\s+","");
        String alphabet="abcdefghijklmnñopqrstuvwxyz";
        for(int i = 26; i >= 0; i--) {
            System.out.println("ROT"+i);
            for(char c : textoToDesEncrypt.toLowerCase().toCharArray()) {
                if(alphabet.indexOf(c)-i < 0){
                    System.out.print( alphabet.charAt( Math.abs(27 + (alphabet.indexOf(c)-i))) );
                } else {
                    System.out.print( alphabet.charAt( Math.abs(alphabet.indexOf(c)-i)) );
                }
            }
            System.out.println("\n");
        }
        return "";
    }

}
