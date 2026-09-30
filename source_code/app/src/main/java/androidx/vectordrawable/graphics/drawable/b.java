package androidx.vectordrawable.graphics.drawable;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* loaded from: classes3.dex */
public final class b extends Animatable2.AnimationCallback {
    public final /* synthetic */ c alpha;

    public b(c cVar) {
        this.alpha = cVar;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        this.alpha.onAnimationEnd(drawable);
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        this.alpha.onAnimationStart(drawable);
    }
}
