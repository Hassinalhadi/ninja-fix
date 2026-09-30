package ja.burhanrashid52.photoeditor;

import android.view.MotionEvent;
import android.view.View;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J \u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0007H&J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H&¨\u0006\u0014"}, d2 = {"Lja/burhanrashid52/photoeditor/OnPhotoEditorListener;", "", "onAddViewListener", "", "viewType", "Lja/burhanrashid52/photoeditor/ViewType;", "numberOfAddedViews", "", "onEditTextChangeListener", "rootView", "Landroid/view/View;", Constants.KEY_TEXT, "", "colorCode", "onRemoveViewListener", "onStartViewChangeListener", "onStopViewChangeListener", "onTouchSourceImage", com.clevertap.android.sdk.leanplum.Constants.CHARGED_EVENT_PARAM, "Landroid/view/MotionEvent;", "photoeditor_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface OnPhotoEditorListener {
    void onAddViewListener(@NotNull ViewType viewType, int numberOfAddedViews);

    void onEditTextChangeListener(@NotNull View rootView, @NotNull String text, int colorCode);

    void onRemoveViewListener(@NotNull ViewType viewType, int numberOfAddedViews);

    void onStartViewChangeListener(@NotNull ViewType viewType);

    void onStopViewChangeListener(@NotNull ViewType viewType);

    void onTouchSourceImage(@NotNull MotionEvent event);
}
