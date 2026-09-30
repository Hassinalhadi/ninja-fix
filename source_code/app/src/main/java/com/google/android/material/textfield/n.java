package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes2.dex */
public final class n extends AnimatorListenerAdapter {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ TextView bravo;
    public final /* synthetic */ int charlie;
    public final /* synthetic */ TextView delta;
    public final /* synthetic */ p echo;

    public n(p pVar, int i4, TextView textView, int i5, TextView textView2) {
        this.echo = pVar;
        this.alpha = i4;
        this.bravo = textView;
        this.charlie = i5;
        this.delta = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        AppCompatTextView appCompatTextView;
        int i4 = this.alpha;
        p pVar = this.echo;
        pVar.november = i4;
        pVar.lima = null;
        TextView textView = this.bravo;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.charlie == 1 && (appCompatTextView = pVar.romeo) != null) {
                appCompatTextView.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.delta;
        if (textView2 != null) {
            textView2.setTranslationY(0.0f);
            textView2.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.delta;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setAlpha(0.0f);
        }
    }
}
