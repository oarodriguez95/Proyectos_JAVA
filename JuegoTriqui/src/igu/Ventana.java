package igu;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Ventana extends javax.swing.JFrame {

    //Variables Globales
    String turno = "X";
    JLabel[] casillas = new JLabel[9];

    //Constructor de la ventana
    public Ventana() {
        initComponents();
        casillas[0] = Casilla1;
        casillas[1] = Casilla2;
        casillas[2] = Casilla3;
        casillas[3] = Casilla4;
        casillas[4] = Casilla5;
        casillas[5] = Casilla6;
        casillas[6] = Casilla7;
        casillas[7] = Casilla8;
        casillas[8] = Casilla9;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Casilla2 = new javax.swing.JLabel();
        Casilla3 = new javax.swing.JLabel();
        Casilla1 = new javax.swing.JLabel();
        Casilla6 = new javax.swing.JLabel();
        Casilla9 = new javax.swing.JLabel();
        Casilla5 = new javax.swing.JLabel();
        Casilla4 = new javax.swing.JLabel();
        Casilla7 = new javax.swing.JLabel();
        Casilla8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Triqui");
        setPreferredSize(new java.awt.Dimension(315, 297));
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(400, 250));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 0, 0));
        jPanel2.setAlignmentX(0.0F);
        jPanel2.setAlignmentY(0.0F);

        Casilla2.setBackground(new java.awt.Color(255, 255, 255));
        Casilla2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        Casilla2.setForeground(new java.awt.Color(0, 0, 0));
        Casilla2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Casilla2.setOpaque(true);
        Casilla2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Casilla2MousePressed(evt);
            }
        });

        Casilla3.setBackground(new java.awt.Color(255, 255, 255));
        Casilla3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        Casilla3.setForeground(new java.awt.Color(0, 0, 0));
        Casilla3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Casilla3.setOpaque(true);
        Casilla3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Casilla3MousePressed(evt);
            }
        });

        Casilla1.setBackground(new java.awt.Color(255, 255, 255));
        Casilla1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        Casilla1.setForeground(new java.awt.Color(0, 0, 0));
        Casilla1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Casilla1.setOpaque(true);
        Casilla1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Casilla1MousePressed(evt);
            }
        });

        Casilla6.setBackground(new java.awt.Color(255, 255, 255));
        Casilla6.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        Casilla6.setForeground(new java.awt.Color(0, 0, 0));
        Casilla6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Casilla6.setOpaque(true);
        Casilla6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Casilla6MousePressed(evt);
            }
        });

        Casilla9.setBackground(new java.awt.Color(255, 255, 255));
        Casilla9.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        Casilla9.setForeground(new java.awt.Color(0, 0, 0));
        Casilla9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Casilla9.setOpaque(true);
        Casilla9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Casilla9MousePressed(evt);
            }
        });

        Casilla5.setBackground(new java.awt.Color(255, 255, 255));
        Casilla5.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        Casilla5.setForeground(new java.awt.Color(0, 0, 0));
        Casilla5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Casilla5.setOpaque(true);
        Casilla5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Casilla5MousePressed(evt);
            }
        });

        Casilla4.setBackground(new java.awt.Color(255, 255, 255));
        Casilla4.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        Casilla4.setForeground(new java.awt.Color(0, 0, 0));
        Casilla4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Casilla4.setOpaque(true);
        Casilla4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Casilla4MousePressed(evt);
            }
        });

        Casilla7.setBackground(new java.awt.Color(255, 255, 255));
        Casilla7.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        Casilla7.setForeground(new java.awt.Color(0, 0, 0));
        Casilla7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Casilla7.setOpaque(true);
        Casilla7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Casilla7MousePressed(evt);
            }
        });

        Casilla8.setBackground(new java.awt.Color(255, 255, 255));
        Casilla8.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        Casilla8.setForeground(new java.awt.Color(0, 0, 0));
        Casilla8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Casilla8.setOpaque(true);
        Casilla8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Casilla8MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Casilla1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Casilla4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Casilla7, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Casilla8, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                    .addComponent(Casilla5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Casilla2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Casilla6, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Casilla3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Casilla9, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Casilla2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(Casilla1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Casilla3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(Casilla6, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                    .addComponent(Casilla5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Casilla4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Casilla8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Casilla7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Casilla9, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 280, 250));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Casilla1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Casilla1MousePressed
        presionar(1);
    }//GEN-LAST:event_Casilla1MousePressed

    private void Casilla2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Casilla2MousePressed
        presionar(2);
    }//GEN-LAST:event_Casilla2MousePressed

    private void Casilla3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Casilla3MousePressed
        presionar(3);
    }//GEN-LAST:event_Casilla3MousePressed

    private void Casilla4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Casilla4MousePressed
        presionar(4);
    }//GEN-LAST:event_Casilla4MousePressed

    private void Casilla5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Casilla5MousePressed
       presionar(5);
    }//GEN-LAST:event_Casilla5MousePressed

    private void Casilla6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Casilla6MousePressed
        presionar(6);
    }//GEN-LAST:event_Casilla6MousePressed

    private void Casilla7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Casilla7MousePressed
        presionar(7);
    }//GEN-LAST:event_Casilla7MousePressed

    private void Casilla8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Casilla8MousePressed
        presionar(8);
    }//GEN-LAST:event_Casilla8MousePressed

    private void Casilla9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Casilla9MousePressed
        presionar(9);
    }//GEN-LAST:event_Casilla9MousePressed

    public void presionar(int casilla) {
        if (casillas[casilla - 1].getText().equals("")) {
            casillas[casilla - 1].setText(turno);
            comprobarGanador();
            cambiarTurno();
        }
    }
    
    public void comprobarGanador(){
        if (casillas[0].getText().equals(casillas[1].getText()) && 
            casillas[0].getText().equals(casillas[2].getText()) &&
            !casillas[0].getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ha ganado el jugador "+turno);
        }
    }

    public void cambiarTurno() {
        if (turno.equals("X")) {
            turno = "O";
        } else {
            turno = "X";
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Casilla1;
    private javax.swing.JLabel Casilla2;
    private javax.swing.JLabel Casilla3;
    private javax.swing.JLabel Casilla4;
    private javax.swing.JLabel Casilla5;
    private javax.swing.JLabel Casilla6;
    private javax.swing.JLabel Casilla7;
    private javax.swing.JLabel Casilla8;
    private javax.swing.JLabel Casilla9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
