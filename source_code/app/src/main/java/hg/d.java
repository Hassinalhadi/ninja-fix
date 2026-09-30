package hg;

import av.ao;

/* loaded from: classes2.dex */
public final class d extends b {
    public Object bravo;

    @Override // hg.b
    public final Object alpha(ao aoVar) {
        Object obj = this.bravo;
        if (obj == null) {
            return super.alpha(aoVar);
        }
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException("Single instance created couldn't return value");
    }

    @Override // hg.b
    public final void bravo() {
        this.bravo = null;
    }

    @Override // hg.b
    public final Object charlie(ao aoVar) {
        synchronized (this) {
            if (this.bravo == null) {
                this.bravo = alpha(aoVar);
            }
        }
        Object obj = this.bravo;
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException("Single instance created couldn't return value");
    }
}
