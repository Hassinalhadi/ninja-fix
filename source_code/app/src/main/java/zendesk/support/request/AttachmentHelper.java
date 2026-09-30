package zendesk.support.request;

import com.zendesk.util.CollectionUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class AttachmentHelper {
    private long maxFileSize = -1;
    private List<StateRequestAttachment> selectedAttachments = new ArrayList();
    private final int[] touchableItems;

    public AttachmentHelper(int... iArr) {
        this.touchableItems = iArr;
    }

    public List<StateRequestAttachment> getSelectedAttachments() {
        return CollectionUtils.copyOf(this.selectedAttachments);
    }

    public void updateAttachments(Collection<StateRequestAttachment> collection) {
        this.selectedAttachments = CollectionUtils.copyOf(new ArrayList(collection));
    }

    public void updateMaxFileSize(long j5) {
        this.maxFileSize = j5;
    }
}
