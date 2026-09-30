package i7;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.LinearInterpolator;
import com.bumptech.glide.load.engine.z;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.internal.s;
import com.google.android.material.snackbar.SnackbarContentLayout;
import com.google.firebase.messaging.o;
import delivery.samurai.android.R;
import java.util.List;
import java.util.WeakHashMap;
import s1.al;
import s1.au;
import s6.AbstractC2815x7;
import x2.q;

/* renamed from: i7.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1900f {
    public final int alpha;
    public final int bravo;
    public final int charlie;
    public final TimeInterpolator delta;
    public final TimeInterpolator echo;
    public final TimeInterpolator foxtrot;
    public final ViewGroup golf;
    public final Context hotel;
    public final AbstractC1899e india;
    public final SnackbarContentLayout juliet;
    public int kilo;
    public int mike;
    public int november;
    public int oscar;
    public int papa;
    public int quebec;
    public boolean romeo;
    public final AccessibilityManager sierra;
    public static final P1.a uniform = M6.a.bravo;
    public static final LinearInterpolator victor = M6.a.alpha;
    public static final P1.a whiskey = M6.a.delta;
    public static final int[] yankee = {R.attr.snackbarStyle};
    public static final String zulu = AbstractC1900f.class.getSimpleName();
    public static final Handler xray = new Handler(Looper.getMainLooper(), new z(1));
    public final RunnableC1897c lima = new RunnableC1897c(this, 0);
    public final C1898d tango = new C1898d(this);

    public AbstractC1900f(Context context, ViewGroup viewGroup, SnackbarContentLayout snackbarContentLayout, SnackbarContentLayout snackbarContentLayout2) {
        int i4;
        if (snackbarContentLayout != null) {
            if (snackbarContentLayout2 != null) {
                this.golf = viewGroup;
                this.juliet = snackbarContentLayout2;
                this.hotel = context;
                com.google.android.material.internal.z.charlie(context, com.google.android.material.internal.z.alpha, "Theme.AppCompat");
                LayoutInflater from = LayoutInflater.from(context);
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(yankee);
                int resourceId = obtainStyledAttributes.getResourceId(0, -1);
                obtainStyledAttributes.recycle();
                if (resourceId != -1) {
                    i4 = R.layout.mtrl_layout_snackbar;
                } else {
                    i4 = R.layout.design_layout_snackbar;
                }
                AbstractC1899e abstractC1899e = (AbstractC1899e) from.inflate(i4, viewGroup, false);
                this.india = abstractC1899e;
                AbstractC1899e.alpha(abstractC1899e, this);
                float actionTextColorAlpha = abstractC1899e.getActionTextColorAlpha();
                if (actionTextColorAlpha != 1.0f) {
                    snackbarContentLayout.purple.setTextColor(AbstractC2815x7.golf(actionTextColorAlpha, AbstractC2815x7.charlie(R.attr.colorSurface, snackbarContentLayout), snackbarContentLayout.purple.getCurrentTextColor()));
                }
                snackbarContentLayout.setMaxInlineActionWidth(abstractC1899e.getMaxInlineActionWidth());
                abstractC1899e.addView(snackbarContentLayout);
                abstractC1899e.setAccessibilityLiveRegion(1);
                abstractC1899e.setImportantForAccessibility(1);
                abstractC1899e.setFitsSystemWindows(true);
                s sVar = new s(12, this);
                WeakHashMap weakHashMap = au.alpha;
                al.lima(abstractC1899e, sVar);
                au.november(abstractC1899e, new com.google.android.material.button.e(4, this));
                this.sierra = (AccessibilityManager) context.getSystemService("accessibility");
                this.charlie = q.echo(context, R.attr.motionDurationLong2, 250);
                this.alpha = q.echo(context, R.attr.motionDurationLong2, 150);
                this.bravo = q.echo(context, R.attr.motionDurationMedium1, 75);
                this.delta = q.foxtrot(context, R.attr.motionEasingEmphasizedInterpolator, victor);
                this.foxtrot = q.foxtrot(context, R.attr.motionEasingEmphasizedInterpolator, whiskey);
                this.echo = q.foxtrot(context, R.attr.motionEasingEmphasizedInterpolator, uniform);
                return;
            }
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
        throw new IllegalArgumentException("Transient bottom bar must have non-null content");
    }

    public final void alpha(int i4) {
        boolean z2;
        o lima = o.lima();
        C1898d c1898d = this.tango;
        synchronized (lima.alpha) {
            try {
                if (lima.papa(c1898d)) {
                    lima.hotel((C1902h) lima.charlie, i4);
                } else {
                    C1902h c1902h = (C1902h) lima.delta;
                    if (c1902h != null && c1902h.alpha.get() == c1898d) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        lima.hotel((C1902h) lima.delta, i4);
                    }
                }
            } finally {
            }
        }
    }

    public final boolean bravo() {
        boolean z2;
        boolean z10;
        o lima = o.lima();
        C1898d c1898d = this.tango;
        synchronized (lima.alpha) {
            z2 = true;
            if (!lima.papa(c1898d)) {
                C1902h c1902h = (C1902h) lima.delta;
                if (c1902h != null && c1902h.alpha.get() == c1898d) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    z2 = false;
                }
            }
        }
        return z2;
    }

    public final void charlie() {
        o lima = o.lima();
        C1898d c1898d = this.tango;
        synchronized (lima.alpha) {
            try {
                if (lima.papa(c1898d)) {
                    lima.charlie = null;
                    if (((C1902h) lima.delta) != null) {
                        lima.uniform();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ViewParent parent = this.india.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.india);
        }
    }

    public final void delta() {
        o lima = o.lima();
        C1898d c1898d = this.tango;
        synchronized (lima.alpha) {
            try {
                if (lima.papa(c1898d)) {
                    lima.tango((C1902h) lima.charlie);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void echo() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        boolean z2 = true;
        AccessibilityManager accessibilityManager = this.sierra;
        if (accessibilityManager != null && ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) == null || !enabledAccessibilityServiceList.isEmpty())) {
            z2 = false;
        }
        AbstractC1899e abstractC1899e = this.india;
        if (z2) {
            abstractC1899e.post(new RunnableC1897c(this, 2));
            return;
        }
        if (abstractC1899e.getParent() != null) {
            abstractC1899e.setVisibility(0);
        }
        delta();
    }

    public final void foxtrot() {
        boolean z2;
        AbstractC1899e abstractC1899e = this.india;
        ViewGroup.LayoutParams layoutParams = abstractC1899e.getLayoutParams();
        boolean z10 = layoutParams instanceof ViewGroup.MarginLayoutParams;
        String str = zulu;
        if (!z10) {
            Log.w(str, "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        if (abstractC1899e.f12765c == null) {
            Log.w(str, "Unable to update margins because original view margins are not set");
            return;
        }
        if (abstractC1899e.getParent() != null) {
            int i4 = this.mike;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            Rect rect = abstractC1899e.f12765c;
            int i5 = rect.bottom + i4;
            int i10 = rect.left + this.november;
            int i11 = rect.right + this.oscar;
            int i12 = rect.top;
            if (marginLayoutParams.bottomMargin == i5 && marginLayoutParams.leftMargin == i10 && marginLayoutParams.rightMargin == i11 && marginLayoutParams.topMargin == i12) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                marginLayoutParams.bottomMargin = i5;
                marginLayoutParams.leftMargin = i10;
                marginLayoutParams.rightMargin = i11;
                marginLayoutParams.topMargin = i12;
                abstractC1899e.requestLayout();
            }
            if ((z2 || this.quebec != this.papa) && Build.VERSION.SDK_INT >= 29 && this.papa > 0) {
                ViewGroup.LayoutParams layoutParams2 = abstractC1899e.getLayoutParams();
                if ((layoutParams2 instanceof androidx.coordinatorlayout.widget.f) && (((androidx.coordinatorlayout.widget.f) layoutParams2).alpha instanceof SwipeDismissBehavior)) {
                    RunnableC1897c runnableC1897c = this.lima;
                    abstractC1899e.removeCallbacks(runnableC1897c);
                    abstractC1899e.post(runnableC1897c);
                }
            }
        }
    }
}
