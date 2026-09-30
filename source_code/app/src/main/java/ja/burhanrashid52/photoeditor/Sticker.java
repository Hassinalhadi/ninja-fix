package ja.burhanrashid52.photoeditor;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u0010\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\b\u0010\u0011\u001a\u00020\u000eH\u0002J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lja/burhanrashid52/photoeditor/Sticker;", "Lja/burhanrashid52/photoeditor/Graphic;", "mPhotoEditorView", "Lja/burhanrashid52/photoeditor/PhotoEditorView;", "mMultiTouchListener", "Lja/burhanrashid52/photoeditor/MultiTouchListener;", "mViewState", "Lja/burhanrashid52/photoeditor/PhotoEditorViewState;", "graphicManager", "Lja/burhanrashid52/photoeditor/GraphicManager;", "(Lja/burhanrashid52/photoeditor/PhotoEditorView;Lja/burhanrashid52/photoeditor/MultiTouchListener;Lja/burhanrashid52/photoeditor/PhotoEditorViewState;Lja/burhanrashid52/photoeditor/GraphicManager;)V", "imageView", "Landroid/widget/ImageView;", "buildView", "", "desiredImage", "Landroid/graphics/Bitmap;", "setupGesture", "setupView", "rootView", "Landroid/view/View;", "photoeditor_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Sticker extends Graphic {

    @Nullable
    private ImageView imageView;

    @NotNull
    private final MultiTouchListener mMultiTouchListener;

    @NotNull
    private final PhotoEditorView mPhotoEditorView;

    @NotNull
    private final PhotoEditorViewState mViewState;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Sticker(@NotNull PhotoEditorView mPhotoEditorView, @NotNull MultiTouchListener mMultiTouchListener, @NotNull PhotoEditorViewState mViewState, @Nullable GraphicManager graphicManager) {
        super(context, r2, r1, graphicManager);
        Intrinsics.echo(mPhotoEditorView, "mPhotoEditorView");
        Intrinsics.echo(mMultiTouchListener, "mMultiTouchListener");
        Intrinsics.echo(mViewState, "mViewState");
        Context context = mPhotoEditorView.getContext();
        ViewType viewType = ViewType.IMAGE;
        int i4 = R.layout.view_photo_editor_image;
        Intrinsics.delta(context, "context");
        this.mPhotoEditorView = mPhotoEditorView;
        this.mMultiTouchListener = mMultiTouchListener;
        this.mViewState = mViewState;
        setupGesture();
    }

    private final void setupGesture() {
        this.mMultiTouchListener.setOnGestureControl(buildGestureController(this.mPhotoEditorView, this.mViewState));
        getRootView().setOnTouchListener(this.mMultiTouchListener);
    }

    public final void buildView(@Nullable Bitmap desiredImage) {
        ImageView imageView = this.imageView;
        if (imageView != null) {
            imageView.setImageBitmap(desiredImage);
        }
    }

    @Override // ja.burhanrashid52.photoeditor.Graphic
    public void setupView(@NotNull View rootView) {
        Intrinsics.echo(rootView, "rootView");
        this.imageView = (ImageView) rootView.findViewById(R.id.imgPhotoEditorImage);
    }
}
