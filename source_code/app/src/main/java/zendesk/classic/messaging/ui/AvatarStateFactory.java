package zendesk.classic.messaging.ui;

import com.zendesk.util.StringUtils;
import zendesk.classic.messaging.AgentDetails;

/* loaded from: classes.dex */
class AvatarStateFactory {
    public AvatarState createAvatarState(AgentDetails agentDetails) {
        String str;
        if (StringUtils.hasLength(agentDetails.getAgentName())) {
            str = agentDetails.getAgentName().substring(0, 1);
        } else {
            str = "";
        }
        return new AvatarState(agentDetails.getAgentId(), str, agentDetails.getAvatarPath(), agentDetails.getAvatarDrawableRes());
    }
}
