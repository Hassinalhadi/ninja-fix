package zendesk.support.request;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import zendesk.support.suas.State;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class StateConfig implements Serializable {
    static final long MAX_ATTACHMENTS_SIZE_UNAVAILABLE = -1;
    private final StateSettings settings;
    private final String subject;
    private final List<String> tags;
    private final StateRequestTicketForm ticketForm;

    /* loaded from: classes.dex */
    public static class Builder {
        private StateSettings settings;
        private String subject;
        private List<String> tags;
        private StateRequestTicketForm ticketForm;

        public /* synthetic */ Builder(StateSettings stateSettings, List list, String str, StateRequestTicketForm stateRequestTicketForm, int i4) {
            this(stateSettings, list, str, stateRequestTicketForm);
        }

        public StateConfig build() {
            return new StateConfig(this.settings, this.tags, this.subject, this.ticketForm, 0);
        }

        public Builder setSettings(StateSettings stateSettings) {
            this.settings = stateSettings;
            return this;
        }

        public Builder setSubject(String str) {
            this.subject = str;
            return this;
        }

        public Builder setTags(List<String> list) {
            this.tags = list;
            return this;
        }

        public Builder setTicketForm(StateRequestTicketForm stateRequestTicketForm) {
            this.ticketForm = stateRequestTicketForm;
            return this;
        }

        private Builder(StateSettings stateSettings, List<String> list, String str, StateRequestTicketForm stateRequestTicketForm) {
            this.settings = stateSettings;
            this.tags = list;
            this.subject = str;
            this.ticketForm = stateRequestTicketForm;
        }
    }

    public /* synthetic */ StateConfig(StateSettings stateSettings, List list, String str, StateRequestTicketForm stateRequestTicketForm, int i4) {
        this(stateSettings, list, str, stateRequestTicketForm);
    }

    public static StateConfig fromState(State state) {
        StateConfig stateConfig = (StateConfig) state.getState(StateConfig.class);
        if (stateConfig != null) {
            return stateConfig;
        }
        return new StateConfig();
    }

    public StateSettings getSettings() {
        return this.settings;
    }

    public String getSubject() {
        return this.subject;
    }

    public List<String> getTags() {
        return this.tags;
    }

    public StateRequestTicketForm getTicketForm() {
        return this.ticketForm;
    }

    public Builder newBuilder() {
        return new Builder(this.settings, this.tags, this.subject, this.ticketForm, 0);
    }

    public String toString() {
        return "Config{settings=" + this.settings + ", subject='" + this.subject + "', ticketForm=" + this.ticketForm + ", tags=" + this.tags + '}';
    }

    private StateConfig(StateSettings stateSettings, List<String> list, String str, StateRequestTicketForm stateRequestTicketForm) {
        this.settings = stateSettings;
        this.tags = list;
        this.subject = str;
        this.ticketForm = stateRequestTicketForm;
    }

    public StateConfig() {
        this.settings = new StateSettings();
        this.tags = new ArrayList();
        this.subject = "";
        this.ticketForm = null;
    }
}
