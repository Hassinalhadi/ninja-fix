package ja.burhanrashid52.photoeditor;

import android.view.View;
import android.widget.RelativeLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0014\u001a\u00020\u0012J\u000e\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lja/burhanrashid52/photoeditor/GraphicManager;", "", "mPhotoEditorView", "Lja/burhanrashid52/photoeditor/PhotoEditorView;", "mViewState", "Lja/burhanrashid52/photoeditor/PhotoEditorViewState;", "(Lja/burhanrashid52/photoeditor/PhotoEditorView;Lja/burhanrashid52/photoeditor/PhotoEditorViewState;)V", "onPhotoEditorListener", "Lja/burhanrashid52/photoeditor/OnPhotoEditorListener;", "getOnPhotoEditorListener", "()Lja/burhanrashid52/photoeditor/OnPhotoEditorListener;", "setOnPhotoEditorListener", "(Lja/burhanrashid52/photoeditor/OnPhotoEditorListener;)V", "addView", "", "graphic", "Lja/burhanrashid52/photoeditor/Graphic;", "redoView", "", "removeView", "undoView", "updateView", "view", "Landroid/view/View;", "photoeditor_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class GraphicManager {

    @NotNull
    private final PhotoEditorView mPhotoEditorView;

    @NotNull
    private final PhotoEditorViewState mViewState;

    @Nullable
    private OnPhotoEditorListener onPhotoEditorListener;

    public GraphicManager(@NotNull PhotoEditorView mPhotoEditorView, @NotNull PhotoEditorViewState mViewState) {
        Intrinsics.echo(mPhotoEditorView, "mPhotoEditorView");
        Intrinsics.echo(mViewState, "mViewState");
        this.mPhotoEditorView = mPhotoEditorView;
        this.mViewState = mViewState;
    }

    public final void addView(@NotNull Graphic graphic) {
        Intrinsics.echo(graphic, "graphic");
        View rootView = graphic.getRootView();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13, -1);
        this.mPhotoEditorView.addView(rootView, layoutParams);
        this.mViewState.addAddedView(rootView);
        if (this.mViewState.getRedoViewsCount() > 0) {
            this.mViewState.clearRedoViews();
        }
        OnPhotoEditorListener onPhotoEditorListener = this.onPhotoEditorListener;
        if (onPhotoEditorListener != null) {
            onPhotoEditorListener.onAddViewListener(graphic.getViewType(), this.mViewState.getAddedViewsCount());
        }
    }

    @Nullable
    public final OnPhotoEditorListener getOnPhotoEditorListener() {
        return this.onPhotoEditorListener;
    }

    public final boolean redoView() {
        OnPhotoEditorListener onPhotoEditorListener;
        if (this.mViewState.getRedoViewsCount() > 0) {
            PhotoEditorViewState photoEditorViewState = this.mViewState;
            View redoView = photoEditorViewState.getRedoView(photoEditorViewState.getRedoViewsCount() - 1);
            if (redoView instanceof DrawingView) {
                if (!((DrawingView) redoView).redo() && this.mViewState.getRedoViewsCount() == 0) {
                    return false;
                }
                return true;
            }
            this.mViewState.popRedoView();
            this.mPhotoEditorView.addView(redoView);
            this.mViewState.addAddedView(redoView);
            Object tag = redoView.getTag();
            if ((tag instanceof ViewType) && (onPhotoEditorListener = this.onPhotoEditorListener) != null) {
                onPhotoEditorListener.onAddViewListener((ViewType) tag, this.mViewState.getAddedViewsCount());
            }
        }
        if (this.mViewState.getRedoViewsCount() == 0) {
            return false;
        }
        return true;
    }

    public final void removeView(@NotNull Graphic graphic) {
        Intrinsics.echo(graphic, "graphic");
        View rootView = graphic.getRootView();
        if (this.mViewState.containsAddedView(rootView)) {
            this.mPhotoEditorView.removeView(rootView);
            this.mViewState.removeAddedView(rootView);
            this.mViewState.pushRedoView(rootView);
            OnPhotoEditorListener onPhotoEditorListener = this.onPhotoEditorListener;
            if (onPhotoEditorListener != null) {
                onPhotoEditorListener.onRemoveViewListener(graphic.getViewType(), this.mViewState.getAddedViewsCount());
            }
        }
    }

    public final void setOnPhotoEditorListener(@Nullable OnPhotoEditorListener onPhotoEditorListener) {
        this.onPhotoEditorListener = onPhotoEditorListener;
    }

    public final boolean undoView() {
        OnPhotoEditorListener onPhotoEditorListener;
        if (this.mViewState.getAddedViewsCount() > 0) {
            PhotoEditorViewState photoEditorViewState = this.mViewState;
            View addedView = photoEditorViewState.getAddedView(photoEditorViewState.getAddedViewsCount() - 1);
            if (addedView instanceof DrawingView) {
                if (!((DrawingView) addedView).undo() && this.mViewState.getAddedViewsCount() == 0) {
                    return false;
                }
                return true;
            }
            PhotoEditorViewState photoEditorViewState2 = this.mViewState;
            photoEditorViewState2.removeAddedView(photoEditorViewState2.getAddedViewsCount() - 1);
            this.mPhotoEditorView.removeView(addedView);
            this.mViewState.pushRedoView(addedView);
            Object tag = addedView.getTag();
            if ((tag instanceof ViewType) && (onPhotoEditorListener = this.onPhotoEditorListener) != null) {
                onPhotoEditorListener.onRemoveViewListener((ViewType) tag, this.mViewState.getAddedViewsCount());
            }
        }
        if (this.mViewState.getAddedViewsCount() == 0) {
            return false;
        }
        return true;
    }

    public final void updateView(@NotNull View view) {
        Intrinsics.echo(view, "view");
        this.mPhotoEditorView.updateViewLayout(view, view.getLayoutParams());
        this.mViewState.replaceAddedView(view);
    }
}
