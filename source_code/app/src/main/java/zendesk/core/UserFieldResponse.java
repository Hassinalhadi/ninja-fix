package zendesk.core;

import com.zendesk.util.CollectionUtils;
import java.util.List;

/* loaded from: classes.dex */
class UserFieldResponse {
    private List<UserField> userFields;

    public List<UserField> getUserFields() {
        return CollectionUtils.copyOf(this.userFields);
    }
}
