/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_progra2;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.Import;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author HP_AMD_64
 */
public class Gui_vonito extends javax.swing.JFrame {

    /**
     * Creates new form Gui_vonito
     */
    public Gui_vonito() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        bt_guardar = new javax.swing.JButton();
        rb_m = new javax.swing.JRadioButton();
        rb_f = new javax.swing.JRadioButton();
        tf_nombre = new javax.swing.JTextField();
        tf_identidad = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tf_estadoCivil = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        sp_edad = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        rb_familia = new javax.swing.JRadioButton();
        rb_empleado = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        tf_marca = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        sl_calidad = new javax.swing.JSlider();
        jLabel7 = new javax.swing.JLabel();
        sp_tamagno = new javax.swing.JSpinner();
        bt_crearObj = new javax.swing.JButton();
        cb_color = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        ta_desc = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        cb_duenos = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        rb_zapatos = new javax.swing.JRadioButton();
        rb_ropa = new javax.swing.JRadioButton();
        rb_odh = new javax.swing.JRadioButton();
        jLabel15 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        bt_encriptar = new javax.swing.JButton();
        tf_encript = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_mensajes = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bt_guardar.setText("Guardar");
        bt_guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_guardarMouseClicked(evt);
            }
        });

        buttonGroup1.add(rb_m);
        rb_m.setSelected(true);
        rb_m.setText("Masculino");

        buttonGroup1.add(rb_f);
        rb_f.setText("Femenino");

        jLabel1.setText("Nombre");

        jLabel2.setText("Identidad");

        jLabel3.setText("Sexo");

        jLabel4.setText("Estado civil");

        jLabel6.setText("Edad");

        buttonGroup2.add(rb_familia);
        rb_familia.setText("Familia");
        rb_familia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_familiaActionPerformed(evt);
            }
        });

        buttonGroup2.add(rb_empleado);
        rb_empleado.setSelected(true);
        rb_empleado.setText("Empleado");

        jLabel11.setText("Familia o Empleado?");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(216, 216, 216)
                .addComponent(bt_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rb_empleado)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(rb_familia)
                                .addGap(14, 14, 14)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_estadoCivil)
                                    .addComponent(tf_nombre)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(rb_m)
                                        .addGap(32, 32, 32)
                                        .addComponent(rb_f))
                                    .addComponent(tf_identidad))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(sp_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(354, 354, 354))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_identidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_estadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_m)
                    .addComponent(rb_f)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sp_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(rb_familia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rb_empleado)
                .addGap(54, 54, 54)
                .addComponent(bt_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Nuevo persona", jPanel1);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(145, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Eliminar persona", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 704, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 374, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Modificar persona", jPanel3);

        jLabel12.setText("Color");

        jLabel13.setText("Marca");

        jLabel14.setText("tamaño");

        sl_calidad.setBackground(new java.awt.Color(0, 255, 0));
        sl_calidad.setMajorTickSpacing(1);
        sl_calidad.setMaximum(10);
        sl_calidad.setMinimum(1);
        sl_calidad.setMinorTickSpacing(1);
        sl_calidad.setPaintLabels(true);

        jLabel7.setText("Calidad");

        bt_crearObj.setText("Crear Objeto");
        bt_crearObj.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_crearObjMouseClicked(evt);
            }
        });

        cb_color.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "blue", "red", "yellow", "black" }));

        ta_desc.setColumns(20);
        ta_desc.setRows(5);
        jScrollPane3.setViewportView(ta_desc);

        jLabel9.setText("Descripcion");

        cb_duenos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_duenosItemStateChanged(evt);
            }
        });

        jLabel10.setText("Dueño");

        buttonGroup3.add(rb_zapatos);
        rb_zapatos.setSelected(true);
        rb_zapatos.setText("Zapatos");

        buttonGroup3.add(rb_ropa);
        rb_ropa.setText("ropa");
        rb_ropa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_ropaActionPerformed(evt);
            }
        });

        buttonGroup3.add(rb_odh);
        rb_odh.setText("Objetos del hogar");

        jLabel15.setText("Tipos de objetos");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(sl_calidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(bt_crearObj)
                .addGap(277, 277, 277))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jLabel7))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_marca, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sp_tamagno, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(cb_duenos, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rb_zapatos)
                            .addComponent(rb_ropa)
                            .addComponent(rb_odh)
                            .addComponent(jLabel15))
                        .addContainerGap())
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jLabel9)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(cb_color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tf_marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(sp_tamagno, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(jLabel7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(cb_duenos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel15)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sl_calidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rb_zapatos))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(bt_crearObj))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(rb_ropa)
                        .addGap(18, 18, 18)
                        .addComponent(rb_odh)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Nuevo Objeto", jPanel4);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 704, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 374, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Modificar objeto", jPanel5);

        bt_encriptar.setText("Encriptar y mandar");
        bt_encriptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_encriptarMouseClicked(evt);
            }
        });
        bt_encriptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_encriptarActionPerformed(evt);
            }
        });

        jLabel8.setText("Texto a encriptar");

        ta_mensajes.setColumns(20);
        ta_mensajes.setRows(5);
        jScrollPane1.setViewportView(ta_mensajes);

        jLabel5.setText("Mensajes");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addComponent(tf_encript, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(178, 178, 178)
                                .addComponent(jLabel8))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt_encriptar)
                                .addGap(50, 50, 50))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel5)))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(tf_encript, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_encriptar)))
                .addContainerGap(134, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab6", jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rb_familiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_familiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_familiaActionPerformed

    private void bt_guardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_guardarMouseClicked
        String nombre;
        int id, edad, flag = 0;
        double altura = 0, peso = 0;
        String estado_civil;
        String sexo = " ", rol = " ", trab = " ";
        String ocupacion = " ";
        String horario = "";
        int semanas_laboradas = 0;
        double sueldo = 0.0;
        try {
            nombre = tf_nombre.getText();
            id = Integer.parseInt(tf_identidad.getText());
            estado_civil = tf_estadoCivil.getText();

            if (rb_m.isSelected()) {
                sexo = "Masculino";
            } else {
                sexo = "Femenino";
            }
            edad = (Integer) sp_edad.getValue();
            if (rb_familia.isSelected()) {

                flag = 1;
                rol = JOptionPane.showInputDialog("ingrese su rol en la casa");
                trab = JOptionPane.showInputDialog("ingrese en que trabaja");
                altura = Double.parseDouble(JOptionPane.showInputDialog("ingrese su altura"));
                peso = Double.parseDouble(JOptionPane.showInputDialog("ingrese peso"));

            } else {
                flag = 2;
                ocupacion = JOptionPane.showInputDialog("ingrese su rol en la casa");
                horario = JOptionPane.showInputDialog("ingrese su horario en esta casa");
                semanas_laboradas = Integer.parseInt(JOptionPane.showInputDialog("ingrese cuantas semanas ha trabajado aqui"));
                sueldo = Double.parseDouble(JOptionPane.showInputDialog("ingrese su sueldo, por favor, no mienta"));

            }

            if (flag == 1) {
                persona.add(new Familiar(rol, trab, altura, peso, nombre, edad, id, sexo, estado_civil));
            } else {
                persona.add(new Personal(ocupacion, horario, semanas_laboradas, sueldo, nombre, edad, id, sexo, estado_civil));
            }
            Persona xe = new Persona(nombre, edad, id, sexo, estado_civil);

            DefaultComboBoxModel modelo = (DefaultComboBoxModel) cb_duenos.getModel();
            modelo.addElement(xe);
            cb_duenos.setModel(modelo);
        } catch (NumberFormatException e) {
            System.out.println("ocurrio un error con un numero, intente de nuevo");
        } catch (Exception e) {

            System.out.println("ocurrio un error fatal, caso siguente");
            e.printStackTrace();
        }


    }//GEN-LAST:event_bt_guardarMouseClicked

    private void bt_encriptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_encriptarMouseClicked


    }//GEN-LAST:event_bt_encriptarMouseClicked

    private void bt_encriptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_encriptarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_encriptarActionPerformed

    private void bt_crearObjMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_crearObjMouseClicked

        Color color = Color.white;
        int ban = 0;
        switch (cb_color.getSelectedIndex()) {
            case 0:
                color = Color.BLUE;
                break;
            case 1:
                color = Color.red;
                break;
            case 2:
                color = Color.yellow;
                break;
            case 3:
                color = Color.black;
                break;
            default:
                color = Color.black;
        }

        String marca = tf_marca.getText();
        String descripcion = ta_desc.getText();
        int calidad = sl_calidad.getValue();
        int tamano = ((int) (sp_tamagno.getValue()));
        String suela= "";
        String material="";
        String pais="";
        int talla=0,confort=0;
        
        if (rb_zapatos.isSelected()) {
            ban = 1;
        }
        if (rb_ropa.isSelected()) {
            ban = 2;
        }
        if (rb_odh.isSelected()) {
            ban = 3;
        }
        if (ban == 1) {
            suela=JOptionPane.showInputDialog("Ingrese la suela");
            talla=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la talla"));
            confort=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el confort"));
            if (confort<1||confort>10) {
                confort=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el cofort, de 1 a 10"));
            }
            objetos.add(new Zapatos(tamano, suela, confort, color, descripcion, marca, tamano, calidad, talla, suela));
        } else if (ban == 2) {
            talla=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la talla"));
            material=JOptionPane.showInputDialog("Ingrese el material");
            pais=JOptionPane.showInputDialog("Ingrese el pais de origen");
            objetos.add(new Ropa(talla, material, pais, color, descripcion, marca, tamano, calidad, tamano, suela));
        } else {

        }

        

    }//GEN-LAST:event_bt_crearObjMouseClicked

    private void cb_duenosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_duenosItemStateChanged

    }//GEN-LAST:event_cb_duenosItemStateChanged

    private void rb_ropaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_ropaActionPerformed

    }//GEN-LAST:event_rb_ropaActionPerformed

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
            java.util.logging.Logger.getLogger(Gui_vonito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gui_vonito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gui_vonito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gui_vonito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gui_vonito().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_crearObj;
    private javax.swing.JButton bt_encriptar;
    private javax.swing.JButton bt_guardar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JComboBox<String> cb_color;
    private javax.swing.JComboBox<String> cb_duenos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton rb_empleado;
    private javax.swing.JRadioButton rb_f;
    private javax.swing.JRadioButton rb_familia;
    private javax.swing.JRadioButton rb_m;
    private javax.swing.JRadioButton rb_odh;
    private javax.swing.JRadioButton rb_ropa;
    private javax.swing.JRadioButton rb_zapatos;
    private javax.swing.JSlider sl_calidad;
    private javax.swing.JSpinner sp_edad;
    private javax.swing.JSpinner sp_tamagno;
    private javax.swing.JTextArea ta_desc;
    private javax.swing.JTextArea ta_mensajes;
    private javax.swing.JTextField tf_encript;
    private javax.swing.JTextField tf_estadoCivil;
    private javax.swing.JTextField tf_identidad;
    private javax.swing.JTextField tf_marca;
    private javax.swing.JTextField tf_nombre;
    // End of variables declaration//GEN-END:variables
ArrayList<Persona> persona = new ArrayList();
    ArrayList<Objeto> objetos = new ArrayList();
    Persona selecc;

}
