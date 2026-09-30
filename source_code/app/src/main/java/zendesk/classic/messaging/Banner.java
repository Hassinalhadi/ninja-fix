package zendesk.classic.messaging;

/* loaded from: classes.dex */
public class Banner {
    private final String buttonText;
    private final Duration duration;
    private final String label;
    private final Position position;

    /* loaded from: classes.dex */
    public static class Builder {
        private final String label;
        private String buttonText = null;
        private Position position = Position.BOTTOM;
        private Duration duration = Duration.SHORT;

        public Builder(String str) {
            this.label = str;
        }

        public Banner build() {
            return new Banner(this.label, this.buttonText, this.position, this.duration, 0);
        }

        public Builder setDuration(Duration duration) {
            this.duration = duration;
            return this;
        }

        public Builder withButtonText(String str) {
            this.buttonText = str;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public enum Duration {
        SHORT,
        INDEFINITE
    }

    /* loaded from: classes.dex */
    public enum Position {
        BOTTOM
    }

    public /* synthetic */ Banner(String str, String str2, Position position, Duration duration, int i4) {
        this(str, str2, position, duration);
    }

    public String getButtonText() {
        return this.buttonText;
    }

    public Duration getDuration() {
        return this.duration;
    }

    public String getLabel() {
        return this.label;
    }

    public Position getPosition() {
        return this.position;
    }

    private Banner(String str, String str2, Position position, Duration duration) {
        this.label = str;
        this.buttonText = str2;
        this.position = position;
        this.duration = duration;
    }
}
