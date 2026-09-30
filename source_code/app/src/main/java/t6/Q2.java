package t6;

import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.C0537c;
import androidx.compose.foundation.layout.C0540f;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m.AbstractC2094g;
import m.C2093f;
import s6.AbstractC2616b5;

/* loaded from: classes2.dex */
public abstract class Q2 {
    public static final void alpha(List imagePaths, T.s sVar, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        Intrinsics.echo(imagePaths, "imagePaths");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1026870195);
        if (c0585q.india(imagePaths)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i10 = i5 | i4 | 384;
        if ((i10 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i10 & 1, z2)) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : imagePaths) {
                String str = (String) obj;
                if (kotlin.text.r.quebec(str, "http://", true) || kotlin.text.r.quebec(str, "https://", true) || new File(str).exists()) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                androidx.compose.runtime.Q uniform = c0585q.uniform();
                if (uniform != null) {
                    uniform.delta = new Sb.a(imagePaths, sVar, i4, 1);
                    return;
                }
                return;
            }
            C2093f bravo = AbstractC2094g.bravo(ob.n.bravo);
            T.s charlie = androidx.compose.foundation.layout.V.charlie(sVar, 1.0f);
            C0537c c0537c = AbstractC0542h.alpha;
            C0540f golf = AbstractC0542h.golf(ob.n.charlie);
            boolean india = c0585q.india(arrayList) | c0585q.golf(bravo);
            Object jade = c0585q.jade();
            if (india || jade == C0580l.alpha) {
                jade = new Cb.ad(arrayList, bravo);
                c0585q.f(jade);
            }
            AbstractC2616b5.delta(charlie, null, null, golf, null, null, false, (Function1) jade, c0585q, 24576, 238);
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform2 = c0585q.uniform();
        if (uniform2 != null) {
            uniform2.delta = new Sb.a(imagePaths, sVar, i4, 2);
        }
    }

    public static final String bravo(float f5) {
        return String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(f5)}, 1));
    }
}
