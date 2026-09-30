package zendesk.support;

import com.zendesk.util.CollectionUtils;
import java.util.List;

/* loaded from: classes.dex */
class SectionsResponse {
    List<Section> sections;

    public List<Section> getSections() {
        return CollectionUtils.copyOf(this.sections);
    }
}
