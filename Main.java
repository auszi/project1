import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String [] args){

        ArrayList<String> a = new ArrayList<>();

        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("sample1.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
                a.add(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        for (int i = 0; i < a.size(); i++){
            System.out.println(a.get(i));
        }


    }
}
