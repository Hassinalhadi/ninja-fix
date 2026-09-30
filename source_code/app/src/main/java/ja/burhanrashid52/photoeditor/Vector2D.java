package ja.burhanrashid52.photoeditor;

import android.graphics.PointF;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0002¨\u0006\n"}, d2 = {"Lja/burhanrashid52/photoeditor/Vector2D;", "Landroid/graphics/PointF;", "()V", "x", "", "y", "(FF)V", "normalize", "", "Companion", "photoeditor_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Vector2D extends PointF {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\b"}, d2 = {"Lja/burhanrashid52/photoeditor/Vector2D$Companion;", "", "()V", "getAngle", "", "vector1", "Lja/burhanrashid52/photoeditor/Vector2D;", "vector2", "photoeditor_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final float getAngle(@NotNull Vector2D vector1, @NotNull Vector2D vector2) {
            Intrinsics.echo(vector1, "vector1");
            Intrinsics.echo(vector2, "vector2");
            vector1.normalize();
            vector2.normalize();
            return (float) ((Math.atan2(((PointF) vector2).y, ((PointF) vector2).x) - Math.atan2(((PointF) vector1).y, ((PointF) vector1).x)) * 57.29577951308232d);
        }

        private Companion() {
        }
    }

    public Vector2D() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void normalize() {
        float f5 = ((PointF) this).x;
        float f10 = ((PointF) this).y;
        float sqrt = (float) Math.sqrt((f10 * f10) + (f5 * f5));
        ((PointF) this).x /= sqrt;
        ((PointF) this).y /= sqrt;
    }

    public Vector2D(float f5, float f10) {
        super(f5, f10);
    }
}
