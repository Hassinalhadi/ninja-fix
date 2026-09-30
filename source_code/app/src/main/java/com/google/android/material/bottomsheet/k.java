package com.google.android.material.bottomsheet;

import android.content.res.ColorStateList;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import g.C1718a;
import s1.a0;
import s1.b0;
import s1.d0;
import s6.AbstractC2815x7;
import s6.G7;
import t6.ab;

/* loaded from: classes2.dex */
public final class k extends c {
    public final Boolean alpha;
    public final a0 bravo;
    public Window charlie;
    public boolean delta;

    public k(FrameLayout frameLayout, a0 a0Var) {
        ColorStateList backgroundTintList;
        Integer num;
        this.bravo = a0Var;
        g7.i iVar = BottomSheetBehavior.juliet(frameLayout).f7877b;
        if (iVar != null) {
            backgroundTintList = iVar.purple.delta;
        } else {
            backgroundTintList = frameLayout.getBackgroundTintList();
        }
        if (backgroundTintList != null) {
            this.alpha = Boolean.valueOf(AbstractC2815x7.foxtrot(backgroundTintList.getDefaultColor()));
            return;
        }
        ColorStateList bravo = G7.bravo(frameLayout.getBackground());
        if (bravo != null) {
            num = Integer.valueOf(bravo.getDefaultColor());
        } else {
            num = null;
        }
        if (num != null) {
            this.alpha = Boolean.valueOf(AbstractC2815x7.foxtrot(num.intValue()));
        } else {
            this.alpha = null;
        }
    }

    @Override // com.google.android.material.bottomsheet.c
    public final void alpha(View view) {
        delta(view);
    }

    @Override // com.google.android.material.bottomsheet.c
    public final void bravo(View view) {
        delta(view);
    }

    @Override // com.google.android.material.bottomsheet.c
    public final void charlie(int i4, View view) {
        delta(view);
    }

    public final void delta(View view) {
        ab b0Var;
        boolean booleanValue;
        ab b0Var2;
        int top = view.getTop();
        a0 a0Var = this.bravo;
        if (top < a0Var.delta()) {
            Window window = this.charlie;
            if (window != null) {
                Boolean bool = this.alpha;
                if (bool == null) {
                    booleanValue = this.delta;
                } else {
                    booleanValue = bool.booleanValue();
                }
                C1718a c1718a = new C1718a(window.getDecorView());
                int i4 = Build.VERSION.SDK_INT;
                if (i4 >= 35) {
                    b0Var2 = new d0(window, c1718a);
                } else if (i4 >= 30) {
                    b0Var2 = new d0(window, c1718a);
                } else if (i4 >= 26) {
                    b0Var2 = new b0(window, c1718a);
                } else {
                    b0Var2 = new b0(window, c1718a);
                }
                b0Var2.echo(booleanValue);
            }
            view.setPadding(view.getPaddingLeft(), a0Var.delta() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
            return;
        }
        if (view.getTop() != 0) {
            Window window2 = this.charlie;
            if (window2 != null) {
                boolean z2 = this.delta;
                C1718a c1718a2 = new C1718a(window2.getDecorView());
                int i5 = Build.VERSION.SDK_INT;
                if (i5 >= 35) {
                    b0Var = new d0(window2, c1718a2);
                } else if (i5 >= 30) {
                    b0Var = new d0(window2, c1718a2);
                } else if (i5 >= 26) {
                    b0Var = new b0(window2, c1718a2);
                } else {
                    b0Var = new b0(window2, c1718a2);
                }
                b0Var.echo(z2);
            }
            view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
        }
    }

    public final void echo(Window window) {
        ab b0Var;
        if (this.charlie != window) {
            this.charlie = window;
            if (window != null) {
                C1718a c1718a = new C1718a(window.getDecorView());
                int i4 = Build.VERSION.SDK_INT;
                if (i4 >= 35) {
                    b0Var = new d0(window, c1718a);
                } else if (i4 >= 30) {
                    b0Var = new d0(window, c1718a);
                } else if (i4 >= 26) {
                    b0Var = new b0(window, c1718a);
                } else {
                    b0Var = new b0(window, c1718a);
                }
                this.delta = b0Var.bravo();
            }
        }
    }
}
