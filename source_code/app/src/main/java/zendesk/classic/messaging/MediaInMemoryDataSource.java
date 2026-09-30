package zendesk.classic.messaging;

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;

@MessagingScope
/* loaded from: classes.dex */
public class MediaInMemoryDataSource {
    private final List<Uri> selectedUris = new ArrayList();

    public void add(Uri uri) {
        this.selectedUris.add(uri);
    }

    public void addAll(List<Uri> list) {
        this.selectedUris.addAll(0, new ArrayList(list));
    }

    public void clear() {
        this.selectedUris.clear();
    }

    public Integer getCount() {
        return Integer.valueOf(this.selectedUris.size());
    }

    public List<Uri> getSelectedUris() {
        return new ArrayList(this.selectedUris);
    }

    public void removeAll(List<Uri> list) {
        this.selectedUris.removeAll(new ArrayList(list));
    }
}
