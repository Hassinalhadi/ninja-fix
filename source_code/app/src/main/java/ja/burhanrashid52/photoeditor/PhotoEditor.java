package ja.burhanrashid52.photoeditor;

import Nd.c;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.view.View;
import android.widget.ImageView;
import com.clevertap.android.sdk.Constants;
import ja.burhanrashid52.photoeditor.SaveSettings;
import ja.burhanrashid52.photoeditor.shape.ShapeBuilder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\bf\u0018\u00002\u00020\u0001:\u0002`aJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH'¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u000b\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH'¢\u0006\u0004\b\u000b\u0010\u000fJ!\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H'¢\u0006\u0004\b\u000b\u0010\u0012J'\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\tH&¢\u0006\u0004\b\u0017\u0010\u0018J1\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\tH&¢\u0006\u0004\b\u0017\u0010\u0019J)\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H&¢\u0006\u0004\b\u0017\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0007H&¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001c\u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u001b\u001a\u00020\u0007H&¢\u0006\u0004\b\u001c\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 H&¢\u0006\u0004\b\"\u0010#J\u0019\u0010%\u001a\u00020\u00042\b\b\u0001\u0010$\u001a\u00020\tH'¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\u00042\u0006\u0010(\u001a\u00020'H&¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0004H&¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020 H&¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020 H&¢\u0006\u0004\b/\u0010.J\u000f\u00100\u001a\u00020\u0004H&¢\u0006\u0004\b0\u0010,J\u000f\u00101\u001a\u00020\u0004H'¢\u0006\u0004\b1\u0010,J\u0019\u00104\u001a\u00020\u00042\b\u00103\u001a\u0004\u0018\u000102H&¢\u0006\u0004\b4\u00105J\u0017\u00104\u001a\u00020\u00042\u0006\u00107\u001a\u000206H&¢\u0006\u0004\b4\u00108J%\u0010=\u001a\u00020<2\u0006\u00109\u001a\u00020\u00072\b\b\u0002\u0010;\u001a\u00020:H§@ø\u0001\u0000¢\u0006\u0004\b=\u0010>J\u001d\u0010?\u001a\u00020\u00022\b\b\u0002\u0010;\u001a\u00020:H¦@ø\u0001\u0000¢\u0006\u0004\b?\u0010@J'\u0010=\u001a\u00020\u00042\u0006\u00109\u001a\u00020\u00072\u0006\u0010;\u001a\u00020:2\u0006\u0010B\u001a\u00020AH&¢\u0006\u0004\b=\u0010CJ\u001f\u0010=\u001a\u00020\u00042\u0006\u00109\u001a\u00020\u00072\u0006\u0010B\u001a\u00020AH&¢\u0006\u0004\b=\u0010DJ\u001f\u0010?\u001a\u00020\u00042\u0006\u0010;\u001a\u00020:2\u0006\u0010F\u001a\u00020EH&¢\u0006\u0004\b?\u0010GJ\u0017\u0010?\u001a\u00020\u00042\u0006\u0010F\u001a\u00020EH&¢\u0006\u0004\b?\u0010HJ\u0017\u0010K\u001a\u00020\u00042\u0006\u0010J\u001a\u00020IH&¢\u0006\u0004\bK\u0010LJ\u0017\u0010O\u001a\u00020\u00042\u0006\u0010N\u001a\u00020MH&¢\u0006\u0004\bO\u0010PR\u0016\u0010S\u001a\u0004\u0018\u00010 8&X¦\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010RR\u0014\u0010V\u001a\u00020'8&X¦\u0004¢\u0006\u0006\u001a\u0004\bT\u0010UR$\u0010Z\u001a\u00020'2\u0006\u0010W\u001a\u00020'8&@gX¦\u000e¢\u0006\f\u001a\u0004\bX\u0010U\"\u0004\bY\u0010*R$\u0010^\u001a\u00020\t2\u0006\u0010W\u001a\u00020\t8&@gX¦\u000e¢\u0006\f\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010&R\u0014\u0010_\u001a\u00020 8&X¦\u0004¢\u0006\u0006\u001a\u0004\b_\u0010.\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006b"}, d2 = {"Lja/burhanrashid52/photoeditor/PhotoEditor;", "", "Landroid/graphics/Bitmap;", "desiredImage", "", "addImage", "(Landroid/graphics/Bitmap;)V", "", Constants.KEY_TEXT, "", "colorCodeTextView", "addText", "(Ljava/lang/String;I)V", "Landroid/graphics/Typeface;", "textTypeface", "(Landroid/graphics/Typeface;Ljava/lang/String;I)V", "Lja/burhanrashid52/photoeditor/TextStyleBuilder;", "styleBuilder", "(Ljava/lang/String;Lja/burhanrashid52/photoeditor/TextStyleBuilder;)V", "Landroid/view/View;", "view", "inputText", "colorCode", "editText", "(Landroid/view/View;Ljava/lang/String;I)V", "(Landroid/view/View;Landroid/graphics/Typeface;Ljava/lang/String;I)V", "(Landroid/view/View;Ljava/lang/String;Lja/burhanrashid52/photoeditor/TextStyleBuilder;)V", "emojiName", "addEmoji", "(Ljava/lang/String;)V", "emojiTypeface", "(Landroid/graphics/Typeface;Ljava/lang/String;)V", "", "brushDrawingMode", "setBrushDrawingMode", "(Z)V", "opacity", "setOpacity", "(I)V", "", "brushEraserSize", "setBrushEraserSize", "(F)V", "brushEraser", "()V", "undo", "()Z", "redo", "clearAllViews", "clearHelperBox", "Lja/burhanrashid52/photoeditor/CustomEffect;", "customEffect", "setFilterEffect", "(Lja/burhanrashid52/photoeditor/CustomEffect;)V", "Lja/burhanrashid52/photoeditor/PhotoFilter;", "filterType", "(Lja/burhanrashid52/photoeditor/PhotoFilter;)V", "imagePath", "Lja/burhanrashid52/photoeditor/SaveSettings;", "saveSettings", "Lja/burhanrashid52/photoeditor/SaveFileResult;", "saveAsFile", "(Ljava/lang/String;Lja/burhanrashid52/photoeditor/SaveSettings;LNd/c;)Ljava/lang/Object;", "saveAsBitmap", "(Lja/burhanrashid52/photoeditor/SaveSettings;LNd/c;)Ljava/lang/Object;", "Lja/burhanrashid52/photoeditor/PhotoEditor$OnSaveListener;", "onSaveListener", "(Ljava/lang/String;Lja/burhanrashid52/photoeditor/SaveSettings;Lja/burhanrashid52/photoeditor/PhotoEditor$OnSaveListener;)V", "(Ljava/lang/String;Lja/burhanrashid52/photoeditor/PhotoEditor$OnSaveListener;)V", "Lja/burhanrashid52/photoeditor/OnSaveBitmap;", "onSaveBitmap", "(Lja/burhanrashid52/photoeditor/SaveSettings;Lja/burhanrashid52/photoeditor/OnSaveBitmap;)V", "(Lja/burhanrashid52/photoeditor/OnSaveBitmap;)V", "Lja/burhanrashid52/photoeditor/OnPhotoEditorListener;", "onPhotoEditorListener", "setOnPhotoEditorListener", "(Lja/burhanrashid52/photoeditor/OnPhotoEditorListener;)V", "Lja/burhanrashid52/photoeditor/shape/ShapeBuilder;", "shapeBuilder", "setShape", "(Lja/burhanrashid52/photoeditor/shape/ShapeBuilder;)V", "getBrushDrawableMode", "()Ljava/lang/Boolean;", "brushDrawableMode", "getEraserSize", "()F", "eraserSize", "<set-?>", "getBrushSize", "setBrushSize", "brushSize", "getBrushColor", "()I", "setBrushColor", "brushColor", "isCacheEmpty", "Builder", "OnSaveListener", "photoeditor_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface PhotoEditor {

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\bJ\u0010\u0010\u001f\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\u0010\u0010 \u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u0012J\u0010\u0010!\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u000e\u0010\"\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\bR\u0012\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0015\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lja/burhanrashid52/photoeditor/PhotoEditor$Builder;", "", "context", "Landroid/content/Context;", "photoEditorView", "Lja/burhanrashid52/photoeditor/PhotoEditorView;", "(Landroid/content/Context;Lja/burhanrashid52/photoeditor/PhotoEditorView;)V", "clipSourceImage", "", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "deleteView", "Landroid/view/View;", "drawingView", "Lja/burhanrashid52/photoeditor/DrawingView;", "emojiTypeface", "Landroid/graphics/Typeface;", "imageView", "Landroid/widget/ImageView;", "isTextPinchScalable", "getPhotoEditorView", "()Lja/burhanrashid52/photoeditor/PhotoEditorView;", "setPhotoEditorView", "(Lja/burhanrashid52/photoeditor/PhotoEditorView;)V", "textTypeface", "build", "Lja/burhanrashid52/photoeditor/PhotoEditor;", "setClipSourceImage", "clip", "setDefaultEmojiTypeface", "setDefaultTextTypeface", "setDeleteView", "setPinchTextScalable", "photoeditor_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Builder {
        public boolean clipSourceImage;

        @NotNull
        private Context context;

        @Nullable
        public View deleteView;

        @NotNull
        public DrawingView drawingView;

        @Nullable
        public Typeface emojiTypeface;

        @NotNull
        public ImageView imageView;
        public boolean isTextPinchScalable;

        @NotNull
        private PhotoEditorView photoEditorView;

        @Nullable
        public Typeface textTypeface;

        public Builder(@NotNull Context context, @NotNull PhotoEditorView photoEditorView) {
            Intrinsics.echo(context, "context");
            Intrinsics.echo(photoEditorView, "photoEditorView");
            this.context = context;
            this.photoEditorView = photoEditorView;
            this.imageView = photoEditorView.getSource();
            this.drawingView = this.photoEditorView.getDrawingView();
            this.isTextPinchScalable = true;
        }

        @NotNull
        public final PhotoEditor build() {
            return new PhotoEditorImpl(this);
        }

        @NotNull
        public final Context getContext() {
            return this.context;
        }

        @NotNull
        public final PhotoEditorView getPhotoEditorView() {
            return this.photoEditorView;
        }

        @NotNull
        public final Builder setClipSourceImage(boolean clip) {
            this.clipSourceImage = clip;
            return this;
        }

        public final void setContext(@NotNull Context context) {
            Intrinsics.echo(context, "<set-?>");
            this.context = context;
        }

        @NotNull
        public final Builder setDefaultEmojiTypeface(@Nullable Typeface emojiTypeface) {
            this.emojiTypeface = emojiTypeface;
            return this;
        }

        @NotNull
        public final Builder setDefaultTextTypeface(@Nullable Typeface textTypeface) {
            this.textTypeface = textTypeface;
            return this;
        }

        @NotNull
        public final Builder setDeleteView(@Nullable View deleteView) {
            this.deleteView = deleteView;
            return this;
        }

        public final void setPhotoEditorView(@NotNull PhotoEditorView photoEditorView) {
            Intrinsics.echo(photoEditorView, "<set-?>");
            this.photoEditorView = photoEditorView;
        }

        @NotNull
        public final Builder setPinchTextScalable(boolean isTextPinchScalable) {
            this.isTextPinchScalable = isTextPinchScalable;
            return this;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Object saveAsBitmap$default(PhotoEditor photoEditor, SaveSettings saveSettings, c cVar, int i4, Object obj) {
            if (obj == null) {
                if ((i4 & 1) != 0) {
                    saveSettings = new SaveSettings.Builder().build();
                }
                return photoEditor.saveAsBitmap(saveSettings, (c<? super Bitmap>) cVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: saveAsBitmap");
        }

        public static /* synthetic */ Object saveAsFile$default(PhotoEditor photoEditor, String str, SaveSettings saveSettings, c cVar, int i4, Object obj) {
            if (obj == null) {
                if ((i4 & 2) != 0) {
                    saveSettings = new SaveSettings.Builder().build();
                }
                return photoEditor.saveAsFile(str, saveSettings, (c<? super SaveFileResult>) cVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: saveAsFile");
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lja/burhanrashid52/photoeditor/PhotoEditor$OnSaveListener;", "", "onFailure", "", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onSuccess", "imagePath", "", "photoeditor_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public interface OnSaveListener {
        void onFailure(@NotNull Exception exception);

        void onSuccess(@NotNull String imagePath);
    }

    void addEmoji(@Nullable Typeface emojiTypeface, @NotNull String emojiName);

    void addEmoji(@NotNull String emojiName);

    void addImage(@NotNull Bitmap desiredImage);

    @SuppressLint({"ClickableViewAccessibility"})
    void addText(@Nullable Typeface textTypeface, @NotNull String text, int colorCodeTextView);

    @SuppressLint({"ClickableViewAccessibility"})
    void addText(@NotNull String text, int colorCodeTextView);

    @SuppressLint({"ClickableViewAccessibility"})
    void addText(@NotNull String text, @Nullable TextStyleBuilder styleBuilder);

    void brushEraser();

    void clearAllViews();

    void clearHelperBox();

    void editText(@NotNull View view, @Nullable Typeface textTypeface, @NotNull String inputText, int colorCode);

    void editText(@NotNull View view, @NotNull String inputText, int colorCode);

    void editText(@NotNull View view, @NotNull String inputText, @Nullable TextStyleBuilder styleBuilder);

    int getBrushColor();

    @Nullable
    Boolean getBrushDrawableMode();

    float getBrushSize();

    float getEraserSize();

    boolean isCacheEmpty();

    boolean redo();

    @Nullable
    Object saveAsBitmap(@NotNull SaveSettings saveSettings, @NotNull c<? super Bitmap> cVar);

    void saveAsBitmap(@NotNull OnSaveBitmap onSaveBitmap);

    void saveAsBitmap(@NotNull SaveSettings saveSettings, @NotNull OnSaveBitmap onSaveBitmap);

    @Nullable
    Object saveAsFile(@NotNull String str, @NotNull SaveSettings saveSettings, @NotNull c<? super SaveFileResult> cVar);

    void saveAsFile(@NotNull String imagePath, @NotNull OnSaveListener onSaveListener);

    void saveAsFile(@NotNull String imagePath, @NotNull SaveSettings saveSettings, @NotNull OnSaveListener onSaveListener);

    @kotlin.c
    void setBrushColor(int i4);

    void setBrushDrawingMode(boolean brushDrawingMode);

    void setBrushEraserSize(float brushEraserSize);

    @kotlin.c
    void setBrushSize(float f5);

    void setFilterEffect(@Nullable CustomEffect customEffect);

    void setFilterEffect(@NotNull PhotoFilter filterType);

    void setOnPhotoEditorListener(@NotNull OnPhotoEditorListener onPhotoEditorListener);

    @kotlin.c
    void setOpacity(int opacity);

    void setShape(@NotNull ShapeBuilder shapeBuilder);

    boolean undo();
}
