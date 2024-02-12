
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author H2O
 */
public class E_Hospital_health_checker extends javax.swing.JFrame {

     E_Hospital_health_checker() {
        JFrame f = new JFrame();//creating instance of JFrame  
         JLabel lb1 = new JLabel("Height(Meter):");
        lb1.setBounds(20, 20, 100, 40);//x axis, y axis, width, height
        f.add(lb1); //adding component in JFrame

        JLabel lb2 = new JLabel("Weight(KG):");
        lb2.setBounds(20, 60, 100, 40);//x axis, y axis, width, height
        f.add(lb2); //adding component in JFrame

         JLabel lb3 = new JLabel("Temperature(F):");
         lb3.setBounds(20, 100, 100, 40);//x axis, y axis, width, height
         f.add(lb3); //adding component in JFrame

         JLabel lb4 = new JLabel("BP (Low) :");
         lb4.setBounds(230, 140, 100, 40);//x axis, y axis, width, height
         f.add(lb4); //adding component in JFrame
         JLabel lb5 = new JLabel("BP (High) :");
         lb5.setBounds(20, 140, 100, 40);//x axis, y axis, width, height
         f.add(lb5); //adding component in JFrame
         JLabel lb6 = new JLabel("Overall Fitness Condition ");
         lb6.setBounds(200, 180, 150, 40);//x axis, y axis, width, height
         f.add(lb6); //adding component in JFrame

        JLabel lbResult = new JLabel("BMI Condition....");
        lbResult.setBounds(20, 220, 300, 40);//x axis, y axis, width, height
        f.add(lbResult); //adding component in JFrame

         JLabel tbResult = new JLabel("Body Temperature Condition....");
         tbResult.setBounds(20, 260, 300, 40);//x axis, y axis, width, height
         f.add(tbResult); //adding component in JFrame

         JLabel bpResult = new JLabel("Blood Pressure Condition....");
         bpResult.setBounds(20, 300, 300, 40);//x axis, y axis, width, height
         f.add(bpResult); //adding component in JFrame

         JTextField txtHeight = new JTextField("");
        txtHeight.setBounds(120, 20, 200, 40);//x axis, y axis, width, height
        f.add(txtHeight); //adding component in JFrame

        JTextField txtWeight = new JTextField("");
        txtWeight.setBounds(120, 60, 200, 40);//x axis, y axis, width, height
        f.add(txtWeight); //adding component in JFrame

         JTextField temperature = new JTextField("");
         temperature.setBounds(120, 100, 200, 40);//x axis, y axis, width, height
         f.add(temperature); //adding component in JFrame

         JTextField low = new JTextField("");
         low.setBounds(300, 140, 100, 40);//x axis, y axis, width, height
         f.add(low); //adding component in JFrame

         JTextField high = new JTextField("");
         high.setBounds(120, 140, 100, 40);//x axis, y axis, width, height
         f.add(high); //adding component in JFrame

        JButton btn = new JButton("Check your health Condition");//creating instance of JButton
        btn.setBounds(20, 330, 300, 40);//x axis, y axis, width, height

//        Event
        btn.addActionListener(e -> {
            double t=Double.parseDouble(temperature.getText());
            double weight=Double.parseDouble(txtWeight.getText());
            double height=Double.parseDouble(txtHeight.getText());
            int    l = Integer.parseInt(low.getText());
            int    h = Integer.parseInt(high.getText());

            if((l<70 || l>90) &&(h<110 || h>130)){
                bpResult.setText("Emergency bp Condition.See a visit Doctor");
            }
            else{
                bpResult.setText(("BP is Good"));
            }

            if(t>99.0){
                tbResult.setText("Body temperature is high" );
            }
            else {
                tbResult.setText("Body temperature is Normal: ");
            }

            double bmi = weight / Math.pow(height, 2) ;

            if (bmi < 18.5) {
                lbResult.setText("underweight - BMI : "+bmi);
            } else if (bmi < 25) {
                lbResult.setText("normal - BMI : "+bmi);
            } else if (bmi < 30) {
                lbResult.setText("overweight - BMI : "+bmi);
            } else {
                lbResult.setText("obese - BMI : "+bmi);
            }
        });

        f.add(btn);//adding button in JFrame

        f.setSize(600, 500);
        f.setLayout(null);
        f.setVisible(true);

    }

    public static void main(String[] args) {
        new E_Hospital_health_checker();
    }
}