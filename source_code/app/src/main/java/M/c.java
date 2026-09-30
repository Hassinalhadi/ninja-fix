package M;

/* loaded from: classes3.dex */
public class c extends kotlin.collections.f implements K.d {
    public static final c red = new c(m.echo, 0);
    public final m alpha;
    public final int purple;

    public c(m mVar, int i4) {
        this.alpha = mVar;
        this.purple = i4;
    }

    @Override // K.d
    /* renamed from: alpha, reason: merged with bridge method [inline-methods] */
    public e builder() {
        return new e(this);
    }

    public final c bravo(Object obj, N.a aVar) {
        int i4;
        if (obj != null) {
            i4 = obj.hashCode();
        } else {
            i4 = 0;
        }
        Fe.c uniform = this.alpha.uniform(i4, 0, obj, aVar);
        if (uniform == null) {
            return this;
        }
        return new c((m) uniform.red, this.purple + uniform.purple);
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        int i4;
        if (obj != null) {
            i4 = obj.hashCode();
        } else {
            i4 = 0;
        }
        return this.alpha.delta(i4, 0, obj);
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        int i4;
        if (obj != null) {
            i4 = obj.hashCode();
        } else {
            i4 = 0;
        }
        return this.alpha.golf(i4, 0, obj);
    }
}
