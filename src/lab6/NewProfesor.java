    package lab6;

    import ClassAtributos.Profesores;
    import ClassAtributos.Curso;
    

public class NewProfesor extends javax.swing.JFrame {

    private JProfesor padre;
    private Profesores NuevoProfe;
    private Curso NewCur;
    private int index;
    
    public NewProfesor() 
    {initComponents();} 
        
    public NewProfesor(JProfesor padre) 
    {
        initComponents();
        this.padre = padre;

    }
     public NewProfesor(JProfesor padre,Curso NewCur) 
    {
        initComponents();
        this.padre = padre;
        this.NewCur = NewCur;

    }
     
     public NewProfesor(JProfesor padre,Profesores NuevoProfe,int index,Curso NuevoCurs) 
    {
        initComponents();
        this.padre = padre;
        this.NuevoProfe = NuevoProfe;
        this.index = index;
        this.NewCur = NuevoCurs;
        txt_Nombre.setText(this.NuevoProfe.getNombre());
        
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Diseños/Nombre_.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, 30));

        txt_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NombreActionPerformed(evt);
            }
        });
        jPanel1.add(txt_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 160, 30));

        btn_Cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Diseños/Cancelar.png"))); // NOI18N
        btn_Cancelar.setBorder(null);
        btn_Cancelar.setContentAreaFilled(false);
        btn_Cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 104, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Diseños/AÑADIR PROFESOR.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        btn_Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Diseños/guardar.png"))); // NOI18N
        btn_Guardar.setBorder(null);
        btn_Guardar.setContentAreaFilled(false);
        btn_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        btn_Editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Diseños/guardar.png"))); // NOI18N
        btn_Editar.setBorder(null);
        btn_Editar.setContentAreaFilled(false);
        btn_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NombreActionPerformed

    private void btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GuardarActionPerformed
        Profesores Nuev = new Profesores();
        Nuev.setNombre(txt_Nombre.getText());      
        if (NewCur != null) 
            {   
                NewCur.agregarProfesor(Nuev);
                this.padre.TraerProfesores();
            }
        
        this.padre.setVisible(true);
        this.dispose();    
    }//GEN-LAST:event_btn_GuardarActionPerformed
     
    public void apagarventana()
    {
        btn_Guardar.setVisible(false);
    }
    
     public void apagarventana2()
    {
        btn_Editar.setVisible(false);
    }
    
    
    
    private void btn_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelarActionPerformed
    
        this.padre.setVisible(true);
        this.dispose();    
        
        
    }//GEN-LAST:event_btn_CancelarActionPerformed

    private void btn_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditarActionPerformed
        Profesores Nuev = new Profesores();
        Nuev.setNombre(txt_Nombre.getText());  
  
        
        if (NewCur != null) 
            {   NewCur.actualizarNombreProfesor(index, Nuev.getNombre());
                this.padre.TraerProfesores();
            }
        btn_Guardar.setVisible(true);
        this.padre.setVisible(true);
        this.dispose();  
    }//GEN-LAST:event_btn_EditarActionPerformed

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(NewProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewProfesor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Cancelar;
    private javax.swing.JButton btn_Editar;
    private javax.swing.JButton btn_Guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_Nombre;
    // End of variables declaration//GEN-END:variables
}
