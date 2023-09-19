package twoone;


class TrafficLight {
    private String color;
    private int duration;

    public TrafficLight(String color, int duration) {
        this.color = color;
        this.duration = duration;
    }

    public void changeColor(String newColor) {
        color = newColor;
    }

    public boolean isRed() {
        return color.equalsIgnoreCase("red");
    }

    public boolean isGreen() {
        return color.equalsIgnoreCase("green");
    }

    public String getColor() {
        return color;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}

public class H8 {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight("red", 30);

        System.out.println("Current color: " + trafficLight.getColor());
        System.out.println("Is it red? " + trafficLight.isRed());
        System.out.println("Is it green? " + trafficLight.isGreen());

        trafficLight.changeColor("green");
        System.out.println("Current color: " + trafficLight.getColor());
        System.out.println("Is it green? " + trafficLight.isGreen());

        trafficLight.setDuration(45);
        System.out.println("Current duration: " + trafficLight.getDuration());
    }
}
