package utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class CSV {

    public static List<String[]> read(String file) {
        List<String[]> list = new LinkedList<String[]>();
        String infoRow;
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            while ((infoRow = br.readLine())!=null){
                String[] infoNodes = infoRow.split(",");
                list.add((infoNodes));
            }

        } catch (FileNotFoundException e){
            System.out.println("COULD NOT FIND FILE");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("COULD NOT READ FILE");
            e.printStackTrace();
        }


        return list;
    }
}
