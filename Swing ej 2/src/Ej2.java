import javax.swing.*;
import java.awt.*;

public class Ej2 extends JFrame {

    public static void main(String[] args) {
        Ej2 aaa = new Ej2();
        aaa.Ventana1();

        aaa.Ventana2();

        aaa.prueba_Erick();

       // aaa.prueba();



    }public void prueba_Erick(){

        JFrame frame = new JFrame();
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(1000,1000);


        String[] sList = new String[100];
        for (int i=1;i<=100;i++){
            sList[i-1]="Element "+i;
        }

        JList list1=new JList(sList);
        list1.setSelectedIndex(3);
        list1.setBackground(Color.green);

        JScrollPane scrollpane1 = new JScrollPane(list1);
        scrollpane1.setBounds(10,10,115,165);

        JTextArea textArea1 = new JTextArea();
        textArea1.setText("Write something here...");

        JScrollPane scrollpane2 = new JScrollPane(textArea1);
        scrollpane2.setBounds(10,200,200,200);
        scrollpane2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);


        //Add to the frame
        frame.add(scrollpane1);
        frame.add(scrollpane2);



    }


    public void prueba(){

        JFrame frame = new JFrame();
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(1000,1000);

        JTextArea textArea = new JTextArea();
        textArea.setBounds(20,20,100,100);
        JScrollPane scroll = new JScrollPane(textArea);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        frame.add(textArea);
        frame.add(scroll);

        scroll.setSize(1000, 600);
        this.setLayout(new BorderLayout());


        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);






    }
    public void Ventana1(){

        //frame ---------------------------------------------------------

        JFrame frame =new JFrame("Ej 2");
        frame.setSize(200, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);


        String[] country= new String[101];


        for (int n= 1; n<=100; n++){

            country[n]="Element "+n;

        }

        JComboBox list1=new JComboBox(country);
        list1.setSelectedIndex(1);
        list1.setBounds(20,30,150,40);
        list1.setBackground(new Color(67, 236, 90));






       // JTextArea area1= new JTextArea("Textooooooooooooooooooooooooooooooooooooooo");
        // JScrollPane pane2 = new JScrollPane(area1);
        //  pane2.setBounds(20,90,150,200);
        //  area1.setBounds(20,90,150,200);
        // pane2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        JTextArea textArea1 = new JTextArea();
        textArea1.setText("Write something here...");

        JScrollPane scrollpane2 = new JScrollPane(textArea1);
        scrollpane2.setBounds(20,90,150,200);
        scrollpane2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);











        //Add Components ---------------------------

        frame.add(list1);
        //frame.add(pane2);
        //frame.add(area1);
        frame.add(scrollpane2);






        frame.repaint();

    }


    public void Ventana2(){

        //frame ---------------------------------------------------------
        JFrame frame =new JFrame("Ej 2");
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);

        // First column ------------------------------------

        JLabel Label1 = new JLabel("Example label");
        Label1.setVisible(true);
        Label1.setBounds(20,20,100,20);


        JTextField field1= new JTextField();
        field1.setVisible(true);
        field1.setBounds(20,60,60,20);



        String country[]={"arbol.png", "moñeco.png", "albacete.png"};
        JComboBox list1=new JComboBox(country);
        list1.setVisible(true);
        list1.setBounds(20,90,150,40);
        list1.setSelectedItem(1);


        ButtonGroup Buttons1 = new ButtonGroup();


        JRadioButton button1= new JRadioButton("Blue");
        button1.setVisible(true);
        button1.setSelected(true);
        button1.setBounds(250,40, 80,10);

        JRadioButton button2= new JRadioButton("Green");
        button2.setVisible(true);
        button2.setBounds(250,60, 80,10);

        JRadioButton button3= new JRadioButton("Black");
        button3.setVisible(true);
        button3.setBounds(250,80, 80,10);



        JButton boton1 = new JButton("Click");
        boton1.setBounds(180,150,100,30);




        JScrollPane panel1 = new JScrollPane();
        panel1.setBounds(350,40,150,150);



        JCheckBox check1 = new JCheckBox("Carrot");
        check1.setBounds(10,10,100,20);

        JCheckBox check2 = new JCheckBox("Onion");
        check2.setBounds(10,30,100,20);

        JCheckBox check3 = new JCheckBox("Melon");
        check3.setBounds(10,50,100,20);

        JCheckBox check4 = new JCheckBox("Piña");
        check4.setBounds(10,70,100,20);

        panel1.add(check1);
        panel1.add(check2);
        panel1.add(check3);
        panel1.add(check4);








        //Add Components ---------------------------

        frame.add(Label1);
        frame.add(field1);
        frame.add(list1);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(boton1);
        frame.add(panel1);


        frame.repaint();


    }






}
