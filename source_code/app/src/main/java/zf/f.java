package zf;

import androidx.appcompat.widget.P0;
import com.airbnb.lottie.compose.LottieConstants;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import t6.AbstractC3017k3;
import vf.AbstractC3218w;
import xf.EnumC3340a;
import yf.InterfaceC3439i;
import yf.InterfaceC3440j;

/* loaded from: classes2.dex */
public abstract class f implements v {
    public final Nd.h alpha;
    public final int purple;
    public final EnumC3340a red;

    public f(Nd.h hVar, int i4, EnumC3340a enumC3340a) {
        this.alpha = hVar;
        this.purple = i4;
        this.red = enumC3340a;
    }

    @Override // zf.v
    public final InterfaceC3439i bravo(Nd.h hVar, int i4, EnumC3340a enumC3340a) {
        Nd.h hVar2 = this.alpha;
        Nd.h plus = hVar.plus(hVar2);
        EnumC3340a enumC3340a2 = EnumC3340a.alpha;
        EnumC3340a enumC3340a3 = this.red;
        int i5 = this.purple;
        if (enumC3340a == enumC3340a2) {
            if (i5 != -3) {
                if (i4 != -3) {
                    if (i5 != -2) {
                        if (i4 != -2) {
                            i4 += i5;
                            if (i4 < 0) {
                                i4 = LottieConstants.IterateForever;
                            }
                        }
                    }
                }
                i4 = i5;
            }
            enumC3340a = enumC3340a3;
        }
        if (Intrinsics.areEqual(plus, hVar2) && i4 == i5 && enumC3340a == enumC3340a3) {
            return this;
        }
        return echo(plus, i4, enumC3340a);
    }

    public String charlie() {
        return null;
    }

    @Override // yf.InterfaceC3439i
    public Object collect(InterfaceC3440j interfaceC3440j, Nd.c cVar) {
        Object mike = vf.ad.mike(new d(interfaceC3440j, this, null), cVar);
        if (mike == Od.a.alpha) {
            return mike;
        }
        return Unit.INSTANCE;
    }

    public abstract Object delta(xf.r rVar, Nd.c cVar);

    public abstract f echo(Nd.h hVar, int i4, EnumC3340a enumC3340a);

    public InterfaceC3439i foxtrot() {
        return null;
    }

    public xf.t golf(vf.ab abVar) {
        int i4 = this.purple;
        if (i4 == -3) {
            i4 = -2;
        }
        vf.ac acVar = vf.ac.red;
        Xd.l eVar = new e(this, null);
        xf.q qVar = new xf.q(AbstractC3218w.bravo(abVar, this.alpha), AbstractC3017k3.bravo(i4, 4, this.red), true, true);
        qVar.b(acVar, qVar, eVar);
        return qVar;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String charlie = charlie();
        if (charlie != null) {
            arrayList.add(charlie);
        }
        Nd.i iVar = Nd.i.alpha;
        Nd.h hVar = this.alpha;
        if (hVar != iVar) {
            arrayList.add("context=" + hVar);
        }
        int i4 = this.purple;
        if (i4 != -3) {
            arrayList.add("capacity=" + i4);
        }
        EnumC3340a enumC3340a = EnumC3340a.alpha;
        EnumC3340a enumC3340a2 = this.red;
        if (enumC3340a2 != enumC3340a) {
            arrayList.add("onBufferOverflow=" + enumC3340a2);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append('[');
        return P0.fuchsia(sb2, CollectionsKt.maroon(arrayList, ", ", null, null, null, 62), ']');
    }
}
