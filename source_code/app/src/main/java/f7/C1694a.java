package f7;

import android.graphics.Paint;
import android.graphics.Path;
import j1.AbstractC1928b;
import ja.burhanrashid52.photoeditor.shape.ShapeBuilder;

/* renamed from: f7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1694a {
    public static final int[] india = new int[3];
    public static final float[] juliet = {0.0f, 0.5f, 1.0f};
    public static final int[] kilo = new int[4];
    public static final float[] lima = {0.0f, 0.0f, 0.5f, 1.0f};
    public final Paint alpha;
    public final Paint bravo;
    public final Paint charlie;
    public int delta;
    public int echo;
    public int foxtrot;
    public final Path golf = new Path();
    public final Paint hotel;

    public C1694a() {
        Paint paint = new Paint();
        this.hotel = paint;
        this.alpha = new Paint();
        alpha(ShapeBuilder.DEFAULT_SHAPE_COLOR);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.bravo = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.charlie = new Paint(paint2);
    }

    public final void alpha(int i4) {
        this.delta = AbstractC1928b.delta(i4, 68);
        this.echo = AbstractC1928b.delta(i4, 20);
        this.foxtrot = AbstractC1928b.delta(i4, 0);
        this.alpha.setColor(this.delta);
    }
}
