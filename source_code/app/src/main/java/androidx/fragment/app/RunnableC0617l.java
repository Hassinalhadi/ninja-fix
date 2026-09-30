package androidx.fragment.app;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.P0;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.fragment.app.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class RunnableC0617l implements Runnable {
    public final /* synthetic */ int alpha = 0;
    public final /* synthetic */ Object purple;
    public final /* synthetic */ Object red;

    public /* synthetic */ RunnableC0617l(C0620o c0620o, ViewGroup viewGroup) {
        this.purple = c0620o;
        this.red = viewGroup;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.alpha) {
            case 0:
                d0.juliet((View) this.purple, (Rect) this.red);
                return;
            default:
                C0620o this$0 = (C0620o) this.purple;
                Intrinsics.echo(this$0, "this$0");
                ViewGroup container = (ViewGroup) this.red;
                Intrinsics.echo(container, "$container");
                Iterator it = this$0.charlie.iterator();
                while (it.hasNext()) {
                    i0 i0Var = ((C0621p) it.next()).alpha;
                    View view = i0Var.charlie.getView();
                    if (view != null) {
                        P0.yankee(i0Var.alpha, view, container);
                    }
                }
                return;
        }
    }

    public /* synthetic */ RunnableC0617l(d0 d0Var, View view, Rect rect) {
        this.purple = view;
        this.red = rect;
    }
}
