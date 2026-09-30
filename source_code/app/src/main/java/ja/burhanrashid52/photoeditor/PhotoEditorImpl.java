package ja.burhanrashid52.photoeditor;

import Af.n;
import Cf.e;
import Nd.c;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.clevertap.android.sdk.Constants;
import ja.burhanrashid52.photoeditor.PhotoEditor;
import ja.burhanrashid52.photoeditor.PhotoEditorImageViewListener;
import ja.burhanrashid52.photoeditor.SaveSettings;
import ja.burhanrashid52.photoeditor.shape.ShapeBuilder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import vf.C3195B;
import vf.ad;
import vf.ao;

@Metadata(d1 = {"\u0000â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0000\u0018\u0000 \u008e\u00012\u00020\u0001:\u0002\u008e\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u000f\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0013J!\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u000f\u0010\u0016J'\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ1\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001b\u0010\u001dJ)\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u001b\u0010\u001eJ\u0017\u0010 \u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b \u0010!J!\u0010 \u001a\u00020\b2\b\u0010\"\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u001f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b \u0010#J\u0017\u0010&\u001a\u00020\b2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u0019\u0010)\u001a\u00020\b2\b\b\u0001\u0010(\u001a\u00020\rH\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010-\u001a\u00020\b2\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\bH\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020$H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020$H\u0016¢\u0006\u0004\b3\u00102J\u000f\u00104\u001a\u00020\bH\u0016¢\u0006\u0004\b4\u00100J\u000f\u00105\u001a\u00020\bH\u0016¢\u0006\u0004\b5\u00100J\u0019\u00108\u001a\u00020\b2\b\u00107\u001a\u0004\u0018\u000106H\u0016¢\u0006\u0004\b8\u00109J\u0017\u00108\u001a\u00020\b2\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b8\u0010<J#\u0010A\u001a\u00020@2\u0006\u0010=\u001a\u00020\u000b2\u0006\u0010?\u001a\u00020>H\u0097@ø\u0001\u0000¢\u0006\u0004\bA\u0010BJ\u001b\u0010C\u001a\u00020\u00062\u0006\u0010?\u001a\u00020>H\u0096@ø\u0001\u0000¢\u0006\u0004\bC\u0010DJ'\u0010A\u001a\u00020\b2\u0006\u0010=\u001a\u00020\u000b2\u0006\u0010?\u001a\u00020>2\u0006\u0010F\u001a\u00020EH\u0017¢\u0006\u0004\bA\u0010GJ\u001f\u0010A\u001a\u00020\b2\u0006\u0010=\u001a\u00020\u000b2\u0006\u0010F\u001a\u00020EH\u0017¢\u0006\u0004\bA\u0010HJ\u001f\u0010C\u001a\u00020\b2\u0006\u0010?\u001a\u00020>2\u0006\u0010J\u001a\u00020IH\u0016¢\u0006\u0004\bC\u0010KJ\u0017\u0010C\u001a\u00020\b2\u0006\u0010J\u001a\u00020IH\u0016¢\u0006\u0004\bC\u0010LJ\u0017\u0010O\u001a\u00020\b2\u0006\u0010N\u001a\u00020MH\u0016¢\u0006\u0004\bO\u0010PJ\u0017\u0010S\u001a\u00020\b2\u0006\u0010R\u001a\u00020QH\u0016¢\u0006\u0004\bS\u0010TJ\u0017\u0010W\u001a\u00020\b2\u0006\u0010V\u001a\u00020UH\u0002¢\u0006\u0004\bW\u0010XJ\u0017\u0010[\u001a\u00020Z2\u0006\u0010Y\u001a\u00020$H\u0002¢\u0006\u0004\b[\u0010\\R\u0014\u0010^\u001a\u00020]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010a\u001a\u00020`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010d\u001a\u00020c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0016\u0010f\u001a\u0004\u0018\u00010\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0014\u0010i\u001a\u00020h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0014\u0010l\u001a\u00020k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u0014\u0010o\u001a\u00020n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u0018\u0010q\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010rR\u0014\u0010s\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010tR\u0016\u0010u\u001a\u0004\u0018\u00010\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010vR\u0016\u0010w\u001a\u0004\u0018\u00010\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010vR\u0014\u0010y\u001a\u00020x8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010zR\u0014\u0010|\u001a\u00020{8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010}R\u0015\u0010\u0080\u0001\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b~\u0010\u007fR)\u0010\u0085\u0001\u001a\u00020+2\u0007\u0010\u0081\u0001\u001a\u00020+8V@VX\u0096\u000e¢\u0006\u000f\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001\"\u0005\b\u0084\u0001\u0010.R)\u0010\u008a\u0001\u001a\u00020\r2\u0007\u0010\u0086\u0001\u001a\u00020\r8V@VX\u0096\u000e¢\u0006\u000f\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001\"\u0005\b\u0089\u0001\u0010*R\u0017\u0010\u008c\u0001\u001a\u00020+8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008b\u0001\u0010\u0083\u0001R\u0016\u0010\u008d\u0001\u001a\u00020$8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u008d\u0001\u00102\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u008f\u0001"}, d2 = {"Lja/burhanrashid52/photoeditor/PhotoEditorImpl;", "Lja/burhanrashid52/photoeditor/PhotoEditor;", "Lja/burhanrashid52/photoeditor/PhotoEditor$Builder;", "builder", "<init>", "(Lja/burhanrashid52/photoeditor/PhotoEditor$Builder;)V", "Landroid/graphics/Bitmap;", "desiredImage", "", "addImage", "(Landroid/graphics/Bitmap;)V", "", Constants.KEY_TEXT, "", "colorCodeTextView", "addText", "(Ljava/lang/String;I)V", "Landroid/graphics/Typeface;", "textTypeface", "(Landroid/graphics/Typeface;Ljava/lang/String;I)V", "Lja/burhanrashid52/photoeditor/TextStyleBuilder;", "styleBuilder", "(Ljava/lang/String;Lja/burhanrashid52/photoeditor/TextStyleBuilder;)V", "Landroid/view/View;", "view", "inputText", "colorCode", "editText", "(Landroid/view/View;Ljava/lang/String;I)V", "(Landroid/view/View;Landroid/graphics/Typeface;Ljava/lang/String;I)V", "(Landroid/view/View;Ljava/lang/String;Lja/burhanrashid52/photoeditor/TextStyleBuilder;)V", "emojiName", "addEmoji", "(Ljava/lang/String;)V", "emojiTypeface", "(Landroid/graphics/Typeface;Ljava/lang/String;)V", "", "brushDrawingMode", "setBrushDrawingMode", "(Z)V", "opacity", "setOpacity", "(I)V", "", "brushEraserSize", "setBrushEraserSize", "(F)V", "brushEraser", "()V", "undo", "()Z", "redo", "clearAllViews", "clearHelperBox", "Lja/burhanrashid52/photoeditor/CustomEffect;", "customEffect", "setFilterEffect", "(Lja/burhanrashid52/photoeditor/CustomEffect;)V", "Lja/burhanrashid52/photoeditor/PhotoFilter;", "filterType", "(Lja/burhanrashid52/photoeditor/PhotoFilter;)V", "imagePath", "Lja/burhanrashid52/photoeditor/SaveSettings;", "saveSettings", "Lja/burhanrashid52/photoeditor/SaveFileResult;", "saveAsFile", "(Ljava/lang/String;Lja/burhanrashid52/photoeditor/SaveSettings;LNd/c;)Ljava/lang/Object;", "saveAsBitmap", "(Lja/burhanrashid52/photoeditor/SaveSettings;LNd/c;)Ljava/lang/Object;", "Lja/burhanrashid52/photoeditor/PhotoEditor$OnSaveListener;", "onSaveListener", "(Ljava/lang/String;Lja/burhanrashid52/photoeditor/SaveSettings;Lja/burhanrashid52/photoeditor/PhotoEditor$OnSaveListener;)V", "(Ljava/lang/String;Lja/burhanrashid52/photoeditor/PhotoEditor$OnSaveListener;)V", "Lja/burhanrashid52/photoeditor/OnSaveBitmap;", "onSaveBitmap", "(Lja/burhanrashid52/photoeditor/SaveSettings;Lja/burhanrashid52/photoeditor/OnSaveBitmap;)V", "(Lja/burhanrashid52/photoeditor/OnSaveBitmap;)V", "Lja/burhanrashid52/photoeditor/OnPhotoEditorListener;", "onPhotoEditorListener", "setOnPhotoEditorListener", "(Lja/burhanrashid52/photoeditor/OnPhotoEditorListener;)V", "Lja/burhanrashid52/photoeditor/shape/ShapeBuilder;", "shapeBuilder", "setShape", "(Lja/burhanrashid52/photoeditor/shape/ShapeBuilder;)V", "Lja/burhanrashid52/photoeditor/Graphic;", "graphic", "addToEditor", "(Lja/burhanrashid52/photoeditor/Graphic;)V", "isPinchScalable", "Lja/burhanrashid52/photoeditor/MultiTouchListener;", "getMultiTouchListener", "(Z)Lja/burhanrashid52/photoeditor/MultiTouchListener;", "Lja/burhanrashid52/photoeditor/PhotoEditorView;", "photoEditorView", "Lja/burhanrashid52/photoeditor/PhotoEditorView;", "Lja/burhanrashid52/photoeditor/PhotoEditorViewState;", "viewState", "Lja/burhanrashid52/photoeditor/PhotoEditorViewState;", "Landroid/widget/ImageView;", "imageView", "Landroid/widget/ImageView;", "deleteView", "Landroid/view/View;", "Lja/burhanrashid52/photoeditor/DrawingView;", "drawingView", "Lja/burhanrashid52/photoeditor/DrawingView;", "Lja/burhanrashid52/photoeditor/BrushDrawingStateListener;", "mBrushDrawingStateListener", "Lja/burhanrashid52/photoeditor/BrushDrawingStateListener;", "Lja/burhanrashid52/photoeditor/BoxHelper;", "mBoxHelper", "Lja/burhanrashid52/photoeditor/BoxHelper;", "mOnPhotoEditorListener", "Lja/burhanrashid52/photoeditor/OnPhotoEditorListener;", "isTextPinchScalable", "Z", "mDefaultTextTypeface", "Landroid/graphics/Typeface;", "mDefaultEmojiTypeface", "Lja/burhanrashid52/photoeditor/GraphicManager;", "mGraphicManager", "Lja/burhanrashid52/photoeditor/GraphicManager;", "Landroid/content/Context;", "context", "Landroid/content/Context;", "getBrushDrawableMode", "()Ljava/lang/Boolean;", "brushDrawableMode", "size", "getBrushSize", "()F", "setBrushSize", "brushSize", Constants.KEY_COLOR, "getBrushColor", "()I", "setBrushColor", "brushColor", "getEraserSize", "eraserSize", "isCacheEmpty", "Companion", "photoeditor_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PhotoEditorImpl implements PhotoEditor {

    @NotNull
    private static final String TAG = "PhotoEditor";

    @NotNull
    private final Context context;

    @Nullable
    private final View deleteView;

    @NotNull
    private final DrawingView drawingView;

    @NotNull
    private final ImageView imageView;
    private final boolean isTextPinchScalable;

    @NotNull
    private final BoxHelper mBoxHelper;

    @NotNull
    private final BrushDrawingStateListener mBrushDrawingStateListener;

    @Nullable
    private final Typeface mDefaultEmojiTypeface;

    @Nullable
    private final Typeface mDefaultTextTypeface;

    @NotNull
    private final GraphicManager mGraphicManager;

    @Nullable
    private OnPhotoEditorListener mOnPhotoEditorListener;

    @NotNull
    private final PhotoEditorView photoEditorView;

    @NotNull
    private final PhotoEditorViewState viewState;

    @SuppressLint({"ClickableViewAccessibility"})
    public PhotoEditorImpl(@NotNull PhotoEditor.Builder builder) {
        Intrinsics.echo(builder, "builder");
        PhotoEditorView photoEditorView = builder.getPhotoEditorView();
        this.photoEditorView = photoEditorView;
        PhotoEditorViewState photoEditorViewState = new PhotoEditorViewState();
        this.viewState = photoEditorViewState;
        ImageView imageView = builder.imageView;
        this.imageView = imageView;
        this.deleteView = builder.deleteView;
        DrawingView drawingView = builder.drawingView;
        this.drawingView = drawingView;
        BrushDrawingStateListener brushDrawingStateListener = new BrushDrawingStateListener(builder.getPhotoEditorView(), photoEditorViewState);
        this.mBrushDrawingStateListener = brushDrawingStateListener;
        this.mBoxHelper = new BoxHelper(builder.getPhotoEditorView(), photoEditorViewState);
        this.isTextPinchScalable = builder.isTextPinchScalable;
        this.mDefaultTextTypeface = builder.textTypeface;
        this.mDefaultEmojiTypeface = builder.emojiTypeface;
        this.mGraphicManager = new GraphicManager(builder.getPhotoEditorView(), photoEditorViewState);
        Context context = builder.getContext();
        this.context = context;
        if (drawingView != null) {
            drawingView.setBrushViewChangeListener(brushDrawingStateListener);
        }
        final GestureDetector gestureDetector = new GestureDetector(context, new PhotoEditorImageViewListener(photoEditorViewState, new PhotoEditorImageViewListener.OnSingleTapUpCallback() { // from class: ja.burhanrashid52.photoeditor.PhotoEditorImpl$mDetector$1
            @Override // ja.burhanrashid52.photoeditor.PhotoEditorImageViewListener.OnSingleTapUpCallback
            public void onSingleTapUp() {
                PhotoEditorImpl.this.clearHelperBox();
            }
        }));
        if (imageView != null) {
            imageView.setOnTouchListener(new View.OnTouchListener() { // from class: ja.burhanrashid52.photoeditor.a
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    boolean _init_$lambda$0;
                    _init_$lambda$0 = PhotoEditorImpl._init_$lambda$0(PhotoEditorImpl.this, gestureDetector, view, motionEvent);
                    return _init_$lambda$0;
                }
            });
        }
        photoEditorView.setClipSourceImage$photoeditor_release(builder.clipSourceImage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$0(PhotoEditorImpl this$0, GestureDetector mDetector, View view, MotionEvent event) {
        Intrinsics.echo(this$0, "this$0");
        Intrinsics.echo(mDetector, "$mDetector");
        OnPhotoEditorListener onPhotoEditorListener = this$0.mOnPhotoEditorListener;
        if (onPhotoEditorListener != null) {
            Intrinsics.delta(event, "event");
            onPhotoEditorListener.onTouchSourceImage(event);
        }
        return mDetector.onTouchEvent(event);
    }

    private final void addToEditor(Graphic graphic) {
        clearHelperBox();
        this.mGraphicManager.addView(graphic);
        this.viewState.setCurrentSelectedView(graphic.getRootView());
    }

    private final MultiTouchListener getMultiTouchListener(boolean isPinchScalable) {
        return new MultiTouchListener(this.deleteView, this.photoEditorView, this.imageView, isPinchScalable, this.mOnPhotoEditorListener, this.viewState);
    }

    @Override // ja.burhanrashid52.photoeditor.PhotoEditor
    public void addEmoji(@NotNull String emojiName) {
        Intrinsics.echo(emojiName, "emojiName");
        addEmoji(null, emojiName);
    }

    @Override // ja.burhanrashid52.photoeditor.PhotoEditor
    public void addImage(@NotNull Bitmap desiredImage) {
        Intrinsics.echo(desiredImage, "desiredImage");
        Sticker sticker = new Sticker(this.photoEditorView, getMultiTouchListener(true), this.viewState, this.mGraphicManager);
        sticker.buildView(desiredImage);
        addToEditor(sticker);
    }

    @Override // ja.burhanrashid52.photoeditor.PhotoEditor
    public void addText(@NotNull String text, int colorCodeTextView) {
        Intrinsics.echo(text, "text");
        addText(null, text, colorCodeTextView);
    }

    @Override // ja.burhanrashid52.photoeditor.PhotoEditor
    public void brushEraser() {
        DrawingView drawingView = this.drawingView;
        if (drawingView != null) {
            drawingView.brushEraser();
        }
    }

    @Override // ja.burhanrashid52.photoeditor.PhotoEditor
    public void clearAllViews() {
        this.mBoxHelper.clearAllViews(this.drawingView);
    }

    @Override // ja.burhanrashid52.photoeditor.PhotoEditor
    public void clearHelperBox() {
        this.mBoxHelper.clearHelperBox();
    }

    @Override // ja.burhanrashid52.photoeditor.PhotoEditor
    public void editText(@NotNull View view, @NotNull String inputText, int colorCode) {
        Intrinsics.echo(view, "view");
        Intrinsics.echo(inputText, "inputText");
        editText(view, null, inputText, colorCode);
    }

    @Override // ja.burhanrashid52.photoeditor.PhotoEditor
    public int getBrushColor() {
        ShapeBuilder currentShapeBuilder;
        DrawingView drawingView = this.drawingView;
        if (drawingView != null && (currentShapeBuilder = drawingView.getCurrentShapeBuilder()) != null) {
            return currentShapeBuilder.getShapeColor();
        }
        return 0;
    }

    @Override // ja.burhanrashid52.photoeditor.PhotoEditor
    @NotNull
    public Boolean getBrushDrawableMode() {
        boolean z2;
        DrawingView drawingView = this.drawingView;
        if (drawingView != null && drawingView.getIsDrawingEnabled()) {
            z2 = true;
        } else {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }

    @Override // ja.burhanrashid52.photoeditor.PhotoEditor
    public float getBrushSize() {
        ShapeBuilder currentShapeBuilder;
        DrawingView drawingView = this.drawingView;
        if (drawingView != null && (currentShapeBuilder = drawingView.getCurrentShapeBuilder()) != null) {
            return currentShapeBuilder.getShapeSize();
        }
        return 0.0f;
    }

    @Override // ja.burhanrashid52.photoeditor.PhotoEditor
    public float getEraserSize() {
        DrawingView drawingView = this.drawingView;
        if (drawingView != null) {
            return drawingView.getEraserSize();
        }
        return 0.0f;
    }

    @Override // ja.burhanrashid52.photoeditor.PhotoEditor
    public boolean isCacheEmpty() {
        if (this.viewState.getAddedViewsCount() == 0 && this.viewState.getRedoViewsCount() == 0) {
            return true;
        }
        return false;
    }

    @Override // ja.burhanrashid52.photoeditor.PhotoEditor
    public boolean redo() {
        return this.mGraphicManager.redoView();
    }

    @Override // ja.burhanrashid52.photoeditor.PhotoEditor
    @Nullable
    public Object saveAsBitmap(@NotNull SaveSettings saveSettings, @NotNull c<? super Bitmap> cVar) {
        e eVar = ao.alpha;
        return ad.blue(n.alpha, new PhotoEditorImpl$saveAsBitmap$2(this, saveSettings, null), cVar);
    }

    @Override // ja.burhanrashid52.photoeditor.PhotoEditor
    @Nullable
    public Object saveAsFile(@NotNull String str, @NotNull SaveSettings saveSettings, @NotNull c<? super SaveFileResult> cVar) {
        e eVar = ao.alpha;
        return ad.blue(n.alpha, new PhotoEditorImpl$saveAsFile$2(this, saveSettings, str, null), cVar);
    }

    @Override // ja.burhanrashid52.photoeditor.PhotoEditor
    public void setBrushColor(int i4) {
        ShapeBuilder currentShapeBuilder;
        DrawingView drawingView = this.drawingView;
        if (drawingView != null && (currentShapeBuilder = drawingView.getCurrentShapeBuilder()) != null) {
            currentShapeBuilder.withShapeColor(i4);
        }
    }

    @Override // ja.burhanrashid52.photoeditor.PhotoEditor
    public void setBrushDrawingMode(boolean brushDrawingMode) {
        DrawingView drawingView = this.drawingView;
        if (drawingView != null) {
            drawingView.enableDrawing(brushDrawingMode);
        }
    }

    @Override // ja.burhanrashid52.photoeditor.PhotoEditor
    public void setBrushEraserSize(float brushEraserSize) {
        DrawingView drawingView = this.drawingView;
        if (drawingView == null) {
            return;
        }
        drawingView.setEraserSize(brushEraserSize);
    }

    @Override // ja.burhanrashid52.photoeditor.PhotoEditor
    public void setBrushSize(float f5) {
        ShapeBuilder currentShapeBuilder;
        DrawingView drawingView = this.drawingView;
        if (drawingView != null && (currentShapeBuilder = drawingView.getCurrentShapeBuilder()) != null) {
            currentShapeBuilder.withShapeSize(f5);
        }
    }

    @Override // ja.burhanrashid52.photoeditor.PhotoEditor
    public void setFilterEffect(@Nullable CustomEffect customEffect) {
        this.photoEditorView.setFilterEffect$photoeditor_release(customEffect);
    }

    @Override // ja.burhanrashid52.photoeditor.PhotoEditor
    public void setOnPhotoEditorListener(@NotNull OnPhotoEditorListener onPhotoEditorListener) {
        Intrinsics.echo(onPhotoEditorListener, "onPhotoEditorListener");
        this.mOnPhotoEditorListener = onPhotoEditorListener;
        this.mGraphicManager.setOnPhotoEditorListener(onPhotoEditorListener);
        this.mBrushDrawingStateListener.setOnPhotoEditorListener(this.mOnPhotoEditorListener);
    }

    @Override // ja.burhanrashid52.photoeditor.PhotoEditor
    public void setOpacity(int opacity) {
        ShapeBuilder currentShapeBuilder;
        int i4 = (int) ((opacity / 100.0d) * 255.0d);
        DrawingView drawingView = this.drawingView;
        if (drawingView != null && (currentShapeBuilder = drawingView.getCurrentShapeBuilder()) != null) {
            currentShapeBuilder.withShapeOpacity(Integer.valueOf(i4));
        }
    }

    @Override // ja.burhanrashid52.photoeditor.PhotoEditor
    public void setShape(@NotNull ShapeBuilder shapeBuilder) {
        Intrinsics.echo(shapeBuilder, "shapeBuilder");
        DrawingView drawingView = this.drawingView;
        if (drawingView == null) {
            return;
        }
        drawingView.setCurrentShapeBuilder(shapeBuilder);
    }

    @Override // ja.burhanrashid52.photoeditor.PhotoEditor
    public boolean undo() {
        return this.mGraphicManager.undoView();
    }

    @Override // ja.burhanrashid52.photoeditor.PhotoEditor
    public void addEmoji(@Nullable Typeface emojiTypeface, @NotNull String emojiName) {
        Intrinsics.echo(emojiName, "emojiName");
        DrawingView drawingView = this.drawingView;
        if (drawingView != null) {
            drawingView.enableDrawing(false);
        }
        Emoji emoji = new Emoji(this.photoEditorView, getMultiTouchListener(true), this.viewState, this.mGraphicManager, this.mDefaultEmojiTypeface);
        emoji.buildView(emojiTypeface, emojiName);
        addToEditor(emoji);
    }

    @Override // ja.burhanrashid52.photoeditor.PhotoEditor
    public void addText(@Nullable Typeface textTypeface, @NotNull String text, int colorCodeTextView) {
        Intrinsics.echo(text, "text");
        TextStyleBuilder textStyleBuilder = new TextStyleBuilder();
        textStyleBuilder.withTextColor(colorCodeTextView);
        if (textTypeface != null) {
            textStyleBuilder.withTextFont(textTypeface);
        }
        addText(text, textStyleBuilder);
    }

    @Override // ja.burhanrashid52.photoeditor.PhotoEditor
    public void editText(@NotNull View view, @Nullable Typeface textTypeface, @NotNull String inputText, int colorCode) {
        Intrinsics.echo(view, "view");
        Intrinsics.echo(inputText, "inputText");
        TextStyleBuilder textStyleBuilder = new TextStyleBuilder();
        textStyleBuilder.withTextColor(colorCode);
        if (textTypeface != null) {
            textStyleBuilder.withTextFont(textTypeface);
        }
        editText(view, inputText, textStyleBuilder);
    }

    @Override // ja.burhanrashid52.photoeditor.PhotoEditor
    public void setFilterEffect(@NotNull PhotoFilter filterType) {
        Intrinsics.echo(filterType, "filterType");
        this.photoEditorView.setFilterEffect$photoeditor_release(filterType);
    }

    @Override // ja.burhanrashid52.photoeditor.PhotoEditor
    public void saveAsBitmap(@NotNull SaveSettings saveSettings, @NotNull OnSaveBitmap onSaveBitmap) {
        Intrinsics.echo(saveSettings, "saveSettings");
        Intrinsics.echo(onSaveBitmap, "onSaveBitmap");
        C3195B c3195b = C3195B.alpha;
        e eVar = ao.alpha;
        ad.zulu(c3195b, n.alpha, null, new PhotoEditorImpl$saveAsBitmap$3(this, saveSettings, onSaveBitmap, null), 2);
    }

    @Override // ja.burhanrashid52.photoeditor.PhotoEditor
    public void saveAsFile(@NotNull String imagePath, @NotNull SaveSettings saveSettings, @NotNull PhotoEditor.OnSaveListener onSaveListener) {
        Intrinsics.echo(imagePath, "imagePath");
        Intrinsics.echo(saveSettings, "saveSettings");
        Intrinsics.echo(onSaveListener, "onSaveListener");
        C3195B c3195b = C3195B.alpha;
        e eVar = ao.alpha;
        ad.zulu(c3195b, n.alpha, null, new PhotoEditorImpl$saveAsFile$3(this, imagePath, saveSettings, onSaveListener, null), 2);
    }

    @Override // ja.burhanrashid52.photoeditor.PhotoEditor
    public void addText(@NotNull String text, @Nullable TextStyleBuilder styleBuilder) {
        Intrinsics.echo(text, "text");
        DrawingView drawingView = this.drawingView;
        if (drawingView != null) {
            drawingView.enableDrawing(false);
        }
        Text text2 = new Text(this.photoEditorView, getMultiTouchListener(this.isTextPinchScalable), this.viewState, this.mDefaultTextTypeface, this.mGraphicManager);
        text2.buildView(text, styleBuilder);
        addToEditor(text2);
    }

    @Override // ja.burhanrashid52.photoeditor.PhotoEditor
    public void editText(@NotNull View view, @NotNull String inputText, @Nullable TextStyleBuilder styleBuilder) {
        Intrinsics.echo(view, "view");
        Intrinsics.echo(inputText, "inputText");
        TextView textView = (TextView) view.findViewById(R.id.tvPhotoEditorText);
        if (textView == null || !this.viewState.containsAddedView(view) || TextUtils.isEmpty(inputText)) {
            return;
        }
        textView.setText(inputText);
        if (styleBuilder != null) {
            styleBuilder.applyStyle(textView);
        }
        this.mGraphicManager.updateView(view);
    }

    @Override // ja.burhanrashid52.photoeditor.PhotoEditor
    public void saveAsBitmap(@NotNull OnSaveBitmap onSaveBitmap) {
        Intrinsics.echo(onSaveBitmap, "onSaveBitmap");
        saveAsBitmap(new SaveSettings.Builder().build(), onSaveBitmap);
    }

    @Override // ja.burhanrashid52.photoeditor.PhotoEditor
    public void saveAsFile(@NotNull String imagePath, @NotNull PhotoEditor.OnSaveListener onSaveListener) {
        Intrinsics.echo(imagePath, "imagePath");
        Intrinsics.echo(onSaveListener, "onSaveListener");
        saveAsFile(imagePath, new SaveSettings.Builder().build(), onSaveListener);
    }
}
