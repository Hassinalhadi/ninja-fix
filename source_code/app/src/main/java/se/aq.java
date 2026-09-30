package se;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.ax;
import ne.C2183g;
import pe.AbstractC2340p;
import pe.C2339o;
import pe.InterfaceC2326b;
import pe.InterfaceC2328d;
import pe.InterfaceC2335k;
import pe.InterfaceC2336l;
import pe.InterfaceC2337m;
import pe.aw;
import qe.InterfaceC2472h;

/* loaded from: classes2.dex */
public class aq extends ar implements pe.aj, aw {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f13745a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f13746b;

    /* renamed from: c, reason: collision with root package name */
    public final kotlin.reflect.jvm.internal.impl.types.y f13747c;

    /* renamed from: d, reason: collision with root package name */
    public final aq f13748d;
    public final int white;
    public final boolean yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aq(InterfaceC2326b containingDeclaration, aq aqVar, int i4, InterfaceC2472h annotations, Ne.f name, kotlin.reflect.jvm.internal.impl.types.y outType, boolean z2, boolean z10, boolean z11, kotlin.reflect.jvm.internal.impl.types.y yVar, pe.an source) {
        super(containingDeclaration, annotations, name, outType, source);
        aq aqVar2;
        Intrinsics.echo(containingDeclaration, "containingDeclaration");
        Intrinsics.echo(annotations, "annotations");
        Intrinsics.echo(name, "name");
        Intrinsics.echo(outType, "outType");
        Intrinsics.echo(source, "source");
        this.white = i4;
        this.yellow = z2;
        this.f13745a = z10;
        this.f13746b = z11;
        this.f13747c = yVar;
        if (aqVar == null) {
            aqVar2 = this;
        } else {
            aqVar2 = aqVar;
        }
        this.f13748d = aqVar2;
    }

    public aq Z(C2183g c2183g, Ne.f fVar, int i4) {
        InterfaceC2472h annotations = getAnnotations();
        Intrinsics.delta(annotations, "annotations");
        kotlin.reflect.jvm.internal.impl.types.y type = getType();
        Intrinsics.delta(type, "type");
        boolean a02 = a0();
        pe.ao aoVar = pe.an.magenta;
        return new aq(c2183g, null, i4, annotations, fVar, type, a02, this.f13745a, this.f13746b, this.f13747c, aoVar);
    }

    public final boolean a0() {
        if (this.yellow && ((InterfaceC2328d) lima()).november() != 2) {
            return true;
        }
        return false;
    }

    @Override // se.AbstractC2864n, pe.InterfaceC2335k
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public final InterfaceC2326b lima() {
        InterfaceC2335k lima = super.lima();
        Intrinsics.charlie(lima, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        return (InterfaceC2326b) lima;
    }

    @Override // se.AbstractC2864n, se.AbstractC2863m, pe.InterfaceC2335k, pe.InterfaceC2332h
    /* renamed from: c0, reason: merged with bridge method [inline-methods] */
    public final aq alpha() {
        aq aqVar = this.f13748d;
        if (aqVar == this) {
            return this;
        }
        return aqVar.alpha();
    }

    @Override // pe.ap
    public final InterfaceC2336l delta(ax substitutor) {
        Intrinsics.echo(substitutor, "substitutor");
        if (substitutor.alpha.echo()) {
            return this;
        }
        throw new UnsupportedOperationException();
    }

    @Override // pe.aw
    public final boolean e() {
        return false;
    }

    @Override // pe.InterfaceC2338n, pe.InterfaceC2348x
    public final C2339o getVisibility() {
        C2339o LOCAL = AbstractC2340p.foxtrot;
        Intrinsics.delta(LOCAL, "LOCAL");
        return LOCAL;
    }

    @Override // pe.InterfaceC2326b
    public final Collection mike() {
        int collectionSizeOrDefault;
        Collection mike = lima().mike();
        Intrinsics.delta(mike, "containingDeclaration.overriddenDescriptors");
        Collection collection = mike;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(collection, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add((aq) ((InterfaceC2326b) it.next()).peach().get(this.white));
        }
        return arrayList;
    }

    @Override // pe.aw
    public final /* bridge */ /* synthetic */ Se.g navy() {
        return null;
    }

    @Override // pe.InterfaceC2335k
    public final Object quebec(InterfaceC2337m interfaceC2337m, Object obj) {
        return interfaceC2337m.maroon(this, obj);
    }
}
