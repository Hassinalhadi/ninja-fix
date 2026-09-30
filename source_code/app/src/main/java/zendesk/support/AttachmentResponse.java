package zendesk.support;

import com.zendesk.util.CollectionUtils;
import java.util.List;

/* loaded from: classes.dex */
class AttachmentResponse {
    private List<HelpCenterAttachment> articleAttachments;

    public List<HelpCenterAttachment> getArticleAttachments() {
        return CollectionUtils.copyOf(this.articleAttachments);
    }
}
