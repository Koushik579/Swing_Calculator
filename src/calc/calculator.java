
package calc;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class calculator extends javax.swing.JFrame {
    String num="",click="";
   double a,b,r;
   int operation,decimal=0;
    String result;
    public calculator() {
        initComponents();
        try
        {
            ac.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                    {
                        field.setText("");
                        num = "";
                        click = "";
                        operation  = 5;
                        decimal = 0 ;
                        result = "";
  
                    }
            });
             del.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                    {
                        
                    }
            });
              square.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                    {
                       num = field.getText();
                       int x = Integer.valueOf(num);
                       int result = x*x;
                       field.setText(String.valueOf(result));
                    }
            });
               cube.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                    {
                        num = field.getText();
                       int x = Integer.valueOf(num);
                       int result = (x*x)*x;
                       field.setText(String.valueOf(result));
                    }
            });
                plus.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                    {
                          num = field.getText();
                          a=Double.parseDouble(num);
                          field.setText("");
                          operation = 1;
                          click = "";  
                          decimal = 0;
                    }
            });
                 minus.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                    {
                         num = field.getText();
                          a=Double.parseDouble(num);
                          field.setText("");
                          operation = 2;
                          click = "";  
                          decimal = 0;
                    }
            });
               multiply.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                    {
                          num = field.getText();
                          a=Double.parseDouble(num);
                          field.setText("");
                          operation = 3;
                          click = "";  
                          decimal = 0;
                    }
            });
               divide.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                    {
                          num = field.getText();
                          a=Double.parseDouble(num);
                          field.setText("");
                          operation = 4;
                          click = "";  
                          decimal = 0;
                    }
            });
                equals.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                    {
                         num = field.getText();
                         b = Double.parseDouble(num);
                         switch (operation)
                         {
                             case 1:
                                 r = a+b;
                                 result = String.valueOf(r);
                                 field.setText(result);
                                 break;
                             case 2:
                                 r = a-b;
                                 result = String.valueOf(r);
                                 field.setText(result);
                                 break;
                             case 3:
                                 r = a*b;
                                 result = String.valueOf(r);
                                 field.setText(result);
                                 break;
                              case 4:
                                 r = a/b;
                                 result = String.valueOf(r);
                                 field.setText(result);
                                 break;
                         }
                                 
                    }
            });
                but1.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                    {
                         
                         click += "1";
                         field.setText(click);
                    }
            });
               but2.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                    {
                         click += "2";
                         field.setText(click);
                    }
            });
               but3.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                    {
                        click += "3";
                         field.setText(click);

                    }
            });
                but4.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                    {
                        click += "4";
                         field.setText(click);

                    }
            });
               but5.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                    {
                        click += "5";
                         field.setText(click);

                    }
            });
               but6.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                    {
                        click += "6";
                         field.setText(click);

                    }
            });
               but7.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                    {
                        click += "7";
                         field.setText(click);

                    }
            });
                but8.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                    {
                        click += "8";
                         field.setText(click);

                    }
            });
               but9.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                    {
                        click += "9";
                         field.setText(click);

                    }
            });
                but0.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                    {
                        click += "0";
                         field.setText(click);

                    }
            });
               dot.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e)
                    {
                        
                        if(decimal == 0)
                        {
                            click +=".";
                            field.setText(click);
                            decimal = 1;
                        }
                        else
                        {
                            
                        }

                    }
            });
                               
                         
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
 
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        field = new javax.swing.JTextField();
        but7 = new javax.swing.JLabel();
        but8 = new javax.swing.JLabel();
        but9 = new javax.swing.JLabel();
        del = new javax.swing.JLabel();
        ac = new javax.swing.JLabel();
        but4 = new javax.swing.JLabel();
        but1 = new javax.swing.JLabel();
        but0 = new javax.swing.JLabel();
        but5 = new javax.swing.JLabel();
        but2 = new javax.swing.JLabel();
        dot = new javax.swing.JLabel();
        but6 = new javax.swing.JLabel();
        but3 = new javax.swing.JLabel();
        square = new javax.swing.JLabel();
        multiply = new javax.swing.JLabel();
        divide = new javax.swing.JLabel();
        equals = new javax.swing.JLabel();
        minus = new javax.swing.JLabel();
        cube = new javax.swing.JLabel();
        plus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        but7.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        but7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        but7.setText("7");

        but8.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        but8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        but8.setText("8");

        but9.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        but9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        but9.setText("9");

        del.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        del.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        del.setText("Del");

        ac.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        ac.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ac.setText("AC");

        but4.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        but4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        but4.setText("4");

        but1.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        but1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        but1.setText("1");

        but0.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        but0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        but0.setText("0");

        but5.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        but5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        but5.setText("5");

        but2.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        but2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        but2.setText("2");

        dot.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        dot.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dot.setText(".");

        but6.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        but6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        but6.setText("6");

        but3.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        but3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        but3.setText("3");

        square.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        square.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        square.setText("x²");

        multiply.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        multiply.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        multiply.setText("X");

        divide.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        divide.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        divide.setText("/");

        equals.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        equals.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        equals.setText("=");

        minus.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        minus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minus.setText("-");

        cube.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        cube.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cube.setText("x³");

        plus.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        plus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        plus.setText("+");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(field, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(but7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(but4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(but1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(but0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(but5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dot, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(but2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(but8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(but9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(but6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(but3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(square, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(del, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(multiply, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                            .addComponent(plus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(cube, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ac, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(divide, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(minus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(equals, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(field, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(but7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(but8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(but9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(del, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ac, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(but6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(divide, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(but4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(multiply, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(but5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(plus, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minus, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(but1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(but2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(but3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(equals, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cube, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(square, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dot, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(but0, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ac;
    private javax.swing.JLabel but0;
    private javax.swing.JLabel but1;
    private javax.swing.JLabel but2;
    private javax.swing.JLabel but3;
    private javax.swing.JLabel but4;
    private javax.swing.JLabel but5;
    private javax.swing.JLabel but6;
    private javax.swing.JLabel but7;
    private javax.swing.JLabel but8;
    private javax.swing.JLabel but9;
    private javax.swing.JLabel cube;
    private javax.swing.JLabel del;
    private javax.swing.JLabel divide;
    private javax.swing.JLabel dot;
    private javax.swing.JLabel equals;
    private javax.swing.JTextField field;
    private javax.swing.JLabel minus;
    private javax.swing.JLabel multiply;
    private javax.swing.JLabel plus;
    private javax.swing.JLabel square;
    // End of variables declaration//GEN-END:variables
}
