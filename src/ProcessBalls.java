import processing.core.PApplet;

public class ProcessBalls extends PApplet {
    public static final int WIDTH=640;
    public static final int HEIGHT=480;
    public static final int RADIUS=10;

    public static void main(String[] args){
        PApplet.main("ProcessBalls",args);
    }
    public class ball{
        private int pos_x;
        private int pos_y;
        private int rad;
        private int speed;
        ball(int pos_x,int pos_y,int rad,int speed)
        {
            this.pos_x=pos_x;
            this.pos_y=pos_y;
            this.rad=rad;
            this.speed=speed;
        }
        public void draw()
        {
            ellipse(pos_x,pos_y,rad,rad);
            pos_x=pos_x+speed;
            if (pos_x>WIDTH)
                pos_x=pos_x-speed;
        }

    }
    ball ball_1=new ball(10,(HEIGHT/5),RADIUS,1);
    ball ball_2=new ball(10,(HEIGHT/5)*2,2*RADIUS,2);
    ball ball_3=new ball(10,(HEIGHT/5)*3,3*RADIUS,3);
    ball ball_4=new ball(10,(HEIGHT/5)*4,4*RADIUS,4);

    @Override
    public void settings() {
        super.settings();
        size(WIDTH,HEIGHT);
    }

    public void setup(){
        background(255);
    }
    public void draw()
    {
        drawCircle();
    }
    public void drawCircle(){
        fill(51);
        stroke(101);
        ball_1.draw();
        ball_2.draw();
        ball_3.draw();
        ball_4.draw();
    }
}
