package U0;

import F.B0;
import F.C0088b;
import F.J0;
import Lb.C;
import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import androidx.compose.runtime.AbstractC0587t;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import androidx.compose.runtime.ax;
import androidx.compose.runtime.t0;
import androidx.lifecycle.T;
import androidx.recyclerview.widget.RecyclerView;
import delivery.samurai.android.R;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s6.AbstractC2609a7;
import s6.AbstractC2618b7;
import t0.AbstractC2902a;

/* loaded from: classes3.dex */
public final class z extends AbstractC2902a {

    /* renamed from: u, reason: collision with root package name */
    public static final c f2099u = c.yellow;

    /* renamed from: b, reason: collision with root package name */
    public Function0 f2100b;

    /* renamed from: c, reason: collision with root package name */
    public ad f2101c;

    /* renamed from: d, reason: collision with root package name */
    public String f2102d;
    public final View e;

    /* renamed from: f, reason: collision with root package name */
    public final ab f2103f;

    /* renamed from: g, reason: collision with root package name */
    public final WindowManager f2104g;

    /* renamed from: h, reason: collision with root package name */
    public final WindowManager.LayoutParams f2105h;

    /* renamed from: i, reason: collision with root package name */
    public ac f2106i;

    /* renamed from: j, reason: collision with root package name */
    public Q0.n f2107j;

    /* renamed from: k, reason: collision with root package name */
    public final ax f2108k;

    /* renamed from: l, reason: collision with root package name */
    public final ax f2109l;

    /* renamed from: m, reason: collision with root package name */
    public Q0.l f2110m;

    /* renamed from: n, reason: collision with root package name */
    public final androidx.compose.runtime.ad f2111n;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f2112o;

    /* renamed from: p, reason: collision with root package name */
    public final S.x f2113p;

    /* renamed from: q, reason: collision with root package name */
    public B0 f2114q;

    /* renamed from: r, reason: collision with root package name */
    public final ax f2115r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2116s;

    /* renamed from: t, reason: collision with root package name */
    public final int[] f2117t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [U0.ab] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public z(Function0 function0, ad adVar, String str, View view, Q0.d dVar, ac acVar, UUID uuid) {
        super(view.getContext(), null);
        ?? r02;
        if (Build.VERSION.SDK_INT >= 29) {
            r02 = new Object();
        } else {
            r02 = new Object();
        }
        this.f2100b = function0;
        this.f2101c = adVar;
        this.f2102d = str;
        this.e = view;
        this.f2103f = r02;
        Object systemService = view.getContext().getSystemService("window");
        Intrinsics.charlie(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.f2104g = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        ad adVar2 = this.f2101c;
        boolean bravo = l.bravo(view);
        boolean z2 = adVar2.bravo;
        int i4 = adVar2.alpha;
        if (z2 && bravo) {
            i4 |= 8192;
        } else if (z2 && !bravo) {
            i4 &= -8193;
        }
        layoutParams.flags = i4;
        layoutParams.type = 1002;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(R.string.default_popup_window_title));
        this.f2105h = layoutParams;
        this.f2106i = acVar;
        this.f2107j = Q0.n.alpha;
        this.f2108k = C0564b.zulu(null);
        this.f2109l = C0564b.zulu(null);
        this.f2111n = C0564b.quebec(new C(15, this));
        this.f2112o = new Rect();
        this.f2113p = new S.x(new j(this, 2));
        setId(android.R.id.content);
        T.juliet(this, T.delta(view));
        T.kilo(this, T.echo(view));
        AbstractC2609a7.delta(this, AbstractC2609a7.alpha(view));
        setTag(R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(dVar.lavender((float) 8));
        setOutlineProvider(new J0(2));
        this.f2115r = C0564b.zulu(r.alpha);
        this.f2117t = new int[2];
    }

    private final Xd.l getContent() {
        return (Xd.l) ((t0) this.f2115r).getValue();
    }

    public static /* synthetic */ void getParams$ui_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final q0.z getParentLayoutCoordinates() {
        return (q0.z) ((t0) this.f2109l).getValue();
    }

    private final Q0.l getVisibleDisplayBounds() {
        this.f2103f.getClass();
        View view = this.e;
        Rect rect = this.f2112o;
        view.getWindowVisibleDisplayFrame(rect);
        return new Q0.l(rect.left, rect.top, rect.right, rect.bottom);
    }

    private final void setContent(Xd.l lVar) {
        ((t0) this.f2115r).setValue(lVar);
    }

    private final void setParentLayoutCoordinates(q0.z zVar) {
        ((t0) this.f2109l).setValue(zVar);
    }

    @Override // t0.AbstractC2902a
    public final void alpha(InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-857613600);
        if (c0585q.india(this)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i10 = i5 | i4;
        if ((i10 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i10 & 1, z2)) {
            getContent().invoke(c0585q, 0);
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new C0088b(this, i4, 5);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f2101c.charlie) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getKeyCode() == 4 || keyEvent.getKeyCode() == 111) {
            KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
            if (keyDispatcherState == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                keyDispatcherState.startTracking(keyEvent, this);
                return true;
            }
            if (keyEvent.getAction() == 1 && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                Function0 function0 = this.f2100b;
                if (function0 != null) {
                    function0.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // t0.AbstractC2902a
    public final void foxtrot(boolean z2, int i4, int i5, int i10, int i11) {
        super.foxtrot(z2, i4, i5, i10, i11);
        this.f2101c.getClass();
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        WindowManager.LayoutParams layoutParams = this.f2105h;
        layoutParams.width = childAt.getMeasuredWidth();
        layoutParams.height = childAt.getMeasuredHeight();
        this.f2103f.getClass();
        this.f2104g.updateViewLayout(this, layoutParams);
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.f2111n.getValue()).booleanValue();
    }

    @NotNull
    public final WindowManager.LayoutParams getParams$ui_release() {
        return this.f2105h;
    }

    @NotNull
    public final Q0.n getParentLayoutDirection() {
        return this.f2107j;
    }

    @Nullable
    /* renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final Q0.m m9getPopupContentSizebOM6tXw() {
        return (Q0.m) ((t0) this.f2108k).getValue();
    }

    @NotNull
    public final ac getPositionProvider() {
        return this.f2106i;
    }

    @Override // t0.AbstractC2902a
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f2116s;
    }

    @NotNull
    public AbstractC2902a getSubCompositionView() {
        return this;
    }

    @NotNull
    public final String getTestTag() {
        return this.f2102d;
    }

    @Nullable
    public /* bridge */ /* synthetic */ View getViewRoot() {
        return null;
    }

    @Override // t0.AbstractC2902a
    public final void golf(int i4, int i5) {
        this.f2101c.getClass();
        Q0.l visibleDisplayBounds = getVisibleDisplayBounds();
        super.golf(View.MeasureSpec.makeMeasureSpec(visibleDisplayBounds.delta(), RecyclerView.UNDEFINED_DURATION), View.MeasureSpec.makeMeasureSpec(visibleDisplayBounds.bravo(), RecyclerView.UNDEFINED_DURATION));
    }

    public final void juliet(AbstractC0587t abstractC0587t, Xd.l lVar) {
        setParentCompositionContext(abstractC0587t);
        setContent(lVar);
        this.f2116s = true;
    }

    public final void kilo(Function0 function0, ad adVar, String str, Q0.n nVar) {
        this.f2100b = function0;
        this.f2102d = str;
        if (!Intrinsics.areEqual(this.f2101c, adVar)) {
            adVar.getClass();
            WindowManager.LayoutParams layoutParams = this.f2105h;
            this.f2101c = adVar;
            boolean bravo = l.bravo(this.e);
            boolean z2 = adVar.bravo;
            int i4 = adVar.alpha;
            if (z2 && bravo) {
                i4 |= 8192;
            } else if (z2 && !bravo) {
                i4 &= -8193;
            }
            layoutParams.flags = i4;
            this.f2103f.getClass();
            this.f2104g.updateViewLayout(this, layoutParams);
        }
        int i5 = w.$EnumSwitchMapping$0[nVar.ordinal()];
        int i10 = 1;
        if (i5 != 1) {
            if (i5 != 2) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            i10 = 0;
        }
        super.setLayoutDirection(i10);
    }

    public final void lima() {
        q0.z parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            if (!parentLayoutCoordinates.india()) {
                parentLayoutCoordinates = null;
            }
            if (parentLayoutCoordinates != null) {
                long kilo = parentLayoutCoordinates.kilo();
                long foxtrot = parentLayoutCoordinates.foxtrot(0L);
                Q0.l alpha = AbstractC2618b7.alpha((Math.round(Float.intBitsToFloat((int) (foxtrot >> 32))) << 32) | (4294967295L & Math.round(Float.intBitsToFloat((int) (foxtrot & 4294967295L)))), kilo);
                if (!Intrinsics.areEqual(alpha, this.f2110m)) {
                    this.f2110m = alpha;
                    november();
                }
            }
        }
    }

    public final void mike(q0.z zVar) {
        setParentLayoutCoordinates(zVar);
        lima();
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [kotlin.jvm.internal.t, java.lang.Object] */
    public final void november() {
        Q0.m m9getPopupContentSizebOM6tXw;
        Q0.l lVar = this.f2110m;
        if (lVar != null && (m9getPopupContentSizebOM6tXw = m9getPopupContentSizebOM6tXw()) != null) {
            Q0.l visibleDisplayBounds = getVisibleDisplayBounds();
            long delta = (visibleDisplayBounds.delta() << 32) | (visibleDisplayBounds.bravo() & 4294967295L);
            ?? obj = new Object();
            obj.alpha = 0L;
            this.f2113p.delta(this, f2099u, new y(obj, this, lVar, delta, m9getPopupContentSizebOM6tXw.alpha));
            WindowManager.LayoutParams layoutParams = this.f2105h;
            long j5 = obj.alpha;
            layoutParams.x = (int) (j5 >> 32);
            layoutParams.y = (int) (j5 & 4294967295L);
            boolean z2 = this.f2101c.echo;
            ab abVar = this.f2103f;
            if (z2) {
                abVar.alpha(this, (int) (delta >> 32), (int) (delta & 4294967295L));
            }
            abVar.getClass();
            this.f2104g.updateViewLayout(this, layoutParams);
        }
    }

    @Override // t0.AbstractC2902a, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2113p.echo();
        if (this.f2101c.charlie && Build.VERSION.SDK_INT >= 33) {
            if (this.f2114q == null) {
                this.f2114q = new B0(this.f2100b, 1);
            }
            o.golf(this, this.f2114q);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        S.x xVar = this.f2113p;
        B2.s sVar = xVar.hotel;
        if (sVar != null) {
            sVar.charlie();
        }
        xVar.alpha();
        if (Build.VERSION.SDK_INT >= 33) {
            o.hotel(this, this.f2114q);
        }
        this.f2114q = null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f2101c.delta) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            Function0 function0 = this.f2100b;
            if (function0 != null) {
                function0.invoke();
                return true;
            }
        } else if (motionEvent != null && motionEvent.getAction() == 4) {
            Function0 function02 = this.f2100b;
            if (function02 != null) {
                function02.invoke();
            }
        } else {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i4) {
    }

    public final void setParentLayoutDirection(@NotNull Q0.n nVar) {
        this.f2107j = nVar;
    }

    /* renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m10setPopupContentSizefhxjrPA(@Nullable Q0.m mVar) {
        ((t0) this.f2108k).setValue(mVar);
    }

    public final void setPositionProvider(@NotNull ac acVar) {
        this.f2106i = acVar;
    }

    public final void setTestTag(@NotNull String str) {
        this.f2102d = str;
    }
}
