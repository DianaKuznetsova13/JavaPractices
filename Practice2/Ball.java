public class Ball {
    private float x;
    private float y;

    public Ball(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Ball() {
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void move(float xDisp, float yDisp) {
        x += xDisp;
        y += yDisp;
    }

    public String toString() {
        return x + ", " + y;
    }
}