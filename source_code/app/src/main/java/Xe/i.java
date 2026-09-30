package Xe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pe.InterfaceC2330f;
import pe.InterfaceC2332h;
import pe.InterfaceC2333i;
import xe.EnumC3339b;

/* loaded from: classes2.dex */
public final class i extends o {
    public final n bravo;

    public i(n workerScope) {
        Intrinsics.echo(workerScope, "workerScope");
        this.bravo = workerScope;
    }

    @Override // Xe.o, Xe.p
    public final Collection alpha(f kindFilter, Function1 nameFilter) {
        f fVar;
        Intrinsics.echo(kindFilter, "kindFilter");
        Intrinsics.echo(nameFilter, "nameFilter");
        int i4 = f.lima & kindFilter.bravo;
        if (i4 == 0) {
            fVar = null;
        } else {
            fVar = new f(i4, kindFilter.alpha);
        }
        if (fVar == null) {
            return CollectionsKt.emptyList();
        }
        Collection alpha = this.bravo.alpha(fVar, nameFilter);
        ArrayList arrayList = new ArrayList();
        for (Object obj : alpha) {
            if (obj instanceof InterfaceC2333i) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // Xe.o, Xe.n
    public final Set bravo() {
        return this.bravo.bravo();
    }

    @Override // Xe.o, Xe.n
    public final Set delta() {
        return this.bravo.delta();
    }

    @Override // Xe.o, Xe.n
    public final Set echo() {
        return this.bravo.echo();
    }

    @Override // Xe.o, Xe.p
    public final InterfaceC2332h golf(Ne.f name, EnumC3339b location) {
        InterfaceC2330f interfaceC2330f;
        Intrinsics.echo(name, "name");
        Intrinsics.echo(location, "location");
        InterfaceC2332h golf = this.bravo.golf(name, location);
        if (golf != null) {
            if (golf instanceof InterfaceC2330f) {
                interfaceC2330f = (InterfaceC2330f) golf;
            } else {
                interfaceC2330f = null;
            }
            if (interfaceC2330f != null) {
                return interfaceC2330f;
            }
            if (golf instanceof ef.s) {
                return (ef.s) golf;
            }
        }
        return null;
    }

    public final String toString() {
        return "Classes from " + this.bravo;
    }
}
