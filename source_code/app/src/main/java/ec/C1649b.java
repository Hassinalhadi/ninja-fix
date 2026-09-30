package ec;

import Cb.u;
import F.AbstractC0127k2;
import P.e;
import Xd.l;
import a0.C0366t;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.C0537c;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.V;
import androidx.compose.foundation.layout.b0;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.as;
import androidx.compose.runtime.ax;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: ec.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1649b implements l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ List purple;
    public final /* synthetic */ ax red;
    public final /* synthetic */ String silver;

    public /* synthetic */ C1649b(List list, ax axVar, String str, int i4) {
        this.alpha = i4;
        this.purple = list;
        this.red = axVar;
        this.silver = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        boolean z2;
        ax axVar = this.red;
        boolean z10 = false;
        Object[] objArr = 0;
        switch (this.alpha) {
            case 0:
                InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z10 = true;
                }
                C0585q c0585q = (C0585q) interfaceC0581m;
                if (c0585q.magenta(1 & intValue, z10)) {
                    FillElement fillElement = V.charlie;
                    boolean golf = c0585q.golf(axVar);
                    Object jade = c0585q.jade();
                    as asVar = C0580l.alpha;
                    if (golf || jade == asVar) {
                        jade = new u(axVar, 15);
                        c0585q.f(jade);
                    }
                    Function0 function0 = (Function0) jade;
                    boolean golf2 = c0585q.golf(axVar);
                    Object jade2 = c0585q.jade();
                    if (golf2 || jade2 == asVar) {
                        jade2 = new u(axVar, 16);
                        c0585q.f(jade2);
                    }
                    db.l.bravo(this.purple, function0, fillElement, (Function0) jade2, this.silver, c0585q, 384, 0);
                } else {
                    c0585q.ochre();
                }
                return Unit.INSTANCE;
            default:
                InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C0585q c0585q2 = (C0585q) interfaceC0581m2;
                if (c0585q2.magenta(1 & intValue2, z2)) {
                    FillElement fillElement2 = V.charlie;
                    WeakHashMap weakHashMap = b0.whiskey;
                    AbstractC0127k2.alpha(AbstractC0538d.azure(fillElement2, C0537c.foxtrot(c0585q2).kilo), null, C0366t.echo, 0L, 0.0f, 0.0f, null, e.echo(40107486, new C1649b(this.purple, axVar, this.silver, objArr == true ? 1 : 0), c0585q2), c0585q2, 12583296, 122);
                } else {
                    c0585q2.ochre();
                }
                return Unit.INSTANCE;
        }
    }
}
