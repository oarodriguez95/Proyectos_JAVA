package interfazGrafica;

import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class Ventana extends javax.swing.JFrame {

    private float num1;
    private float num2;
    private float resultado;
    private String operacion = "nula";
    private boolean activado = true;
    private boolean bandera = true;
    private boolean punto = true;

    public Ventana() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/icono.png")));
    }

    //Este metodo se invoca al presionar para agregar el elemento correspodiente al boton presionado
    public void agregarCaracter(String digito) {
        if (txtResultado.getText().equals("0") || txtResultado.getText().equals("Error")) {
            txtResultado.setText(digito);
        } else {
            //se valida que no hayan mas elementos de los que cabe en la pantalla
            if (txtResultado.getText().length() < 10) {
                txtResultado.setText(txtResultado.getText() + digito);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtOperacion = new javax.swing.JLabel();
        txtResultado = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnNegPos = new javax.swing.JButton();
        btnPorcentaje = new javax.swing.JButton();
        btnResultado = new javax.swing.JButton();
        btnInfo = new javax.swing.JButton();
        btnNueve = new javax.swing.JButton();
        btnSeis = new javax.swing.JButton();
        btnOcho = new javax.swing.JButton();
        btnSiete = new javax.swing.JButton();
        btnBorrarDigito = new javax.swing.JButton();
        btnCinco = new javax.swing.JButton();
        btnCuatro = new javax.swing.JButton();
        btnPunto = new javax.swing.JButton();
        btnCero = new javax.swing.JButton();
        btnUno = new javax.swing.JButton();
        btnDos = new javax.swing.JButton();
        btnTres = new javax.swing.JButton();
        btnDivision = new javax.swing.JButton();
        btnMultipicacion = new javax.swing.JButton();
        btnRestar = new javax.swing.JButton();
        btnSumar = new javax.swing.JButton();
        btnPotenciaCuadrado = new javax.swing.JButton();
        btnPotenciaCubica = new javax.swing.JButton();
        btnRaizCuadrada = new javax.swing.JButton();
        btnUnoSobreX = new javax.swing.JButton();
        btnBorrarTodo = new javax.swing.JButton();

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
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(241, 242, 243));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtOperacion.setBackground(new java.awt.Color(0, 0, 0));
        txtOperacion.setFont(new java.awt.Font("Work Sans", 0, 20)); // NOI18N
        txtOperacion.setForeground(new java.awt.Color(40, 40, 40));
        txtOperacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel2.add(txtOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 53, 310, 34));

        txtResultado.setBackground(new java.awt.Color(0, 0, 0));
        txtResultado.setFont(new java.awt.Font("Work Sans", 0, 55)); // NOI18N
        txtResultado.setForeground(new java.awt.Color(40, 40, 40));
        txtResultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtResultado.setText("0");
        jPanel2.add(txtResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 93, 310, 62));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 160));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNegPos.setFont(new java.awt.Font("Work Sans", 0, 20)); // NOI18N
        btnNegPos.setForeground(new java.awt.Color(40, 40, 40));
        btnNegPos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/boton1.png"))); // NOI18N
        btnNegPos.setText("+/-");
        btnNegPos.setToolTipText("");
        btnNegPos.setBorder(null);
        btnNegPos.setBorderPainted(false);
        btnNegPos.setContentAreaFilled(false);
        btnNegPos.setFocusPainted(false);
        btnNegPos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNegPos.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/boton1Hover.png"))); // NOI18N
        btnNegPos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNegPosActionPerformed(evt);
            }
        });
        jPanel4.add(btnNegPos, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 70, 60));

        btnPorcentaje.setFont(new java.awt.Font("Work Sans", 0, 28)); // NOI18N
        btnPorcentaje.setForeground(new java.awt.Color(40, 40, 40));
        btnPorcentaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/boton1.png"))); // NOI18N
        btnPorcentaje.setText("%");
        btnPorcentaje.setToolTipText("");
        btnPorcentaje.setBorder(null);
        btnPorcentaje.setBorderPainted(false);
        btnPorcentaje.setContentAreaFilled(false);
        btnPorcentaje.setFocusPainted(false);
        btnPorcentaje.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPorcentaje.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/boton1Hover.png"))); // NOI18N
        btnPorcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPorcentajeActionPerformed(evt);
            }
        });
        jPanel4.add(btnPorcentaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 70, 60));

        btnResultado.setFont(new java.awt.Font("Work Sans", 0, 28)); // NOI18N
        btnResultado.setForeground(new java.awt.Color(254, 254, 255));
        btnResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonOperacion.png"))); // NOI18N
        btnResultado.setText("=");
        btnResultado.setToolTipText("");
        btnResultado.setBorder(null);
        btnResultado.setBorderPainted(false);
        btnResultado.setContentAreaFilled(false);
        btnResultado.setFocusPainted(false);
        btnResultado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnResultado.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonOperacionPressed.png"))); // NOI18N
        btnResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultadoActionPerformed(evt);
            }
        });
        jPanel4.add(btnResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 70, 60));

        btnInfo.setFont(new java.awt.Font("Work Sans", 0, 28)); // NOI18N
        btnInfo.setForeground(new java.awt.Color(40, 40, 40));
        btnInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonInfo.png"))); // NOI18N
        btnInfo.setToolTipText("");
        btnInfo.setBorder(null);
        btnInfo.setBorderPainted(false);
        btnInfo.setContentAreaFilled(false);
        btnInfo.setFocusPainted(false);
        btnInfo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnInfo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonInfoPressed.png"))); // NOI18N
        btnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoActionPerformed(evt);
            }
        });
        jPanel4.add(btnInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 70, 60));

        btnNueve.setFont(new java.awt.Font("Work Sans", 0, 28)); // NOI18N
        btnNueve.setForeground(new java.awt.Color(40, 40, 40));
        btnNueve.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonNum.png"))); // NOI18N
        btnNueve.setText("9");
        btnNueve.setToolTipText("");
        btnNueve.setBorder(null);
        btnNueve.setBorderPainted(false);
        btnNueve.setContentAreaFilled(false);
        btnNueve.setFocusPainted(false);
        btnNueve.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNueve.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonNumPressed.png"))); // NOI18N
        btnNueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNueveActionPerformed(evt);
            }
        });
        jPanel4.add(btnNueve, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 70, 60));

        btnSeis.setFont(new java.awt.Font("Work Sans", 0, 28)); // NOI18N
        btnSeis.setForeground(new java.awt.Color(40, 40, 40));
        btnSeis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonNum.png"))); // NOI18N
        btnSeis.setText("6");
        btnSeis.setToolTipText("");
        btnSeis.setBorder(null);
        btnSeis.setBorderPainted(false);
        btnSeis.setContentAreaFilled(false);
        btnSeis.setFocusPainted(false);
        btnSeis.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSeis.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonNumPressed.png"))); // NOI18N
        btnSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeisActionPerformed(evt);
            }
        });
        jPanel4.add(btnSeis, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 70, 60));

        btnOcho.setFont(new java.awt.Font("Work Sans", 0, 28)); // NOI18N
        btnOcho.setForeground(new java.awt.Color(40, 40, 40));
        btnOcho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonNum.png"))); // NOI18N
        btnOcho.setText("8");
        btnOcho.setToolTipText("");
        btnOcho.setBorder(null);
        btnOcho.setBorderPainted(false);
        btnOcho.setContentAreaFilled(false);
        btnOcho.setFocusPainted(false);
        btnOcho.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnOcho.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonNumPressed.png"))); // NOI18N
        btnOcho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOchoActionPerformed(evt);
            }
        });
        jPanel4.add(btnOcho, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 70, 60));

        btnSiete.setFont(new java.awt.Font("Work Sans", 0, 28)); // NOI18N
        btnSiete.setForeground(new java.awt.Color(40, 40, 40));
        btnSiete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonNum.png"))); // NOI18N
        btnSiete.setText("7");
        btnSiete.setToolTipText("");
        btnSiete.setBorder(null);
        btnSiete.setBorderPainted(false);
        btnSiete.setContentAreaFilled(false);
        btnSiete.setFocusPainted(false);
        btnSiete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSiete.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonNumPressed.png"))); // NOI18N
        btnSiete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSieteActionPerformed(evt);
            }
        });
        jPanel4.add(btnSiete, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 70, 60));

        btnBorrarDigito.setFont(new java.awt.Font("Work Sans", 0, 28)); // NOI18N
        btnBorrarDigito.setForeground(new java.awt.Color(40, 40, 40));
        btnBorrarDigito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonIcon.png"))); // NOI18N
        btnBorrarDigito.setToolTipText("");
        btnBorrarDigito.setBorder(null);
        btnBorrarDigito.setBorderPainted(false);
        btnBorrarDigito.setContentAreaFilled(false);
        btnBorrarDigito.setFocusPainted(false);
        btnBorrarDigito.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBorrarDigito.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonIconPressed.png"))); // NOI18N
        btnBorrarDigito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarDigitoActionPerformed(evt);
            }
        });
        jPanel4.add(btnBorrarDigito, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 70, 60));

        btnCinco.setFont(new java.awt.Font("Work Sans", 0, 28)); // NOI18N
        btnCinco.setForeground(new java.awt.Color(40, 40, 40));
        btnCinco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonNum.png"))); // NOI18N
        btnCinco.setText("5");
        btnCinco.setToolTipText("");
        btnCinco.setBorder(null);
        btnCinco.setBorderPainted(false);
        btnCinco.setContentAreaFilled(false);
        btnCinco.setFocusPainted(false);
        btnCinco.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCinco.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonNumPressed.png"))); // NOI18N
        btnCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCincoActionPerformed(evt);
            }
        });
        jPanel4.add(btnCinco, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 70, 60));

        btnCuatro.setFont(new java.awt.Font("Work Sans", 0, 28)); // NOI18N
        btnCuatro.setForeground(new java.awt.Color(40, 40, 40));
        btnCuatro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonNum.png"))); // NOI18N
        btnCuatro.setText("4");
        btnCuatro.setToolTipText("");
        btnCuatro.setBorder(null);
        btnCuatro.setBorderPainted(false);
        btnCuatro.setContentAreaFilled(false);
        btnCuatro.setFocusPainted(false);
        btnCuatro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCuatro.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonNumPressed.png"))); // NOI18N
        btnCuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuatroActionPerformed(evt);
            }
        });
        jPanel4.add(btnCuatro, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 70, 60));

        btnPunto.setFont(new java.awt.Font("Work Sans", 0, 28)); // NOI18N
        btnPunto.setForeground(new java.awt.Color(40, 40, 40));
        btnPunto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonNum.png"))); // NOI18N
        btnPunto.setText(".");
        btnPunto.setToolTipText("");
        btnPunto.setBorder(null);
        btnPunto.setBorderPainted(false);
        btnPunto.setContentAreaFilled(false);
        btnPunto.setFocusPainted(false);
        btnPunto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPunto.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonNumPressed.png"))); // NOI18N
        btnPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPuntoActionPerformed(evt);
            }
        });
        jPanel4.add(btnPunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 70, 60));

        btnCero.setFont(new java.awt.Font("Work Sans", 0, 28)); // NOI18N
        btnCero.setForeground(new java.awt.Color(40, 40, 40));
        btnCero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonNum.png"))); // NOI18N
        btnCero.setText("0");
        btnCero.setToolTipText("");
        btnCero.setBorder(null);
        btnCero.setBorderPainted(false);
        btnCero.setContentAreaFilled(false);
        btnCero.setFocusPainted(false);
        btnCero.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCero.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonNumPressed.png"))); // NOI18N
        btnCero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCeroActionPerformed(evt);
            }
        });
        jPanel4.add(btnCero, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 70, 60));

        btnUno.setFont(new java.awt.Font("Work Sans", 0, 28)); // NOI18N
        btnUno.setForeground(new java.awt.Color(40, 40, 40));
        btnUno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonNum.png"))); // NOI18N
        btnUno.setText("1");
        btnUno.setToolTipText("");
        btnUno.setBorder(null);
        btnUno.setBorderPainted(false);
        btnUno.setContentAreaFilled(false);
        btnUno.setFocusPainted(false);
        btnUno.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUno.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonNumPressed.png"))); // NOI18N
        btnUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnoActionPerformed(evt);
            }
        });
        jPanel4.add(btnUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 70, 60));

        btnDos.setFont(new java.awt.Font("Work Sans", 0, 28)); // NOI18N
        btnDos.setForeground(new java.awt.Color(40, 40, 40));
        btnDos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonNum.png"))); // NOI18N
        btnDos.setText("2");
        btnDos.setToolTipText("");
        btnDos.setBorder(null);
        btnDos.setBorderPainted(false);
        btnDos.setContentAreaFilled(false);
        btnDos.setFocusPainted(false);
        btnDos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDos.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonNumPressed.png"))); // NOI18N
        btnDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDosActionPerformed(evt);
            }
        });
        jPanel4.add(btnDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 70, 60));

        btnTres.setFont(new java.awt.Font("Work Sans", 0, 28)); // NOI18N
        btnTres.setForeground(new java.awt.Color(40, 40, 40));
        btnTres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonNum.png"))); // NOI18N
        btnTres.setText("3");
        btnTres.setToolTipText("");
        btnTres.setBorder(null);
        btnTres.setBorderPainted(false);
        btnTres.setContentAreaFilled(false);
        btnTres.setFocusPainted(false);
        btnTres.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTres.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonNumPressed.png"))); // NOI18N
        btnTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTresActionPerformed(evt);
            }
        });
        jPanel4.add(btnTres, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 70, 60));

        btnDivision.setFont(new java.awt.Font("Work Sans", 0, 28)); // NOI18N
        btnDivision.setForeground(new java.awt.Color(254, 254, 255));
        btnDivision.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonOperacion.png"))); // NOI18N
        btnDivision.setText("/");
        btnDivision.setToolTipText("");
        btnDivision.setBorder(null);
        btnDivision.setBorderPainted(false);
        btnDivision.setContentAreaFilled(false);
        btnDivision.setFocusPainted(false);
        btnDivision.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDivision.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonOperacionPressed.png"))); // NOI18N
        btnDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisionActionPerformed(evt);
            }
        });
        jPanel4.add(btnDivision, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 70, 60));

        btnMultipicacion.setFont(new java.awt.Font("Work Sans", 0, 25)); // NOI18N
        btnMultipicacion.setForeground(new java.awt.Color(254, 254, 255));
        btnMultipicacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonOperacion.png"))); // NOI18N
        btnMultipicacion.setText("X");
        btnMultipicacion.setToolTipText("");
        btnMultipicacion.setBorder(null);
        btnMultipicacion.setBorderPainted(false);
        btnMultipicacion.setContentAreaFilled(false);
        btnMultipicacion.setFocusPainted(false);
        btnMultipicacion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMultipicacion.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonOperacionPressed.png"))); // NOI18N
        btnMultipicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultipicacionActionPerformed(evt);
            }
        });
        jPanel4.add(btnMultipicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 70, 60));

        btnRestar.setFont(new java.awt.Font("Work Sans", 0, 28)); // NOI18N
        btnRestar.setForeground(new java.awt.Color(254, 254, 255));
        btnRestar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonOperacion.png"))); // NOI18N
        btnRestar.setText("-");
        btnRestar.setToolTipText("");
        btnRestar.setBorder(null);
        btnRestar.setBorderPainted(false);
        btnRestar.setContentAreaFilled(false);
        btnRestar.setFocusPainted(false);
        btnRestar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRestar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonOperacionPressed.png"))); // NOI18N
        btnRestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestarActionPerformed(evt);
            }
        });
        jPanel4.add(btnRestar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 70, 60));

        btnSumar.setFont(new java.awt.Font("Work Sans", 0, 28)); // NOI18N
        btnSumar.setForeground(new java.awt.Color(254, 254, 255));
        btnSumar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonOperacion.png"))); // NOI18N
        btnSumar.setText("+");
        btnSumar.setToolTipText("");
        btnSumar.setBorder(null);
        btnSumar.setBorderPainted(false);
        btnSumar.setContentAreaFilled(false);
        btnSumar.setFocusPainted(false);
        btnSumar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSumar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonOperacionPressed.png"))); // NOI18N
        btnSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumarActionPerformed(evt);
            }
        });
        jPanel4.add(btnSumar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 70, 60));

        btnPotenciaCuadrado.setFont(new java.awt.Font("Work Sans", 0, 18)); // NOI18N
        btnPotenciaCuadrado.setForeground(new java.awt.Color(40, 40, 40));
        btnPotenciaCuadrado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/boton1.png"))); // NOI18N
        btnPotenciaCuadrado.setText("x^2");
        btnPotenciaCuadrado.setToolTipText("");
        btnPotenciaCuadrado.setBorder(null);
        btnPotenciaCuadrado.setBorderPainted(false);
        btnPotenciaCuadrado.setContentAreaFilled(false);
        btnPotenciaCuadrado.setFocusPainted(false);
        btnPotenciaCuadrado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPotenciaCuadrado.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/boton1Hover.png"))); // NOI18N
        btnPotenciaCuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPotenciaCuadradoActionPerformed(evt);
            }
        });
        jPanel4.add(btnPotenciaCuadrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 70, 60));

        btnPotenciaCubica.setFont(new java.awt.Font("Work Sans", 0, 18)); // NOI18N
        btnPotenciaCubica.setForeground(new java.awt.Color(40, 40, 40));
        btnPotenciaCubica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/boton1.png"))); // NOI18N
        btnPotenciaCubica.setText("x^3");
        btnPotenciaCubica.setToolTipText("");
        btnPotenciaCubica.setBorder(null);
        btnPotenciaCubica.setBorderPainted(false);
        btnPotenciaCubica.setContentAreaFilled(false);
        btnPotenciaCubica.setFocusPainted(false);
        btnPotenciaCubica.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPotenciaCubica.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/boton1Hover.png"))); // NOI18N
        btnPotenciaCubica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPotenciaCubicaActionPerformed(evt);
            }
        });
        jPanel4.add(btnPotenciaCubica, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 70, 60));

        btnRaizCuadrada.setFont(new java.awt.Font("Work Sans", 0, 28)); // NOI18N
        btnRaizCuadrada.setForeground(new java.awt.Color(40, 40, 40));
        btnRaizCuadrada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/boton1.png"))); // NOI18N
        btnRaizCuadrada.setText("√");
        btnRaizCuadrada.setToolTipText("");
        btnRaizCuadrada.setBorder(null);
        btnRaizCuadrada.setBorderPainted(false);
        btnRaizCuadrada.setContentAreaFilled(false);
        btnRaizCuadrada.setFocusPainted(false);
        btnRaizCuadrada.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRaizCuadrada.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/boton1Hover.png"))); // NOI18N
        btnRaizCuadrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRaizCuadradaActionPerformed(evt);
            }
        });
        jPanel4.add(btnRaizCuadrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 70, 60));

        btnUnoSobreX.setFont(new java.awt.Font("Work Sans", 0, 20)); // NOI18N
        btnUnoSobreX.setForeground(new java.awt.Color(40, 40, 40));
        btnUnoSobreX.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/boton1.png"))); // NOI18N
        btnUnoSobreX.setText("1/x");
        btnUnoSobreX.setToolTipText("");
        btnUnoSobreX.setBorder(null);
        btnUnoSobreX.setBorderPainted(false);
        btnUnoSobreX.setContentAreaFilled(false);
        btnUnoSobreX.setFocusPainted(false);
        btnUnoSobreX.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUnoSobreX.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/boton1Hover.png"))); // NOI18N
        btnUnoSobreX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnoSobreXActionPerformed(evt);
            }
        });
        jPanel4.add(btnUnoSobreX, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 70, 60));

        btnBorrarTodo.setFont(new java.awt.Font("Work Sans", 0, 28)); // NOI18N
        btnBorrarTodo.setForeground(new java.awt.Color(40, 40, 40));
        btnBorrarTodo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/boton1.png"))); // NOI18N
        btnBorrarTodo.setText("C");
        btnBorrarTodo.setToolTipText("");
        btnBorrarTodo.setBorder(null);
        btnBorrarTodo.setBorderPainted(false);
        btnBorrarTodo.setContentAreaFilled(false);
        btnBorrarTodo.setFocusPainted(false);
        btnBorrarTodo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBorrarTodo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/boton1Hover.png"))); // NOI18N
        btnBorrarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarTodoActionPerformed(evt);
            }
        });
        jPanel4.add(btnBorrarTodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 60));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 330, 320));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNegPosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNegPosActionPerformed
        //Primero valido que el numero no sea Cero
        if (!txtResultado.getText().equals("0") && !txtResultado.getText().equals("")) {
            if (txtResultado.getText().charAt(0) != '-') {
                txtResultado.setText("-" + txtResultado.getText());
            } else {
                txtResultado.setText(txtResultado.getText().substring(1, txtResultado.getText().length()));
            }
        }
    }//GEN-LAST:event_btnNegPosActionPerformed

    private void btnDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisionActionPerformed
        if (activado) {
            num1 = Float.parseFloat(txtResultado.getText());
            txtOperacion.setText(txtResultado.getText() + "/");
            operacion = "division";
            txtResultado.setText("");
            activado = false;
        }
    }//GEN-LAST:event_btnDivisionActionPerformed

    private void btnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoActionPerformed
        JOptionPane.showMessageDialog(this, "Calculadora hecha por Oscar Rodriguez",
                                          "INFORMACION",
                                          JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnInfoActionPerformed

    private void btnSieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSieteActionPerformed
        agregarCaracter("7");
    }//GEN-LAST:event_btnSieteActionPerformed

    private void btnOchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOchoActionPerformed
        agregarCaracter("8");
    }//GEN-LAST:event_btnOchoActionPerformed

    private void btnNueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNueveActionPerformed
        agregarCaracter("9");
    }//GEN-LAST:event_btnNueveActionPerformed

    private void btnCuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuatroActionPerformed
        agregarCaracter("4");
    }//GEN-LAST:event_btnCuatroActionPerformed

    private void btnCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCincoActionPerformed
        agregarCaracter("5");
    }//GEN-LAST:event_btnCincoActionPerformed

    private void btnSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeisActionPerformed
        agregarCaracter("6");
    }//GEN-LAST:event_btnSeisActionPerformed

    private void btnUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnoActionPerformed
        agregarCaracter("1");
    }//GEN-LAST:event_btnUnoActionPerformed

    private void btnDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDosActionPerformed
        agregarCaracter("2");
    }//GEN-LAST:event_btnDosActionPerformed

    private void btnTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTresActionPerformed
        agregarCaracter("3");
    }//GEN-LAST:event_btnTresActionPerformed

    private void btnCeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCeroActionPerformed
        agregarCaracter("0");
    }//GEN-LAST:event_btnCeroActionPerformed

    private void btnMultipicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultipicacionActionPerformed
        if (activado) {
            num1 = Float.parseFloat(txtResultado.getText());
            txtOperacion.setText(txtResultado.getText() + "x");
            operacion = "multiplicacion";
            txtResultado.setText("");
            activado = false;
        }
    }//GEN-LAST:event_btnMultipicacionActionPerformed

    private void btnRestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestarActionPerformed
        if (activado) {
            num1 = Float.parseFloat(txtResultado.getText());
            txtOperacion.setText(txtResultado.getText() + "-");
            operacion = "resta";
            txtResultado.setText("");
            activado = false;
            bandera = true;
        }
    }//GEN-LAST:event_btnRestarActionPerformed

    private void btnSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumarActionPerformed
        if (activado) {
            num1 = Float.parseFloat(txtResultado.getText());
            txtOperacion.setText(txtResultado.getText() + "+");
            operacion = "suma";
            txtResultado.setText("");
            activado = false;
            bandera = true;
        }

    }//GEN-LAST:event_btnSumarActionPerformed

    private void btnPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPuntoActionPerformed
        if (txtResultado.getText().equals("")) {
            txtResultado.setText("0.");
        } else {
            String cadena = txtResultado.getText();
            //controlando que no se ponga mas de un punto decimal
            if (!cadena.contains(".")) {
                txtResultado.setText(txtResultado.getText() + ".");
            }
        }
    }//GEN-LAST:event_btnPuntoActionPerformed

    private void btnResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultadoActionPerformed
        if (operacion.equals("suma") && bandera) {
            num2 = Float.parseFloat(txtResultado.getText());
            resultado = num1 + num2;
            txtResultado.setText(String.valueOf(resultado));
            txtOperacion.setText(String.valueOf(num1) + "+" + String.valueOf(num2));
            operacion = "nula";
            activado = true;
        }
        if (operacion.equals("resta")) {
            num2 = Float.parseFloat(txtResultado.getText());
            resultado = num1 - num2;
            txtResultado.setText(String.valueOf(resultado));
            txtOperacion.setText(String.valueOf(num1) + "-" + String.valueOf(num2));
            operacion = "nula";
            activado = true;
        }
        if (operacion.equals("multiplicacion")) {
            num2 = Float.parseFloat(txtResultado.getText());
            resultado = num1 * num2;
            txtResultado.setText(String.valueOf(resultado));
            txtOperacion.setText(String.valueOf(num1) + "*" + String.valueOf(num2));
            operacion = "nula";
            activado = true;
        }
        if (operacion.equals("division")) {
            num2 = Float.parseFloat(txtResultado.getText());
            if (num2 == 0) {

                txtResultado.setText("Error");
                txtOperacion.setText(String.valueOf(num1) + "/" + String.valueOf(num2));
            } else {
                resultado = num1 / num2;
                txtResultado.setText(String.valueOf(String.format("%.8f", resultado)).replace(',', '.'));
                txtOperacion.setText(String.valueOf(num1) + "/" + String.valueOf(num2));
                operacion = "nula";
                activado = true;
            }
        }
    }//GEN-LAST:event_btnResultadoActionPerformed

    private void btnBorrarDigitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarDigitoActionPerformed
        if (txtResultado.getText().length() > 0) {
            String quitarUltimoDigito = txtResultado.getText().substring(0, txtResultado.getText().length() - 1);
            txtResultado.setText(quitarUltimoDigito);
        }
        if (txtResultado.getText().equals("")) {
            txtResultado.setText("0");
        }
    }//GEN-LAST:event_btnBorrarDigitoActionPerformed

    private void btnPorcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPorcentajeActionPerformed
        if (txtOperacion.getText().equals("")) {

            txtResultado.setText("0");
            txtOperacion.setText("0");

        } else if(!txtResultado.getText().equals("")) {

            float porcentaje = 0;
            float resultado = 0;

            if (operacion.equals("suma")) {

                num2 = Float.parseFloat(txtResultado.getText());
                porcentaje = num1 * (num2 / 100);
                resultado = num1 + porcentaje;
                String formatoPorcentaje = String.valueOf(String.format("%.2f", porcentaje));
                txtOperacion.setText(String.valueOf(num1) + "+" + String.valueOf(formatoPorcentaje.replace(',', '.')));
                txtResultado.setText(String.valueOf(String.format("%.2f", resultado)).replace(',', '.'));
                activado = true;
                bandera = false;

            }
            if (operacion.equals("resta")) {

                num2 = Float.parseFloat(txtResultado.getText());
                porcentaje = num1 * (num2 / 100);
                resultado = num1 - porcentaje;
                String formatoPorcentaje = String.valueOf(String.format("%.2f", porcentaje));
                txtOperacion.setText(String.valueOf(num1) + "-" + String.valueOf(formatoPorcentaje.replace(',', '.')));
                txtResultado.setText(String.valueOf(String.format("%.2f", resultado)).replace(',', '.'));
                activado = true;
                bandera = false;

            }
            if (operacion.equals("multiplicacion")) {

                num2 = Float.parseFloat(txtResultado.getText());
                porcentaje = num2 / 100;
                resultado = num1 * porcentaje;
                String formatoPorcentaje = String.valueOf(String.format("%.2f", porcentaje));
                txtOperacion.setText(String.valueOf(num1) + "*" + String.valueOf(formatoPorcentaje.replace(',', '.')));
                txtResultado.setText(String.valueOf(String.format("%.2f", resultado)).replace(',', '.'));
                activado = true;
                bandera = false;

            }
            if (operacion.equals("division")) {

                num2 = Float.parseFloat(txtResultado.getText());
                porcentaje = num2 / 100;
                resultado = num1 / porcentaje;
                String formatoPorcentaje = String.valueOf(String.format("%.2f", porcentaje));
                txtOperacion.setText(String.valueOf(num1) + "/" + String.valueOf(formatoPorcentaje.replace(',', '.')));
                txtResultado.setText(String.valueOf(String.format("%.2f", resultado)).replace(',', '.'));
                activado = true;
                bandera = false;

            }
        }

    }//GEN-LAST:event_btnPorcentajeActionPerformed

    private void btnUnoSobreXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnoSobreXActionPerformed
        num1 = 1;
        num2 = Float.parseFloat(txtResultado.getText());
        if (num2 == 0) {

            txtResultado.setText("Error");
            txtOperacion.setText(String.valueOf(num1) + "/" + String.valueOf(num2));
        } else {
            resultado = num1 / num2;
            txtResultado.setText(String.valueOf(String.format("%.7f", resultado)).replace(',', '.'));
            txtOperacion.setText(String.valueOf(num1) + "/" + String.valueOf(num2));
            operacion = "nula";
        }

    }//GEN-LAST:event_btnUnoSobreXActionPerformed

    private void btnPotenciaCuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPotenciaCuadradoActionPerformed
        num1 = Float.parseFloat(txtResultado.getText());
        float potenciaCuadrado = (float) Math.pow(num1, 2);
        txtOperacion.setText(txtResultado.getText() + "^2");
        txtResultado.setText(String.valueOf(String.format("%.2f", potenciaCuadrado)).replace(',', '.'));
    }//GEN-LAST:event_btnPotenciaCuadradoActionPerformed

    private void btnPotenciaCubicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPotenciaCubicaActionPerformed
        num1 = Float.parseFloat(txtResultado.getText());
        float potenciaCubica= (float) Math.pow(num1, 3);
        txtOperacion.setText(txtResultado.getText() + "^3");
        txtResultado.setText(String.valueOf(String.format("%.2f", potenciaCubica)).replace(',', '.'));
    }//GEN-LAST:event_btnPotenciaCubicaActionPerformed

    private void btnRaizCuadradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaizCuadradaActionPerformed
        num1 = Float.parseFloat(txtResultado.getText());
        if (num1 < 0) {
            txtOperacion.setText("sqrt(" + txtResultado.getText() + ")");
            txtResultado.setText("Error");
        } else {
            txtOperacion.setText("sqrt(" + txtResultado.getText() + ")");
            float raizCuadrada = (float) Math.sqrt(num1);
            txtResultado.setText(String.valueOf(String.format("%.7f", raizCuadrada)).replace(',', '.'));
        }
    }//GEN-LAST:event_btnRaizCuadradaActionPerformed

    private void btnBorrarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarTodoActionPerformed
        txtOperacion.setText("");
        txtResultado.setText("0");
        activado = true;
    }//GEN-LAST:event_btnBorrarTodoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrarDigito;
    private javax.swing.JButton btnBorrarTodo;
    private javax.swing.JButton btnCero;
    private javax.swing.JButton btnCinco;
    private javax.swing.JButton btnCuatro;
    private javax.swing.JButton btnDivision;
    private javax.swing.JButton btnDos;
    private javax.swing.JButton btnInfo;
    private javax.swing.JButton btnMultipicacion;
    private javax.swing.JButton btnNegPos;
    private javax.swing.JButton btnNueve;
    private javax.swing.JButton btnOcho;
    private javax.swing.JButton btnPorcentaje;
    private javax.swing.JButton btnPotenciaCuadrado;
    private javax.swing.JButton btnPotenciaCubica;
    private javax.swing.JButton btnPunto;
    private javax.swing.JButton btnRaizCuadrada;
    private javax.swing.JButton btnRestar;
    private javax.swing.JButton btnResultado;
    private javax.swing.JButton btnSeis;
    private javax.swing.JButton btnSiete;
    private javax.swing.JButton btnSumar;
    private javax.swing.JButton btnTres;
    private javax.swing.JButton btnUno;
    private javax.swing.JButton btnUnoSobreX;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel txtOperacion;
    private javax.swing.JLabel txtResultado;
    // End of variables declaration//GEN-END:variables
}
