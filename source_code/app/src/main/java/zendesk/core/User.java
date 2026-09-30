package zendesk.core;

import com.zendesk.util.CollectionUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class User {

    /* renamed from: id, reason: collision with root package name */
    private final Long f14230id = -1L;
    private final String name = "";
    private final Attachment photo = null;
    private final boolean agent = false;
    private final List<String> tags = new ArrayList();
    private final Map<String, String> userFields = new HashMap();

    public Long getId() {
        return this.f14230id;
    }

    public String getName() {
        return this.name;
    }

    public String getPhoto() {
        Attachment attachment = this.photo;
        if (attachment == null) {
            return null;
        }
        return attachment.getContentUrl();
    }

    public List<String> getTags() {
        return CollectionUtils.copyOf(this.tags);
    }

    public Map<String, String> getUserFields() {
        return CollectionUtils.copyOf(this.userFields);
    }

    public boolean isAgent() {
        return this.agent;
    }
}
