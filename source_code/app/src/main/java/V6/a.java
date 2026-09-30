package V6;

import android.content.Context;
import android.graphics.Color;
import delivery.samurai.android.R;
import j1.AbstractC1928b;
import s6.AbstractC2710m0;
import s6.AbstractC2815x7;

/* loaded from: classes2.dex */
public final class a {
    public static final int foxtrot = (int) Math.round(5.1000000000000005d);
    public final boolean alpha;
    public final int bravo;
    public final int charlie;
    public final int delta;
    public final float echo;

    public a(Context context) {
        boolean charlie = AbstractC2710m0.charlie(context, R.attr.elevationOverlayEnabled, false);
        int delta = AbstractC2815x7.delta(context, R.attr.elevationOverlayColor, 0);
        int delta2 = AbstractC2815x7.delta(context, R.attr.elevationOverlayAccentColor, 0);
        int delta3 = AbstractC2815x7.delta(context, R.attr.colorSurface, 0);
        float f5 = context.getResources().getDisplayMetrics().density;
        this.alpha = charlie;
        this.bravo = delta;
        this.charlie = delta2;
        this.delta = delta3;
        this.echo = f5;
    }

    public final int alpha(float f5, int i4) {
        float f10;
        int i5;
        if (this.alpha && AbstractC1928b.delta(i4, 255) == this.delta) {
            if (this.echo > 0.0f && f5 > 0.0f) {
                f10 = Math.min(((((float) Math.log1p(f5 / r1)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
            } else {
                f10 = 0.0f;
            }
            int alpha = Color.alpha(i4);
            int golf = AbstractC2815x7.golf(f10, AbstractC1928b.delta(i4, 255), this.bravo);
            if (f10 > 0.0f && (i5 = this.charlie) != 0) {
                golf = AbstractC1928b.bravo(AbstractC1928b.delta(i5, foxtrot), golf);
            }
            return AbstractC1928b.delta(golf, alpha);
        }
        return i4;
    }
}
