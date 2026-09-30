package d0;

import F.J0;
import J2.t;
import Q0.n;
import a0.C0348b;
import a0.C0365s;
import a0.InterfaceC0364r;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;
import c0.C0801a;
import e0.AbstractC1623a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* renamed from: d0.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1575m extends View {

    /* renamed from: d, reason: collision with root package name */
    public static final J0 f12014d = new J0(3);

    /* renamed from: a, reason: collision with root package name */
    public n f12015a;
    public final AbstractC1623a alpha;

    /* renamed from: b, reason: collision with root package name */
    public Lambda f12016b;

    /* renamed from: c, reason: collision with root package name */
    public C1564b f12017c;
    public final C0365s purple;
    public final c0.b red;
    public boolean silver;
    public Outline teal;
    public boolean white;
    public Q0.d yellow;

    public C1575m(AbstractC1623a abstractC1623a, C0365s c0365s, c0.b bVar) {
        super(abstractC1623a.getContext());
        this.alpha = abstractC1623a;
        this.purple = c0365s;
        this.red = bVar;
        setOutlineProvider(f12014d);
        this.white = true;
        this.yellow = c0.c.alpha;
        this.f12015a = n.alpha;
        InterfaceC1566d.alpha.getClass();
        this.f12016b = C1565c.bravo;
        setWillNotDraw(false);
        setClipBounds(null);
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        C0365s c0365s = this.purple;
        C0348b c0348b = c0365s.alpha;
        Canvas canvas2 = c0348b.alpha;
        c0348b.alpha = canvas;
        Q0.d dVar = this.yellow;
        n nVar = this.f12015a;
        float width = getWidth();
        float height = getHeight();
        long floatToRawIntBits = (Float.floatToRawIntBits(height) & 4294967295L) | (Float.floatToRawIntBits(width) << 32);
        C1564b c1564b = this.f12017c;
        ?? r92 = this.f12016b;
        c0.b bVar = this.red;
        t tVar = bVar.purple;
        C0801a c0801a = ((c0.b) tVar.red).alpha;
        Q0.d dVar2 = c0801a.alpha;
        n nVar2 = c0801a.bravo;
        InterfaceC0364r mike = tVar.mike();
        t tVar2 = bVar.purple;
        long oscar = tVar2.oscar();
        C1564b c1564b2 = (C1564b) tVar2.purple;
        tVar2.whiskey(dVar);
        tVar2.xray(nVar);
        tVar2.victor(c0348b);
        tVar2.yankee(floatToRawIntBits);
        tVar2.purple = c1564b;
        c0348b.golf();
        try {
            r92.invoke(bVar);
            c0348b.november();
            tVar2.whiskey(dVar2);
            tVar2.xray(nVar2);
            tVar2.victor(mike);
            tVar2.yankee(oscar);
            tVar2.purple = c1564b2;
            c0365s.alpha.alpha = canvas2;
            this.silver = false;
        } catch (Throwable th) {
            c0348b.november();
            tVar2.whiskey(dVar2);
            tVar2.xray(nVar2);
            tVar2.victor(mike);
            tVar2.yankee(oscar);
            tVar2.purple = c1564b2;
            throw th;
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    public final boolean getCanUseCompositingLayer$ui_graphics_release() {
        return this.white;
    }

    @NotNull
    public final C0365s getCanvasHolder() {
        return this.purple;
    }

    @NotNull
    public final View getOwnerView() {
        return this.alpha;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.white;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (!this.silver) {
            this.silver = true;
            super.invalidate();
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z2, int i4, int i5, int i10, int i11) {
    }

    public final void setCanUseCompositingLayer$ui_graphics_release(boolean z2) {
        if (this.white != z2) {
            this.white = z2;
            invalidate();
        }
    }

    public final void setInvalidated(boolean z2) {
        this.silver = z2;
    }
}
