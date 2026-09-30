package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes3.dex */
public final class at implements View.OnAttachStateChangeListener {
    public final /* synthetic */ S alpha;
    public final /* synthetic */ au purple;

    public at(au auVar, S s3) {
        this.purple = auVar;
        this.alpha = s3;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        S s3 = this.alpha;
        s3.kilo();
        C0622q.juliet((ViewGroup) s3.charlie.mView.getParent(), this.purple.alpha).india();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
