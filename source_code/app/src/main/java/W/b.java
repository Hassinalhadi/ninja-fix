package W;

import Q0.n;
import a0.AbstractC0349c;
import a0.C0348b;
import a0.InterfaceC0364r;
import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;
import c0.C0801a;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class b extends View.DragShadowBuilder {
    public final Q0.e alpha;
    public final long bravo;
    public final Function1 charlie;

    public b(Q0.e eVar, long j5, Function1 function1) {
        this.alpha = eVar;
        this.bravo = j5;
        this.charlie = function1;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onDrawShadow(Canvas canvas) {
        c0.b bVar = new c0.b();
        n nVar = n.alpha;
        Canvas canvas2 = AbstractC0349c.alpha;
        C0348b c0348b = new C0348b();
        c0348b.alpha = canvas;
        C0801a c0801a = bVar.alpha;
        Q0.d dVar = c0801a.alpha;
        n nVar2 = c0801a.bravo;
        InterfaceC0364r interfaceC0364r = c0801a.charlie;
        long j5 = c0801a.delta;
        c0801a.alpha = this.alpha;
        c0801a.bravo = nVar;
        c0801a.charlie = c0348b;
        c0801a.delta = this.bravo;
        c0348b.golf();
        this.charlie.invoke(bVar);
        c0348b.november();
        c0801a.alpha = dVar;
        c0801a.bravo = nVar2;
        c0801a.charlie = interfaceC0364r;
        c0801a.delta = j5;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onProvideShadowMetrics(Point point, Point point2) {
        long j5 = this.bravo;
        float intBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32));
        Q0.e eVar = this.alpha;
        point.set(Q0.c.bravo(eVar, intBitsToFloat / eVar.alpha()), Q0.c.bravo(eVar, Float.intBitsToFloat((int) (j5 & 4294967295L)) / eVar.alpha()));
        point2.set(point.x / 2, point.y / 2);
    }
}
