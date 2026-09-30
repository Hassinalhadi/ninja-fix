package ja.burhanrashid52.photoeditor;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.clevertap.android.sdk.leanplum.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0019B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\nH\u0016J(\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J(\u0010\u0014\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0012H\u0016J\u0010\u0010\u0017\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u0018\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lja/burhanrashid52/photoeditor/PhotoEditorImageViewListener;", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "viewState", "Lja/burhanrashid52/photoeditor/PhotoEditorViewState;", "onSingleTapUpCallback", "Lja/burhanrashid52/photoeditor/PhotoEditorImageViewListener$OnSingleTapUpCallback;", "(Lja/burhanrashid52/photoeditor/PhotoEditorViewState;Lja/burhanrashid52/photoeditor/PhotoEditorImageViewListener$OnSingleTapUpCallback;)V", "onDoubleTap", "", Constants.CHARGED_EVENT_PARAM, "Landroid/view/MotionEvent;", "onDoubleTapEvent", "onDown", "e", "onFling", "event1", "event2", "velocityX", "", "velocityY", "onScroll", "distanceX", "distanceY", "onSingleTapConfirmed", "onSingleTapUp", "OnSingleTapUpCallback", "photoeditor_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PhotoEditorImageViewListener extends GestureDetector.SimpleOnGestureListener {

    @NotNull
    private final OnSingleTapUpCallback onSingleTapUpCallback;

    @NotNull
    private final PhotoEditorViewState viewState;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lja/burhanrashid52/photoeditor/PhotoEditorImageViewListener$OnSingleTapUpCallback;", "", "onSingleTapUp", "", "photoeditor_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public interface OnSingleTapUpCallback {
        void onSingleTapUp();
    }

    public PhotoEditorImageViewListener(@NotNull PhotoEditorViewState viewState, @NotNull OnSingleTapUpCallback onSingleTapUpCallback) {
        Intrinsics.echo(viewState, "viewState");
        Intrinsics.echo(onSingleTapUpCallback, "onSingleTapUpCallback");
        this.viewState = viewState;
        this.onSingleTapUpCallback = onSingleTapUpCallback;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(@NotNull MotionEvent event) {
        Intrinsics.echo(event, "event");
        if (this.viewState.getCurrentSelectedView() != null) {
            return true;
        }
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTapEvent(@NotNull MotionEvent event) {
        Intrinsics.echo(event, "event");
        if (this.viewState.getCurrentSelectedView() != null) {
            return true;
        }
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(@NotNull MotionEvent e) {
        Intrinsics.echo(e, "e");
        if (this.viewState.getCurrentSelectedView() != null) {
            return true;
        }
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onFling(@NotNull MotionEvent event1, @NotNull MotionEvent event2, float velocityX, float velocityY) {
        Intrinsics.echo(event1, "event1");
        Intrinsics.echo(event2, "event2");
        if (this.viewState.getCurrentSelectedView() != null) {
            return true;
        }
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(@NotNull MotionEvent event1, @NotNull MotionEvent event2, float distanceX, float distanceY) {
        Intrinsics.echo(event1, "event1");
        Intrinsics.echo(event2, "event2");
        if (this.viewState.getCurrentSelectedView() != null) {
            return true;
        }
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(@NotNull MotionEvent event) {
        Intrinsics.echo(event, "event");
        if (this.viewState.getCurrentSelectedView() != null) {
            return true;
        }
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(@NotNull MotionEvent e) {
        Intrinsics.echo(e, "e");
        this.onSingleTapUpCallback.onSingleTapUp();
        if (this.viewState.getCurrentSelectedView() != null) {
            return true;
        }
        return false;
    }
}
