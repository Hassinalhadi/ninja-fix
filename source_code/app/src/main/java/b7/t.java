package b7;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;

/* loaded from: classes2.dex */
public abstract class t {
    public final AbstractC0723e alpha;
    public final Path bravo;
    public final Path charlie;
    public final PathMeasure delta;
    public final Matrix echo;

    public t(AbstractC0723e abstractC0723e) {
        Path path = new Path();
        this.bravo = path;
        this.charlie = new Path();
        this.delta = new PathMeasure(path, false);
        this.alpha = abstractC0723e;
        this.echo = new Matrix();
    }

    public static float hotel(float[] fArr) {
        return (float) Math.toDegrees(Math.atan2(fArr[1], fArr[0]));
    }

    public abstract void alpha(Canvas canvas, Rect rect, float f5, boolean z2, boolean z10);

    public abstract void bravo(Canvas canvas, Paint paint, int i4, int i5);

    public abstract void charlie(Canvas canvas, Paint paint, r rVar, int i4);

    public abstract void delta(Canvas canvas, Paint paint, float f5, float f10, int i4, int i5, int i10);

    public abstract int echo();

    public abstract int foxtrot();

    public abstract void golf();
}
