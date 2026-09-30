package Xa;

import B9.K;
import Ce.j;
import D5.s;
import Ie.aq;
import T.r;
import Yb.C0313k;
import Yb.L0;
import androidx.compose.material3.internal.q;
import androidx.compose.material3.internal.t;
import androidx.compose.runtime.aw;
import androidx.compose.runtime.n0;
import androidx.lifecycle.InterfaceC0651v;
import androidx.lifecycle.a0;
import androidx.lifecycle.d0;
import cf.C0857m;
import cf.InterfaceC0845a;
import delivery.samurai.android.ui.about.MoreFragment;
import delivery.samurai.android.ui.about.TrophiesCollectionsFragment;
import delivery.samurai.android.ui.about.TrophiesListFragment;
import delivery.samurai.android.ui.about.TrophyMilestonesFragment;
import delivery.samurai.android.ui.agreement.AgreementDetailFragment;
import delivery.samurai.android.ui.agreement.AgreementFragment;
import delivery.samurai.android.ui.points.presentation.PointsFragment;
import delivery.samurai.android.ui.redeem.presentation.RedeemFragment;
import delivery.samurai.android.ui.referralProgram.ReferYourFriendFragment;
import delivery.samurai.android.ui.zones.ZonesFragment;
import ef.C1661i;
import ff.l;
import ga.ac;
import ga.u;
import ge.aa;
import ge.z;
import gf.C1791f;
import gf.C1794i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import je.C1963b;
import je.M;
import je.N;
import je.Q;
import je.Y;
import je.af;
import je.ah;
import ke.C2035c;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.ab;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.types.B;
import kotlin.reflect.jvm.internal.impl.types.as;
import kotlin.reflect.jvm.internal.impl.types.y;
import oe.C2236g;
import oe.C2238i;
import oe.C2243n;
import pe.AbstractC2347w;
import pe.InterfaceC2330f;
import pe.InterfaceC2335k;
import pe.InterfaceC2345u;
import s6.W4;
import se.C2861k;

/* loaded from: classes2.dex */
public final class f extends Lambda implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;
    public final /* synthetic */ Object red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i4, Object obj, Object obj2) {
        super(0);
        this.alpha = i4;
        this.red = obj;
        this.purple = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v63, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v89, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r3v69, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        a0 defaultViewModelProviderFactory;
        a0 defaultViewModelProviderFactory2;
        a0 defaultViewModelProviderFactory3;
        a0 defaultViewModelProviderFactory4;
        a0 defaultViewModelProviderFactory5;
        a0 defaultViewModelProviderFactory6;
        a0 defaultViewModelProviderFactory7;
        a0 defaultViewModelProviderFactory8;
        a0 defaultViewModelProviderFactory9;
        a0 defaultViewModelProviderFactory10;
        a0 defaultViewModelProviderFactory11;
        int collectionSizeOrDefault;
        Collection romeo;
        String concat;
        int collectionSizeOrDefault2;
        C0857m c0857m;
        z bravo;
        a0 defaultViewModelProviderFactory12;
        a0 defaultViewModelProviderFactory13;
        a0 defaultViewModelProviderFactory14;
        a0 defaultViewModelProviderFactory15;
        a0 defaultViewModelProviderFactory16;
        a0 defaultViewModelProviderFactory17;
        int i4 = 0;
        InterfaceC0651v interfaceC0651v = null;
        Object obj = this.red;
        ?? r5 = this.purple;
        switch (this.alpha) {
            case 0:
                d0 d0Var = (d0) r5.getValue();
                if (d0Var instanceof InterfaceC0651v) {
                    interfaceC0651v = (InterfaceC0651v) d0Var;
                }
                if (interfaceC0651v == null || (defaultViewModelProviderFactory = interfaceC0651v.getDefaultViewModelProviderFactory()) == null) {
                    return ((g) obj).getDefaultViewModelProviderFactory();
                }
                return defaultViewModelProviderFactory;
            case 1:
                d0 d0Var2 = (d0) r5.getValue();
                if (d0Var2 instanceof InterfaceC0651v) {
                    interfaceC0651v = (InterfaceC0651v) d0Var2;
                }
                if (interfaceC0651v == null || (defaultViewModelProviderFactory2 = interfaceC0651v.getDefaultViewModelProviderFactory()) == null) {
                    return ((ZonesFragment) obj).getDefaultViewModelProviderFactory();
                }
                return defaultViewModelProviderFactory2;
            case 2:
                d0 d0Var3 = (d0) r5.getValue();
                if (d0Var3 instanceof InterfaceC0651v) {
                    interfaceC0651v = (InterfaceC0651v) d0Var3;
                }
                if (interfaceC0651v == null || (defaultViewModelProviderFactory3 = interfaceC0651v.getDefaultViewModelProviderFactory()) == null) {
                    return ((Ya.d) obj).getDefaultViewModelProviderFactory();
                }
                return defaultViewModelProviderFactory3;
            case 3:
                d0 d0Var4 = (d0) r5.getValue();
                if (d0Var4 instanceof InterfaceC0651v) {
                    interfaceC0651v = (InterfaceC0651v) d0Var4;
                }
                if (interfaceC0651v == null || (defaultViewModelProviderFactory4 = interfaceC0651v.getDefaultViewModelProviderFactory()) == null) {
                    return ((C0313k) obj).getDefaultViewModelProviderFactory();
                }
                return defaultViewModelProviderFactory4;
            case 4:
                d0 d0Var5 = (d0) r5.getValue();
                if (d0Var5 instanceof InterfaceC0651v) {
                    interfaceC0651v = (InterfaceC0651v) d0Var5;
                }
                if (interfaceC0651v == null || (defaultViewModelProviderFactory5 = interfaceC0651v.getDefaultViewModelProviderFactory()) == null) {
                    return ((L0) obj).getDefaultViewModelProviderFactory();
                }
                return defaultViewModelProviderFactory5;
            case 5:
                t tVar = (t) obj;
                q qVar = (q) tVar.november;
                float charlie = tVar.delta().charlie(r5);
                if (!Float.isNaN(charlie)) {
                    t tVar2 = qVar.alpha;
                    ((n0) ((aw) tVar2.lima)).kilo(charlie);
                    ((n0) ((aw) tVar2.mike)).kilo(0.0f);
                    tVar.india(null);
                }
                tVar.hotel(r5);
                return Unit.INSTANCE;
            case 6:
                s sVar = ((cf.z) obj).alpha;
                return ((InterfaceC0845a) ((K) sVar.alpha).echo).november((aq) r5, (Ke.e) sVar.bravo);
            case 7:
                C1661i c1661i = (C1661i) obj;
                return CollectionsKt.z(((InterfaceC0845a) ((K) c1661i.e.alpha).echo).india(c1661i.f12597p, (Ie.t) r5));
            case 8:
                d0 d0Var6 = (d0) r5.getValue();
                if (d0Var6 instanceof InterfaceC0651v) {
                    interfaceC0651v = (InterfaceC0651v) d0Var6;
                }
                if (interfaceC0651v == null || (defaultViewModelProviderFactory6 = interfaceC0651v.getDefaultViewModelProviderFactory()) == null) {
                    return ((MoreFragment) obj).getDefaultViewModelProviderFactory();
                }
                return defaultViewModelProviderFactory6;
            case 9:
                d0 d0Var7 = (d0) r5.getValue();
                if (d0Var7 instanceof InterfaceC0651v) {
                    interfaceC0651v = (InterfaceC0651v) d0Var7;
                }
                if (interfaceC0651v == null || (defaultViewModelProviderFactory7 = interfaceC0651v.getDefaultViewModelProviderFactory()) == null) {
                    return ((u) obj).getDefaultViewModelProviderFactory();
                }
                return defaultViewModelProviderFactory7;
            case 10:
                d0 d0Var8 = (d0) r5.getValue();
                if (d0Var8 instanceof InterfaceC0651v) {
                    interfaceC0651v = (InterfaceC0651v) d0Var8;
                }
                if (interfaceC0651v == null || (defaultViewModelProviderFactory8 = interfaceC0651v.getDefaultViewModelProviderFactory()) == null) {
                    return ((ac) obj).getDefaultViewModelProviderFactory();
                }
                return defaultViewModelProviderFactory8;
            case 11:
                d0 d0Var9 = (d0) r5.getValue();
                if (d0Var9 instanceof InterfaceC0651v) {
                    interfaceC0651v = (InterfaceC0651v) d0Var9;
                }
                if (interfaceC0651v == null || (defaultViewModelProviderFactory9 = interfaceC0651v.getDefaultViewModelProviderFactory()) == null) {
                    return ((TrophiesCollectionsFragment) obj).getDefaultViewModelProviderFactory();
                }
                return defaultViewModelProviderFactory9;
            case 12:
                d0 d0Var10 = (d0) r5.getValue();
                if (d0Var10 instanceof InterfaceC0651v) {
                    interfaceC0651v = (InterfaceC0651v) d0Var10;
                }
                if (interfaceC0651v == null || (defaultViewModelProviderFactory10 = interfaceC0651v.getDefaultViewModelProviderFactory()) == null) {
                    return ((TrophiesListFragment) obj).getDefaultViewModelProviderFactory();
                }
                return defaultViewModelProviderFactory10;
            case 13:
                d0 d0Var11 = (d0) r5.getValue();
                if (d0Var11 instanceof InterfaceC0651v) {
                    interfaceC0651v = (InterfaceC0651v) d0Var11;
                }
                if (interfaceC0651v == null || (defaultViewModelProviderFactory11 = interfaceC0651v.getDefaultViewModelProviderFactory()) == null) {
                    return ((TrophyMilestonesFragment) obj).getDefaultViewModelProviderFactory();
                }
                return defaultViewModelProviderFactory11;
            case 14:
                List list = (List) ((C1794i) obj).echo.getValue();
                if (list == null) {
                    list = CollectionsKt.emptyList();
                }
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
                ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((B) it.next()).purple((C1791f) r5));
                }
                return arrayList;
            case 15:
                ah ahVar = (ah) obj;
                af afVar = ahVar.white;
                afVar.getClass();
                String str = (String) r5;
                String signature = ahVar.yellow;
                Intrinsics.echo(signature, "signature");
                if (Intrinsics.areEqual(str, "<init>")) {
                    romeo = CollectionsKt.z(afVar.quebec());
                } else {
                    romeo = afVar.romeo(Ne.f.echo(str));
                }
                Collection collection = romeo;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : collection) {
                    if (Intrinsics.areEqual(Y.charlie((InterfaceC2345u) obj2).foxtrot(), signature)) {
                        arrayList2.add(obj2);
                    }
                }
                if (arrayList2.size() != 1) {
                    String maroon = CollectionsKt.maroon(collection, "\n", null, null, C1963b.f12909d, 30);
                    StringBuilder india = av.q.india("Function '", str, "' (JVM signature: ", signature, ") not resolved in ");
                    india.append(afVar);
                    india.append(':');
                    if (maroon.length() == 0) {
                        concat = " no members found";
                    } else {
                        concat = "\n".concat(maroon);
                    }
                    india.append(concat);
                    throw new Q(india.toString());
                }
                return (InterfaceC2345u) CollectionsKt.k(arrayList2);
            case 16:
                N n5 = (N) obj;
                List cyan = n5.alpha.cyan();
                if (cyan.isEmpty()) {
                    return CollectionsKt.emptyList();
                }
                Lazy alpha = LazyKt.alpha(kotlin.i.alpha, new M(n5, i4));
                collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(cyan, 10);
                ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault2);
                for (Object obj3 : cyan) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    as asVar = (as) obj3;
                    if (asVar.charlie()) {
                        bravo = z.charlie;
                    } else {
                        y bravo2 = asVar.bravo();
                        Intrinsics.delta(bravo2, "typeProjection.type");
                        if (((Lambda) r5) == null) {
                            c0857m = null;
                        } else {
                            c0857m = new C0857m(n5, i4, alpha);
                        }
                        N n10 = new N(bravo2, c0857m);
                        int mike = av.q.mike(asVar.alpha());
                        if (mike != 0) {
                            if (mike != 1) {
                                if (mike == 2) {
                                    bravo = new z(aa.red, n10);
                                } else {
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else {
                                bravo = new z(aa.purple, n10);
                            }
                        } else {
                            z zVar = z.charlie;
                            bravo = W4.bravo(n10);
                        }
                    }
                    arrayList3.add(bravo);
                    i4 = i5;
                }
                return arrayList3;
            case 17:
                StringBuilder sb2 = new StringBuilder();
                sb2.append('@');
                sb2.append(((Class) obj).getCanonicalName());
                CollectionsKt.magenta(((Map) r5).entrySet(), sb2, ", ", "(", ")", C2035c.alpha, 48);
                String sb3 = sb2.toString();
                Intrinsics.delta(sb3, "StringBuilder().apply(builderAction).toString()");
                return sb3;
            case 18:
                p000if.c type = (p000if.c) ((kotlin.reflect.jvm.internal.impl.types.ac) r5).red.invoke();
                ((C1791f) obj).getClass();
                Intrinsics.echo(type, "type");
                return (y) type;
            case 19:
                d0 d0Var12 = (d0) r5.getValue();
                if (d0Var12 instanceof InterfaceC0651v) {
                    interfaceC0651v = (InterfaceC0651v) d0Var12;
                }
                if (interfaceC0651v == null || (defaultViewModelProviderFactory12 = interfaceC0651v.getDefaultViewModelProviderFactory()) == null) {
                    return ((AgreementDetailFragment) obj).getDefaultViewModelProviderFactory();
                }
                return defaultViewModelProviderFactory12;
            case 20:
                d0 d0Var13 = (d0) r5.getValue();
                if (d0Var13 instanceof InterfaceC0651v) {
                    interfaceC0651v = (InterfaceC0651v) d0Var13;
                }
                if (interfaceC0651v == null || (defaultViewModelProviderFactory13 = interfaceC0651v.getDefaultViewModelProviderFactory()) == null) {
                    return ((AgreementFragment) obj).getDefaultViewModelProviderFactory();
                }
                return defaultViewModelProviderFactory13;
            case 21:
                d0 d0Var14 = (d0) r5.getValue();
                if (d0Var14 instanceof InterfaceC0651v) {
                    interfaceC0651v = (InterfaceC0651v) d0Var14;
                }
                if (interfaceC0651v == null || (defaultViewModelProviderFactory14 = interfaceC0651v.getDefaultViewModelProviderFactory()) == null) {
                    return ((PointsFragment) obj).getDefaultViewModelProviderFactory();
                }
                return defaultViewModelProviderFactory14;
            case 22:
                ((m0.c) obj).delta((r) r5);
                return Unit.INSTANCE;
            case 23:
                d0 d0Var15 = (d0) r5.getValue();
                if (d0Var15 instanceof InterfaceC0651v) {
                    interfaceC0651v = (InterfaceC0651v) d0Var15;
                }
                if (interfaceC0651v == null || (defaultViewModelProviderFactory15 = interfaceC0651v.getDefaultViewModelProviderFactory()) == null) {
                    return ((na.c) obj).getDefaultViewModelProviderFactory();
                }
                return defaultViewModelProviderFactory15;
            case 24:
                d0 d0Var16 = (d0) r5.getValue();
                if (d0Var16 instanceof InterfaceC0651v) {
                    interfaceC0651v = (InterfaceC0651v) d0Var16;
                }
                if (interfaceC0651v == null || (defaultViewModelProviderFactory16 = interfaceC0651v.getDefaultViewModelProviderFactory()) == null) {
                    return ((RedeemFragment) obj).getDefaultViewModelProviderFactory();
                }
                return defaultViewModelProviderFactory16;
            case 25:
                C2236g c2236g = (C2236g) obj;
                Function1 function1 = c2236g.bravo;
                se.z zVar2 = c2236g.alpha;
                l lVar = (l) r5;
                C2861k c2861k = new C2861k((InterfaceC2335k) function1.invoke(zVar2), C2236g.golf, 4, 2, ab.juliet(zVar2.silver.echo()), lVar);
                c2861k.cyan(new Xe.h(lVar, c2861k), kotlin.collections.u.alpha, null);
                return c2861k;
            case 26:
                C2238i c2238i = (C2238i) obj;
                se.z builtInsModule = c2238i.kilo();
                Intrinsics.delta(builtInsModule, "builtInsModule");
                return new C2243n(builtInsModule, (l) r5, new je.ab(22, c2238i));
            case 27:
                C2243n c2243n = (C2243n) obj;
                se.z zVar3 = c2243n.golf().alpha;
                C2236g.delta.getClass();
                return AbstractC2347w.foxtrot(zVar3, C2236g.hotel, new J2.i((l) r5, c2243n.golf().alpha)).oscar();
            case 28:
                j jVar = (j) obj;
                B9.ab abVar = jVar.f909c;
                Be.a aVar = (Be.a) abVar.purple;
                B9.ab abVar2 = new B9.ab(new Be.a(aVar.alpha, aVar.bravo, aVar.charlie, aVar.delta, aVar.echo, aVar.foxtrot, aVar.hotel, aVar.india, aVar.juliet, aVar.kilo, aVar.lima, aVar.mike, aVar.november, aVar.oscar, aVar.papa, aVar.quebec, aVar.romeo, aVar.sierra, aVar.tango, aVar.uniform, aVar.victor, aVar.whiskey), (Be.f) abVar.white, (Lazy) abVar.red);
                InterfaceC2335k containingDeclaration = jVar.lima();
                Intrinsics.delta(containingDeclaration, "containingDeclaration");
                return new j(abVar2, containingDeclaration, jVar.f907a, (InterfaceC2330f) r5);
            default:
                d0 d0Var17 = (d0) r5.getValue();
                if (d0Var17 instanceof InterfaceC0651v) {
                    interfaceC0651v = (InterfaceC0651v) d0Var17;
                }
                if (interfaceC0651v == null || (defaultViewModelProviderFactory17 = interfaceC0651v.getDefaultViewModelProviderFactory()) == null) {
                    return ((ReferYourFriendFragment) obj).getDefaultViewModelProviderFactory();
                }
                return defaultViewModelProviderFactory17;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f(N n5, Function0 function0) {
        super(0);
        this.alpha = 16;
        this.red = n5;
        this.purple = (Lambda) function0;
    }
}
