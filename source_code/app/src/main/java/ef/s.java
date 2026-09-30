package ef;

import Ie.as;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.ab;
import kotlin.reflect.jvm.internal.impl.types.ae;
import kotlin.reflect.jvm.internal.impl.types.al;
import kotlin.reflect.jvm.internal.impl.types.ap;
import kotlin.reflect.jvm.internal.impl.types.ax;
import kotlin.reflect.jvm.internal.impl.types.az;
import kotlin.reflect.jvm.internal.impl.types.y;
import kotlin.text.Regex;
import pe.AbstractC2347w;
import pe.C2339o;
import pe.InterfaceC2330f;
import pe.InterfaceC2332h;
import pe.InterfaceC2333i;
import pe.InterfaceC2335k;
import pe.InterfaceC2336l;
import pe.InterfaceC2337m;
import pe.an;
import qe.C2470f;
import qe.C2471g;
import qe.InterfaceC2472h;
import se.AbstractC2864n;
import se.AbstractC2870t;
import se.C2854d;
import se.C2855e;
import se.C2859i;
import se.C2871u;
import se.ac;

/* loaded from: classes2.dex */
public final class s extends AbstractC2864n implements InterfaceC1663k, InterfaceC2333i {

    /* renamed from: a, reason: collision with root package name */
    public final ff.l f12608a;

    /* renamed from: b, reason: collision with root package name */
    public final as f12609b;

    /* renamed from: c, reason: collision with root package name */
    public final Ke.e f12610c;

    /* renamed from: d, reason: collision with root package name */
    public final G6.j f12611d;
    public final Ke.f e;

    /* renamed from: f, reason: collision with root package name */
    public final Ge.g f12612f;

    /* renamed from: g, reason: collision with root package name */
    public ae f12613g;

    /* renamed from: h, reason: collision with root package name */
    public ae f12614h;

    /* renamed from: i, reason: collision with root package name */
    public List f12615i;

    /* renamed from: j, reason: collision with root package name */
    public ae f12616j;
    public final C2339o teal;
    public List white;
    public final C2855e yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(ff.l storageManager, InterfaceC2335k containingDeclaration, InterfaceC2472h interfaceC2472h, Ne.f fVar, C2339o visibility, as proto, Ke.e nameResolver, G6.j typeTable, Ke.f versionRequirementTable, Ge.g gVar) {
        super(containingDeclaration, interfaceC2472h, fVar, an.magenta);
        Intrinsics.echo(storageManager, "storageManager");
        Intrinsics.echo(containingDeclaration, "containingDeclaration");
        Intrinsics.echo(visibility, "visibility");
        Intrinsics.echo(proto, "proto");
        Intrinsics.echo(nameResolver, "nameResolver");
        Intrinsics.echo(typeTable, "typeTable");
        Intrinsics.echo(versionRequirementTable, "versionRequirementTable");
        this.teal = visibility;
        this.yellow = new C2855e(this);
        this.f12608a = storageManager;
        this.f12609b = proto;
        this.f12610c = nameResolver;
        this.f12611d = typeTable;
        this.e = versionRequirementTable;
        this.f12612f = gVar;
    }

    @Override // se.AbstractC2864n
    /* renamed from: Y */
    public final InterfaceC2336l alpha() {
        return this;
    }

    public final InterfaceC2330f Z() {
        if (!kotlin.reflect.jvm.internal.impl.types.c.india(a0())) {
            InterfaceC2332h kilo = a0().green().kilo();
            if (kilo instanceof InterfaceC2330f) {
                return (InterfaceC2330f) kilo;
            }
            return null;
        }
        return null;
    }

    public final ae a0() {
        ae aeVar = this.f12614h;
        if (aeVar != null) {
            return aeVar;
        }
        Intrinsics.lima("expandedType");
        throw null;
    }

    @Override // se.AbstractC2864n, se.AbstractC2863m, pe.InterfaceC2335k, pe.InterfaceC2332h
    public final InterfaceC2332h alpha() {
        return this;
    }

    public final ae b0() {
        ae aeVar = this.f12613g;
        if (aeVar != null) {
            return aeVar;
        }
        Intrinsics.lima("underlyingType");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01c1 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c0(List declaredTypeParameters, ae underlyingType, ae expandedType) {
        Xe.n nVar;
        ae echo;
        ax delta;
        C2859i delta2;
        C2871u c2871u;
        List emptyList;
        se.an anVar;
        int collectionSizeOrDefault;
        int i4 = 1;
        int i5 = 0;
        Intrinsics.echo(declaredTypeParameters, "declaredTypeParameters");
        Intrinsics.echo(underlyingType, "underlyingType");
        Intrinsics.echo(expandedType, "expandedType");
        this.white = declaredTypeParameters;
        this.f12613g = underlyingType;
        this.f12614h = expandedType;
        this.f12615i = AbstractC2347w.charlie(this);
        InterfaceC2330f Z4 = Z();
        if (Z4 == null || (nVar = Z4.x()) == null) {
            nVar = Xe.m.bravo;
        }
        Xe.n nVar2 = nVar;
        C2854d c2854d = new C2854d(this, i5);
        hf.f fVar = az.alpha;
        if (hf.i.foxtrot(this)) {
            echo = hf.i.charlie(hf.h.f12725d, toString());
        } else {
            ap tango = tango();
            if (tango != null) {
                List echo2 = az.echo(((C2855e) tango).getParameters());
                al.purple.getClass();
                echo = ab.echo(al.red, tango, echo2, false, nVar2, c2854d);
            } else {
                az.alpha(12);
                throw null;
            }
        }
        this.f12616j = echo;
        InterfaceC2330f Z6 = Z();
        if (Z6 == null) {
            CollectionsKt.emptyList();
            return;
        }
        Collection<C2859i> xray = Z6.xray();
        Intrinsics.delta(xray, "classDescriptor.constructors");
        ArrayList arrayList = new ArrayList();
        for (C2859i it : xray) {
            ac acVar = se.an.f13740z;
            Intrinsics.delta(it, "it");
            acVar.getClass();
            ff.l storageManager = this.f12608a;
            Intrinsics.echo(storageManager, "storageManager");
            if (Z() == null) {
                delta = null;
            } else {
                delta = ax.delta(a0());
            }
            if (delta != null && (delta2 = it.delta(delta)) != null) {
                InterfaceC2472h annotations = it.getAnnotations();
                C2859i c2859i = it;
                int november = c2859i.november();
                com.google.android.material.datepicker.j.sierra(november, "constructor.kind");
                an echo3 = echo();
                Intrinsics.delta(echo3, "typeAliasDescriptor.source");
                se.an anVar2 = new se.an(storageManager, this, delta2, null, annotations, november, echo3);
                List peach = c2859i.peach();
                if (peach != null) {
                    ax axVar = delta;
                    ArrayList d02 = AbstractC2870t.d0(anVar2, peach, axVar, false, false, null);
                    if (d02 != null) {
                        ae zulu = kotlin.reflect.jvm.internal.impl.types.c.zulu(kotlin.reflect.jvm.internal.impl.types.c.kilo(delta2.yellow.ochre()), oscar());
                        C2871u c2871u2 = c2859i.f13778c;
                        C2470f c2470f = C2471g.alpha;
                        if (c2871u2 != null) {
                            c2871u = Qe.l.kilo(anVar2, axVar.golf(i4, c2871u2.getType()), c2470f);
                        } else {
                            c2871u = null;
                        }
                        InterfaceC2330f Z10 = Z();
                        if (Z10 != null) {
                            List l10 = c2859i.l();
                            Intrinsics.delta(l10, "constructor.contextReceiverParameters");
                            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(l10, 10);
                            emptyList = new ArrayList(collectionSizeOrDefault);
                            int i10 = 0;
                            for (Object obj : l10) {
                                int i11 = i10 + 1;
                                if (i10 < 0) {
                                    CollectionsKt.throwIndexOverflow();
                                }
                                C2871u c2871u3 = (C2871u) obj;
                                y golf = axVar.golf(i4, c2871u3.getType());
                                Ye.d Z11 = c2871u3.Z();
                                Intrinsics.charlie(Z11, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.receivers.ImplicitContextReceiver");
                                Ye.a aVar = new Ye.a(Z10, golf, ((Ye.a) Z11).X());
                                Regex regex = Ne.g.alpha;
                                emptyList.add(new C2871u(Z10, aVar, c2470f, Ne.f.echo("_context_receiver_" + i10)));
                                i10 = i11;
                                i4 = 1;
                            }
                        } else {
                            emptyList = CollectionsKt.emptyList();
                        }
                        anVar2.e0(c2871u, null, emptyList, papa(), d02, zulu, 1, this.teal);
                        anVar = anVar2;
                        if (anVar == null) {
                            arrayList.add(anVar);
                        }
                        i4 = 1;
                    }
                } else {
                    AbstractC2870t.D(28);
                    throw null;
                }
            }
            anVar = null;
            if (anVar == null) {
            }
            i4 = 1;
        }
    }

    @Override // pe.ap
    public final InterfaceC2336l delta(ax substitutor) {
        Intrinsics.echo(substitutor, "substitutor");
        if (substitutor.alpha.echo()) {
            return this;
        }
        InterfaceC2335k containingDeclaration = lima();
        Intrinsics.delta(containingDeclaration, "containingDeclaration");
        InterfaceC2472h annotations = getAnnotations();
        Intrinsics.delta(annotations, "annotations");
        Ne.f name = getName();
        Intrinsics.delta(name, "name");
        s sVar = new s(this.f12608a, containingDeclaration, annotations, name, this.teal, this.f12609b, this.f12610c, this.f12611d, this.e, this.f12612f);
        sVar.c0(papa(), kotlin.reflect.jvm.internal.impl.types.c.bravo(substitutor.golf(1, b0())), kotlin.reflect.jvm.internal.impl.types.c.bravo(substitutor.golf(1, a0())));
        return sVar;
    }

    @Override // pe.InterfaceC2348x
    public final boolean emerald() {
        return false;
    }

    @Override // pe.InterfaceC2348x
    public final C2339o getVisibility() {
        return this.teal;
    }

    @Override // pe.InterfaceC2333i
    public final boolean india() {
        return az.delta(b0(), new C2854d(this, 1), null);
    }

    @Override // pe.InterfaceC2348x
    public final boolean isExternal() {
        return false;
    }

    @Override // ef.InterfaceC1663k
    public final G6.j magenta() {
        throw null;
    }

    @Override // pe.InterfaceC2332h
    public final ae oscar() {
        ae aeVar = this.f12616j;
        if (aeVar != null) {
            return aeVar;
        }
        Intrinsics.lima("defaultTypeImpl");
        throw null;
    }

    @Override // pe.InterfaceC2333i
    public final List papa() {
        List list = this.white;
        if (list != null) {
            return list;
        }
        Intrinsics.lima("declaredTypeParametersImpl");
        throw null;
    }

    @Override // ef.InterfaceC1663k
    public final Ke.e plum() {
        throw null;
    }

    @Override // pe.InterfaceC2335k
    public final Object quebec(InterfaceC2337m interfaceC2337m, Object obj) {
        return interfaceC2337m.navy(this, obj);
    }

    @Override // pe.InterfaceC2332h
    public final ap tango() {
        return this.yellow;
    }

    @Override // ef.InterfaceC1663k
    public final InterfaceC1662j teal() {
        return this.f12612f;
    }

    @Override // se.AbstractC2863m
    public final String toString() {
        return "typealias " + getName().bravo();
    }

    @Override // pe.InterfaceC2348x
    public final boolean y() {
        return false;
    }

    @Override // se.AbstractC2864n, se.AbstractC2863m, pe.InterfaceC2335k, pe.InterfaceC2332h
    public final InterfaceC2335k alpha() {
        return this;
    }
}
