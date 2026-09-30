package P6;

import android.animation.ValueAnimator;
import androidx.drawerlayout.widget.DrawerLayout;
import b7.o;
import com.google.android.material.textfield.i;
import j1.AbstractC1928b;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object bravo;

    public /* synthetic */ b(int i4, Object obj) {
        this.alpha = i4;
        this.bravo = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.alpha) {
            case 0:
                d dVar = (d) this.bravo;
                dVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dVar.juliet.setAlpha((int) (255.0f * floatValue));
                dVar.xray = floatValue;
                return;
            case 1:
                o oVar = (o) this.bravo;
                oVar.f3348j.echo = oVar.f3353o.getInterpolation(oVar.f3352n.getAnimatedFraction());
                return;
            case 2:
                ((DrawerLayout) this.bravo).setScrimColor(AbstractC1928b.delta(-1728053248, M6.a.charlie(com.google.android.material.navigation.b.alpha, 0, valueAnimator.getAnimatedFraction())));
                return;
            default:
                i iVar = (i) this.bravo;
                iVar.getClass();
                iVar.delta.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
