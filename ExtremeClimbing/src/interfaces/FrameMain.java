package interfaces;

import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.UIManager;

/**
 *
 * @author USUARIO
 */
public class FrameMain extends javax.swing.JFrame {

  
    
    public FrameMain() {
        initComponents();
        setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JDesktopPane();
        jToolBar2 = new javax.swing.JToolBar();
        panelRendimiento = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        barraMenu = new javax.swing.JMenuBar();
        menuEntrenamiento = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        menuItinerarios = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        menuResumenes = new javax.swing.JMenu();
        menuPerfil = new javax.swing.JMenu();
        menuAyuda = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Extreme Climbing");

        panel.setBackground(new java.awt.Color(255, 255, 255));

        jToolBar2.setBackground(new java.awt.Color(153, 153, 153));
        jToolBar2.setFloatable(false);
        jToolBar2.setRollover(true);

        panelRendimiento.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tu rendimiento ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(0, 51, 153))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 90)); // NOI18N
        jLabel2.setText("0");

        javax.swing.GroupLayout panelRendimientoLayout = new javax.swing.GroupLayout(panelRendimiento);
        panelRendimiento.setLayout(panelRendimientoLayout);
        panelRendimientoLayout.setHorizontalGroup(
            panelRendimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRendimientoLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        panelRendimientoLayout.setVerticalGroup(
            panelRendimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRendimientoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap(473, Short.MAX_VALUE)
                .addComponent(panelRendimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelRendimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 173, Short.MAX_VALUE)
                .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panel.setLayer(jToolBar2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panel.setLayer(panelRendimiento, javax.swing.JLayeredPane.DEFAULT_LAYER);

        menuEntrenamiento.setText("Entrenamiento");
        menuEntrenamiento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem1.setText("Nueva sesión");
        menuEntrenamiento.add(jMenuItem1);

        jMenuItem2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem2.setText("Consultar sesiones");
        menuEntrenamiento.add(jMenuItem2);

        barraMenu.add(menuEntrenamiento);

        menuItinerarios.setText("Itinerarios");
        menuItinerarios.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jMenuItem3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem3.setText("Nuevo itinerario");
        menuItinerarios.add(jMenuItem3);

        jMenuItem4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem4.setText("Consultar itinerarios");
        menuItinerarios.add(jMenuItem4);

        barraMenu.add(menuItinerarios);

        menuResumenes.setText("Resúmenes");
        menuResumenes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        barraMenu.add(menuResumenes);

        menuPerfil.setText("Perfil");
        menuPerfil.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        barraMenu.add(menuPerfil);

        menuAyuda.setText("?");
        menuAyuda.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItem5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem5.setText("Ayúdame");
        menuAyuda.add(jMenuItem5);

        barraMenu.add(menuAyuda);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Cierra los dialogos abiertos antes de abrir otro que sea IFrame.
     */
    private void cerrarDialogosAbiertos() {
        Component[] componentes = panel.getComponents();
        JInternalFrame IFrameAuxiliar = null;
        for (Component componente : componentes) {
            try {
                IFrameAuxiliar = (JInternalFrame) componente;
                IFrameAuxiliar.setVisible(false);
            } catch (Exception e) {
                e.getStackTrace();
            }
        }
    }

    public static void main(String args[]) {
        /**
         * Cambia el Look and Feel.
         */
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            System.err.println("Surgió un error cambiando el Look&Feel");
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrameMain principal = new FrameMain();
                /**
                 * Inicia la aplicación Maximizada.
                 */
                principal.setExtendedState(JFrame.MAXIMIZED_BOTH);
                principal.setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JMenu menuAyuda;
    private javax.swing.JMenu menuEntrenamiento;
    private javax.swing.JMenu menuItinerarios;
    private javax.swing.JMenu menuPerfil;
    private javax.swing.JMenu menuResumenes;
    private javax.swing.JDesktopPane panel;
    private javax.swing.JPanel panelRendimiento;
    // End of variables declaration//GEN-END:variables
}
