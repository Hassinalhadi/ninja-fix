package zendesk.support;

import com.zendesk.util.CollectionUtils;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class RequestsResponse extends ResponseWrapper {
    private List<User> lastCommentingAgents;
    private List<Request> requests;

    public List<User> getLastCommentingAgents() {
        return CollectionUtils.copyOf(this.lastCommentingAgents);
    }

    public List<Request> getRequests() {
        return CollectionUtils.copyOf(this.requests);
    }
}
