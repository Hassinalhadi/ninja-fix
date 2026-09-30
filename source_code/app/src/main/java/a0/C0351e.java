package a0;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import d0.C1564b;
import d0.C1567e;
import d0.C1569g;
import d0.C1571i;
import d0.InterfaceC1566d;
import delivery.samurai.android.R;
import e0.AbstractC1623a;
import e0.C1624b;
import t0.C2946x;

/* renamed from: a0.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0351e implements InterfaceC0341aa {
    public static boolean foxtrot = true;
    public final C2946x alpha;
    public final Object bravo = new Object();
    public C1624b charlie;
    public boolean delta;
    public final ComponentCallbacks2C0350d echo;

    public C0351e(C2946x c2946x) {
        this.alpha = c2946x;
        ComponentCallbacks2C0350d componentCallbacks2C0350d = new ComponentCallbacks2C0350d(this);
        this.echo = componentCallbacks2C0350d;
        if (c2946x.isAttachedToWindow()) {
            Context context = c2946x.getContext();
            if (!this.delta) {
                context.getApplicationContext().registerComponentCallbacks(componentCallbacks2C0350d);
                this.delta = true;
            }
        }
        c2946x.addOnAttachStateChangeListener(new B8.b(3, this));
    }

    @Override // a0.InterfaceC0341aa
    public final void alpha(C1564b c1564b) {
        synchronized (this.bravo) {
            if (!c1564b.sierra) {
                c1564b.sierra = true;
                c1564b.bravo();
            }
        }
    }

    @Override // a0.InterfaceC0341aa
    public final C1564b bravo() {
        InterfaceC1566d c1571i;
        C1564b c1564b;
        synchronized (this.bravo) {
            try {
                C2946x c2946x = this.alpha;
                int i4 = Build.VERSION.SDK_INT;
                if (i4 >= 29) {
                    c2946x.getUniqueDrawingId();
                }
                if (i4 >= 29) {
                    c1571i = new C1569g();
                } else if (foxtrot) {
                    try {
                        c1571i = new C1567e(this.alpha, new C0365s(), new c0.b());
                    } catch (Throwable unused) {
                        foxtrot = false;
                        c1571i = new C1571i(charlie(this.alpha));
                    }
                } else {
                    c1571i = new C1571i(charlie(this.alpha));
                }
                c1564b = new C1564b(c1571i);
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1564b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [e0.a, e0.b, android.view.View, android.view.ViewGroup] */
    public final AbstractC1623a charlie(C2946x c2946x) {
        C1624b c1624b = this.charlie;
        if (c1624b == null) {
            ?? viewGroup = new ViewGroup(c2946x.getContext());
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
            viewGroup.setTag(R.id.hide_graphics_layer_in_inspector_tag, Boolean.TRUE);
            c2946x.addView((View) viewGroup, -1);
            this.charlie = viewGroup;
            return viewGroup;
        }
        return c1624b;
    }
}
