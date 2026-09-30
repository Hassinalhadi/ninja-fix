package B9;

/* renamed from: B9.r0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0062r0 extends z1.g {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f612g = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f613f;

    @Override // z1.g
    public final void foxtrot() {
        synchronized (this) {
            this.f613f = 0L;
        }
    }

    @Override // z1.g
    public final boolean juliet() {
        synchronized (this) {
            try {
                if (this.f613f != 0) {
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // z1.g
    public final void lima() {
        synchronized (this) {
            this.f613f = 1L;
        }
        oscar();
    }
}
