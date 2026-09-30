package d2;

import Y1.al;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.ab;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: d2.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1576a extends Y1.f {
    public final al romeo;

    public C1576a(Class cls) {
        super(true);
        this.romeo = new al(cls);
    }

    @Override // Y1.aq
    public final Object alpha(Bundle bundle, String key) {
        Intrinsics.echo(bundle, "bundle");
        Intrinsics.echo(key, "key");
        Object obj = bundle.get(key);
        if (obj instanceof List) {
            return (List) obj;
        }
        return null;
    }

    @Override // Y1.aq
    public final String bravo() {
        return "List<" + this.romeo.sierra.getName() + "}>";
    }

    @Override // Y1.aq
    public final Object charlie(Object obj, String str) {
        List list = (List) obj;
        al alVar = this.romeo;
        if (list != null) {
            return CollectionsKt.a(list, ab.juliet(alVar.delta(str)));
        }
        return ab.juliet(alVar.delta(str));
    }

    @Override // Y1.aq
    public final Object delta(String value) {
        Intrinsics.echo(value, "value");
        return ab.juliet(this.romeo.delta(value));
    }

    @Override // Y1.aq
    public final void echo(Bundle bundle, String key, Object obj) {
        ArrayList arrayList;
        List list = (List) obj;
        Intrinsics.echo(key, "key");
        if (list != null) {
            arrayList = new ArrayList(list);
        } else {
            arrayList = null;
        }
        bundle.putSerializable(key, arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1576a)) {
            return false;
        }
        return Intrinsics.areEqual(this.romeo, ((C1576a) obj).romeo);
    }

    @Override // Y1.f
    public final Object golf() {
        return CollectionsKt.emptyList();
    }

    public final int hashCode() {
        return this.romeo.romeo.hashCode();
    }

    @Override // Y1.f
    public final List hotel(Object obj) {
        int collectionSizeOrDefault;
        List list = (List) obj;
        if (list != null) {
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((Enum) it.next()).toString());
            }
            return arrayList;
        }
        return CollectionsKt.emptyList();
    }
}
