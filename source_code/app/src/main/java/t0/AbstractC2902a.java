package t0;

import F.C0088b;
import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.AbstractC0587t;
import androidx.compose.runtime.InterfaceC0581m;
import delivery.samurai.android.R;
import java.lang.ref.WeakReference;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.AbstractC2264a;
import t6.AbstractC2977c3;
import td.C3117a;
import vf.C3195B;
import wf.AbstractC3269f;
import wf.C3268e;

/* renamed from: t0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2902a extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public boolean f13805a;
    public WeakReference alpha;
    public IBinder purple;
    public T0 red;
    public AbstractC0587t silver;
    public Function0 teal;
    public boolean white;
    public boolean yellow;

    public AbstractC2902a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        w0 w0Var = new w0(this, 1);
        addOnAttachStateChangeListener(w0Var);
        x0 x0Var = new x0(this);
        AbstractC2977c3.charlie(this).alpha.add(x0Var);
        this.teal = new Ce.ab(this, w0Var, x0Var, 8);
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    private final void setParentContext(AbstractC0587t abstractC0587t) {
        if (this.silver != abstractC0587t) {
            this.silver = abstractC0587t;
            if (abstractC0587t != null) {
                this.alpha = null;
            }
            T0 t02 = this.red;
            if (t02 != null) {
                t02.alpha();
                this.red = null;
                if (isAttachedToWindow()) {
                    echo();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.purple != iBinder) {
            this.purple = iBinder;
            this.alpha = null;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        bravo();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        bravo();
        return super.addViewInLayout(view, i4, layoutParams);
    }

    public abstract void alpha(InterfaceC0581m interfaceC0581m, int i4);

    public final void bravo() {
        if (this.yellow) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    public final void charlie() {
        if (this.silver == null && !isAttachedToWindow()) {
            throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
        }
        echo();
    }

    public final void delta() {
        T0 t02 = this.red;
        if (t02 != null) {
            t02.alpha();
        }
        this.red = null;
        requestLayout();
    }

    public final void echo() {
        if (this.red == null) {
            try {
                this.yellow = true;
                this.red = U0.alpha(this, hotel(), new P.d(new C0088b(9, this), -656146368, true));
            } finally {
                this.yellow = false;
            }
        }
    }

    public void foxtrot(boolean z2, int i4, int i5, int i10, int i11) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i10 - i4) - getPaddingRight(), (i11 - i5) - getPaddingBottom());
        }
    }

    public final boolean getHasComposition() {
        if (this.red != null) {
            return true;
        }
        return false;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.white;
    }

    public void golf(int i4, int i5) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i4, i5);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i4) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i4)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i5) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i5)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final AbstractC0587t hotel() {
        androidx.compose.runtime.Y y10;
        Nd.h hVar;
        androidx.compose.runtime.D d4;
        androidx.lifecycle.ac acVar;
        AbstractC0587t abstractC0587t;
        AbstractC0587t abstractC0587t2 = this.silver;
        if (abstractC0587t2 == null) {
            abstractC0587t2 = P0.bravo(this);
            if (abstractC0587t2 == null) {
                Object parent = getParent();
                while (abstractC0587t2 == null && (parent instanceof View)) {
                    View view = (View) parent;
                    abstractC0587t2 = P0.bravo(view);
                    parent = view.getParent();
                }
            }
            androidx.compose.runtime.Y y11 = null;
            if (abstractC0587t2 != null) {
                if ((abstractC0587t2 instanceof androidx.compose.runtime.Y) && ((androidx.compose.runtime.S) ((androidx.compose.runtime.Y) abstractC0587t2).tango.getValue()).compareTo(androidx.compose.runtime.S.purple) <= 0) {
                    abstractC0587t = null;
                } else {
                    abstractC0587t = abstractC0587t2;
                }
                if (abstractC0587t != null) {
                    this.alpha = new WeakReference(abstractC0587t);
                }
            } else {
                abstractC0587t2 = null;
            }
            if (abstractC0587t2 == null) {
                WeakReference weakReference = this.alpha;
                if (weakReference == null || (abstractC0587t2 = (AbstractC0587t) weakReference.get()) == null || ((abstractC0587t2 instanceof androidx.compose.runtime.Y) && ((androidx.compose.runtime.S) ((androidx.compose.runtime.Y) abstractC0587t2).tango.getValue()).compareTo(androidx.compose.runtime.S.purple) <= 0)) {
                    abstractC0587t2 = null;
                }
                if (abstractC0587t2 == null) {
                    if (!isAttachedToWindow()) {
                        AbstractC2264a.bravo("Cannot locate windowRecomposer; View " + this + " is not attached to a window");
                    }
                    Object parent2 = getParent();
                    View view2 = this;
                    while (parent2 instanceof View) {
                        View view3 = (View) parent2;
                        if (view3.getId() == 16908290) {
                            break;
                        }
                        view2 = view3;
                        parent2 = view3.getParent();
                    }
                    AbstractC0587t bravo = P0.bravo(view2);
                    if (bravo == null) {
                        ((G0) I0.alpha.get()).getClass();
                        Nd.i iVar = Nd.i.alpha;
                        Lazy lazy = ay.e;
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            hVar = (Nd.h) ay.e.getValue();
                        } else {
                            hVar = (Nd.h) ay.f13828f.get();
                            if (hVar == null) {
                                throw new IllegalStateException("no AndroidUiDispatcher for this thread");
                            }
                        }
                        Nd.h plus = hVar.plus(iVar);
                        androidx.compose.runtime.at atVar = (androidx.compose.runtime.at) plus.get(androidx.compose.runtime.as.purple);
                        if (atVar != null) {
                            androidx.compose.runtime.D d9 = new androidx.compose.runtime.D(atVar);
                            C3.d dVar = (C3.d) d9.red;
                            synchronized (dVar.red) {
                                dVar.alpha = false;
                                d4 = d9;
                            }
                        } else {
                            d4 = 0;
                        }
                        Ref.ObjectRef objectRef = new Ref.ObjectRef();
                        Nd.h hVar2 = (T.t) plus.get(T.d.f2065i);
                        if (hVar2 == null) {
                            hVar2 = new C2919i0();
                            objectRef.alpha = hVar2;
                        }
                        if (d4 != 0) {
                            iVar = d4;
                        }
                        Nd.h plus2 = plus.plus(iVar).plus(hVar2);
                        y10 = new androidx.compose.runtime.Y(plus2);
                        y10.bronze();
                        C3117a charlie = vf.ad.charlie(plus2);
                        androidx.lifecycle.al delta = androidx.lifecycle.T.delta(view2);
                        if (delta != null) {
                            acVar = delta.getLifecycle();
                        } else {
                            acVar = null;
                        }
                        if (acVar != null) {
                            view2.addOnAttachStateChangeListener(new J0(view2, y10));
                            acVar.alpha(new N0(charlie, d4, y10, objectRef, view2));
                            view2.setTag(R.id.androidx_compose_ui_view_composition_context, y10);
                            C3195B c3195b = C3195B.alpha;
                            Handler handler = view2.getHandler();
                            int i4 = AbstractC3269f.alpha;
                            view2.addOnAttachStateChangeListener(new B8.b(8, vf.ad.zulu(c3195b, new C3268e(handler, "windowRecomposer cleanup", false).teal, null, new H0(y10, view2, null), 2)));
                        } else {
                            AbstractC2264a.charlie("ViewTreeLifecycleOwner not found from " + view2);
                            throw new KotlinNothingValueException();
                        }
                    } else if (bravo instanceof androidx.compose.runtime.Y) {
                        y10 = (androidx.compose.runtime.Y) bravo;
                    } else {
                        throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer");
                    }
                    if (((androidx.compose.runtime.S) y10.tango.getValue()).compareTo(androidx.compose.runtime.S.purple) > 0) {
                        y11 = y10;
                    }
                    if (y11 != null) {
                        this.alpha = new WeakReference(y11);
                    }
                    return y10;
                }
            }
        }
        return abstractC0587t2;
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        if (this.f13805a && !super.isTransitionGroup()) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            echo();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i4, int i5, int i10, int i11) {
        foxtrot(z2, i4, i5, i10, i11);
    }

    @Override // android.view.View
    public final void onMeasure(int i4, int i5) {
        echo();
        golf(i4, i5);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i4) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i4);
        }
    }

    public final void setParentCompositionContext(@Nullable AbstractC0587t abstractC0587t) {
        setParentContext(abstractC0587t);
    }

    public final void setShowLayoutBounds(boolean z2) {
        this.white = z2;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((C2946x) ((s0.W) childAt)).setShowLayoutBounds(z2);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z2) {
        super.setTransitionGroup(z2);
        this.f13805a = true;
    }

    public final void setViewCompositionStrategy(@NotNull B0 b02) {
        Function0 function0 = this.teal;
        if (function0 != null) {
            function0.invoke();
        }
        this.teal = b02.bravo(this);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i4) {
        bravo();
        super.addView(view, i4);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i4, ViewGroup.LayoutParams layoutParams, boolean z2) {
        bravo();
        return super.addViewInLayout(view, i4, layoutParams, z2);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i4, int i5) {
        bravo();
        super.addView(view, i4, i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        bravo();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        bravo();
        super.addView(view, i4, layoutParams);
    }
}
