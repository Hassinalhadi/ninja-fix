package b0;

import a0.C0366t;

/* loaded from: classes3.dex */
public class g {
    public final AbstractC0713c alpha;
    public final AbstractC0713c bravo;
    public final AbstractC0713c charlie;
    public final float[] delta;

    public g(AbstractC0713c abstractC0713c, AbstractC0713c abstractC0713c2, AbstractC0713c abstractC0713c3, float[] fArr) {
        this.alpha = abstractC0713c;
        this.bravo = abstractC0713c2;
        this.charlie = abstractC0713c3;
        this.delta = fArr;
    }

    public long alpha(long j5) {
        float hotel = C0366t.hotel(j5);
        float golf = C0366t.golf(j5);
        float echo = C0366t.echo(j5);
        float delta = C0366t.delta(j5);
        AbstractC0713c abstractC0713c = this.bravo;
        long delta2 = abstractC0713c.delta(hotel, golf, echo);
        float intBitsToFloat = Float.intBitsToFloat((int) (delta2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (delta2 & 4294967295L));
        float echo2 = abstractC0713c.echo(hotel, golf, echo);
        float[] fArr = this.delta;
        if (fArr != null) {
            intBitsToFloat *= fArr[0];
            intBitsToFloat2 *= fArr[1];
            echo2 *= fArr[2];
        }
        float f5 = intBitsToFloat;
        float f10 = intBitsToFloat2;
        return this.charlie.foxtrot(f5, f10, echo2, delta, this.alpha);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g(AbstractC0713c abstractC0713c, AbstractC0713c abstractC0713c2, int i4) {
        this(abstractC0713c2, r4, r5, r3);
        float[] fArr;
        long j5 = abstractC0713c.bravo;
        long j6 = AbstractC0712b.alpha;
        AbstractC0713c alpha = AbstractC0712b.alpha(j5, j6) ? j.alpha(abstractC0713c) : abstractC0713c;
        AbstractC0713c alpha2 = AbstractC0712b.alpha(abstractC0713c2.bravo, j6) ? j.alpha(abstractC0713c2) : abstractC0713c2;
        if (i4 == 3) {
            boolean alpha3 = AbstractC0712b.alpha(abstractC0713c.bravo, j6);
            boolean alpha4 = AbstractC0712b.alpha(abstractC0713c2.bravo, j6);
            if ((!alpha3 || !alpha4) && (alpha3 || alpha4)) {
                abstractC0713c = alpha3 ? abstractC0713c : abstractC0713c2;
                float[] fArr2 = j.echo;
                s sVar = ((q) abstractC0713c).delta;
                float[] alpha5 = alpha3 ? sVar.alpha() : fArr2;
                fArr2 = alpha4 ? sVar.alpha() : fArr2;
                fArr = new float[]{alpha5[0] / fArr2[0], alpha5[1] / fArr2[1], alpha5[2] / fArr2[2]};
            }
        }
        fArr = null;
    }
}
