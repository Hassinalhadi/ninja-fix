package com.google.android.material.bottomsheet;

import a7.C0409d;
import a7.C0412g;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.app.ad;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import delivery.samurai.android.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import s1.al;
import s1.au;
import t6.AbstractC3087z;

/* loaded from: classes2.dex */
public class l extends ad {
    private C0412g backOrchestrator;
    private BottomSheetBehavior<FrameLayout> behavior;
    private FrameLayout bottomSheet;
    private c bottomSheetCallback;
    boolean cancelable;
    private boolean canceledOnTouchOutside;
    private boolean canceledOnTouchOutsideSet;
    private FrameLayout container;
    private CoordinatorLayout coordinator;
    boolean dismissWithAnimation;
    private k edgeToEdgeCallback;
    private boolean edgeToEdgeEnabled;

    public l(Context context) {
        this(context, 0);
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge});
        this.edgeToEdgeEnabled = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
    }

    @Deprecated
    public static void setLightStatusBar(View view, boolean z2) {
        int i4;
        int systemUiVisibility = view.getSystemUiVisibility();
        if (z2) {
            i4 = systemUiVisibility | 8192;
        } else {
            i4 = systemUiVisibility & (-8193);
        }
        view.setSystemUiVisibility(i4);
    }

    public final void bravo() {
        if (this.container == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.design_bottom_sheet_dialog, null);
            this.container = frameLayout;
            this.coordinator = (CoordinatorLayout) frameLayout.findViewById(R.id.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.container.findViewById(R.id.design_bottom_sheet);
            this.bottomSheet = frameLayout2;
            BottomSheetBehavior<FrameLayout> juliet = BottomSheetBehavior.juliet(frameLayout2);
            this.behavior = juliet;
            c cVar = this.bottomSheetCallback;
            ArrayList arrayList = juliet.f7867R;
            if (!arrayList.contains(cVar)) {
                arrayList.add(cVar);
            }
            this.behavior.quebec(this.cancelable);
            this.backOrchestrator = new C0412g(this.behavior, this.bottomSheet);
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        BottomSheetBehavior<FrameLayout> behavior = getBehavior();
        if (this.dismissWithAnimation && behavior.f7857G != 5) {
            behavior.sierra(5);
        } else {
            super.cancel();
        }
    }

    public final FrameLayout charlie(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        bravo();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.container.findViewById(R.id.coordinator);
        if (i4 != 0 && view == null) {
            view = getLayoutInflater().inflate(i4, (ViewGroup) coordinatorLayout, false);
        }
        if (this.edgeToEdgeEnabled) {
            FrameLayout frameLayout = this.container;
            f fVar = new f(this);
            WeakHashMap weakHashMap = au.alpha;
            al.lima(frameLayout, fVar);
        }
        this.bottomSheet.removeAllViews();
        if (layoutParams == null) {
            this.bottomSheet.addView(view);
        } else {
            this.bottomSheet.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.touch_outside).setOnClickListener(new g(this));
        au.november(this.bottomSheet, new h(this));
        this.bottomSheet.setOnTouchListener(new i(0));
        return this.container;
    }

    public BottomSheetBehavior<FrameLayout> getBehavior() {
        if (this.behavior == null) {
            bravo();
        }
        return this.behavior;
    }

    public boolean getDismissWithAnimation() {
        return this.dismissWithAnimation;
    }

    public boolean getEdgeToEdgeEnabled() {
        return this.edgeToEdgeEnabled;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        boolean z2;
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            if (this.edgeToEdgeEnabled && Color.alpha(window.getNavigationBarColor()) < 255) {
                z2 = true;
            } else {
                z2 = false;
            }
            FrameLayout frameLayout = this.container;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z2);
            }
            CoordinatorLayout coordinatorLayout = this.coordinator;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z2);
            }
            AbstractC3087z.charlie(window, !z2);
            k kVar = this.edgeToEdgeCallback;
            if (kVar != null) {
                kVar.echo(window);
            }
        }
        C0412g c0412g = this.backOrchestrator;
        if (c0412g != null) {
            boolean z10 = this.cancelable;
            View view = c0412g.charlie;
            C0409d c0409d = c0412g.alpha;
            if (z10) {
                if (c0409d != null) {
                    c0409d.bravo(c0412g.bravo, view, false);
                }
            } else if (c0409d != null) {
                c0409d.charlie(view);
            }
        }
    }

    @Override // androidx.appcompat.app.ad, ae.p, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(RecyclerView.UNDEFINED_DURATION);
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        C0409d c0409d;
        k kVar = this.edgeToEdgeCallback;
        if (kVar != null) {
            kVar.echo(null);
        }
        C0412g c0412g = this.backOrchestrator;
        if (c0412g != null && (c0409d = c0412g.alpha) != null) {
            c0409d.charlie(c0412g.charlie);
        }
    }

    @Override // ae.p, android.app.Dialog
    public void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.behavior;
        if (bottomSheetBehavior != null && bottomSheetBehavior.f7857G == 5) {
            bottomSheetBehavior.sierra(4);
        }
    }

    public void removeDefaultCallback() {
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.behavior;
        bottomSheetBehavior.f7867R.remove(this.bottomSheetCallback);
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z2) {
        C0412g c0412g;
        super.setCancelable(z2);
        if (this.cancelable != z2) {
            this.cancelable = z2;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.behavior;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.quebec(z2);
            }
            if (getWindow() != null && (c0412g = this.backOrchestrator) != null) {
                boolean z10 = this.cancelable;
                View view = c0412g.charlie;
                C0409d c0409d = c0412g.alpha;
                if (z10) {
                    if (c0409d != null) {
                        c0409d.bravo(c0412g.bravo, view, false);
                    }
                } else if (c0409d != null) {
                    c0409d.charlie(view);
                }
            }
        }
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z2) {
        super.setCanceledOnTouchOutside(z2);
        if (z2 && !this.cancelable) {
            this.cancelable = true;
        }
        this.canceledOnTouchOutside = z2;
        this.canceledOnTouchOutsideSet = true;
    }

    @Override // androidx.appcompat.app.ad, ae.p, android.app.Dialog
    public void setContentView(int i4) {
        super.setContentView(charlie(null, i4, null));
    }

    public void setDismissWithAnimation(boolean z2) {
        this.dismissWithAnimation = z2;
    }

    public boolean shouldWindowCloseOnTouchOutside() {
        if (!this.canceledOnTouchOutsideSet) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{android.R.attr.windowCloseOnTouchOutside});
            this.canceledOnTouchOutside = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
            this.canceledOnTouchOutsideSet = true;
        }
        return this.canceledOnTouchOutside;
    }

    @Override // androidx.appcompat.app.ad, ae.p, android.app.Dialog
    public void setContentView(View view) {
        super.setContentView(charlie(view, 0, null));
    }

    @Override // androidx.appcompat.app.ad, ae.p, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(charlie(view, 0, layoutParams));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public l(Context context, int i4) {
        super(context, i4);
        if (i4 == 0) {
            TypedValue typedValue = new TypedValue();
            i4 = context.getTheme().resolveAttribute(R.attr.bottomSheetDialogTheme, typedValue, true) ? typedValue.resourceId : 2132083370;
        }
        this.cancelable = true;
        this.canceledOnTouchOutside = true;
        this.bottomSheetCallback = new j(0, this);
        supportRequestWindowFeature(1);
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge});
        this.edgeToEdgeEnabled = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
    }
}
