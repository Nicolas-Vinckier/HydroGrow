package application;

import javax.swing.*;
import java.awt.event.*;
import application.Plante;
import application.Environnement;


public class MonJFrame extends JFrame {

	public MonJFrame() {
		// Titre de la fenêtre
		super("HydroGrow Interface");

		// Taille de la fenêtre
		setSize(500, 500);

		// Action lors de la fermeture de la fenêtre
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Initialisation des composants
		init();

		// Affichage de la fenêtre
		setVisible(true);

	}

	public void init() {
		setLayout(null);

		// JLabel pour la sélection de plante
		JLabel labelPlante = new JLabel("Plante : ");
		labelPlante.setBounds(20, 10, 70, 50); // Définissez les coordonnées et la taille du label
		add(labelPlante); // Ajoutez le label au JFrame

		// Création d'une combobox pour la sélection de plante
		String[] plantes = { "Tomates", "Carottes", "Salade", "Radis", "Poivrons" };
		JComboBox<String> comboBox = new JComboBox<>(plantes);
		comboBox.setBounds(120, 20, 150, 30);
		add(comboBox);

		// JLabel pour la température
		JLabel labelTemp = new JLabel("Température : ");
		labelTemp.setBounds(20, 70, 100, 30);
		add(labelTemp);

		// JTextField pour la température
		JTextField tempField = new JTextField();
		tempField.setBounds(120, 70, 150, 30);
		add(tempField);

		// JLabel pour l'humidité
		JLabel labelHum = new JLabel("Humidité : ");
		labelHum.setBounds(20, 120, 100, 30);
		add(labelHum);

		// JTextField pour l'humidité
		JTextField humField = new JTextField();
		humField.setBounds(120, 120, 150, 30);
		add(humField);

		// JButton pour reset
		JButton resetButton = new JButton("Reset");
		resetButton.setBounds(20, 170, 100, 30);
		add(resetButton);

		resetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tempField.setText(""); // Réinitialisation du champ de texte pour la température
				humField.setText(""); // Réinitialisation du champ de texte pour l'humidité
				// labelOutput.setText(""); // Réinitialisation du champ de texte pour
				// l'affichage de sortie
			}
		});

		// JButton pour valider
		JButton validButton = new JButton("Valider");
		validButton.setBounds(170, 170, 100, 30);
		add(validButton);

		// JLabel pour l'affichage de sortie
		JLabel labelOutput = new JLabel(" ");
		labelOutput.setBounds(20, 220, 250, 30);
		add(labelOutput);

		// Action pour le bouton Valider
		validButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Récupération des valeurs saisies
				String planteSelectionnee = comboBox.getSelectedItem().toString();
				double temperature = Double.parseDouble(tempField.getText());
				double humidite = Double.parseDouble(humField.getText());

				// Vérification des conditions optimales
				Plante plante = Index.getPlante(planteSelectionnee);
				Environnement env = new Environnement(temperature, humidite);
				boolean isOptimal = env.isOptimal(plante);

				// Affichage du résultat
				if (isOptimal) {
					labelOutput.setText("Les conditions sont optimales pour la plante sélectionnée !");
				} else {
					labelOutput.setText("Les conditions ne sont pas optimales pour la plante sélectionnée !");
				}
			}
		});

		// Affichage de la fenêtre
		setVisible(true);
	}

	public static void main(String[] args) {
		new MonJFrame();
	}
}
