package ne;

import com.google.android.material.datepicker.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.ax;
import kotlin.reflect.jvm.internal.impl.types.y;
import lf.w;
import pe.InterfaceC2335k;
import pe.InterfaceC2345u;
import pe.an;
import qe.C2471g;
import qe.InterfaceC2472h;
import s6.D6;
import se.AbstractC2870t;
import se.C2869s;
import se.ak;
import se.aq;

/* renamed from: ne.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2183g extends ak {
    public C2183g(InterfaceC2335k interfaceC2335k, C2183g c2183g, int i4, boolean z2) {
        super(interfaceC2335k, c2183g, C2471g.alpha, w.golf, i4, an.magenta);
        this.f13780f = true;
        this.f13788n = z2;
        this.f13789o = false;
    }

    @Override // se.ak, se.AbstractC2870t
    public final AbstractC2870t b0(int i4, Ne.f fVar, InterfaceC2335k newOwner, InterfaceC2345u interfaceC2345u, an anVar, InterfaceC2472h annotations) {
        Intrinsics.echo(newOwner, "newOwner");
        j.papa(i4, "kind");
        Intrinsics.echo(annotations, "annotations");
        return new C2183g(newOwner, (C2183g) interfaceC2345u, i4, this.f13788n);
    }

    @Override // se.AbstractC2870t
    public final AbstractC2870t c0(C2869s configuration) {
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        Ne.f fVar;
        Intrinsics.echo(configuration, "configuration");
        C2183g c2183g = (C2183g) super.c0(configuration);
        if (c2183g == null) {
            return null;
        }
        List peach = c2183g.peach();
        Intrinsics.delta(peach, "substituted.valueParameters");
        if (!peach.isEmpty()) {
            Iterator it = peach.iterator();
            while (it.hasNext()) {
                y type = ((aq) it.next()).getType();
                Intrinsics.delta(type, "it.type");
                if (D6.charlie(type) != null) {
                    List peach2 = c2183g.peach();
                    Intrinsics.delta(peach2, "substituted.valueParameters");
                    collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(peach2, 10);
                    ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                    Iterator it2 = peach2.iterator();
                    while (it2.hasNext()) {
                        y type2 = ((aq) it2.next()).getType();
                        Intrinsics.delta(type2, "it.type");
                        arrayList.add(D6.charlie(type2));
                    }
                    int size = c2183g.peach().size() - arrayList.size();
                    boolean z2 = true;
                    if (size == 0) {
                        List valueParameters = c2183g.peach();
                        Intrinsics.delta(valueParameters, "valueParameters");
                        ArrayList H10 = CollectionsKt.H(arrayList, valueParameters);
                        if (!H10.isEmpty()) {
                            Iterator it3 = H10.iterator();
                            while (it3.hasNext()) {
                                Pair pair = (Pair) it3.next();
                                if (!Intrinsics.areEqual((Ne.f) pair.first, ((aq) pair.second).getName())) {
                                }
                            }
                            return c2183g;
                        }
                        return c2183g;
                    }
                    List<aq> valueParameters2 = c2183g.peach();
                    Intrinsics.delta(valueParameters2, "valueParameters");
                    collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(valueParameters2, 10);
                    ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
                    for (aq aqVar : valueParameters2) {
                        Ne.f name = aqVar.getName();
                        Intrinsics.delta(name, "it.name");
                        int i4 = aqVar.white;
                        int i5 = i4 - size;
                        if (i5 >= 0 && (fVar = (Ne.f) arrayList.get(i5)) != null) {
                            name = fVar;
                        }
                        arrayList2.add(aqVar.Z(c2183g, name, i4));
                    }
                    C2869s f02 = c2183g.f0(ax.bravo);
                    if (!arrayList.isEmpty()) {
                        Iterator it4 = arrayList.iterator();
                        while (it4.hasNext()) {
                            if (((Ne.f) it4.next()) == null) {
                                break;
                            }
                        }
                    }
                    z2 = false;
                    f02.f13773o = Boolean.valueOf(z2);
                    f02.yellow = arrayList2;
                    f02.teal = c2183g.alpha();
                    AbstractC2870t c02 = super.c0(f02);
                    Intrinsics.checkNotNull(c02);
                    return c02;
                }
            }
            return c2183g;
        }
        return c2183g;
    }

    @Override // se.AbstractC2870t, pe.InterfaceC2348x
    public final boolean isExternal() {
        return false;
    }

    @Override // se.AbstractC2870t, pe.InterfaceC2345u
    public final boolean isInline() {
        return false;
    }

    @Override // se.AbstractC2870t, pe.InterfaceC2345u
    public final boolean jade() {
        return false;
    }
}
