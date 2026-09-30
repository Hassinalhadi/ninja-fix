package ja.burhanrashid52.photoeditor;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\b\u0010\u0014\u001a\u00020\u0010H\u0002J\u0010\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lja/burhanrashid52/photoeditor/Emoji;", "Lja/burhanrashid52/photoeditor/Graphic;", "mPhotoEditorView", "Lja/burhanrashid52/photoeditor/PhotoEditorView;", "mMultiTouchListener", "Lja/burhanrashid52/photoeditor/MultiTouchListener;", "mViewState", "Lja/burhanrashid52/photoeditor/PhotoEditorViewState;", "graphicManager", "Lja/burhanrashid52/photoeditor/GraphicManager;", "mDefaultEmojiTypeface", "Landroid/graphics/Typeface;", "(Lja/burhanrashid52/photoeditor/PhotoEditorView;Lja/burhanrashid52/photoeditor/MultiTouchListener;Lja/burhanrashid52/photoeditor/PhotoEditorViewState;Lja/burhanrashid52/photoeditor/GraphicManager;Landroid/graphics/Typeface;)V", "txtEmoji", "Landroid/widget/TextView;", "buildView", "", "emojiTypeface", "emojiName", "", "setupGesture", "setupView", "rootView", "Landroid/view/View;", "photoeditor_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Emoji extends Graphic {

    @Nullable
    private final Typeface mDefaultEmojiTypeface;

    @NotNull
    private final MultiTouchListener mMultiTouchListener;

    @NotNull
    private final PhotoEditorView mPhotoEditorView;

    @NotNull
    private final PhotoEditorViewState mViewState;

    @Nullable
    private TextView txtEmoji;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Emoji(@NotNull PhotoEditorView mPhotoEditorView, @NotNull MultiTouchListener mMultiTouchListener, @NotNull PhotoEditorViewState mViewState, @Nullable GraphicManager graphicManager, @Nullable Typeface typeface) {
        super(context, r2, r1, graphicManager);
        Intrinsics.echo(mPhotoEditorView, "mPhotoEditorView");
        Intrinsics.echo(mMultiTouchListener, "mMultiTouchListener");
        Intrinsics.echo(mViewState, "mViewState");
        Context context = mPhotoEditorView.getContext();
        ViewType viewType = ViewType.EMOJI;
        int i4 = R.layout.view_photo_editor_text;
        Intrinsics.delta(context, "context");
        this.mPhotoEditorView = mPhotoEditorView;
        this.mMultiTouchListener = mMultiTouchListener;
        this.mViewState = mViewState;
        this.mDefaultEmojiTypeface = typeface;
        setupGesture();
    }

    private final void setupGesture() {
        this.mMultiTouchListener.setOnGestureControl(buildGestureController(this.mPhotoEditorView, this.mViewState));
        getRootView().setOnTouchListener(this.mMultiTouchListener);
    }

    public final void buildView(@Nullable Typeface emojiTypeface, @Nullable String emojiName) {
        TextView textView = this.txtEmoji;
        if (textView != null) {
            if (emojiTypeface != null) {
                textView.setTypeface(emojiTypeface);
            }
            textView.setTextSize(56.0f);
            textView.setText(emojiName);
        }
    }

    @Override // ja.burhanrashid52.photoeditor.Graphic
    public void setupView(@NotNull View rootView) {
        Intrinsics.echo(rootView, "rootView");
        TextView textView = (TextView) rootView.findViewById(R.id.tvPhotoEditorText);
        this.txtEmoji = textView;
        if (textView != null) {
            Typeface typeface = this.mDefaultEmojiTypeface;
            if (typeface != null) {
                textView.setTypeface(typeface);
            }
            textView.setGravity(17);
            textView.setLayerType(1, null);
        }
    }
}
