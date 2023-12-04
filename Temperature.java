package javalab;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Temperature {
			public class TemperatureConverters extends JFrame implements ActionListener {
				private JTextField celsiusTextField;
				private JTextField fahrenheitTextField;
				TemperatureConverters(){
					setTitle("Temperature Converter");
					setSize(300,150);
					setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// CLOSE BUTTON ON THE WINDOW
					JPanel panel=new JPanel();// CREATION OF PANEL
					panel.setLayout(new GridLayout(3,2));
					//CREATE AND ADD COMPONETS
					JLabel celsiusLabel=new JLabel("Celsius");
					celsiusTextField=new JTextField();
					JLabel fahrenheitTextField = new JLabel("Fahrenheit");
					fahrenheitTextField=new JTextField();
					fahrenheitTextField.setEditable(false);
					JButton convertButton=new JButton("Convert");
					// REGISTER THE BUTTON actionListener
					convertButton.addActionListener(this);
					
					panel.add(celsiusLabel);
					panel.add(celsiusTextField);
					panel.add(fahrenheitLabel);
					panel.add(fahrenheitTextField);
					panel.add(new JLabel());
					panel.add(convertButton);
					add(panel);
				}
				public static void main(String []args) {
					TemperatureConveters converter=new TemperatureConverter();
					converter.setVisible(true);		}

					public void actionPerformed(ActionEvent e) {
						
					}
				
			}

		}


