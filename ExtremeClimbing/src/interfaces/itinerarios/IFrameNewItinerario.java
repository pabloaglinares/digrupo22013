/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces.itinerarios;

import classes.Itinerario;
import java.awt.Image;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import tools.Util;

/**
 *
 * @author USUARIO
 */
public class IFrameNewItinerario extends javax.swing.JInternalFrame {

    private JDesktopPane panel;
    private FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & GIF Images", "jpg", "gif", "jpeg");
    private String rutaImagen;
    private Util tools = Util.getInsUtil();
    private boolean flag = false;
    private Itinerario itinerario;

    /**
     * Creates new form IFrameNewSesion
     */
    public IFrameNewItinerario(JDesktopPane panel) {
        initComponents();
        this.panel = panel;
        this.setLocation(panel.getWidth() / 2 - this.getWidth() / 2, panel.getHeight() / 2 - this.getHeight() / 2);
        rutaImagen = "";
    }

    public IFrameNewItinerario(JDesktopPane panel, Itinerario itinerario, boolean flag) {
        initComponents();
        this.panel = panel;
        this.flag = flag;
        this.itinerario = itinerario;
        rellenarComponentes();
        this.setLocation(panel.getWidth() / 2 - this.getWidth() / 2, panel.getHeight() / 2 - this.getHeight() / 2);
    }

    private void rellenarComponentes() {
        fechaItinerario.setDate(itinerario.getFecha());
        inputNombre.setText(itinerario.getNombre());
        inputLocalizacion.setText(itinerario.getLocalizacion());
        setTipoItinerario(itinerario.getTipo());
        rutaImagen = itinerario.getRutaFotografia();
        BotonImg.setIcon(new ImageIcon(rutaImagen));
    }

    private void setTipoItinerario(String tipo) {

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        etNombre = new javax.swing.JLabel();
        etLocalizacion = new javax.swing.JLabel();
        inputNombre = new javax.swing.JTextField();
        inputLocalizacion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btSelectPicture = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        BotonImg = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tipo = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        fechaItinerario = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        dificultad = new javax.swing.JComboBox();
        btGuardar = new javax.swing.JButton();
        btSalir = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Alta Itinerario");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(102, 102, 102)));

        etNombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etNombre.setText("Nombre ");

        etLocalizacion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etLocalizacion.setText("Localización ");

        inputNombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        inputNombre.setForeground(new java.awt.Color(0, 51, 102));

        inputLocalizacion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        inputLocalizacion.setForeground(new java.awt.Color(0, 51, 102));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Difícultad");

        btSelectPicture.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btSelectPicture.setText("Seleccionar");
        btSelectPicture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSelectPictureActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Imagen ");

        BotonImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/noDisponible.jpg"))); // NOI18N
        BotonImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonImgActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Tipo");

        tipo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tipo.setForeground(new java.awt.Color(0, 51, 102));
        tipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Vía de escalada", "Boulder" }));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        fechaItinerario.setForeground(new java.awt.Color(0, 51, 102));
        fechaItinerario.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Fecha de resolución");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(fechaItinerario, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fechaItinerario, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        dificultad.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dificultad.setForeground(new java.awt.Color(0, 51, 102));
        dificultad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5a", "5b", "5c", "6a", "6a+", "6b", "6b+", "6c", "6c+", "7a", "7a+", "7b", "7b+", "7c", "7c+", "8a", "8a+", "8b", "8b+", "8c/8c+", "9a", "9a+", "9b", "9b+" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btSelectPicture)))
                                .addGap(10, 10, 10)
                                .addComponent(BotonImg, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etLocalizacion)
                                    .addComponent(etNombre))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inputLocalizacion)
                                    .addComponent(inputNombre)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(dificultad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etNombre)
                    .addComponent(inputNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputLocalizacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etLocalizacion))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(dificultad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonImg, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(btSelectPicture))
                        .addGap(106, 106, 106)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        btGuardar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save2.png"))); // NOI18N
        btGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardarActionPerformed(evt);
            }
        });

        btSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btsalir.png"))); // NOI18N
        btSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btSalir)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btGuardar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btSalir, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSelectPictureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSelectPictureActionPerformed
        //Creamos un objeto de JFileChooser
        JFileChooser dlg = new JFileChooser();
        //Del objeto creado vamos a llamar al metodo setFileFilter
        dlg.setFileFilter(filter);
        //Abrimos la ventana de dialogo para coger la imagen
        int option = dlg.showOpenDialog(this);
        //Si hacemos click en el boton seleccionar
        if (option == JFileChooser.APPROVE_OPTION) {
            //Obtener el nombre del archivo seleccionado
            rutaImagen = dlg.getSelectedFile().getAbsolutePath();
            //Obtener la direccion donde se guarda la imagen
            String file = dlg.getSelectedFile().getPath();
            BotonImg.setIcon(new ImageIcon(file));
            //Modificamos la imagen
            ImageIcon icon = new ImageIcon(file);
            //Extraemos la imagen del icono
            Image img = icon.getImage();
            //Cambiamos el tamaño de la imagen
            Image newimg = img.getScaledInstance(277, 215, java.awt.Image.SCALE_SMOOTH);
            //Se genera el ImageIcon con la nueva imagen
            ImageIcon newIcon = new ImageIcon(newimg);
            BotonImg.setIcon(newIcon);
            jLabel6.setVisible(false);
            jLabel6.setText(file);
        }
    }//GEN-LAST:event_btSelectPictureActionPerformed

    private void BotonImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonImgActionPerformed
        //Obtener la direccion donde se guarda la imagen
        String ruta = jLabel6.getText();
        JDImg dialog = new JDImg(null, true, ruta);
        dialog.setVisible(true);
    }//GEN-LAST:event_BotonImgActionPerformed

    private void btSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalirActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btSalirActionPerformed

    private void btGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarActionPerformed
        if (!flag) {
            Itinerario itinerario = new Itinerario();
            Date fecha = fechaItinerario.getDate();
            itinerario.setFecha(fecha);
            itinerario.setNombre(inputNombre.getText());
            itinerario.setLocalizacion(inputLocalizacion.getText());
            itinerario.setTipo(tipo.getSelectedItem().toString());
            itinerario.setDificultad(dificultad.getSelectedItem().toString());
            itinerario.setRutaFotografia(rutaImagen);
            if (tools.insertItinerario(itinerario)) {
                this.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null, "Error", "No se pudo guardar", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            tools.modificarItinerario(itinerario);
            this.setVisible(false);
        }
    }//GEN-LAST:event_btGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonImg;
    private javax.swing.JButton btGuardar;
    private javax.swing.JButton btSalir;
    private javax.swing.JButton btSelectPicture;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox dificultad;
    private javax.swing.JLabel etLocalizacion;
    private javax.swing.JLabel etNombre;
    private com.toedter.calendar.JDateChooser fechaItinerario;
    private javax.swing.JTextField inputLocalizacion;
    private javax.swing.JTextField inputNombre;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox tipo;
    // End of variables declaration//GEN-END:variables
}
