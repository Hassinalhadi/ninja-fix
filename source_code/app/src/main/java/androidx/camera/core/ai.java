package androidx.camera.core;

import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final /* synthetic */ class ai implements v {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;

    public /* synthetic */ ai(int i4, Object obj) {
        this.alpha = i4;
        this.purple = obj;
    }

    @Override // androidx.camera.core.v
    public final void charlie(w wVar) {
        v vVar;
        switch (this.alpha) {
            case 0:
                ak akVar = (ak) ((WeakReference) ((aj) this.purple).teal).get();
                if (akVar != null) {
                    akVar.f2935m.execute(new A2.q(26, akVar));
                    return;
                }
                return;
            default:
                S2.l lVar = (S2.l) this.purple;
                synchronized (lVar.red) {
                    try {
                        int i4 = lVar.alpha - 1;
                        lVar.alpha = i4;
                        if (lVar.purple && i4 == 0) {
                            lVar.close();
                        }
                        vVar = (v) lVar.white;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (vVar != null) {
                    vVar.charlie(wVar);
                    return;
                }
                return;
        }
    }
}
