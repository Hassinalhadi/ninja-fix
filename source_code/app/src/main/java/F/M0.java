package F;

import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import bz.C0778c;
import delivery.samurai.android.R;
import g.C1718a;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2609a7;
import t6.AbstractC3007i3;
import t6.AbstractC3087z;

/* loaded from: classes3.dex */
public final class M0 extends ae.p {
    public Function0 alpha;
    public C0126k1 purple;
    public final View red;
    public final I0 silver;

    public M0(Function0 function0, C0126k1 c0126k1, View view, Q0.n nVar, Q0.d dVar, UUID uuid, C0778c c0778c, vf.ab abVar, boolean z2) {
        super(new ContextThemeWrapper(view.getContext(), R.style.EdgeToEdgeFloatingDialogWindowTheme), 0);
        t6.ab b0Var;
        this.alpha = function0;
        this.purple = c0126k1;
        this.red = view;
        float f5 = 8;
        Window window = getWindow();
        if (window != null) {
            window.requestFeature(1);
            window.setBackgroundDrawableResource(android.R.color.transparent);
            AbstractC3087z.charlie(window, false);
            I0 i02 = new I0(getContext(), this.purple.bravo, this.alpha, c0778c, abVar);
            i02.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
            i02.setClipChildren(false);
            i02.setElevation(dVar.lavender(f5));
            i02.setOutlineProvider(new J0(0));
            this.silver = i02;
            setContentView(i02);
            androidx.lifecycle.T.juliet(i02, androidx.lifecycle.T.delta(view));
            androidx.lifecycle.T.kilo(i02, androidx.lifecycle.T.echo(view));
            AbstractC2609a7.delta(i02, AbstractC2609a7.alpha(view));
            bravo(this.alpha, this.purple, nVar);
            C1718a c1718a = new C1718a(window.getDecorView());
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 35) {
                b0Var = new s1.d0(window, c1718a);
            } else if (i4 >= 30) {
                b0Var = new s1.d0(window, c1718a);
            } else if (i4 >= 26) {
                b0Var = new s1.b0(window, c1718a);
            } else {
                b0Var = new s1.b0(window, c1718a);
            }
            boolean z10 = !z2;
            b0Var.echo(z10);
            b0Var.delta(z10);
            AbstractC3007i3.alpha(getOnBackPressedDispatcher(), this, new K0(this, 0), 2);
            return;
        }
        throw new IllegalStateException("Dialog has no window");
    }

    public final void bravo(Function0 function0, C0126k1 c0126k1, Q0.n nVar) {
        WindowManager.LayoutParams layoutParams;
        boolean z2;
        int i4;
        int i5;
        this.alpha = function0;
        this.purple = c0126k1;
        U0.ae aeVar = c0126k1.alpha;
        ViewGroup.LayoutParams layoutParams2 = this.red.getRootView().getLayoutParams();
        if (layoutParams2 instanceof WindowManager.LayoutParams) {
            layoutParams = (WindowManager.LayoutParams) layoutParams2;
        } else {
            layoutParams = null;
        }
        int i10 = 0;
        if (layoutParams != null && (layoutParams.flags & 8192) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i11 = AbstractC0138n1.$EnumSwitchMapping$0[aeVar.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                z2 = true;
            }
        } else {
            z2 = false;
        }
        Window window = getWindow();
        Intrinsics.checkNotNull(window);
        if (z2) {
            i4 = 8192;
        } else {
            i4 = -8193;
        }
        window.setFlags(i4, 8192);
        int i12 = L0.$EnumSwitchMapping$0[nVar.ordinal()];
        if (i12 != 1) {
            if (i12 == 2) {
                i10 = 1;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        this.silver.setLayoutDirection(i10);
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setLayout(-1, -1);
        }
        Window window3 = getWindow();
        if (window3 != null) {
            if (Build.VERSION.SDK_INT >= 30) {
                i5 = 48;
            } else {
                i5 = 16;
            }
            window3.setSoftInputMode(i5);
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }

    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (onTouchEvent) {
            this.alpha.invoke();
        }
        return onTouchEvent;
    }
}
