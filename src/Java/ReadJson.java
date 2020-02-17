import jdk.nashorn.internal.objects.Global;
import jdk.nashorn.internal.parser.JSONParser;


import java.io.*;
import java.util.function.Function;

public class ReadJson {
    public static void main(String args[]) {
        /*      //String source, Global global, boolean dualFields
        //C:/Users/Raju/Documents/Doc/test.txt
        JSONParser jsonParser = new JSONParser("D:/test.json", Global.instance(),true);
        jsonParser.parse();*/

        JSONParser  json = new JSONParser("", Global.instance(),true );
        Object parseObj = json.parse();




        try {
            FileReader file = new FileReader("D:/test.json");
            FileInputStream fileInputStream = new FileInputStream("C:/Users/Raju/Documents/Doc/test.txt");


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}
