package interfaces;

import classes.FondoMain;
import interfaces.itinerarios.IFrameNewItinerario;
import interfaces.sesiones.IFrameSesiones;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.net.URL;
import javax.help.HelpBroker;
import javax.help.HelpSet;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.UIManager;
import tools.Util;

/**
 *
 * @author USUARIO
 */
public class FrameMain extends javax.swing.JFrame {

    private Util tools = new Util();

    public FrameMain() {
        initComponents();
        //tools.conectarBaseDatos();
        iniciarAyuda();//revisar
        setLocationRelativeTo(null);

        // Pone icono en el Jmenu
        URL url = getClass().getClassLoader().getResource("images/logotipo.png");
        setIconImage(new ImageIcon(url).getImage());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JDesktopPane();
        jToolBar2 = new javax.swing.JToolBar();
        BotonFondo1 = new javax.swing.JButton();
        BotonFondo2 = new javax.swing.JButton();
        BotonFondo3 = new javax.swing.JButton();
        BotonFondo4 = new javax.swing.JButton();
        barraMenu = new javax.swing.JMenuBar();
        menuEntrenamiento = new javax.swing.JMenu();
        menuNuevoEntrenamiento = new javax.swing.JMenuItem();
        menuConsultaEntrenamientos = new javax.swing.JMenuItem();
        menuItinerarios = new javax.swing.JMenu();
        menuNuevoItinerario = new javax.swing.JMenuItem();
        menuConsultaItinerarios = new javax.swing.JMenuItem();
        menuResumenes = new javax.swing.JMenu();
        menuResumen = new javax.swing.JMenuItem();
        menuPerfil = new javax.swing.JMenu();
        menuEscalador = new javax.swing.JMenuItem();
        menuAyuda = new javax.swing.JMenu();
        ayuda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Extreme Climbing");

        panel.setBackground(new java.awt.Color(255, 255, 255));

        jToolBar2.setBackground(new java.awt.Color(153, 153, 153));
        jToolBar2.setFloatable(false);
        jToolBar2.setRollover(true);

        BotonFondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondo1.jpg"))); // NOI18N
        BotonFondo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonFondo1ActionPerformed(evt);
            }
        });

        BotonFondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondo2.jpg"))); // NOI18N
        BotonFondo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonFondo2ActionPerformed(evt);
            }
        });

        BotonFondo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondo3.jpg"))); // NOI18N
        BotonFondo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonFondo3ActionPerformed(evt);
            }
        });

        BotonFondo4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondo4.jpg"))); // NOI18N
        BotonFondo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonFondo4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addGap(0, 470, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(BotonFondo3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotonFondo4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(BotonFondo1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotonFondo2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(14, 14, 14))))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonFondo1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonFondo2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonFondo3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonFondo4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 205, Short.MAX_VALUE)
                .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panel.setLayer(jToolBar2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panel.setLayer(BotonFondo1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panel.setLayer(BotonFondo2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panel.setLayer(BotonFondo3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panel.setLayer(BotonFondo4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        menuEntrenamiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/entrenamiento.png"))); // NOI18N
        menuEntrenamiento.setText("Entrenamiento");
        menuEntrenamiento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        menuNuevoEntrenamiento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        menuNuevoEntrenamiento.setText("Nueva sesión");
        menuEntrenamiento.add(menuNuevoEntrenamiento);

        menuConsultaEntrenamientos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        menuConsultaEntrenamientos.setText("Consultar sesiones");
        menuConsultaEntrenamientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultaEntrenamientosActionPerformed(evt);
            }
        });
        menuEntrenamiento.add(menuConsultaEntrenamientos);

        barraMenu.add(menuEntrenamiento);

        menuItinerarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/itinerario.jpg"))); // NOI18N
        menuItinerarios.setText("Itinerarios");
        menuItinerarios.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        menuNuevoItinerario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        menuNuevoItinerario.setText("Nuevo itinerario");
        menuNuevoItinerario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNuevoItinerarioActionPerformed(evt);
            }
        });
        menuItinerarios.add(menuNuevoItinerario);

        menuConsultaItinerarios.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        menuConsultaItinerarios.setText("Consultar itinerarios");
        menuItinerarios.add(menuConsultaItinerarios);

        barraMenu.add(menuItinerarios);

        menuResumenes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/resumenes.png"))); // NOI18N
        menuResumenes.setText("Resúmenes");
        menuResumenes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        menuResumen.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        menuResumen.setText("Rendimiento");
        menuResumenes.add(menuResumen);

        barraMenu.add(menuResumenes);

        menuPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/perfil.jpeg"))); // NOI18N
        menuPerfil.setText("Perfil");
        menuPerfil.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        menuEscalador.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        menuEscalador.setText("Escalador");
        menuPerfil.add(menuEscalador);

        barraMenu.add(menuPerfil);

        menuAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/interrogacion3.png"))); // NOI18N
        menuAyuda.setText("?");
        menuAyuda.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        ayuda.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ayuda.setText("Ayúdame");
        menuAyuda.add(ayuda);

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

    private void menuConsultaEntrenamientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsultaEntrenamientosActionPerformed
        cerrarDialogosAbiertos();
        IFrameSesiones iFrameSesiones = new IFrameSesiones(panel);
        panel.add(iFrameSesiones);
        iFrameSesiones.setVisible(true);
    }//GEN-LAST:event_menuConsultaEntrenamientosActionPerformed


    private void BotonFondo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonFondo1ActionPerformed
        //poner imagen(fondo1) al jDesktopPane
        panel.setBorder(new FondoMain("1"));
    }//GEN-LAST:event_BotonFondo1ActionPerformed

    private void BotonFondo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonFondo2ActionPerformed
        //poner imagen(fondo2) al jDesktopPane
        panel.setBorder(new FondoMain("2"));
    }//GEN-LAST:event_BotonFondo2ActionPerformed

    private void BotonFondo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonFondo3ActionPerformed
        //poner imagen(fondo3) al jDesktopPane
        panel.setBorder(new FondoMain("3"));
    }//GEN-LAST:event_BotonFondo3ActionPerformed

    private void BotonFondo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonFondo4ActionPerformed
        //poner imagen(fondo4) al jDesktopPane
        panel.setBorder(new FondoMain("4"));
    }//GEN-LAST:event_BotonFondo4ActionPerformed

    private void menuNuevoItinerarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNuevoItinerarioActionPerformed
        
        cerrarDialogosAbiertos();
        IFrameNewItinerario iFrameNewItinerario = new IFrameNewItinerario(panel);
        panel.add(iFrameNewItinerario);
        iFrameNewItinerario.setVisible(true);
        
    }//GEN-LAST:event_menuNuevoItinerarioActionPerformed

    /**
     * Método para iniciar la ayuda.
     */
    private void iniciarAyuda() {
        try {
            // Carga el fichero de ayuda
            File fichero = new File("help" + File.separator + "help_set.hs");
            URL hsURL = fichero.toURI().toURL();
            // Crea el HelpSet y el HelpBroker
            HelpSet helpset = new HelpSet(getClass().getClassLoader(), hsURL);
            HelpBroker hb = helpset.createHelpBroker();
            // Pone ayuda a item de menu al pulsarlo y a F1 en ventana
            // principal y secundaria.
            hb.enableHelpKey(getRootPane(), "indice", helpset);
            hb.enableHelpOnButton(ayuda, "indice", helpset);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

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

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("images/logotipoSinLetras.png"));
        return retValue;
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
    private javax.swing.JButton BotonFondo1;
    private javax.swing.JButton BotonFondo2;
    private javax.swing.JButton BotonFondo3;
    private javax.swing.JButton BotonFondo4;
    private javax.swing.JMenuItem ayuda;
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JMenu menuAyuda;
    private javax.swing.JMenuItem menuConsultaEntrenamientos;
    private javax.swing.JMenuItem menuConsultaItinerarios;
    private javax.swing.JMenu menuEntrenamiento;
    private javax.swing.JMenuItem menuEscalador;
    private javax.swing.JMenu menuItinerarios;
    private javax.swing.JMenuItem menuNuevoEntrenamiento;
    private javax.swing.JMenuItem menuNuevoItinerario;
    private javax.swing.JMenu menuPerfil;
    private javax.swing.JMenuItem menuResumen;
    private javax.swing.JMenu menuResumenes;
    private javax.swing.JDesktopPane panel;
    // End of variables declaration//GEN-END:variables
}
