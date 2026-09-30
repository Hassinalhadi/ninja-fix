package i7;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.Log;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.material.internal.z;

/* renamed from: i7.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC1897c implements Runnable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ AbstractC1900f purple;

    public /* synthetic */ RunnableC1897c(AbstractC1900f abstractC1900f, int i4) {
        this.alpha = i4;
        this.purple = abstractC1900f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        AbstractC1900f abstractC1900f = this.purple;
        switch (this.alpha) {
            case 0:
                if (abstractC1900f.india != null && (context = abstractC1900f.hotel) != null) {
                    int height = z.echo(context).height();
                    int[] iArr = new int[2];
                    AbstractC1899e abstractC1899e = abstractC1900f.india;
                    abstractC1899e.getLocationInWindow(iArr);
                    int height2 = (height - (abstractC1899e.getHeight() + iArr[1])) + ((int) abstractC1900f.india.getTranslationY());
                    int i4 = abstractC1900f.papa;
                    if (height2 >= i4) {
                        abstractC1900f.quebec = i4;
                        return;
                    }
                    ViewGroup.LayoutParams layoutParams = abstractC1900f.india.getLayoutParams();
                    if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                        Log.w(AbstractC1900f.zulu, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                        return;
                    }
                    int i5 = abstractC1900f.papa;
                    abstractC1900f.quebec = i5;
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.bottomMargin = (i5 - height2) + marginLayoutParams.bottomMargin;
                    abstractC1900f.india.requestLayout();
                    return;
                }
                return;
            case 1:
                abstractC1900f.charlie();
                return;
            default:
                AbstractC1899e abstractC1899e2 = abstractC1900f.india;
                if (abstractC1899e2 != null) {
                    ViewParent parent = abstractC1899e2.getParent();
                    AbstractC1899e abstractC1899e3 = abstractC1900f.india;
                    if (parent != null) {
                        abstractC1899e3.setVisibility(0);
                    }
                    if (abstractC1899e3.getAnimationMode() == 1) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.setInterpolator(abstractC1900f.delta);
                        ofFloat.addUpdateListener(new C1896b(abstractC1900f, 0));
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.8f, 1.0f);
                        ofFloat2.setInterpolator(abstractC1900f.foxtrot);
                        ofFloat2.addUpdateListener(new C1896b(abstractC1900f, 1));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(ofFloat, ofFloat2);
                        animatorSet.setDuration(abstractC1900f.alpha);
                        animatorSet.addListener(new C1895a(abstractC1900f, 3));
                        animatorSet.start();
                        return;
                    }
                    int height3 = abstractC1899e3.getHeight();
                    ViewGroup.LayoutParams layoutParams2 = abstractC1899e3.getLayoutParams();
                    if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                        height3 += ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                    }
                    abstractC1899e3.setTranslationY(height3);
                    ValueAnimator valueAnimator = new ValueAnimator();
                    valueAnimator.setIntValues(height3, 0);
                    valueAnimator.setInterpolator(abstractC1900f.echo);
                    valueAnimator.setDuration(abstractC1900f.charlie);
                    valueAnimator.addListener(new C1895a(abstractC1900f, 1));
                    valueAnimator.addUpdateListener(new C1896b(abstractC1900f, 2));
                    valueAnimator.start();
                    return;
                }
                return;
        }
    }
}
