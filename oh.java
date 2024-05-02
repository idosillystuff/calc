import java.util.Scanner;
import javax.swing.JOptionPane; 

public class oh {
    double strokes; 
    double times; 
    double inches;
    static double result;
    static double miles; 

    public oh( double strokes,  double times, double inches){ 
        this.strokes = strokes; 
        this.inches = inches; 
        this.times = times; 
    }

    double calculation() { 
        result = strokes * times * inches;
        miles = result / 63360;
        return miles;  
    }

    public static void main(String [] args) { 
        String slut = JOptionPane.showInputDialog("Hi slut"); 
        String strokesInput = JOptionPane.showInputDialog("Enter strokes:");
        double strokes = Double.parseDouble(strokesInput);

        String timesInput = JOptionPane.showInputDialog("Enter times:");
        double times = Double.parseDouble(timesInput);

        String inchesInput = JOptionPane.showInputDialog("Enter inches:");
        double inches = Double.parseDouble(inchesInput);

        oh obj = new oh(strokes, times, inches); 
        double miles = obj.calculation(); // Call the calculation method to compute the result
        JOptionPane.showMessageDialog(null, "The result is: " + miles);
    }
}
