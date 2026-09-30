package androidx.appcompat.widget;

import android.content.Context;
import android.view.View;
import delivery.samurai.android.R;

/* renamed from: androidx.appcompat.widget.t0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0481t0 {
    public final ao.l alpha;
    public final View bravo;
    public final ao.v charlie;
    public InterfaceC0479s0 delta;

    public C0481t0(Context context, View view) {
        this.bravo = view;
        ao.l lVar = new ao.l(context);
        this.alpha = lVar;
        lVar.teal = new C0465l(3, this);
        ao.v vVar = new ao.v(R.attr.popupMenuStyle, context, view, lVar, false);
        this.charlie = vVar;
        vVar.foxtrot = 0;
        vVar.juliet = new C0477r0(this);
    }
}
