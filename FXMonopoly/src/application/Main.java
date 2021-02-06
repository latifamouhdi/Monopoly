package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	MediaPlayer MediaPlayer;
	
	@Override
	public void start(Stage primaryStage) {
//		Media music=new Media("/ressources/songs/ScottBuckley-Sleep.mp3");
//		MediaPlayer=new MediaPlayer(music);
//		MediaPlayer.setAutoPlay(true);
//		MediaPlayer.setVolume(10);
		try {
			Parent root =FXMLLoader.load(getClass().getResource("/accueil/Accueil.fxml"));
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.initStyle(StageStyle.UNDECORATED);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
