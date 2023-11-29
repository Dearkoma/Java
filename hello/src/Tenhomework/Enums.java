package Tenhomework;

public class Enums {
    public static void main(String[] args) {
        color green = color.GREEN;//切换属性在这.后面
        green.show();
        switch (green) {
            case RED:
                System.out.println("红色");
                break;
            case GREEN:
                System.out.println("绿色");
                break;
            case BLUE:
                System.out.println("蓝色");
                break;
            default:
                System.out.println("没颜色");
                break;
        }
    }
}

/**
 * Myinterface
 */
interface Myinterface {
    public void show();
}
enum color implements Myinterface{
    RED(255, 0, 0), GREEN(0, 255, 0), BLUE(0, 0, 255);
    private int redValue;
    private int greenValue;
    private int blueValue;
    color(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }

    public void show() {
        System.out.println("属性为:" + redValue +"," + greenValue +"," + blueValue);
    }
}
