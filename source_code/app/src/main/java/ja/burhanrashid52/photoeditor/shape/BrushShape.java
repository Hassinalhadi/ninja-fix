package ja.burhanrashid52.photoeditor.shape;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u0004H\u0016¨\u0006\u000f"}, d2 = {"Lja/burhanrashid52/photoeditor/shape/BrushShape;", "Lja/burhanrashid52/photoeditor/shape/AbstractShape;", "()V", "draw", "", "canvas", "Landroid/graphics/Canvas;", "paint", "Landroid/graphics/Paint;", "moveShape", "x", "", "y", "startShape", "stopShape", "photoeditor_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BrushShape extends AbstractShape {
    public BrushShape() {
        super("BrushShape");
    }

    @Override // ja.burhanrashid52.photoeditor.shape.AbstractShape, ja.burhanrashid52.photoeditor.shape.Shape
    public void draw(@NotNull Canvas canvas, @NotNull Paint paint) {
        Intrinsics.echo(canvas, "canvas");
        Intrinsics.echo(paint, "paint");
        canvas.drawPath(getPath(), paint);
    }

    @Override // ja.burhanrashid52.photoeditor.shape.Shape
    public void moveShape(float x4, float y10) {
        float abs = Math.abs(x4 - getLeft());
        float abs2 = Math.abs(y10 - getTop());
        if (abs < 4.0f && abs2 < 4.0f) {
            return;
        }
        float f5 = 2;
        getPath().quadTo(getLeft(), getTop(), (getLeft() + x4) / f5, (getTop() + y10) / f5);
        setLeft(x4);
        setTop(y10);
    }

    @Override // ja.burhanrashid52.photoeditor.shape.Shape
    public void startShape(float x4, float y10) {
        Log.d(getTag(), "startShape@ " + x4 + ',' + y10);
        getPath().moveTo(x4, y10);
        setLeft(x4);
        setTop(y10);
    }

    @Override // ja.burhanrashid52.photoeditor.shape.Shape
    public void stopShape() {
        Log.d(getTag(), "stopShape");
    }
}
