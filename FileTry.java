
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;


public class FileTry {

	public static void main(String[] args) {
		FileInputStream fis = null;
        BufferedReader reader = null;
      
        try {
            fis = new FileInputStream("D:/assignment_2.txt");
            reader = new BufferedReader(new InputStreamReader(fis));
          
            System.out.println("Reading File line by line ");
          
            String line = reader.readLine();
            while(line != null){
                System.out.println(line);
                line = reader.readLine();
            }           
          
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileTry.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileTry.class.getName()).log(Level.SEVERE, null, ex);
          
        } finally {
            try {
                reader.close();
                fis.close();
            } catch (IOException ex) {
                Logger.getLogger(FileTry.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
	}
}


	

