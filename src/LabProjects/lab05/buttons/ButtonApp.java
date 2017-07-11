package LabProjects.lab05.buttons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Created by Abdullah Al Amin on 7/3/2017.
 */
public class ButtonApp extends JFrame{
    JToggleButton toggleButton;
    JCheckBox checkBox;

    public ButtonApp()  {

        this.setLayout(new FlowLayout());

        toggleButton = new JToggleButton("OFF");
        toggleButton.setSize(10,10);


        ItemListener checkBoxAction = new CheckBoxAction();

        checkBox = new JCheckBox("Canada");
        checkBox.addItemListener(checkBoxAction);
        add(checkBox);

        checkBox= new JCheckBox("Australia");
        checkBox.addItemListener(checkBoxAction);
        add(checkBox);

        checkBox = new JCheckBox("America");
        checkBox.addItemListener(checkBoxAction);
        add(checkBox);

        toggleButton.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(toggleButton.isSelected()){
                    toggleButton.setText("ON");
                }else{
                    toggleButton.setText("OFF");
                }

            }
        });
        add(toggleButton);

        setSize(300,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


class CheckBoxAction implements ItemListener{

    @Override
    public void itemStateChanged(ItemEvent e) {
        JCheckBox selected = (JCheckBox)e.getItem();
        if(selected.isSelected()){
            JOptionPane.showMessageDialog(null,selected.getText()+" is selected","info",JOptionPane.INFORMATION_MESSAGE);
        }else {
           // JOptionPane.showMessageDialog(null,selected.getText()+"is cleared","info",JOptionPane.INFORMATION_MESSAGE);
        }
    }
}