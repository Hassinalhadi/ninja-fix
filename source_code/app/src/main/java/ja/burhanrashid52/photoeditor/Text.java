package ja.burhanrashid52.photoeditor;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\b\u0010\u0015\u001a\u00020\u0010H\u0002J\u0010\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0018H\u0016R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lja/burhanrashid52/photoeditor/Text;", "Lja/burhanrashid52/photoeditor/Graphic;", "mPhotoEditorView", "Lja/burhanrashid52/photoeditor/PhotoEditorView;", "mMultiTouchListener", "Lja/burhanrashid52/photoeditor/MultiTouchListener;", "mViewState", "Lja/burhanrashid52/photoeditor/PhotoEditorViewState;", "mDefaultTextTypeface", "Landroid/graphics/Typeface;", "mGraphicManager", "Lja/burhanrashid52/photoeditor/GraphicManager;", "(Lja/burhanrashid52/photoeditor/PhotoEditorView;Lja/burhanrashid52/photoeditor/MultiTouchListener;Lja/burhanrashid52/photoeditor/PhotoEditorViewState;Landroid/graphics/Typeface;Lja/burhanrashid52/photoeditor/GraphicManager;)V", "mTextView", "Landroid/widget/TextView;", "buildView", "", Constants.KEY_TEXT, "", "styleBuilder", "Lja/burhanrashid52/photoeditor/TextStyleBuilder;", "setupGesture", "setupView", "rootView", "Landroid/view/View;", "updateView", "view", "photoeditor_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Text extends Graphic {

    @Nullable
    private final Typeface mDefaultTextTypeface;

    @NotNull
    private final GraphicManager mGraphicManager;

    @NotNull
    private final MultiTouchListener mMultiTouchListener;

    @NotNull
    private final PhotoEditorView mPhotoEditorView;

    @Nullable
    private TextView mTextView;

    @NotNull
    private final PhotoEditorViewState mViewState;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Text(@NotNull PhotoEditorView mPhotoEditorView, @NotNull MultiTouchListener mMultiTouchListener, @NotNull PhotoEditorViewState mViewState, @Nullable Typeface typeface, @NotNull GraphicManager mGraphicManager) {
        super(context, r2, r1, mGraphicManager);
        Intrinsics.echo(mPhotoEditorView, "mPhotoEditorView");
        Intrinsics.echo(mMultiTouchListener, "mMultiTouchListener");
        Intrinsics.echo(mViewState, "mViewState");
        Intrinsics.echo(mGraphicManager, "mGraphicManager");
        Context context = mPhotoEditorView.getContext();
        ViewType viewType = ViewType.TEXT;
        int i4 = R.layout.view_photo_editor_text;
        Intrinsics.delta(context, "context");
        this.mPhotoEditorView = mPhotoEditorView;
        this.mMultiTouchListener = mMultiTouchListener;
        this.mViewState = mViewState;
        this.mDefaultTextTypeface = typeface;
        this.mGraphicManager = mGraphicManager;
        setupGesture();
    }

    private final void setupGesture() {
        this.mMultiTouchListener.setOnGestureControl(buildGestureController(this.mPhotoEditorView, this.mViewState));
        getRootView().setOnTouchListener(this.mMultiTouchListener);
    }

    public final void buildView(@Nullable String text, @Nullable TextStyleBuilder styleBuilder) {
        TextView textView = this.mTextView;
        if (textView != null) {
            textView.setText(text);
            if (styleBuilder != null) {
                styleBuilder.applyStyle(textView);
            }
        }
    }

    @Override // ja.burhanrashid52.photoeditor.Graphic
    public void setupView(@NotNull View rootView) {
        Intrinsics.echo(rootView, "rootView");
        TextView textView = (TextView) rootView.findViewById(R.id.tvPhotoEditorText);
        this.mTextView = textView;
        if (textView != null) {
            textView.setGravity(17);
            textView.setTypeface(this.mDefaultTextTypeface);
        }
    }

    @Override // ja.burhanrashid52.photoeditor.Graphic
    public void updateView(@NotNull View view) {
        CharSequence charSequence;
        int i4;
        Intrinsics.echo(view, "view");
        TextView textView = this.mTextView;
        if (textView != null) {
            charSequence = textView.getText();
        } else {
            charSequence = null;
        }
        String valueOf = String.valueOf(charSequence);
        TextView textView2 = this.mTextView;
        if (textView2 != null) {
            i4 = textView2.getCurrentTextColor();
        } else {
            i4 = 0;
        }
        OnPhotoEditorListener onPhotoEditorListener = this.mGraphicManager.getOnPhotoEditorListener();
        if (onPhotoEditorListener != null) {
            onPhotoEditorListener.onEditTextChangeListener(view, valueOf, i4);
        }
    }
}
