package ef;

import B2.ap;
import B9.K;
import Ie.D;
import Ie.E;
import Ie.aa;
import Ie.aq;
import Ie.aw;
import aa.AbstractC0417a;
import cf.C0853i;
import cf.z;
import gf.C1791f;
import gf.InterfaceC1796k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.y;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.ae;
import pe.C2339o;
import pe.InterfaceC2330f;
import pe.InterfaceC2335k;
import pe.al;
import pe.am;
import pe.an;
import pe.ao;
import pe.au;
import qe.C2471g;
import qe.InterfaceC2472h;
import s6.AbstractC2635d6;
import s6.K4;
import se.AbstractC2852b;
import se.C2859i;
import se.C2871u;
import xe.EnumC3339b;

/* renamed from: ef.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1661i extends AbstractC2852b implements InterfaceC2335k {

    /* renamed from: a, reason: collision with root package name */
    public final Ne.b f12583a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12584b;

    /* renamed from: c, reason: collision with root package name */
    public final C2339o f12585c;

    /* renamed from: d, reason: collision with root package name */
    public final int f12586d;
    public final D5.s e;

    /* renamed from: f, reason: collision with root package name */
    public final Xe.o f12587f;

    /* renamed from: g, reason: collision with root package name */
    public final Ce.h f12588g;

    /* renamed from: h, reason: collision with root package name */
    public final am f12589h;

    /* renamed from: i, reason: collision with root package name */
    public final J2.i f12590i;

    /* renamed from: j, reason: collision with root package name */
    public final InterfaceC2335k f12591j;

    /* renamed from: k, reason: collision with root package name */
    public final ff.h f12592k;

    /* renamed from: l, reason: collision with root package name */
    public final ff.i f12593l;

    /* renamed from: m, reason: collision with root package name */
    public final ff.h f12594m;

    /* renamed from: n, reason: collision with root package name */
    public final ff.i f12595n;

    /* renamed from: o, reason: collision with root package name */
    public final ff.h f12596o;

    /* renamed from: p, reason: collision with root package name */
    public final cf.r f12597p;

    /* renamed from: q, reason: collision with root package name */
    public final InterfaceC2472h f12598q;
    public final Ie.j teal;
    public final Ke.a white;
    public final an yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r4v14, types: [J2.i, java.lang.Object] */
    public C1661i(D5.s outerContext, Ie.j classProto, Ke.e nameResolver, Ke.a aVar, an sourceElement) {
        super((ff.l) ((K) outerContext.alpha).alpha, Zd.a.alpha(nameResolver, classProto.teal).india());
        int i4;
        int i5;
        Xe.o oVar;
        J2.i iVar;
        C1661i c1661i;
        cf.r rVar;
        InterfaceC2472h uVar;
        int collectionSizeOrDefault;
        int i10 = 2;
        int i11 = 4;
        int i12 = 3;
        int i13 = 1;
        int i14 = 5;
        Intrinsics.echo(outerContext, "outerContext");
        Intrinsics.echo(classProto, "classProto");
        Intrinsics.echo(nameResolver, "nameResolver");
        Intrinsics.echo(sourceElement, "sourceElement");
        this.teal = classProto;
        this.white = aVar;
        this.yellow = sourceElement;
        this.f12583a = Zd.a.alpha(nameResolver, classProto.teal);
        this.f12584b = C0853i.echo((aa) Ke.d.echo.echo(classProto.silver));
        this.f12585c = AbstractC0417a.alpha((E) Ke.d.delta.echo(classProto.silver));
        Ie.i iVar2 = (Ie.i) Ke.d.foxtrot.echo(classProto.silver);
        if (iVar2 == null) {
            i4 = -1;
        } else {
            i4 = cf.t.$EnumSwitchMapping$3[iVar2.ordinal()];
        }
        switch (i4) {
            case 2:
                i5 = 2;
                break;
            case 3:
                i5 = 3;
                break;
            case 4:
                i5 = 4;
                break;
            case 5:
                i5 = 5;
                break;
            case 6:
            case 7:
                i5 = 6;
                break;
            default:
                i5 = 1;
                break;
        }
        this.f12586d = i5;
        List list = classProto.yellow;
        Intrinsics.delta(list, "classProto.typeParameterList");
        aw awVar = classProto.f1583x;
        Intrinsics.delta(awVar, "classProto.typeTable");
        G6.j jVar = new G6.j(awVar);
        Ke.f fVar = Ke.f.alpha;
        D d4 = classProto.f1585z;
        Intrinsics.delta(d4, "classProto.versionRequirementTable");
        D5.s alpha = outerContext.alpha(this, list, nameResolver, jVar, AbstractC2635d6.alpha(d4), aVar);
        this.e = alpha;
        K k6 = (K) alpha.alpha;
        if (i5 == 3) {
            oVar = new Xe.r((ff.l) k6.alpha, this);
        } else {
            oVar = Xe.m.bravo;
        }
        this.f12587f = oVar;
        this.f12588g = new Ce.h(this);
        ao aoVar = am.delta;
        ff.l storageManager = (ff.l) k6.alpha;
        ((gf.l) ((InterfaceC1796k) k6.quebec)).getClass();
        Ce.l lVar = new Ce.l(i13, this, i14);
        aoVar.getClass();
        Intrinsics.echo(storageManager, "storageManager");
        this.f12589h = new am(this, storageManager, lVar);
        if (i5 == 3) {
            ?? obj = new Object();
            obj.silver = this;
            List list2 = this.teal.f1572m;
            Intrinsics.delta(list2, "classProto.enumEntryList");
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
            int quebec = y.quebec(collectionSizeOrDefault);
            LinkedHashMap linkedHashMap = new LinkedHashMap(quebec < 16 ? 16 : quebec);
            for (Object obj2 : list2) {
                linkedHashMap.put(Zd.a.bravo((Ke.e) this.e.bravo, ((Ie.t) obj2).silver), obj2);
            }
            obj.alpha = linkedHashMap;
            C1661i c1661i2 = (C1661i) obj.silver;
            obj.purple = ((ff.l) ((K) c1661i2.e.alpha).alpha).delta(new ap(21, obj, c1661i2));
            obj.red = ((ff.l) ((K) ((C1661i) obj.silver).e.alpha).alpha).bravo(new Xe.s(13, obj));
            iVar = obj;
        } else {
            iVar = null;
        }
        this.f12590i = iVar;
        InterfaceC2335k interfaceC2335k = (InterfaceC2335k) outerContext.charlie;
        this.f12591j = interfaceC2335k;
        ff.l lVar2 = (ff.l) k6.alpha;
        C1660h c1660h = new C1660h(this, i11);
        lVar2.getClass();
        this.f12592k = new ff.h(lVar2, c1660h);
        this.f12593l = lVar2.bravo(new C1660h(this, i12));
        C1660h c1660h2 = new C1660h(this, i10);
        lVar2.getClass();
        this.f12594m = new ff.h(lVar2, c1660h2);
        this.f12595n = lVar2.bravo(new C1660h(this, i14));
        C1660h c1660h3 = new C1660h(this, 6);
        lVar2.getClass();
        this.f12596o = new ff.h(lVar2, c1660h3);
        if (interfaceC2335k instanceof C1661i) {
            c1661i = (C1661i) interfaceC2335k;
        } else {
            c1661i = null;
        }
        if (c1661i != null) {
            rVar = c1661i.f12597p;
        } else {
            rVar = null;
        }
        this.f12597p = new cf.r(classProto, (Ke.e) alpha.bravo, (G6.j) alpha.delta, sourceElement, rVar);
        if (!Ke.d.charlie.echo(classProto.silver).booleanValue()) {
            uVar = C2471g.alpha;
        } else {
            uVar = new u(lVar2, new C1660h(this, 1));
        }
        this.f12598q = uVar;
    }

    @Override // pe.InterfaceC2330f
    public final boolean B() {
        return Ke.d.hotel.echo(this.teal.silver).booleanValue();
    }

    @Override // pe.InterfaceC2330f
    public final boolean azure() {
        return Ke.d.lima.echo(this.teal.silver).booleanValue();
    }

    @Override // pe.InterfaceC2330f
    public final int c() {
        return this.f12586d;
    }

    @Override // pe.InterfaceC2330f
    public final Collection coral() {
        return (Collection) this.f12595n.invoke();
    }

    public final C1659g cyan() {
        ((gf.l) ((InterfaceC1796k) ((K) this.e.alpha).quebec)).getClass();
        am amVar = this.f12589h;
        Ue.e.juliet(amVar.alpha);
        return (C1659g) ((Xe.n) K4.alpha(amVar.charlie, am.echo[0]));
    }

    @Override // pe.InterfaceC2336l
    public final an echo() {
        return this.yellow;
    }

    @Override // pe.InterfaceC2348x
    public final boolean emerald() {
        return Ke.d.juliet.echo(this.teal.silver).booleanValue();
    }

    @Override // qe.InterfaceC2465a
    public final InterfaceC2472h getAnnotations() {
        return this.f12598q;
    }

    @Override // pe.InterfaceC2330f, pe.InterfaceC2338n, pe.InterfaceC2348x
    public final C2339o getVisibility() {
        return this.f12585c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002d, code lost:
    
        if (r1 == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ae gold(Ne.f fVar) {
        Iterator it = cyan().foxtrot(fVar, EnumC3339b.yellow).iterator();
        kotlin.reflect.jvm.internal.impl.types.y yVar = null;
        boolean z2 = false;
        Object obj = null;
        while (true) {
            if (it.hasNext()) {
                Object next = it.next();
                if (((al) next).g() == null) {
                    if (z2) {
                        break;
                    }
                    z2 = true;
                    obj = next;
                }
            }
        }
        al alVar = (al) obj;
        if (alVar != null) {
            yVar = alVar.getType();
        }
        return (ae) yVar;
    }

    @Override // pe.InterfaceC2330f, pe.InterfaceC2348x
    public final int golf() {
        return this.f12584b;
    }

    @Override // pe.InterfaceC2330f
    public final boolean hotel() {
        if (Ke.d.kilo.echo(this.teal.silver).booleanValue() && this.white.alpha(1, 4, 2)) {
            return true;
        }
        return false;
    }

    @Override // pe.InterfaceC2333i
    public final boolean india() {
        return Ke.d.golf.echo(this.teal.silver).booleanValue();
    }

    @Override // pe.InterfaceC2348x
    public final boolean isExternal() {
        return Ke.d.india.echo(this.teal.silver).booleanValue();
    }

    @Override // pe.InterfaceC2330f
    public final boolean isInline() {
        if (Ke.d.kilo.echo(this.teal.silver).booleanValue()) {
            Ke.a aVar = this.white;
            int i4 = aVar.bravo;
            if (i4 >= 1) {
                if (i4 <= 1) {
                    int i5 = aVar.charlie;
                    if (i5 >= 4 && (i5 > 4 || aVar.delta > 1)) {
                        return false;
                    }
                } else {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override // pe.InterfaceC2330f
    public final C2859i lavender() {
        return (C2859i) this.f12592k.invoke();
    }

    @Override // pe.InterfaceC2335k
    public final InterfaceC2335k lima() {
        return this.f12591j;
    }

    @Override // pe.InterfaceC2330f
    public final Xe.n lime() {
        return this.f12587f;
    }

    @Override // pe.InterfaceC2330f
    public final InterfaceC2330f maroon() {
        return (InterfaceC2330f) this.f12594m.invoke();
    }

    @Override // pe.InterfaceC2330f, pe.InterfaceC2333i
    public final List papa() {
        return ((z) this.e.hotel).bravo();
    }

    @Override // se.y
    public final Xe.n sierra(C1791f c1791f) {
        am amVar = this.f12589h;
        Ue.e.juliet(amVar.alpha);
        return (Xe.n) K4.alpha(amVar.charlie, am.echo[0]);
    }

    @Override // pe.InterfaceC2330f
    public final au t() {
        return (au) this.f12596o.invoke();
    }

    @Override // pe.InterfaceC2332h
    public final kotlin.reflect.jvm.internal.impl.types.ap tango() {
        return this.f12588g;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("deserialized ");
        if (emerald()) {
            str = "expect ";
        } else {
            str = "";
        }
        sb2.append(str);
        sb2.append("class ");
        sb2.append(getName());
        return sb2.toString();
    }

    @Override // pe.InterfaceC2330f
    public final boolean uniform() {
        if (Ke.d.foxtrot.echo(this.teal.silver) == Ie.i.COMPANION_OBJECT) {
            return true;
        }
        return false;
    }

    @Override // pe.InterfaceC2330f
    public final Collection xray() {
        return (Collection) this.f12593l.invoke();
    }

    @Override // pe.InterfaceC2348x
    public final boolean y() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Iterable] */
    @Override // se.AbstractC2852b, pe.InterfaceC2330f
    public final List z() {
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        D5.s sVar = this.e;
        G6.j jVar = (G6.j) sVar.delta;
        Ie.j jVar2 = this.teal;
        Intrinsics.echo(jVar2, "<this>");
        List list = jVar2.f1565f;
        boolean isEmpty = list.isEmpty();
        ?? r32 = list;
        if (isEmpty) {
            r32 = 0;
        }
        if (r32 == 0) {
            List<Integer> contextReceiverTypeIdList = jVar2.f1566g;
            Intrinsics.delta(contextReceiverTypeIdList, "contextReceiverTypeIdList");
            collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(contextReceiverTypeIdList, 10);
            r32 = new ArrayList(collectionSizeOrDefault2);
            for (Integer it : contextReceiverTypeIdList) {
                Intrinsics.delta(it, "it");
                r32.add(jVar.alpha(it.intValue()));
            }
        }
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(r32, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator it2 = r32.iterator();
        while (it2.hasNext()) {
            arrayList.add(new C2871u(C(), new Ye.a(this, ((z) sVar.hotel).golf((aq) it2.next()), (Ne.f) null), C2471g.alpha));
        }
        return arrayList;
    }
}
