package zendesk.support;

import com.zendesk.util.CollectionUtils;
import java.util.List;

/* loaded from: classes.dex */
public class CommentsResponse extends ResponseWrapper {
    private List<CommentResponse> comments;
    private List<Organization> organizations;
    private List<User> users;

    public List<CommentResponse> getComments() {
        return CollectionUtils.copyOf(this.comments);
    }

    public List<Organization> getOrganizations() {
        return CollectionUtils.copyOf(this.organizations);
    }

    public List<User> getUsers() {
        return CollectionUtils.copyOf(this.users);
    }
}
