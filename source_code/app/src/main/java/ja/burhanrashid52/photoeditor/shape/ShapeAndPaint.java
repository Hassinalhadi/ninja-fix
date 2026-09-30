package ja.burhanrashid52.photoeditor.shape;

import android.graphics.Paint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lja/burhanrashid52/photoeditor/shape/ShapeAndPaint;", "", "shape", "Lja/burhanrashid52/photoeditor/shape/AbstractShape;", "paint", "Landroid/graphics/Paint;", "(Lja/burhanrashid52/photoeditor/shape/AbstractShape;Landroid/graphics/Paint;)V", "getPaint", "()Landroid/graphics/Paint;", "getShape", "()Lja/burhanrashid52/photoeditor/shape/AbstractShape;", "photoeditor_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public class ShapeAndPaint {

    @NotNull
    private final Paint paint;

    @NotNull
    private final AbstractShape shape;

    public ShapeAndPaint(@NotNull AbstractShape shape, @NotNull Paint paint) {
        Intrinsics.echo(shape, "shape");
        Intrinsics.echo(paint, "paint");
        this.shape = shape;
        this.paint = paint;
    }

    @NotNull
    public final Paint getPaint() {
        return this.paint;
    }

    @NotNull
    public final AbstractShape getShape() {
        return this.shape;
    }
}
