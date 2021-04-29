import java.awt.dnd.DragGestureEvent;

public class Square extends Shape{
    @Override
    public void Draw() {
        System.out.println("Square.Draw");
    }

    @Override
    public void Erase() {
        System.out.println("Square.Erase");
    }
}
