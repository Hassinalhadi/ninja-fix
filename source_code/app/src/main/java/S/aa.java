package S;

import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class aa implements Map.Entry, Yd.d {
    public final Object alpha;
    public Object purple;
    public final /* synthetic */ ab red;

    public aa(ab abVar) {
        this.red = abVar;
        Map.Entry entry = abVar.silver;
        Intrinsics.checkNotNull(entry);
        this.alpha = entry.getKey();
        Map.Entry entry2 = abVar.silver;
        Intrinsics.checkNotNull(entry2);
        this.purple = entry2.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.alpha;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.purple;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        ab abVar = this.red;
        if (abVar.alpha.charlie().delta == abVar.red) {
            Object obj2 = this.purple;
            abVar.alpha.put(this.alpha, obj);
            this.purple = obj;
            return obj2;
        }
        throw new ConcurrentModificationException();
    }
}
