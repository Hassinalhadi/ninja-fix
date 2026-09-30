package kg;

import ge.InterfaceC1772d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a {
    public final List alpha = new ArrayList();
    public int bravo;

    public final Object alpha(InterfaceC1772d clazz) {
        Object obj;
        Intrinsics.echo(clazz, "clazz");
        List list = this.alpha;
        if (list.isEmpty()) {
            return null;
        }
        int i4 = this.bravo;
        List list2 = this.alpha;
        Object obj2 = list2.get(i4);
        Object obj3 = null;
        if (!clazz.november(obj2)) {
            obj2 = null;
        }
        if (obj2 != null) {
            obj3 = obj2;
        }
        if (obj3 != null && this.bravo < CollectionsKt.ivory(list2)) {
            this.bravo++;
        }
        if (obj3 == null) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (clazz.november(obj)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            if (obj == null) {
                return null;
            }
            return obj;
        }
        return obj3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                if (Intrinsics.areEqual(this.alpha, ((a) obj).alpha) && Intrinsics.areEqual(null, null)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.alpha.hashCode() * 31;
    }

    public final String toString() {
        return "DefinitionParameters" + CollectionsKt.z(this.alpha);
    }
}
