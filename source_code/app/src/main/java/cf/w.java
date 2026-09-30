package cf;

import B9.K;
import Ie.aq;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import pe.AbstractC2347w;
import pe.InterfaceC2332h;
import pe.InterfaceC2349y;
import s6.AbstractC2626c6;

/* loaded from: classes2.dex */
public final class w extends Lambda implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ z purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(z zVar, int i4) {
        super(1);
        this.alpha = i4;
        this.purple = zVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.alpha) {
            case 0:
                int intValue = ((Number) obj).intValue();
                D5.s sVar = this.purple.alpha;
                Ne.b alpha = Zd.a.alpha((Ke.e) sVar.bravo, intValue);
                boolean z2 = alpha.charlie;
                K k6 = (K) sVar.alpha;
                if (z2) {
                    return k6.bravo(alpha);
                }
                return AbstractC2347w.echo((InterfaceC2349y) k6.bravo, alpha);
            case 1:
                int intValue2 = ((Number) obj).intValue();
                D5.s sVar2 = this.purple.alpha;
                Ne.b alpha2 = Zd.a.alpha((Ke.e) sVar2.bravo, intValue2);
                if (!alpha2.charlie) {
                    InterfaceC2349y interfaceC2349y = (InterfaceC2349y) ((K) sVar2.alpha).bravo;
                    Intrinsics.echo(interfaceC2349y, "<this>");
                    InterfaceC2332h echo = AbstractC2347w.echo(interfaceC2349y, alpha2);
                    if (echo instanceof ef.s) {
                        return (ef.s) echo;
                    }
                }
                return null;
            default:
                aq it = (aq) obj;
                Intrinsics.echo(it, "it");
                return AbstractC2626c6.foxtrot(it, (G6.j) this.purple.alpha.delta);
        }
    }
}
