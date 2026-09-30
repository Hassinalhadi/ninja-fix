package ja.burhanrashid52.photoeditor;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001/B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\nH\u0016J\u0012\u0010\u0012\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u0012\u0010\u0015\u001a\u00020\u00102\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0007H\u0016J\u0010\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u0007H\u0016J\u0018\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0016J\u0012\u0010$\u001a\u00020\u00102\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u0012\u0010'\u001a\u00020\u00102\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\u0012\u0010*\u001a\u00020\u00102\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\u0010\u0010-\u001a\u00020\u00102\b\u0010.\u001a\u0004\u0018\u00010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lja/burhanrashid52/photoeditor/FilterImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "bitmap", "Landroid/graphics/Bitmap;", "getBitmap", "()Landroid/graphics/Bitmap;", "mOnImageChangedListener", "Lja/burhanrashid52/photoeditor/FilterImageView$OnImageChangedListener;", "setImageBitmap", "", "bm", "setImageDrawable", "drawable", "Landroid/graphics/drawable/Drawable;", "setImageIcon", Constants.KEY_ICON, "Landroid/graphics/drawable/Icon;", "setImageLevel", "level", "setImageMatrix", "matrix", "Landroid/graphics/Matrix;", "setImageResource", "resId", "setImageState", "state", "", "merge", "", "setImageTintList", "tint", "Landroid/content/res/ColorStateList;", "setImageTintMode", "tintMode", "Landroid/graphics/PorterDuff$Mode;", "setImageURI", "uri", "Landroid/net/Uri;", "setOnImageChangedListener", "onImageChangedListener", "OnImageChangedListener", "photoeditor_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FilterImageView extends AppCompatImageView {

    @Nullable
    private OnImageChangedListener mOnImageChangedListener;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lja/burhanrashid52/photoeditor/FilterImageView$OnImageChangedListener;", "", "onBitmapLoaded", "", "sourceBitmap", "Landroid/graphics/Bitmap;", "photoeditor_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public interface OnImageChangedListener {
        void onBitmapLoaded(@Nullable Bitmap sourceBitmap);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FilterImageView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.echo(context, "context");
    }

    @Nullable
    public final Bitmap getBitmap() {
        if (getDrawable() instanceof BitmapDrawable) {
            Drawable drawable = getDrawable();
            Intrinsics.charlie(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
            return ((BitmapDrawable) drawable).getBitmap();
        }
        return null;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(@NotNull Bitmap bm2) {
        Intrinsics.echo(bm2, "bm");
        super.setImageBitmap(bm2);
        OnImageChangedListener onImageChangedListener = this.mOnImageChangedListener;
        if (onImageChangedListener != null) {
            onImageChangedListener.onBitmapLoaded(getBitmap());
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(@Nullable Drawable drawable) {
        super.setImageDrawable(drawable);
        OnImageChangedListener onImageChangedListener = this.mOnImageChangedListener;
        if (onImageChangedListener != null) {
            onImageChangedListener.onBitmapLoaded(getBitmap());
        }
    }

    @Override // android.widget.ImageView
    public void setImageIcon(@Nullable Icon icon) {
        super.setImageIcon(icon);
        OnImageChangedListener onImageChangedListener = this.mOnImageChangedListener;
        if (onImageChangedListener != null) {
            onImageChangedListener.onBitmapLoaded(getBitmap());
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageLevel(int level) {
        super.setImageLevel(level);
        OnImageChangedListener onImageChangedListener = this.mOnImageChangedListener;
        if (onImageChangedListener != null) {
            onImageChangedListener.onBitmapLoaded(getBitmap());
        }
    }

    @Override // android.widget.ImageView
    public void setImageMatrix(@NotNull Matrix matrix) {
        Intrinsics.echo(matrix, "matrix");
        super.setImageMatrix(matrix);
        OnImageChangedListener onImageChangedListener = this.mOnImageChangedListener;
        if (onImageChangedListener != null) {
            onImageChangedListener.onBitmapLoaded(getBitmap());
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int resId) {
        super.setImageResource(resId);
        OnImageChangedListener onImageChangedListener = this.mOnImageChangedListener;
        if (onImageChangedListener != null) {
            onImageChangedListener.onBitmapLoaded(getBitmap());
        }
    }

    @Override // android.widget.ImageView
    public void setImageState(@NotNull int[] state, boolean merge) {
        Intrinsics.echo(state, "state");
        super.setImageState(state, merge);
        OnImageChangedListener onImageChangedListener = this.mOnImageChangedListener;
        if (onImageChangedListener != null) {
            onImageChangedListener.onBitmapLoaded(getBitmap());
        }
    }

    @Override // android.widget.ImageView
    public void setImageTintList(@Nullable ColorStateList tint) {
        super.setImageTintList(tint);
        OnImageChangedListener onImageChangedListener = this.mOnImageChangedListener;
        if (onImageChangedListener != null) {
            onImageChangedListener.onBitmapLoaded(getBitmap());
        }
    }

    @Override // android.widget.ImageView
    public void setImageTintMode(@Nullable PorterDuff.Mode tintMode) {
        super.setImageTintMode(tintMode);
        OnImageChangedListener onImageChangedListener = this.mOnImageChangedListener;
        if (onImageChangedListener != null) {
            onImageChangedListener.onBitmapLoaded(getBitmap());
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageURI(@Nullable Uri uri) {
        super.setImageURI(uri);
        OnImageChangedListener onImageChangedListener = this.mOnImageChangedListener;
        if (onImageChangedListener != null) {
            onImageChangedListener.onBitmapLoaded(getBitmap());
        }
    }

    public final void setOnImageChangedListener(@Nullable OnImageChangedListener onImageChangedListener) {
        this.mOnImageChangedListener = onImageChangedListener;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FilterImageView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.echo(context, "context");
    }

    public /* synthetic */ FilterImageView(Context context, AttributeSet attributeSet, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i5 & 2) != 0 ? null : attributeSet, (i5 & 4) != 0 ? 0 : i4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilterImageView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        Intrinsics.echo(context, "context");
    }
}
