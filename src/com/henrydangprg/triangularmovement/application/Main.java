package com.henrydangprg.triangularmovement.application;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

// Java 8 code
public class Main extends Application {
	
	private final double LEFT_VERTEX_X = 0.0;
    private final double LEFT_VERTEX_Y = 400.0;
    private final double TOP_VERTEX_X = 250.0;
    private final double TOP_VERTEX_Y = 0.0;
    private final double RIGHT_VERTEX_X = 500.0;
    private final double RIGHT_VERTEX_Y = 400.0;
    
	private static final double WIDTH = 800, HEIGHT = 600;

	private Node ghost;
	private Image ghostImage;
	
	private static final String GHOST_IMAGE_LOC = "https://lh3.googleusercontent.com/-Hcp_WDmAQ3I/AAAAAAAAAAI/AAAAAAAACt0/nldggsC7BIo/s46-c-k-no/photo.jpg";
	
	boolean goNorth, goSouth, goEast, goWest;
	
	private final double GHOST_STARTING_X = 250.0;
	private final double GHOST_STARTING_Y = 266.67;
	private final double GHOST_RADIUS = 1.0;
	
	Polygon triangle = new Polygon();
	
	/**
	 * Launches the program
	 * @param args
	 */
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(final Stage stage) throws Exception {
		
		ghostImage = new Image(GHOST_IMAGE_LOC);
        ghost = new ImageView(ghostImage);
        
 		Line leftLine = new Line(LEFT_VERTEX_X, LEFT_VERTEX_Y, GHOST_STARTING_X, GHOST_STARTING_Y);
 		Line topLine = new Line(TOP_VERTEX_X, TOP_VERTEX_Y, GHOST_STARTING_X, GHOST_STARTING_Y);
 		Line rightLine = new Line(RIGHT_VERTEX_X, RIGHT_VERTEX_Y, GHOST_STARTING_X, GHOST_STARTING_Y);
 		
 		Group layout = new Group(ghost, triangle, leftLine, topLine, rightLine);
 		Scene scene = new Scene(layout, WIDTH, HEIGHT, Color.BLACK);
 		
 		stage.setTitle("Simulation");
		stage.setScene(scene);
		stage.show();
	}
}