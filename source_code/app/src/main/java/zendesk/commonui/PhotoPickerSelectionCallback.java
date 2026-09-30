package zendesk.commonui;

import android.net.Uri;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lzendesk/commonui/PhotoPickerSelectionCallback;", "", "", "Landroid/net/Uri;", "uris", "", "onMediaSelected", "(Ljava/util/List;)V", "inputUriPhotoTaken", "onPhotoTaken", "(Landroid/net/Uri;)V", "common-ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface PhotoPickerSelectionCallback {
    void onMediaSelected(@NotNull List<Uri> uris);

    void onPhotoTaken(@NotNull Uri inputUriPhotoTaken);
}
