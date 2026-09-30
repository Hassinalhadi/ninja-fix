package ne;

import Xe.h;
import Xe.m;
import fe.C1713e;
import fe.C1714f;
import ff.l;
import gf.C1791f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.x;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.ap;
import me.n;
import pe.AbstractC2340p;
import pe.C2339o;
import pe.InterfaceC2330f;
import pe.InterfaceC2335k;
import pe.an;
import pe.au;
import qe.C2471g;
import qe.InterfaceC2472h;
import se.AbstractC2852b;
import se.C2859i;
import se.ao;

/* renamed from: ne.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2179c extends AbstractC2852b {
    public static final Ne.b e = new Ne.b(n.juliet, Ne.f.echo("Function"));

    /* renamed from: f, reason: collision with root package name */
    public static final Ne.b f13120f = new Ne.b(n.hotel, Ne.f.echo("KFunction"));

    /* renamed from: a, reason: collision with root package name */
    public final int f13121a;

    /* renamed from: b, reason: collision with root package name */
    public final C2178b f13122b;

    /* renamed from: c, reason: collision with root package name */
    public final C2182f f13123c;

    /* renamed from: d, reason: collision with root package name */
    public final List f13124d;
    public final l teal;
    public final df.c white;
    public final EnumC2181e yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r5v2, types: [ne.f, Xe.h] */
    public C2179c(l lVar, df.c containingDeclaration, EnumC2181e enumC2181e, int i4) {
        super(lVar, enumC2181e.alpha(i4));
        int collectionSizeOrDefault;
        Intrinsics.echo(containingDeclaration, "containingDeclaration");
        this.teal = lVar;
        this.white = containingDeclaration;
        this.yellow = enumC2181e;
        this.f13121a = i4;
        this.f13122b = new C2178b(this);
        this.f13123c = new h(lVar, this);
        ArrayList arrayList = new ArrayList();
        C1713e c1713e = new C1713e(1, i4, 1);
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(c1713e, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
        Iterator it = c1713e.iterator();
        while (((C1714f) it).red) {
            arrayList.add(ao.d0(this, 2, Ne.f.echo("P" + ((x) it).alpha()), arrayList.size(), this.teal));
            arrayList2.add(Unit.INSTANCE);
        }
        arrayList.add(ao.d0(this, 3, Ne.f.echo("R"), arrayList.size(), this.teal));
        this.f13124d = CollectionsKt.z(arrayList);
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
        return 2;
    }

    @Override // pe.InterfaceC2330f
    public final Collection coral() {
        return CollectionsKt.emptyList();
    }

    @Override // pe.InterfaceC2336l
    public final an echo() {
        return an.magenta;
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
        return 4;
    }

    @Override // pe.InterfaceC2330f
    public final boolean hotel() {
        return false;
    }

    @Override // pe.InterfaceC2333i
    public final boolean india() {
        return false;
    }

    @Override // pe.InterfaceC2348x
    public final boolean isExternal() {
        return false;
    }

    @Override // pe.InterfaceC2330f
    public final boolean isInline() {
        return false;
    }

    @Override // pe.InterfaceC2330f
    public final /* bridge */ /* synthetic */ C2859i lavender() {
        return null;
    }

    @Override // pe.InterfaceC2335k
    public final InterfaceC2335k lima() {
        return this.white;
    }

    @Override // pe.InterfaceC2330f
    public final /* bridge */ /* synthetic */ Xe.n lime() {
        return m.bravo;
    }

    @Override // pe.InterfaceC2330f
    public final /* bridge */ /* synthetic */ InterfaceC2330f maroon() {
        return null;
    }

    @Override // pe.InterfaceC2330f, pe.InterfaceC2333i
    public final List papa() {
        return this.f13124d;
    }

    @Override // se.y
    public final Xe.n sierra(C1791f c1791f) {
        return this.f13123c;
    }

    @Override // pe.InterfaceC2330f
    public final au t() {
        return null;
    }

    @Override // pe.InterfaceC2332h
    public final ap tango() {
        return this.f13122b;
    }

    public final String toString() {
        String bravo = getName().bravo();
        Intrinsics.delta(bravo, "name.asString()");
        return bravo;
    }

    @Override // pe.InterfaceC2330f
    public final boolean uniform() {
        return false;
    }

    @Override // pe.InterfaceC2330f
    public final Collection xray() {
        return CollectionsKt.emptyList();
    }

    @Override // pe.InterfaceC2348x
    public final boolean y() {
        return false;
    }
}
