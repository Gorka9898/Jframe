import javax.swing.*;
import java.awt.*;

public class Ej_3 extends JFrame{

    public static void main(String[] args) {
        Ej_3 aaa = new Ej_3();

        aaa.ventana();

       // aaa.prueba();


    }

    public void prueba(){
     JFrame frame = new JFrame();
     frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
     frame.setLayout(new BorderLayout());
     frame.setVisible(true);
     frame.setSize(1000,1000);


     JPanel panel2 = new JPanel(new GridLayout(2,2));
   frame.add(panel2, BorderLayout.CENTER);  // b2 will be placed in the Center
     JLabel la1 = new JLabel(new ImageIcon("bu.jpg"));
     JLabel la2 = new JLabel(new ImageIcon("bu.jpg"));
     JLabel la3 = new JLabel(new ImageIcon("bu.jpg"));
     JLabel la4 = new JLabel(new ImageIcon("bu.jpg"));

     panel2.add(la1);
     panel2.add(la2);
     panel2.add(la3);
     panel2.add(la4);


     frame.add(panel2, BorderLayout.CENTER);  // b2 will be placed in the Center


    }

    public void ventana(){

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
       frame.setLayout(new BorderLayout());
        frame.setVisible(true);
        frame.setSize(800,800);

        //Panel1-----------------------------------------------

        JCheckBox check1 = new JCheckBox("Check1");
        JCheckBox check2 = new JCheckBox("Check2");

        JPanel panel1 = new JPanel(new FlowLayout());
        panel1.add(check1);
        panel1.add(check2);

        //Panel2-----------------------------------------------
        JPanel panel2 = new JPanel(new GridLayout(2,2));

     JLabel la1 = new JLabel(new ImageIcon("bu.jpg"));
     JLabel la2 = new JLabel(new ImageIcon("bu.jpg"));
     JLabel la3 = new JLabel(new ImageIcon("bu.jpg"));
     JLabel la4 = new JLabel(new ImageIcon("bu.jpg"));



     panel2.add(la1);
     panel2.add(la2);
     panel2.add(la3);
     panel2.add(la4);





        //Panel3-----------------------------------------------

        JRadioButton boton1 = new JRadioButton("Radio1");
        JRadioButton boton2 = new JRadioButton("Radio2");
        JRadioButton boton3 = new JRadioButton("Radio3");

        ButtonGroup groupB1 = new ButtonGroup();
        groupB1.add(boton1);
        groupB1.add(boton2);
        groupB1.add(boton3);
        boton1.setSelected(true);

        JPanel panel3 = new JPanel();

     panel3.setLayout(new BoxLayout(panel3,BoxLayout.Y_AXIS));
        panel3.add(boton1);
        panel3.add(boton2);
        panel3.add(boton3);






        //Panel4-----------------------------------------------
        JPanel panel4 = new JPanel();
        panel4.setLayout(new BoxLayout(panel4,BoxLayout.X_AXIS));











        //Panel5----------------------------------------------

        JButton b1 = new JButton("P");; // the button will be labeled as NORTH
        JButton b11 = new JButton("E");; // the button will be labeled as NORTH
        JButton b111 = new JButton("N");; // the button will be labeled as NORTH
        JButton b1111 = new JButton("E");; // the button will be labeled as NORTH


        JPanel panel5= new JPanel();
        panel5.setLayout(new BoxLayout(panel5,BoxLayout.X_AXIS));
        panel5.add(b1);
        panel5.add(b11);
        panel5.add(b111);
        panel5.add(b1111);



        JButton b2 = new JButton("SOUTH");; // the button will be labeled as SOUTH
        JButton b3 = new JButton("EAST");; // the button will be labeled as EAST
        JButton b4 = new JButton("WEST");; // the button will be labeled as WEST
        JButton b5 = new JButton("CENTER");; // the button will be labeled as CENTER

        frame.add(panel1, BorderLayout.NORTH); // b1 will be placed in the North Direction
        frame.add(panel3, BorderLayout.EAST);  // b2 will be placed in the East Direction
        frame.add(panel2, BorderLayout.CENTER);  // b2 will be placed in the Center
        frame.add(b4, BorderLayout.WEST);  // b2 will be placed in the West Direction
        frame.add(panel5, BorderLayout.SOUTH);  // b2 will be placed in the South Direction


    }








}
