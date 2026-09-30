package d0;

import J2.t;
import Q0.n;
import a0.AbstractC0349c;
import a0.AbstractC0367u;
import a0.C0348b;
import a0.C0365s;
import a0.C0366t;
import a0.InterfaceC0364r;
import a0.ao;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import bx.C0769g;
import s6.AbstractC2627c7;

/* renamed from: d0.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1569g implements InterfaceC1566d {
    public final C0365s bravo;
    public final c0.b charlie;
    public final RenderNode delta;
    public long echo;
    public Paint foxtrot;
    public Matrix golf;
    public boolean hotel;
    public float india;
    public int juliet;
    public float kilo;
    public float lima;
    public float mike;
    public float november;
    public long oscar;
    public long papa;
    public float quebec;
    public float romeo;
    public boolean sierra;
    public boolean tango;
    public boolean uniform;
    public int victor;

    public C1569g() {
        C0365s c0365s = new C0365s();
        c0.b bVar = new c0.b();
        this.bravo = c0365s;
        this.charlie = bVar;
        RenderNode foxtrot = AbstractC1568f.foxtrot();
        this.delta = foxtrot;
        this.echo = 0L;
        foxtrot.setClipToBounds(false);
        ivory(foxtrot, 0);
        this.india = 1.0f;
        this.juliet = 3;
        this.kilo = 1.0f;
        this.lima = 1.0f;
        long j5 = C0366t.bravo;
        this.oscar = j5;
        this.papa = j5;
        this.romeo = 8.0f;
        this.victor = 0;
    }

    @Override // d0.InterfaceC1566d
    public final float alpha() {
        return this.india;
    }

    @Override // d0.InterfaceC1566d
    public final void amber(float f5) {
        this.kilo = f5;
        this.delta.setScaleX(f5);
    }

    @Override // d0.InterfaceC1566d
    public final float azure() {
        return this.romeo;
    }

    @Override // d0.InterfaceC1566d
    public final float beige() {
        return 0.0f;
    }

    @Override // d0.InterfaceC1566d
    public final void black() {
        this.delta.setTranslationX(0.0f);
    }

    @Override // d0.InterfaceC1566d
    public final void blue(boolean z2) {
        this.sierra = z2;
        indigo();
    }

    @Override // d0.InterfaceC1566d
    public final float bravo() {
        return this.kilo;
    }

    @Override // d0.InterfaceC1566d
    public final float bronze() {
        return 0.0f;
    }

    @Override // d0.InterfaceC1566d
    public final void charlie(float f5) {
        this.november = f5;
        this.delta.setElevation(f5);
    }

    @Override // d0.InterfaceC1566d
    public final void coral(Q0.d dVar, n nVar, C1564b c1564b, C0769g c0769g) {
        RecordingCanvas beginRecording;
        c0.b bVar = this.charlie;
        beginRecording = this.delta.beginRecording();
        try {
            C0365s c0365s = this.bravo;
            C0348b c0348b = c0365s.alpha;
            Canvas canvas = c0348b.alpha;
            c0348b.alpha = beginRecording;
            t tVar = bVar.purple;
            tVar.whiskey(dVar);
            tVar.xray(nVar);
            tVar.purple = c1564b;
            tVar.yankee(this.echo);
            tVar.victor(c0348b);
            c0769g.invoke(bVar);
            c0365s.alpha.alpha = canvas;
        } finally {
            this.delta.endRecording();
        }
    }

    @Override // d0.InterfaceC1566d
    public final void crimson(int i4) {
        this.victor = i4;
        jade();
    }

    @Override // d0.InterfaceC1566d
    public final void cyan(long j5) {
        this.papa = j5;
        this.delta.setSpotShadowColor(ao.beige(j5));
    }

    @Override // d0.InterfaceC1566d
    public final void delta() {
        if (Build.VERSION.SDK_INT >= 31) {
            this.delta.setRenderEffect(null);
        }
    }

    @Override // d0.InterfaceC1566d
    public final void echo(float f5) {
        this.quebec = f5;
        this.delta.setRotationZ(f5);
    }

    @Override // d0.InterfaceC1566d
    public final Matrix emerald() {
        Matrix matrix = this.golf;
        if (matrix == null) {
            matrix = new Matrix();
            this.golf = matrix;
        }
        this.delta.getMatrix(matrix);
        return matrix;
    }

    @Override // d0.InterfaceC1566d
    public final void foxtrot(float f5) {
        this.mike = f5;
        this.delta.setTranslationY(f5);
    }

    @Override // d0.InterfaceC1566d
    public final void fuchsia(float f5) {
        this.romeo = f5;
        this.delta.setCameraDistance(f5);
    }

    @Override // d0.InterfaceC1566d
    public final float gold() {
        return this.november;
    }

    @Override // d0.InterfaceC1566d
    public final void golf(Outline outline, long j5) {
        boolean z2;
        this.delta.setOutline(outline);
        if (outline != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.hotel = z2;
        indigo();
    }

    @Override // d0.InterfaceC1566d
    public final float gray() {
        return this.lima;
    }

    @Override // d0.InterfaceC1566d
    public final int green() {
        return this.juliet;
    }

    @Override // d0.InterfaceC1566d
    public final void hotel(int i4) {
        this.juliet = i4;
        Paint paint = this.foxtrot;
        if (paint == null) {
            paint = new Paint();
            this.foxtrot = paint;
        }
        paint.setBlendMode(ao.xray(i4));
        jade();
    }

    @Override // d0.InterfaceC1566d
    public final void india() {
        this.delta.discardDisplayList();
    }

    public final void indigo() {
        boolean z2;
        boolean z10 = this.sierra;
        boolean z11 = false;
        if (z10 && !this.hotel) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z10 && this.hotel) {
            z11 = true;
        }
        if (z2 != this.tango) {
            this.tango = z2;
            this.delta.setClipToBounds(z2);
        }
        if (z11 != this.uniform) {
            this.uniform = z11;
            this.delta.setClipToOutline(z11);
        }
    }

    public final void ivory(RenderNode renderNode, int i4) {
        if (i4 == 1) {
            renderNode.setUseCompositingLayer(true, this.foxtrot);
            renderNode.setHasOverlappingRendering(true);
        } else if (i4 == 2) {
            renderNode.setUseCompositingLayer(false, this.foxtrot);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, this.foxtrot);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    public final void jade() {
        int i4 = this.victor;
        if (i4 != 1 && this.juliet == 3) {
            ivory(this.delta, i4);
        } else {
            ivory(this.delta, 1);
        }
    }

    @Override // d0.InterfaceC1566d
    public final int juliet() {
        return this.victor;
    }

    @Override // d0.InterfaceC1566d
    public final AbstractC0367u kilo() {
        return null;
    }

    @Override // d0.InterfaceC1566d
    public final void lima(float f5) {
        this.lima = f5;
        this.delta.setScaleY(f5);
    }

    @Override // d0.InterfaceC1566d
    public final void mike(int i4, int i5, long j5) {
        this.delta.setPosition(i4, i5, ((int) (j5 >> 32)) + i4, ((int) (4294967295L & j5)) + i5);
        this.echo = AbstractC2627c7.bravo(j5);
    }

    @Override // d0.InterfaceC1566d
    public final float november() {
        return 0.0f;
    }

    @Override // d0.InterfaceC1566d
    public final boolean oscar() {
        boolean hasDisplayList;
        hasDisplayList = this.delta.hasDisplayList();
        return hasDisplayList;
    }

    @Override // d0.InterfaceC1566d
    public final void papa(InterfaceC0364r interfaceC0364r) {
        AbstractC0349c.alpha(interfaceC0364r).drawRenderNode(this.delta);
    }

    @Override // d0.InterfaceC1566d
    public final float quebec() {
        return this.quebec;
    }

    @Override // d0.InterfaceC1566d
    public final void romeo(long j5) {
        if ((9223372034707292159L & j5) == 9205357640488583168L) {
            this.delta.resetPivot();
        } else {
            this.delta.setPivotX(Float.intBitsToFloat((int) (j5 >> 32)));
            this.delta.setPivotY(Float.intBitsToFloat((int) (j5 & 4294967295L)));
        }
    }

    @Override // d0.InterfaceC1566d
    public final long sierra() {
        return this.oscar;
    }

    @Override // d0.InterfaceC1566d
    public final void tango() {
        this.delta.setRotationX(0.0f);
    }

    @Override // d0.InterfaceC1566d
    public final void uniform(float f5) {
        this.india = f5;
        this.delta.setAlpha(f5);
    }

    @Override // d0.InterfaceC1566d
    public final float victor() {
        return this.mike;
    }

    @Override // d0.InterfaceC1566d
    public final void whiskey() {
        this.delta.setRotationY(0.0f);
    }

    @Override // d0.InterfaceC1566d
    public final long xray() {
        return this.papa;
    }

    @Override // d0.InterfaceC1566d
    public final void yankee(long j5) {
        this.oscar = j5;
        this.delta.setAmbientShadowColor(ao.beige(j5));
    }

    @Override // d0.InterfaceC1566d
    public final void zulu() {
        Paint paint = this.foxtrot;
        if (paint == null) {
            paint = new Paint();
            this.foxtrot = paint;
        }
        paint.setColorFilter(null);
        jade();
    }
}
