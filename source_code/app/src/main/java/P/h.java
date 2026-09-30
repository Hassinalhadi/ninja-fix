package P;

import M.m;
import androidx.compose.runtime.G0;
import androidx.compose.runtime.N;

/* loaded from: classes3.dex */
public final class h extends M.e {
    public i yellow;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [O.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [M.c] */
    @Override // M.e, K.c
    /* renamed from: charlie, reason: merged with bridge method [inline-methods] */
    public final i build() {
        m mVar = this.red;
        i iVar = this.yellow;
        m mVar2 = iVar.alpha;
        i iVar2 = iVar;
        if (mVar != mVar2) {
            this.purple = new Object();
            iVar2 = new M.c(this.red, size());
        }
        this.yellow = iVar2;
        return iVar2;
    }

    @Override // M.e, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj instanceof N)) {
            return false;
        }
        return super.containsKey((N) obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof G0)) {
            return false;
        }
        return super.containsValue((G0) obj);
    }

    @Override // M.e, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (!(obj instanceof N)) {
            return null;
        }
        return (G0) super.get((N) obj);
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        if (!(obj instanceof N)) {
            return obj2;
        }
        return (G0) super.getOrDefault((N) obj, (G0) obj2);
    }

    @Override // M.e, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (!(obj instanceof N)) {
            return null;
        }
        return (G0) super.remove((N) obj);
    }
}
