/**
 * @author Donny (1972027)
 */

import java.util.regex.*;
public class ConverterCalculator {
    private static String binRegex = "\\A[01]+\\z";

    public static String convertToBinary (int number){
        return coreConverterFromDecimal(number,2);
    }
    public static String convertToHexa(int number){
        return coreConverterFromDecimal(number,16);
    }
    public static String convertToOctal(int number){
        return coreConverterFromDecimal(number,8);
    }
    public static int convertBinaryToDecimal(String number){
        return coreConverterToDecimal(number,2);
    }
    public static int convertHexaToDecimal(String number){
        return coreConverterToDecimal(number,16);
    }
    private static String coreConverterFromDecimal(int number, int radix){
        StringBuilder sb = new StringBuilder();
        int cek = 0;
        int henti;
        char hexchars[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        while(number > 0)
        {
            //append untuk menambahkan sebuah elemen baru tanpa harus menyertakan element tersebut di tag HTML.
            if (cek%4==0 && radix == 2 ){
                sb.append(" ");

            }else if (cek%3 == 0 && radix == 8){
                sb.append(" ");
            }else if (cek%4==0 && radix == 16 ){
                sb.append(" ");
            }
            if (radix == 16){
                henti = number % 16;
                sb.append(hexchars[henti]);
                number = number / radix;
                cek++;
            }else {
                sb.append(number % radix);
                number = number / radix;
                cek++;
            }
        }
        return String.valueOf(sb.reverse());
    }
    private static int coreConverterToDecimal(String numberString, int radix){
        Pattern p = Pattern.compile(binRegex);
        Matcher m= p.matcher(numberString);
        numberString = numberString.toUpperCase();
        int temp = 0;
        if (!m.matches()){
            if (radix == 16){
                String digits = "0123456789ABCDEF";
                for (int i = 0; i < numberString.length(); i++)
                {
                    char c = numberString.charAt(i);
                    int d = digits.indexOf(c);
                    temp = (16 * temp) + d;
                }
            }
        }else if (m.matches()){
            if (radix == 2){
                double j = 0;
                for(int i=0;i<numberString.length();i++){
                    if(numberString.charAt(i)== '1'){
                        j = j + Math.pow(2,numberString.length()-1-i);
                    }
                }
                temp = (int)j;
            }
        }

        return temp;
    }
}
