package com.google.android.material.textfield;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import androidx.camera.core.impl.ai;
import com.google.android.material.internal.CheckableImageButton;
import delivery.samurai.android.R;

/* loaded from: classes2.dex */
public final class c extends m {
    public final int echo;
    public final int foxtrot;
    public final TimeInterpolator golf;
    public final TimeInterpolator hotel;
    public EditText india;
    public final com.clevertap.android.sdk.inapp.fragment.a juliet;
    public final Ba.m kilo;
    public AnimatorSet lima;
    public ValueAnimator mike;

    public c(l lVar) {
        super(lVar);
        this.juliet = new com.clevertap.android.sdk.inapp.fragment.a(4, this);
        this.kilo = new Ba.m(2, this);
        this.echo = x2.q.echo(lVar.getContext(), R.attr.motionDurationShort3, 100);
        this.foxtrot = x2.q.echo(lVar.getContext(), R.attr.motionDurationShort3, 150);
        this.golf = x2.q.foxtrot(lVar.getContext(), R.attr.motionEasingLinearInterpolator, M6.a.alpha);
        this.hotel = x2.q.foxtrot(lVar.getContext(), R.attr.motionEasingEmphasizedInterpolator, M6.a.delta);
    }

    @Override // com.google.android.material.textfield.m
    public final void alpha() {
        if (this.bravo.f8231i != null) {
            return;
        }
        tango(uniform());
    }

    @Override // com.google.android.material.textfield.m
    public final int charlie() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // com.google.android.material.textfield.m
    public final int delta() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // com.google.android.material.textfield.m
    public final View.OnFocusChangeListener echo() {
        return this.kilo;
    }

    @Override // com.google.android.material.textfield.m
    public final View.OnClickListener foxtrot() {
        return this.juliet;
    }

    @Override // com.google.android.material.textfield.m
    public final View.OnFocusChangeListener golf() {
        return this.kilo;
    }

    @Override // com.google.android.material.textfield.m
    public final void mike(EditText editText) {
        this.india = editText;
        this.alpha.setEndIconVisible(uniform());
    }

    @Override // com.google.android.material.textfield.m
    public final void papa(boolean z2) {
        if (this.bravo.f8231i == null) {
            return;
        }
        tango(z2);
    }

    @Override // com.google.android.material.textfield.m
    public final void romeo() {
        final int i4 = 1;
        final int i5 = 0;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(this.hotel);
        ofFloat.setDuration(this.foxtrot);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: com.google.android.material.textfield.a
            public final /* synthetic */ c bravo;

            {
                this.bravo = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i4) {
                    case 0:
                        c cVar = this.bravo;
                        cVar.getClass();
                        cVar.delta.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    default:
                        c cVar2 = this.bravo;
                        cVar2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = cVar2.delta;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        return;
                }
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.golf;
        ofFloat2.setInterpolator(timeInterpolator);
        int i10 = this.echo;
        ofFloat2.setDuration(i10);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: com.google.android.material.textfield.a
            public final /* synthetic */ c bravo;

            {
                this.bravo = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i5) {
                    case 0:
                        c cVar = this.bravo;
                        cVar.getClass();
                        cVar.delta.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    default:
                        c cVar2 = this.bravo;
                        cVar2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = cVar2.delta;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        return;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.lima = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        this.lima.addListener(new b(this, i5));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat3.setInterpolator(timeInterpolator);
        ofFloat3.setDuration(i10);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: com.google.android.material.textfield.a
            public final /* synthetic */ c bravo;

            {
                this.bravo = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i5) {
                    case 0:
                        c cVar = this.bravo;
                        cVar.getClass();
                        cVar.delta.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    default:
                        c cVar2 = this.bravo;
                        cVar2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = cVar2.delta;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        return;
                }
            }
        });
        this.mike = ofFloat3;
        ofFloat3.addListener(new b(this, i4));
    }

    @Override // com.google.android.material.textfield.m
    public final void sierra() {
        EditText editText = this.india;
        if (editText != null) {
            editText.post(new ai(24, this));
        }
    }

    public final void tango(boolean z2) {
        boolean z10;
        if (this.bravo.delta() == z2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z2 && !this.lima.isRunning()) {
            this.mike.cancel();
            this.lima.start();
            if (z10) {
                this.lima.end();
                return;
            }
            return;
        }
        if (!z2) {
            this.lima.cancel();
            this.mike.start();
            if (z10) {
                this.mike.end();
            }
        }
    }

    public final boolean uniform() {
        EditText editText = this.india;
        if (editText != null) {
            if ((editText.hasFocus() || this.delta.hasFocus()) && this.india.getText().length() > 0) {
                return true;
            }
            return false;
        }
        return false;
    }
}
