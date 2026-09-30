package s1;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.Interpolator;
import j1.C1929c;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class C implements View.OnApplyWindowInsetsListener {
    public final Pf.g alpha;
    public a0 bravo;

    public C(View view, Pf.g gVar) {
        a0 a0Var;
        O j5;
        this.alpha = gVar;
        WeakHashMap weakHashMap = au.alpha;
        a0 alpha = am.alpha(view);
        if (alpha != null) {
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 34) {
                j5 = new N(alpha);
            } else if (i4 >= 31) {
                j5 = new M(alpha);
            } else if (i4 >= 30) {
                j5 = new L(alpha);
            } else if (i4 >= 29) {
                j5 = new K(alpha);
            } else {
                j5 = new J(alpha);
            }
            a0Var = j5.bravo();
        } else {
            a0Var = null;
        }
        this.bravo = a0Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        X x4;
        Interpolator interpolator;
        long j5;
        boolean z2;
        boolean z10;
        boolean z11 = true;
        if (!view.isLaidOut()) {
            this.bravo = a0.hotel(view, windowInsets);
            return D.juliet(view, windowInsets);
        }
        a0 hotel = a0.hotel(view, windowInsets);
        if (this.bravo == null) {
            WeakHashMap weakHashMap = au.alpha;
            this.bravo = am.alpha(view);
        }
        if (this.bravo == null) {
            this.bravo = hotel;
            return D.juliet(view, windowInsets);
        }
        Pf.g kilo = D.kilo(view);
        if (kilo != null && Objects.equals((a0) kilo.purple, hotel)) {
            return D.juliet(view, windowInsets);
        }
        int[] iArr = new int[1];
        int[] iArr2 = new int[1];
        a0 a0Var = this.bravo;
        int i4 = 1;
        while (true) {
            x4 = hotel.alpha;
            if (i4 > 512) {
                break;
            }
            C1929c golf = x4.golf(i4);
            C1929c golf2 = a0Var.alpha.golf(i4);
            int i5 = golf.alpha;
            int i10 = golf2.alpha;
            int i11 = golf.delta;
            int i12 = golf.charlie;
            int i13 = golf.bravo;
            boolean z12 = z11;
            int i14 = golf2.delta;
            int i15 = golf2.charlie;
            int i16 = golf2.bravo;
            if (i5 <= i10 && i13 <= i16 && i12 <= i15 && i11 <= i14) {
                z2 = false;
            } else {
                z2 = z12;
            }
            if (i5 >= i10 && i13 >= i16 && i12 >= i15 && i11 >= i14) {
                z10 = false;
            } else {
                z10 = z12;
            }
            if (z2 != z10) {
                if (z2) {
                    iArr[0] = iArr[0] | i4;
                } else {
                    iArr2[0] = iArr2[0] | i4;
                }
            }
            i4 <<= 1;
            z11 = z12;
        }
        int i17 = iArr[0];
        int i18 = iArr2[0];
        int i19 = i17 | i18;
        if (i19 == 0) {
            this.bravo = hotel;
            return D.juliet(view, windowInsets);
        }
        a0 a0Var2 = this.bravo;
        if ((i17 & 8) != 0) {
            interpolator = D.echo;
        } else if ((i18 & 8) != 0) {
            interpolator = D.foxtrot;
        } else if ((i17 & 519) != 0) {
            interpolator = D.golf;
        } else if ((i18 & 519) != 0) {
            interpolator = D.hotel;
        } else {
            interpolator = null;
        }
        if ((i19 & 8) != 0) {
            j5 = 160;
        } else {
            j5 = 250;
        }
        I i20 = new I(i19, interpolator, j5);
        i20.alpha.echo(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(i20.alpha.bravo());
        C1929c golf3 = x4.golf(i19);
        C1929c golf4 = a0Var2.alpha.golf(i19);
        int min = Math.min(golf3.alpha, golf4.alpha);
        int i21 = golf3.bravo;
        int i22 = golf4.bravo;
        int min2 = Math.min(i21, i22);
        int i23 = golf3.charlie;
        int i24 = golf4.charlie;
        int min3 = Math.min(i23, i24);
        int i25 = golf3.delta;
        int i26 = golf4.delta;
        com.google.android.play.core.integrity.k kVar = new com.google.android.play.core.integrity.k(9, C1929c.bravo(min, min2, min3, Math.min(i25, i26)), C1929c.bravo(Math.max(golf3.alpha, golf4.alpha), Math.max(i21, i22), Math.max(i23, i24), Math.max(i25, i26)));
        D.golf(view, i20, hotel, false);
        duration.addUpdateListener(new C2567B(i20, hotel, a0Var2, i19, view));
        duration.addListener(new com.google.android.material.navigation.a(view, 2, i20));
        ViewTreeObserverOnPreDrawListenerC2589w.alpha(view, new ao.d(view, i20, kVar, duration, 10, false));
        this.bravo = hotel;
        return D.juliet(view, windowInsets);
    }
}
