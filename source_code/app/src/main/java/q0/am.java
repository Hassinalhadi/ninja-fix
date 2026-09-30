package q0;

import kotlin.collections.ArraysKt;
import t0.C2946x;

/* loaded from: classes3.dex */
public final class am extends AbstractC2366B {
    public final /* synthetic */ int purple;
    public final Object red;

    public /* synthetic */ am(int i4, Object obj) {
        this.purple = i4;
        this.red = obj;
    }

    @Override // Q0.d
    public final float alpha() {
        switch (this.purple) {
            case 0:
                return ((s0.at) this.red).alpha();
            default:
                return ((C2946x) this.red).getDensity().alpha();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Xd.l, kotlin.jvm.internal.Lambda] */
    @Override // q0.AbstractC2366B
    public float delta(C2398q c2398q) {
        float f5;
        float intBitsToFloat;
        int jade;
        switch (this.purple) {
            case 0:
                ?? r02 = c2398q.alpha;
                if (r02 != 0) {
                    return ((Number) r02.invoke(this, Float.valueOf(Float.NaN))).floatValue();
                }
                s0.at atVar = (s0.at) this.red;
                if (atVar.f13312d) {
                    return Float.NaN;
                }
                s0.at atVar2 = atVar;
                while (true) {
                    com.google.android.material.datepicker.c cVar = atVar2.f13313f;
                    if (cVar != null && (jade = ArraysKt.jade((C2398q[]) cVar.bravo, c2398q)) >= 0) {
                        f5 = ((float[]) cVar.charlie)[jade];
                    } else {
                        f5 = Float.NaN;
                    }
                    if (!Float.isNaN(f5)) {
                        atVar2.b(atVar.plum(), c2398q);
                        z g2 = atVar2.g();
                        z g5 = atVar.g();
                        switch (c2398q.bravo) {
                            case 0:
                                intBitsToFloat = Float.intBitsToFloat((int) (g5.oscar(g2, (Float.floatToRawIntBits(f5) & 4294967295L) | (Float.floatToRawIntBits(((int) (g2.kilo() >> 32)) / 2.0f) << 32)) & 4294967295L));
                                break;
                            default:
                                intBitsToFloat = Float.intBitsToFloat((int) (g5.oscar(g2, (Float.floatToRawIntBits(f5) << 32) | (Float.floatToRawIntBits(((int) (g2.kilo() & 4294967295L)) / 2.0f) & 4294967295L)) >> 32));
                                break;
                        }
                        return intBitsToFloat;
                    }
                    s0.at j5 = atVar2.j();
                    if (j5 == null) {
                        atVar2.b(atVar.plum(), c2398q);
                        return Float.NaN;
                    }
                    atVar2 = j5;
                }
                break;
            default:
                return super.delta(c2398q);
        }
    }

    @Override // q0.AbstractC2366B
    public final Q0.n foxtrot() {
        switch (this.purple) {
            case 0:
                return ((s0.at) this.red).getLayoutDirection();
            default:
                return ((C2946x) this.red).getLayoutDirection();
        }
    }

    @Override // q0.AbstractC2366B
    public final int golf() {
        switch (this.purple) {
            case 0:
                return ((s0.at) this.red).navy();
            default:
                return ((C2946x) this.red).getRoot().f13306y.papa.alpha;
        }
    }

    @Override // Q0.d
    public final float indigo() {
        switch (this.purple) {
            case 0:
                return ((s0.at) this.red).indigo();
            default:
                return ((C2946x) this.red).getDensity().indigo();
        }
    }
}
