package Day15.Task5_NetworkingSerialization;

import java.io.Serializable;

public class Calculation implements Serializable{
	private int x;
    private int y;
    String operation;

    public Calculation(int x, int y, String operation) {
        this.x = x;
        this.y = y;
        this.operation = operation;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

}
