package ao;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.C0466l0;
import androidx.appcompat.widget.C0476q0;
import androidx.appcompat.widget.Z;
import delivery.samurai.android.R;

/* loaded from: classes3.dex */
public final class ac extends t implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: a, reason: collision with root package name */
    public final C0476q0 f3170a;

    /* renamed from: d, reason: collision with root package name */
    public u f3173d;
    public View e;

    /* renamed from: f, reason: collision with root package name */
    public View f3174f;

    /* renamed from: g, reason: collision with root package name */
    public w f3175g;

    /* renamed from: h, reason: collision with root package name */
    public ViewTreeObserver f3176h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3177i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3178j;

    /* renamed from: k, reason: collision with root package name */
    public int f3179k;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3181m;
    public final Context purple;
    public final l red;
    public final i silver;
    public final boolean teal;
    public final int white;
    public final int yellow;

    /* renamed from: b, reason: collision with root package name */
    public final c f3171b = new c(1, this);

    /* renamed from: c, reason: collision with root package name */
    public final B8.b f3172c = new B8.b(5, this);

    /* renamed from: l, reason: collision with root package name */
    public int f3180l = 0;

    /* JADX WARN: Type inference failed for: r6v1, types: [androidx.appcompat.widget.l0, androidx.appcompat.widget.q0] */
    public ac(int i4, Context context, View view, l lVar, boolean z2) {
        this.purple = context;
        this.red = lVar;
        this.teal = z2;
        this.silver = new i(lVar, LayoutInflater.from(context), z2, R.layout.abc_popup_menu_item_layout);
        this.yellow = i4;
        Resources resources = context.getResources();
        this.white = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.e = view;
        this.f3170a = new C0466l0(context, null, i4);
        lVar.bravo(this, context);
    }

    @Override // ao.ab
    public final boolean alpha() {
        if (!this.f3177i && this.f3170a.f2900s.isShowing()) {
            return true;
        }
        return false;
    }

    @Override // ao.x
    public final void bravo(l lVar, boolean z2) {
        if (lVar == this.red) {
            dismiss();
            w wVar = this.f3175g;
            if (wVar != null) {
                wVar.bravo(lVar, z2);
            }
        }
    }

    @Override // ao.x
    public final boolean delta() {
        return false;
    }

    @Override // ao.ab
    public final void dismiss() {
        if (alpha()) {
            this.f3170a.dismiss();
        }
    }

    @Override // ao.x
    public final void echo(w wVar) {
        this.f3175g = wVar;
    }

    @Override // ao.ab
    public final void golf() {
        View view;
        boolean z2;
        Rect rect;
        if (alpha()) {
            return;
        }
        if (!this.f3177i && (view = this.e) != null) {
            this.f3174f = view;
            C0476q0 c0476q0 = this.f3170a;
            c0476q0.f2900s.setOnDismissListener(this);
            c0476q0.f2890i = this;
            c0476q0.f2899r = true;
            c0476q0.f2900s.setFocusable(true);
            View view2 = this.f3174f;
            if (this.f3176h == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
            this.f3176h = viewTreeObserver;
            if (z2) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f3171b);
            }
            view2.addOnAttachStateChangeListener(this.f3172c);
            c0476q0.f2889h = view2;
            c0476q0.e = this.f3180l;
            boolean z10 = this.f3178j;
            Context context = this.purple;
            i iVar = this.silver;
            if (!z10) {
                this.f3179k = t.oscar(iVar, context, this.white);
                this.f3178j = true;
            }
            c0476q0.romeo(this.f3179k);
            c0476q0.f2900s.setInputMethodMode(2);
            Rect rect2 = this.alpha;
            if (rect2 != null) {
                rect = new Rect(rect2);
            } else {
                rect = null;
            }
            c0476q0.f2898q = rect;
            c0476q0.golf();
            Z z11 = c0476q0.red;
            z11.setOnKeyListener(this);
            if (this.f3181m) {
                l lVar = this.red;
                if (lVar.f3207f != null) {
                    FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) z11, false);
                    TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                    if (textView != null) {
                        textView.setText(lVar.f3207f);
                    }
                    frameLayout.setEnabled(false);
                    z11.addHeaderView(frameLayout, null, false);
                }
            }
            c0476q0.oscar(iVar);
            c0476q0.golf();
            return;
        }
        throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
    }

    @Override // ao.x
    public final void hotel(Parcelable parcelable) {
    }

    @Override // ao.x
    public final void india() {
        this.f3178j = false;
        i iVar = this.silver;
        if (iVar != null) {
            iVar.notifyDataSetChanged();
        }
    }

    @Override // ao.ab
    public final Z juliet() {
        return this.f3170a.red;
    }

    @Override // ao.x
    public final Parcelable lima() {
        return null;
    }

    @Override // ao.x
    public final boolean mike(ae aeVar) {
        if (aeVar.hasVisibleItems()) {
            View view = this.f3174f;
            v vVar = new v(this.yellow, this.purple, view, aeVar, this.teal);
            w wVar = this.f3175g;
            vVar.hotel = wVar;
            t tVar = vVar.india;
            if (tVar != null) {
                tVar.echo(wVar);
            }
            boolean whiskey = t.whiskey(aeVar);
            vVar.golf = whiskey;
            t tVar2 = vVar.india;
            if (tVar2 != null) {
                tVar2.quebec(whiskey);
            }
            vVar.juliet = this.f3173d;
            this.f3173d = null;
            this.red.charlie(false);
            C0476q0 c0476q0 = this.f3170a;
            int i4 = c0476q0.white;
            int november = c0476q0.november();
            if ((Gravity.getAbsoluteGravity(this.f3180l, this.e.getLayoutDirection()) & 7) == 5) {
                i4 += this.e.getWidth();
            }
            if (!vVar.bravo()) {
                if (vVar.echo != null) {
                    vVar.delta(i4, november, true, true);
                }
            }
            w wVar2 = this.f3175g;
            if (wVar2 != null) {
                wVar2.echo(aeVar);
            }
            return true;
        }
        return false;
    }

    @Override // ao.t
    public final void november(l lVar) {
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f3177i = true;
        this.red.charlie(true);
        ViewTreeObserver viewTreeObserver = this.f3176h;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f3176h = this.f3174f.getViewTreeObserver();
            }
            this.f3176h.removeGlobalOnLayoutListener(this.f3171b);
            this.f3176h = null;
        }
        this.f3174f.removeOnAttachStateChangeListener(this.f3172c);
        u uVar = this.f3173d;
        if (uVar != null) {
            uVar.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i4, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i4 == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override // ao.t
    public final void papa(View view) {
        this.e = view;
    }

    @Override // ao.t
    public final void quebec(boolean z2) {
        this.silver.red = z2;
    }

    @Override // ao.t
    public final void romeo(int i4) {
        this.f3180l = i4;
    }

    @Override // ao.t
    public final void sierra(int i4) {
        this.f3170a.white = i4;
    }

    @Override // ao.t
    public final void tango(PopupWindow.OnDismissListener onDismissListener) {
        this.f3173d = (u) onDismissListener;
    }

    @Override // ao.t
    public final void uniform(boolean z2) {
        this.f3181m = z2;
    }

    @Override // ao.t
    public final void victor(int i4) {
        this.f3170a.kilo(i4);
    }
}
