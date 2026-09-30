package b;

import a0.AbstractC0349c;
import a0.C0348b;
import a0.InterfaceC0364r;
import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.compose.runtime.t0;
import c0.C0801a;
import d0.C1564b;
import s0.AbstractC2556p;
import s0.InterfaceC2558s;

/* loaded from: classes3.dex */
public final class au extends AbstractC2556p implements InterfaceC2558s {
    public final /* synthetic */ int red = 1;
    public final C0704t silver;
    public final ao teal;
    public Object white;

    public au(m0.ah ahVar, C0704t c0704t, ao aoVar) {
        this.silver = c0704t;
        this.teal = aoVar;
        b(ahVar);
    }

    public static boolean e(float f5, EdgeEffect edgeEffect, Canvas canvas) {
        if (f5 == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int save = canvas.save();
        canvas.rotate(f5);
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    public static boolean f(float f5, long j5, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(f5);
        canvas.translate(Float.intBitsToFloat((int) (j5 >> 32)), Float.intBitsToFloat((int) (j5 & 4294967295L)));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    private final /* synthetic */ void h() {
    }

    private final /* synthetic */ void i() {
    }

    @Override // s0.InterfaceC2558s
    public final /* synthetic */ void blue() {
        int i4 = this.red;
    }

    public RenderNode g() {
        RenderNode renderNode = (RenderNode) this.white;
        if (renderNode == null) {
            RenderNode charlie = androidx.appcompat.widget.J.charlie();
            this.white = charlie;
            return charlie;
        }
        return renderNode;
    }

    @Override // s0.InterfaceC2558s
    public final void jade(s0.an anVar) {
        boolean z2;
        long j5;
        boolean z10;
        boolean z11;
        RecordingCanvas beginRecording;
        J2.t tVar;
        boolean z12;
        boolean z13;
        char c3;
        float f5;
        float f10;
        float f11;
        float f12;
        boolean z14;
        float f13;
        boolean z15;
        float f14;
        boolean z16;
        float f15;
        float f16;
        switch (this.red) {
            case 0:
                c0.b bVar = anVar.alpha;
                long oscar = bVar.purple.oscar();
                C0704t c0704t = this.silver;
                c0704t.india(oscar);
                if (Z.e.echo(bVar.purple.oscar())) {
                    anVar.charlie();
                    return;
                }
                anVar.charlie();
                ((t0) c0704t.delta).getValue();
                Canvas alpha = AbstractC0349c.alpha(bVar.purple.mike());
                ao aoVar = this.teal;
                boolean foxtrot = ao.foxtrot(aoVar.foxtrot);
                androidx.compose.foundation.layout.M m4 = (androidx.compose.foundation.layout.M) this.white;
                boolean z17 = false;
                if (foxtrot) {
                    EdgeEffect charlie = aoVar.charlie();
                    float f17 = -Float.intBitsToFloat((int) (anVar.bravo() & 4294967295L));
                    float lavender = anVar.lavender(m4.bravo(anVar.getLayoutDirection()));
                    z2 = f(270.0f, (Float.floatToRawIntBits(lavender) & 4294967295L) | (Float.floatToRawIntBits(f17) << 32), charlie, alpha);
                } else {
                    z2 = false;
                }
                if (ao.foxtrot(aoVar.delta)) {
                    EdgeEffect echo = aoVar.echo();
                    float lavender2 = anVar.lavender(m4.bravo);
                    j5 = 4294967295L;
                    if (!f(0.0f, (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(lavender2) & 4294967295L), echo, alpha) && !z2) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                } else {
                    j5 = 4294967295L;
                }
                if (ao.foxtrot(aoVar.golf)) {
                    EdgeEffect delta = aoVar.delta();
                    float lavender3 = anVar.lavender(m4.delta(anVar.getLayoutDirection())) + (-Zd.a.delta(Float.intBitsToFloat((int) (anVar.bravo() >> 32))));
                    if (!f(90.0f, (Float.floatToRawIntBits(lavender3) & j5) | (Float.floatToRawIntBits(0.0f) << 32), delta, alpha) && !z2) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                }
                if (ao.foxtrot(aoVar.echo)) {
                    EdgeEffect bravo = aoVar.bravo();
                    float lavender4 = anVar.lavender(m4.delta);
                    float f18 = -Float.intBitsToFloat((int) (anVar.bravo() >> 32));
                    float f19 = (-Float.intBitsToFloat((int) (anVar.bravo() & j5))) + lavender4;
                    if (f(180.0f, (Float.floatToRawIntBits(f18) << 32) | (Float.floatToRawIntBits(f19) & j5), bravo, alpha) || z2) {
                        z17 = true;
                    }
                    z2 = z17;
                }
                if (z2) {
                    c0704t.delta();
                    return;
                }
                return;
            default:
                c0.b bVar2 = anVar.alpha;
                long oscar2 = bVar2.purple.oscar();
                C0704t c0704t2 = this.silver;
                c0704t2.india(oscar2);
                Canvas alpha2 = AbstractC0349c.alpha(bVar2.purple.mike());
                ((t0) c0704t2.delta).getValue();
                J2.t tVar2 = bVar2.purple;
                if (Z.e.echo(tVar2.oscar())) {
                    anVar.charlie();
                    return;
                }
                boolean isHardwareAccelerated = alpha2.isHardwareAccelerated();
                ao aoVar2 = this.teal;
                if (!isHardwareAccelerated) {
                    EdgeEffect edgeEffect = aoVar2.delta;
                    if (edgeEffect != null) {
                        edgeEffect.finish();
                    }
                    EdgeEffect edgeEffect2 = aoVar2.echo;
                    if (edgeEffect2 != null) {
                        edgeEffect2.finish();
                    }
                    EdgeEffect edgeEffect3 = aoVar2.foxtrot;
                    if (edgeEffect3 != null) {
                        edgeEffect3.finish();
                    }
                    EdgeEffect edgeEffect4 = aoVar2.golf;
                    if (edgeEffect4 != null) {
                        edgeEffect4.finish();
                    }
                    EdgeEffect edgeEffect5 = aoVar2.hotel;
                    if (edgeEffect5 != null) {
                        edgeEffect5.finish();
                    }
                    EdgeEffect edgeEffect6 = aoVar2.india;
                    if (edgeEffect6 != null) {
                        edgeEffect6.finish();
                    }
                    EdgeEffect edgeEffect7 = aoVar2.juliet;
                    if (edgeEffect7 != null) {
                        edgeEffect7.finish();
                    }
                    EdgeEffect edgeEffect8 = aoVar2.kilo;
                    if (edgeEffect8 != null) {
                        edgeEffect8.finish();
                    }
                    anVar.charlie();
                    return;
                }
                float lavender5 = anVar.lavender(ae.alpha);
                if (!ao.foxtrot(aoVar2.delta) && !ao.golf(aoVar2.hotel) && !ao.foxtrot(aoVar2.echo) && !ao.golf(aoVar2.india)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (!ao.foxtrot(aoVar2.foxtrot) && !ao.golf(aoVar2.juliet) && !ao.foxtrot(aoVar2.golf) && !ao.golf(aoVar2.kilo)) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (z10 && z11) {
                    g().setPosition(0, 0, alpha2.getWidth(), alpha2.getHeight());
                } else if (z10) {
                    g().setPosition(0, 0, (Zd.a.delta(lavender5) * 2) + alpha2.getWidth(), alpha2.getHeight());
                } else if (z11) {
                    g().setPosition(0, 0, alpha2.getWidth(), (Zd.a.delta(lavender5) * 2) + alpha2.getHeight());
                } else {
                    anVar.charlie();
                    return;
                }
                beginRecording = g().beginRecording();
                if (ao.golf(aoVar2.juliet)) {
                    EdgeEffect edgeEffect9 = aoVar2.juliet;
                    if (edgeEffect9 == null) {
                        edgeEffect9 = aoVar2.alpha(d.K.purple);
                        aoVar2.juliet = edgeEffect9;
                    }
                    e(90.0f, edgeEffect9, beginRecording);
                    edgeEffect9.finish();
                }
                if (ao.foxtrot(aoVar2.foxtrot)) {
                    EdgeEffect charlie2 = aoVar2.charlie();
                    z13 = e(270.0f, charlie2, beginRecording);
                    if (ao.golf(aoVar2.foxtrot)) {
                        z12 = z11;
                        float intBitsToFloat = Float.intBitsToFloat((int) (c0704t2.charlie() & 4294967295L));
                        EdgeEffect edgeEffect10 = aoVar2.juliet;
                        if (edgeEffect10 == null) {
                            edgeEffect10 = aoVar2.alpha(d.K.purple);
                            aoVar2.juliet = edgeEffect10;
                        }
                        int i4 = Build.VERSION.SDK_INT;
                        if (i4 >= 31) {
                            f16 = E2.f.bravo(charlie2);
                        } else {
                            f16 = 0.0f;
                        }
                        tVar = tVar2;
                        float f20 = 1 - intBitsToFloat;
                        if (i4 >= 31) {
                            E2.f.echo(edgeEffect10, f16, f20);
                        } else {
                            edgeEffect10.onPull(f16, f20);
                        }
                    } else {
                        tVar = tVar2;
                        z12 = z11;
                    }
                } else {
                    tVar = tVar2;
                    z12 = z11;
                    z13 = false;
                }
                if (ao.golf(aoVar2.hotel)) {
                    EdgeEffect edgeEffect11 = aoVar2.hotel;
                    if (edgeEffect11 == null) {
                        edgeEffect11 = aoVar2.alpha(d.K.alpha);
                        aoVar2.hotel = edgeEffect11;
                    }
                    e(180.0f, edgeEffect11, beginRecording);
                    edgeEffect11.finish();
                }
                if (ao.foxtrot(aoVar2.delta)) {
                    EdgeEffect echo2 = aoVar2.echo();
                    if (!e(0.0f, echo2, beginRecording) && !z13) {
                        z16 = false;
                    } else {
                        z16 = true;
                    }
                    if (ao.golf(aoVar2.delta)) {
                        float intBitsToFloat2 = Float.intBitsToFloat((int) (c0704t2.charlie() >> 32));
                        EdgeEffect edgeEffect12 = aoVar2.hotel;
                        if (edgeEffect12 == null) {
                            edgeEffect12 = aoVar2.alpha(d.K.alpha);
                            aoVar2.hotel = edgeEffect12;
                        }
                        c3 = ' ';
                        int i5 = Build.VERSION.SDK_INT;
                        if (i5 >= 31) {
                            f15 = E2.f.bravo(echo2);
                        } else {
                            f15 = 0.0f;
                        }
                        if (i5 >= 31) {
                            E2.f.echo(edgeEffect12, f15, intBitsToFloat2);
                        } else {
                            edgeEffect12.onPull(f15, intBitsToFloat2);
                        }
                    } else {
                        c3 = ' ';
                    }
                    z13 = z16;
                } else {
                    c3 = ' ';
                }
                if (ao.golf(aoVar2.kilo)) {
                    EdgeEffect edgeEffect13 = aoVar2.kilo;
                    if (edgeEffect13 == null) {
                        edgeEffect13 = aoVar2.alpha(d.K.purple);
                        aoVar2.kilo = edgeEffect13;
                    }
                    e(270.0f, edgeEffect13, beginRecording);
                    edgeEffect13.finish();
                }
                if (ao.foxtrot(aoVar2.golf)) {
                    EdgeEffect delta2 = aoVar2.delta();
                    if (!e(90.0f, delta2, beginRecording) && !z13) {
                        z15 = false;
                    } else {
                        z15 = true;
                    }
                    if (ao.golf(aoVar2.golf)) {
                        float intBitsToFloat3 = Float.intBitsToFloat((int) (c0704t2.charlie() & 4294967295L));
                        EdgeEffect edgeEffect14 = aoVar2.kilo;
                        if (edgeEffect14 == null) {
                            edgeEffect14 = aoVar2.alpha(d.K.purple);
                            aoVar2.kilo = edgeEffect14;
                        }
                        int i10 = Build.VERSION.SDK_INT;
                        if (i10 >= 31) {
                            f14 = E2.f.bravo(delta2);
                        } else {
                            f14 = 0.0f;
                        }
                        if (i10 >= 31) {
                            E2.f.echo(edgeEffect14, f14, intBitsToFloat3);
                        } else {
                            edgeEffect14.onPull(f14, intBitsToFloat3);
                        }
                    }
                    z13 = z15;
                }
                if (ao.golf(aoVar2.india)) {
                    EdgeEffect edgeEffect15 = aoVar2.india;
                    if (edgeEffect15 == null) {
                        edgeEffect15 = aoVar2.alpha(d.K.alpha);
                        aoVar2.india = edgeEffect15;
                    }
                    f5 = 0.0f;
                    e(0.0f, edgeEffect15, beginRecording);
                    edgeEffect15.finish();
                } else {
                    f5 = 0.0f;
                }
                if (ao.foxtrot(aoVar2.echo)) {
                    EdgeEffect bravo2 = aoVar2.bravo();
                    if (!e(180.0f, bravo2, beginRecording) && !z13) {
                        z14 = false;
                    } else {
                        z14 = true;
                    }
                    if (ao.golf(aoVar2.echo)) {
                        float intBitsToFloat4 = Float.intBitsToFloat((int) (c0704t2.charlie() >> c3));
                        EdgeEffect edgeEffect16 = aoVar2.india;
                        if (edgeEffect16 == null) {
                            edgeEffect16 = aoVar2.alpha(d.K.alpha);
                            aoVar2.india = edgeEffect16;
                        }
                        int i11 = Build.VERSION.SDK_INT;
                        if (i11 >= 31) {
                            f13 = E2.f.bravo(bravo2);
                        } else {
                            f13 = f5;
                        }
                        float f21 = 1 - intBitsToFloat4;
                        if (i11 >= 31) {
                            E2.f.echo(edgeEffect16, f13, f21);
                        } else {
                            edgeEffect16.onPull(f13, f21);
                        }
                    }
                    z13 = z14;
                }
                if (z13) {
                    c0704t2.delta();
                }
                if (z12) {
                    f10 = 0.0f;
                } else {
                    f10 = lavender5;
                }
                if (z10) {
                    lavender5 = 0.0f;
                }
                Q0.n layoutDirection = anVar.getLayoutDirection();
                C0348b c0348b = new C0348b();
                c0348b.alpha = beginRecording;
                long oscar3 = tVar.oscar();
                J2.t tVar3 = bVar2.purple;
                C0801a c0801a = ((c0.b) tVar3.red).alpha;
                Q0.d dVar = c0801a.alpha;
                Q0.n nVar = c0801a.bravo;
                InterfaceC0364r mike = tVar3.mike();
                long oscar4 = bVar2.purple.oscar();
                J2.t tVar4 = bVar2.purple;
                C1564b c1564b = (C1564b) tVar4.purple;
                tVar4.whiskey(anVar);
                tVar4.xray(layoutDirection);
                tVar4.victor(c0348b);
                tVar4.yankee(oscar3);
                tVar4.purple = null;
                c0348b.golf();
                try {
                    ((av.ah) bVar2.purple.alpha).red(f10, lavender5);
                    try {
                        anVar.charlie();
                        c0348b.november();
                        J2.t tVar5 = bVar2.purple;
                        tVar5.whiskey(dVar);
                        tVar5.xray(nVar);
                        tVar5.victor(mike);
                        tVar5.yankee(oscar4);
                        tVar5.purple = c1564b;
                        g().endRecording();
                        int save = alpha2.save();
                        alpha2.translate(f11, f12);
                        alpha2.drawRenderNode(g());
                        alpha2.restoreToCount(save);
                        return;
                    } finally {
                        ((av.ah) bVar2.purple.alpha).red(-f10, -lavender5);
                    }
                } catch (Throwable th) {
                    c0348b.november();
                    J2.t tVar6 = bVar2.purple;
                    tVar6.whiskey(dVar);
                    tVar6.xray(nVar);
                    tVar6.victor(mike);
                    tVar6.yankee(oscar4);
                    tVar6.purple = c1564b;
                    throw th;
                }
        }
    }

    public au(m0.ah ahVar, C0704t c0704t, ao aoVar, androidx.compose.foundation.layout.M m4) {
        this.silver = c0704t;
        this.teal = aoVar;
        this.white = m4;
        b(ahVar);
    }
}
