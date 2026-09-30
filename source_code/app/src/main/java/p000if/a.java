package p000if;

import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.types.as;

/* loaded from: classes2.dex */
public final class a extends ArrayList implements e {
    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof as)) {
            return false;
        }
        return super.contains((as) obj);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof as)) {
            return -1;
        }
        return super.indexOf((as) obj);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof as)) {
            return -1;
        }
        return super.lastIndexOf((as) obj);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof as)) {
            return false;
        }
        return super.remove((as) obj);
    }
}
