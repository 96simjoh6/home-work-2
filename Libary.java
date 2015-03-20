import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JTextArea;

/**
 *
 * @author 96simjoh6
 * Last update: 2015-03-18
 */

public class Libary {
    
    ArrayList<AbstractClass> list;
    public String file_name;
    public AbstractClass a = null;
    
    public Libary(){
        list = new ArrayList<>();
    }
    
    public void readFile(JTextArea txa_main, String file_name){ //Reads the file you've selected in GUI
        txa_main.setText("");                                   //With the use of split and trim removes the "," and makes it only one word
        list.clear();                                           //for example Song:,name,(...) is then Song:
                                                                //With use of a switch case which checks from the first Split (Song: or Movie:)
                                                                //Makes it to a new object and then saves it away in the list with right order e.t.c.
            try (BufferedReader readFile = new BufferedReader(new FileReader(file_name))){
                String data = readFile.readLine();
                if(data == null){
                    System.out.println("File not Valid");
                }else{
                    while(data != null){
                        String [] split = data.split(",");
                        for(int i = 0; i < split.length; i++){
                            split[i] = split[i].trim();
                        }
                        switch (split [0]) {
                            case "Song:":
                                a = new Song(split[1], split[2], Integer.parseInt(split[3]));  
                                list.add(a);  
                                break;
                            case "Movie:":
                                a = new Movie(split[1], split[2], Integer.parseInt(split[3]));
                                list.add(a);
                                break;
                        }
                            data = readFile.readLine();
                    }
                    readFile.close();
                    Collections.sort(list);

                    for(AbstractClass b : list){
                        txa_main.append(b.toString() + "\n");
                        }
                }
            }   
        catch(IOException e){System.out.print("Something Went Wrong.");}
    }
    
    public void newLine(int i, String name, String author, int grade){ //int i is from GUI, determines if it's a song or movie and creates the object.
        switch (i){                                                    //Then adds it to list.
            case 1:
                a = new Song(name,author,grade);
                break;
            case 0:
                a = new Movie(name,author,grade);
                break;
        }
        list.add(a);
    }
    
    public void saveLine(String file_name){ //Writes the list to file, file_name gets sent here from GUI.
            try{                            //file_name determines what location to save at, and the filename itself.
                    FileWriter writeFile1 = new FileWriter(file_name) ; 
                    BufferedWriter write = new BufferedWriter(writeFile1);
                    PrintWriter writeFile = new PrintWriter(write);
                    
                    for(AbstractClass b : list){
                        writeFile.println(b.toString());
                    }
                    writeFile.close();
            
                    }catch(IOException e){System.out.println("Something Went Wrong.");
        }
    }
    
    public void updateWind(JTextArea txa_main){ //Simple function which gets call from the button "btn_update" in GUI
            txa_main.setText("");               //Then updates the JTextArea if you for example added a new line in List.
            Collections.sort(list);
            for(AbstractClass b : list){
                txa_main.append(b.toString() + "\n");
            }
    }
}
