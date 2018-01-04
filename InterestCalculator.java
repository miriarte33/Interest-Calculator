//Created by Manrique Iriarte
//Date: 1/4/18
//Good representation about how to use JOptionPane to create a GUI

import javax.swing.JOptionPane;

public class InterestCalculator {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Welcome to the Simple Interest Calculator!");
        String p = JOptionPane.showInputDialog("Enter the principal amount for the loan");
        String r = JOptionPane.showInputDialog("Enter the annual interest rate (%)");
        String t = JOptionPane.showInputDialog("Enter the amount of time for the loan in years");
        
        //convert all these strings to doubles
        double principal = Double.parseDouble(p);
        double rate = Double.parseDouble(r)/100;
        double time = Double.parseDouble(t);
        double interest = principal * rate * time;
        
        JOptionPane.showMessageDialog(null, "The Interest is: " + interest + "$","Simple Interest Calculator", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "The total cost will be: " + (interest + principal) + "$", "Simple Interest Calculator", JOptionPane.PLAIN_MESSAGE);
    }
    
}
