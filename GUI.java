/*
 * GUI Class
 * The class is pretty self explaining, so didn't see any reason to comment it.
 */

import javax.swing.ButtonGroup;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


/**
 *
 * @author 96simjoh6
 * Last update: 2015-03-18
 */
public class GUI extends javax.swing.JFrame {

    private ButtonGroup sel;
    Libary lib;
    public String file_name;
    
    public GUI() {
	initComponents();
        this.initGUI();
        lib = new Libary();
    }
    
    private void initGUI(){
        sel = new ButtonGroup();
	sel.add(rb_movie);
	sel.add(rb_song);
        
        rb_movie.setEnabled(false);
        rb_song.setEnabled(false);
        btn_add.setEnabled(false);
        btn_save.setEnabled(false);
        btn_update.setEnabled(false);
        txf_author.setEnabled(false);
        txf_gradeing.setEnabled(false);
        txf_name.setEnabled(false);
        
        txa_main.setEditable(false);
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txf_author = new javax.swing.JTextField();
        txf_gradeing = new javax.swing.JTextField();
        btn_add = new javax.swing.JButton();
        rb_movie = new javax.swing.JRadioButton();
        rb_song = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txa_main = new javax.swing.JTextArea();
        lbl_name = new javax.swing.JLabel();
        txf_name = new javax.swing.JTextField();
        btn_update = new javax.swing.JButton();
        btn_save = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        btn_edit = new javax.swing.JMenu();
        btn_filebrowser = new javax.swing.JMenuItem();
        btn_exit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Type:");

        jLabel2.setText("Author:");
        jLabel2.setPreferredSize(new java.awt.Dimension(34, 20));

        jLabel4.setText("Gradeing: (1-9)");

        btn_add.setText("Add");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        rb_movie.setText("Movie");

        rb_song.setText("Song");

        txa_main.setColumns(20);
        txa_main.setRows(5);
        jScrollPane2.setViewportView(txa_main);

        lbl_name.setText("Name:");

        btn_update.setText("UPDATE TXTWND");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        btn_save.setText("SAVE");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        btn_edit.setText("Edit");

        btn_filebrowser.setText("Open Filebrowser");
        btn_filebrowser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_filebrowserActionPerformed(evt);
            }
        });
        btn_edit.add(btn_filebrowser);

        btn_exit.setText("Exit");
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });
        btn_edit.add(btn_exit);

        jMenuBar1.add(btn_edit);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(btn_add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lbl_name, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txf_author, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txf_gradeing, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rb_movie)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                                .addComponent(rb_song))
                            .addComponent(txf_name, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rb_movie)
                    .addComponent(rb_song))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_name)
                    .addComponent(txf_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txf_author, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txf_gradeing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_add)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_update)
                    .addComponent(btn_save))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_filebrowserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_filebrowserActionPerformed
        JFileChooser fc = new JFileChooser(System.getProperty("user.dir"));
	fc.showDialog(null, "Välj fil");
	file_name = fc.getSelectedFile().getName();
        lib.readFile(txa_main, file_name); //Runs the function readFile(); with the inputs txa_main (to be edited from a different java file)
                                           //And file_name for the location of the file.
        
        rb_movie.setEnabled(true);
        rb_song.setEnabled(true);
        btn_add.setEnabled(true);
        btn_save.setEnabled(true);
        btn_update.setEnabled(true);
        txf_author.setEnabled(true);
        txf_gradeing.setEnabled(true);
        txf_name.setEnabled(true);
    }//GEN-LAST:event_btn_filebrowserActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        //Sends a int with value 1 or 0, to a switch case in Libary.java - newLine();
        
        int i;
        if(rb_song.isSelected()){
            i = 1;
            lib.newLine(i,txf_name.getText(),txf_author.getText(),Integer.parseInt(txf_gradeing.getText()));
        }else if(rb_movie.isSelected()){
            i = 0;
            lib.newLine(i,txf_name.getText(),txf_author.getText(),Integer.parseInt(txf_gradeing.getText()));
        }
        
        txf_name.setText("");
        txf_author.setText("");
        txf_gradeing.setText("");
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_exitActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        lib.updateWind(txa_main);
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        lib.saveLine(file_name);
        JOptionPane.showMessageDialog(null, "Saved");
    }//GEN-LAST:event_btn_saveActionPerformed

    /**
     * @param args the command line arguments
     */
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
	    java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (InstantiationException ex) {
	    java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (IllegalAccessException ex) {
	    java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (javax.swing.UnsupportedLookAndFeelException ex) {
	    java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	}
        //</editor-fold>

	/* Create and display the form */
	java.awt.EventQueue.invokeLater(new Runnable() {
	    public void run() {
		new GUI().setVisible(true);
	    }
	});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JMenu btn_edit;
    private javax.swing.JMenuItem btn_exit;
    private javax.swing.JMenuItem btn_filebrowser;
    private javax.swing.JButton btn_save;
    private javax.swing.JButton btn_update;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_name;
    private javax.swing.JRadioButton rb_movie;
    private javax.swing.JRadioButton rb_song;
    private javax.swing.JTextArea txa_main;
    private javax.swing.JTextField txf_author;
    private javax.swing.JTextField txf_gradeing;
    private javax.swing.JTextField txf_name;
    // End of variables declaration//GEN-END:variables
}
