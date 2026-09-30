package zendesk.support;

import P8.c;
import com.zendesk.util.CollectionUtils;
import java.util.List;

/* loaded from: classes.dex */
public class EndUserComment {

    @c("uploads")
    private List<String> attachments;
    private String value;

    public List<String> getAttachments() {
        return CollectionUtils.copyOf(this.attachments);
    }

    public void setAttachments(List<String> list) {
        this.attachments = list;
    }

    public void setValue(String str) {
        this.value = str;
    }
}
