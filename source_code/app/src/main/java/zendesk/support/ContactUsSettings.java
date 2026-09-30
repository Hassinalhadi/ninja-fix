package zendesk.support;

import com.zendesk.util.CollectionUtils;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
class ContactUsSettings {
    private static ContactUsSettings DEFAULT = new ContactUsSettings(Collections.EMPTY_LIST);
    private List<String> tags;

    public ContactUsSettings(List<String> list) {
        this.tags = list;
    }

    public static ContactUsSettings defaultSettings() {
        return DEFAULT;
    }

    public List<String> getTags() {
        return CollectionUtils.copyOf(this.tags);
    }

    public ContactUsSettings() {
    }
}
