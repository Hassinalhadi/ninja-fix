package z5;

import Q0.n;
import Z.e;
import a0.AbstractC0349c;
import a0.AbstractC0367u;
import a0.InterfaceC0364r;
import android.graphics.ColorFilter;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0563a0;
import androidx.compose.runtime.ax;
import androidx.compose.runtime.t0;
import c0.d;
import f0.AbstractC1680b;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import qe.C2474j;
import s6.J4;
import t6.M2;

/* renamed from: z5.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3464a extends AbstractC1680b implements InterfaceC0563a0 {
    public final Drawable purple;
    public final ax red;
    public final ax silver;
    public final Lazy teal;

    public C3464a(Drawable drawable) {
        long j5;
        Intrinsics.echo(drawable, "drawable");
        this.purple = drawable;
        this.red = C0564b.zulu(0);
        Object obj = AbstractC3466c.alpha;
        if (drawable.getIntrinsicWidth() >= 0 && drawable.getIntrinsicHeight() >= 0) {
            j5 = M2.alpha(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        } else {
            j5 = 9205357640488583168L;
        }
        this.silver = C0564b.zulu(new e(j5));
        this.teal = LazyKt.lazy(new C2474j(17, this));
        if (drawable.getIntrinsicWidth() >= 0 && drawable.getIntrinsicHeight() >= 0) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
    }

    @Override // androidx.compose.runtime.InterfaceC0563a0
    public final void alpha() {
        bravo();
    }

    @Override // f0.AbstractC1680b
    public final boolean applyAlpha(float f5) {
        this.purple.setAlpha(J4.delta(Zd.a.delta(f5 * 255), 0, 255));
        return true;
    }

    @Override // f0.AbstractC1680b
    public final boolean applyColorFilter(AbstractC0367u abstractC0367u) {
        ColorFilter colorFilter;
        if (abstractC0367u != null) {
            colorFilter = abstractC0367u.alpha;
        } else {
            colorFilter = null;
        }
        this.purple.setColorFilter(colorFilter);
        return true;
    }

    @Override // f0.AbstractC1680b
    public final boolean applyLayoutDirection(n layoutDirection) {
        int i4;
        Intrinsics.echo(layoutDirection, "layoutDirection");
        int ordinal = layoutDirection.ordinal();
        if (ordinal != 0) {
            i4 = 1;
            if (ordinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            i4 = 0;
        }
        return this.purple.setLayoutDirection(i4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.InterfaceC0563a0
    public final void bravo() {
        Drawable drawable = this.purple;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        drawable.setVisible(false, false);
        drawable.setCallback(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.InterfaceC0563a0
    public final void delta() {
        Drawable.Callback callback = (Drawable.Callback) this.teal.getValue();
        Drawable drawable = this.purple;
        drawable.setCallback(callback);
        drawable.setVisible(true, true);
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }

    @Override // f0.AbstractC1680b
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public final long mo1getIntrinsicSizeNHjbRc() {
        return ((e) ((t0) this.silver).getValue()).alpha;
    }

    @Override // f0.AbstractC1680b
    public final void onDraw(d dVar) {
        Intrinsics.echo(dVar, "<this>");
        InterfaceC0364r mike = dVar.lime().mike();
        ((Number) ((t0) this.red).getValue()).intValue();
        int delta = Zd.a.delta(e.delta(dVar.bravo()));
        int delta2 = Zd.a.delta(e.bravo(dVar.bravo()));
        Drawable drawable = this.purple;
        drawable.setBounds(0, 0, delta, delta2);
        try {
            mike.golf();
            drawable.draw(AbstractC0349c.alpha(mike));
        } finally {
            mike.november();
        }
    }
}
