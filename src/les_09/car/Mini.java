package les_09.car;

import java.awt.*;

public class Mini extends Car {
    Color color;
    public Mini(){
        this(Color.RED);
    }
    public Mini(Color color){
        super("Mini");
        this.color = color;
    }
}
