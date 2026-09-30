package ja.burhanrashid52.photoeditor.shape;

import android.graphics.Path;
import android.graphics.RectF;
import android.util.Log;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u00020\u0007H\u0002J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0016J\u0018\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\tH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lja/burhanrashid52/photoeditor/shape/OvalShape;", "Lja/burhanrashid52/photoeditor/shape/AbstractShape;", "()V", "lastX", "", "lastY", "createOvalPath", "Landroid/graphics/Path;", "moveShape", "", "x", "y", "startShape", "stopShape", "photoeditor_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OvalShape extends AbstractShape {
    private float lastX;
    private float lastY;

    public OvalShape() {
        super("OvalShape");
    }

    private final Path createOvalPath() {
        RectF rectF = new RectF(getLeft(), getTop(), getRight(), getBottom());
        Path path = new Path();
        path.moveTo(getLeft(), getTop());
        path.addOval(rectF, Path.Direction.CW);
        path.close();
        return path;
    }

    @Override // ja.burhanrashid52.photoeditor.shape.Shape
    public void moveShape(float x4, float y10) {
        setRight(x4);
        setBottom(y10);
        float abs = Math.abs(x4 - this.lastX);
        float abs2 = Math.abs(y10 - this.lastY);
        if (abs < 4.0f && abs2 < 4.0f) {
            return;
        }
        setPath(createOvalPath());
        this.lastX = x4;
        this.lastY = y10;
    }

    @Override // ja.burhanrashid52.photoeditor.shape.Shape
    public void startShape(float x4, float y10) {
        Log.d(getTag(), "startShape@ " + x4 + ',' + y10);
        setLeft(x4);
        setTop(y10);
    }

    @Override // ja.burhanrashid52.photoeditor.shape.Shape
    public void stopShape() {
        Log.d(getTag(), "stopShape");
    }
}
