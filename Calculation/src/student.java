import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class student {
    private JTextField txtName;
    private JButton calButton;
    private JTextField txtM1;
    private JTextField txtM2;
    private JTextField txtM3;
    private JTextField txtTotal;
    private JTextField txtAvg;
    private JTextField txtGrade;
    private JPanel Main;


    // click droite -> create licener | Code -> Generate -> form Main
    public static void main(String[] args) {
        JFrame frame = new JFrame("student");
        frame.setContentPane(new student().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public student() {
        calButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int m1, m2, m3, totals;
                double avg;

                m1 = Integer.parseInt(txtM1.getText());
                m2 = Integer.parseInt(txtM2.getText());
                m3 = Integer.parseInt(txtM3.getText());

                totals = m1 +m2 + m3;
                txtTotal.setText(String.valueOf(totals));

                avg = totals/3;
                txtAvg.setText(String.valueOf(avg));


                if(avg > 50)
                {
                    txtGrade.setText("Pass");
                }else{
                    txtGrade.setText("Fail");
                }
            }
        });
    }
}
