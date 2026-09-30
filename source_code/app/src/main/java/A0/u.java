package A0;

import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import bv.ah;
import kotlin.jvm.internal.Intrinsics;
import s0.al;
import t0.C2946x;

/* loaded from: classes3.dex */
public final class u {
    public final al alpha;
    public final d bravo;
    public final bv.aa charlie;
    public final ah delta = new ah(2);

    public u(al alVar, d dVar, bv.aa aaVar) {
        this.alpha = alVar;
        this.bravo = dVar;
        this.charlie = aaVar;
    }

    public final s alpha() {
        return new s(this.bravo, false, this.alpha, new k());
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0081, code lost:
    
        if (r5.alpha.bravo(A0.x.quebec) == true) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0092 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bravo(al alVar, k kVar) {
        String str;
        boolean z2;
        AutofillValue forText;
        D0.g gVar;
        D0.g gVar2;
        ah ahVar = this.delta;
        Object[] objArr = ahVar.alpha;
        int i4 = ahVar.bravo;
        for (int i5 = 0; i5 < i4; i5++) {
            U.c cVar = (U.c) objArr[i5];
            cVar.getClass();
            k xray = alVar.xray();
            int i10 = alVar.purple;
            String str2 = null;
            if (kVar != null && (gVar2 = (D0.g) v.delta(kVar, x.black)) != null) {
                str = gVar2.purple;
            } else {
                str = null;
            }
            if (xray != null && (gVar = (D0.g) v.delta(xray, x.black)) != null) {
                str2 = gVar.purple;
            }
            boolean z10 = true;
            if (str != str2) {
                C2946x c2946x = cVar.charlie;
                O7.j jVar = cVar.alpha;
                if (str == null) {
                    jVar.hotel(c2946x, i10, true);
                } else if (str2 == null) {
                    jVar.hotel(c2946x, i10, false);
                } else if (Intrinsics.areEqual((U.d) v.delta(xray, x.romeo), U.l.alpha)) {
                    forText = AutofillValue.forText(str2.toString());
                    ((AutofillManager) jVar.purple).notifyValueChanged(c2946x, i10, forText);
                }
            }
            if (kVar != null) {
                if (kVar.alpha.bravo(x.quebec)) {
                    z2 = true;
                    if (xray != null) {
                    }
                    z10 = false;
                    if (z2 == z10) {
                        bv.ab abVar = cVar.hotel;
                        if (z10) {
                            abVar.alpha(i10);
                        } else {
                            abVar.echo(i10);
                        }
                    }
                }
            }
            z2 = false;
            if (xray != null) {
            }
            z10 = false;
            if (z2 == z10) {
            }
        }
    }
}
