package androidx.camera.core;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class ak extends ag {

    /* renamed from: m, reason: collision with root package name */
    public final Executor f2935m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f2936n = new Object();

    /* renamed from: o, reason: collision with root package name */
    public ar f2937o;

    /* renamed from: p, reason: collision with root package name */
    public aj f2938p;

    public ak(Executor executor) {
        this.f2935m = executor;
    }

    @Override // androidx.camera.core.ag
    public final ar alpha(androidx.camera.core.impl.ar arVar) {
        return arVar.foxtrot();
    }

    @Override // androidx.camera.core.ag
    public final void delta() {
        synchronized (this.f2936n) {
            try {
                ar arVar = this.f2937o;
                if (arVar != null) {
                    arVar.close();
                    this.f2937o = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.ag
    public final void foxtrot(ar arVar) {
        synchronized (this.f2936n) {
            try {
                if (!this.f2934l) {
                    arVar.close();
                    return;
                }
                if (this.f2938p != null) {
                    if (arVar.red().getTimestamp() <= this.f2938p.purple.red().getTimestamp()) {
                        arVar.close();
                    } else {
                        ar arVar2 = this.f2937o;
                        if (arVar2 != null) {
                            arVar2.close();
                        }
                        this.f2937o = arVar;
                    }
                    return;
                }
                aj ajVar = new aj(arVar, this);
                this.f2938p = ajVar;
                com.google.common.util.concurrent.e charlie = charlie(ajVar);
                O7.l lVar = new O7.l(24, ajVar);
                charlie.foxtrot(new be.g(0, charlie, lVar), tg.k.bravo());
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
