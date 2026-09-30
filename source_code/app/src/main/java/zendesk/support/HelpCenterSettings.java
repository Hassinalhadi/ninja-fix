package zendesk.support;

import P8.c;
import zendesk.core.Settings;

/* loaded from: classes.dex */
public class HelpCenterSettings implements Settings {
    private static HelpCenterSettings DEFAULT = new HelpCenterSettings();

    @c("help_center_article_voting_enabled")
    private boolean articleVotingEnabled;
    private boolean enabled;
    private String locale;

    public HelpCenterSettings(boolean z2, boolean z10, String str) {
        this.enabled = z2;
        this.articleVotingEnabled = z10;
        this.locale = str;
    }

    public static HelpCenterSettings defaultSettings() {
        return DEFAULT;
    }

    public String getLocale() {
        return this.locale;
    }

    public boolean isArticleVotingEnabled() {
        return this.articleVotingEnabled;
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public HelpCenterSettings() {
    }
}
