package Nf;

import ge.InterfaceC1772d;
import ge.InterfaceC1773e;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import t6.AbstractC3062u;

/* loaded from: classes2.dex */
public final class ak implements ge.w {
    public final ge.w alpha;

    public ak(ge.w origin) {
        Intrinsics.echo(origin, "origin");
        this.alpha = origin;
    }

    @Override // ge.w
    public final boolean alpha() {
        return this.alpha.alpha();
    }

    @Override // ge.w
    public final List delta() {
        return this.alpha.delta();
    }

    public final boolean equals(Object obj) {
        ak akVar;
        ge.w wVar;
        ge.w wVar2;
        if (obj == null) {
            return false;
        }
        InterfaceC1773e interfaceC1773e = null;
        if (obj instanceof ak) {
            akVar = (ak) obj;
        } else {
            akVar = null;
        }
        if (akVar != null) {
            wVar = akVar.alpha;
        } else {
            wVar = null;
        }
        ge.w wVar3 = this.alpha;
        if (!Intrinsics.areEqual(wVar3, wVar)) {
            return false;
        }
        InterfaceC1773e foxtrot = wVar3.foxtrot();
        if (foxtrot instanceof InterfaceC1772d) {
            if (obj instanceof ge.w) {
                wVar2 = (ge.w) obj;
            } else {
                wVar2 = null;
            }
            if (wVar2 != null) {
                interfaceC1773e = wVar2.foxtrot();
            }
            if (interfaceC1773e != null && (interfaceC1773e instanceof InterfaceC1772d)) {
                return Intrinsics.areEqual(AbstractC3062u.bravo((InterfaceC1772d) foxtrot), AbstractC3062u.bravo((InterfaceC1772d) interfaceC1773e));
            }
        }
        return false;
    }

    @Override // ge.w
    public final InterfaceC1773e foxtrot() {
        return this.alpha.foxtrot();
    }

    @Override // ge.InterfaceC1770b
    public final List getAnnotations() {
        return this.alpha.getAnnotations();
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }

    public final String toString() {
        return "KTypeWrapper: " + this.alpha;
    }
}
