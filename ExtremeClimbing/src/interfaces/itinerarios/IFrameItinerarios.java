package interfaces.itinerarios;

import classes.Itinerario;
import interfaces.FrameMain;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import tools.Util;

public class IFrameItinerarios extends javax.swing.JInternalFrame {

    private JDesktopPane panel;
    private Util tools = Util.getInsUtil();
    private FrameMain frame;
    
    public IFrameItinerarios(JDesktopPane panel, FrameMain frame) {
        initComponents();
        this.panel = panel;
        this.frame = frame;
        fijarAnchoColumnas();
        rellenarTabla();
        this.setLocation(panel.getWidth()/2-this.getWidth()/2,panel.getHeight()/2-this.getHeight()/2);
    }
    
    //Metodo para fijar el ancho de sa columnas y la altura de las filas
    private void fijarAnchoColumnas() {
        int[] anchos = {50, 50, 200, 200, 150, 350, 700};
        for (int i = 0; i < tabla.getColumnCount(); i++) {
            tabla.getColumnModel().getColumn(i).setMaxWidth(anchos[i]);
        }
        tabla.setRowHeight(30);
    }
    
    private void rellenarTabla(){
        DefaultTableModel modeloTabla = (DefaultTableModel) tabla.getModel();
        while (tabla.getRowCount() > 0) {
            ((DefaultTableModel) tabla.getModel()).removeRow(0);
        }
        List<Itinerario> lista = tools.devolverItinerarios();
        SimpleDateFormat sdfDate = new SimpleDateFormat("dd/MM/yyyy");
        for (int i = 0; i < lista.size(); i++) {
            String fecha = sdfDate.format(lista.get(i).getFecha());
            Object[] fila = {lista.get(i).getP_itinerario(),
                lista.get(i).getA_escalador(), lista.get(i).getNombre(),
            lista.get(i).getLocalizacion(), lista.get(i).getDificultad(), fecha,
            lista.get(i).getTipo()};
            modeloTabla.addRow(fila);
        }
        tabla.setModel(modeloTabla);
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBusquedas = new javax.swing.JPanel();
        inputBuscar = new javax.swing.JTextField();
        etDescripcion = new javax.swing.JLabel();
        etTipo = new javax.swing.JLabel();
        panelFechas = new javax.swing.JPanel();
        etFechas = new javax.swing.JLabel();
        fechaDel = new com.toedter.calendar.JDateChooser();
        etAl = new javax.swing.JLabel();
        fechaHasta = new com.toedter.calendar.JDateChooser();
        btBuscar = new javax.swing.JButton();
        btLimpiar = new javax.swing.JButton();
        tipoEntrenamiento = new javax.swing.JComboBox();
        panelTabla = new javax.swing.JPanel();
        scrolltabla = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btNuevo = new javax.swing.JButton();
        btDelete = new javax.swing.JButton();
        btSalir = new javax.swing.JButton();
        barraMenu = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        menuNuevo = new javax.swing.JMenuItem();
        menuEditar = new javax.swing.JMenu();
        menuBorrar = new javax.swing.JMenuItem();
        menuModificar = new javax.swing.JMenuItem();

        setClosable(true);
        setIconifiable(true);
        setTitle("Gestión de Itinerarios");

        panelBusquedas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Búsqueda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(0, 51, 153))); // NOI18N

        inputBuscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        inputBuscar.setForeground(new java.awt.Color(0, 51, 102));

        etDescripcion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etDescripcion.setText("Descripción");

        etTipo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etTipo.setText("Tipo");

        etFechas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etFechas.setText("Fechas del");

        fechaDel.setForeground(new java.awt.Color(0, 51, 102));
        fechaDel.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N

        etAl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etAl.setText("al");

        fechaHasta.setForeground(new java.awt.Color(0, 51, 102));
        fechaHasta.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N

        javax.swing.GroupLayout panelFechasLayout = new javax.swing.GroupLayout(panelFechas);
        panelFechas.setLayout(panelFechasLayout);
        panelFechasLayout.setHorizontalGroup(
            panelFechasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFechasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etFechas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fechaDel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etAl)
                .addGap(8, 8, 8)
                .addComponent(fechaHasta, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelFechasLayout.setVerticalGroup(
            panelFechasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFechasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFechasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etFechas)
                    .addComponent(fechaHasta, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etAl)
                    .addComponent(fechaDel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btBuscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btBuscar.setForeground(new java.awt.Color(0, 153, 0));
        btBuscar.setText("BUSCAR");

        btLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btLimpiar.setText("Limpiar");
        btLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimpiarActionPerformed(evt);
            }
        });

        tipoEntrenamiento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tipoEntrenamiento.setForeground(new java.awt.Color(0, 51, 102));
        tipoEntrenamiento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Todos", "Vía de escalada", "Boulder" }));

        javax.swing.GroupLayout panelBusquedasLayout = new javax.swing.GroupLayout(panelBusquedas);
        panelBusquedas.setLayout(panelBusquedasLayout);
        panelBusquedasLayout.setHorizontalGroup(
            panelBusquedasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBusquedasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBusquedasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBusquedasLayout.createSequentialGroup()
                        .addGroup(panelBusquedasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etDescripcion)
                            .addComponent(etTipo))
                        .addGap(22, 22, 22)
                        .addGroup(panelBusquedasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBusquedasLayout.createSequentialGroup()
                                .addComponent(inputBuscar)
                                .addContainerGap())
                            .addGroup(panelBusquedasLayout.createSequentialGroup()
                                .addComponent(tipoEntrenamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                                .addComponent(panelFechas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBusquedasLayout.createSequentialGroup()
                        .addComponent(btLimpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btBuscar)
                        .addContainerGap())))
        );
        panelBusquedasLayout.setVerticalGroup(
            panelBusquedasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBusquedasLayout.createSequentialGroup()
                .addGroup(panelBusquedasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etDescripcion))
                .addGroup(panelBusquedasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBusquedasLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(panelBusquedasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etTipo)
                            .addComponent(tipoEntrenamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelBusquedasLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(panelFechas, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBusquedasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btBuscar)
                    .addComponent(btLimpiar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelTabla.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Entrenamientos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(0, 51, 102))); // NOI18N

        tabla.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "ESC", "NOMBRE", "LOCALIZACION", "DIFICULTAD", "FECHA", "TIPO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        scrolltabla.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setResizable(false);
            tabla.getColumnModel().getColumn(1).setResizable(false);
            tabla.getColumnModel().getColumn(2).setResizable(false);
            tabla.getColumnModel().getColumn(3).setResizable(false);
            tabla.getColumnModel().getColumn(4).setResizable(false);
            tabla.getColumnModel().getColumn(5).setResizable(false);
            tabla.getColumnModel().getColumn(6).setResizable(false);
        }

        javax.swing.GroupLayout panelTablaLayout = new javax.swing.GroupLayout(panelTabla);
        panelTabla.setLayout(panelTablaLayout);
        panelTablaLayout.setHorizontalGroup(
            panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrolltabla)
                .addContainerGap())
        );
        panelTablaLayout.setVerticalGroup(
            panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrolltabla, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                .addContainerGap())
        );

        btNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new2.png"))); // NOI18N
        btNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNuevoActionPerformed(evt);
            }
        });

        btDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close1.png"))); // NOI18N
        btDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteActionPerformed(evt);
            }
        });

        btSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btsalir.png"))); // NOI18N
        btSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalirActionPerformed(evt);
            }
        });

        menuArchivo.setText("Archivo");
        menuArchivo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        menuNuevo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        menuNuevo.setText("Nuevo");
        menuNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNuevoActionPerformed(evt);
            }
        });
        menuArchivo.add(menuNuevo);

        barraMenu.add(menuArchivo);

        menuEditar.setText("Editar");
        menuEditar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        menuBorrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        menuBorrar.setText("Borrar");
        menuBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBorrarActionPerformed(evt);
            }
        });
        menuEditar.add(menuBorrar);

        menuModificar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        menuModificar.setText("Modificar");
        menuModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuModificarActionPerformed(evt);
            }
        });
        menuEditar.add(menuModificar);

        barraMenu.add(menuEditar);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelBusquedas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btSalir)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBusquedas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btNuevo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimpiarActionPerformed
        inputBuscar.setText("");
        tipoEntrenamiento.setSelectedIndex(0);
        fechaDel.setDate(null);
        fechaHasta.setDate(null);
    }//GEN-LAST:event_btLimpiarActionPerformed

    private void btSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalirActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btSalirActionPerformed

    private void btDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteActionPerformed
        if (tabla.getSelectedRow() != -1) {
            int codigo = (int) tabla.getModel().getValueAt(tabla.getSelectedRow(), 0);
            tools.borrarItinerario(codigo);
            rellenarTabla();
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una fila", "Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btDeleteActionPerformed

    private void btNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNuevoActionPerformed
        frame.cerrarDialogosAbiertos();
        IFrameNewItinerario iFrameNewItinerario = new IFrameNewItinerario(panel);
        panel.add(iFrameNewItinerario);
        iFrameNewItinerario.setVisible(true);
    }//GEN-LAST:event_btNuevoActionPerformed

    private void menuNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNuevoActionPerformed
        frame.cerrarDialogosAbiertos();
        IFrameNewItinerario iFrameNewItinerario = new IFrameNewItinerario(panel);
        panel.add(iFrameNewItinerario);
        iFrameNewItinerario.setVisible(true);
    }//GEN-LAST:event_menuNuevoActionPerformed

    private void menuBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBorrarActionPerformed
        if (tabla.getSelectedRow() != -1) {
            int codigo = (int) tabla.getModel().getValueAt(tabla.getSelectedRow(), 0);
            tools.borrarItinerario(codigo);
            rellenarTabla();
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una fila", "Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_menuBorrarActionPerformed

    private void menuModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuModificarActionPerformed
        if (tabla.getSelectedRow() != -1) {
            int codigo = (int) tabla.getModel().getValueAt(tabla.getSelectedRow(), 0);
            Itinerario itinerario = tools.devolverItinerario(codigo);
            itinerario.setP_itinerario(codigo);
            frame.cerrarDialogosAbiertos();
            IFrameNewItinerario iFrameNewItinerario= new IFrameNewItinerario(panel,itinerario,true);
            panel.add(iFrameNewItinerario);
            iFrameNewItinerario.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una fila", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_menuModificarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btDelete;
    private javax.swing.JButton btLimpiar;
    private javax.swing.JButton btNuevo;
    private javax.swing.JButton btSalir;
    private javax.swing.JLabel etAl;
    private javax.swing.JLabel etDescripcion;
    private javax.swing.JLabel etFechas;
    private javax.swing.JLabel etTipo;
    private com.toedter.calendar.JDateChooser fechaDel;
    private com.toedter.calendar.JDateChooser fechaHasta;
    private javax.swing.JTextField inputBuscar;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenuItem menuBorrar;
    private javax.swing.JMenu menuEditar;
    private javax.swing.JMenuItem menuModificar;
    private javax.swing.JMenuItem menuNuevo;
    private javax.swing.JPanel panelBusquedas;
    private javax.swing.JPanel panelFechas;
    private javax.swing.JPanel panelTabla;
    private javax.swing.JScrollPane scrolltabla;
    private javax.swing.JTable tabla;
    private javax.swing.JComboBox tipoEntrenamiento;
    // End of variables declaration//GEN-END:variables
}
