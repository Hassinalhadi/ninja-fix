package ef;

import B9.K;
import Ie.D;
import Ie.ac;
import Ie.aw;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pe.InterfaceC2321ad;
import pe.InterfaceC2332h;
import re.InterfaceC2519c;
import s6.AbstractC2635d6;
import se.ab;
import t6.X2;
import xe.C3338a;
import xe.EnumC3339b;

/* loaded from: classes2.dex */
public final class p extends o {
    public final InterfaceC2321ad golf;
    public final String hotel;
    public final Ne.c india;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public p(InterfaceC2321ad packageDescriptor, ac proto, Ke.e nameResolver, Ke.a metadataVersion, Ge.g gVar, K components, String debugName, Function0 classNames) {
        super(r0, r2, r3, r4, classNames);
        Intrinsics.echo(packageDescriptor, "packageDescriptor");
        Intrinsics.echo(proto, "proto");
        Intrinsics.echo(nameResolver, "nameResolver");
        Intrinsics.echo(metadataVersion, "metadataVersion");
        Intrinsics.echo(components, "components");
        Intrinsics.echo(debugName, "debugName");
        Intrinsics.echo(classNames, "classNames");
        aw awVar = proto.yellow;
        Intrinsics.delta(awVar, "proto.typeTable");
        G6.j jVar = new G6.j(awVar);
        Ke.f fVar = Ke.f.alpha;
        D d4 = proto.f1426a;
        Intrinsics.delta(d4, "proto.versionRequirementTable");
        D5.s alpha = components.alpha(packageDescriptor, nameResolver, jVar, AbstractC2635d6.alpha(d4), metadataVersion, gVar);
        List list = proto.silver;
        Intrinsics.delta(list, "proto.functionList");
        List list2 = proto.teal;
        Intrinsics.delta(list2, "proto.propertyList");
        List list3 = proto.white;
        Intrinsics.delta(list3, "proto.typeAliasList");
        this.golf = packageDescriptor;
        this.hotel = debugName;
        this.india = ((ab) packageDescriptor).teal;
    }

    @Override // Xe.o, Xe.p
    public final Collection alpha(Xe.f kindFilter, Function1 nameFilter) {
        Intrinsics.echo(kindFilter, "kindFilter");
        Intrinsics.echo(nameFilter, "nameFilter");
        List india = india(kindFilter, nameFilter);
        Iterable iterable = (Iterable) ((K) this.bravo.alpha).kilo;
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, ((InterfaceC2519c) it.next()).bravo(this.india));
        }
        return CollectionsKt.a(india, arrayList);
    }

    @Override // ef.o, Xe.o, Xe.p
    public final InterfaceC2332h golf(Ne.f name, EnumC3339b location) {
        Intrinsics.echo(name, "name");
        Intrinsics.echo(location, "location");
        X2.bravo((C3338a) ((K) this.bravo.alpha).india, location, this.golf, name);
        return super.golf(name, location);
    }

    @Override // ef.o
    public final void hotel(ArrayList arrayList, Function1 nameFilter) {
        Intrinsics.echo(nameFilter, "nameFilter");
    }

    @Override // ef.o
    public final Ne.b lima(Ne.f name) {
        Intrinsics.echo(name, "name");
        return new Ne.b(this.india, name);
    }

    @Override // ef.o
    public final Set november() {
        return kotlin.collections.u.alpha;
    }

    @Override // ef.o
    public final Set oscar() {
        return kotlin.collections.u.alpha;
    }

    @Override // ef.o
    public final Set papa() {
        return kotlin.collections.u.alpha;
    }

    @Override // ef.o
    public final boolean quebec(Ne.f name) {
        Intrinsics.echo(name, "name");
        if (!super.quebec(name)) {
            Iterable iterable = (Iterable) ((K) this.bravo.alpha).kilo;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    if (((InterfaceC2519c) it.next()).alpha(this.india, name)) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        return this.hotel;
    }
}
