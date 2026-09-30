package zendesk.classic.messaging;

/* loaded from: classes.dex */
public class Typing {
    private final AgentDetails agentDetails;
    private final boolean isTyping;

    public Typing(boolean z2) {
        this(z2, null);
    }

    public AgentDetails getAgentDetails() {
        return this.agentDetails;
    }

    public boolean isTyping() {
        return this.isTyping;
    }

    public Typing(boolean z2, AgentDetails agentDetails) {
        this.isTyping = z2;
        this.agentDetails = agentDetails;
    }
}
