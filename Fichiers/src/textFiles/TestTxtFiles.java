package textFiles;

import java.awt.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collection;

public class TestTxtFiles {

	public static void main(String[] args) throws IOException {
		
	File filsrc = new File("source.txt"); //fichier source
    FileReader fr = new FileReader(filsrc); //la lecteure du fichier
    InputStream in = new FileInputStream(filsrc);
    Reader instreader = new InputStreamReader(in);
    int data = instreader.read();
    while(data != -1){
        char theChar = (char) data;
        data = instreader.read();
        System.out.println(data);
    }
    instreader.close();
    
	}

}
