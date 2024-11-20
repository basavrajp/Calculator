import javax.swing.*;
import java.awt.event.*;


public class calculator implements ActionListener {
        int c, n;
        String s1, s2, s3, s4, s5;
        JFrame f;
        JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, badd, bsub, bmul, bdiv, beq, bclr, bdec;
        JTextField t1;

        calculator() {
                f = new JFrame("Calculator");
                t1 = new JTextField();
                b0 = new JButton("0");
                b1 = new JButton("1");
                b2 = new JButton("2");
                b3 = new JButton("3");
                b4 = new JButton("4");
                b5 = new JButton("5");
                b6 = new JButton("6");
                b7 = new JButton("7");
                b8 = new JButton("8");
                b9 = new JButton("9");
                badd = new JButton("+");
                bdec = new JButton(".");
                bsub = new JButton("-");
                bmul = new JButton("*");
                bdiv = new JButton("/");
                beq = new JButton("=");
                bclr = new JButton("clr");
                t1.setBounds(30, 40, 280, 30);
                b0.setBounds(40, 100, 50, 40);
                b1.setBounds(110, 100, 50, 40);
                b2.setBounds(180, 100, 50, 40);
                bdiv.setBounds(250, 100, 50, 40);
                b3.setBounds(40, 170, 50, 40);
                b4.setBounds(110, 170, 50, 40);
                b5.setBounds(180, 170, 50, 40);
                bmul.setBounds(250, 170, 50, 40);
                b6.setBounds(40, 240, 50, 40);
                b7.setBounds(110, 240, 50, 40);
                b8.setBounds(180, 240, 50, 40);
                bsub.setBounds(250, 240, 50, 40);
                bdec.setBounds(40, 310, 50, 40);
                b9.setBounds(110, 310, 50, 40);
                beq.setBounds(180, 310, 50, 40);
                badd.setBounds(250, 310, 50, 40);
                bclr.setBounds(180, 380, 100, 40);
                f.add(t1);
                f.add(b0);
                f.add(b1);
                f.add(b2);
                f.add(bdiv);
                f.add(b3);
                f.add(b4);
                f.add(b5);
                f.add(bmul);
                f.add(b6);
                f.add(b7);
                f.add(b8);
                f.add(bsub);
                f.add(bdec);
                f.add(b9);
                f.add(beq);
                f.add(badd);
                f.add(bclr);
                f.setLayout(null);
                f.setVisible(true);
                f.setSize(350, 500);
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                f.setResizable(false);
                b0.addActionListener(this);
                b1.addActionListener(this);
                b2.addActionListener(this);
                b3.addActionListener(this);
                b4.addActionListener(this);
                b5.addActionListener(this);
                b6.addActionListener(this);
                b7.addActionListener(this);
                b8.addActionListener(this);
                b9.addActionListener(this);
                badd.addActionListener(this);
                bsub.addActionListener(this);
                bmul.addActionListener(this);
                bdiv.addActionListener(this);
                bdec.addActionListener(this);
                bclr.addActionListener(this);
                beq.addActionListener(this);

        }

        @Override
        public void actionPerformed(ActionEvent e) {

                if (e.getSource() == b0) {
                        s3 = t1.getText();
                        s4 = "0";
                        s5 = s3 + s4;
                        t1.setText(s5);
                }
                if (e.getSource() == b1) {
                        s3 = t1.getText();
                        s4 = "1";
                        s5 = s3 + s4;
                        t1.setText(s5);
                }
                if (e.getSource() == b2) {
                        s3 = t1.getText();
                        s4 = "2";
                        s5 = s3 + s4;
                        t1.setText(s5);
                }
                if (e.getSource() == b3) {
                        s3 = t1.getText();
                        s4 = "3";
                        s5 = s3 + s4;
                        t1.setText(s5);
                }
                if (e.getSource() == b4) {
                        s3 = t1.getText();
                        s4 = "4";
                        s5 = s3 + s4;
                        t1.setText(s5);
                }
                if (e.getSource() == b5) {
                        s3 = t1.getText();
                        s4 = "5";
                        s5 = s3 + s4;
                        t1.setText(s5);
                }
                if (e.getSource() == b6) {
                        s3 = t1.getText();
                        s4 = "6";
                        s5 = s3 + s4;
                        t1.setText(s5);
                }
                if (e.getSource() == b7) {
                        s3 = t1.getText();
                        s4 = "7";
                        s5 = s3 + s4;
                        t1.setText(s5);
                }
                if (e.getSource() == b8) {
                        s3 = t1.getText();
                        s4 = "8";
                        s5 = s3 + s4;
                        t1.setText(s5);
                }
                if (e.getSource() == b9) {
                        s3 = t1.getText();
                        s4 = "9";
                        s5 = s3 + s4;
                        t1.setText(s5);
                }
                if (e.getSource() == badd) {
                        s1 = t1.getText();
                        t1.setText("");
                        c = 1;
                }
                if (e.getSource() == bsub) {
                        s1 = t1.getText();
                        t1.setText("");
                        c = 2;
                }
                if (e.getSource() == bmul) {
                        s1 = t1.getText();
                        t1.setText("");
                        c = 3;
                }
                if (e.getSource() == bdiv) {
                        s1 = t1.getText();
                        t1.setText("");
                        c = 4;
                }

                if (e.getSource() == beq) {
                        s2 = t1.getText();
                        if (c == 1) {
                                n = Integer.parseInt(s1) + Integer.parseInt(s2);
                                t1.setText(String.valueOf(n));
                        }
                        if (c == 2) {
                                n = Integer.parseInt(s1) - Integer.parseInt(s2);
                                t1.setText(String.valueOf(n));
                        }
                        if (c == 3) {
                                n = Integer.parseInt(s1) * Integer.parseInt(s2);
                                t1.setText(String.valueOf(n));
                        }
                        if (c == 4) {
                                n = Integer.parseInt(s1) / Integer.parseInt(s2);
                                t1.setText(String.valueOf(n));
                        }
                }
                if (e.getSource()==bdec){
                    t1.setText("");
                }
                if (e.getSource() == bclr) {
                        t1.setText("");
                }
        }

        public static void main(String[] args) {
                calculator calcie = new calculator();
        }
}

