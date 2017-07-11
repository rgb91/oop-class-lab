package LabProjects.lab05.basic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * Created by Abdullah Al Amin on 7/3/2017.
 */

/*JFrame is basically container for all the form  controls in a swing application.
* it is the starting point of any swing application*/
public class BasicApp extends JFrame {

    JLabel demoLabel;
    JTextField demoField;
    JTextArea demoArea;
    JButton button;

    /*when creating a swing application follow the steps:
    * 1.create the form control objects
    * 2.add the event handlers for the form control actions
    * 3.set the layout and add the  controls to the container e.g:JFrame
    * 4.set the application visible
     *5.set appropriate exit operation for the application*/

    public BasicApp() {

        //step1

        //the JLabel has many useful methods and properties. for further information consult oracle documentation:
        // https://docs.oracle.com/javase/7/docs/api/javax/swing/JLabel.html

        demoLabel = new JLabel();// JLabel also has constructor which takes string which will be displayed
        demoLabel.setText("Hello this is a demo label");
        demoLabel.setToolTipText("hello from floating position");

        // like JLabel all the form controls have many methods and properties. see oracle documentation
        demoField = new JTextField("default text");
        demoField.setColumns(20);

        demoArea = new JTextArea();
        demoArea.setRows(20);
        demoArea.setColumns(30);

        button = new JButton("click me");
        button.setToolTipText("click to see the action");

        //step 2
        button.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String fieldText = demoField.getText();
                demoArea.setText(fieldText.toUpperCase());
            }
        });

        //step 3
        this.setLayout(new FlowLayout());
        this.add(demoLabel);
        this.add(demoField);
        this.add(button);
        this.add(demoArea);
        this.setSize(300,300);

        //step 4
        this.setVisible(true);

        //step 5
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



    }
}
