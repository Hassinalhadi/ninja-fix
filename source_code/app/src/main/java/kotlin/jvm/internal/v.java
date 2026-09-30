package kotlin.jvm.internal;

import androidx.compose.material3.internal.ak;
import ge.InterfaceC1772d;
import ge.InterfaceC1773e;
import ge.InterfaceC1774f;
import ge.InterfaceC1775g;
import ge.InterfaceC1778j;
import ge.InterfaceC1780l;
import java.util.List;

/* loaded from: classes2.dex */
public class v {
    public InterfaceC1775g alpha(h hVar) {
        return hVar;
    }

    public InterfaceC1772d bravo(Class cls) {
        return new e(cls);
    }

    public InterfaceC1774f charlie(Class cls, String str) {
        return new n(cls, str);
    }

    public ge.w delta(ge.w wVar) {
        aa aaVar = (aa) wVar;
        InterfaceC1773e foxtrot = wVar.foxtrot();
        List delta = wVar.delta();
        aaVar.getClass();
        return new aa(foxtrot, delta, aaVar.red | 2);
    }

    public InterfaceC1778j echo(ak akVar) {
        return akVar;
    }

    public InterfaceC1780l foxtrot(l lVar) {
        return lVar;
    }

    public ge.s golf(Af.i iVar) {
        return iVar;
    }

    public ge.u hotel(o oVar) {
        return oVar;
    }

    public String india(g gVar) {
        String obj = gVar.getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            return obj.substring(21);
        }
        return obj;
    }

    public String juliet(Lambda lambda) {
        return india(lambda);
    }

    public void kilo(ge.x xVar, List upperBounds) {
        y yVar = (y) xVar;
        yVar.getClass();
        Intrinsics.echo(upperBounds, "upperBounds");
        if (yVar.purple == null) {
            yVar.purple = upperBounds;
            return;
        }
        throw new IllegalStateException(("Upper bounds of type parameter '" + yVar + "' have already been initialized.").toString());
    }

    public ge.w lima(InterfaceC1773e classifier, List arguments, boolean z2) {
        Intrinsics.echo(classifier, "classifier");
        Intrinsics.echo(arguments, "arguments");
        return new aa(classifier, arguments, z2 ? 1 : 0);
    }

    public ge.x mike(InterfaceC1772d interfaceC1772d) {
        ge.aa aaVar = ge.aa.alpha;
        return new y(interfaceC1772d);
    }
}
