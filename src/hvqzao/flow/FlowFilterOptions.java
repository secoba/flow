/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hvqzao.flow;

import burp.IBurpExtenderCallbacks;
import javax.swing.JButton;
import javax.swing.JRadioButton;

/**
 *
 * @author nme
 */
public class FlowFilterOptions extends javax.swing.JPanel {

    /**
     * Creates new form FlowFilterOptions
     */
    public FlowFilterOptions() {
        initComponents();
    }

    public FlowFilterOptions(IBurpExtenderCallbacks callbacks) {
        initComponents();
        callbacks.customizeUiComponent(Mode2);
        callbacks.customizeUiComponent(Mode1);
    }
    
    public JButton getOptionsHelp() {
        return optionsHelp;
    }

    public JRadioButton getMode1() {
        return Mode1;
    }

    public JRadioButton getMode2() {
        return Mode2;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        optionsHelp = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Mode2 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        Mode1 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));

        optionsHelp.setMargin(new java.awt.Insets(0, 0, 0, 0));
        optionsHelp.setMaximumSize(new java.awt.Dimension(24, 24));
        optionsHelp.setMinimumSize(new java.awt.Dimension(24, 24));
        optionsHelp.setPreferredSize(new java.awt.Dimension(24, 24));

        jLabel1.setText("<html><b style='color:#e58900;font-size:10px'>Operation mode</b></html>");

        buttonGroup1.add(Mode2);
        Mode2.setSelected(true);
        Mode2.setText("Include incomplete requests");

        jLabel2.setText("<html><b>Known issue</b>: If Burp \"Platform Authentication\" is in use, or \"Match and Replace\" in request is used, Flow is unable to match responses to related requests. This is caused by Burp API limitations (lack of unique identifiers in HttpRequestResponse). As a workaround I suggest to perform platform authentication / requests altering in upstream proxy.</html>");

        buttonGroup1.add(Mode1);
        Mode1.setText("Display only requests with responses");

        jLabel3.setText("<html>This mode can be useful when troubleshooting application locking during scans</html>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(optionsHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Mode1)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Mode2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(optionsHelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Mode1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Mode2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Mode1;
    private javax.swing.JRadioButton Mode2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton optionsHelp;
    // End of variables declaration//GEN-END:variables
}
