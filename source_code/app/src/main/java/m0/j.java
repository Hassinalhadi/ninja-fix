package m0;

import com.google.android.gms.internal.measurement.C1290a1;

/* loaded from: classes3.dex */
public class j {
    public final J.e alpha = new J.e(new i[16]);
    public final bv.ah bravo = new bv.ah(10);

    public boolean alpha(bv.u uVar, q0.z zVar, C1290a1 c1290a1, boolean z2) {
        J.e eVar = this.alpha;
        Object[] objArr = eVar.alpha;
        int i4 = eVar.red;
        boolean z10 = false;
        for (int i5 = 0; i5 < i4; i5++) {
            if (!((i) objArr[i5]).alpha(uVar, zVar, c1290a1, z2) && !z10) {
                z10 = false;
            } else {
                z10 = true;
            }
        }
        return z10;
    }

    public void bravo(C1290a1 c1290a1) {
        J.e eVar = this.alpha;
        int i4 = eVar.red;
        while (true) {
            i4--;
            if (-1 < i4) {
                if (((i) eVar.alpha[i4]).delta.purple == 0) {
                    eVar.mike(i4);
                }
            } else {
                return;
            }
        }
    }
}
