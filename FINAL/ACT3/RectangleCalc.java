import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RectangleCalc extends JFrame implements ActionListener{
   JTextField lengthField;
   JTextField widthField;
   JLabel area;
   JLabel perimeter;
   
   public RectangleCalc(){
      JFrame calcFrame = new JFrame("Rectangle");
      JLabel label1 = new JLabel("Enter the length: ");
      JLabel label2 = new JLabel("Enter the width: ");
      lengthField = new JTextField(20);
      widthField = new JTextField(20);
      JButton b1 = new JButton("CALCULATE");
      area = new JLabel();
      perimeter = new JLabel();
      
      calcFrame.setVisible(true);
      calcFrame.setSize(300,300);
      calcFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      calcFrame.setLayout(new BoxLayout(calcFrame.getContentPane(), BoxLayout.Y_AXIS));
      
      calcFrame.add(label1);
      label1.setAlignmentX(label1.LEFT_ALIGNMENT);
      calcFrame.add(lengthField);
      calcFrame.add(label2);
      label2.setAlignmentX(label2.LEFT_ALIGNMENT);
      calcFrame.add(widthField);
      calcFrame.add(b1);
      b1.setAlignmentX(b1.CENTER_ALIGNMENT);
      b1.addActionListener(this);
      calcFrame.add(area);
      calcFrame.add(perimeter);
   }
   
   public void actionPerformed(ActionEvent e){
      String n1 = lengthField.getText();
      double length = Double.parseDouble(n1);
      
      String n2 = widthField.getText();
      double width = Double.parseDouble(n2);
      
      double areaAns = length * width;
      double perimeterAns = 2*(length + width);
      
      area.setText("Area: " + areaAns);
      perimeter.setText("Perimeter: " + perimeterAns);
   }
}