package ja.burhanrashid52.photoeditor.shape;

import android.content.Context;
import android.graphics.Path;
import android.util.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\fH\u0002J0\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\bH\u0002J\u0018\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\bH\u0016J\u0018\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\bH\u0016J\b\u0010\u0018\u001a\u00020\u000eH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lja/burhanrashid52/photoeditor/shape/LineShape;", "Lja/burhanrashid52/photoeditor/shape/AbstractShape;", "context", "Landroid/content/Context;", "pointerLocation", "Lja/burhanrashid52/photoeditor/shape/ArrowPointerLocation;", "(Landroid/content/Context;Lja/burhanrashid52/photoeditor/shape/ArrowPointerLocation;)V", "lastX", "", "lastY", "maxArrowRadius", "createLinePath", "Landroid/graphics/Path;", "drawArrow", "", "path", "fromX", "fromY", "toX", "toY", "moveShape", "x", "y", "startShape", "stopShape", "Companion", "photoeditor_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LineShape extends AbstractShape {

    @Deprecated
    public static final float ANGLE_RAD = 0.5235988f;

    @Deprecated
    public static final double ARROW_ANGLE = 30.0d;

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final float MAX_ARROW_RADIUS_DP = 32.0f;
    private float lastX;
    private float lastY;
    private final float maxArrowRadius;

    @Nullable
    private final ArrowPointerLocation pointerLocation;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lja/burhanrashid52/photoeditor/shape/LineShape$Companion;", "", "()V", "ANGLE_RAD", "", "ARROW_ANGLE", "", "MAX_ARROW_RADIUS_DP", "convertDpsToPixels", "", "context", "Landroid/content/Context;", "sizeDp", "photoeditor_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int convertDpsToPixels(@NotNull Context context, float sizeDp) {
            Intrinsics.echo(context, "context");
            return (int) ((sizeDp * context.getResources().getDisplayMetrics().density) + 0.5f);
        }

        private Companion() {
        }
    }

    public /* synthetic */ LineShape(Context context, ArrowPointerLocation arrowPointerLocation, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i4 & 2) != 0 ? null : arrowPointerLocation);
    }

    private final Path createLinePath() {
        LineShape lineShape;
        Path path = new Path();
        ArrowPointerLocation arrowPointerLocation = this.pointerLocation;
        ArrowPointerLocation arrowPointerLocation2 = ArrowPointerLocation.BOTH;
        if (arrowPointerLocation != arrowPointerLocation2 && arrowPointerLocation != ArrowPointerLocation.START) {
            lineShape = this;
        } else {
            lineShape = this;
            lineShape.drawArrow(path, getRight(), getBottom(), getLeft(), getTop());
        }
        ArrowPointerLocation arrowPointerLocation3 = lineShape.pointerLocation;
        if (arrowPointerLocation3 == arrowPointerLocation2 || arrowPointerLocation3 == ArrowPointerLocation.END) {
            lineShape.drawArrow(path, getLeft(), getTop(), getRight(), getBottom());
        }
        path.moveTo(getLeft(), getTop());
        path.lineTo(getRight(), getBottom());
        path.close();
        return path;
    }

    private final void drawArrow(Path path, float fromX, float fromY, float toX, float toY) {
        double d4 = toY - fromY;
        double d9 = toX - fromX;
        float atan2 = (float) Math.atan2(d4, d9);
        float hypot = ((float) Math.hypot(d9, d4)) / 2.5f;
        float f5 = this.maxArrowRadius;
        if (hypot > f5) {
            hypot = f5;
        }
        path.moveTo(toX, toY);
        double d10 = atan2 - 0.5235988f;
        path.lineTo(toX - (((float) Math.cos(d10)) * hypot), toY - (((float) Math.sin(d10)) * hypot));
        path.moveTo(toX, toY);
        double d11 = atan2 + 0.5235988f;
        path.lineTo(toX - (((float) Math.cos(d11)) * hypot), toY - (hypot * ((float) Math.sin(d11))));
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
        setPath(createLinePath());
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LineShape(@NotNull Context context, @Nullable ArrowPointerLocation arrowPointerLocation) {
        super("LineShape");
        Intrinsics.echo(context, "context");
        this.pointerLocation = arrowPointerLocation;
        this.maxArrowRadius = Companion.convertDpsToPixels(context, 32.0f);
    }
}
