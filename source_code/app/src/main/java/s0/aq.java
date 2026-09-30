package s0;

import java.util.Arrays;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import q0.C2398q;

/* loaded from: classes3.dex */
public final class aq implements Q0.d {
    public boolean alpha;
    public long purple = 9223372034707292159L;
    public long red = 0;
    public final /* synthetic */ at silver;

    public aq(at atVar) {
        this.silver = atVar;
    }

    @Override // Q0.d
    public final float alpha() {
        return this.silver.alpha();
    }

    @Override // Q0.d
    public final long beige(float f5) {
        return Q0.c.hotel(this, gold(f5));
    }

    public final void charlie(C2398q c2398q, float f5) {
        at atVar = this.silver;
        com.google.android.material.datepicker.c cVar = atVar.f13313f;
        if (cVar == null) {
            cVar = new com.google.android.material.datepicker.c();
            atVar.f13313f = cVar;
        }
        int jade = ArraysKt.jade((C2398q[]) cVar.bravo, c2398q);
        if (jade < 0) {
            int i4 = cVar.alpha;
            C2398q[] c2398qArr = (C2398q[]) cVar.bravo;
            if (i4 == c2398qArr.length) {
                int i5 = i4 * 2;
                Object[] copyOf = Arrays.copyOf(c2398qArr, i5);
                Intrinsics.delta(copyOf, "copyOf(...)");
                cVar.bravo = (C2398q[]) copyOf;
                float[] copyOf2 = Arrays.copyOf((float[]) cVar.charlie, i5);
                Intrinsics.delta(copyOf2, "copyOf(...)");
                cVar.charlie = copyOf2;
                byte[] copyOf3 = Arrays.copyOf((byte[]) cVar.delta, i5);
                Intrinsics.delta(copyOf3, "copyOf(...)");
                cVar.delta = copyOf3;
            }
            ((C2398q[]) cVar.bravo)[i4] = c2398q;
            ((byte[]) cVar.delta)[i4] = 3;
            ((float[]) cVar.charlie)[i4] = f5;
            cVar.alpha++;
            return;
        }
        float[] fArr = (float[]) cVar.charlie;
        if (fArr[jade] == f5) {
            byte[] bArr = (byte[]) cVar.delta;
            if (bArr[jade] == 2) {
                bArr[jade] = 0;
                return;
            }
            return;
        }
        fArr[jade] = f5;
        ((byte[]) cVar.delta)[jade] = 1;
    }

    @Override // Q0.d
    public final float crimson(int i4) {
        return i4 / alpha();
    }

    @Override // Q0.d
    public final float gold(float f5) {
        return f5 / alpha();
    }

    @Override // Q0.d
    public final float indigo() {
        return this.silver.indigo();
    }

    @Override // Q0.d
    public final float lavender(float f5) {
        return alpha() * f5;
    }

    @Override // Q0.d
    public final /* synthetic */ long mike(long j5) {
        return Q0.c.echo(j5, this);
    }

    @Override // Q0.d
    public final /* synthetic */ int ochre(float f5) {
        return Q0.c.bravo(this, f5);
    }

    @Override // Q0.d
    public final /* synthetic */ float quebec(long j5) {
        return Q0.c.delta(j5, this);
    }

    @Override // Q0.d
    public final /* synthetic */ long red(long j5) {
        return Q0.c.golf(j5, this);
    }

    @Override // Q0.d
    public final /* synthetic */ float teal(long j5) {
        return Q0.c.foxtrot(j5, this);
    }
}
