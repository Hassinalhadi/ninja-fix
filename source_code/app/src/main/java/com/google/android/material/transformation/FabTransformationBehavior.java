package com.google.android.material.transformation;

import M6.a;
import M6.c;
import M6.e;
import M6.f;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.play.core.integrity.k;
import com.google.mlkit.common.sdkinternal.b;
import delivery.samurai.android.R;
import java.util.ArrayList;
import m7.C2107b;
import net.cachapa.expandablelayout.ExpandableLayout;
import s6.AbstractC2752q6;

@Deprecated
/* loaded from: classes2.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: a, reason: collision with root package name */
    public float f8270a;
    public final Rect red;
    public final RectF silver;
    public final RectF teal;
    public final int[] white;
    public float yellow;

    public FabTransformationBehavior() {
        this.red = new Rect();
        this.silver = new RectF();
        this.teal = new RectF();
        this.white = new int[2];
    }

    public static Pair golf(float f5, float f10, boolean z2, k kVar) {
        f delta;
        f delta2;
        if (f5 != 0.0f && f10 != 0.0f) {
            if ((z2 && f10 < 0.0f) || (!z2 && f10 > 0.0f)) {
                delta = ((e) kVar.purple).delta("translationXCurveUpwards");
                delta2 = ((e) kVar.purple).delta("translationYCurveUpwards");
            } else {
                delta = ((e) kVar.purple).delta("translationXCurveDownwards");
                delta2 = ((e) kVar.purple).delta("translationYCurveDownwards");
            }
        } else {
            delta = ((e) kVar.purple).delta("translationXLinear");
            delta2 = ((e) kVar.purple).delta("translationYLinear");
        }
        return new Pair(delta, delta2);
    }

    public static float juliet(k kVar, f fVar, float f5) {
        long j5 = fVar.alpha;
        f delta = ((e) kVar.purple).delta(ExpandableLayout.KEY_EXPANSION);
        return a.alpha(f5, 0.0f, fVar.bravo().getInterpolation(((float) (((delta.alpha + delta.bravo) + 17) - j5)) / ((float) fVar.bravo)));
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    public final AnimatorSet foxtrot(View view, View view2, boolean z2, boolean z10) {
        ObjectAnimator ofFloat;
        int i4;
        float f5;
        ObjectAnimator ofFloat2;
        ObjectAnimator ofFloat3;
        ViewGroup viewGroup;
        ObjectAnimator ofFloat4;
        k lima = lima(view2.getContext(), z2);
        if (z2) {
            this.yellow = view.getTranslationX();
            this.f8270a = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        float elevation = view2.getElevation() - view.getElevation();
        if (z2) {
            if (!z10) {
                view2.setTranslationZ(-elevation);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, 0.0f);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, -elevation);
        }
        ((e) lima.purple).delta("elevation").alpha(ofFloat);
        arrayList.add(ofFloat);
        RectF rectF = this.silver;
        float hotel = hotel(view, view2, (b) lima.red);
        float india = india(view, view2, (b) lima.red);
        Pair golf = golf(hotel, india, z2, lima);
        f fVar = (f) golf.first;
        f fVar2 = (f) golf.second;
        if (z2) {
            if (!z10) {
                view2.setTranslationX(-hotel);
                view2.setTranslationY(-india);
            }
            i4 = 0;
            ofFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, 0.0f);
            f5 = 0.0f;
            ofFloat3 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, 0.0f);
            float juliet = juliet(lima, fVar, -hotel);
            float juliet2 = juliet(lima, fVar2, -india);
            Rect rect = this.red;
            view2.getWindowVisibleDisplayFrame(rect);
            rectF.set(rect);
            RectF rectF2 = this.teal;
            kilo(view2, rectF2);
            rectF2.offset(juliet, juliet2);
            rectF2.intersect(rectF);
            rectF.set(rectF2);
        } else {
            i4 = 0;
            f5 = 0.0f;
            ofFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, -hotel);
            ofFloat3 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, -india);
        }
        fVar.alpha(ofFloat2);
        fVar2.alpha(ofFloat3);
        arrayList.add(ofFloat2);
        arrayList.add(ofFloat3);
        rectF.width();
        rectF.height();
        float hotel2 = hotel(view, view2, (b) lima.red);
        float india2 = india(view, view2, (b) lima.red);
        Pair golf2 = golf(hotel2, india2, z2, lima);
        f fVar3 = (f) golf2.first;
        f fVar4 = (f) golf2.second;
        Property property = View.TRANSLATION_X;
        if (!z2) {
            hotel2 = this.yellow;
        }
        float[] fArr = new float[1];
        fArr[i4] = hotel2;
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr);
        Property property2 = View.TRANSLATION_Y;
        if (!z2) {
            india2 = this.f8270a;
        }
        float[] fArr2 = new float[1];
        fArr2[i4] = india2;
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, fArr2);
        fVar3.alpha(ofFloat5);
        fVar4.alpha(ofFloat6);
        arrayList.add(ofFloat5);
        arrayList.add(ofFloat6);
        if (view2 instanceof ViewGroup) {
            View findViewById = view2.findViewById(R.id.mtrl_child_content_container);
            if (findViewById != null) {
                if (findViewById instanceof ViewGroup) {
                    viewGroup = (ViewGroup) findViewById;
                } else {
                    viewGroup = null;
                }
            } else {
                viewGroup = (ViewGroup) view2;
            }
            if (viewGroup != null) {
                if (z2) {
                    if (!z10) {
                        c.alpha.set(viewGroup, Float.valueOf(f5));
                    }
                    c cVar = c.alpha;
                    float[] fArr3 = new float[1];
                    fArr3[i4] = 1.0f;
                    ofFloat4 = ObjectAnimator.ofFloat(viewGroup, cVar, fArr3);
                } else {
                    c cVar2 = c.alpha;
                    float[] fArr4 = new float[1];
                    fArr4[i4] = f5;
                    ofFloat4 = ObjectAnimator.ofFloat(viewGroup, cVar2, fArr4);
                }
                ((e) lima.purple).delta("contentFade").alpha(ofFloat4);
                arrayList.add(ofFloat4);
            }
        }
        AnimatorSet animatorSet = new AnimatorSet();
        AbstractC2752q6.bravo(animatorSet, arrayList);
        animatorSet.addListener(new C2107b(z2, view2, view));
        int size = arrayList2.size();
        for (int i5 = i4; i5 < size; i5++) {
            animatorSet.addListener((Animator.AnimatorListener) arrayList2.get(i5));
        }
        return animatorSet;
    }

    public final float hotel(View view, View view2, b bVar) {
        RectF rectF = this.silver;
        RectF rectF2 = this.teal;
        kilo(view, rectF);
        rectF.offset(this.yellow, this.f8270a);
        kilo(view2, rectF2);
        bVar.getClass();
        return (rectF2.centerX() - rectF.centerX()) + 0.0f;
    }

    public final float india(View view, View view2, b bVar) {
        RectF rectF = this.silver;
        RectF rectF2 = this.teal;
        kilo(view, rectF);
        rectF.offset(this.yellow, this.f8270a);
        kilo(view2, rectF2);
        bVar.getClass();
        return (rectF2.centerY() - rectF.centerY()) + 0.0f;
    }

    public final void kilo(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        view.getLocationInWindow(this.white);
        rectF.offsetTo(r0[0], r0[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.c
    public final boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() != 8) {
            if (!(view2 instanceof FloatingActionButton)) {
                return false;
            }
            int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
            if (expandedComponentIdHint != 0 && expandedComponentIdHint != view.getId()) {
                return false;
            }
            return true;
        }
        throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
    }

    public abstract k lima(Context context, boolean z2);

    @Override // androidx.coordinatorlayout.widget.c
    public final void onAttachedToLayoutParams(androidx.coordinatorlayout.widget.f fVar) {
        if (fVar.hotel == 0) {
            fVar.hotel = 80;
        }
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.red = new Rect();
        this.silver = new RectF();
        this.teal = new RectF();
        this.white = new int[2];
    }
}
