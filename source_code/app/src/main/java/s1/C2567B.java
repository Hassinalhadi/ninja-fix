package s1;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import j1.C1929c;
import java.util.Collections;

/* renamed from: s1.B, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2567B implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ I alpha;
    public final /* synthetic */ a0 bravo;
    public final /* synthetic */ a0 charlie;
    public final /* synthetic */ int delta;
    public final /* synthetic */ View echo;

    public C2567B(I i4, a0 a0Var, a0 a0Var2, int i5, View view) {
        this.alpha = i4;
        this.bravo = a0Var;
        this.charlie = a0Var2;
        this.delta = i5;
        this.echo = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        O j5;
        float f5;
        int i4;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        I i5 = this.alpha;
        i5.alpha.echo(animatedFraction);
        float charlie = i5.alpha.charlie();
        PathInterpolator pathInterpolator = D.echo;
        int i10 = Build.VERSION.SDK_INT;
        a0 a0Var = this.bravo;
        if (i10 >= 34) {
            j5 = new N(a0Var);
        } else if (i10 >= 31) {
            j5 = new M(a0Var);
        } else if (i10 >= 30) {
            j5 = new L(a0Var);
        } else if (i10 >= 29) {
            j5 = new K(a0Var);
        } else {
            j5 = new J(a0Var);
        }
        int i11 = 1;
        while (i11 <= 512) {
            int i12 = this.delta & i11;
            X x4 = a0Var.alpha;
            if (i12 == 0) {
                j5.charlie(i11, x4.golf(i11));
                f5 = charlie;
                i4 = 1;
            } else {
                C1929c golf = x4.golf(i11);
                C1929c golf2 = this.charlie.alpha.golf(i11);
                float f10 = 1.0f - charlie;
                f5 = charlie;
                i4 = 1;
                j5.charlie(i11, a0.echo(golf, (int) (((golf.alpha - golf2.alpha) * f10) + 0.5d), (int) (((golf.bravo - golf2.bravo) * f10) + 0.5d), (int) (((golf.charlie - golf2.charlie) * f10) + 0.5d), (int) (((golf.delta - golf2.delta) * f10) + 0.5d)));
            }
            i11 <<= i4;
            charlie = f5;
        }
        D.hotel(this.echo, j5.bravo(), Collections.singletonList(i5));
    }
}
