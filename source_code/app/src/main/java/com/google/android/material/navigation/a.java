package com.google.android.material.navigation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;
import s1.D;
import s1.I;
import s1.InterfaceC2566A;
import x2.z;

/* loaded from: classes2.dex */
public final class a extends AnimatorListenerAdapter {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object bravo;
    public final /* synthetic */ Object charlie;

    public /* synthetic */ a(View view, int i4, Object obj) {
        this.alpha = i4;
        this.bravo = obj;
        this.charlie = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.alpha) {
            case 1:
                ((InterfaceC2566A) this.bravo).alpha();
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.alpha) {
            case 0:
                NavigationView navigationView = (NavigationView) this.charlie;
                DrawerLayout drawerLayout = (DrawerLayout) this.bravo;
                drawerLayout.bravo(navigationView, false);
                drawerLayout.setScrimColor(-1728053248);
                return;
            case 1:
                ((InterfaceC2566A) this.bravo).bravo();
                return;
            case 2:
                I i4 = (I) this.bravo;
                i4.alpha.echo(1.0f);
                D.foxtrot((View) this.charlie, i4);
                return;
            default:
                ((bv.e) this.bravo).remove(animator);
                ((z) this.charlie).f14081g.remove(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.alpha) {
            case 1:
                ((InterfaceC2566A) this.bravo).onAnimationStart();
                return;
            case 2:
            default:
                super.onAnimationStart(animator);
                return;
            case 3:
                ((z) this.charlie).f14081g.add(animator);
                return;
        }
    }

    public a(z zVar, bv.e eVar) {
        this.alpha = 3;
        this.charlie = zVar;
        this.bravo = eVar;
    }
}
