package GUI;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import com.intellij.uiDesigner.core.Spacer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.ObjectInputFilter;

import static javax.swing.JOptionPane.showMessageDialog;

public class NCAAQuery extends JPanel {
    public JPanel panel1;

    private JButton SAVETOCSVButton;

    private JButton Generate;

    private JTextField searchTextField;

    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JComboBox comboBox3;
    private JComboBox comboBox4;
    private JComboBox comboBox5;
    private JComboBox comboBox6;
    private JComboBox comboBox7;
    private JComboBox comboBox8;

    private JSpinner spinner1;

    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;

    private String current_directory;

    public NCAAQuery() {
        current_directory = System.getProperty("user.dir");
        JFrame frame = new JFrame("NCAAQuery");
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage(current_directory + "\\src\\315Logo.png"));
        frame.setContentPane(panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        update();

    }

    private void flushData(JComboBox jcb1, JComboBox jcb2) {
        //TODO Remove exsisting data/attributes from the table(s)
    }

    private void removeTableVisibility(JComboBox jcb1, JComboBox jcb2, JButton jb) {
        jcb1.setVisible(false);
        jcb2.setVisible(false);
        jb.setVisible(false);
    }

    private void addTableVisibility(JComboBox jcb1, JComboBox jcb2, JButton jb) {
        jcb1.setVisible(true);
        jcb2.setVisible(true);
        jb.setVisible(true);
    }

    private void update() {

        /* First X button (Leftmost) */
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    removeTableVisibility(comboBox1, comboBox2, button1);
                    flushData(comboBox1, comboBox2);
                } catch (Exception ex) {
                    System.out.println("button1 Error :: " + ex.toString());
                }
            }
        });

        /* Second X Button */
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    removeTableVisibility(comboBox3, comboBox4, button2);
                    flushData(comboBox3, comboBox4);
                } catch (Exception ex) {
                    System.out.println("button2 Error :: " + ex.toString());
                }
            }
        });

        /* Third X Button */
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    removeTableVisibility(comboBox5, comboBox6, button3);
                    flushData(comboBox5, comboBox6);
                } catch (Exception ex) {
                    System.out.println("button3 Error :: " + ex.toString());
                }
            }
        });

        /* Fourth X Button (Rightmost) */
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    removeTableVisibility(comboBox7, comboBox8, button4);
                    flushData(comboBox7, comboBox8);
                } catch (Exception ex) {
                    System.out.println("button4 Error :: " + ex.toString());
                }
            }
        });

        /* Table Addition Feature */
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    if (button1.isVisible() && button2.isVisible() && button3.isVisible() && button4.isVisible())
                        showMessageDialog(null, "Cannot Add More Tables!", "Table Addition Error!", JOptionPane.PLAIN_MESSAGE);
                    else if (!button1.isVisible())
                        addTableVisibility(comboBox1, comboBox2, button1);
                    else if (!button2.isVisible())
                        addTableVisibility(comboBox3, comboBox4, button2);
                    else if (!button3.isVisible())
                        addTableVisibility(comboBox5, comboBox6, button3);
                    else
                        addTableVisibility(comboBox7, comboBox8, button4);

                } catch (Exception ex) {
                    System.out.println("Add Table Error :: " + ex.toString());
                }
            }
        });

        /* Save to CSV Button (Rightmost) */
        SAVETOCSVButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {

                    File file_dir = new File(current_directory);
                    if (!file_dir.isDirectory()) {
                        file_dir.mkdir();
                    }

                    File file = new File(current_directory + "\\NCAAQuery.csv");
                    FileWriter writer = new FileWriter(file);
                    writer.close();

                } catch (Exception ex) {
                    System.out.println("SAVETOCSVButton Error :: " + ex.toString());
                }
            }
        });

        /* Generate Button (Rightmost) */
        Generate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {

                } catch (Exception ex) {
                    System.out.println("Generate Error :: " + ex.toString());
                }
            }
        });

    }

    private void createUIComponents() {

    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        panel1 = new JPanel();
        panel1.setLayout(new GridLayoutManager(2, 1, new Insets(0, 0, 0, 0), -1, -1));
        panel1.setBackground(new Color(-15181146));
        panel1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEmptyBorder(), null));
        final JPanel panel2 = new JPanel();
        panel2.setLayout(new GridLayoutManager(2, 2, new Insets(0, 0, 0, 0), -1, -1));
        panel2.setBackground(new Color(-1312257));
        panel1.add(panel2, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        final Spacer spacer1 = new Spacer();
        panel2.add(spacer1, new GridConstraints(1, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        final JPanel panel3 = new JPanel();
        panel3.setLayout(new GridLayoutManager(2, 3, new Insets(20, 20, 20, 20), -1, -1));
        panel3.setBackground(new Color(-1312257));
        panel2.add(panel3, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 1, false));
        SAVETOCSVButton = new JButton();
        SAVETOCSVButton.setBackground(new Color(-1312769));
        Font SAVETOCSVButtonFont = this.$$$getFont$$$("Segoe UI Black", -1, -1, SAVETOCSVButton.getFont());
        if (SAVETOCSVButtonFont != null) SAVETOCSVButton.setFont(SAVETOCSVButtonFont);
        SAVETOCSVButton.setForeground(new Color(-15181146));
        SAVETOCSVButton.setHideActionText(false);
        SAVETOCSVButton.setText("SAVE TO CSV");
        panel3.add(SAVETOCSVButton, new GridConstraints(1, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final Spacer spacer2 = new Spacer();
        panel3.add(spacer2, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        Generate = new JButton();
        Generate.setBackground(new Color(-1247233));
        Font GenerateFont = this.$$$getFont$$$("Segoe UI Black", -1, -1, Generate.getFont());
        if (GenerateFont != null) Generate.setFont(GenerateFont);
        Generate.setForeground(new Color(-15181146));
        Generate.setText("GENERATE");
        panel3.add(Generate, new GridConstraints(1, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JPanel panel4 = new JPanel();
        panel4.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        panel4.setBackground(new Color(-1312257));
        panel3.add(panel4, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        final JScrollPane scrollPane1 = new JScrollPane();
        scrollPane1.setBackground(new Color(-1312257));
        scrollPane1.setForeground(new Color(-1312257));
        panel4.add(scrollPane1, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        scrollPane1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black), null));
        final JPanel panel5 = new JPanel();
        panel5.setLayout(new GridLayoutManager(2, 7, new Insets(20, 20, 20, 20), -1, -1));
        panel5.setBackground(new Color(-1246721));
        panel2.add(panel5, new GridConstraints(0, 0, 1, 2, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 1, false));
        final JPanel panel6 = new JPanel();
        panel6.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        panel6.setBackground(new Color(-1312513));
        panel5.add(panel6, new GridConstraints(0, 6, 2, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, new Dimension(140, 77), null, 0, false));
        final JPanel panel7 = new JPanel();
        panel7.setLayout(new GridLayoutManager(2, 1, new Insets(0, 0, 0, 0), -1, -1));
        panel7.setBackground(new Color(-1246465));
        panel6.add(panel7, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        searchTextField = new JTextField();
        searchTextField.setBackground(new Color(-1312257));
        Font searchTextFieldFont = this.$$$getFont$$$("Segoe UI Black", -1, -1, searchTextField.getFont());
        if (searchTextFieldFont != null) searchTextField.setFont(searchTextFieldFont);
        searchTextField.setForeground(new Color(-15181146));
        searchTextField.setText("Search");
        panel7.add(searchTextField, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        final JPanel panel8 = new JPanel();
        panel8.setLayout(new GridLayoutManager(1, 2, new Insets(0, 0, 0, 0), -1, -1));
        panel8.setBackground(new Color(-1246721));
        panel7.add(panel8, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        button5 = new JButton();
        button5.setBackground(new Color(-1312257));
        button5.setForeground(new Color(-15181146));
        button5.setText("✚");
        panel8.add(button5, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final Spacer spacer3 = new Spacer();
        panel8.add(spacer3, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final JPanel panel9 = new JPanel();
        panel9.setLayout(new GridLayoutManager(2, 2, new Insets(0, 0, 0, 0), -1, -1));
        panel9.setBackground(new Color(-1180929));
        panel5.add(panel9, new GridConstraints(0, 0, 2, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        comboBox1 = new JComboBox();
        comboBox1.setBackground(new Color(-1312257));
        Font comboBox1Font = this.$$$getFont$$$("Segoe UI Black", -1, -1, comboBox1.getFont());
        if (comboBox1Font != null) comboBox1.setFont(comboBox1Font);
        comboBox1.setForeground(new Color(-15181146));
        final DefaultComboBoxModel defaultComboBoxModel1 = new DefaultComboBoxModel();
        defaultComboBoxModel1.addElement("Select Table 1");
        comboBox1.setModel(defaultComboBoxModel1);
        panel9.add(comboBox1, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        comboBox2 = new JComboBox();
        comboBox2.setBackground(new Color(-1312257));
        Font comboBox2Font = this.$$$getFont$$$("Segoe UI Black", -1, -1, comboBox2.getFont());
        if (comboBox2Font != null) comboBox2.setFont(comboBox2Font);
        comboBox2.setForeground(new Color(-15181146));
        final DefaultComboBoxModel defaultComboBoxModel2 = new DefaultComboBoxModel();
        defaultComboBoxModel2.addElement("Select Attributes");
        comboBox2.setModel(defaultComboBoxModel2);
        panel9.add(comboBox2, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        button1 = new JButton();
        button1.setBackground(new Color(-1312257));
        button1.setForeground(new Color(-4180684));
        button1.setText("❌");
        panel9.add(button1, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JPanel panel10 = new JPanel();
        panel10.setLayout(new GridLayoutManager(2, 2, new Insets(0, 0, 0, 0), -1, -1));
        panel10.setBackground(new Color(-1246721));
        panel5.add(panel10, new GridConstraints(0, 1, 2, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        comboBox3 = new JComboBox();
        comboBox3.setBackground(new Color(-1312257));
        Font comboBox3Font = this.$$$getFont$$$("Segoe UI Black", -1, -1, comboBox3.getFont());
        if (comboBox3Font != null) comboBox3.setFont(comboBox3Font);
        comboBox3.setForeground(new Color(-15181146));
        final DefaultComboBoxModel defaultComboBoxModel3 = new DefaultComboBoxModel();
        defaultComboBoxModel3.addElement("Select Table 2");
        comboBox3.setModel(defaultComboBoxModel3);
        panel10.add(comboBox3, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        comboBox4 = new JComboBox();
        comboBox4.setBackground(new Color(-1312257));
        Font comboBox4Font = this.$$$getFont$$$("Segoe UI Black", -1, -1, comboBox4.getFont());
        if (comboBox4Font != null) comboBox4.setFont(comboBox4Font);
        comboBox4.setForeground(new Color(-15181146));
        final DefaultComboBoxModel defaultComboBoxModel4 = new DefaultComboBoxModel();
        defaultComboBoxModel4.addElement("Select Attributes");
        comboBox4.setModel(defaultComboBoxModel4);
        panel10.add(comboBox4, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        button2 = new JButton();
        button2.setBackground(new Color(-1312257));
        button2.setForeground(new Color(-4180684));
        button2.setText("❌");
        panel10.add(button2, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JPanel panel11 = new JPanel();
        panel11.setLayout(new GridLayoutManager(2, 2, new Insets(0, 0, 0, 0), -1, -1));
        panel11.setBackground(new Color(-1115649));
        panel5.add(panel11, new GridConstraints(0, 2, 2, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        comboBox5 = new JComboBox();
        comboBox5.setBackground(new Color(-1312257));
        Font comboBox5Font = this.$$$getFont$$$("Segoe UI Black", -1, -1, comboBox5.getFont());
        if (comboBox5Font != null) comboBox5.setFont(comboBox5Font);
        comboBox5.setForeground(new Color(-15181146));
        final DefaultComboBoxModel defaultComboBoxModel5 = new DefaultComboBoxModel();
        defaultComboBoxModel5.addElement("Select Attributes");
        comboBox5.setModel(defaultComboBoxModel5);
        panel11.add(comboBox5, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        button3 = new JButton();
        button3.setBackground(new Color(-1312257));
        button3.setForeground(new Color(-4180684));
        button3.setText("❌");
        panel11.add(button3, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        comboBox6 = new JComboBox();
        comboBox6.setBackground(new Color(-1312257));
        Font comboBox6Font = this.$$$getFont$$$("Segoe UI Black", -1, -1, comboBox6.getFont());
        if (comboBox6Font != null) comboBox6.setFont(comboBox6Font);
        comboBox6.setForeground(new Color(-15181146));
        final DefaultComboBoxModel defaultComboBoxModel6 = new DefaultComboBoxModel();
        defaultComboBoxModel6.addElement("Select Table 3");
        comboBox6.setModel(defaultComboBoxModel6);
        panel11.add(comboBox6, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JPanel panel12 = new JPanel();
        panel12.setLayout(new GridLayoutManager(2, 2, new Insets(0, 0, 0, 0), -1, -1));
        panel12.setBackground(new Color(-1246977));
        panel5.add(panel12, new GridConstraints(0, 5, 2, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        final Spacer spacer4 = new Spacer();
        panel12.add(spacer4, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        spinner1 = new JSpinner();
        spinner1.setBackground(new Color(-1312257));
        Font spinner1Font = this.$$$getFont$$$("Segoe UI Black", -1, -1, spinner1.getFont());
        if (spinner1Font != null) spinner1.setFont(spinner1Font);
        spinner1.setForeground(new Color(-15181146));
        panel12.add(spinner1, new GridConstraints(1, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(1, -1), null, 0, false));
        final JLabel label1 = new JLabel();
        label1.setBackground(new Color(-1246465));
        Font label1Font = this.$$$getFont$$$("Segoe UI Black", -1, -1, label1.getFont());
        if (label1Font != null) label1.setFont(label1Font);
        label1.setForeground(new Color(-15181146));
        label1.setText("Select Num:");
        panel12.add(label1, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        comboBox7 = new JComboBox();
        comboBox7.setBackground(new Color(-1312257));
        Font comboBox7Font = this.$$$getFont$$$("Segoe UI Black", -1, -1, comboBox7.getFont());
        if (comboBox7Font != null) comboBox7.setFont(comboBox7Font);
        comboBox7.setForeground(new Color(-15181146));
        final DefaultComboBoxModel defaultComboBoxModel7 = new DefaultComboBoxModel();
        defaultComboBoxModel7.addElement("Select Table 4");
        comboBox7.setModel(defaultComboBoxModel7);
        panel5.add(comboBox7, new GridConstraints(0, 3, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        comboBox8 = new JComboBox();
        comboBox8.setBackground(new Color(-1312257));
        Font comboBox8Font = this.$$$getFont$$$("Segoe UI Black", -1, -1, comboBox8.getFont());
        if (comboBox8Font != null) comboBox8.setFont(comboBox8Font);
        comboBox8.setForeground(new Color(-15181146));
        final DefaultComboBoxModel defaultComboBoxModel8 = new DefaultComboBoxModel();
        defaultComboBoxModel8.addElement("Select Attributes");
        comboBox8.setModel(defaultComboBoxModel8);
        panel5.add(comboBox8, new GridConstraints(1, 3, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        button4 = new JButton();
        button4.setBackground(new Color(-1312257));
        button4.setForeground(new Color(-4180684));
        button4.setText("❌");
        panel5.add(button4, new GridConstraints(0, 4, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label2 = new JLabel();
        label2.setIcon(new ImageIcon(getClass().getResource("/315Logo.png")));
        label2.setText("");
        panel1.add(label2, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    private Font $$$getFont$$$(String fontName, int style, int size, Font currentFont) {
        if (currentFont == null) return null;
        String resultName;
        if (fontName == null) {
            resultName = currentFont.getName();
        } else {
            Font testFont = new Font(fontName, Font.PLAIN, 10);
            if (testFont.canDisplay('a') && testFont.canDisplay('1')) {
                resultName = fontName;
            } else {
                resultName = currentFont.getName();
            }
        }
        return new Font(resultName, style >= 0 ? style : currentFont.getStyle(), size >= 0 ? size : currentFont.getSize());
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return panel1;
    }


}

