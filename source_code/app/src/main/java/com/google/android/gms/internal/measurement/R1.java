package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
public final class R1 implements X1 {
    public final O1 alpha;
    public final C1384v1 bravo;

    public R1(C1384v1 c1384v1, O1 o12) {
        C1384v1 c1384v12 = AbstractC1372s1.alpha;
        this.bravo = c1384v1;
        this.alpha = o12;
    }

    @Override // com.google.android.gms.internal.measurement.X1
    public final AbstractC1392x1 alpha() {
        O1 o12 = this.alpha;
        if (o12 instanceof AbstractC1392x1) {
            return (AbstractC1392x1) ((AbstractC1392x1) o12).mike(4);
        }
        return ((AbstractC1388w1) ((AbstractC1392x1) o12).mike(5)).foxtrot();
    }

    @Override // com.google.android.gms.internal.measurement.X1
    public final void bravo(Object obj) {
        this.bravo.getClass();
        Z1 z12 = ((AbstractC1392x1) obj).zzc;
        if (z12.echo) {
            z12.echo = false;
        }
        C1384v1 c1384v1 = AbstractC1372s1.alpha;
        throw A0.z.hotel(obj);
    }

    @Override // com.google.android.gms.internal.measurement.X1
    public final boolean charlie(Object obj) {
        throw A0.z.hotel(obj);
    }

    @Override // com.google.android.gms.internal.measurement.X1
    public final void delta(Object obj, Object obj2) {
        Y1.papa(obj, obj2);
    }

    @Override // com.google.android.gms.internal.measurement.X1
    public final void echo(Object obj, J1 j12) {
        throw A0.z.hotel(obj);
    }

    @Override // com.google.android.gms.internal.measurement.X1
    public final int foxtrot(AbstractC1392x1 abstractC1392x1) {
        Z1 z12 = abstractC1392x1.zzc;
        int i4 = z12.delta;
        if (i4 == -1) {
            int i5 = 0;
            for (int i10 = 0; i10 < z12.alpha; i10++) {
                int i11 = z12.bravo[i10] >>> 3;
                C1361p1 c1361p1 = (C1361p1) z12.charlie[i10];
                int romeo = C1365q1.romeo(8);
                int romeo2 = C1365q1.romeo(i11) + C1365q1.romeo(16);
                int romeo3 = C1365q1.romeo(24);
                int delta = c1361p1.delta();
                i5 += romeo + romeo + romeo2 + ao.ad.uniform(delta, delta, romeo3);
            }
            z12.delta = i5;
            return i5;
        }
        return i4;
    }

    @Override // com.google.android.gms.internal.measurement.X1
    public final int golf(AbstractC1392x1 abstractC1392x1) {
        return abstractC1392x1.zzc.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.X1
    public final boolean hotel(AbstractC1392x1 abstractC1392x1, AbstractC1392x1 abstractC1392x12) {
        if (!abstractC1392x1.zzc.equals(abstractC1392x12.zzc)) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.X1
    public final void india(Object obj, byte[] bArr, int i4, int i5, androidx.compose.foundation.layout.ag agVar) {
        AbstractC1392x1 abstractC1392x1 = (AbstractC1392x1) obj;
        if (abstractC1392x1.zzc == Z1.foxtrot) {
            abstractC1392x1.zzc = Z1.bravo();
        }
        throw A0.z.hotel(obj);
    }
}
