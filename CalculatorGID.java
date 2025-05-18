package zuj.std.cp;
    
    import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorGID {
    public static void main(String[] args) {
        // إنشاء النافذة
        JFrame frame = new JFrame("تحويل الحرارة - Celsius إلى Fahrenheit");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // مكونات الواجهة
        JLabel label = new JLabel("أدخل درجة الحرارة بالسيليسيوس:");
        label.setBounds(30, 20, 250, 25);
        frame.add(label);

        JTextField textField = new JTextField();
        textField.setBounds(30, 50, 150, 25);
        frame.add(textField);

        JButton convertButton = new JButton("حوّل");
        convertButton.setBounds(200, 50, 100, 25);
        frame.add(convertButton);

        JLabel resultLabel = new JLabel("النتيجة: ");
        resultLabel.setBounds(30, 100, 300, 25);
        frame.add(resultLabel);

        // حدث الزر
        convertButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double celsius = Double.parseDouble(textField.getText());
                    double fahrenheit = (celsius * 9 / 5) + 32;
                    resultLabel.setText("النتيجة: " + fahrenheit + "°F");
                } catch (NumberFormatException ex) {
                    resultLabel.setText("الرجاء إدخال رقم صحيح!");
                }
            }
        });

        // عرض الواجهة
        frame.setVisible(true);
    }
}

   
