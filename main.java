import javafx.animation.TranslateTransition;
import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.*;
import javafx.util.Duration;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class main extends Application{
    public boolean tile_position=true;           
    public boolean player1_chance=true;
    public boolean player2_chance=true;
    public boolean game=false;
    
    public Button game_start;
    public Button P1_BUtton;
    public Button P2_Button;
                   
    private Group tiles=new Group();
    
    public Label game_result;

    public Image board;
    public Image bottom_bg;
    
    public Circle player1_circle;
    public Circle player2_circle;

    public Rectangle tile;
    
    public int tile_size=60;
    public int rand_numb;
    public int tile_height_count=3;
    public int tile_width=10;
    public int tile_height=10;
    public int player1_position=1;
    public int player1_x=30;
    public int player1_y=570;
    public int player2_x=30;
    public int player2_y=570;
    public int player2_position=1;
    public int player1_circle_postion=1;
    public int player2_circle_postion=1;
    
    private void getnumber(){
        rand_numb=(int)(Math.random()*6+1);
    }
    public void movePlayer1() {
        for (int i = 0; i < rand_numb; i++) {
            if (player1_circle_postion % 2 == 1) {
                player1_x += 60;
            }
            if (player1_circle_postion % 2 == 0) {
                player1_x -= 60;
            }
            if (player1_x > 570) {
                player1_y -= 60;
                player1_x -= 60;
                player1_circle_postion++;
            }
            if (player1_x < 30) {
                player1_y -= 60;
                player1_x += 60;
                player1_circle_postion++;
            }
            if(player1_x==30 && player1_y==30){
                player1_x = 30;
                player1_y = 30;
                game_result.setTranslateX(260);
                game_result.setTranslateY(650);
                game_result.setText("Player1 Wins!");
                game_result.setTextFill(Color.GREEN);
                game_start.setText("Start Again");
                game = false;
            }
            if (player1_x < 20 || player1_y < 20 ) {
                player1_x = 30;
                player1_y = 30;
                game_result.setTranslateX(260);
                game_result.setTranslateY(650);
                game_result.setText("Player1 Wins!");
                game_result.setTextFill(Color.GREEN);
                game_start.setText("Start Again");
                game = false;
            }
        }
            SLplayer1();

    }
    public void SLplayer1(){
        //Ladders
        if(player1_position==2){
            player1_x=30;
            player1_y=450;
            player1_position=21;
            player1_circle_postion+=2;
        }
        if(player1_position==6){
            player1_x=390;
            player1_y=450;
            player1_position=27;
            player1_circle_postion+=2;
        }
        if(player1_position==8){
            player1_x=450;
            player1_y=390;
            player1_position=33;
            player1_circle_postion+=3;
        }
        if(player1_position==16){
            player1_x=390;
            player1_y=390;
            player1_position=34;
            player1_circle_postion+=2;
        }
        if(player1_position==24){
            player1_x=210;
            player1_y=210;
            player1_position=64;
            player1_circle_postion+=4;
        }
        if(player1_position==38){
            player1_x=150;
            player1_y=270;
            player1_position=58;
            player1_circle_postion+=2;
        }
        if(player1_position==63){
            player1_x=90;
            player1_y=90;
            player1_position=82;
            player1_circle_postion+=2;
        }
        if(player1_position==70){
            player1_x=570;
            player1_y=30;
            player1_position=91;
            player1_circle_postion+=3;
        }
        if(player1_position==73){
            player1_x=390;
            player1_y=30;
            player1_position=94;
            player1_circle_postion+=2;
        }
        if(player1_position==85){
            player1_x=210;
            player1_y=30;
            player1_position=97;
            player1_circle_postion+=1;
        }

        //Snakes

        if(player1_position==98){
            player1_x=270;
            player1_y=210;
            player1_position=65;
            player1_circle_postion-=3;
        }
        if(player1_position==95){
            player1_x=390;
            player1_y=270;
            player1_position=54;
            player1_circle_postion-=4;
        }
        if(player1_position==92){
            player1_x=450;
            player1_y=330;
            player1_position=48;
            player1_circle_postion-=5;
        }
        if(player1_position==81){
            player1_x=90;
            player1_y=210;
            player1_position=62;
            player1_circle_postion-=2;
        }
        if(player1_position==66){
            player1_x=270;
            player1_y=270;
            player1_position=56;
            player1_circle_postion-=1;
        }
        if(player1_position==59){
            player1_x=30;
            player1_y=390;
            player1_position=40;
            player1_circle_postion-=2;
        }
        if(player1_position==51){
            player1_x=570;
            player1_y=510;
            player1_position=11;
            player1_circle_postion-=4;
        }
        if(player1_position==46){
            player1_x=270;
            player1_y=450;
            player1_position=25;
            player1_circle_postion-=2;
        }
        if(player1_position==23){
            player1_x=270;
            player1_y=570;
            player1_position=5;
            player1_circle_postion-=2;
        }
        if(player1_position==32){
            player1_x=510;
            player1_y=570;
            player1_position=9;
            player1_circle_postion-=3;
        }
    }

    public void movePlayer2() {
        for (int i = 0; i < rand_numb; i++) {
            if (player2_circle_postion % 2 == 1) {
                player2_x += 60;
            }
            if (player2_circle_postion % 2 == 0) {
                player2_x -= 60;
            }
            if (player2_x > 570) {
                player2_y -= 60;
                player2_x -= 60;
                player2_circle_postion++;
            }
            if (player2_x < 30) {
                player2_y -= 60;
                player2_x += 60;
                player2_circle_postion++;
            }
            if(player2_x==30 && player2_y==30){
                player2_x = 30;
                player2_y = 30;
                game_result.setTranslateX(260);
                game_result.setTranslateY(650);
                game_result.setText("Player2 Wins!");
                game_result.setTextFill(Color.GREEN);
                game_start.setText("Start Again");
                game = false;
            }
            if (player2_x < 20 || player2_y < 20) {
                player2_x = 30;
                player2_y = 30;
                game_result.setTranslateX(260);
                game_result.setTranslateY(650);
                game_result.setText("Player2 Wins!");
                game_result.setTextFill(Color.GREEN);
                game_start.setText("Start Again");
                game = false;
            } 
        }
            //finalePlayer2();
            SLplayer2();
    }
    public void SLplayer2(){
        //Ladders
        if(player2_position==2){
            player2_x=30;
            player2_y=450;
            player2_position=21;
            player2_circle_postion+=2;
        }
        if(player2_position==6){
            player2_x=390;
            player2_y=450;
            player2_position=27;
            player2_circle_postion+=2;
        }
        if(player2_position==8){
            player2_x=450;
            player2_y=390;
            player2_position=33;
            player2_circle_postion+=3;
        }
        if(player2_position==16){
            player2_x=390;
            player2_y=390;
            player2_position=34;
            player2_circle_postion+=2;
        }
        if(player2_position==24){
            player2_x=210;
            player2_y=210;
            player2_position=64;
            player2_circle_postion+=4;
        }
        if(player2_position==38){
            player2_x=150;
            player2_y=270;
            player2_position=58;
            player2_circle_postion+=2;
        }
        if(player2_position==63){
            player2_x=90;
            player2_y=90;
            player2_position=82;
            player2_circle_postion+=2;
        }
        if(player2_position==70){
            player2_x=570;
            player2_y=30;
            player2_position=91;
            player2_circle_postion+=3;
        }
        if(player2_position==73){
            player2_x=390;
            player2_y=30;
            player2_position=94;
            player2_circle_postion+=2;
        }
        if(player2_position==85){
            player2_x=210;
            player2_y=30;
            player2_position=97;
            player2_circle_postion+=1;
        }

        //Snakes

        if(player2_position==98){
            player2_x=270;
            player2_y=210;
            player2_position=65;
            player2_circle_postion-=3;
        }
        if(player2_position==95){
            player2_x=390;
            player2_y=270;
            player2_position=54;
            player2_circle_postion-=4;
        }
        if(player2_position==92){
            player2_x=450;
            player2_y=330;
            player2_position=48;
            player2_circle_postion-=5;
        }
        if(player2_position==81){
            player2_x=90;
            player2_y=210;
            player2_position=62;
            player2_circle_postion-=2;
        }
        if(player2_position==66){
            player2_x=270;
            player2_y=270;
            player2_position=56;
            player2_circle_postion-=1;
        }
        if(player2_position==59){
            player2_x=30;
            player2_y=390;
            player2_position=40;
            player2_circle_postion-=2;
        }
        if(player2_position==51){
            player2_x=570;
            player2_y=510;
            player2_position=11;
            player2_circle_postion-=4;
        }
        if(player2_position==46){
            player2_x=270;
            player2_y=450;
            player2_position=25;
            player2_circle_postion-=2;
        }
        if(player2_position==23){
            player2_x=270;
            player2_y=570;
            player2_position=5;
            player2_circle_postion-=2;
        }
        if(player2_position==32){
            player2_x=510;
            player2_y=570;
            player2_position=9;
            player2_circle_postion-=3;
        }
    }
    
    public Parent Background_setup(){
        StackPane temp=new StackPane();
        temp.setPrefSize(tile_size*tile_width,(tile_height*tile_size)+80);
        temp.getChildren().addAll(tiles);
        for(int i=0;i<tile_height;i++){
            for(int j=0;j<tile_width;j++){
                tile=new Rectangle(tile_height,tile_height);
                tile.setTranslateX(j*tile_size);
                tile.setTranslateY(i*tile_size);
                tiles.getChildren().add(tile);
            }
            tile_height_count+=1;
        }
        player1_circle=new Circle(30);
        player1_circle.setFill(Color.AQUA);
        player1_circle.setTranslateX(player1_x);
        player1_circle.setTranslateY(player1_y);
       
        player2_circle=new Circle(30);
        player2_circle.setFill(Color.LIME);
        player2_circle.setTranslateX(player1_x);
        player2_circle.setTranslateY(player1_y);

        P1_BUtton =new Button("Player 1");
        P1_BUtton.setTranslateX(10);
        P1_BUtton.setTranslateY(620);
        P1_BUtton.setStyle("-fx-background-color: #00ffff; ");
        P1_BUtton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(game){
                    game_result.setText("");
                    if(player1_chance){
                        getnumber();
                        if(rand_numb==1){
                            Image temp_test=new Image("dice1.png");
                            ImageView dice=new ImageView();
                            dice.setImage(temp_test);
                            dice.setStyle("-fx-border-color: black");
                            dice.setStyle("-fx-border-width: 5");
                            dice.setFitHeight(30);
                            dice.setFitWidth(30);
                            dice.setX(280);
                            dice.setY(620);
                            tiles.getChildren().addAll(dice);
                        }
                        if(rand_numb==2){
                            Image temp_test=new Image("dice2.png");
                            ImageView dice=new ImageView();
                            dice.setImage(temp_test);
                            dice.setStyle("-fx-border-color: black");
                            dice.setStyle("-fx-border-width: 5");
                            dice.setFitHeight(30);
                            dice.setFitWidth(30);
                            dice.setX(280);
                            dice.setY(620);
                            tiles.getChildren().addAll(dice);
                        }
                        if(rand_numb==3){
                            Image temp_test=new Image("dice3.png");
                            ImageView dice=new ImageView();
                            dice.setImage(temp_test);
                            dice.setStyle("-fx-border-color: black");
                            dice.setStyle("-fx-border-width: 5");
                            dice.setFitHeight(30);
                            dice.setFitWidth(30);
                            dice.setX(280);
                            dice.setY(620);
                            tiles.getChildren().addAll(dice);
                        }
                        if(rand_numb==4){
                            Image temp_test=new Image("dice4.png");
                            ImageView dice=new ImageView();
                            dice.setImage(temp_test);
                            dice.setStyle("-fx-border-color: black");
                            dice.setStyle("-fx-border-width: 5");
                            dice.setFitHeight(30);
                            dice.setFitWidth(30);
                            dice.setX(280);
                            dice.setY(620);
                            tiles.getChildren().addAll(dice);
                        }
                        if(rand_numb==5){
                            Image temp_test=new Image("dice5.png");
                            ImageView dice=new ImageView();
                            dice.setImage(temp_test);
                            dice.setStyle("-fx-border-color: black");
                            dice.setStyle("-fx-border-width: 5");
                            dice.setFitHeight(30);
                            dice.setFitWidth(30);
                            dice.setX(280);
                            dice.setY(620);
                            tiles.getChildren().addAll(dice);
                        }
                        if(rand_numb==6){
                            Image temp_test=new Image("dice6.png");
                            ImageView dice=new ImageView();
                            dice.setImage(temp_test);
                            dice.setStyle("-fx-border-color: black");
                            dice.setStyle("-fx-border-width: 5");
                            dice.setFitHeight(30);
                            dice.setFitWidth(30);
                            dice.setX(280);
                            dice.setY(620);
                            tiles.getChildren().addAll(dice);
                        }
                        if(player1_x==270 && player1_y==30 && rand_numb>4){
                            game_result.setTranslateX(260);
                            game_result.setTranslateY(650);
                            game_result.setText("Out of goal, Try again!");
                            game_result.setTextFill(Color.RED);
                        }
                        else if(player1_x==210 && player1_y==30 && rand_numb>3){
                            game_result.setTranslateX(260);
                            game_result.setTranslateY(650);
                            game_result.setText("Out of goal, Try again!");
                            game_result.setTextFill(Color.RED);
                        }
                        else if(player1_x==150 && player1_y==30 && rand_numb>2){
                            game_result.setTranslateX(260);
                            game_result.setTranslateY(650);
                            game_result.setText("Out of goal, Try again!");
                            game_result.setTextFill(Color.RED);
                        }
                        else if(player1_x==90 && player1_y==30 && rand_numb>1){
                            game_result.setTranslateX(260);
                            game_result.setTranslateY(650);
                            game_result.setText("Out of goal, Try again!");
                            game_result.setTextFill(Color.RED);
                        } 
                        else{
                            player1_position+=rand_numb; 
                            movePlayer1();
                            playermove(player1_x,player1_y,player1_circle);
                        }
                        player1_chance=false;
                        player2_chance=true;
                        
                    }
                } 
            }  
        });

        P2_Button =new Button("Player 2");
        P2_Button.setTranslateX(540);
        P2_Button.setTranslateY(620);
        P2_Button.setStyle("-fx-background-color: #00ff00 ; ");
        P2_Button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(game){
                    game_result.setText("");
                    if(player2_chance){
                        getnumber();
                        if(rand_numb==1){
                            Image temp_test=new Image("dice1.png");
                            ImageView dice=new ImageView();
                            dice.setImage(temp_test);
                            dice.setStyle("-fx-border-color: black");
                            dice.setStyle("-fx-border-width: 5");
                            dice.setFitHeight(30);
                            dice.setFitWidth(30);
                            dice.setX(280);
                            dice.setY(620);
                            tiles.getChildren().addAll(dice);
                        }
                        if(rand_numb==2){
                            Image temp_test=new Image("dice2.png");
                            ImageView dice=new ImageView();
                            dice.setImage(temp_test);
                            dice.setStyle("-fx-border-color: black");
                            dice.setStyle("-fx-border-width: 5");
                            dice.setFitHeight(30);
                            dice.setFitWidth(30);
                            dice.setX(280);
                            dice.setY(620);
                            tiles.getChildren().addAll(dice);
                        }
                        if(rand_numb==3){
                            Image temp_test=new Image("dice3.png");
                            ImageView dice=new ImageView();
                            dice.setImage(temp_test);
                            dice.setStyle("-fx-border-color: black");
                            dice.setStyle("-fx-border-width: 5");
                            dice.setFitHeight(30);
                            dice.setFitWidth(30);
                            dice.setX(280);
                            dice.setY(620);
                            tiles.getChildren().addAll(dice);
                        }
                        if(rand_numb==4){
                            Image temp_test=new Image("dice4.png");
                            ImageView dice=new ImageView();
                            dice.setImage(temp_test);
                            dice.setStyle("-fx-border-color: black");
                            dice.setStyle("-fx-border-width: 5");
                            dice.setFitHeight(30);
                            dice.setFitWidth(30);
                            dice.setX(280);
                            dice.setY(620);
                            tiles.getChildren().addAll(dice);
                        }
                        if(rand_numb==5){
                            Image temp_test=new Image("dice5.png");
                            ImageView dice=new ImageView();
                            dice.setImage(temp_test);
                            dice.setStyle("-fx-border-color: black");
                            dice.setStyle("-fx-border-width: 5");
                            dice.setFitHeight(30);
                            dice.setFitWidth(30);
                            dice.setX(280);
                            dice.setY(620);
                            tiles.getChildren().addAll(dice);
                        }
                        if(rand_numb==6){
                            Image temp_test=new Image("dice6.png");
                            ImageView dice=new ImageView();
                            dice.setImage(temp_test);
                            dice.setStyle("-fx-border-color: black");
                            dice.setStyle("-fx-border-width: 5");
                            dice.setFitHeight(30);
                            dice.setFitWidth(30);
                            dice.setX(280);
                            dice.setY(620);
                            tiles.getChildren().addAll(dice);
                        }
                        if(player2_x==270 && player2_y==30 && rand_numb>4){
                            game_result.setTranslateX(260);
                            game_result.setTranslateY(650);
                            game_result.setText("Out of goal, Try again!");
                            game_result.setTextFill(Color.RED);
                        }
                        else if(player2_x==210 && player2_y==30 && rand_numb>3){
                            game_result.setTranslateX(260);
                            game_result.setTranslateY(650);
                            game_result.setText("Out of goal, Try again!");
                            game_result.setTextFill(Color.RED);
                        }
                        else if(player2_x==150 && player2_y==30 && rand_numb>2){
                            game_result.setTranslateX(260);
                            game_result.setTranslateY(650);
                            game_result.setText("Out of goal, Try again!");
                            game_result.setTextFill(Color.RED);
                        }
                        else if(player2_x==90 && player2_y==30 && rand_numb>1){
                            game_result.setTranslateX(260);
                            game_result.setTranslateY(650);
                            game_result.setText("Out of goal, Try again!");
                            game_result.setTextFill(Color.RED);
                        } 
                        else{
                            player2_position+=rand_numb;
                            movePlayer2();
                            playermove(player2_x,player2_y,player2_circle);
                        }
                        player2_chance=false;
                        player1_chance=true;
                    }
                } 
            }  
        });

        game_start=new Button("Start!");
        game_start.setTranslateX(260);
        game_start.setTranslateY(670);
        game_start.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                game_start.setText("Game Started");
                game_result.setText("");
                player1_x=30;
                player1_y=570;
                player1_circle.setTranslateX(player1_x);
                player1_circle.setTranslateY(player1_y);
                player2_x=30;
                player2_y=570;
                player2_circle.setTranslateX(player1_x);
                player2_circle.setTranslateY(player1_y); 
                player1_position=1;
                player2_position=1;
                game=true;
            } 
        });

        game_result=new Label("");
        game_result.setTranslateX(260);
        game_result.setTranslateY(650);

        board=new Image("board.jpeg");
        ImageView background=new ImageView();
        background.setImage(board);
        background.setFitHeight(600);
        background.setFitWidth(600);
        
        bottom_bg=new Image("bg.jpg");
        ImageView bg=new ImageView();
        
        bg.setImage(bottom_bg);
        bg.setX(0);
        bg.setY(600);
        bg.setFitHeight(96);
        bg.setFitWidth(600);

        tiles.getChildren().addAll(bg);        
        tiles.getChildren().addAll(background);
        tiles.getChildren().addAll(player1_circle);
        tiles.getChildren().addAll(player2_circle);
        tiles.getChildren().addAll(P1_BUtton);
        tiles.getChildren().addAll(P2_Button);
        tiles.getChildren().addAll(game_start);
        tiles.getChildren().addAll(game_result);
        return temp;
    }
    public void playermove(int x,int y, Circle z){
        TranslateTransition movement=new TranslateTransition(Duration.millis(1000),z);
        movement.setToX(x);
        movement.setToY(y);
        movement.setAutoReverse(false);
        movement.play();
    }
    @Override
    public void start(Stage temp_board) throws Exception {
        Scene sc=new Scene(Background_setup());
        temp_board.setTitle("Snake&Ladders");
        temp_board.setScene(sc);
        temp_board.show();

    }
    public static void main(String[] args) {
        launch(args);
    }
    
}