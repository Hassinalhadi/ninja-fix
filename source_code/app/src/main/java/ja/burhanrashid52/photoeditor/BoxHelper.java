package ja.burhanrashid52.photoeditor;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0006\u0010\u000b\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lja/burhanrashid52/photoeditor/BoxHelper;", "", "mPhotoEditorView", "Lja/burhanrashid52/photoeditor/PhotoEditorView;", "mViewState", "Lja/burhanrashid52/photoeditor/PhotoEditorViewState;", "(Lja/burhanrashid52/photoeditor/PhotoEditorView;Lja/burhanrashid52/photoeditor/PhotoEditorViewState;)V", "clearAllViews", "", "drawingView", "Lja/burhanrashid52/photoeditor/DrawingView;", "clearHelperBox", "photoeditor_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BoxHelper {

    @NotNull
    private final PhotoEditorView mPhotoEditorView;

    @NotNull
    private final PhotoEditorViewState mViewState;

    public BoxHelper(@NotNull PhotoEditorView mPhotoEditorView, @NotNull PhotoEditorViewState mViewState) {
        Intrinsics.echo(mPhotoEditorView, "mPhotoEditorView");
        Intrinsics.echo(mViewState, "mViewState");
        this.mPhotoEditorView = mPhotoEditorView;
        this.mViewState = mViewState;
    }

    public final void clearAllViews(@Nullable DrawingView drawingView) {
        int addedViewsCount = this.mViewState.getAddedViewsCount();
        for (int i4 = 0; i4 < addedViewsCount; i4++) {
            this.mPhotoEditorView.removeView(this.mViewState.getAddedView(i4));
        }
        if (drawingView != null && this.mViewState.containsAddedView(drawingView)) {
            this.mPhotoEditorView.addView(drawingView);
        }
        this.mViewState.clearAddedViews();
        this.mViewState.clearRedoViews();
        if (drawingView != null) {
            drawingView.clearAll();
        }
    }

    public final void clearHelperBox() {
        int childCount = this.mPhotoEditorView.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = this.mPhotoEditorView.getChildAt(i4);
            FrameLayout frameLayout = (FrameLayout) childAt.findViewById(R.id.frmBorder);
            if (frameLayout != null) {
                frameLayout.setBackgroundResource(0);
            }
            ImageView imageView = (ImageView) childAt.findViewById(R.id.imgPhotoEditorClose);
            if (imageView != null) {
                imageView.setVisibility(8);
            }
        }
        this.mViewState.clearCurrentSelectedView();
    }
}
