package ja.burhanrashid52.photoeditor;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u0010\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\bR\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lja/burhanrashid52/photoeditor/BrushDrawingStateListener;", "Lja/burhanrashid52/photoeditor/BrushViewChangeListener;", "mPhotoEditorView", "Lja/burhanrashid52/photoeditor/PhotoEditorView;", "mViewState", "Lja/burhanrashid52/photoeditor/PhotoEditorViewState;", "(Lja/burhanrashid52/photoeditor/PhotoEditorView;Lja/burhanrashid52/photoeditor/PhotoEditorViewState;)V", "mOnPhotoEditorListener", "Lja/burhanrashid52/photoeditor/OnPhotoEditorListener;", "onStartDrawing", "", "onStopDrawing", "onViewAdd", "drawingView", "Lja/burhanrashid52/photoeditor/DrawingView;", "onViewRemoved", "setOnPhotoEditorListener", "onPhotoEditorListener", "photoeditor_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BrushDrawingStateListener implements BrushViewChangeListener {

    @Nullable
    private OnPhotoEditorListener mOnPhotoEditorListener;

    @NotNull
    private final PhotoEditorView mPhotoEditorView;

    @NotNull
    private final PhotoEditorViewState mViewState;

    public BrushDrawingStateListener(@NotNull PhotoEditorView mPhotoEditorView, @NotNull PhotoEditorViewState mViewState) {
        Intrinsics.echo(mPhotoEditorView, "mPhotoEditorView");
        Intrinsics.echo(mViewState, "mViewState");
        this.mPhotoEditorView = mPhotoEditorView;
        this.mViewState = mViewState;
    }

    @Override // ja.burhanrashid52.photoeditor.BrushViewChangeListener
    public void onStartDrawing() {
        OnPhotoEditorListener onPhotoEditorListener = this.mOnPhotoEditorListener;
        if (onPhotoEditorListener != null) {
            onPhotoEditorListener.onStartViewChangeListener(ViewType.BRUSH_DRAWING);
        }
    }

    @Override // ja.burhanrashid52.photoeditor.BrushViewChangeListener
    public void onStopDrawing() {
        OnPhotoEditorListener onPhotoEditorListener = this.mOnPhotoEditorListener;
        if (onPhotoEditorListener != null) {
            onPhotoEditorListener.onStopViewChangeListener(ViewType.BRUSH_DRAWING);
        }
    }

    @Override // ja.burhanrashid52.photoeditor.BrushViewChangeListener
    public void onViewAdd(@NotNull DrawingView drawingView) {
        Intrinsics.echo(drawingView, "drawingView");
        if (this.mViewState.getRedoViewsCount() > 0) {
            this.mViewState.popRedoView();
        }
        this.mViewState.addAddedView(drawingView);
        OnPhotoEditorListener onPhotoEditorListener = this.mOnPhotoEditorListener;
        if (onPhotoEditorListener != null) {
            onPhotoEditorListener.onAddViewListener(ViewType.BRUSH_DRAWING, this.mViewState.getAddedViewsCount());
        }
    }

    @Override // ja.burhanrashid52.photoeditor.BrushViewChangeListener
    public void onViewRemoved(@NotNull DrawingView drawingView) {
        Intrinsics.echo(drawingView, "drawingView");
        if (this.mViewState.getAddedViewsCount() > 0) {
            View removeAddedView = this.mViewState.removeAddedView(r3.getAddedViewsCount() - 1);
            if (!(removeAddedView instanceof DrawingView)) {
                this.mPhotoEditorView.removeView(removeAddedView);
            }
            this.mViewState.pushRedoView(removeAddedView);
        }
        OnPhotoEditorListener onPhotoEditorListener = this.mOnPhotoEditorListener;
        if (onPhotoEditorListener != null) {
            onPhotoEditorListener.onRemoveViewListener(ViewType.BRUSH_DRAWING, this.mViewState.getAddedViewsCount());
        }
    }

    public final void setOnPhotoEditorListener(@Nullable OnPhotoEditorListener onPhotoEditorListener) {
        this.mOnPhotoEditorListener = onPhotoEditorListener;
    }
}
