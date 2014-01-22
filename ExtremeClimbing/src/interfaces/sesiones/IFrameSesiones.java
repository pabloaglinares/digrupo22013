package interfaces.sesiones;

public class IFrameSesiones extends javax.swing.JInternalFrame {


    public IFrameSesiones() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBusquedas = new javax.swing.JPanel();
        inputBuscar = new javax.swing.JTextField();
        etDescripcion = new javax.swing.JLabel();
        etTipo = new javax.swing.JLabel();
        tipoEntrenamiento = new javax.swing.JComboBox();
        panelFechas = new javax.swing.JPanel();
        etFechas1 = new javax.swing.JLabel();
        fechaDel1 = new com.toedter.calendar.JDateChooser();
        etAl1 = new javax.swing.JLabel();
        fechaHasta1 = new com.toedter.calendar.JDateChooser();
        panelTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        barraMenu = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        menuNuevo = new javax.swing.JMenuItem();
        menuEditar = new javax.swing.JMenu();
        menuBorrar = new javax.swing.JMenuItem();
        menuModificar = new javax.swing.JMenuItem();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Gestión de Entrenamientos");

        panelBusquedas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Búsqueda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(0, 51, 153))); // NOI18N

        inputBuscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        inputBuscar.setForeground(new java.awt.Color(0, 51, 102));

        etDescripcion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etDescripcion.setText("Descripción");

        etTipo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etTipo.setText("Tipo de sesión");

        tipoEntrenamiento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tipoEntrenamiento.setForeground(new java.awt.Color(0, 51, 102));
        tipoEntrenamiento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Físico", "Rocódromo", "Roca" }));

        etFechas1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etFechas1.setText("Fechas del");

        fechaDel1.setForeground(new java.awt.Color(0, 51, 102));
        fechaDel1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N

        etAl1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etAl1.setText("al");

        fechaHasta1.setForeground(new java.awt.Color(0, 51, 102));
        fechaHasta1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N

        javax.swing.GroupLayout panelFechasLayout = new javax.swing.GroupLayout(panelFechas);
        panelFechas.setLayout(panelFechasLayout);
        panelFechasLayout.setHorizontalGroup(
            panelFechasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFechasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etFechas1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fechaDel1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etAl1)
                .addGap(8, 8, 8)
                .addComponent(fechaHasta1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelFechasLayout.setVerticalGroup(
            panelFechasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFechasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFechasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etFechas1)
                    .addComponent(fechaHasta1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etAl1)
                    .addComponent(fechaDel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout panelBusquedasLayout = new javax.swing.GroupLayout(panelBusquedas);
        panelBusquedas.setLayout(panelBusquedasLayout);
        panelBusquedasLayout.setHorizontalGroup(
            panelBusquedasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBusquedasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBusquedasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBusquedasLayout.createSequentialGroup()
                        .addComponent(etDescripcion)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBusquedasLayout.createSequentialGroup()
                        .addComponent(etTipo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(panelBusquedasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBusquedasLayout.createSequentialGroup()
                        .addComponent(inputBuscar)
                        .addContainerGap())
                    .addGroup(panelBusquedasLayout.createSequentialGroup()
                        .addComponent(tipoEntrenamiento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelFechas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelTabla.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Entrenamientos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(0, 51, 102))); // NOI18N

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
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout panelTablaLayout = new javax.swing.GroupLayout(panelTabla);
        panelTabla.setLayout(panelTablaLayout);
        panelTablaLayout.setHorizontalGroup(
            panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 584, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelTablaLayout.setVerticalGroup(
            panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                .addContainerGap())
        );

        menuArchivo.setText("Archivo");
        menuArchivo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        menuNuevo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        menuNuevo.setText("Nuevo");
        menuArchivo.add(menuNuevo);

        barraMenu.add(menuArchivo);

        menuEditar.setText("Editar");
        menuEditar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        menuBorrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        menuBorrar.setText("Borrar");
        menuEditar.add(menuBorrar);

        menuModificar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        menuModificar.setText("Modificar");
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
                    .addComponent(panelBusquedas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBusquedas, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JLabel etAl1;
    private javax.swing.JLabel etDescripcion;
    private javax.swing.JLabel etFechas1;
    private javax.swing.JLabel etTipo;
    private com.toedter.calendar.JDateChooser fechaDel1;
    private com.toedter.calendar.JDateChooser fechaHasta1;
    private javax.swing.JTextField inputBuscar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenuItem menuBorrar;
    private javax.swing.JMenu menuEditar;
    private javax.swing.JMenuItem menuModificar;
    private javax.swing.JMenuItem menuNuevo;
    private javax.swing.JPanel panelBusquedas;
    private javax.swing.JPanel panelFechas;
    private javax.swing.JPanel panelTabla;
    private javax.swing.JComboBox tipoEntrenamiento;
    // End of variables declaration//GEN-END:variables
}
