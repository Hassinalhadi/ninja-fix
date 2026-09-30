package androidx.fragment.app;

import android.util.Log;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.fragment.app.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class RunnableC0616k implements Runnable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ i0 purple;
    public final /* synthetic */ C0620o red;

    public /* synthetic */ RunnableC0616k(i0 i0Var, C0620o c0620o, int i4) {
        this.alpha = i4;
        this.purple = i0Var;
        this.red = c0620o;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.alpha) {
            case 0:
                i0 operation = this.purple;
                Intrinsics.echo(operation, "$operation");
                C0620o this$0 = this.red;
                Intrinsics.echo(this$0, "this$0");
                if (L.gray(2)) {
                    Log.v("FragmentManager", "Transition for operation " + operation + " has completed");
                }
                operation.charlie(this$0);
                return;
            default:
                i0 operation2 = this.purple;
                Intrinsics.echo(operation2, "$operation");
                C0620o this$02 = this.red;
                Intrinsics.echo(this$02, "this$0");
                if (L.gray(2)) {
                    Log.v("FragmentManager", "Transition for operation " + operation2 + " has completed");
                }
                operation2.charlie(this$02);
                return;
        }
    }
}
