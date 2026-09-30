package se;

import kotlin.jvm.internal.Intrinsics;
import pe.InterfaceC2335k;
import pe.InterfaceC2337m;
import qe.C2471g;

/* renamed from: se.w, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2873w extends AbstractC2863m implements pe.ai {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ge.v[] f13797a;
    public final z red;
    public final Ne.c silver;
    public final ff.i teal;
    public final ff.i white;
    public final Xe.j yellow;

    static {
        kotlin.jvm.internal.v vVar = kotlin.jvm.internal.u.alpha;
        f13797a = new ge.v[]{vVar.hotel(new kotlin.jvm.internal.o(vVar.bravo(C2873w.class), "fragments", "getFragments()Ljava/util/List;")), vVar.hotel(new kotlin.jvm.internal.o(vVar.bravo(C2873w.class), "empty", "getEmpty()Z"))};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2873w(z module, Ne.c fqName, ff.l storageManager) {
        super(C2471g.alpha, fqName.golf());
        Intrinsics.echo(module, "module");
        Intrinsics.echo(fqName, "fqName");
        Intrinsics.echo(storageManager, "storageManager");
        this.red = module;
        this.silver = fqName;
        this.teal = storageManager.bravo(new C2872v(this, 1));
        this.white = storageManager.bravo(new C2872v(this, 0));
        this.yellow = new Xe.j(storageManager, new C2872v(this, 2));
    }

    public final boolean equals(Object obj) {
        pe.ai aiVar;
        if (obj instanceof pe.ai) {
            aiVar = (pe.ai) obj;
        } else {
            aiVar = null;
        }
        if (aiVar == null) {
            return false;
        }
        C2873w c2873w = (C2873w) aiVar;
        if (!Intrinsics.areEqual(this.silver, c2873w.silver) || !Intrinsics.areEqual(this.red, c2873w.red)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.silver.hashCode() + (this.red.hashCode() * 31);
    }

    @Override // pe.InterfaceC2335k
    public final InterfaceC2335k lima() {
        Ne.c cVar = this.silver;
        if (cVar.delta()) {
            return null;
        }
        Ne.c echo = cVar.echo();
        Intrinsics.delta(echo, "fqName.parent()");
        return this.red.amber(echo);
    }

    @Override // pe.InterfaceC2335k
    public final Object quebec(InterfaceC2337m interfaceC2337m, Object obj) {
        return interfaceC2337m.magenta(this, obj);
    }
}
