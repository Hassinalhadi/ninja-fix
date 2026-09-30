package ae;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: ae.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class RunnableC0425d implements Runnable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ o purple;

    public /* synthetic */ RunnableC0425d(o oVar, int i4) {
        this.alpha = i4;
        this.purple = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.alpha) {
            case 0:
                this.purple.invalidateMenu();
                return;
            default:
                try {
                    o.access$onBackPressed$s1027565324(this.purple);
                    return;
                } catch (IllegalStateException e) {
                    if (Intrinsics.areEqual(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        return;
                    } else {
                        throw e;
                    }
                } catch (NullPointerException e4) {
                    if (!Intrinsics.areEqual(e4.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e4;
                    }
                    return;
                }
        }
    }
}
