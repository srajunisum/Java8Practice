import java.io.*;

public class FileIO {

    public static void main(String[] args) {


        StringBuilder sb=new StringBuilder();
        BufferedReader br=null;

        try{
            FileReader file = new FileReader("C:/Users/Raju/Documents/Doc/test.txt");
            FileInputStream fileInputStream = new FileInputStream("C:/Users/Raju/Documents/Doc/test.txt");
            StringBuilder stringBuilder = new StringBuilder();
            br=new BufferedReader(new InputStreamReader(fileInputStream));
            String line=null;
            while((line = br.readLine()) != null)
            {
                sb.append(line);
            }
        }catch(Exception ex){
            //
        }finally{
        }
        System.out.println(sb.toString());





    }
}
