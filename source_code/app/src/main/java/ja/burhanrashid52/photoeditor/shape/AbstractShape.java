package ja.burhanrashid52.photoeditor.shape;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b&\u0018\u0000 )2\u00020\u0001:\u0001)B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0016J\u0006\u0010&\u001a\u00020'J\b\u0010(\u001a\u00020\u0003H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0006X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\b\"\u0004\b\u0011\u0010\nR\u001a\u0010\u0012\u001a\u00020\u0013X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0006X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\b\"\u0004\b\u001a\u0010\nR\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u0006X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\b\"\u0004\b\u001f\u0010\n¨\u0006*"}, d2 = {"Lja/burhanrashid52/photoeditor/shape/AbstractShape;", "Lja/burhanrashid52/photoeditor/shape/Shape;", "tag", "", "(Ljava/lang/String;)V", "bottom", "", "getBottom", "()F", "setBottom", "(F)V", "bounds", "Landroid/graphics/RectF;", "getBounds", "()Landroid/graphics/RectF;", "left", "getLeft", "setLeft", "path", "Landroid/graphics/Path;", "getPath", "()Landroid/graphics/Path;", "setPath", "(Landroid/graphics/Path;)V", "right", "getRight", "setRight", "getTag", "()Ljava/lang/String;", "top", "getTop", "setTop", "draw", "", "canvas", "Landroid/graphics/Canvas;", "paint", "Landroid/graphics/Paint;", "hasBeenTapped", "", "toString", "Companion", "photoeditor_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class AbstractShape implements Shape {
    public static final float TOUCH_TOLERANCE = 4.0f;
    private float bottom;
    private float left;

    @NotNull
    private Path path;
    private float right;

    @NotNull
    private final String tag;
    private float top;

    public AbstractShape(@NotNull String tag) {
        Intrinsics.echo(tag, "tag");
        this.tag = tag;
        this.path = new Path();
    }

    private final RectF getBounds() {
        RectF rectF = new RectF();
        this.path.computeBounds(rectF, true);
        return rectF;
    }

    @Override // ja.burhanrashid52.photoeditor.shape.Shape
    public void draw(@NotNull Canvas canvas, @NotNull Paint paint) {
        Intrinsics.echo(canvas, "canvas");
        Intrinsics.echo(paint, "paint");
        canvas.drawPath(this.path, paint);
    }

    public final float getBottom() {
        return this.bottom;
    }

    public final float getLeft() {
        return this.left;
    }

    @NotNull
    public final Path getPath() {
        return this.path;
    }

    public final float getRight() {
        return this.right;
    }

    @NotNull
    public final String getTag() {
        return this.tag;
    }

    public final float getTop() {
        return this.top;
    }

    public final boolean hasBeenTapped() {
        RectF bounds = getBounds();
        if (bounds.top < 4.0f && bounds.bottom < 4.0f && bounds.left < 4.0f && bounds.right < 4.0f) {
            return true;
        }
        return false;
    }

    public final void setBottom(float f5) {
        this.bottom = f5;
    }

    public final void setLeft(float f5) {
        this.left = f5;
    }

    public final void setPath(@NotNull Path path) {
        Intrinsics.echo(path, "<set-?>");
        this.path = path;
    }

    public final void setRight(float f5) {
        this.right = f5;
    }

    public final void setTop(float f5) {
        this.top = f5;
    }

    @NotNull
    public String toString() {
        return this.tag + ": left: " + this.left + " - top: " + this.top + " - right: " + this.right + " - bottom: " + this.bottom;
    }
}
