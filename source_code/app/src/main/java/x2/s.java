package x2;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import t6.AbstractC2982d3;

/* loaded from: classes3.dex */
public final class s extends aw {
    public static final DecelerateInterpolator B = new DecelerateInterpolator();
    public static final AccelerateInterpolator C = new AccelerateInterpolator();

    /* renamed from: D, reason: collision with root package name */
    public static final q f14070D = new q(0);

    /* renamed from: E, reason: collision with root package name */
    public static final q f14071E = new q(1);
    public r A;

    @Override // x2.aw, x2.z
    public final void delta(ai aiVar) {
        aw.indigo(aiVar);
        int[] iArr = new int[2];
        aiVar.bravo.getLocationOnScreen(iArr);
        aiVar.alpha.put("android:slide:screenPosition", iArr);
    }

    @Override // x2.z
    public final void golf(ai aiVar) {
        aw.indigo(aiVar);
        int[] iArr = new int[2];
        aiVar.bravo.getLocationOnScreen(iArr);
        aiVar.alpha.put("android:slide:screenPosition", iArr);
    }

    @Override // x2.aw
    public final ObjectAnimator jade(ViewGroup viewGroup, View view, ai aiVar, ai aiVar2) {
        if (aiVar2 == null) {
            return null;
        }
        int[] iArr = (int[]) aiVar2.alpha.get("android:slide:screenPosition");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return AbstractC2982d3.alpha(view, aiVar2, iArr[0], iArr[1], this.A.bravo(viewGroup, view), this.A.alpha(viewGroup, view), translationX, translationY, B, this);
    }

    @Override // x2.aw
    public final ObjectAnimator lavender(ViewGroup viewGroup, View view, ai aiVar, ai aiVar2) {
        if (aiVar == null) {
            return null;
        }
        int[] iArr = (int[]) aiVar.alpha.get("android:slide:screenPosition");
        return AbstractC2982d3.alpha(view, aiVar, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.A.bravo(viewGroup, view), this.A.alpha(viewGroup, view), C, this);
    }

    @Override // x2.z
    public final boolean uniform() {
        return true;
    }
}
