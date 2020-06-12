
package chatty.gui.components.settings;

import chatty.WhisperManager;
import chatty.gui.components.LinkLabel;
import java.awt.GridBagConstraints;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Settings for community-contributed features.
 *
 * @author Donal Cahill
 */
public class ContribSettings extends SettingsPanel {

    public ContribSettings(final SettingsDialog d) {

        JPanel features = addTitledPanel("Contrib Features", 1);

        features.add(d.addSimpleBooleanSetting("popupFixEnabled",
                "Enable popup position fix",
                "Allows emote popups to appear when the window is small."),
                d.makeGbc(0, 4, 1, 1, GridBagConstraints.NORTHWEST));
    }
}
