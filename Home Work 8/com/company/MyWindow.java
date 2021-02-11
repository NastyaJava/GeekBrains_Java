package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame {
    private JButton buttonOk = new JButton("Проверка введенных данных");
    private final JLabel labelWelcome = new JLabel("Введите свои данные для анкеты");
    private final JLabel labelName = new JLabel("Имя: ");
    private final JLabel labelSurname = new JLabel("Фамилия: ");
    private final JLabel labelYear = new JLabel("Год рождения: ");
    private final JLabel labelSex = new JLabel("Пол: ");
    private JTextField inputName = new JTextField("",5);
    private JTextField inputSurname = new JTextField("",6);
    private JRadioButton radioFemale = new JRadioButton("ж");
    private JRadioButton radioMale = new JRadioButton("м");
    String[] years = new String[50];

    private JComboBox comboYear;
    ActionListener listener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String gender = "";
            if(radioFemale.isSelected())
                gender += "женский";
            else if(radioMale.isSelected())
                gender += "мужской";
            else gender += "не определен";

            String message = "Данные о Вас: \n";
            message += inputSurname.getText()+" "+inputName.getText()+", ";
            message += comboYear.getSelectedItem()+"-го года рождения, ";
            message += "пол "+gender;

            JOptionPane.showMessageDialog(null, message, "Анкета", JOptionPane.PLAIN_MESSAGE);
        }
    };

    public  MyWindow(){
        super("Анкета");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(400,400);
        setLocation(500,300);
        fillYears();
        comboYear = new JComboBox(years);

        buttonOk.addActionListener(listener);
        ButtonGroup radioGroup = new ButtonGroup();
        radioGroup.add(radioFemale);
        radioGroup.add(radioMale);
        radioFemale.setSelected(true);

        JPanel panelGender = new JPanel();
        panelGender.setLayout(new GridLayout(1,2));
        panelGender.add(radioFemale);
        panelGender.add(radioMale);

        JPanel panelInput = new JPanel();
        panelInput.setLayout(new GridLayout(4,2));
        panelInput.add(labelName);
        panelInput.add(inputName);
        panelInput.add(labelSurname);
        panelInput.add(inputSurname);
        panelInput.add(labelYear);
        panelInput.add(comboYear);
        panelInput.add(labelSex);
        panelInput.add(panelGender);

        JPanel panel = new JPanel();
        add(panel);

        panel.setLayout(new GridLayout(3,1));

        panel.add(labelWelcome);
        panel.add(panelInput);
        panel.add(buttonOk);

        setVisible(true);
    }
    void fillYears() {
        for(int i = 0; i < years.length; i++ ){
            years[i] = ""+(1960 + i);
        }
    }
}
