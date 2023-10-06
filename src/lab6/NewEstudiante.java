package lab6;

import ClassAtributos.Curso;
import ClassAtributos.Estudiantes;


public class NewEstudiante extends javax.swing.JFrame {

    private JEstudiante padre;
    private Estudiantes NuevoEstud;
    private Curso NewCur;
    private int index;
    
    public NewEstudiante() 
    {initComponents();} 
        
    public NewEstudiante(JEstudiante padre){
        initComponents();
        this.padre = padre;}
    
    public NewEstudiante(JEstudiante padre,Curso NewCur){
        initComponents();
        this.padre = padre;
        this.NewCur = NewCur;}
    
     public NewEstudiante(JEstudiante padre,Estudiantes NuevoEstud,int index,Curso NuevoCurs) 
    {
        initComponents();
        this.padre = padre;
        this.NuevoEstud = NuevoEstud;
        this.index = index;
        this.NewCur = NuevoCurs;
        txt_Nombre.setText(this.NuevoEstud.getNombre());
        txt_Codigo.setText(this.NuevoEstud.getCodigo());
    }
        public void apagarventana()
    {
        btn_Guardar.setVisible(false);
    }
    
     public void apagarventana2()
    {
        btn_Editar.setVisible(false);
    }
    
     
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_Nombre = new javax.swing.JTextField();
        btn_Cancelar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btn_Guardar = new javax.swing.JButton();
        btn_Editar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txt_Codigo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Diseños/Nombre_.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, 30));

        txt_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NombreActionPerformed(evt);
            }
        });
        jPanel1.add(txt_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 160, 30));

        btn_Cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Diseños/Cancelar.png"))); // NOI18N
        btn_Cancelar.setBorder(null);
        btn_Cancelar.setContentAreaFilled(false);
        btn_Cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 104, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Diseños/AÑADIR Estudiante.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        btn_Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Diseños/guardar.png"))); // NOI18N
        btn_Guardar.setBorder(null);
        btn_Guardar.setContentAreaFilled(false);
        btn_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        btn_Editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Diseños/guardar.png"))); // NOI18N
        btn_Editar.setBorder(null);
        btn_Editar.setContentAreaFilled(false);
        btn_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Diseños/Codigo_.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));
        jPanel1.add(txt_Codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 160, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NombreActionPerformed

    private void btn_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelarActionPerformed

        this.padre.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btn_CancelarActionPerformed

    private void btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GuardarActionPerformed
        Estudiantes Nuev = new Estudiantes();
        Nuev.setNombre(txt_Nombre.getText());
        Nuev.setCodigo(txt_Codigo.getText());

        if (NewCur != null)
        {
            NewCur.agregarEstudiante(Nuev);
            this.padre.TraerEstudiante();
        }

        this.padre.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_GuardarActionPerformed

    private void btn_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditarActionPerformed
        Estudiantes Nuev = new Estudiantes();
        Nuev.setNombre(txt_Nombre.getText());
        Nuev.setCodigo(txt_Codigo.getText());
        
        if (NewCur != null)
        {   NewCur.actualizarNombreEstudiante(index, Nuev.getNombre(),
                Nuev.getCodigo());
            this.padre.TraerEstudiante();
        }
        btn_Guardar.setVisible(true);
        this.padre.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_EditarActionPerformed

    
    
    
    
    
    
    
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(NewEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewEstudiante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Cancelar;
    private javax.swing.JButton btn_Editar;
    private javax.swing.JButton btn_Guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_Codigo;
    private javax.swing.JTextField txt_Nombre;
    // End of variables declaration//GEN-END:variables
}
