package b0;

import a0.C0366t;
import a0.ao;

/* loaded from: classes3.dex */
public final class f extends g {
    public final q echo;
    public final q foxtrot;
    public final float[] golf;

    public f(q qVar, q qVar2) {
        super(qVar2, qVar, qVar2, null);
        float[] golf;
        this.echo = qVar;
        this.foxtrot = qVar2;
        s sVar = qVar2.delta;
        s sVar2 = qVar.delta;
        boolean delta = j.delta(sVar2, sVar);
        float[] fArr = qVar.india;
        float[] fArr2 = qVar2.juliet;
        if (delta) {
            golf = j.golf(fArr2, fArr);
        } else {
            float[] alpha = sVar2.alpha();
            s sVar3 = qVar2.delta;
            float[] alpha2 = sVar3.alpha();
            s sVar4 = j.bravo;
            boolean delta2 = j.delta(sVar2, sVar4);
            float[] fArr3 = C0711a.bravo.alpha;
            golf = j.golf(j.delta(sVar3, sVar4) ? fArr2 : j.foxtrot(j.golf(j.charlie(fArr3, alpha2, new float[]{0.964212f, 1.0f, 0.825188f}), qVar2.india)), delta2 ? fArr : j.golf(j.charlie(fArr3, alpha, new float[]{0.964212f, 1.0f, 0.825188f}), fArr));
        }
        this.golf = golf;
    }

    @Override // b0.g
    public final long alpha(long j5) {
        float hotel = C0366t.hotel(j5);
        float golf = C0366t.golf(j5);
        float echo = C0366t.echo(j5);
        float delta = C0366t.delta(j5);
        m mVar = this.echo.papa;
        float delta2 = (float) mVar.delta(hotel);
        float delta3 = (float) mVar.delta(golf);
        float delta4 = (float) mVar.delta(echo);
        float[] fArr = this.golf;
        float f5 = (fArr[6] * delta4) + (fArr[3] * delta3) + (fArr[0] * delta2);
        float f10 = (fArr[7] * delta4) + (fArr[4] * delta3) + (fArr[1] * delta2);
        float f11 = (fArr[8] * delta4) + (fArr[5] * delta3) + (fArr[2] * delta2);
        q qVar = this.foxtrot;
        float delta5 = (float) qVar.mike.delta(f5);
        double d4 = f10;
        m mVar2 = qVar.mike;
        return ao.bravo(delta5, (float) mVar2.delta(d4), (float) mVar2.delta(f11), delta, qVar);
    }
}
