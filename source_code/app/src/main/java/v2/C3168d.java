package v2;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* renamed from: v2.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3168d {
    public final RectF alpha = new RectF();
    public final Paint bravo;
    public final Paint charlie;
    public final Paint delta;
    public float echo;
    public float foxtrot;
    public float golf;
    public float hotel;
    public int[] india;
    public int juliet;
    public float kilo;
    public float lima;
    public float mike;
    public boolean november;
    public Path oscar;
    public float papa;
    public float quebec;
    public int romeo;
    public int sierra;
    public int tango;
    public int uniform;

    public C3168d() {
        Paint paint = new Paint();
        this.bravo = paint;
        Paint paint2 = new Paint();
        this.charlie = paint2;
        Paint paint3 = new Paint();
        this.delta = paint3;
        this.echo = 0.0f;
        this.foxtrot = 0.0f;
        this.golf = 0.0f;
        this.hotel = 5.0f;
        this.papa = 1.0f;
        this.tango = 255;
        paint.setStrokeCap(Paint.Cap.SQUARE);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        paint3.setColor(0);
    }

    public final void alpha(int i4) {
        this.juliet = i4;
        this.uniform = this.india[i4];
    }
}
