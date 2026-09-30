package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.compose.LottieConstants;
import java.lang.reflect.Method;
import t6.AbstractC3032n3;

/* renamed from: androidx.appcompat.widget.l0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0466l0 implements ao.ab {

    /* renamed from: t, reason: collision with root package name */
    public static final Method f2880t;

    /* renamed from: u, reason: collision with root package name */
    public static final Method f2881u;

    /* renamed from: v, reason: collision with root package name */
    public static final Method f2882v;
    public final Context alpha;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2884b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2885c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2886d;

    /* renamed from: g, reason: collision with root package name */
    public C0460i0 f2888g;

    /* renamed from: h, reason: collision with root package name */
    public View f2889h;

    /* renamed from: i, reason: collision with root package name */
    public AdapterView.OnItemClickListener f2890i;

    /* renamed from: j, reason: collision with root package name */
    public AdapterView.OnItemSelectedListener f2891j;

    /* renamed from: o, reason: collision with root package name */
    public final Handler f2896o;
    public ListAdapter purple;

    /* renamed from: q, reason: collision with root package name */
    public Rect f2898q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2899r;
    public Z red;

    /* renamed from: s, reason: collision with root package name */
    public final af f2900s;
    public int white;
    public int yellow;
    public final int silver = -2;
    public int teal = -2;

    /* renamed from: a, reason: collision with root package name */
    public final int f2883a = 1002;
    public int e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final int f2887f = LottieConstants.IterateForever;

    /* renamed from: k, reason: collision with root package name */
    public final RunnableC0458h0 f2892k = new RunnableC0458h0(this, 1);

    /* renamed from: l, reason: collision with root package name */
    public final ViewOnTouchListenerC0464k0 f2893l = new ViewOnTouchListenerC0464k0(this);

    /* renamed from: m, reason: collision with root package name */
    public final C0462j0 f2894m = new C0462j0(this);

    /* renamed from: n, reason: collision with root package name */
    public final RunnableC0458h0 f2895n = new RunnableC0458h0(this, 0);

    /* renamed from: p, reason: collision with root package name */
    public final Rect f2897p = new Rect();

    static {
        int i4 = Build.VERSION.SDK_INT;
        Class cls = Boolean.TYPE;
        if (i4 <= 28) {
            try {
                f2880t = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", cls);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f2882v = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                f2881u = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, cls);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [androidx.appcompat.widget.af, android.widget.PopupWindow] */
    public C0466l0(Context context, AttributeSet attributeSet, int i4) {
        Drawable drawable;
        int resourceId;
        this.alpha = context;
        this.f2896o = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aj.a.papa, i4, 0);
        this.white = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.yellow = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f2884b = true;
        }
        obtainStyledAttributes.recycle();
        ?? popupWindow = new PopupWindow(context, attributeSet, i4, 0);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, aj.a.tango, i4, 0);
        if (obtainStyledAttributes2.hasValue(2)) {
            popupWindow.setOverlapAnchor(obtainStyledAttributes2.getBoolean(2, false));
        }
        if (obtainStyledAttributes2.hasValue(0) && (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) != 0) {
            drawable = AbstractC3032n3.echo(resourceId, context);
        } else {
            drawable = obtainStyledAttributes2.getDrawable(0);
        }
        popupWindow.setBackgroundDrawable(drawable);
        obtainStyledAttributes2.recycle();
        this.f2900s = popupWindow;
        popupWindow.setInputMethodMode(1);
    }

    @Override // ao.ab
    public final boolean alpha() {
        return this.f2900s.isShowing();
    }

    public final int bravo() {
        return this.white;
    }

    public final void charlie(int i4) {
        this.white = i4;
    }

    @Override // ao.ab
    public final void dismiss() {
        af afVar = this.f2900s;
        afVar.dismiss();
        afVar.setContentView(null);
        this.red = null;
        this.f2896o.removeCallbacks(this.f2892k);
    }

    public final Drawable echo() {
        return this.f2900s.getBackground();
    }

    @Override // ao.ab
    public final void golf() {
        int i4;
        boolean z2;
        int alpha;
        int makeMeasureSpec;
        int i5;
        int i10;
        boolean z10;
        Z z11;
        int i11;
        int i12;
        int i13 = 0;
        Z z12 = this.red;
        af afVar = this.f2900s;
        Context context = this.alpha;
        if (z12 == null) {
            Z papa = papa(context, !this.f2899r);
            this.red = papa;
            papa.setAdapter(this.purple);
            this.red.setOnItemClickListener(this.f2890i);
            this.red.setFocusable(true);
            this.red.setFocusableInTouchMode(true);
            this.red.setOnItemSelectedListener(new C0452e0(0, this));
            this.red.setOnScrollListener(this.f2894m);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f2891j;
            if (onItemSelectedListener != null) {
                this.red.setOnItemSelectedListener(onItemSelectedListener);
            }
            afVar.setContentView(this.red);
        }
        Drawable background = afVar.getBackground();
        Rect rect = this.f2897p;
        if (background != null) {
            background.getPadding(rect);
            int i14 = rect.top;
            i4 = rect.bottom + i14;
            if (!this.f2884b) {
                this.yellow = -i14;
            }
        } else {
            rect.setEmpty();
            i4 = 0;
        }
        if (afVar.getInputMethodMode() == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        View view = this.f2889h;
        int i15 = this.yellow;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = f2881u;
            if (method != null) {
                try {
                    alpha = ((Integer) method.invoke(afVar, view, Integer.valueOf(i15), Boolean.valueOf(z2))).intValue();
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                }
            }
            alpha = afVar.getMaxAvailableHeight(view, i15);
        } else {
            alpha = AbstractC0454f0.alpha(afVar, view, i15, z2);
        }
        int i16 = this.silver;
        if (i16 == -1) {
            i10 = alpha + i4;
        } else {
            int i17 = this.teal;
            if (i17 != -2) {
                if (i17 != -1) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i17, 1073741824);
                } else {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
                }
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), RecyclerView.UNDEFINED_DURATION);
            }
            int alpha2 = this.red.alpha(makeMeasureSpec, alpha);
            if (alpha2 > 0) {
                i5 = this.red.getPaddingBottom() + this.red.getPaddingTop() + i4;
            } else {
                i5 = 0;
            }
            i10 = alpha2 + i5;
        }
        if (this.f2900s.getInputMethodMode() == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        afVar.setWindowLayoutType(this.f2883a);
        if (afVar.isShowing()) {
            if (this.f2889h.isAttachedToWindow()) {
                int i18 = this.teal;
                if (i18 == -1) {
                    i18 = -1;
                } else if (i18 == -2) {
                    i18 = this.f2889h.getWidth();
                }
                if (i16 == -1) {
                    if (z10) {
                        i16 = i10;
                    } else {
                        i16 = -1;
                    }
                    if (z10) {
                        if (this.teal == -1) {
                            i12 = -1;
                        } else {
                            i12 = 0;
                        }
                        afVar.setWidth(i12);
                        afVar.setHeight(0);
                    } else {
                        if (this.teal == -1) {
                            i13 = -1;
                        }
                        afVar.setWidth(i13);
                        afVar.setHeight(-1);
                    }
                } else if (i16 == -2) {
                    i16 = i10;
                }
                afVar.setOutsideTouchable(true);
                int i19 = i18;
                View view2 = this.f2889h;
                int i20 = this.white;
                int i21 = this.yellow;
                if (i19 < 0) {
                    i19 = -1;
                }
                if (i16 < 0) {
                    i11 = -1;
                } else {
                    i11 = i16;
                }
                afVar.update(view2, i20, i21, i19, i11);
                return;
            }
            return;
        }
        int i22 = this.teal;
        if (i22 == -1) {
            i22 = -1;
        } else if (i22 == -2) {
            i22 = this.f2889h.getWidth();
        }
        if (i16 == -1) {
            i16 = -1;
        } else if (i16 == -2) {
            i16 = i10;
        }
        afVar.setWidth(i22);
        afVar.setHeight(i16);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f2880t;
            if (method2 != null) {
                try {
                    method2.invoke(afVar, Boolean.TRUE);
                } catch (Exception unused2) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            AbstractC0456g0.bravo(afVar, true);
        }
        afVar.setOutsideTouchable(true);
        afVar.setTouchInterceptor(this.f2893l);
        if (this.f2886d) {
            afVar.setOverlapAnchor(this.f2885c);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method3 = f2882v;
            if (method3 != null) {
                try {
                    method3.invoke(afVar, this.f2898q);
                } catch (Exception e) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
        } else {
            AbstractC0456g0.alpha(afVar, this.f2898q);
        }
        afVar.showAsDropDown(this.f2889h, this.white, this.yellow, this.e);
        this.red.setSelection(-1);
        if ((!this.f2899r || this.red.isInTouchMode()) && (z11 = this.red) != null) {
            z11.setListSelectionHidden(true);
            z11.requestLayout();
        }
        if (!this.f2899r) {
            this.f2896o.post(this.f2895n);
        }
    }

    public final void india(Drawable drawable) {
        this.f2900s.setBackgroundDrawable(drawable);
    }

    @Override // ao.ab
    public final Z juliet() {
        return this.red;
    }

    public final void kilo(int i4) {
        this.yellow = i4;
        this.f2884b = true;
    }

    public final int november() {
        if (!this.f2884b) {
            return 0;
        }
        return this.yellow;
    }

    public void oscar(ListAdapter listAdapter) {
        C0460i0 c0460i0 = this.f2888g;
        if (c0460i0 == null) {
            this.f2888g = new C0460i0(0, this);
        } else {
            ListAdapter listAdapter2 = this.purple;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(c0460i0);
            }
        }
        this.purple = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f2888g);
        }
        Z z2 = this.red;
        if (z2 != null) {
            z2.setAdapter(this.purple);
        }
    }

    public Z papa(Context context, boolean z2) {
        return new Z(context, z2);
    }

    public final void romeo(int i4) {
        Drawable background = this.f2900s.getBackground();
        if (background != null) {
            Rect rect = this.f2897p;
            background.getPadding(rect);
            this.teal = rect.left + rect.right + i4;
            return;
        }
        this.teal = i4;
    }
}
