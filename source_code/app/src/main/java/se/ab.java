package se;

import kotlin.jvm.internal.Intrinsics;
import pe.InterfaceC2321ad;
import pe.InterfaceC2335k;
import pe.InterfaceC2337m;
import pe.InterfaceC2349y;
import qe.C2471g;

/* loaded from: classes2.dex */
public abstract class ab extends AbstractC2864n implements InterfaceC2321ad {
    public final Ne.c teal;
    public final String white;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab(InterfaceC2349y module, Ne.c fqName) {
        super(module, C2471g.alpha, fqName.golf(), pe.an.magenta);
        Intrinsics.echo(module, "module");
        Intrinsics.echo(fqName, "fqName");
        this.teal = fqName;
        this.white = "package " + fqName + " of " + module;
    }

    @Override // se.AbstractC2864n, pe.InterfaceC2335k
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public final InterfaceC2349y lima() {
        InterfaceC2335k lima = super.lima();
        Intrinsics.charlie(lima, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ModuleDescriptor");
        return (InterfaceC2349y) lima;
    }

    @Override // se.AbstractC2864n, pe.InterfaceC2336l
    public pe.an echo() {
        return pe.an.magenta;
    }

    @Override // pe.InterfaceC2335k
    public final Object quebec(InterfaceC2337m interfaceC2337m, Object obj) {
        return interfaceC2337m.sierra(this, obj);
    }

    @Override // se.AbstractC2863m
    public String toString() {
        return this.white;
    }
}
