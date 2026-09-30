package androidx.appcompat.widget;

import android.content.Context;
import android.view.View;
import delivery.samurai.android.R;

/* renamed from: androidx.appcompat.widget.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0455g extends ao.v {
    public final /* synthetic */ int lima = 0;
    public final /* synthetic */ C0469n mike;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0455g(C0469n c0469n, Context context, ao.l lVar, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, lVar, true);
        this.mike = c0469n;
        this.foxtrot = 8388613;
        C0465l c0465l = c0469n.f2916q;
        this.hotel = c0465l;
        ao.t tVar = this.india;
        if (tVar != null) {
            tVar.echo(c0465l);
        }
    }

    @Override // ao.v
    public final void charlie() {
        switch (this.lima) {
            case 0:
                C0469n c0469n = this.mike;
                c0469n.f2913n = null;
                c0469n.f2917r = 0;
                super.charlie();
                return;
            default:
                C0469n c0469n2 = this.mike;
                ao.l lVar = c0469n2.red;
                if (lVar != null) {
                    lVar.charlie(true);
                }
                c0469n2.f2912m = null;
                super.charlie();
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0455g(C0469n c0469n, Context context, ao.ae aeVar, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, aeVar, false);
        this.mike = c0469n;
        if ((aeVar.f3183t.f3234q & 32) != 32) {
            View view2 = c0469n.f2903c;
            this.echo = view2 == null ? (View) c0469n.f2901a : view2;
        }
        C0465l c0465l = c0469n.f2916q;
        this.hotel = c0465l;
        ao.t tVar = this.india;
        if (tVar != null) {
            tVar.echo(c0465l);
        }
    }
}
