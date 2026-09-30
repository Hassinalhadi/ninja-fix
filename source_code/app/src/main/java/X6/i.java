package X6;

import O7.j;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import delivery.samurai.android.R;
import g7.m;
import g7.x;
import java.util.ArrayList;
import s6.AbstractC2752q6;
import s6.T7;
import x2.q;

/* loaded from: classes2.dex */
public final class i {
    public m alpha;
    public h bravo;
    public RippleDrawable charlie;
    public a delta;
    public RippleDrawable echo;
    public boolean foxtrot;
    public float hotel;
    public float india;
    public float juliet;
    public int kilo;
    public StateListAnimator lima;
    public Animator mike;
    public M6.e november;
    public M6.e oscar;
    public int quebec;
    public final FloatingActionButton sierra;
    public final j tango;
    public static final P1.a yankee = M6.a.charlie;
    public static final int zulu = R.attr.motionDurationLong2;
    public static final int amber = R.attr.motionEasingEmphasizedInterpolator;
    public static final int azure = R.attr.motionDurationMedium1;
    public static final int beige = R.attr.motionEasingEmphasizedAccelerateInterpolator;
    public static final int[] black = {android.R.attr.state_pressed, android.R.attr.state_enabled};
    public static final int[] blue = {android.R.attr.state_hovered, android.R.attr.state_focused, android.R.attr.state_enabled};
    public static final int[] bronze = {android.R.attr.state_focused, android.R.attr.state_enabled};
    public static final int[] coral = {android.R.attr.state_hovered, android.R.attr.state_enabled};
    public static final int[] crimson = {android.R.attr.state_enabled};
    public static final int[] cyan = new int[0];
    public boolean golf = true;
    public float papa = 1.0f;
    public int romeo = 0;
    public final Rect uniform = new Rect();
    public final RectF victor = new RectF();
    public final RectF whiskey = new RectF();
    public final Matrix xray = new Matrix();

    public i(FloatingActionButton floatingActionButton, j jVar) {
        this.sierra = floatingActionButton;
        this.tango = jVar;
    }

    public final void alpha(float f5, Matrix matrix) {
        matrix.reset();
        if (this.sierra.getDrawable() != null && this.quebec != 0) {
            RectF rectF = this.victor;
            RectF rectF2 = this.whiskey;
            rectF.set(0.0f, 0.0f, r0.getIntrinsicWidth(), r0.getIntrinsicHeight());
            float f10 = this.quebec;
            rectF2.set(0.0f, 0.0f, f10, f10);
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            float f11 = this.quebec / 2.0f;
            matrix.postScale(f5, f5, f11, f11);
        }
    }

    public final AnimatorSet bravo(M6.e eVar, float f5, float f10, float f11) {
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        float[] fArr = {f5};
        FloatingActionButton floatingActionButton = this.sierra;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) property, fArr);
        eVar.delta("opacity").alpha(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.SCALE_X, f10);
        eVar.delta("scale").alpha(ofFloat2);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 == 26) {
            ofFloat2.setEvaluator(new g(0));
        }
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.SCALE_Y, f10);
        eVar.delta("scale").alpha(ofFloat3);
        if (i4 == 26) {
            ofFloat3.setEvaluator(new g(0));
        }
        arrayList.add(ofFloat3);
        Matrix matrix = this.xray;
        alpha(f11, matrix);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(floatingActionButton, new M6.d(), new f(this), new Matrix(matrix));
        eVar.delta("iconScale").alpha(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        AbstractC2752q6.bravo(animatorSet, arrayList);
        return animatorSet;
    }

    public final AnimatorSet charlie(final float f5, final float f10, final float f11, int i4, int i5) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        FloatingActionButton floatingActionButton = this.sierra;
        final float alpha = floatingActionButton.getAlpha();
        final float scaleX = floatingActionButton.getScaleX();
        final float scaleY = floatingActionButton.getScaleY();
        final float f12 = this.papa;
        final Matrix matrix = new Matrix(this.xray);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X6.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                i iVar = i.this;
                iVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float bravo = M6.a.bravo(alpha, f5, 0.0f, 0.2f, floatValue);
                FloatingActionButton floatingActionButton2 = iVar.sierra;
                floatingActionButton2.setAlpha(bravo);
                float f13 = scaleX;
                float f14 = f10;
                floatingActionButton2.setScaleX(M6.a.alpha(f13, f14, floatValue));
                floatingActionButton2.setScaleY(M6.a.alpha(scaleY, f14, floatValue));
                float f15 = f12;
                float f16 = f11;
                iVar.papa = M6.a.alpha(f15, f16, floatValue);
                float alpha2 = M6.a.alpha(f15, f16, floatValue);
                Matrix matrix2 = matrix;
                iVar.alpha(alpha2, matrix2);
                floatingActionButton2.setImageMatrix(matrix2);
            }
        });
        arrayList.add(ofFloat);
        AbstractC2752q6.bravo(animatorSet, arrayList);
        animatorSet.setDuration(q.echo(floatingActionButton.getContext(), i4, floatingActionButton.getContext().getResources().getInteger(R.integer.material_motion_duration_long_1)));
        animatorSet.setInterpolator(q.foxtrot(floatingActionButton.getContext(), i5, M6.a.bravo));
        return animatorSet;
    }

    public final AnimatorSet delta(float f5, float f10) {
        AnimatorSet animatorSet = new AnimatorSet();
        float[] fArr = {f5};
        FloatingActionButton floatingActionButton = this.sierra;
        animatorSet.play(ObjectAnimator.ofFloat(floatingActionButton, "elevation", fArr).setDuration(0L)).with(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f10).setDuration(100L));
        animatorSet.setInterpolator(yankee);
        return animatorSet;
    }

    public final void echo(float f5, float f10, float f11) {
        int i4 = Build.VERSION.SDK_INT;
        FloatingActionButton floatingActionButton = this.sierra;
        if (floatingActionButton.getStateListAnimator() == this.lima) {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(black, delta(f5, f11));
            stateListAnimator.addState(blue, delta(f5, f10));
            stateListAnimator.addState(bronze, delta(f5, f10));
            stateListAnimator.addState(coral, delta(f5, f10));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, "elevation", f5).setDuration(0L));
            if (i4 <= 24) {
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
            }
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(yankee);
            stateListAnimator.addState(crimson, animatorSet);
            stateListAnimator.addState(cyan, delta(0.0f, 0.0f));
            this.lima = stateListAnimator;
            floatingActionButton.setStateListAnimator(stateListAnimator);
        }
        if (!((FloatingActionButton) this.tango.purple).f8026d && (!this.foxtrot || floatingActionButton.getSizeDimension() >= this.kilo)) {
            return;
        }
        hotel();
    }

    public final void foxtrot() {
    }

    public final void golf(m mVar) {
        this.alpha = mVar;
        h hVar = this.bravo;
        if (hVar != null) {
            hVar.setShapeAppearanceModel(mVar);
        }
        Drawable.Callback callback = this.charlie;
        if (callback instanceof x) {
            ((x) callback).setShapeAppearanceModel(mVar);
        }
        a aVar = this.delta;
        if (aVar != null) {
            aVar.oscar = mVar;
            aVar.invalidateSelf();
        }
    }

    public final void hotel() {
        float f5;
        j jVar = this.tango;
        boolean z2 = ((FloatingActionButton) jVar.purple).f8026d;
        int i4 = 0;
        FloatingActionButton floatingActionButton = this.sierra;
        Rect rect = this.uniform;
        if (z2) {
            if (this.foxtrot) {
                i4 = Math.max((this.kilo - floatingActionButton.getSizeDimension()) / 2, 0);
            }
            if (this.golf) {
                f5 = floatingActionButton.getElevation() + this.juliet;
            } else {
                f5 = 0.0f;
            }
            int max = Math.max(i4, (int) Math.ceil(f5));
            int max2 = Math.max(i4, (int) Math.ceil(f5 * 1.5f));
            rect.set(max, max2, max, max2);
        } else {
            if (this.foxtrot) {
                int sizeDimension = floatingActionButton.getSizeDimension();
                int i5 = this.kilo;
                if (sizeDimension < i5) {
                    int sizeDimension2 = (i5 - floatingActionButton.getSizeDimension()) / 2;
                    rect.set(sizeDimension2, sizeDimension2, sizeDimension2, sizeDimension2);
                }
            }
            rect.set(0, 0, 0, 0);
        }
        T7.foxtrot(this.echo, "Didn't initialize content background");
        boolean z10 = ((FloatingActionButton) jVar.purple).f8026d;
        FloatingActionButton floatingActionButton2 = (FloatingActionButton) jVar.purple;
        if (z10 || (this.foxtrot && floatingActionButton.getSizeDimension() < this.kilo)) {
            super/*android.widget.ImageButton*/.setBackgroundDrawable(new InsetDrawable((Drawable) this.echo, rect.left, rect.top, rect.right, rect.bottom));
        } else {
            RippleDrawable rippleDrawable = this.echo;
            if (rippleDrawable != null) {
                super/*android.widget.ImageButton*/.setBackgroundDrawable(rippleDrawable);
            }
        }
        int i10 = rect.left;
        int i11 = rect.top;
        int i12 = rect.right;
        int i13 = rect.bottom;
        floatingActionButton2.e.set(i10, i11, i12, i13);
        int i14 = floatingActionButton2.f8024b;
        floatingActionButton2.setPadding(i10 + i14, i11 + i14, i12 + i14, i13 + i14);
    }
}
