package g7;

import s6.Q4;

/* loaded from: classes2.dex */
public final class e extends Q4 {
    @Override // s6.Q4
    public final void bravo(w wVar, float f5, float f10) {
        float f11 = f10 * f5;
        wVar.delta(f11, 180.0f, 90.0f);
        double d4 = f11;
        wVar.charlie((float) (Math.sin(Math.toRadians(90.0f)) * d4), (float) (Math.sin(Math.toRadians(0.0f)) * d4));
    }
}
