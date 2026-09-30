package M;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class j extends kotlin.collections.j implements K.b {
    public final /* synthetic */ int alpha;
    public final c purple;

    public /* synthetic */ j(c cVar, int i4) {
        this.alpha = i4;
        this.purple = cVar;
    }

    @Override // kotlin.collections.a
    public final int alpha() {
        switch (this.alpha) {
            case 0:
                c cVar = this.purple;
                cVar.getClass();
                return cVar.purple;
            default:
                c cVar2 = this.purple;
                cVar2.getClass();
                return cVar2.purple;
        }
    }

    @Override // kotlin.collections.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        Map.Entry entry;
        switch (this.alpha) {
            case 0:
                if (!(obj instanceof Map.Entry) || (entry = (Map.Entry) obj) == null) {
                    return false;
                }
                Object key = entry.getKey();
                c cVar = this.purple;
                Object obj2 = cVar.get(key);
                if (obj2 != null) {
                    return Intrinsics.areEqual(obj2, entry.getValue());
                }
                if (entry.getValue() != null || !cVar.containsKey(entry.getKey())) {
                    return false;
                }
                return true;
            default:
                return this.purple.containsKey(obj);
        }
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.alpha) {
            case 0:
                c cVar = this.purple;
                n[] nVarArr = new n[8];
                for (int i4 = 0; i4 < 8; i4++) {
                    nVarArr[i4] = new o(0);
                }
                return new d(cVar.alpha, nVarArr);
            default:
                c cVar2 = this.purple;
                n[] nVarArr2 = new n[8];
                for (int i5 = 0; i5 < 8; i5++) {
                    nVarArr2[i5] = new o(1);
                }
                return new d(cVar2.alpha, nVarArr2);
        }
    }
}
