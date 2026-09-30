package kb;

import Xd.l;
import Xd.n;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import cb.C0837b;
import i.InterfaceC1854c;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import s6.AbstractC2608a6;

/* renamed from: kb.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2029e extends Lambda implements n {
    public final /* synthetic */ List alpha;
    public final /* synthetic */ boolean purple;
    public final /* synthetic */ l red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2029e(List list, boolean z2, l lVar) {
        super(4);
        this.alpha = list;
        this.purple = z2;
        this.red = lVar;
    }

    @Override // Xd.n
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i4;
        Function0 function0;
        l lVar;
        int i5;
        int i10;
        InterfaceC1854c interfaceC1854c = (InterfaceC1854c) obj;
        int intValue = ((Number) obj2).intValue();
        InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            if (((C0585q) interfaceC0581m).golf(interfaceC1854c)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i4 = i10 | intValue2;
        } else {
            i4 = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            if (((C0585q) interfaceC0581m).echo(intValue)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i4 |= i5;
        }
        if ((i4 & 147) == 146) {
            C0585q c0585q = (C0585q) interfaceC0581m;
            if (c0585q.bronze()) {
                c0585q.ochre();
                return Unit.INSTANCE;
            }
        }
        C0837b c0837b = (C0837b) this.alpha.get(intValue);
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.purple(-1452059017);
        String str = c0837b.alpha;
        String str2 = c0837b.bravo;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = str2;
        boolean z2 = this.purple;
        if (z2 && c0837b.echo != null && (lVar = this.red) != null) {
            c0585q2.purple(-1451557531);
            boolean golf = c0585q2.golf(lVar) | c0585q2.golf(c0837b);
            Object jade = c0585q2.jade();
            if (golf || jade == C0580l.alpha) {
                jade = new Ic.c(lVar, c0837b, 3);
                c0585q2.f(jade);
            }
            function0 = (Function0) jade;
            c0585q2.quebec(false);
        } else {
            c0585q2.purple(-1451442863);
            c0585q2.quebec(false);
            function0 = null;
        }
        AbstractC2608a6.alpha(str, str3, null, c0837b.charlie, c0837b.delta, z2, function0, c0585q2, 12582912, 4);
        c0585q2.quebec(false);
        return Unit.INSTANCE;
    }
}
