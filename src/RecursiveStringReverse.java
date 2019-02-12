import javax.swing.*;

public class RecursiveStringReverse {

    public static String reverse(String str)
    {
        if ((str.length() <= 1)) {
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
        //Substring returns or takes away the number of character from a string
        //"Returns the substring starting from the specified index"
    }

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,reverse("Hello!"));
        JOptionPane.showMessageDialog(null,reverse("This is a long sentence."));
        JOptionPane.showMessageDialog(null,reverse("!olleH"));

    }




}
