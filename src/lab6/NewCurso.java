    package lab6;
	import ClassAtributos.Curso;
	import ClassAtributos.Estudiantes;
	import ClassAtributos.Profesores;

public class NewCurso extends javax.swing.JFrame {

    private GestorCursos padre;
    private Curso NuevoCurs;
    private int index;
    
    public NewCurso() 
    {initComponents();}
    
    public NewCurso(GestorCursos padre) 
    {
        initComponents();
        this.padre = padre;

    }

     public NewCurso(GestorCursos padre,Curso NuevoCurs,int index) 
    {
        initComponents();
        this.padre = padre;
        this.NuevoCurs = NuevoCurs;
        this.index = index;
        txt_Nombre.setText(this.NuevoCurs.getNombre());
        txt_Creditos.setText(this.NuevoCurs.getCreditos());
        txt_Codigo.setText(this.NuevoCurs.getCodigo());
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_Nombre = new javax.swing.JTextField();
        txt_Creditos = new javax.swing.JTextField();
        txt_Codigo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btn_Cancelar = new javax.swing.JButton();
        btn_Guardar = new javax.swing.JButton();
        btn_Editar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Diseños/Nombre_.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Diseños/N° Creditos.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Diseños/Codigo_.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));
        jPanel1.add(txt_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 180, 30));

        txt_Creditos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_CreditosActionPerformed(evt);
            }
        });
        jPanel1.add(txt_Creditos, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 180, 30));
        jPanel1.add(txt_Codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 180, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Diseños/AÑADIR CURSO.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        btn_Cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Diseños/Cancelar.png"))); // NOI18N
        btn_Cancelar.setBorder(null);
        btn_Cancelar.setContentAreaFilled(false);
        btn_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, -1, -1));

        btn_Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Diseños/guardar.png"))); // NOI18N
        btn_Guardar.setBorder(null);
        btn_Guardar.setContentAreaFilled(false);
        btn_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 110, 60));

        btn_Editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Diseños/guardar.png"))); // NOI18N
        btn_Editar.setBorder(null);
        btn_Editar.setContentAreaFilled(false);
        btn_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 110, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelarActionPerformed
        this.padre.setVisible(true);
        this.dispose();           
    }//GEN-LAST:event_btn_CancelarActionPerformed

    private void btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GuardarActionPerformed
        
        Curso NuevoCurso = new Curso();
        
        NuevoCurso.setNombre(txt_Nombre.getText());
        NuevoCurso.setCreditos(txt_Creditos.getText());
        NuevoCurso.setCodigo(txt_Codigo.getText());
        
        this.padre.agregar(NuevoCurso);
                
        this.padre.setVisible(true);
        this.dispose();
        
        
    }//GEN-LAST:event_btn_GuardarActionPerformed

    private void txt_CreditosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_CreditosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_CreditosActionPerformed

    private void btn_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditarActionPerformed
        
         Curso NuevoC = new Curso();
        
        NuevoC.setNombre(txt_Nombre.getText());
        NuevoC.setCreditos(txt_Creditos.getText());
        NuevoC.setCodigo(txt_Codigo.getText());
        
        this.padre.rempla(this.index,NuevoC);

        btn_Guardar.setVisible(true);
        this.padre.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_EditarActionPerformed

    public void apagarventana()
    {
        btn_Guardar.setVisible(false);
    }
     public void apagarventana2()
    {
        btn_Editar.setVisible(false);
    }

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
            java.util.logging.Logger.getLogger(NewCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewCurso().setVisible(true);
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_Codigo;
    private javax.swing.JTextField txt_Creditos;
    private javax.swing.JTextField txt_Nombre;
    // End of variables declaration//GEN-END:variables
}
