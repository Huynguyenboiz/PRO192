package slot6.Q2;

public class Engine {
    private String designer;
    private int power;

    public Engine() {}

    public Engine(String designer, int power) {
        this.designer = designer;
        this.power = power;
    }

    public String getDesigner() {
        if (designer.length() >= 3) {
            String first3 = designer.substring(0, 3);
            return Character.toLowerCase(first3.charAt(0)) + first3.substring(1);
        }
        return designer.toLowerCase();
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String toString() {
        return designer + " " + power;
    }
}