package grafico;

import java.awt.Color;
import java.awt.Graphics;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Formatter;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Interfaz extends javax.swing.JFrame {

    public Interfaz() {
        setIconImage(new ImageIcon(getClass().getResource("/Imagen/LOGO.png")).getImage());
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        javax.swing.JLabel jLabel5 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel6 = new javax.swing.JLabel();
        Ats = new javax.swing.JComboBox<>();
        Dfs = new javax.swing.JComboBox<>();
        Rats = new javax.swing.JLabel();
        Rdfs = new javax.swing.JLabel();
        javax.swing.JPanel jPanel2 = new javax.swing.JPanel();
        javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel3 = new javax.swing.JLabel();
        At = new javax.swing.JComboBox<>();
        Df = new javax.swing.JComboBox<>();
        Rat = new javax.swing.JLabel();
        Rdf = new javax.swing.JLabel();
        javax.swing.JPanel jPanel4 = new javax.swing.JPanel();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        PS = new javax.swing.JComboBox<>();
        Rps = new javax.swing.JLabel();
        Nombre = new javax.swing.JTextField();
        javax.swing.JLabel jLabel11 = new javax.swing.JLabel();
        javax.swing.JPanel jPanel5 = new javax.swing.JPanel();
        javax.swing.JButton jButton1 = new javax.swing.JButton();
        javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel7 = new javax.swing.JLabel();
        Vel = new javax.swing.JComboBox<>();
        Juez = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabel9 = new javax.swing.JLabel();
        Per = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabel10 = new javax.swing.JLabel();
        PO = new javax.swing.JComboBox<>();
        Rvel = new javax.swing.JLabel();
        Rpo = new javax.swing.JLabel();
        javax.swing.JLabel jLabel8 = new javax.swing.JLabel();
        javax.swing.JButton Guardar = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(204, 0, 0));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("At. Esp");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Def. Esp");

        Ats.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sleccione", "Cojea un poco", "No esta mal", "Notable", "Genial", "Espectacular", "Inmejorable" }));
        Ats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtsActionPerformed(evt);
            }
        });

        Dfs.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sleccione", "Cojea un poco", "No esta mal", "Notable", "Genial", "Espectacular", "Inmejorable" }));
        Dfs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DfsActionPerformed(evt);
            }
        });

        Rats.setForeground(new java.awt.Color(255, 255, 255));
        Rats.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Rdfs.setForeground(new java.awt.Color(255, 255, 255));
        Rdfs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(43, 43, 43))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Rdfs, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Dfs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Rats, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Ats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Rats, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Dfs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Rdfs, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        jPanel2.setBackground(new java.awt.Color(204, 0, 0));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Ataque");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Defensa");

        At.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sleccione", "Cojea un poco", "No esta mal", "Notable", "Genial", "Espectacular", "Inmejorable" }));
        At.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtActionPerformed(evt);
            }
        });

        Df.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sleccione", "Cojea un poco", "No esta mal", "Notable", "Genial", "Espectacular", "Inmejorable" }));
        Df.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DfActionPerformed(evt);
            }
        });

        Rat.setForeground(new java.awt.Color(255, 255, 255));
        Rat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Rdf.setForeground(new java.awt.Color(255, 255, 255));
        Rdf.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(At, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Rat, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Rdf, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Df, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(At, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Rat, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Df, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Rdf, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        jPanel4.setBackground(new java.awt.Color(204, 0, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PS");

        PS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sleccione", "Cojea un poco", "No esta mal", "Notable", "Genial", "Espectacular", "Inmejorable" }));
        PS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PSActionPerformed(evt);
            }
        });

        Rps.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Nombre del Pokémon");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Nombre)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Rps, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(426, 426, 426))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                            .addComponent(PS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(389, 389, 389)))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel11))
                .addGap(1, 1, 1)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Rps, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(204, 0, 0));

        jButton1.setText("Verificar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Velocidad");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Juez");

        Vel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sleccione", "Cojea un poco", "No esta mal", "Notable", "Genial", "Espectacular", "Inmejorable" }));
        Vel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VelActionPerformed(evt);
            }
        });

        Juez.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Potencial aceptable", "Potencial superior a la media", "Potencial excelente", "Potencial extraordinario" }));
        Juez.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JuezActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Personalidad");

        Per.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Le encanta comer", "Esta orgulloso de su fuerza", "Se caracteriza por su cuerpo resistente", "Es extremadamente curioso", "Se distingue por ser muy voluntarioso", "Le gusta correr", "A menudo se duerme", "Le gusta revolverse", "Es un buen fajador", "Le gusta hacer travesuras", "Es algo orgulloso", "Siempre tiene el oido alerta", "Duerme mucho", "A veces se enfada", "Es muy persistente", "Es muy astuto", "Es muy insolente", "Resulta algo impetuoso y bobo", "Suele desordenar cosas", "Le gusta luchar", "Muy resistente", "A menudo esta en babia", "Odia perder", "Es un poco payaso", "Le gusta relajarse", "Tiene mal genio", "Es muy perseverante", "Es muy melindroso", "Es un poco cabezota", "Huye rapido" }));
        Per.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PerActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Tipo de poder oculto");

        PO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Lucha", "Volador", "Veneno", "Tierra", "Roca", "Bicho", "Fantasma", "Acero", "Fuego", "Agua", "Planta", "Electrico", "Psiquico", "Hielo", "Dragon", "Siniestro" }));
        PO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                POActionPerformed(evt);
            }
        });

        Rvel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Rpo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Potencia de Poder oculto:");

        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addGap(157, 157, 157)
                        .addComponent(jLabel10))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Juez, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(80, 80, 80))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(Per, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(122, 122, 122)
                        .addComponent(PO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(119, 119, 119))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Rpo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(120, 120, 120))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Rvel, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(406, 406, 406))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(Vel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(396, 396, 396))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Vel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Rvel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Per, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Juez, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(Rpo, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Guardar)
                    .addComponent(jButton1))
                .addGap(54, 54, 54))
        );

        jPanel6.setBackground(new java.awt.Color(51, 255, 255));
        jPanel6.setFocusCycleRoot(true);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 345, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    Calculo C = new Calculo();
    
    private boolean listo(JComboBox<String> ps,JComboBox<String> at,JComboBox<String> df,JComboBox<String> vel,JComboBox<String> dfs,JComboBox<String> ats,JComboBox<String> juez,JComboBox<String> per,JComboBox<String> PO){
        boolean ready = true;
        JComboBox stat[] = {ps,at,df,vel,dfs,ats,juez,per,PO};
        for(int i=0;i<stat.length;i++){
            if(stat[i].getSelectedIndex() == 0){
                ready = false;
            }
        }
        return ready;
    }
    
    private boolean ver = false;

    public boolean isVer() {
        return ver;
    }

    public void setVer(boolean ver) {
        this.ver = ver;
    }
    
    private int HP;
    private int AT;
    private int DF;
    private int ATS;
    private int DFS;
    private int VEL;

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getAT() {
        return AT;
    }

    public void setAT(int AT) {
        this.AT = AT;
    }

    public int getDF() {
        return DF;
    }

    public void setDF(int DF) {
        this.DF = DF;
    }

    public int getATS() {
        return ATS;
    }

    public void setATS(int ATS) {
        this.ATS = ATS;
    }

    public int getDFS() {
        return DFS;
    }

    public void setDFS(int DFS) {
        this.DFS = DFS;
    }

    public int getVEL() {
        return VEL;
    }

    public void setVEL(int VEL) {
        this.VEL = VEL;
    }
    
    private int[] ca(int iv, int s){
        int cor[] = new int[2];
        switch(s){
            case 0:cor[0] =(int) (iv*Math.cos(1.57));cor[1] =(int) (iv*Math.sin(1.57)); break;//PS
            case 1:cor[0] =(int) (iv*Math.cos(0.52));cor[1] =(int) (iv*Math.sin(0.52));break;//AT
            case 2:cor[0] =(int) (iv*Math.cos(-0.52));cor[1] =(int) (iv*Math.sin(-0.52));break;//DF
            case 3:cor[0] =(int) (iv*Math.cos(-1.57));cor[1] =(int) (iv*Math.sin(-1.57));break;//VEL
            case 4:cor[0] =(int) (iv*Math.cos(-2.62));cor[1] =(int) (iv*Math.sin(-2.62));break;//DFS
            case 5:cor[0] =(int) (iv*Math.cos(2.62));cor[1] =(int) (iv*Math.sin(2.62));break;//ATS
        }
        return cor;
    }
    
    private int tran(int r){
        return (r*((15971/85)/32));
    }
    
    private int[] multip(int[] a,double m,int ej){
        int [] b = new int[a.length];
        int t;
        if(ej == 0){
            t = 244;
        }else{
            t = 160;
        }
        for(int i = 0;i<a.length;i++){
            b[i]=(int) (a[i]*m)+t;
        }
        return b;
    }
    
    private void dibujaHex(Graphics g, int[] Px, int[] Py){
        g.drawLine(Px[0], Py[0], Px[3], Py[3]);
        g.drawLine(Px[1], Py[1], Px[4], Py[4]);
        g.drawLine(Px[2], Py[2], Px[5], Py[5]);
        int [] bx = multip(Px,0.5,0);
        int [] by = multip(Py,0.5,1);
        for(int i = 1;i<Px.length;i++){
            g.drawLine(bx[i-1], by[i-1], bx[i], by[i]);
        }
        g.drawLine(bx[5], by[5], bx[0], by[0]);
        //g.setColor(Color.BLACK);
    }
    
    @Override
    @SuppressWarnings("empty-statement")
    public void paint(Graphics g){
        super.paint(g);
        
        int[] Px = {488, 627, 627, 488, 350, 350};
        int[] Py = {160, 240, 400, 480, 400, 240};
        
        //System.out.println("Px: "+Arrays.toString(Px)+"\nPy: "+Arrays.toString(Py));
        
        g.drawPolygon(Px, Py, 6);
        g.setColor(Color.white);
        g.fillPolygon(Px, Py, 6);
        g.setColor(Color.BLACK);
        dibujaHex(g,Px,Py);
        if (isVer()){
            int [] Rx = {ca(VEL,0)[0], ca(DF,1)[0], ca(AT,2)[0], ca(HP,3)[0], ca(ATS,4)[0], ca(DFS,5)[0]};
            int []Ry = {ca(VEL,0)[1], ca(DF,1)[1], ca(AT,2)[1], ca(HP,3)[1], ca(ATS,4)[1], ca(DFS,5)[1]};
            //System.out.println("Antes:\nRx: "+Arrays.toString(Rx)+"\n"+"Ry: "+Arrays.toString(Ry)+"\n");
            for (int i = 0;i<6;i++){
                Rx[i] = Rx[i]+488;
                Ry[i] = Ry[i]+320;
            }
            //System.out.println("Despues:\nRx: "+Arrays.toString(Rx)+"\n"+"Ry: "+Arrays.toString(Ry)+"\n");
            g.drawPolygon(Rx, Ry, 6);
            g.setColor(Color.BLUE);
            g.fillPolygon(Rx, Ry, 6);
            g.setColor(Color.BLACK);
            dibujaHex(g,Px,Py);
        }
    }

    private void AtsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtsActionPerformed
        // TODO add your handling code here:
        this.repaint();
    }//GEN-LAST:event_AtsActionPerformed
    
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(listo(PS,At,Df,Vel,Dfs,Ats,Juez,PO,Per)){
            /*
            System.out.println( "PS:  "+PS.getItemAt(PS.getSelectedIndex())+"\n"+
                            "AT:  "+At.getItemAt(At.getSelectedIndex())+"\n"+
                            "DF:  "+Df.getItemAt(Df.getSelectedIndex())+"\n"+
                            "ATS: "+Ats.getItemAt(Ats.getSelectedIndex())+"\n"+
                            "DFS: "+Dfs.getItemAt(Dfs.getSelectedIndex())+"\n"+
                            "VEL: "+Vel.getItemAt(Vel.getSelectedIndex())+"\n");
            */
            C.calcular(PS.getSelectedIndex(), 
                    At.getSelectedIndex(), 
                    Df.getSelectedIndex(), 
                    Ats.getSelectedIndex(), 
                    Dfs.getSelectedIndex(), 
                    Vel.getSelectedIndex(), 
                    Juez.getSelectedIndex(), 
                    PO.getSelectedIndex(), 
                    Per.getSelectedIndex());
            Rps.setText(""+C.getPS());
            Rat.setText(""+C.getAT());
            Rdf.setText(""+C.getDF());
            Rvel.setText(""+C.getVEL());
            Rdfs.setText(""+C.getDFS());
            Rats.setText(""+C.getATS());
            Rpo.setText(""+C.getPpo());
            HP = tran(C.getPS());
            AT = tran(C.getAT());
            DF = tran(C.getDF());
            ATS = tran(C.getATS());
            DFS = tran(C.getDFS());
            VEL = tran(C.getVEL());
            setVer(true);
            this.repaint();
            
        }else{
            JOptionPane.showMessageDialog(null, "Todos los campos deben llenarse");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void VelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VelActionPerformed
        // TODO add your handling code here:
        this.repaint();
    }//GEN-LAST:event_VelActionPerformed

    private void PSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PSActionPerformed
        // TODO add your handling code here:
        this.repaint();
    }//GEN-LAST:event_PSActionPerformed

    private void AtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtActionPerformed
        // TODO add your handling code here:
        this.repaint();
    }//GEN-LAST:event_AtActionPerformed

    private void DfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DfActionPerformed
        // TODO add your handling code here:
        this.repaint();
    }//GEN-LAST:event_DfActionPerformed

    private void DfsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DfsActionPerformed
        // TODO add your handling code here:
        this.repaint();
    }//GEN-LAST:event_DfsActionPerformed

    private void POActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_POActionPerformed
        // TODO add your handling code here:
        this.repaint();
    }//GEN-LAST:event_POActionPerformed

    private void PerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PerActionPerformed
        // TODO add your handling code here:
        this.repaint();
    }//GEN-LAST:event_PerActionPerformed

    private void JuezActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JuezActionPerformed
        // TODO add your handling code here:
        this.repaint();
    }//GEN-LAST:event_JuezActionPerformed
    
    
    
    static String barra = File.separator;
    static String ubi =System.getProperty("user.dir")+barra+"Informes Pokémon"+barra;
    static String nom;
    File Cubi = new File(ubi);
    File Anom;
    public int cont;

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }
    
    private void crear(String nom,int cont,String[] dat){
        String nnom = nom+".txt";
        Anom = new File(ubi+nnom);
        if(!Anom.exists()){
            try{
                Cubi.mkdirs();
                Formatter crea = new Formatter(ubi+nnom);
                crea.format("%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s",
                            "Nombre: "+dat[0],
                            "IV PS:........................."+dat[1],
                            "IV Ataque:....................."+dat[2],
                            "IV Defensa:...................."+dat[3],
                            "IV At. Esp:...................."+dat[4],
                            "IV Df. Esp:...................."+dat[5],
                            "IV Velocidad:.................."+dat[6],
                            "Potencia de Poder oculto:......"+dat[7]);
                crea.close();
                JOptionPane.showMessageDialog(null, "Se han guardado los datos en \n"+ubi+nnom);
            }catch(FileNotFoundException e){System.out.println("Algo salio mal...");}
        }else{
            System.out.println("");
            int ant = cont;
            cont += 1;
            if(cont == 1){
                nom = nom+"("+cont+")";
            }else{
                nom = nom.replace("("+ant+")", "("+cont+")");
            }
            crear(nom,cont,dat);
        }
    }
    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        // TODO add your handling code here:
        if(listo(PS,At,Df,Vel,Dfs,Ats,Juez,PO,Per)){
            if(Nombre.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Escribe el nombre de tu pokémon");
            }else{
                nom = Nombre.getText();
                String datos[] = {Nombre.getText(),Rps.getText(),Rat.getText(),Rdf.getText(),Rats.getText(),Rdfs.getText(),Rvel.getText(),Rpo.getText()}; 
                crear(nom,0,datos);
                
            }
        }else{
            JOptionPane.showMessageDialog(null, "Todos los campos deben llenarse");
        }
    }//GEN-LAST:event_GuardarActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JComboBox<String> At;
    javax.swing.JComboBox<String> Ats;
    javax.swing.JComboBox<String> Df;
    javax.swing.JComboBox<String> Dfs;
    javax.swing.JComboBox<String> Juez;
    javax.swing.JTextField Nombre;
    javax.swing.JComboBox<String> PO;
    javax.swing.JComboBox<String> PS;
    javax.swing.JComboBox<String> Per;
    javax.swing.JLabel Rat;
    javax.swing.JLabel Rats;
    javax.swing.JLabel Rdf;
    javax.swing.JLabel Rdfs;
    javax.swing.JLabel Rpo;
    javax.swing.JLabel Rps;
    javax.swing.JLabel Rvel;
    javax.swing.JComboBox<String> Vel;
    javax.swing.JPanel jPanel1;
    javax.swing.JPanel jPanel3;
    javax.swing.JPanel jPanel6;
    // End of variables declaration//GEN-END:variables
}
