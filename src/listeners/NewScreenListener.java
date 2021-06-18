package listeners;

import javafx.event.EventHandler;
import javafx.scene.Node;

public interface NewScreenListener extends EventHandler {
    public void ChangeScreen(Node node);
    public void removeTopScreen();
}
