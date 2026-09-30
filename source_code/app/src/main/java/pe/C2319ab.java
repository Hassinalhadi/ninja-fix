package pe;

import fe.C1714f;
import fe.C1715g;
import gf.C1791f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import qe.C2471g;
import qe.InterfaceC2472h;
import s6.J4;
import se.AbstractC2860j;
import se.C2859i;

/* renamed from: pe.ab, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2319ab extends AbstractC2860j {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f13148a;

    /* renamed from: b, reason: collision with root package name */
    public final kotlin.reflect.jvm.internal.impl.types.l f13149b;
    public final boolean yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2319ab(ff.l lVar, InterfaceC2331g container, Ne.f fVar, boolean z2, int i4) {
        super(lVar, container, fVar, an.magenta);
        int collectionSizeOrDefault;
        Intrinsics.echo(container, "container");
        this.yellow = z2;
        C1715g hotel = J4.hotel(0, i4);
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(hotel, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator it = hotel.iterator();
        while (((C1714f) it).red) {
            int alpha = ((kotlin.collections.x) it).alpha();
            arrayList.add(se.ao.d0(this, 1, Ne.f.echo("T" + alpha), alpha, lVar));
        }
        this.f13148a = arrayList;
        this.f13149b = new kotlin.reflect.jvm.internal.impl.types.l(this, AbstractC2347w.charlie(this), kotlin.collections.ab.oscar(Ue.e.juliet(this).juliet().echo()), lVar);
    }

    @Override // pe.InterfaceC2330f
    public final boolean B() {
        return false;
    }

    @Override // pe.InterfaceC2330f
    public final boolean azure() {
        return false;
    }

    @Override // pe.InterfaceC2330f
    public final int c() {
        return 1;
    }

    @Override // pe.InterfaceC2330f
    public final Collection coral() {
        return CollectionsKt.emptyList();
    }

    @Override // pe.InterfaceC2348x
    public final boolean emerald() {
        return false;
    }

    @Override // qe.InterfaceC2465a
    public final InterfaceC2472h getAnnotations() {
        return C2471g.alpha;
    }

    @Override // pe.InterfaceC2330f, pe.InterfaceC2338n, pe.InterfaceC2348x
    public final C2339o getVisibility() {
        C2339o PUBLIC = AbstractC2340p.echo;
        Intrinsics.delta(PUBLIC, "PUBLIC");
        return PUBLIC;
    }

    @Override // pe.InterfaceC2330f, pe.InterfaceC2348x
    public final int golf() {
        return 1;
    }

    @Override // pe.InterfaceC2330f
    public final boolean hotel() {
        return false;
    }

    @Override // pe.InterfaceC2333i
    public final boolean india() {
        return this.yellow;
    }

    @Override // se.AbstractC2860j, pe.InterfaceC2348x
    public final boolean isExternal() {
        return false;
    }

    @Override // pe.InterfaceC2330f
    public final boolean isInline() {
        return false;
    }

    @Override // pe.InterfaceC2330f
    public final C2859i lavender() {
        return null;
    }

    @Override // pe.InterfaceC2330f
    public final /* bridge */ /* synthetic */ Xe.n lime() {
        return Xe.m.bravo;
    }

    @Override // pe.InterfaceC2330f
    public final InterfaceC2330f maroon() {
        return null;
    }

    @Override // pe.InterfaceC2330f, pe.InterfaceC2333i
    public final List papa() {
        return this.f13148a;
    }

    @Override // se.y
    public final Xe.n sierra(C1791f c1791f) {
        return Xe.m.bravo;
    }

    @Override // pe.InterfaceC2330f
    public final au t() {
        return null;
    }

    @Override // pe.InterfaceC2332h
    public final kotlin.reflect.jvm.internal.impl.types.ap tango() {
        return this.f13149b;
    }

    public final String toString() {
        return "class " + getName() + " (not found)";
    }

    @Override // pe.InterfaceC2330f
    public final boolean uniform() {
        return false;
    }

    @Override // pe.InterfaceC2330f
    public final Collection xray() {
        return kotlin.collections.u.alpha;
    }

    @Override // pe.InterfaceC2348x
    public final boolean y() {
        return false;
    }
}
