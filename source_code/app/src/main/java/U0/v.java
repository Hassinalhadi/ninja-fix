package U0;

import F.J0;
import android.content.Context;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.lifecycle.T;
import delivery.samurai.android.R;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2609a7;
import t6.AbstractC3007i3;
import t6.AbstractC3087z;

/* loaded from: classes3.dex */
public final class v extends ae.p {
    public Function0 alpha;
    public t purple;
    public final View red;
    public final s silver;
    public boolean teal;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public v(Function0 function0, t tVar, View view, Q0.n nVar, Q0.d dVar, UUID uuid) {
        super(new ContextThemeWrapper(r1, r2), 0);
        int i4;
        ViewGroup viewGroup;
        Context context = view.getContext();
        if (tVar.echo) {
            i4 = R.style.DialogWindowTheme;
        } else {
            i4 = R.style.FloatingDialogWindowTheme;
        }
        this.alpha = function0;
        this.purple = tVar;
        this.red = view;
        float f5 = 8;
        Window window = getWindow();
        if (window != null) {
            window.requestFeature(1);
            window.setBackgroundDrawableResource(android.R.color.transparent);
            AbstractC3087z.charlie(window, this.purple.echo);
            window.setGravity(17);
            if (!this.purple.echo) {
                window.addFlags(65792);
                WindowManager.LayoutParams attributes = window.getAttributes();
                int i5 = Build.VERSION.SDK_INT;
                if (i5 >= 28) {
                    m.alpha.alpha(attributes);
                }
                if (i5 >= 30) {
                    n nVar2 = n.alpha;
                    nVar2.alpha(attributes, 0);
                    nVar2.bravo(attributes, 0);
                }
                window.setAttributes(attributes);
            }
            s sVar = new s(getContext(), window);
            setTitle(this.purple.foxtrot);
            sVar.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
            sVar.setClipChildren(false);
            sVar.setElevation(dVar.lavender(f5));
            sVar.setOutlineProvider(new J0(1));
            this.silver = sVar;
            View decorView = window.getDecorView();
            if (decorView instanceof ViewGroup) {
                viewGroup = (ViewGroup) decorView;
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                bravo(viewGroup);
            }
            setContentView(sVar);
            T.juliet(sVar, T.delta(view));
            T.kilo(sVar, T.echo(view));
            AbstractC2609a7.delta(sVar, AbstractC2609a7.alpha(view));
            charlie(this.alpha, this.purple, nVar);
            AbstractC3007i3.alpha(getOnBackPressedDispatcher(), this, new b(this, 1), 2);
            return;
        }
        throw new IllegalStateException("Dialog has no window");
    }

    public static final void bravo(ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        viewGroup.setClipChildren(false);
        if (!(viewGroup instanceof s)) {
            int childCount = viewGroup.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = viewGroup.getChildAt(i4);
                if (childAt instanceof ViewGroup) {
                    viewGroup2 = (ViewGroup) childAt;
                } else {
                    viewGroup2 = null;
                }
                if (viewGroup2 != null) {
                    bravo(viewGroup2);
                }
            }
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }

    public final void charlie(Function0 function0, t tVar, Q0.n nVar) {
        int i4;
        int i5;
        boolean z2;
        int i10;
        this.alpha = function0;
        this.purple = tVar;
        ae aeVar = tVar.charlie;
        boolean bravo = l.bravo(this.red);
        int i11 = af.$EnumSwitchMapping$0[aeVar.ordinal()];
        int i12 = 0;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                bravo = true;
            }
        } else {
            bravo = false;
        }
        Window window = getWindow();
        Intrinsics.checkNotNull(window);
        if (bravo) {
            i4 = 8192;
        } else {
            i4 = -8193;
        }
        window.setFlags(i4, 8192);
        int i13 = u.$EnumSwitchMapping$0[nVar.ordinal()];
        if (i13 != 1) {
            if (i13 == 2) {
                i5 = 1;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            i5 = 0;
        }
        s sVar = this.silver;
        sVar.setLayoutDirection(i5);
        boolean z10 = sVar.f2097f;
        boolean z11 = tVar.echo;
        boolean z12 = tVar.delta;
        if (z10 && z12 == sVar.f2096d && z11 == sVar.e) {
            z2 = false;
        } else {
            z2 = true;
        }
        sVar.f2096d = z12;
        sVar.e = z11;
        if (z2) {
            Window window2 = sVar.f2094b;
            WindowManager.LayoutParams attributes = window2.getAttributes();
            if (z12) {
                i10 = -2;
            } else {
                i10 = -1;
            }
            if (i10 != attributes.width || !sVar.f2097f) {
                window2.setLayout(i10, -2);
                sVar.f2097f = true;
            }
        }
        setCanceledOnTouchOutside(tVar.bravo);
        Window window3 = getWindow();
        if (window3 != null) {
            if (!z11) {
                if (Build.VERSION.SDK_INT < 31) {
                    i12 = 16;
                } else {
                    i12 = 48;
                }
            }
            window3.setSoftInputMode(i12);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i4, KeyEvent keyEvent) {
        if (this.purple.alpha && keyEvent.isTracking() && !keyEvent.isCanceled() && i4 == 111) {
            this.alpha.invoke();
            return true;
        }
        return super.onKeyUp(i4, keyEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006b, code lost:
    
        if (r5 <= r1) goto L35;
     */
    @Override // android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        View childAt;
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (this.purple.bravo) {
            s sVar = this.silver;
            sVar.getClass();
            float x4 = motionEvent.getX();
            if (!Float.isInfinite(x4) && !Float.isNaN(x4)) {
                float y10 = motionEvent.getY();
                if (!Float.isInfinite(y10) && !Float.isNaN(y10) && (childAt = sVar.getChildAt(0)) != null) {
                    int left = childAt.getLeft() + sVar.getLeft();
                    int width = childAt.getWidth() + left;
                    int top = childAt.getTop() + sVar.getTop();
                    int height = childAt.getHeight() + top;
                    int delta = Zd.a.delta(motionEvent.getX());
                    if (left <= delta) {
                        if (delta <= width) {
                            int delta2 = Zd.a.delta(motionEvent.getY());
                            if (top <= delta2) {
                            }
                        }
                    }
                }
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked == 3) {
                        this.teal = false;
                        return onTouchEvent;
                    }
                } else if (this.teal) {
                    this.alpha.invoke();
                    this.teal = false;
                    return true;
                }
                return onTouchEvent;
            }
            this.teal = true;
            return true;
        }
        int actionMasked2 = motionEvent.getActionMasked();
        if (actionMasked2 == 0 || actionMasked2 == 1 || actionMasked2 == 3) {
            this.teal = false;
            return onTouchEvent;
        }
        return onTouchEvent;
    }
}
