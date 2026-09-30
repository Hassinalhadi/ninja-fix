package zendesk.core;

import zendesk.core.Settings;

/* loaded from: classes.dex */
public class SettingsPack<E extends Settings> {
    private CoreSettings coreSettings;
    private E settings;

    public SettingsPack(CoreSettings coreSettings, E e) {
        this.coreSettings = coreSettings;
        this.settings = e;
    }

    public CoreSettings getCoreSettings() {
        return this.coreSettings;
    }

    public E getSettings() {
        return this.settings;
    }
}
