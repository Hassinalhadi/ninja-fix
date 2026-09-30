package zendesk.support;

import com.zendesk.util.CollectionUtils;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class RequestResponse {
    private List<User> lastCommentingAgents;
    private Request request;

    public List<User> getLastCommentingAgents() {
        return CollectionUtils.copyOf(this.lastCommentingAgents);
    }

    public Request getRequest() {
        return this.request;
    }
}
