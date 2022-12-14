
package Proyecto_fundacion.vistas;

import Proyecto_fundacion.dao.PersonaDAO;
import Proyecto_fundacion.models.Personas;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class Listado_Estudiantes extends javax.swing.JFrame {

    Personas P = new Personas();
    PersonaDAO Pdao= new PersonaDAO();
     DefaultTableModel modelo = new DefaultTableModel();
     TableRowSorter trs = null;
    
    public Listado_Estudiantes() {
        initComponents();
        this.ListarPersonas();
        this.setLocationRelativeTo(null);
        setVisible(true);
        setLocationRelativeTo(null);
        setTitle("LISTADO DE ESTUDIANTES");
        
        
    }
private void ListarPersonas(){

         List<Personas> lp = new PersonaDAO().Listar();
    System.out.println(lp);
        modelo = (DefaultTableModel) TablaListado.getModel();

        Object[] ob = new Object[6];

        for (int i = 0; i < lp.size(); i++) {

            ob[0] = lp.get(i).getPerId();
            ob[1] = lp.get(i).getPerNombres();
            ob[2] = lp.get(i).getPerApellidos();
            ob[3] = lp.get(i).getPerTipodeDocumento();
            ob[4] = lp.get(i).getPerNumerodeDocumento();
            ob[5] = lp.get(i).getPerEdad();
           
            modelo.addRow(ob);
    }
 

        TablaListado.setModel(modelo);

    }
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaListado = new javax.swing.JTable();
        btn_IrPerCoord = new javax.swing.JButton();
        Busqueda_estudiante = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        jButtonIrNotif = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BarraMorada = new javax.swing.JLabel();
        btn_irPerAdm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setViewportBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));
        jPanel2.setForeground(new java.awt.Color(102, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TablaListado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        TablaListado.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        TablaListado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombres", "Apellidos", "TipodeDocumento", "NumerodeDocumento", "Edad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaListado.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(TablaListado);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 1060, 250));

        btn_IrPerCoord.setBackground(new java.awt.Color(204, 204, 204));
        btn_IrPerCoord.setFont(new java.awt.Font("Lucida Fax", 0, 14)); // NOI18N
        btn_IrPerCoord.setText("IR A PERFIL COORD");
        btn_IrPerCoord.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_IrPerCoord.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_IrPerCoordMouseClicked(evt);
            }
        });
        btn_IrPerCoord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_IrPerCoordActionPerformed(evt);
            }
        });
        jPanel2.add(btn_IrPerCoord, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 550, 190, 40));

        Busqueda_estudiante.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        Busqueda_estudiante.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Busqueda_estudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Busqueda_estudianteActionPerformed(evt);
            }
        });
        Busqueda_estudiante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Busqueda_estudianteKeyTyped(evt);
            }
        });
        jPanel2.add(Busqueda_estudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 220, 310, 30));

        btn_buscar.setBackground(new java.awt.Color(204, 204, 204));
        btn_buscar.setFont(new java.awt.Font("Lucida Fax", 1, 16)); // NOI18N
        btn_buscar.setText("Buscar");
        btn_buscar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_buscarMouseClicked(evt);
            }
        });
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 220, 140, 30));

        jButtonIrNotif.setBackground(new java.awt.Color(204, 204, 204));
        jButtonIrNotif.setFont(new java.awt.Font("Lucida Fax", 0, 14)); // NOI18N
        jButtonIrNotif.setText("IR A NOTIFICACIONES");
        jButtonIrNotif.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonIrNotif.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonIrNotifMouseClicked(evt);
            }
        });
        jButtonIrNotif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIrNotifActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonIrNotif, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 550, 180, 40));

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoFNH2.jpg"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        BarraMorada.setBackground(new java.awt.Color(204, 204, 255));
        BarraMorada.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        BarraMorada.setText("LISTADO ESTUDIANTES");
        BarraMorada.setOpaque(true);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 431, Short.MAX_VALUE)
                .addComponent(BarraMorada, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BarraMorada, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 130));

        btn_irPerAdm.setBackground(new java.awt.Color(204, 204, 204));
        btn_irPerAdm.setFont(new java.awt.Font("Lucida Fax", 0, 14)); // NOI18N
        btn_irPerAdm.setText("IR A PERFIL ADMIN");
        btn_irPerAdm.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_irPerAdm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_irPerAdmMouseClicked(evt);
            }
        });
        btn_irPerAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_irPerAdmActionPerformed(evt);
            }
        });
        jPanel2.add(btn_irPerAdm, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 550, 190, 40));

        jScrollPane1.setViewportView(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1100, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 755, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_IrPerCoordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_IrPerCoordMouseClicked
        this.dispose();
        PerfilAdministrador abrir = new PerfilAdministrador();
        abrir.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btn_IrPerCoordMouseClicked

    private void btn_buscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_buscarMouseClicked
       this.dispose();
        inscripciones abrir = new inscripciones();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_buscarMouseClicked

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void jButtonIrNotifMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonIrNotifMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonIrNotifMouseClicked

    private void jButtonIrNotifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIrNotifActionPerformed
        this.dispose();
        Notificaciones abrir = new Notificaciones();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonIrNotifActionPerformed

    private void btn_irPerAdmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_irPerAdmMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_irPerAdmMouseClicked

    private void btn_IrPerCoordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_IrPerCoordActionPerformed
        this.dispose();
        PerfilCoordinador abrir = new PerfilCoordinador();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_IrPerCoordActionPerformed

    private void btn_irPerAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_irPerAdmActionPerformed
        this.dispose();
        PerfilAdministrador abrir = new PerfilAdministrador();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_irPerAdmActionPerformed

    private void Busqueda_estudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Busqueda_estudianteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Busqueda_estudianteActionPerformed

    private void Busqueda_estudianteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Busqueda_estudianteKeyTyped
         Busqueda_estudiante.addKeyListener(new KeyAdapter() {

            @Override
             public void keyReleased(KeyEvent ke) {

                trs.setRowFilter(RowFilter.regexFilter(Busqueda_estudiante.getText(), 1));

            }
        });

        trs = new TableRowSorter(modelo);
        TablaListado.setRowSorter(trs);
    }//GEN-LAST:event_Busqueda_estudianteKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BarraMorada;
    public javax.swing.JTextField Busqueda_estudiante;
    public javax.swing.JTable TablaListado;
    public javax.swing.JButton btn_IrPerCoord;
    private javax.swing.JButton btn_buscar;
    public javax.swing.JButton btn_irPerAdm;
    private javax.swing.JButton jButtonIrNotif;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
