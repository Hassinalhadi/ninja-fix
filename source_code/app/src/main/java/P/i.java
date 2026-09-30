package P;

import M.m;
import androidx.compose.runtime.G0;
import androidx.compose.runtime.I;
import androidx.compose.runtime.N;

/* loaded from: classes3.dex */
public final class i extends M.c implements I {
    public static final i silver = new M.c(m.echo, 0);

    /* JADX WARN: Type inference failed for: r0v0, types: [M.e, P.h] */
    @Override // M.c
    /* renamed from: alpha */
    public final M.e builder() {
        ?? eVar = new M.e(this);
        eVar.yellow = this;
        return eVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [K.c, M.e, P.h] */
    @Override // M.c, K.d
    public final K.c builder() {
        ?? eVar = new M.e(this);
        eVar.yellow = this;
        return eVar;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [M.c, P.i] */
    public final i charlie(N n5, G0 g02) {
        Fe.c uniform = this.alpha.uniform(n5.hashCode(), 0, n5, g02);
        if (uniform == null) {
            return this;
        }
        return new M.c((m) uniform.red, this.purple + uniform.purple);
    }

    @Override // M.c, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj instanceof N)) {
            return false;
        }
        return super.containsKey((N) obj);
    }

    @Override // kotlin.collections.f, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof G0)) {
            return false;
        }
        return super.containsValue((G0) obj);
    }

    @Override // M.c, java.util.Map
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
}
