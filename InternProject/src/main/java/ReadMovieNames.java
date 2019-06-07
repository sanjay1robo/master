import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.FileHandler;

public class ReadMovieNames {


    public static void main (String args [])
    {

        try{

            ArrayList<String> arr = new ArrayList<String>();
            FileReader fr = new FileReader("/Users/coviam/Downloads/InternProject/MovieNames.csv");
            BufferedReader br = new BufferedReader(fr);
            String row;


            while((row = br.readLine()) != null) {
                arr.add(row);
            }

            Iterator i = arr.iterator();

            while (i.hasNext())
            {
                System.out.println(i.next());
            }

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

}
