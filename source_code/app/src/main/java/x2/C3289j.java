package x2;

import java.util.ArrayList;

/* renamed from: x2.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3289j extends aa {
    public final /* synthetic */ Object alpha;
    public final /* synthetic */ ArrayList bravo;
    public final /* synthetic */ Object charlie;
    public final /* synthetic */ ArrayList delta;
    public final /* synthetic */ C3291l echo;

    public C3289j(C3291l c3291l, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.echo = c3291l;
        this.alpha = obj;
        this.bravo = arrayList;
        this.charlie = obj2;
        this.delta = arrayList2;
    }

    @Override // x2.aa, x2.x
    public final void onTransitionEnd(z zVar) {
        zVar.azure(this);
    }

    @Override // x2.aa, x2.x
    public final void onTransitionStart(z zVar) {
        C3291l c3291l = this.echo;
        Object obj = this.alpha;
        if (obj != null) {
            c3291l.zulu(obj, this.bravo, null);
        }
        Object obj2 = this.charlie;
        if (obj2 != null) {
            c3291l.zulu(obj2, this.delta, null);
        }
    }
}
