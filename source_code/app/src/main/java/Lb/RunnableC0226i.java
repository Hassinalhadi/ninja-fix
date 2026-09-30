package Lb;

import android.view.inputmethod.InputMethodManager;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Lb.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC0226i implements Runnable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ C0233p purple;

    public /* synthetic */ RunnableC0226i(C0233p c0233p, int i4) {
        this.alpha = i4;
        this.purple = c0233p;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.alpha) {
            case 0:
                C0233p c0233p = this.purple;
                if (c0233p.isAdded()) {
                    c0233p.kilo();
                    return;
                }
                return;
            default:
                Object systemService = this.purple.requireContext().getSystemService("input_method");
                Intrinsics.charlie(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                ((InputMethodManager) systemService).toggleSoftInput(2, 1);
                return;
        }
    }
}
