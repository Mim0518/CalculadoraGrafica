import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.*;
import java.util.*;

public class Calc extends JFrame implements ActionListener{
    private static final long serialVersionUID = 1L;
    JPanel panel_principal;
            JPanel panel_botones;
            JTextField caja;
        public Calc(){    
            setTitle("Calculadora");
            setSize(250, 300);
            setResizable(false);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            init();
            agregarBotones();
            setVisible(true);
        }
        public void init(){
            panel_principal = new JPanel();
            panel_principal.setLayout(new BorderLayout());
            caja = new JTextField();
            panel_principal.add("North", caja);
            panel_botones = new JPanel();
            panel_botones.setLayout(new GridLayout(5, 4, 8, 8));
            panel_principal.add("Center", panel_botones);
            getContentPane().add(panel_principal);
        }
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == boton[19]){
                try {
                    if(op1!= 0) op1 = op1 + Double.parseDouble(caja.getText());
                    else op1 = Double.parseDouble(caja.getText());
                    operacion="suma";
                    caja.setText("");
                } catch (Exception err) {}
            }
            if(e.getSource() == boton[15]){
                try {
                    if(op1!= 0) op1 = op1 + Double.parseDouble(caja.getText());
                    else op1 = Double.parseDouble(caja.getText());
                    operacion="resta";
                    caja.setText("");
                } catch (Exception err) {}
            }
            if(e.getSource() == boton[11]){
                try {
                    if(op1!= 0) op1 = op1 + Double.parseDouble(caja.getText());
                    else op1 = Double.parseDouble(caja.getText());
                    operacion="multiplicacion";
                    caja.setText("");
                } catch (Exception err) {}
            }
            if(e.getSource() == boton[7]){
                try {
                    if(op1!= 0) op1 = op1 + Double.parseDouble(caja.getText());
                    else op1 = Double.parseDouble(caja.getText());
                    operacion="division";
                    caja.setText("");
                } catch (Exception err) {}
            }
            if(e.getSource() == boton[4]){
                if(nueva){caja.setText("");nueva=false;}
                    caja.setText(caja.getText()+"7");
            }
            if(e.getSource() == boton[5]){
                if(nueva){caja.setText("");nueva=false;}
                    caja.setText(caja.getText()+"8");
            }
            if(e.getSource() == boton[6]){
                if(nueva){caja.setText("");nueva=false;}
                    caja.setText(caja.getText()+"9");
            }
            if(e.getSource() == boton[8]){
                if(nueva){caja.setText("");nueva=false;}
                    caja.setText(caja.getText()+"4");
            }
            if(e.getSource() == boton[9]){
                if(nueva){caja.setText("");nueva=false;}
                    caja.setText(caja.getText()+"5");
            }
            if(e.getSource() == boton[10]){
                if(nueva){caja.setText("");nueva=false;}
                    caja.setText(caja.getText()+"6");
            }
            if(e.getSource() == boton[12]){
                if(nueva){caja.setText("");nueva=false;}
                    caja.setText(caja.getText()+"1");
            }
            if(e.getSource() == boton[13]){
                if(nueva){caja.setText("");nueva=false;}
                    caja.setText(caja.getText()+"2");
            }
            if(e.getSource() == boton[14]){
                if(nueva){caja.setText("");nueva=false;}
                    caja.setText(caja.getText()+"3");
            }
            if(e.getSource() == boton[16]){
                if(nueva){caja.setText("");nueva=false;}
                    caja.setText(caja.getText()+"0");
            }
            if(e.getSource() == boton[17]){
                if(nueva){caja.setText("");nueva=false;}
                    caja.setText(caja.getText()+".");
            }
            if(e.getSource() == boton[18]){
                try{
                    op2=Double.parseDouble(caja.getText());
                }catch(Exception err){}
                if(operacion.equals("suma")){
                    double res=op1+op2;
                    caja.setText(String.valueOf(res));
                    op1=op2=0;
                    operacion="";
                }else if(operacion.equals("resta")){
                    double res=op1-op2;
                    caja.setText(String.valueOf(res));
                    op1=op2=0;
                    operacion="";
                }else if(operacion.equals("multiplicacion")){
                    double res=op1*op2;
                    caja.setText(String.valueOf(res));
                    op1=op2=0;
                    operacion="";
                }else if(operacion.equals("division")){
                    double res=op1/op2;
                    caja.setText(String.valueOf(res));
                    op1=op2=0;
                    operacion="";
                }
                nueva=true;
            }
            if(e.getSource() == boton[0]){
                caja.setText("");
                    op1=op2=0;
                    operacion="";
            }
        }
        double op1 = 0, op2 = 0;
        String operacion = "";
        boolean nueva = true;
        JButton boton[];
        public void agregarBotones(){
            boton = new JButton[20];
            boton[0]=new JButton("CE");
            boton[1]=new JButton("");
            boton[2]=new JButton("");
            boton[3]=new JButton("");
            boton[4]=new JButton("7");
            boton[5]=new JButton("8");
            boton[6]=new JButton("9");
            boton[7]=new JButton("/");
            boton[8]=new JButton("4");
            boton[9]=new JButton("5");
            boton[10]=new JButton("6");
            boton[11]=new JButton("*");
            boton[12]=new JButton("1");
            boton[13]=new JButton("2");
            boton[14]=new JButton("3");
            boton[15]=new JButton("-");
            boton[16]=new JButton("0");
            boton[17]=new JButton(".");
            boton[18]=new JButton("=");
            boton[19]=new JButton("+");
            for(int i=0;i<20;i++){
                panel_botones.add(boton[i]);
            }
            //boton de operaciones con sus listeners
            boton[19].addActionListener(this);
            boton[15].addActionListener(this);
            boton[11].addActionListener(this);
            boton[7].addActionListener(this);
            //numeros y punto decimal
            boton[4].addActionListener(this);
            boton[5].addActionListener(this);
            boton[6].addActionListener(this);
            boton[8].addActionListener(this);
            boton[9].addActionListener(this);
            boton[10].addActionListener(this);
            boton[12].addActionListener(this);
            boton[13].addActionListener(this);
            boton[14].addActionListener(this);
            boton[16].addActionListener(this);
            boton[17].addActionListener(this);
            //Igual
            boton[18].addActionListener(this);
            //CE
            boton[0].addActionListener(this);
        }
}