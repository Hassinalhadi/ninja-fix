package androidx.compose.foundation.layout;

import android.os.Build;
import android.view.View;
import java.util.List;
import s1.InterfaceC2587u;

/* loaded from: classes3.dex */
public final class av extends Pf.g implements Runnable, InterfaceC2587u, View.OnAttachStateChangeListener {
    public final b0 red;
    public boolean silver;
    public boolean teal;
    public s1.a0 white;

    public av(b0 b0Var) {
        super(!b0Var.tango ? 1 : 0);
        this.red = b0Var;
    }

    @Override // Pf.g
    public final void delta(s1.I i4) {
        this.silver = false;
        this.teal = false;
        s1.a0 a0Var = this.white;
        if (i4.alpha.bravo() > 0 && a0Var != null) {
            b0 b0Var = this.red;
            b0Var.getClass();
            s1.X x4 = a0Var.alpha;
            b0Var.sierra.foxtrot(AbstractC0538d.yankee(x4.golf(8)));
            b0Var.romeo.foxtrot(AbstractC0538d.yankee(x4.golf(8)));
            b0.alpha(b0Var, a0Var);
        }
        this.white = null;
    }

    @Override // Pf.g
    public final void echo() {
        this.silver = true;
        this.teal = true;
    }

    @Override // Pf.g
    public final s1.a0 foxtrot(s1.a0 a0Var, List list) {
        b0 b0Var = this.red;
        b0.alpha(b0Var, a0Var);
        if (b0Var.tango) {
            return s1.a0.bravo;
        }
        return a0Var;
    }

    @Override // s1.InterfaceC2587u
    public final s1.a0 gold(View view, s1.a0 a0Var) {
        this.white = a0Var;
        b0 b0Var = this.red;
        b0Var.getClass();
        s1.X x4 = a0Var.alpha;
        b0Var.romeo.foxtrot(AbstractC0538d.yankee(x4.golf(8)));
        if (this.silver) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.teal) {
            b0Var.sierra.foxtrot(AbstractC0538d.yankee(x4.golf(8)));
            b0.alpha(b0Var, a0Var);
        }
        if (b0Var.tango) {
            return s1.a0.bravo;
        }
        return a0Var;
    }

    @Override // Pf.g
    public final com.google.android.play.core.integrity.k golf(s1.I i4, com.google.android.play.core.integrity.k kVar) {
        this.silver = false;
        return kVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.silver) {
            this.silver = false;
            this.teal = false;
            s1.a0 a0Var = this.white;
            if (a0Var != null) {
                b0 b0Var = this.red;
                b0Var.getClass();
                b0Var.sierra.foxtrot(AbstractC0538d.yankee(a0Var.alpha.golf(8)));
                b0.alpha(b0Var, a0Var);
                this.white = null;
            }
        }
    }
}
