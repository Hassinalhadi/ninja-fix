package ja.burhanrashid52.photoeditor;

import Nd.c;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import ja.burhanrashid52.photoeditor.FilterImageView;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 42\u00020\u0001:\u00014B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0013\u0010\u0013\u001a\u00020\u0010H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0019\u001a\u00020\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0000¢\u0006\u0004\b\u0017\u0010\u001cJ\u0017\u0010!\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001dH\u0000¢\u0006\u0004\b\u001f\u0010 R\u0016\u0010#\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R$\u0010'\u001a\u00020%2\u0006\u0010&\u001a\u00020%8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0016\u0010,\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010.\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0011\u00103\u001a\u0002008F¢\u0006\u0006\u001a\u0004\b1\u00102\u0082\u0002\u0004\n\u0002\b\u0019¨\u00065"}, d2 = {"Lja/burhanrashid52/photoeditor/PhotoEditorView;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/widget/RelativeLayout$LayoutParams;", "setupImageSource", "(Landroid/util/AttributeSet;)Landroid/widget/RelativeLayout$LayoutParams;", "setupDrawingView", "()Landroid/widget/RelativeLayout$LayoutParams;", "setupFilterView", "Landroid/graphics/Bitmap;", "saveFilter$photoeditor_release", "(LNd/c;)Ljava/lang/Object;", "saveFilter", "Lja/burhanrashid52/photoeditor/PhotoFilter;", "filterType", "", "setFilterEffect$photoeditor_release", "(Lja/burhanrashid52/photoeditor/PhotoFilter;)V", "setFilterEffect", "Lja/burhanrashid52/photoeditor/CustomEffect;", "customEffect", "(Lja/burhanrashid52/photoeditor/CustomEffect;)V", "", "clip", "setClipSourceImage$photoeditor_release", "(Z)V", "setClipSourceImage", "Lja/burhanrashid52/photoeditor/FilterImageView;", "mImgSource", "Lja/burhanrashid52/photoeditor/FilterImageView;", "Lja/burhanrashid52/photoeditor/DrawingView;", "<set-?>", "drawingView", "Lja/burhanrashid52/photoeditor/DrawingView;", "getDrawingView$photoeditor_release", "()Lja/burhanrashid52/photoeditor/DrawingView;", "Lja/burhanrashid52/photoeditor/ImageFilterView;", "mImageFilterView", "Lja/burhanrashid52/photoeditor/ImageFilterView;", "clipSourceImage", "Z", "Landroid/widget/ImageView;", "getSource", "()Landroid/widget/ImageView;", "source", "Companion", "photoeditor_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PhotoEditorView extends RelativeLayout {

    @NotNull
    private static final String TAG = "PhotoEditorView";
    private static final int glFilterId = 3;
    private static final int imgSrcId = 1;
    private static final int shapeSrcId = 2;
    private boolean clipSourceImage;

    @NotNull
    private DrawingView drawingView;

    @NotNull
    private ImageFilterView mImageFilterView;

    @NotNull
    private FilterImageView mImgSource;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PhotoEditorView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.echo(context, "context");
    }

    private final RelativeLayout.LayoutParams setupDrawingView() {
        this.drawingView.setVisibility(8);
        this.drawingView.setId(2);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13, -1);
        layoutParams.addRule(6, 1);
        layoutParams.addRule(8, 1);
        layoutParams.addRule(5, 1);
        layoutParams.addRule(7, 1);
        return layoutParams;
    }

    private final RelativeLayout.LayoutParams setupFilterView() {
        this.mImageFilterView.setVisibility(8);
        this.mImageFilterView.setId(3);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13, -1);
        layoutParams.addRule(6, 1);
        layoutParams.addRule(8, 1);
        return layoutParams;
    }

    @SuppressLint({"Recycle"})
    private final RelativeLayout.LayoutParams setupImageSource(AttributeSet attrs) {
        int i4;
        this.mImgSource.setId(1);
        this.mImgSource.setAdjustViewBounds(true);
        this.mImgSource.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        if (attrs != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attrs, R.styleable.PhotoEditorView);
            Intrinsics.delta(obtainStyledAttributes, "context.obtainStyledAttr…tyleable.PhotoEditorView)");
            Drawable drawable = obtainStyledAttributes.getDrawable(R.styleable.PhotoEditorView_photo_src);
            if (drawable != null) {
                this.mImgSource.setImageDrawable(drawable);
            }
        }
        if (this.clipSourceImage) {
            i4 = -2;
        } else {
            i4 = -1;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i4, -2);
        layoutParams.addRule(13, -1);
        return layoutParams;
    }

    @NotNull
    /* renamed from: getDrawingView$photoeditor_release, reason: from getter */
    public final DrawingView getDrawingView() {
        return this.drawingView;
    }

    @NotNull
    public final ImageView getSource() {
        return this.mImgSource;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object saveFilter$photoeditor_release(@NotNull c<? super Bitmap> cVar) {
        PhotoEditorView$saveFilter$1 photoEditorView$saveFilter$1;
        int i4;
        PhotoEditorView photoEditorView;
        try {
            if (cVar instanceof PhotoEditorView$saveFilter$1) {
                photoEditorView$saveFilter$1 = (PhotoEditorView$saveFilter$1) cVar;
                int i5 = photoEditorView$saveFilter$1.label;
                if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                    photoEditorView$saveFilter$1.label = i5 - RecyclerView.UNDEFINED_DURATION;
                    Object obj = photoEditorView$saveFilter$1.result;
                    Od.a aVar = Od.a.alpha;
                    i4 = photoEditorView$saveFilter$1.label;
                    if (i4 == 0) {
                        if (i4 == 1) {
                            photoEditorView = (PhotoEditorView) photoEditorView$saveFilter$1.L$0;
                            ResultKt.alpha(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.alpha(obj);
                        if (this.mImageFilterView.getVisibility() == 0) {
                            ImageFilterView imageFilterView = this.mImageFilterView;
                            photoEditorView$saveFilter$1.L$0 = this;
                            photoEditorView$saveFilter$1.label = 1;
                            obj = imageFilterView.saveBitmap$photoeditor_release(photoEditorView$saveFilter$1);
                            if (obj == aVar) {
                                return aVar;
                            }
                            photoEditorView = this;
                        } else {
                            Bitmap bitmap = this.mImgSource.getBitmap();
                            Intrinsics.checkNotNull(bitmap);
                            return bitmap;
                        }
                    }
                    Bitmap bitmap2 = (Bitmap) obj;
                    photoEditorView.mImgSource.setImageBitmap(bitmap2);
                    photoEditorView.mImageFilterView.setVisibility(8);
                    return bitmap2;
                }
            }
            if (i4 == 0) {
            }
            Bitmap bitmap22 = (Bitmap) obj;
            photoEditorView.mImgSource.setImageBitmap(bitmap22);
            photoEditorView.mImageFilterView.setVisibility(8);
            return bitmap22;
        } catch (Throwable th) {
            throw new RuntimeException("Couldn't save bitmap with filter", th);
        }
        photoEditorView$saveFilter$1 = new PhotoEditorView$saveFilter$1(this, cVar);
        Object obj2 = photoEditorView$saveFilter$1.result;
        Od.a aVar2 = Od.a.alpha;
        i4 = photoEditorView$saveFilter$1.label;
    }

    public final void setClipSourceImage$photoeditor_release(boolean clip) {
        this.clipSourceImage = clip;
        this.mImgSource.setLayoutParams(setupImageSource(null));
    }

    public final void setFilterEffect$photoeditor_release(@NotNull PhotoFilter filterType) {
        Intrinsics.echo(filterType, "filterType");
        this.mImageFilterView.setVisibility(0);
        this.mImageFilterView.setFilterEffect$photoeditor_release(filterType);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PhotoEditorView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.echo(context, "context");
    }

    public /* synthetic */ PhotoEditorView(Context context, AttributeSet attributeSet, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i5 & 2) != 0 ? null : attributeSet, (i5 & 4) != 0 ? 0 : i4);
    }

    public final void setFilterEffect$photoeditor_release(@Nullable CustomEffect customEffect) {
        this.mImageFilterView.setVisibility(0);
        this.mImageFilterView.setFilterEffect$photoeditor_release(customEffect);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PhotoEditorView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        Intrinsics.echo(context, "context");
        this.mImgSource = new FilterImageView(context, null, 0, 6, null);
        RelativeLayout.LayoutParams layoutParams = setupImageSource(attributeSet);
        this.mImageFilterView = new ImageFilterView(context, null, 2, 0 == true ? 1 : 0);
        RelativeLayout.LayoutParams layoutParams2 = setupFilterView();
        this.mImgSource.setOnImageChangedListener(new FilterImageView.OnImageChangedListener() { // from class: ja.burhanrashid52.photoeditor.PhotoEditorView.1
            @Override // ja.burhanrashid52.photoeditor.FilterImageView.OnImageChangedListener
            public void onBitmapLoaded(@Nullable Bitmap sourceBitmap) {
                PhotoEditorView.this.mImageFilterView.setFilterEffect$photoeditor_release(PhotoFilter.NONE);
                PhotoEditorView.this.mImageFilterView.setSourceBitmap$photoeditor_release(sourceBitmap);
                Log.d(PhotoEditorView.TAG, "onBitmapLoaded() called with: sourceBitmap = [" + sourceBitmap + ']');
            }
        });
        this.drawingView = new DrawingView(context, null, 0, 6, null);
        RelativeLayout.LayoutParams layoutParams3 = setupDrawingView();
        addView(this.mImgSource, layoutParams);
        addView(this.mImageFilterView, layoutParams2);
        addView(this.drawingView, layoutParams3);
    }
}
