//not recursion but in here anyways
//Write a program to reverse the lines of a file and also to reverse the order of the words in each line of the file. Use ArrayLists to help you.
import java.lang.reflect.Array;
import java.util.*;
import java.io.*;
public class ReverseWordsAndLines {
    public static void main (String[] args) throws FileNotFoundException {
        Scanner line = new Scanner(new File("src/Input"));
        PrintStream output = new PrintStream(new File("src/Output"));
        ArrayList<ArrayList<String>> document = new ArrayList<ArrayList<String>>();

        while (line.hasNextLine()) {
            ArrayList<String> words = new ArrayList<String>();
            document.add(words);
            Scanner word = new Scanner(line.nextLine());
            while (word.hasNext()) {
                words.add(word.next());
            }
        }

        for (int i = document.size() - 1; i >= 0; i--) {
            ArrayList<String> words = document.get(i);
            for (int j = words.size() - 1; j >= 0; j--) {
                output.print(words.get(j));
                if (j > 0) {
                    output.print(' ');
                }
            }
            if (i > 0) {
                output.println();
            }
        }
    }
}