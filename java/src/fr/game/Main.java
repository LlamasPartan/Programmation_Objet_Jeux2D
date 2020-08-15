package fr.game; // Déclaration du dossier dans lequel se trouve le fichier
 
// Ensemble des imports nécessaires dans ce fichier
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
 
// Classe contenant le point de départ du programme
public class Main extends Application {
	
	// Création des constantes nécessaires
	private static final int WIDTH = 1280;
	private static final  int HEIGHT = 720;
	
	// Point d'entrée du programme
    public static void main(String[] args) {
        launch(args); // Appel au lancement de l'application par JavaFX
    }	
 
    // Fonction de lancement de JavaFX
    @Override
    public void start(Stage primaryStage) {
    	// Ajout du titre
        primaryStage.setTitle("Tuto");
        
        // Création des formes
        Rectangle rectangle = new Rectangle(50, 150);
        Circle circle = new Circle(50);
        
        // Paramétrisation des formes
        rectangle.setX(100);
        rectangle.setY(100);
        circle.setCenterX(30);
        circle.setCenterY(30);
        
        rectangle.setFill(Color.GREEN);
        circle.setFill(Color.BLUE);
        
        // Création du panneau
        Pane root = new Pane();
        // Changement de la taille du panneau
        root.setPrefSize(WIDTH, HEIGHT);
        // Ajout des formes dans le panneau
        root.getChildren().add(rectangle);
        root.getChildren().add(circle);
        
        // Ajout du panneau à la fenêtre via une scène
        primaryStage.setScene(new Scene(root));
        // Affichage de la fenêtre
        primaryStage.show();
    }
}