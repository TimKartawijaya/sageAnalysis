import java.lang.Runtime;
import java.io.IOException;

public class computeDriver {

    public static void main(String[] args){
        System.out.println("running R");
        String cmd = "RScript " + "/Users/TimGimi/sage/rAnalysis/wildAnalysis/computeWild.R";
        try {
        		Runtime.getRuntime().exec(cmd); 
        } catch (IOException e) {
        		System.out.println("No such file.");
        }
        
    }
}
