package androidx.camera.core;

/* loaded from: classes3.dex */
public final /* synthetic */ class G implements Runnable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ M purple;

    public /* synthetic */ G(M m4, int i4) {
        this.alpha = i4;
        this.purple = m4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.alpha) {
            case 0:
                this.purple.foxtrot.cancel(true);
                return;
            default:
                this.purple.charlie();
                return;
        }
    }
}
