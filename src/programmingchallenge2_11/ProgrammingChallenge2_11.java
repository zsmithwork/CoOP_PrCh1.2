package programmingchallenge2_11;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class ProgrammingChallenge2_11 {

    public static void main(String[] args) {
        String retpr_str;
        double retpr = 0, profmar = 0.4, profit;
        DecimalFormat form = new DecimalFormat("###.##");
        
        retpr_str = JOptionPane.showInputDialog("Enter circuit board retail price:");
        retpr = Double.parseDouble(retpr_str);
        profit = retpr * profmar;
        
        System.out.println("Profit from circuit boards: " + form.format(profit));
    }
}
