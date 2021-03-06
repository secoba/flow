package hvqzao.flow;

import burp.IBurpExtenderCallbacks;
import burp.IHttpRequestResponse;
import burp.IHttpService;
import burp.IScanIssue;
import java.awt.Component;
import java.awt.KeyboardFocusManager;
import java.net.URL;
import java.util.Arrays;
import java.util.HashSet;
import javax.swing.JButton;

import java.util.Random;
import java.util.Set;
import javax.swing.KeyStroke;

public class FlowAddNewIssue extends javax.swing.JPanel {

    private final Random rand;

    /**
     * Creates new form FlowAddIssue
     *
     * @param callbacks
     */
    public FlowAddNewIssue(IBurpExtenderCallbacks callbacks) {
        initComponents();

        rand = new Random();

        callbacks.customizeUiComponent(severityCombo);
        callbacks.customizeUiComponent(confidenceCombo);
        callbacks.customizeUiComponent(nameField);
        callbacks.customizeUiComponent(issueDetailArea);
        issueDetailArea.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERS‌​AL_KEYS, null);
        issueDetailArea.setFocusTraversalKeys(KeyboardFocusManager.BACKWARD_TRAVERS‌​AL_KEYS, null);
        callbacks.customizeUiComponent(remediationDetailArea);
        remediationDetailArea.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERS‌​AL_KEYS, null);
        remediationDetailArea.setFocusTraversalKeys(KeyboardFocusManager.BACKWARD_TRAVERS‌​AL_KEYS, null);
        callbacks.customizeUiComponent(issueBackgroundArea);
        issueBackgroundArea.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERS‌​AL_KEYS, null);
        issueBackgroundArea.setFocusTraversalKeys(KeyboardFocusManager.BACKWARD_TRAVERS‌​AL_KEYS, null);
        callbacks.customizeUiComponent(remediationBackgroundArea);
        remediationBackgroundArea.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERS‌​AL_KEYS, null);
        remediationBackgroundArea.setFocusTraversalKeys(KeyboardFocusManager.BACKWARD_TRAVERS‌​AL_KEYS, null);

    }

    public JButton getHelpButton() {
        return helpButton;
    }

    /**
     *
     * @param flowEntry
     * @return
     */
    public IScanIssue getIssue(final FlowExtension.FlowEntry flowEntry) {
        //IHttpRequestResponsePersisted reqResp = flowEntry.getMessageInfoPersisted();
        return new IScanIssue() {
            @Override
            public URL getUrl() {
                return flowEntry.getUrl();
            }

            @Override
            public String getIssueName() {
                return nameField.getText();
            }

            @Override
            public int getIssueType() {
                return 1073741822 + rand.nextInt(1073741822);
            }

            @Override
            public String getSeverity() {
                return (String) severityCombo.getSelectedItem();
            }

            @Override
            public String getConfidence() {
                return (String) confidenceCombo.getSelectedItem();
            }

            @Override
            public String getIssueBackground() {
                return issueBackgroundArea.getText();
            }

            @Override
            public String getRemediationBackground() {
                return remediationBackgroundArea.getText();
            }

            @Override
            public String getIssueDetail() {
                return issueDetailArea.getText();
            }

            @Override
            public String getRemediationDetail() {
                return remediationDetailArea.getText();
            }

            @Override
            public IHttpRequestResponse[] getHttpMessages() {
                return new IHttpRequestResponse[]{flowEntry.getMessageInfo()};
            }

            @Override
            public IHttpService getHttpService() {
                return flowEntry.getService();
            }
        };
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        helpButton = new javax.swing.JButton();
        severityCombo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        confidenceCombo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        issueBackgroundArea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        remediationBackgroundArea = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        issueDetailArea = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        remediationDetailArea = new javax.swing.JTextArea();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));

        helpButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        helpButton.setMaximumSize(new java.awt.Dimension(24, 24));
        helpButton.setMinimumSize(new java.awt.Dimension(24, 24));
        helpButton.setPreferredSize(new java.awt.Dimension(24, 24));

        severityCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "High", "Medium", "Low", "Information" }));

        jLabel1.setText("<html><b style='color:#e58900;font-size:10px'>Add new sitemap issue</b></html>");
        jLabel1.setToolTipText("");

        jLabel2.setText("This form allows adding new, custom finding.");

        confidenceCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Certain", "Firm", "Tentative" }));

        jLabel3.setText("Severity:");

        jLabel4.setText("Confidence:");

        jLabel5.setText("Name:");

        jLabel6.setText("Issue background:");

        issueBackgroundArea.setColumns(20);
        issueBackgroundArea.setRows(5);
        issueBackgroundArea.setText("...");
        jScrollPane1.setViewportView(issueBackgroundArea);

        remediationBackgroundArea.setColumns(20);
        remediationBackgroundArea.setRows(5);
        remediationBackgroundArea.setText("...");
        jScrollPane2.setViewportView(remediationBackgroundArea);

        jLabel7.setText("Remediation background:");

        jLabel8.setText("Issue detail:");

        issueDetailArea.setColumns(20);
        issueDetailArea.setRows(5);
        issueDetailArea.setText("...");
        jScrollPane3.setViewportView(issueDetailArea);

        jLabel9.setText("Remediation detail:");

        remediationDetailArea.setColumns(20);
        remediationDetailArea.setRows(5);
        remediationDetailArea.setText("...");
        jScrollPane4.setViewportView(remediationDetailArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(helpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane4)
                                    .addComponent(nameField)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                                    .addComponent(jScrollPane2)
                                    .addComponent(jScrollPane3)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(confidenceCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(severityCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(helpButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(severityCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(confidenceCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> confidenceCombo;
    private javax.swing.JButton helpButton;
    private javax.swing.JTextArea issueBackgroundArea;
    private javax.swing.JTextArea issueDetailArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextArea remediationBackgroundArea;
    private javax.swing.JTextArea remediationDetailArea;
    private javax.swing.JComboBox<String> severityCombo;
    // End of variables declaration//GEN-END:variables

    public static class TransferFocus {

        /**
         * Patch the behaviour of a component. TAB transfers focus to the next
         * focusable component, SHIFT+TAB transfers focus to the previous
         * focusable component.
         *
         * @param c The component to be patched.
         */
        public static void patch(Component c) {
            Set<KeyStroke> strokes = new HashSet<>(Arrays.asList(KeyStroke.getKeyStroke("pressed TAB")));
            c.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, strokes);
            strokes = new HashSet<>(Arrays.asList(KeyStroke.getKeyStroke("shift pressed TAB")));
            c.setFocusTraversalKeys(KeyboardFocusManager.BACKWARD_TRAVERSAL_KEYS, strokes);
        }
    }
}
