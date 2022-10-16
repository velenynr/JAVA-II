import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class A1093340_MyJCal extends JFrame implements ActionListener{
    private JPanel contentPane;
    private JTextField calcResult;
    private JLabel calcTitle1;
    private JLabel calcTitle2;

    String calcOne, calcOperator, calcTwo;

    A1093340_MyJCal(){

        calcOne = calcOperator = calcTwo = "";

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(600,200,450,500);
        setTitle("My Calculator");
        
        contentPane = new JPanel();

        // contentPane.setLayout(new GridLayout(5,3,5,10));
        contentPane.setLayout(new GridLayout(6,3,10,20));

        setContentPane(contentPane);
       
        calcTitle1 = new JLabel("My Calculator");
        // calcTitle.setBounds(50,20,100,15);
        contentPane.add(calcTitle1);

        calcTitle2 = new JLabel(" ");
        // calcTitle2.setBounds(50,20,100,15);
        contentPane.add(calcTitle2);

        calcResult = new JTextField(20);
        calcResult.setEditable(false);
        calcResult.setColumns(10);
        calcResult.setText("0");
        // calcResult.setBounds(130,65,100,25);
        contentPane.add(calcResult);

        JButton calcButton7 = new JButton("7");
        calcButton7.addActionListener(this);
        contentPane.add(calcButton7);

        JButton calcButton8 = new JButton("8");
        calcButton8.addActionListener(this);
        contentPane.add(calcButton8);

        JButton calcButton9 = new JButton("9");
        calcButton9.addActionListener(this);
        contentPane.add(calcButton9);

        JButton calcButton4 = new JButton("4");
        calcButton4.addActionListener(this);
        contentPane.add(calcButton4);

        JButton calcButton5 = new JButton("5");
        calcButton5.addActionListener(this);
        contentPane.add(calcButton5);
        
        JButton calcButton6 = new JButton("6");
        calcButton6.addActionListener(this);
        contentPane.add(calcButton6);

        JButton calcButton1 = new JButton("1");
        calcButton1.addActionListener(this);
        contentPane.add(calcButton1);
        
        JButton calcButton2 = new JButton("2");
        calcButton2.addActionListener(this);
        contentPane.add(calcButton2);
        
        JButton calcButton3 = new JButton("3");
        calcButton3.addActionListener(this);
        contentPane.add(calcButton3);

        JButton calcButtonPlus = new JButton("+");
        calcButtonPlus.addActionListener(this);
        contentPane.add(calcButtonPlus);

        JButton calcButton0 = new JButton("0");
        calcButton0.addActionListener(this);
        contentPane.add(calcButton0);

        JButton calcButtonMinus = new JButton("-");
        calcButtonMinus.addActionListener(this);
        contentPane.add(calcButtonMinus);

        JButton calcButtonMul = new JButton("x");
        calcButtonMul.addActionListener(this);
        contentPane.add(calcButtonMul);

        JButton calcButtonEq = new JButton("=");
        calcButtonEq.addActionListener(this);
        contentPane.add(calcButtonEq);

        JButton calcButtonDev = new JButton("/");
        calcButtonDev.addActionListener(this);
        contentPane.add(calcButtonDev);


        setVisible(true);

    }

        public void actionPerformed(ActionEvent e){
            String btnTyped = e.getActionCommand();
            
            if ((btnTyped.charAt(0) >= '0' && btnTyped.charAt(0) <= '9')){
                if (!calcOperator.equals("")){
                    calcTwo = calcTwo+btnTyped;
                }else{
                    calcOne = calcOne+btnTyped;
                }
                calcResult.setText(calcOne+calcOperator+calcTwo);
            }else if (btnTyped.charAt(0) == '='){
                int result = 0;

                if (calcOperator.equals("+")){
                    result = Integer.valueOf(calcOne)+Integer.valueOf(calcTwo);
                }else if(calcOperator.equals("-")){
                    result = Integer.valueOf(calcOne)-Integer.valueOf(calcTwo);
                }else if (calcOperator.equals("x")){
                    result = Integer.valueOf(calcOne)*Integer.valueOf(calcTwo);
                }else if (calcOperator.equals("/")){
                    result = Integer.valueOf(calcOne)/Integer.valueOf(calcTwo);
                }else{
                    calcResult.setText("ERRORRRR>>>");
                }

                calcResult.setText(calcOne+calcOperator+calcTwo+"="+result);

                calcOperator = calcTwo = "";
                calcOne = Integer.toString(result);
            }else{
                
                if(calcOperator.equals("")||calcTwo.equals("")){
                    calcOperator = btnTyped;
                }else{
                    int result = 0;

                    if (calcOperator.equals("+")){
                        result = Integer.valueOf(calcOne)+Integer.valueOf(calcTwo);
                    }else if(calcOperator.equals("-")){
                        result = Integer.valueOf(calcOne)-Integer.valueOf(calcTwo);
                    }else if (calcOperator.equals("x")){
                        result = Integer.valueOf(calcOne)*Integer.valueOf(calcTwo);
                    }else if (calcOperator.equals("/")){
                        result = Integer.valueOf(calcOne)/Integer.valueOf(calcTwo);
                    }else{
                        calcResult.setText("ERRORRRR>>>");
                    }

                    calcOne = Integer.toString(result);
                    calcOperator = btnTyped;
                    calcTwo = "";
                }
                calcResult.setText(calcOne+calcOperator+calcTwo);
            }
        }
     
        
    
}