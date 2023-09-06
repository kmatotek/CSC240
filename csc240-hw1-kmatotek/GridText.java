import java.util.Scanner;
import java.util.ArrayList;
public class GridText {
    public ArrayList<String> gridText = new ArrayList<String>(); 
    public static void main(String[] args){

    }
    public GridText(String source, String delimiter){
        gridText = new ArrayList<>();
        String[] result = source.split(delimiter);
        for(String line : result){
            gridText.add(line);
        }
    }
    public GridText(Scanner source, int numLines){
        gridText = new ArrayList<>();
        int count = 0;
        while(source.hasNextLine() && count < numLines){
            gridText.add(source.nextLine());
            count++;
        }

    }
    public int numRows(){
        return gridText.size();
    }
    public int length(int row){
        if(row >= 0 && row < gridText.size()){
           return gridText.get(row).length();
        }
        return 0;
    }
    public Character at(int row, int col){
        if(row >= 0 && row < gridText.size()){
            String line = gridText.get(row);
            if(col >= 0 && col <= line.length()){
                return line.charAt(col);
            }
        }
        return null;
    }


}
