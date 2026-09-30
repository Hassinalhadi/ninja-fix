package androidx.fragment.app;

/* loaded from: classes3.dex */
public final class r implements Runnable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;

    public /* synthetic */ r(int i4, Object obj) {
        this.alpha = i4;
        this.purple = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.alpha) {
            case 0:
                DialogInterfaceOnCancelListenerC0627w dialogInterfaceOnCancelListenerC0627w = (DialogInterfaceOnCancelListenerC0627w) this.purple;
                dialogInterfaceOnCancelListenerC0627w.silver.onDismiss(dialogInterfaceOnCancelListenerC0627w.e);
                return;
            case 1:
                C0622q c0622q = (C0622q) this.purple;
                if (!c0622q.bravo.isEmpty()) {
                    c0622q.echo();
                    return;
                }
                return;
            default:
                ((L) this.purple).zulu(true);
                return;
        }
    }
}
