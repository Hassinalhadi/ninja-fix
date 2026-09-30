package s1;

import android.R;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import dagger.hilt.android.components.ViewComponent;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import s6.AbstractC2763s0;

/* loaded from: classes3.dex */
public class aa implements ViewComponentBuilder {
    public View alpha;

    public aa(View view) {
        this.alpha = view;
    }

    public void alpha() {
        View view = this.alpha;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public void bravo() {
        View view;
        View view2 = this.alpha;
        if (view2 != null) {
            if (!view2.isInEditMode() && !view2.onCheckIsTextEditor()) {
                view = view2.getRootView().findFocus();
            } else {
                view2.requestFocus();
                view = view2;
            }
            if (view == null) {
                view = view2.getRootView().findViewById(R.id.content);
            }
            if (view != null && view.hasWindowFocus()) {
                view.post(new com.google.android.material.internal.aa(1, view));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, dagger.hilt.android.components.ViewComponent] */
    @Override // dagger.hilt.android.internal.builders.ViewComponentBuilder
    public ViewComponent build() {
        AbstractC2763s0.bravo(View.class, this.alpha);
        return new Object();
    }

    @Override // dagger.hilt.android.internal.builders.ViewComponentBuilder
    public ViewComponentBuilder view(View view) {
        view.getClass();
        this.alpha = view;
        return this;
    }
}
