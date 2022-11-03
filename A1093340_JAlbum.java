import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class A1093340_JAlbum extends JFrame{
    private JPanel contentPane;
    String[] imgName = {"Picture1","banner"};
    JButton btnPrev, btnNext;
    JLabel lblName, lblImg, lblShow;
    int n = 0;
    A1093340_JAlbum(){

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // setTitle("Welcome to my Photo Album");
        setBounds(700,230,230,310);
        contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null);

        // JLabel title = new JLabel("Vey's Photo Album", JLabel.CENTER);
        // contentPane.add(title);
        
        lblName = new JLabel(imgName[n], JLabel.CENTER);
        lblName.setBounds(20,20,180,25);
        contentPane.add(lblName);

        lblImg = new JLabel();
        lblImg.setIcon(new ImageIcon("../image/" + imgName[n]+".png"));
        lblImg.setBounds(20,50,180,135);
        contentPane.add(lblImg);

        String show = "Picture " + (n+1) + ", Total "+ imgName.length;
        lblShow = new JLabel(show);
        lblShow.setBounds(20,200,180,25);
        contentPane.add(lblShow);

        btnPrev = new JButton("Previous");
        btnPrev.setBounds(20,230,80,25);
        contentPane.add(btnPrev);
        btnPrev.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                n--;
                if(n<0){
                    n = imgName.length-1;
                }
                lblImg.setIcon(new ImageIcon("../Image/" + imgName[n] +".png"));
                lblName.setText(imgName[n]);
                lblShow.setText("Picture " + (n+1) + ", Total "+ imgName.length);
            }
        });

        btnNext = new JButton("Next");
        btnNext.setBounds(120,230,80,25);
        contentPane.add(btnNext);
        btnNext.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                n++;
                if(n>= imgName.length){
                    n = 0;
                }
                lblImg.setIcon(new ImageIcon("../Image/" + imgName[n] +".png"));
                lblName.setText(imgName[n]);
                lblShow.setText("Picture " + (n+1) + ", Total "+ imgName.length);
            }
        });
        
        setVisible(true);

    }
}