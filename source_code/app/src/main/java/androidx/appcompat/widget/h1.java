package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import delivery.samurai.android.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class h1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public static h1 f2874d;
    public static h1 e;

    /* renamed from: a, reason: collision with root package name */
    public i1 f2875a;
    public final View alpha;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2876b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2877c;
    public final CharSequence purple;
    public final int red;
    public final g1 silver;
    public final g1 teal;
    public int white;
    public int yellow;

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.appcompat.widget.g1] */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.appcompat.widget.g1] */
    public h1(View view, CharSequence charSequence) {
        int scaledTouchSlop;
        final int i4 = 0;
        this.silver = new Runnable(this) { // from class: androidx.appcompat.widget.g1
            public final /* synthetic */ h1 purple;

            {
                this.purple = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i4) {
                    case 0:
                        this.purple.charlie(false);
                        return;
                    default:
                        this.purple.alpha();
                        return;
                }
            }
        };
        final int i5 = 1;
        this.teal = new Runnable(this) { // from class: androidx.appcompat.widget.g1
            public final /* synthetic */ h1 purple;

            {
                this.purple = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i5) {
                    case 0:
                        this.purple.charlie(false);
                        return;
                    default:
                        this.purple.alpha();
                        return;
                }
            }
        };
        this.alpha = view;
        this.purple = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = s1.av.alpha;
        if (Build.VERSION.SDK_INT >= 28) {
            scaledTouchSlop = E2.e.mike(viewConfiguration);
        } else {
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop() / 2;
        }
        this.red = scaledTouchSlop;
        this.f2877c = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void bravo(h1 h1Var) {
        h1 h1Var2 = f2874d;
        if (h1Var2 != null) {
            h1Var2.alpha.removeCallbacks(h1Var2.silver);
        }
        f2874d = h1Var;
        if (h1Var != null) {
            h1Var.alpha.postDelayed(h1Var.silver, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void alpha() {
        h1 h1Var = e;
        View view = this.alpha;
        if (h1Var == this) {
            e = null;
            i1 i1Var = this.f2875a;
            if (i1Var != null) {
                View view2 = (View) i1Var.alpha;
                if (view2.getParent() != null) {
                    ((WindowManager) ((Context) i1Var.bravo).getSystemService("window")).removeView(view2);
                }
                this.f2875a = null;
                this.f2877c = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f2874d == this) {
            bravo(null);
        }
        view.removeCallbacks(this.teal);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, androidx.appcompat.widget.i1] */
    public final void charlie(boolean z2) {
        int height;
        int i4;
        int i5;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        long longPressTimeout;
        long j5;
        long j6;
        View view = this.alpha;
        if (!view.isAttachedToWindow()) {
            return;
        }
        bravo(null);
        h1 h1Var = e;
        if (h1Var != null) {
            h1Var.alpha();
        }
        e = this;
        this.f2876b = z2;
        Context context = view.getContext();
        ?? obj = new Object();
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        obj.delta = layoutParams;
        obj.echo = new Rect();
        obj.foxtrot = new int[2];
        obj.golf = new int[2];
        obj.bravo = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        obj.alpha = inflate;
        obj.charlie = (TextView) inflate.findViewById(R.id.message);
        layoutParams.setTitle(i1.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = 2132082693;
        layoutParams.flags = 24;
        this.f2875a = obj;
        int i15 = this.white;
        int i16 = this.yellow;
        boolean z10 = this.f2876b;
        View view2 = (View) obj.alpha;
        ViewParent parent = view2.getParent();
        Context context2 = (Context) obj.bravo;
        if (parent != null && view2.getParent() != null) {
            ((WindowManager) context2.getSystemService("window")).removeView(view2);
        }
        ((TextView) obj.charlie).setText(this.purple);
        WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) obj.delta;
        layoutParams2.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = context2.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
        if (view.getWidth() < dimensionPixelOffset) {
            i15 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = context2.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
            height = i16 + dimensionPixelOffset2;
            i4 = i16 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i4 = 0;
        }
        layoutParams2.gravity = 49;
        Resources resources = context2.getResources();
        if (z10) {
            i5 = R.dimen.tooltip_y_offset_touch;
        } else {
            i5 = R.dimen.tooltip_y_offset_non_touch;
        }
        int dimensionPixelOffset3 = resources.getDimensionPixelOffset(i5);
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams3 = rootView.getLayoutParams();
        if (!(layoutParams3 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams3).type != 2) {
            Context context3 = view.getContext();
            while (true) {
                if (!(context3 instanceof ContextWrapper)) {
                    break;
                }
                if (context3 instanceof Activity) {
                    rootView = ((Activity) context3).getWindow().getDecorView();
                    break;
                }
                context3 = ((ContextWrapper) context3).getBaseContext();
            }
        }
        if (rootView == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            i13 = 1;
        } else {
            Rect rect = (Rect) obj.echo;
            rootView.getWindowVisibleDisplayFrame(rect);
            if (rect.left < 0 && rect.top < 0) {
                Resources resources2 = context2.getResources();
                i13 = 1;
                i10 = i15;
                i11 = i4;
                int identifier = resources2.getIdentifier("status_bar_height", "dimen", "android");
                if (identifier != 0) {
                    i14 = resources2.getDimensionPixelSize(identifier);
                } else {
                    i14 = 0;
                }
                DisplayMetrics displayMetrics = resources2.getDisplayMetrics();
                i12 = 0;
                rect.set(0, i14, displayMetrics.widthPixels, displayMetrics.heightPixels);
            } else {
                i10 = i15;
                i11 = i4;
                i12 = 0;
                i13 = 1;
            }
            int[] iArr = (int[]) obj.golf;
            rootView.getLocationOnScreen(iArr);
            int[] iArr2 = (int[]) obj.foxtrot;
            view.getLocationOnScreen(iArr2);
            int i17 = iArr2[i12] - iArr[i12];
            iArr2[i12] = i17;
            iArr2[i13] = iArr2[i13] - iArr[i13];
            layoutParams2.x = (i17 + i10) - (rootView.getWidth() / 2);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12, i12);
            view2.measure(makeMeasureSpec, makeMeasureSpec);
            int measuredHeight = view2.getMeasuredHeight();
            int i18 = iArr2[i13];
            int i19 = ((i18 + i11) - dimensionPixelOffset3) - measuredHeight;
            int i20 = i18 + height + dimensionPixelOffset3;
            if (z10) {
                if (i19 >= 0) {
                    layoutParams2.y = i19;
                } else {
                    layoutParams2.y = i20;
                }
            } else if (measuredHeight + i20 <= rect.height()) {
                layoutParams2.y = i20;
            } else {
                layoutParams2.y = i19;
            }
        }
        ((WindowManager) context2.getSystemService("window")).addView(view2, layoutParams2);
        view.addOnAttachStateChangeListener(this);
        if (this.f2876b) {
            j6 = 2500;
        } else {
            WeakHashMap weakHashMap = s1.au.alpha;
            if ((view.getWindowSystemUiVisibility() & 1) == i13) {
                longPressTimeout = ViewConfiguration.getLongPressTimeout();
                j5 = 3000;
            } else {
                longPressTimeout = ViewConfiguration.getLongPressTimeout();
                j5 = 15000;
            }
            j6 = j5 - longPressTimeout;
        }
        g1 g1Var = this.teal;
        view.removeCallbacks(g1Var);
        view.postDelayed(g1Var, j6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
    
        if (java.lang.Math.abs(r5 - r3.yellow) <= r2) goto L30;
     */
    @Override // android.view.View.OnHoverListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f2875a == null || !this.f2876b) {
            View view2 = this.alpha;
            AccessibilityManager accessibilityManager = (AccessibilityManager) view2.getContext().getSystemService("accessibility");
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action != 7) {
                    if (action == 10) {
                        this.f2877c = true;
                        alpha();
                        return false;
                    }
                } else if (view2.isEnabled() && this.f2875a == null) {
                    int x4 = (int) motionEvent.getX();
                    int y10 = (int) motionEvent.getY();
                    if (!this.f2877c) {
                        int abs = Math.abs(x4 - this.white);
                        int i4 = this.red;
                        if (abs <= i4) {
                        }
                    }
                    this.white = x4;
                    this.yellow = y10;
                    this.f2877c = false;
                    bravo(this);
                }
            }
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.white = view.getWidth() / 2;
        this.yellow = view.getHeight() / 2;
        charlie(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        alpha();
    }
}
