/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Calculator;

/**
 *
 * @author Prudhwi Raj Krishna
 */
public class Basic_Calculator extends javax.swing.JFrame {

    /**
     * Creates new form Basic_Calculator
     */
    double Num1;
    double Num2;
    double Result;
    String Str;
    String Op;

    private boolean decimalPointEntered = false;

    public Basic_Calculator() {
        initComponents();
    }

    public void Clear() {
        Area.setText("");
        History.setText("");
    }

    public void Reset() {
        if (Area.getText().contains("Error!") || Area.getText().contains("NaN") || Area.getText().contains("Infinity") || Area.getText().startsWith("0.00")) {
            Area.setText("");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Area = new javax.swing.JTextField();
        PLUS = new javax.swing.JButton();
        BTN7 = new javax.swing.JButton();
        BTN8 = new javax.swing.JButton();
        BTN9 = new javax.swing.JButton();
        BTN6 = new javax.swing.JButton();
        BTN5 = new javax.swing.JButton();
        BTN4 = new javax.swing.JButton();
        SUB = new javax.swing.JButton();
        BTN1 = new javax.swing.JButton();
        BTN2 = new javax.swing.JButton();
        MULT = new javax.swing.JButton();
        BTN3 = new javax.swing.JButton();
        DOT = new javax.swing.JButton();
        BTN0 = new javax.swing.JButton();
        DIVIDE = new javax.swing.JButton();
        EQUALS = new javax.swing.JButton();
        C = new javax.swing.JButton();
        bs = new javax.swing.JButton();
        PLUSMINUS = new javax.swing.JButton();
        PERCENT = new javax.swing.JButton();
        History = new java.awt.TextField();
        ROOT = new javax.swing.JButton();
        SQUARE = new javax.swing.JButton();
        FRACTION = new javax.swing.JButton();
        exp = new javax.swing.JButton();
        pi = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Basic Calculator");
        setName("Calculator"); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Basic Calculator");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 290, 50));

        Area.setEditable(false);
        Area.setBackground(java.awt.SystemColor.control);
        Area.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        Area.setBorder(null);
        Area.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(Area, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 530, 50));

        PLUS.setBackground(new java.awt.Color(204, 255, 204));
        PLUS.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        PLUS.setForeground(new java.awt.Color(255, 0, 0));
        PLUS.setText("+");
        PLUS.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PLUS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PLUSActionPerformed(evt);
            }
        });
        jPanel1.add(PLUS, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 90, 60));

        BTN7.setBackground(new java.awt.Color(204, 255, 204));
        BTN7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        BTN7.setForeground(new java.awt.Color(255, 0, 0));
        BTN7.setText("7");
        BTN7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BTN7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN7ActionPerformed(evt);
            }
        });
        jPanel1.add(BTN7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 90, 60));

        BTN8.setBackground(new java.awt.Color(204, 255, 204));
        BTN8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        BTN8.setForeground(new java.awt.Color(255, 0, 0));
        BTN8.setText("8");
        BTN8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BTN8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN8ActionPerformed(evt);
            }
        });
        jPanel1.add(BTN8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 90, 60));

        BTN9.setBackground(new java.awt.Color(204, 255, 204));
        BTN9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        BTN9.setForeground(new java.awt.Color(255, 0, 0));
        BTN9.setText("9");
        BTN9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BTN9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN9ActionPerformed(evt);
            }
        });
        jPanel1.add(BTN9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 90, 60));

        BTN6.setBackground(new java.awt.Color(204, 255, 204));
        BTN6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        BTN6.setForeground(new java.awt.Color(255, 0, 0));
        BTN6.setText("6");
        BTN6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BTN6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN6ActionPerformed(evt);
            }
        });
        jPanel1.add(BTN6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 90, 60));

        BTN5.setBackground(new java.awt.Color(204, 255, 204));
        BTN5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        BTN5.setForeground(new java.awt.Color(255, 0, 0));
        BTN5.setText("5");
        BTN5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BTN5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN5ActionPerformed(evt);
            }
        });
        jPanel1.add(BTN5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 90, 60));

        BTN4.setBackground(new java.awt.Color(204, 255, 204));
        BTN4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        BTN4.setForeground(new java.awt.Color(255, 0, 0));
        BTN4.setText("4");
        BTN4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BTN4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN4ActionPerformed(evt);
            }
        });
        jPanel1.add(BTN4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 90, 60));

        SUB.setBackground(new java.awt.Color(204, 255, 204));
        SUB.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        SUB.setForeground(new java.awt.Color(255, 0, 0));
        SUB.setText("-");
        SUB.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SUB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SUBActionPerformed(evt);
            }
        });
        jPanel1.add(SUB, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 310, 90, 60));

        BTN1.setBackground(new java.awt.Color(204, 255, 204));
        BTN1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        BTN1.setForeground(new java.awt.Color(255, 0, 0));
        BTN1.setText("1");
        BTN1.setToolTipText("");
        BTN1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BTN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN1ActionPerformed(evt);
            }
        });
        jPanel1.add(BTN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 90, 60));

        BTN2.setBackground(new java.awt.Color(204, 255, 204));
        BTN2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        BTN2.setForeground(new java.awt.Color(255, 0, 0));
        BTN2.setText("2");
        BTN2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BTN2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN2ActionPerformed(evt);
            }
        });
        jPanel1.add(BTN2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 90, 60));

        MULT.setBackground(new java.awt.Color(204, 255, 204));
        MULT.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        MULT.setForeground(new java.awt.Color(255, 0, 0));
        MULT.setText("*");
        MULT.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        MULT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MULTActionPerformed(evt);
            }
        });
        jPanel1.add(MULT, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 380, 90, 60));

        BTN3.setBackground(new java.awt.Color(204, 255, 204));
        BTN3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        BTN3.setForeground(new java.awt.Color(255, 0, 0));
        BTN3.setText("3");
        BTN3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BTN3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN3ActionPerformed(evt);
            }
        });
        jPanel1.add(BTN3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, 90, 60));

        DOT.setBackground(new java.awt.Color(204, 255, 204));
        DOT.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        DOT.setForeground(new java.awt.Color(255, 0, 0));
        DOT.setText(".");
        DOT.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        DOT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DOTActionPerformed(evt);
            }
        });
        jPanel1.add(DOT, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 90, 60));

        BTN0.setBackground(new java.awt.Color(204, 255, 204));
        BTN0.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        BTN0.setForeground(new java.awt.Color(255, 0, 0));
        BTN0.setText("0");
        BTN0.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BTN0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN0ActionPerformed(evt);
            }
        });
        jPanel1.add(BTN0, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, 90, 60));

        DIVIDE.setBackground(new java.awt.Color(204, 255, 204));
        DIVIDE.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        DIVIDE.setForeground(new java.awt.Color(255, 0, 0));
        DIVIDE.setText("÷");
        DIVIDE.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        DIVIDE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DIVIDEActionPerformed(evt);
            }
        });
        jPanel1.add(DIVIDE, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 450, 90, 60));

        EQUALS.setBackground(new java.awt.Color(204, 255, 204));
        EQUALS.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        EQUALS.setForeground(new java.awt.Color(255, 0, 0));
        EQUALS.setText("=");
        EQUALS.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        EQUALS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EQUALSActionPerformed(evt);
            }
        });
        jPanel1.add(EQUALS, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 450, 90, 60));

        C.setBackground(new java.awt.Color(204, 255, 204));
        C.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        C.setForeground(new java.awt.Color(255, 0, 0));
        C.setText("AC");
        C.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CActionPerformed(evt);
            }
        });
        jPanel1.add(C, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 90, 60));

        bs.setBackground(new java.awt.Color(204, 255, 204));
        bs.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        bs.setForeground(new java.awt.Color(255, 0, 0));
        bs.setText("←");
        bs.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsActionPerformed(evt);
            }
        });
        jPanel1.add(bs, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 90, 60));

        PLUSMINUS.setBackground(new java.awt.Color(204, 255, 204));
        PLUSMINUS.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        PLUSMINUS.setForeground(new java.awt.Color(255, 0, 0));
        PLUSMINUS.setText("±");
        PLUSMINUS.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PLUSMINUS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PLUSMINUSActionPerformed(evt);
            }
        });
        jPanel1.add(PLUSMINUS, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 90, 60));

        PERCENT.setBackground(new java.awt.Color(204, 255, 204));
        PERCENT.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        PERCENT.setForeground(new java.awt.Color(255, 0, 0));
        PERCENT.setText("%");
        PERCENT.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PERCENT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PERCENTActionPerformed(evt);
            }
        });
        jPanel1.add(PERCENT, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 90, 60));

        History.setBackground(java.awt.SystemColor.control);
        History.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        History.setEditable(false);
        History.setEnabled(false);
        History.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jPanel1.add(History, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, 150, -1));
        History.getAccessibleContext().setAccessibleName("");

        ROOT.setBackground(new java.awt.Color(204, 255, 204));
        ROOT.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        ROOT.setForeground(new java.awt.Color(255, 0, 0));
        ROOT.setText("√");
        ROOT.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ROOT.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ROOT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ROOTActionPerformed(evt);
            }
        });
        jPanel1.add(ROOT, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 90, 60));

        SQUARE.setBackground(new java.awt.Color(204, 255, 204));
        SQUARE.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        SQUARE.setForeground(new java.awt.Color(255, 0, 0));
        SQUARE.setText("x² ");
        SQUARE.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SQUARE.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        SQUARE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SQUAREActionPerformed(evt);
            }
        });
        jPanel1.add(SQUARE, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, 90, 60));

        FRACTION.setBackground(new java.awt.Color(204, 255, 204));
        FRACTION.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        FRACTION.setForeground(new java.awt.Color(255, 0, 0));
        FRACTION.setText("1/x");
        FRACTION.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        FRACTION.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        FRACTION.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FRACTIONActionPerformed(evt);
            }
        });
        jPanel1.add(FRACTION, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 310, 90, 60));

        exp.setBackground(new java.awt.Color(204, 255, 204));
        exp.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        exp.setForeground(new java.awt.Color(255, 0, 0));
        exp.setText("x^");
        exp.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        exp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        exp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expActionPerformed(evt);
            }
        });
        jPanel1.add(exp, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 380, 90, 60));

        pi.setBackground(new java.awt.Color(204, 255, 204));
        pi.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        pi.setForeground(new java.awt.Color(255, 0, 0));
        pi.setText("π");
        pi.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                piActionPerformed(evt);
            }
        });
        jPanel1.add(pi, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 450, 90, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 550, 530));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTN7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN7ActionPerformed
        Reset();
        Str = Area.getText() + "7";
        Area.setText(Str);
    }//GEN-LAST:event_BTN7ActionPerformed

    private void BTN8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN8ActionPerformed
        Reset();
        Str = Area.getText() + "8";
        Area.setText(Str);
    }//GEN-LAST:event_BTN8ActionPerformed

    private void BTN9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN9ActionPerformed
        Reset();
        Str = Area.getText() + "9";
        Area.setText(Str);
    }//GEN-LAST:event_BTN9ActionPerformed

    private void BTN4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN4ActionPerformed
        Reset();
        Str = Area.getText() + "4";
        Area.setText(Str);
    }//GEN-LAST:event_BTN4ActionPerformed

    private void BTN5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN5ActionPerformed
        Reset();
        Str = Area.getText() + "5";
        Area.setText(Str);
    }//GEN-LAST:event_BTN5ActionPerformed

    private void BTN6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN6ActionPerformed
        Reset();
        Str = Area.getText() + "6";
        Area.setText(Str);
    }//GEN-LAST:event_BTN6ActionPerformed

    private void BTN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN1ActionPerformed
        Reset();
        Str = Area.getText() + "1";
        Area.setText(Str);
    }//GEN-LAST:event_BTN1ActionPerformed

    private void BTN2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN2ActionPerformed
        Reset();
        Str = Area.getText() + "2";
        Area.setText(Str);
    }//GEN-LAST:event_BTN2ActionPerformed

    private void BTN3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN3ActionPerformed
        Reset();
        Str = Area.getText() + "3";
        Area.setText(Str);
    }//GEN-LAST:event_BTN3ActionPerformed

    private void BTN0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN0ActionPerformed
        Reset();
        Str = Area.getText() + "0";
        Area.setText(Str);
    }//GEN-LAST:event_BTN0ActionPerformed

    private void DOTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DOTActionPerformed
        Reset();
        if (decimalPointEntered == false) {
            Str = Area.getText() + ".";
            Area.setText(Str);
            decimalPointEntered = true;
        }

        if (Area.getText().contains("..")) {
            Area.setText("Error!");
        }
    }//GEN-LAST:event_DOTActionPerformed

    private void PLUSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PLUSActionPerformed
        if (!(Area.getText().contains(" + ") || Area.getText().contains(" - ") || Area.getText().contains("*") || Area.getText().contains("/") || Area.getText().contains("%"))) {
            Str = Area.getText() + " + ";
            Area.setText(Str);
            decimalPointEntered = false;
        }
    }//GEN-LAST:event_PLUSActionPerformed
    private void SUBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SUBActionPerformed
        if (!(Area.getText().contains(" + ") || Area.getText().contains(" - ") || Area.getText().contains("*") || Area.getText().contains("/") || Area.getText().contains("%"))) {
            Str = Area.getText() + " - ";
            Area.setText(Str);
            decimalPointEntered = false;
        }
    }//GEN-LAST:event_SUBActionPerformed
    private void MULTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MULTActionPerformed
        if (!(Area.getText().contains(" + ") || Area.getText().contains(" - ") || Area.getText().contains("*") || Area.getText().contains("/") || Area.getText().contains("%"))) {
            Str = Area.getText() + " * ";
            Area.setText(Str);
            decimalPointEntered = false;
        }
    }//GEN-LAST:event_MULTActionPerformed

    private void DIVIDEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DIVIDEActionPerformed
        if (!(Area.getText().contains(" + ") || Area.getText().contains(" - ") || Area.getText().contains("*") || Area.getText().contains("/") || Area.getText().contains("%"))) {
            Str = Area.getText() + " / ";
            Area.setText(Str);
            decimalPointEntered = false;
        }
    }//GEN-LAST:event_DIVIDEActionPerformed

    private void CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CActionPerformed
        decimalPointEntered = false;
        Clear();
    }//GEN-LAST:event_CActionPerformed

    private void PLUSMINUSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PLUSMINUSActionPerformed
        try {
            float num = Float.parseFloat(String.valueOf(Area.getText()));
            num = num * (-1);
            Area.setText(String.valueOf(num));
        } catch (Exception e) {
            Area.setText("Error!");
        }
        decimalPointEntered = true;
    }//GEN-LAST:event_PLUSMINUSActionPerformed

    private void bsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsActionPerformed
        if (!(Area.getText().contains("Error!") || Area.getText().contains("Infinity") || Area.getText().contains("NaN"))) {
            String backSp = null;
            if (Area.getText().length() > 0) {
                StringBuilder Stringb = new StringBuilder(Area.getText());
                Stringb.deleteCharAt(Area.getText().length() - 1);
                backSp = Stringb.toString();
                Area.setText(backSp);
                decimalPointEntered = false;
            }
        }
    }//GEN-LAST:event_bsActionPerformed

    private void EQUALSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EQUALSActionPerformed
        try {
            int l = Area.getText().length();

            Num1 = Double.parseDouble(Str.substring(0, Str.indexOf(" ")));
            Num2 = Double.parseDouble(Str.substring(Str.indexOf(" ") + 2, l));
            Op = Str.substring(Str.indexOf(" ") + 1, Str.indexOf(" ") + 2);
            History.setText(String.valueOf(Area.getText() + " ="));

            switch (Op) {
                case "+" ->
                    Result = Num1 + Num2;
                case "-" ->
                    Result = Num1 - Num2;
                case "*" ->
                    Result = Num1 * Num2;
                case "/" ->
                    Result = Num1 / Num2;
                case "^" ->
                    Result = Math.pow(Num1, Num2);
                default ->
                    Area.setText("");
            }

            Area.setText(String.format("%.2f", Result));

            decimalPointEntered = true;
        } catch (Exception e) {
            Area.setText("Error!");
        }

    }//GEN-LAST:event_EQUALSActionPerformed

    private void PERCENTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PERCENTActionPerformed
        try {
            if (!(Area.getText().contains(" + ") || Area.getText().contains(" - ") || Area.getText().contains(" * ") || Area.getText().contains(" / ") || Area.getText().contains(" % "))) {
                Str = Area.getText() + " % " + " ";
                Result = Double.parseDouble(Area.getText()) / 100;
                Area.setText(String.valueOf(Result));
            }

        } catch (Exception e) {
            Area.setText("Error!");
        }
        decimalPointEntered = true;
    }//GEN-LAST:event_PERCENTActionPerformed

    private void ROOTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ROOTActionPerformed
        try {
            Result = Math.sqrt(Double.parseDouble(Area.getText()));
            Area.setText(String.format("%.3f", Result));
        } catch (Exception e) {
            Area.setText("Error!");
        }
        decimalPointEntered = true;
    }//GEN-LAST:event_ROOTActionPerformed

    private void SQUAREActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SQUAREActionPerformed
        try {
            if ((Area.getText().contains("+")) || Area.getText().contains("-") || Area.getText().contains(("*")) || Area.getText().contains("/") || Area.getText().contains("%")) {
                String n1 = Str.substring(0, Str.indexOf(" ")) + " ";
                String n2 = Str.substring(Str.indexOf(" ") + 2, Area.getText().length());
                Op = Str.substring(Str.indexOf(" ") + 1, Str.indexOf(" ") + 3);
                n2 = String.valueOf(Math.pow(Float.parseFloat(n2), 2));
                Area.setText(n1 + Op + n2);

            } else {
                Result = Math.pow(Double.parseDouble(Area.getText()), 2);
                Area.setText(String.format("%.3f", Result));
            }

        } catch (Exception e) {
            Area.setText("Error!");
        }
        decimalPointEntered = true;
    }//GEN-LAST:event_SQUAREActionPerformed

    private void FRACTIONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FRACTIONActionPerformed
        try {
            Result = Math.pow(Double.parseDouble(Area.getText()), -1);
            Area.setText(String.format("%.7f", Result));
        } catch (Exception e) {
            Area.setText("Error!");
        }
        decimalPointEntered = true;
    }//GEN-LAST:event_FRACTIONActionPerformed

    private void expActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expActionPerformed
        try {
            if (!(Area.getText().contains(" + ") || Area.getText().contains(" - ") || Area.getText().contains(" * ") || Area.getText().contains(" / ") || Area.getText().contains("^") || Area.getText().contains(" % "))) {

                Area.setText(Area.getText() + " ^ ");
            }

        } catch (Exception e) {
            Area.setText("Error!");
        }
        decimalPointEntered = true;
    }//GEN-LAST:event_expActionPerformed

    private void piActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_piActionPerformed
        try {
            if ((Area.getText().equals("")||Area.getText().contains(" + ") || Area.getText().contains(" - ") || Area.getText().contains(" * ") || Area.getText().contains(" / ") || Area.getText().contains(" % "))) {

                Area.setText(Area.getText() + "3.14");
            }
        } catch (Exception e) {
            Area.setText("Error!");
        }
        decimalPointEntered = true;
    }//GEN-LAST:event_piActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Basic_Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Basic_Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Basic_Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Basic_Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Basic_Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Area;
    private javax.swing.JButton BTN0;
    private javax.swing.JButton BTN1;
    private javax.swing.JButton BTN2;
    private javax.swing.JButton BTN3;
    private javax.swing.JButton BTN4;
    private javax.swing.JButton BTN5;
    private javax.swing.JButton BTN6;
    private javax.swing.JButton BTN7;
    private javax.swing.JButton BTN8;
    private javax.swing.JButton BTN9;
    public javax.swing.JButton C;
    private javax.swing.JButton DIVIDE;
    private javax.swing.JButton DOT;
    private javax.swing.JButton EQUALS;
    private javax.swing.JButton FRACTION;
    private java.awt.TextField History;
    private javax.swing.JButton MULT;
    private javax.swing.JButton PERCENT;
    private javax.swing.JButton PLUS;
    private javax.swing.JButton PLUSMINUS;
    private javax.swing.JButton ROOT;
    private javax.swing.JButton SQUARE;
    private javax.swing.JButton SUB;
    private javax.swing.JButton bs;
    private javax.swing.JButton exp;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton pi;
    // End of variables declaration//GEN-END:variables
}
