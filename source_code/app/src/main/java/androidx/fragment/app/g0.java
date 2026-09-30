package androidx.fragment.app;

import android.view.View;
import androidx.appcompat.widget.P0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class g0 implements Runnable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ C0622q purple;
    public final /* synthetic */ i0 red;

    public /* synthetic */ g0(C0622q c0622q, i0 i0Var, int i4) {
        this.alpha = i4;
        this.purple = c0622q;
        this.red = i0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.alpha) {
            case 0:
                C0622q this$0 = this.purple;
                Intrinsics.echo(this$0, "this$0");
                i0 i0Var = this.red;
                if (this$0.bravo.contains(i0Var)) {
                    int i4 = i0Var.alpha;
                    View view = i0Var.charlie.mView;
                    Intrinsics.delta(view, "operation.fragment.mView");
                    P0.yankee(i4, view, this$0.alpha);
                    return;
                }
                return;
            case 1:
                C0622q this$02 = this.purple;
                Intrinsics.echo(this$02, "this$0");
                i0 operation = this.red;
                Intrinsics.echo(operation, "$operation");
                this$02.alpha(operation);
                return;
            default:
                C0622q this$03 = this.purple;
                Intrinsics.echo(this$03, "this$0");
                i0 i0Var2 = this.red;
                this$03.bravo.remove(i0Var2);
                this$03.charlie.remove(i0Var2);
                return;
        }
    }
}
