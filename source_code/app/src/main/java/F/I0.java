package F;

import android.content.Context;
import android.os.Build;
import android.window.OnBackInvokedCallback;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import bz.C0778c;
import kotlin.jvm.functions.Function0;
import t0.AbstractC2902a;

/* loaded from: classes3.dex */
public final class I0 extends AbstractC2902a {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1026b;

    /* renamed from: c, reason: collision with root package name */
    public final Function0 f1027c;

    /* renamed from: d, reason: collision with root package name */
    public final C0778c f1028d;
    public final vf.ab e;

    /* renamed from: f, reason: collision with root package name */
    public final androidx.compose.runtime.ax f1029f;

    /* renamed from: g, reason: collision with root package name */
    public Object f1030g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1031h;

    public I0(Context context, boolean z2, Function0 function0, C0778c c0778c, vf.ab abVar) {
        super(context, null);
        this.f1026b = z2;
        this.f1027c = function0;
        this.f1028d = c0778c;
        this.e = abVar;
        this.f1029f = C0564b.zulu(W.alpha);
    }

    @Override // t0.AbstractC2902a
    public final void alpha(InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(576708319);
        if (c0585q.india(this)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        if (((i5 | i4) & 3) == 2 && c0585q.bronze()) {
            c0585q.ochre();
        } else {
            ((Xd.l) ((androidx.compose.runtime.t0) this.f1029f).getValue()).invoke(c0585q, 0);
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new C0088b(this, i4, 1);
        }
    }

    @Override // t0.AbstractC2902a
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f1031h;
    }

    @Override // t0.AbstractC2902a, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int i4;
        OnBackInvokedCallback alpha;
        super.onAttachedToWindow();
        if (this.f1026b && (i4 = Build.VERSION.SDK_INT) >= 33) {
            if (this.f1030g == null) {
                Function0 function0 = this.f1027c;
                if (i4 >= 34) {
                    alpha = E0.c.lima(H0.alpha(function0, this.f1028d, this.e));
                } else {
                    alpha = C0.alpha(function0);
                }
                this.f1030g = alpha;
            }
            C0.bravo(this, this.f1030g);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (Build.VERSION.SDK_INT >= 33) {
            C0.charlie(this, this.f1030g);
        }
        this.f1030g = null;
    }
}
