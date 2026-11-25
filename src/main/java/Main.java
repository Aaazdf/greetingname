import zero.App;
import zero.ui.Label;

public class Main extends App {
    @Override public void settings() { 
        title("Greeting");
        size(420,240);
        //comments
        padding(10);
    }

    @Override public void setup() {
        Label greeting = new Label("Hello, Java!");
        show(greeting);
    }
    public static void main(String[] args) { launch(args); }
}
