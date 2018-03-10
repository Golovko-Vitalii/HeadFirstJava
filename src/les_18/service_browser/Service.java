package les_18.service_browser;

import javax.swing.*;
import java.io.Serializable;

public interface Service extends Serializable {
    public JPanel getGUIPanel();
}
