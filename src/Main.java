import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Integer a = 127, b = 127;
        Integer c = 128, d = 128;
        System.out.println(a == b); // true
        System.out.println(a.equals(b));//true
        System.out.println(c.equals(d)); // true
        System.out.println(c == d);//false
        // -128-127 arasinda deyer ucun avtomatik avtoboxing edir amma 127 den boyuk olduqda  yeni integer obyekt yaradir


        //String inputun polindrome olub olmamasini yoxlayin
        String input = "Laman";
        String reverse = new StringBuilder(input).reverse().toString();
        System.out.println(input.equals(reverse));


        // Sətri tərsinə çevir ("hello" → "olleh")
        String str = "hello";
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);

        }
        System.out.println(result);
        //Anagram yoxlaması ("listen" və "silent")
        String str1 = "listen";
        String str2 = "silent";
        if (str1.length() != str2.length()) {
            System.out.println("not anagram");

        }

        char[] arr1 = str1.toLowerCase().toCharArray();
        char[] arr2 = str2.toLowerCase().toCharArray();


        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if ((Arrays.equals(arr1, arr2))) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }


        //Sözlərin sırasını tərsinə çevir
        String str3 = "I love Java";
        String result1 = "";
        String[] words = str1.split(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            result1 += words[i] + " ";
        }
        System.out.println(result1);

        // Təkrarlanan simvolları tap və say ("programming" → r=2, g=2, m=2)
        String str4="programming";
        int[] array=new int[100];

        for(int i=0;i<array.length;i++)
        {
            char m = str4.charAt(i);
            array[m]++;
        }

        for (int i = 0; i < str4.length(); i++) {
            char m = str4.charAt(i);
            if (array[c] > 1) {
                System.out.println(c + "=" + array[c]);
                array[c] = 0;

            }
        }


         // Hər sözün ilk hərfini böyük et ("salam dunya" → "Salam Dunya")
        String text = "salam dunya";
        String[] text1 = text.split(" ");
        String result2 = "";

        for (int i = 0; i < words.length; i++) {
            String word = text1[i];
            if (!word.isEmpty()) {
                result2 += word.substring(0, 1).toUpperCase() + word.substring(1);
            }
            if (i < words.length - 1) {
                result2 += " ";
            }
        }

        System.out.println(result);

   



    }
}
