package androidx.appcompat.app;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.l1;
import androidx.appcompat.widget.m1;
import delivery.samurai.android.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import s1.InterfaceC2587u;
import s1.a0;
import s1.au;

/* loaded from: classes3.dex */
public final class q implements InterfaceC2587u, b, ao.w {
    public final /* synthetic */ ab alpha;

    public /* synthetic */ q(ab abVar) {
        this.alpha = abVar;
    }

    @Override // ao.w
    public void bravo(ao.l lVar, boolean z2) {
        boolean z10;
        int i4;
        aa aaVar;
        ao.l kilo = lVar.kilo();
        int i5 = 0;
        if (kilo != lVar) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            lVar = kilo;
        }
        ab abVar = this.alpha;
        aa[] aaVarArr = abVar.f2706E;
        if (aaVarArr != null) {
            i4 = aaVarArr.length;
        } else {
            i4 = 0;
        }
        while (true) {
            if (i5 < i4) {
                aaVar = aaVarArr[i5];
                if (aaVar != null && aaVar.hotel == lVar) {
                    break;
                } else {
                    i5++;
                }
            } else {
                aaVar = null;
                break;
            }
        }
        if (aaVar != null) {
            if (z10) {
                abVar.papa(aaVar.alpha, aaVar, kilo);
                abVar.romeo(aaVar, true);
            } else {
                abVar.romeo(aaVar, z2);
            }
        }
    }

    @Override // ao.w
    public boolean echo(ao.l lVar) {
        Window.Callback callback;
        if (lVar == lVar.kilo()) {
            ab abVar = this.alpha;
            if (abVar.f2748y && (callback = abVar.e.getCallback()) != null && !abVar.f2711J) {
                callback.onMenuOpened(108, lVar);
                return true;
            }
            return true;
        }
        return true;
    }

    @Override // s1.InterfaceC2587u
    public a0 gold(View view, a0 a0Var) {
        boolean z2;
        a0 a0Var2;
        int bravo;
        int charlie;
        boolean z10;
        int color;
        boolean z11 = true;
        int i4 = 0;
        int delta = a0Var.delta();
        ab abVar = this.alpha;
        abVar.getClass();
        int delta2 = a0Var.delta();
        ActionBarContextView actionBarContextView = abVar.f2738o;
        if (actionBarContextView != null && (actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) abVar.f2738o.getLayoutParams();
            if (abVar.f2738o.isShown()) {
                if (abVar.f2722V == null) {
                    abVar.f2722V = new Rect();
                    abVar.f2723W = new Rect();
                }
                Rect rect = abVar.f2722V;
                Rect rect2 = abVar.f2723W;
                rect.set(a0Var.bravo(), a0Var.delta(), a0Var.charlie(), a0Var.alpha());
                ViewGroup viewGroup = abVar.f2743t;
                if (Build.VERSION.SDK_INT >= 29) {
                    boolean z12 = m1.alpha;
                    l1.alpha(viewGroup, rect, rect2);
                } else {
                    if (!m1.alpha) {
                        m1.alpha = true;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            m1.bravo = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                m1.bravo.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                        }
                    }
                    Method method = m1.bravo;
                    if (method != null) {
                        try {
                            method.invoke(viewGroup, rect, rect2);
                        } catch (Exception e) {
                            Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e);
                        }
                    }
                }
                int i5 = rect.top;
                int i10 = rect.left;
                int i11 = rect.right;
                ViewGroup viewGroup2 = abVar.f2743t;
                WeakHashMap weakHashMap = au.alpha;
                a0 alpha = s1.am.alpha(viewGroup2);
                if (alpha == null) {
                    bravo = 0;
                } else {
                    bravo = alpha.bravo();
                }
                if (alpha == null) {
                    charlie = 0;
                } else {
                    charlie = alpha.charlie();
                }
                if (marginLayoutParams.topMargin == i5 && marginLayoutParams.leftMargin == i10 && marginLayoutParams.rightMargin == i11) {
                    z10 = false;
                } else {
                    marginLayoutParams.topMargin = i5;
                    marginLayoutParams.leftMargin = i10;
                    marginLayoutParams.rightMargin = i11;
                    z10 = true;
                }
                Context context = abVar.f2728d;
                if (i5 > 0 && abVar.f2745v == null) {
                    View view2 = new View(context);
                    abVar.f2745v = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = bravo;
                    layoutParams.rightMargin = charlie;
                    abVar.f2743t.addView(abVar.f2745v, -1, layoutParams);
                } else {
                    View view3 = abVar.f2745v;
                    if (view3 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view3.getLayoutParams();
                        int i12 = marginLayoutParams2.height;
                        int i13 = marginLayoutParams.topMargin;
                        if (i12 != i13 || marginLayoutParams2.leftMargin != bravo || marginLayoutParams2.rightMargin != charlie) {
                            marginLayoutParams2.height = i13;
                            marginLayoutParams2.leftMargin = bravo;
                            marginLayoutParams2.rightMargin = charlie;
                            abVar.f2745v.setLayoutParams(marginLayoutParams2);
                        }
                    }
                }
                View view4 = abVar.f2745v;
                if (view4 == null) {
                    z11 = false;
                }
                if (z11 && view4.getVisibility() != 0) {
                    View view5 = abVar.f2745v;
                    if ((view5.getWindowSystemUiVisibility() & 8192) != 0) {
                        color = context.getColor(R.color.abc_decor_view_status_guard_light);
                    } else {
                        color = context.getColor(R.color.abc_decor_view_status_guard);
                    }
                    view5.setBackgroundColor(color);
                }
                if (!abVar.A && z11) {
                    delta2 = 0;
                }
                z2 = z11;
                z11 = z10;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z2 = false;
            } else {
                z2 = false;
                z11 = false;
            }
            if (z11) {
                abVar.f2738o.setLayoutParams(marginLayoutParams);
            }
        } else {
            z2 = false;
        }
        View view6 = abVar.f2745v;
        if (view6 != null) {
            if (!z2) {
                i4 = 8;
            }
            view6.setVisibility(i4);
        }
        if (delta != delta2) {
            a0Var2 = a0Var.foxtrot(a0Var.bravo(), delta2, a0Var.charlie(), a0Var.alpha());
        } else {
            a0Var2 = a0Var;
        }
        return au.india(view, a0Var2);
    }
}
