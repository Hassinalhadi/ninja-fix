package zd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class r implements p {
    public final Map charlie;

    public r(Map values) {
        Intrinsics.echo(values, "values");
        g gVar = new g();
        for (Map.Entry entry : values.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i4 = 0; i4 < size; i4++) {
                arrayList.add((String) list.get(i4));
            }
            gVar.put(str, arrayList);
        }
        this.charlie = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (true != pVar.golf()) {
                return false;
            }
            return Intrinsics.areEqual(foxtrot(), pVar.foxtrot());
        }
        return false;
    }

    @Override // zd.p
    public final Set foxtrot() {
        Set entrySet = this.charlie.entrySet();
        Intrinsics.echo(entrySet, "<this>");
        Set unmodifiableSet = Collections.unmodifiableSet(entrySet);
        Intrinsics.delta(unmodifiableSet, "unmodifiableSet(...)");
        return unmodifiableSet;
    }

    @Override // zd.p
    public final String get(String str) {
        List list = (List) this.charlie.get(str);
        if (list != null) {
            return (String) CollectionsKt.green(list);
        }
        return null;
    }

    @Override // zd.p
    public final boolean golf() {
        return true;
    }

    public final int hashCode() {
        return foxtrot().hashCode() + 1182991;
    }

    @Override // zd.p
    public final void hotel(Xd.l lVar) {
        for (Map.Entry entry : this.charlie.entrySet()) {
            lVar.invoke((String) entry.getKey(), (List) entry.getValue());
        }
    }

    @Override // zd.p
    public final boolean india() {
        if (((List) this.charlie.get("Content-Encoding")) != null) {
            return true;
        }
        return false;
    }

    @Override // zd.p
    public final boolean isEmpty() {
        return this.charlie.isEmpty();
    }
}
