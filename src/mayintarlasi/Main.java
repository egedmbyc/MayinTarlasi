package mayintarlasi;

import java.io.*;
import javax.swing.*;
import java.awt.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MayinTarlasi oyun = new MayinTarlasi();
		
		
		Frame f = new Frame();

        // Button 1 created
        // OK button
        Button b1 = new Button("Ege DOMBAYCI");
        b1.setBounds(100, 50, 300, 100);
        f.add(b1);

        // Button 2 created
        // Submit button
        Button b2 = new Button("233 405 102");
        b2.setBounds(100, 150, 300, 100);
        f.add(b2);
      
        // Button 3 created
        // Cancel button
        Button b3 = new Button("Mayın Tarlası Oyun Projesi");
        b3.setBounds(100, 250, 300, 100);
        f.add(b3);

        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
        
		
		
		
	}

}
