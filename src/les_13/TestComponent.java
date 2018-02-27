package les_13;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class TestComponent implements ActionListener{
    private JLabel label2;
    private JTextField field1;
    private JTextArea text;
    private JCheckBox check;
    private JList list;
    public static void main(String[] args){
        TestComponent tc = new TestComponent();
        tc.go();
    }
    public void go(){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JPanel panelTwo = new JPanel();
        JPanel panelMain = new JPanel();
        panelMain.setLayout(new FlowLayout());
        panelMain.add(panel);
        panelMain.add(panelTwo);
        panel.setBackground(Color.cyan);
        panelTwo.setBackground(Color.green);
        frame.setContentPane(panelMain);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panelTwo.setLayout(new BoxLayout(panelTwo, BoxLayout.Y_AXIS));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,350);
        JLabel label1 = new JLabel("Type text:");
        field1 = new JTextField(20);
        field1.setText(".......");
        field1.addActionListener(this);
        panel.add(label1);
        panel.add(field1);
        label2 = new JLabel();
        label2.setText(".......");
        panel.add(label2);
        frame.setVisible(true);
        text = new JTextArea(10,20);
        JScrollPane scroller = new JScrollPane(text);
        text.setLineWrap(true);
        scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        panel.add(scroller);
        text.setText("New text in JTextArea \n");
        text.append("Is New Button clicked? \n");
        field1.requestFocus();
        JButton newButton = new JButton("New Button");
        newButton.addActionListener(new NewButtonListener());
        panel.add(newButton);
        check = new JCheckBox("Goes to 11");
        check.addItemListener(new CheckListener());
        check.setSelected(false);
        panel.add(check);
        // panelTwo
        String[] listEntries = {"alpha", "beta", "gamma", "delta", "epsilon", "zeta", "eta", "theta"};
        list = new JList(listEntries);
        JScrollPane scrollPane = new JScrollPane(list);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        panelTwo.add(scrollPane);
        list.setVisibleRowCount(4);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list.addListSelectionListener(new ListListener());


    }
    class ListListener implements ListSelectionListener {
        public void valueChanged(ListSelectionEvent event){
            if(!event.getValueIsAdjusting()){
                String selection = (String) list.getSelectedValue();
                text.append("You've selected " + selection + "\n");
                text.requestFocus();
            }
        }
    }
    class CheckListener implements ItemListener {
        public void itemStateChanged(ItemEvent event){
            String onOrOff = "off";
            if(check.isSelected()) onOrOff = "on";
            text.append("Check box is " + onOrOff + "\n");
            text.requestFocus();
        }
    }
    class NewButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
            text.append("new button clicked! \n");
            text.selectAll();
            text.requestFocus();
        }
    }
    public void actionPerformed(ActionEvent event){
        label2.setText(field1.getText());
        field1.requestFocus();
    }
}
