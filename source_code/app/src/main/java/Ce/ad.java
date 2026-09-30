package Ce;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.B;
import pe.InterfaceC2335k;
import s6.A0;
import s6.G4;
import s6.K4;
import se.AbstractC2870t;
import se.C2871u;
import se.aq;
import t6.L3;
import xe.EnumC3339b;

/* loaded from: classes2.dex */
public abstract class ad extends Xe.o {
    public static final /* synthetic */ ge.v[] mike;
    public final B9.ab bravo;
    public final p charlie;
    public final ff.c delta;
    public final ff.i echo;
    public final ff.e foxtrot;
    public final ff.j golf;
    public final ff.e hotel;
    public final ff.i india;
    public final ff.i juliet;
    public final ff.i kilo;
    public final ff.e lima;

    static {
        kotlin.jvm.internal.v vVar = kotlin.jvm.internal.u.alpha;
        mike = new ge.v[]{vVar.hotel(new kotlin.jvm.internal.o(vVar.bravo(ad.class), "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;")), vVar.hotel(new kotlin.jvm.internal.o(vVar.bravo(ad.class), "propertyNamesLazy", "getPropertyNamesLazy()Ljava/util/Set;")), vVar.hotel(new kotlin.jvm.internal.o(vVar.bravo(ad.class), "classNamesLazy", "getClassNamesLazy()Ljava/util/Set;"))};
    }

    public ad(B9.ab c3, p pVar) {
        Intrinsics.echo(c3, "c");
        this.bravo = c3;
        this.charlie = pVar;
        ff.l lVar = ((Be.a) c3.purple).alpha;
        z zVar = new z(this, 0);
        List emptyList = CollectionsKt.emptyList();
        lVar.getClass();
        if (emptyList != null) {
            this.delta = new ff.c(lVar, zVar, emptyList);
            this.echo = lVar.bravo(new z(this, 2));
            this.foxtrot = lVar.charlie(new aa(this, 1));
            this.golf = lVar.delta(new aa(this, 0));
            this.hotel = lVar.charlie(new aa(this, 2));
            this.india = lVar.bravo(new z(this, 3));
            this.juliet = lVar.bravo(new z(this, 4));
            this.kilo = lVar.bravo(new z(this, 1));
            this.lima = lVar.charlie(new aa(this, 3));
            return;
        }
        ff.l.alpha(27);
        throw null;
    }

    public static kotlin.reflect.jvm.internal.impl.types.y lima(ve.z method, B9.ab abVar) {
        Intrinsics.echo(method, "method");
        Class<?> declaringClass = ((Method) method.bravo()).getDeclaringClass();
        Intrinsics.delta(declaringClass, "member.declaringClass");
        De.a delta = G4.delta(2, declaringClass.isAnnotation(), null, 6);
        return ((J2.t) abVar.teal).amber(method.foxtrot(), delta);
    }

    public static y uniform(B9.ab abVar, AbstractC2870t abstractC2870t, List jValueParameters) {
        int collectionSizeOrDefault;
        Pair pair;
        kotlin.reflect.jvm.internal.impl.types.y yVar;
        Ne.f fVar;
        Ne.f echo;
        ve.i iVar;
        Intrinsics.echo(jValueParameters, "jValueParameters");
        Lf.i G9 = CollectionsKt.G(jValueParameters);
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(G9, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator it = G9.iterator();
        boolean z2 = false;
        boolean z10 = false;
        while (true) {
            kotlin.collections.w wVar = (kotlin.collections.w) it;
            if (((Iterator) wVar.red).hasNext()) {
                kotlin.collections.v vVar = (kotlin.collections.v) wVar.next();
                int i4 = vVar.alpha;
                ve.af afVar = (ve.af) vVar.bravo;
                Be.c bravo = A0.bravo(abVar, afVar);
                Ne.f fVar2 = null;
                De.a delta = G4.delta(2, z2, null, 7);
                Be.a aVar = (Be.a) abVar.purple;
                ve.ad adVar = afVar.alpha;
                boolean z11 = afVar.delta;
                J2.t tVar = (J2.t) abVar.teal;
                se.z zVar = aVar.oscar;
                if (z11) {
                    if (adVar instanceof ve.i) {
                        iVar = (ve.i) adVar;
                    } else {
                        iVar = null;
                    }
                    if (iVar != null) {
                        B zulu = tVar.zulu(iVar, delta, true);
                        pair = new Pair(zulu, zVar.silver.foxtrot(zulu));
                    } else {
                        throw new AssertionError("Vararg parameter should be an array: " + afVar);
                    }
                } else {
                    pair = new Pair(tVar.amber(adVar, delta), null);
                }
                kotlin.reflect.jvm.internal.impl.types.y yVar2 = (kotlin.reflect.jvm.internal.impl.types.y) pair.first;
                kotlin.reflect.jvm.internal.impl.types.y yVar3 = (kotlin.reflect.jvm.internal.impl.types.y) pair.second;
                if (Intrinsics.areEqual(abstractC2870t.getName().bravo(), "equals") && jValueParameters.size() == 1 && Intrinsics.areEqual(zVar.silver.november(), yVar2)) {
                    echo = Ne.f.echo("other");
                } else {
                    String str = afVar.charlie;
                    if (str != null) {
                        fVar2 = Ne.f.delta(str);
                    }
                    if (fVar2 == null) {
                        z10 = true;
                    }
                    if (fVar2 == null) {
                        echo = Ne.f.echo("p" + i4);
                    } else {
                        yVar = yVar2;
                        fVar = fVar2;
                        arrayList.add(new aq(abstractC2870t, null, i4, bravo, fVar, yVar, false, false, false, yVar3, aVar.juliet.alpha(afVar)));
                        z2 = false;
                    }
                }
                fVar = echo;
                yVar = yVar2;
                arrayList.add(new aq(abstractC2870t, null, i4, bravo, fVar, yVar, false, false, false, yVar3, aVar.juliet.alpha(afVar)));
                z2 = false;
            } else {
                return new y(CollectionsKt.z(arrayList), z10);
            }
        }
    }

    @Override // Xe.o, Xe.p
    public Collection alpha(Xe.f kindFilter, Function1 nameFilter) {
        Intrinsics.echo(kindFilter, "kindFilter");
        Intrinsics.echo(nameFilter, "nameFilter");
        return (Collection) this.delta.invoke();
    }

    @Override // Xe.o, Xe.n
    public final Set bravo() {
        return (Set) K4.alpha(this.india, mike[0]);
    }

    @Override // Xe.o, Xe.n
    public Collection charlie(Ne.f name, EnumC3339b location) {
        Intrinsics.echo(name, "name");
        Intrinsics.echo(location, "location");
        if (!bravo().contains(name)) {
            return CollectionsKt.emptyList();
        }
        return (Collection) this.hotel.invoke(name);
    }

    @Override // Xe.o, Xe.n
    public final Set delta() {
        return (Set) K4.alpha(this.kilo, mike[2]);
    }

    @Override // Xe.o, Xe.n
    public final Set echo() {
        return (Set) K4.alpha(this.juliet, mike[1]);
    }

    @Override // Xe.o, Xe.n
    public Collection foxtrot(Ne.f name, EnumC3339b enumC3339b) {
        Intrinsics.echo(name, "name");
        if (!echo().contains(name)) {
            return CollectionsKt.emptyList();
        }
        return (Collection) this.lima.invoke(name);
    }

    public abstract Set hotel(Xe.f fVar, Xe.k kVar);

    public abstract Set india(Xe.f fVar, Xe.k kVar);

    public void juliet(Ne.f name, ArrayList arrayList) {
        Intrinsics.echo(name, "name");
    }

    public abstract c kilo();

    public abstract void mike(LinkedHashSet linkedHashSet, Ne.f fVar);

    public abstract void november(Ne.f fVar, ArrayList arrayList);

    public abstract Set oscar(Xe.f fVar);

    public abstract C2871u papa();

    public abstract InterfaceC2335k quebec();

    public boolean romeo(Ae.f fVar) {
        return true;
    }

    public abstract x sierra(ve.z zVar, ArrayList arrayList, kotlin.reflect.jvm.internal.impl.types.y yVar, List list);

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    public final Ae.f tango(ve.z method) {
        boolean z2;
        int collectionSizeOrDefault;
        Intrinsics.echo(method, "method");
        B9.ab abVar = this.bravo;
        Be.c bravo = A0.bravo(abVar, method);
        InterfaceC2335k quebec = quebec();
        Ne.f charlie = method.charlie();
        ue.f alpha = ((Be.a) abVar.purple).juliet.alpha(method);
        int i4 = 1;
        if (((c) this.echo.invoke()).charlie(method.charlie()) != null && ((ArrayList) method.golf()).isEmpty()) {
            z2 = true;
        } else {
            z2 = false;
        }
        Ae.f o02 = Ae.f.o0(quebec, bravo, charlie, alpha, z2);
        Intrinsics.echo(abVar, "<this>");
        B9.ab abVar2 = new B9.ab((Be.a) abVar.purple, new Be.e(abVar, o02, method, 0), (Lazy) abVar.red);
        ArrayList typeParameters = method.getTypeParameters();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(typeParameters, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator it = typeParameters.iterator();
        while (it.hasNext()) {
            pe.aq alpha2 = ((Be.f) abVar2.white).alpha((ve.ae) it.next());
            Intrinsics.checkNotNull(alpha2);
            arrayList.add(alpha2);
        }
        y uniform = uniform(abVar2, o02, method.golf());
        x sierra = sierra(method, arrayList, lima(method, abVar2), uniform.bravo);
        C2871u papa = papa();
        List emptyList = CollectionsKt.emptyList();
        boolean isAbstract = Modifier.isAbstract(((Method) method.bravo()).getModifiers());
        boolean isFinal = Modifier.isFinal(((Method) method.bravo()).getModifiers());
        if (isAbstract) {
            i4 = 4;
        } else if (!isFinal) {
            i4 = 3;
        }
        int i5 = i4;
        o02.n0(null, papa, emptyList, sierra.charlie, sierra.bravo, sierra.alpha, i5, L3.bravo(method.echo()), kotlin.collections.t.alpha);
        o02.p0(false, uniform.alpha);
        if (sierra.delta.isEmpty()) {
            return o02;
        }
        ((Be.a) abVar2.purple).echo.getClass();
        throw new UnsupportedOperationException("Should not be called");
    }

    public String toString() {
        return "Lazy scope for " + quebec();
    }
}
