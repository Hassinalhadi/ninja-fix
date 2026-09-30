package b7;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.appcompat.app.ap;
import ao.ad;
import com.google.android.material.appbar.AppBarLayout;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final /* synthetic */ class m implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object bravo;
    public final /* synthetic */ Object charlie;

    public /* synthetic */ m(int i4, Object obj, Object obj2) {
        this.alpha = i4;
        this.bravo = obj;
        this.charlie = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Object obj = this.charlie;
        Object obj2 = this.bravo;
        switch (this.alpha) {
            case 0:
                o oVar = (o) obj2;
                oVar.getClass();
                AbstractC0723e abstractC0723e = (AbstractC0723e) obj;
                if (abstractC0723e.bravo(true) && abstractC0723e.mike != 0 && oVar.isVisible()) {
                    oVar.invalidateSelf();
                    return;
                }
                return;
            case 1:
                int i4 = AppBarLayout.f7767u;
                AppBarLayout appBarLayout = (AppBarLayout) obj2;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((g7.i) obj).papa(floatValue);
                Drawable drawable = appBarLayout.f7783q;
                if (drawable instanceof g7.i) {
                    ((g7.i) drawable).papa(floatValue);
                }
                Iterator it = appBarLayout.f7777k.iterator();
                if (!it.hasNext()) {
                    Iterator it2 = appBarLayout.f7778l.iterator();
                    if (!it2.hasNext()) {
                        return;
                    } else {
                        throw ad.yankee(it2);
                    }
                }
                throw ad.yankee(it);
            default:
                ((View) ((ap) ((O7.j) obj2).purple).delta.getParent()).invalidate();
                return;
        }
    }
}
