package i7;

import Kb.k;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.SnackbarContentLayout;
import com.google.firebase.messaging.o;
import delivery.samurai.android.R;

/* renamed from: i7.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1901g extends AbstractC1900f {
    public static final int[] beige = {R.attr.snackbarButtonStyle, R.attr.snackbarTextViewStyle};
    public final AccessibilityManager amber;
    public boolean azure;

    public C1901g(Context context, ViewGroup viewGroup, SnackbarContentLayout snackbarContentLayout, SnackbarContentLayout snackbarContentLayout2) {
        super(context, viewGroup, snackbarContentLayout, snackbarContentLayout2);
        this.amber = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    public static C1901g golf(View view, int i4, int i5) {
        return hotel(view, view.getResources().getText(i4), i5);
    }

    public static C1901g hotel(View view, CharSequence charSequence, int i4) {
        ViewGroup viewGroup;
        int i5;
        ViewGroup viewGroup2 = null;
        while (true) {
            if (view instanceof CoordinatorLayout) {
                viewGroup = (ViewGroup) view;
                break;
            }
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    viewGroup = (ViewGroup) view;
                    break;
                }
                viewGroup2 = (ViewGroup) view;
            }
            if (view != null) {
                Object parent = view.getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                } else {
                    view = null;
                }
            }
            if (view == null) {
                viewGroup = viewGroup2;
                break;
            }
        }
        if (viewGroup != null) {
            Context context = viewGroup.getContext();
            LayoutInflater from = LayoutInflater.from(context);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(beige);
            int resourceId = obtainStyledAttributes.getResourceId(0, -1);
            int resourceId2 = obtainStyledAttributes.getResourceId(1, -1);
            obtainStyledAttributes.recycle();
            if (resourceId != -1 && resourceId2 != -1) {
                i5 = R.layout.mtrl_layout_snackbar_include;
            } else {
                i5 = R.layout.design_layout_snackbar_include;
            }
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) from.inflate(i5, viewGroup, false);
            C1901g c1901g = new C1901g(context, viewGroup, snackbarContentLayout, snackbarContentLayout);
            ((SnackbarContentLayout) c1901g.india.getChildAt(0)).getMessageView().setText(charSequence);
            c1901g.kilo = i4;
            return c1901g;
        }
        throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
    }

    public final void india(CharSequence charSequence, View.OnClickListener onClickListener) {
        Button actionView = ((SnackbarContentLayout) this.india.getChildAt(0)).getActionView();
        if (!TextUtils.isEmpty(charSequence) && onClickListener != null) {
            this.azure = true;
            actionView.setVisibility(0);
            actionView.setText(charSequence);
            actionView.setOnClickListener(new k(9, this, onClickListener));
            return;
        }
        actionView.setVisibility(8);
        actionView.setOnClickListener(null);
        this.azure = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x002b, code lost:
    
        if (r6.isTouchExplorationEnabled() != false) goto L4;
     */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0033 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void juliet() {
        int i4;
        o lima = o.lima();
        int i5 = this.kilo;
        boolean z2 = false;
        if (i5 != -2) {
            int i10 = Build.VERSION.SDK_INT;
            AccessibilityManager accessibilityManager = this.amber;
            if (i10 >= 29) {
                if (this.azure) {
                    i4 = 4;
                } else {
                    i4 = 0;
                }
                i5 = accessibilityManager.getRecommendedTimeoutMillis(i5, i4 | 3);
            } else if (this.azure) {
            }
            C1898d c1898d = this.tango;
            synchronized (lima.alpha) {
                try {
                    if (lima.papa(c1898d)) {
                        C1902h c1902h = (C1902h) lima.charlie;
                        c1902h.bravo = i5;
                        ((Handler) lima.bravo).removeCallbacksAndMessages(c1902h);
                        lima.tango((C1902h) lima.charlie);
                        return;
                    }
                    C1902h c1902h2 = (C1902h) lima.delta;
                    if (c1902h2 != null && c1902h2.alpha.get() == c1898d) {
                        z2 = true;
                    }
                    if (z2) {
                        ((C1902h) lima.delta).bravo = i5;
                    } else {
                        lima.delta = new C1902h(i5, c1898d);
                    }
                    C1902h c1902h3 = (C1902h) lima.charlie;
                    if (c1902h3 != null && lima.hotel(c1902h3, 4)) {
                        return;
                    }
                    lima.charlie = null;
                    lima.uniform();
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        i5 = -2;
        C1898d c1898d2 = this.tango;
        synchronized (lima.alpha) {
        }
    }
}
