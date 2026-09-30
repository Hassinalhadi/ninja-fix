package L1;

import K1.k;
import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;

/* loaded from: classes3.dex */
public final class j implements TransformationMethod {
    public final TransformationMethod alpha;

    public j(TransformationMethod transformationMethod) {
        this.alpha = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.alpha;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence != null && k.alpha().charlie() == 1) {
            k alpha = k.alpha();
            alpha.getClass();
            return alpha.golf(0, charSequence.length(), 0, charSequence);
        }
        return charSequence;
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z2, int i4, Rect rect) {
        TransformationMethod transformationMethod = this.alpha;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z2, i4, rect);
        }
    }
}
