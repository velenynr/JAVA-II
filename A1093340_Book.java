import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class PFrame extends JFrame implements ActionListener, ItemListener{

    String[] bookCollections = {"Harry Potter", "Sherlock Holmes", "Aladdin", "Habibie dan Ainun"};
    JComboBox<String> selection = new JComboBox<>(bookCollections);
    JButton insert, delete;
    JLabel footer = new JLabel("Choose, Insert and Remove Book...");

    PFrame(){

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Library");
        setBounds(510, 200, 430, 300);
        setLayout(null);
        
        JPanel book = new JPanel();
        add(book);
        book.setBounds(0,0,430,70);
        book.setLayout(new FlowLayout(FlowLayout.LEFT));

        JLabel title = new JLabel("Title: ");
        book.add(title);
        title.setBounds(5,5,20,15);

        book.add(selection);
        selection.addItemListener(this);

        JPanel operation = new JPanel();
        add(operation);
        operation.setBounds(0, 80, 430, 90);
        operation.setLayout(new FlowLayout(FlowLayout.RIGHT));        
        
        insert = new JButton("Add");
        delete = new JButton("Delete");
        operation.add(insert);
        operation.add(delete);

        insert.setBounds(370, 10, 50, 30);
        delete.setBounds(370, 50, 50, 30);

        insert.addActionListener(this);
        delete.addActionListener(this);

        JPanel displayPane = new JPanel();
        add(displayPane);
        displayPane.setBounds(0, 180, 430, 50);
        displayPane.setLayout(new FlowLayout(FlowLayout.LEFT));
        displayPane.setBackground(Color.CYAN);
        
        displayPane.add(footer);
        footer.setBounds(5, 10, 80, 15);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource() == insert){
            String newName = JOptionPane.showInputDialog("Please input the books name");
            
            selection.addItem(newName);
            footer.setText("Added " +newName+ " to the last part of collection");
        }

        if (e.getSource() == delete){
            Object selected = selection.getSelectedItem();
            selection.removeItem(selected);
            footer.setText("Removed " +selected+ ".");
        }
    }

    public void itemStateChanged(ItemEvent e){
        Object show = selection.getSelectedItem();
        int index = selection.getSelectedIndex();
        footer.setText(show+ ", index = " +index);
    }
}

public class A1093340_Book{
    public static void main(String[] args){
        PFrame frame = new PFrame();
    }
}