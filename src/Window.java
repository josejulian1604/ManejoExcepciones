import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.event.*;

public class Window extends JFrame implements ActionListener{
    private int opcion;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    
    public Window() {
        this.setLayout(null);
        this.setTitle("Orden Botones");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setSize(600, 600);
        this.setResizable(false);

        opcion = 1;

        button1 = new JButton("Boton 1");
        button1.setBounds(250, 50, 100, 100);
        button1.addActionListener(this);

        button2 = new JButton("Boton 2");
        button2.setBounds(250, 200, 100, 100);
        button2.addActionListener(this);

        button3 = new JButton("Boton 3");
        button3.setBounds(250, 350, 100, 100);
        button3.addActionListener(this);
              
        this.add(button1);
        this.add(button2);
        this.add(button3);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button1) {
            if(opcion == 1)
                opcion++;
            else {
                try {
                    opcion = 1;
                    showMessage("Boton Incorrecto");
                    throw new Exception("Boton incorrecto");
                } catch (Exception e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
            }
        }
        else if(e.getSource() == button2) {
            if(opcion == 2)
                opcion++;
            else {
                try {
                    opcion = 1;
                    showMessage("Boton Incorrecto");
                    throw new Exception("Boton incorrecto");
                } catch (Exception e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
            }
        }
        else {
            if(opcion == 3) {
                opcion = 1;
                showMessage("fin");
            }
            else {
                try {
                    opcion = 1;
                    showMessage("Boton Incorrecto");
                    throw new Exception("Boton incorrecto");
                } catch (Exception e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
                
            }
        }
    }

    public void showMessage(String message) {
        JDialog newJDialog = new JDialog();
        JLabel newMessage = new JLabel(message);
        newJDialog.setTitle("JDialog");
        newJDialog.setVisible(true);
        newJDialog.setBounds(200, 200, 200, 100);
        newJDialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        newJDialog.add(newMessage);
    }
}
