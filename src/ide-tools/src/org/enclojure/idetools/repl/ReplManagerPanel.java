/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ReplManagerPanel.java
 *
 * Created on Jan 19, 2010, 8:24:12 PM
 */

package org.enclojure.idetools.repl;

/**
 *
 * @author ericthor
 */
public class ReplManagerPanel extends javax.swing.JPanel {

    /** Creates new form ReplManagerPanel */
    public ReplManagerPanel() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        topLevelSplitPane = new javax.swing.JSplitPane();
        leftPanel = new javax.swing.JPanel();
        replListToolBar = new javax.swing.JToolBar();
        addButton = new javax.swing.JButton();
        duplicateButton = new javax.swing.JButton();
        deleteReplButton = new javax.swing.JButton();
        replListScrollPane = new javax.swing.JScrollPane();
        replContextTable = new javax.swing.JTable();
        jRightPanel = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        clojurePlatformsComboBox = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jvmArgsScrollPane = new javax.swing.JScrollPane();
        jvmArgsList = new javax.swing.JList();
        jLabel14 = new javax.swing.JLabel();
        defaultStartupScrollPane = new javax.swing.JScrollPane();
        startupAttributeTable = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        classpathTabbedPane = new javax.swing.JTabbedPane();
        classpathSelectProjectsPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        classpathSelectedProjectsTable = new javax.swing.JTable();
        jToolBar2 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        classpathPathTable = new javax.swing.JTable();
        jToolBar1 = new javax.swing.JToolBar();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setName("replManagerPane"); // NOI18N

        topLevelSplitPane.setDividerLocation(300);

        replListToolBar.setRollover(true);

        addButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/enclojure/idetools/resources/Create.png"))); // NOI18N
        addButton.setToolTipText("Add Repl Context");
        addButton.setFocusable(false);
        addButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        addButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        replListToolBar.add(addButton);

        duplicateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/enclojure/idetools/resources/Copy.png"))); // NOI18N
        duplicateButton.setToolTipText("Duplicate REPl Context");
        duplicateButton.setFocusable(false);
        duplicateButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        duplicateButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        replListToolBar.add(duplicateButton);

        deleteReplButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/enclojure/idetools/resources/Delete.png"))); // NOI18N
        deleteReplButton.setToolTipText("Delete Repl Context");
        deleteReplButton.setFocusable(false);
        deleteReplButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        deleteReplButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        replListToolBar.add(deleteReplButton);

        replContextTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Host", "Running"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        replListScrollPane.setViewportView(replContextTable);

        org.jdesktop.layout.GroupLayout leftPanelLayout = new org.jdesktop.layout.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(leftPanelLayout.createSequentialGroup()
                .add(replListToolBar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 109, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(189, Short.MAX_VALUE))
            .add(replListScrollPane, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(leftPanelLayout.createSequentialGroup()
                .add(replListToolBar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(replListScrollPane, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 913, Short.MAX_VALUE))
        );

        topLevelSplitPane.setLeftComponent(leftPanel);

        jLabel15.setText("Addition JVM args:");

        clojurePlatformsComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel13.setText("Clojure Platform");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel2.setText(org.openide.util.NbBundle.getMessage(ReplManagerPanel.class, "Settings_default_settings_for_repls_label")); // NOI18N
        jLabel2.setToolTipText(org.openide.util.NbBundle.getMessage(ReplManagerPanel.class, "Settings_REPL_JAR_FileLocation")); // NOI18N

        jvmArgsList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "-Xms512m", "-Xmx512m", "-server" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jvmArgsScrollPane.setViewportView(jvmArgsList);

        jLabel14.setText("Default startup attributes");

        startupAttributeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Attribute", "Value", "ns"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        defaultStartupScrollPane.setViewportView(startupAttributeTable);

        jLabel1.setText("Classpaths");

        classpathSelectedProjectsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Use", "Name", "Project Path"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(classpathSelectedProjectsTable);

        jToolBar2.setOrientation(1);
        jToolBar2.setRollover(true);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/enclojure/idetools/resources/Pinion.png"))); // NOI18N
        jButton1.setToolTipText("Project Paths");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(0);
        jButton1.setVerticalTextPosition(3);
        jToolBar2.add(jButton1);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/enclojure/idetools/resources/Tune.png"))); // NOI18N
        jButton2.setToolTipText("Lib Search Patterns");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(0);
        jButton2.setVerticalTextPosition(3);
        jToolBar2.add(jButton2);

        org.jdesktop.layout.GroupLayout classpathSelectProjectsPanelLayout = new org.jdesktop.layout.GroupLayout(classpathSelectProjectsPanel);
        classpathSelectProjectsPanel.setLayout(classpathSelectProjectsPanelLayout);
        classpathSelectProjectsPanelLayout.setHorizontalGroup(
            classpathSelectProjectsPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, classpathSelectProjectsPanelLayout.createSequentialGroup()
                .add(jToolBar2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 34, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 885, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        classpathSelectProjectsPanelLayout.setVerticalGroup(
            classpathSelectProjectsPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(classpathSelectProjectsPanelLayout.createSequentialGroup()
                .add(classpathSelectProjectsPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
                    .add(jToolBar2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 259, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        classpathTabbedPane.addTab("Select From Projects", classpathSelectProjectsPanel);

        classpathPathTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Path", "From"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(classpathPathTable);

        jToolBar1.setOrientation(1);
        jToolBar1.setRollover(true);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/enclojure/idetools/resources/Up.png"))); // NOI18N
        jButton3.setToolTipText("Move up");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(0);
        jButton3.setVerticalTextPosition(3);
        jToolBar1.add(jButton3);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/enclojure/idetools/resources/Down.png"))); // NOI18N
        jButton4.setToolTipText("Move down");
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(0);
        jButton4.setVerticalTextPosition(3);
        jToolBar1.add(jButton4);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/enclojure/idetools/resources/Create.png"))); // NOI18N
        jButton5.setToolTipText("Add Path");
        jButton5.setFocusable(false);
        jButton5.setHorizontalTextPosition(0);
        jButton5.setVerticalTextPosition(3);
        jToolBar1.add(jButton5);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/enclojure/idetools/resources/Delete.png"))); // NOI18N
        jButton6.setToolTipText("Add Path");
        jButton6.setFocusable(false);
        jButton6.setHorizontalTextPosition(0);
        jButton6.setVerticalTextPosition(3);
        jToolBar1.add(jButton6);

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(1, 1, 1)
                .add(jToolBar1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 34, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(2, 2, 2)
                .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 812, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jToolBar1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 199, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 687, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        classpathTabbedPane.addTab("Paths List", jPanel1);

        org.jdesktop.layout.GroupLayout jRightPanelLayout = new org.jdesktop.layout.GroupLayout(jRightPanel);
        jRightPanel.setLayout(jRightPanelLayout);
        jRightPanelLayout.setHorizontalGroup(
            jRightPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jRightPanelLayout.createSequentialGroup()
                .add(1948, 1948, 1948)
                .add(jSeparator2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(jRightPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(jRightPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel1)
                    .add(jSeparator1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 746, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
            .add(jRightPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(classpathTabbedPane, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 961, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(jRightPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(jRightPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 361, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jRightPanelLayout.createSequentialGroup()
                        .add(jRightPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, jRightPanelLayout.createSequentialGroup()
                                .add(jLabel13)
                                .add(18, 18, 18)
                                .add(clojurePlatformsComboBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 251, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(org.jdesktop.layout.GroupLayout.LEADING, jRightPanelLayout.createSequentialGroup()
                                .add(jLabel15)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jvmArgsScrollPane)))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jRightPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(defaultStartupScrollPane, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 553, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel14)))))
        );
        jRightPanelLayout.setVerticalGroup(
            jRightPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jRightPanelLayout.createSequentialGroup()
                .add(20, 20, 20)
                .add(jRightPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jRightPanelLayout.createSequentialGroup()
                        .add(jLabel2)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jRightPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel13)
                            .add(clojurePlatformsComboBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jRightPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel15)
                            .add(jvmArgsScrollPane, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 93, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(jRightPanelLayout.createSequentialGroup()
                        .add(jLabel14)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(defaultStartupScrollPane, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 236, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .add(32, 32, 32)
                .add(jSeparator1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(2, 2, 2)
                .add(jLabel1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(classpathTabbedPane, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 571, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(16, 16, 16)
                .add(jSeparator2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(316, 316, 316))
        );

        topLevelSplitPane.setRightComponent(jRightPanel);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(topLevelSplitPane, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 1183, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(topLevelSplitPane, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 950, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton addButton;
    public javax.swing.JTable classpathPathTable;
    public javax.swing.JPanel classpathSelectProjectsPanel;
    public javax.swing.JTable classpathSelectedProjectsTable;
    public javax.swing.JTabbedPane classpathTabbedPane;
    public javax.swing.JComboBox clojurePlatformsComboBox;
    public javax.swing.JScrollPane defaultStartupScrollPane;
    public javax.swing.JButton deleteReplButton;
    public javax.swing.JButton duplicateButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    public javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jRightPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    public javax.swing.JList jvmArgsList;
    public javax.swing.JScrollPane jvmArgsScrollPane;
    public javax.swing.JPanel leftPanel;
    public javax.swing.JTable replContextTable;
    public javax.swing.JScrollPane replListScrollPane;
    public javax.swing.JToolBar replListToolBar;
    public javax.swing.JTable startupAttributeTable;
    public javax.swing.JSplitPane topLevelSplitPane;
    // End of variables declaration//GEN-END:variables

}