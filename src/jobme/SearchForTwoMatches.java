package jobme;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class SearchForTwoMatches {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fr = new BufferedReader(new FileReader(br.readLine()));
        br.close();
        String s = "";
        while (fr.ready()){
            int count =0;
            s = fr.readLine();
//            System.out.println(s);
            String[] ss = s.split(" ");
            for(String f : words){
                for(String g : ss){
                    if(f.equals(g)){
                        count +=1;
                    }
                }
            }
//            System.out.println(count);

            if(count ==2){
                System.out.println(s);
            }
        }
        fr.close();

    }
}
