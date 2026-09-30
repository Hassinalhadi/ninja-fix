package g7;

import s6.Q4;

/* loaded from: classes2.dex */
public final class k extends Q4 {
    @Override // s6.Q4
    public final void bravo(w wVar, float f5, float f10) {
        float f11 = f10 * f5;
        wVar.delta(f11, 180.0f, 90.0f);
        float f12 = f11 * 2.0f;
        s sVar = new s(0.0f, 0.0f, f12, f12);
        sVar.foxtrot = 180.0f;
        sVar.golf = 90.0f;
        wVar.foxtrot.add(sVar);
        q qVar = new q(sVar);
        wVar.alpha(180.0f);
        wVar.golf.add(qVar);
        wVar.delta = 270.0f;
        float f13 = (0.0f + f12) * 0.5f;
        float f14 = (f12 - 0.0f) / 2.0f;
        double d4 = 270.0f;
        wVar.bravo = (((float) Math.cos(Math.toRadians(d4))) * f14) + f13;
        wVar.charlie = (f14 * ((float) Math.sin(Math.toRadians(d4)))) + f13;
    }
}
