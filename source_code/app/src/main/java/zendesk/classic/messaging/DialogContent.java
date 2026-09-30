package zendesk.classic.messaging;

/* loaded from: classes.dex */
public class DialogContent {
    private final Config config;
    private final String message;
    private final String negativeText;
    private final String positiveText;
    private final Config previousConfig;
    private final String title;

    /* loaded from: classes.dex */
    public static class Builder {
        private final Config config;
        private String message;
        private String negativeText = null;
        private String positiveText = null;
        private Config previousConfig = null;
        private String title;

        public Builder(Config config) {
            this.config = config;
        }

        public DialogContent build() {
            return new DialogContent(this.title, this.message, this.negativeText, this.positiveText, this.config, this.previousConfig, 0);
        }

        public Builder withMessage(String str) {
            this.message = str;
            return this;
        }

        public Builder withNegativeText(String str) {
            this.negativeText = str;
            return this;
        }

        public Builder withPositiveText(String str) {
            this.positiveText = str;
            return this;
        }

        public Builder withPreviousConfig(Config config) {
            this.previousConfig = config;
            return this;
        }

        public Builder withTitle(String str) {
            this.title = str;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public enum Config {
        TRANSCRIPT_PROMPT,
        TRANSCRIPT_EMAIL
    }

    public /* synthetic */ DialogContent(String str, String str2, String str3, String str4, Config config, Config config2, int i4) {
        this(str, str2, str3, str4, config, config2);
    }

    public Config getConfig() {
        return this.config;
    }

    public String getMessage() {
        return this.message;
    }

    public String getNegativeText() {
        return this.negativeText;
    }

    public String getPositiveText() {
        return this.positiveText;
    }

    public String getTitle() {
        return this.title;
    }

    public Config previousConfig() {
        return this.previousConfig;
    }

    private DialogContent(String str, String str2, String str3, String str4, Config config, Config config2) {
        this.title = str;
        this.message = str2;
        this.negativeText = str3;
        this.positiveText = str4;
        this.config = config;
        this.previousConfig = config2;
    }
}
