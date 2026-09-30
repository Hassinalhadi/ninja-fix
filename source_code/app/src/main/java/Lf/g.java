package Lf;

import B2.q;
import Nf.InterfaceC0254l;
import Nf.az;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.n;
import kotlin.collections.v;
import kotlin.collections.w;
import kotlin.collections.y;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import s6.AbstractC2716m6;

/* loaded from: classes2.dex */
public final class g implements SerialDescriptor, InterfaceC0254l {
    public final String alpha;
    public final AbstractC2716m6 bravo;
    public final int charlie;
    public final List delta;
    public final HashSet echo;
    public final String[] foxtrot;
    public final SerialDescriptor[] golf;
    public final List[] hotel;
    public final boolean[] india;
    public final Map juliet;
    public final SerialDescriptor[] kilo;
    public final Lazy lima;

    public g(String serialName, AbstractC2716m6 abstractC2716m6, int i4, List typeParameters, a aVar) {
        int collectionSizeOrDefault;
        Intrinsics.echo(serialName, "serialName");
        Intrinsics.echo(typeParameters, "typeParameters");
        this.alpha = serialName;
        this.bravo = abstractC2716m6;
        this.charlie = i4;
        this.delta = aVar.bravo;
        ArrayList arrayList = aVar.charlie;
        this.echo = CollectionsKt.x(arrayList);
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        this.foxtrot = strArr;
        this.golf = az.charlie(aVar.echo);
        this.hotel = (List[]) aVar.foxtrot.toArray(new List[0]);
        this.india = CollectionsKt.u(aVar.golf);
        Intrinsics.echo(strArr, "<this>");
        i iVar = new i(2, new n(0, strArr));
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(iVar, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
        Iterator it = iVar.iterator();
        while (true) {
            w wVar = (w) it;
            if (((Iterator) wVar.red).hasNext()) {
                v vVar = (v) wVar.next();
                arrayList2.add(new Pair(vVar.bravo, Integer.valueOf(vVar.alpha)));
            } else {
                this.juliet = y.yankee(arrayList2);
                this.kilo = az.charlie(typeParameters);
                this.lima = LazyKt.lazy(new q(13, this));
                return;
            }
        }
    }

    @Override // Nf.InterfaceC0254l
    public final Set alpha() {
        return this.echo;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof g) {
                SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
                if (Intrinsics.areEqual(this.alpha, serialDescriptor.oscar()) && Arrays.equals(this.kilo, ((g) obj).kilo)) {
                    int romeo = serialDescriptor.romeo();
                    int i4 = this.charlie;
                    if (i4 == romeo) {
                        for (int i5 = 0; i5 < i4; i5++) {
                            SerialDescriptor[] serialDescriptorArr = this.golf;
                            if (Intrinsics.areEqual(serialDescriptorArr[i5].oscar(), serialDescriptor.uniform(i5).oscar()) && Intrinsics.areEqual(serialDescriptorArr[i5].november(), serialDescriptor.uniform(i5).november())) {
                            }
                        }
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        return this.delta;
    }

    public final int hashCode() {
        return ((Number) this.lima.getValue()).intValue();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final /* synthetic */ boolean isInline() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final AbstractC2716m6 november() {
        return this.bravo;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String oscar() {
        return this.alpha;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final /* synthetic */ boolean papa() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int quebec(String name) {
        Intrinsics.echo(name, "name");
        Integer num = (Integer) this.juliet.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int romeo() {
        return this.charlie;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String sierra(int i4) {
        return this.foxtrot[i4];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List tango(int i4) {
        return this.hotel[i4];
    }

    public final String toString() {
        return az.lima(this);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor uniform(int i4) {
        return this.golf[i4];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean victor(int i4) {
        return this.india[i4];
    }
}
