package zendesk.classic.messaging;

import java.io.Serializable;

/* loaded from: classes.dex */
public class AgentDetails implements Serializable {
    private final String agentId;
    private final String agentName;
    private final Integer avatarDrawableRes;
    private final String avatarPath;
    private final boolean isBot;

    public AgentDetails(String str, String str2, boolean z2) {
        this(str, str2, z2, null, null);
    }

    public String getAgentId() {
        return this.agentId;
    }

    public String getAgentName() {
        return this.agentName;
    }

    public Integer getAvatarDrawableRes() {
        return this.avatarDrawableRes;
    }

    public String getAvatarPath() {
        return this.avatarPath;
    }

    public boolean isBot() {
        return this.isBot;
    }

    public AgentDetails(String str, String str2, boolean z2, Integer num) {
        this(str, str2, z2, num, null);
    }

    public AgentDetails(String str, String str2, boolean z2, String str3) {
        this(str, str2, z2, null, str3);
    }

    private AgentDetails(String str, String str2, boolean z2, Integer num, String str3) {
        this.agentName = str;
        this.agentId = str2;
        this.isBot = z2;
        this.avatarDrawableRes = num;
        this.avatarPath = str3;
    }
}
