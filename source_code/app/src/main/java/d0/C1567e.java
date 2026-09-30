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
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import bx.C0769g;
import c0.C0801a;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2627c7;
import t0.C2946x;

/* renamed from: d0.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1567e implements InterfaceC1566d {
    public static final AtomicBoolean yankee = new AtomicBoolean(true);
    public final C0365s bravo;
    public final c0.b charlie;
    public final RenderNode delta;
    public long echo;
    public Paint foxtrot;
    public Matrix golf;
    public boolean hotel;
    public long india;
    public int juliet;
    public int kilo;
    public float lima;
    public boolean mike;
    public float november;
    public float oscar;
    public float papa;
    public float quebec;
    public long romeo;
    public long sierra;
    public float tango;
    public float uniform;
    public boolean victor;
    public boolean whiskey;
    public boolean xray;

    public C1567e(C2946x c2946x, C0365s c0365s, c0.b bVar) {
        this.bravo = c0365s;
        this.charlie = bVar;
        RenderNode create = RenderNode.create("Compose", c2946x);
        this.delta = create;
        this.echo = 0L;
        this.india = 0L;
        if (yankee.getAndSet(false)) {
            create.setScaleX(create.getScaleX());
            create.setScaleY(create.getScaleY());
            create.setTranslationX(create.getTranslationX());
            create.setTranslationY(create.getTranslationY());
            create.setElevation(create.getElevation());
            create.setRotation(create.getRotation());
            create.setRotationX(create.getRotationX());
            create.setRotationY(create.getRotationY());
            create.setCameraDistance(create.getCameraDistance());
            create.setPivotX(create.getPivotX());
            create.setPivotY(create.getPivotY());
            create.setClipToOutline(create.getClipToOutline());
            create.setClipToBounds(false);
            create.setAlpha(create.getAlpha());
            create.isValid();
            create.setLeftTopRightBottom(0, 0, 0, 0);
            create.offsetLeftAndRight(0);
            create.offsetTopAndBottom(0);
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 28) {
                AbstractC1574l.charlie(create, AbstractC1574l.alpha(create));
                AbstractC1574l.delta(create, AbstractC1574l.bravo(create));
            }
            if (i4 >= 24) {
                AbstractC1573k.alpha(create);
            } else {
                AbstractC1572j.alpha(create);
            }
            create.setLayerType(0);
            create.setHasOverlappingRendering(create.hasOverlappingRendering());
        }
        create.setClipToBounds(false);
        ivory(0);
        this.juliet = 0;
        this.kilo = 3;
        this.lima = 1.0f;
        this.november = 1.0f;
        this.oscar = 1.0f;
        long j5 = C0366t.bravo;
        this.romeo = j5;
        this.sierra = j5;
        this.uniform = 8.0f;
    }

    @Override // d0.InterfaceC1566d
    public final float alpha() {
        return this.lima;
    }

    @Override // d0.InterfaceC1566d
    public final void amber(float f5) {
        this.november = f5;
        this.delta.setScaleX(f5);
    }

    @Override // d0.InterfaceC1566d
    public final float azure() {
        return this.uniform;
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
        this.victor = z2;
        indigo();
    }

    @Override // d0.InterfaceC1566d
    public final float bravo() {
        return this.november;
    }

    @Override // d0.InterfaceC1566d
    public final float bronze() {
        return 0.0f;
    }

    @Override // d0.InterfaceC1566d
    public final void charlie(float f5) {
        this.quebec = f5;
        this.delta.setElevation(f5);
    }

    @Override // d0.InterfaceC1566d
    public final void coral(Q0.d dVar, n nVar, C1564b c1564b, C0769g c0769g) {
        Canvas start = this.delta.start(Math.max((int) (this.echo >> 32), (int) (this.india >> 32)), Math.max((int) (this.echo & 4294967295L), (int) (4294967295L & this.india)));
        try {
            C0348b c0348b = this.bravo.alpha;
            Canvas canvas = c0348b.alpha;
            c0348b.alpha = start;
            c0.b bVar = this.charlie;
            t tVar = bVar.purple;
            long bravo = AbstractC2627c7.bravo(this.echo);
            C0801a c0801a = ((c0.b) tVar.red).alpha;
            Q0.d dVar2 = c0801a.alpha;
            n nVar2 = c0801a.bravo;
            InterfaceC0364r mike = tVar.mike();
            long oscar = tVar.oscar();
            C1564b c1564b2 = (C1564b) tVar.purple;
            tVar.whiskey(dVar);
            tVar.xray(nVar);
            tVar.victor(c0348b);
            tVar.yankee(bravo);
            tVar.purple = c1564b;
            c0348b.golf();
            try {
                c0769g.invoke(bVar);
                c0348b.november();
                tVar.whiskey(dVar2);
                tVar.xray(nVar2);
                tVar.victor(mike);
                tVar.yankee(oscar);
                tVar.purple = c1564b2;
                c0348b.alpha = canvas;
                this.delta.end(start);
            } catch (Throwable th) {
                c0348b.november();
                tVar.whiskey(dVar2);
                tVar.xray(nVar2);
                tVar.victor(mike);
                tVar.yankee(oscar);
                tVar.purple = c1564b2;
                throw th;
            }
        } catch (Throwable th2) {
            this.delta.end(start);
            throw th2;
        }
    }

    @Override // d0.InterfaceC1566d
    public final void crimson(int i4) {
        this.juliet = i4;
        jade();
    }

    @Override // d0.InterfaceC1566d
    public final void cyan(long j5) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.sierra = j5;
            AbstractC1574l.delta(this.delta, ao.beige(j5));
        }
    }

    @Override // d0.InterfaceC1566d
    public final void delta() {
    }

    @Override // d0.InterfaceC1566d
    public final void echo(float f5) {
        this.tango = f5;
        this.delta.setRotation(f5);
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
        this.papa = f5;
        this.delta.setTranslationY(f5);
    }

    @Override // d0.InterfaceC1566d
    public final void fuchsia(float f5) {
        this.uniform = f5;
        this.delta.setCameraDistance(-f5);
    }

    @Override // d0.InterfaceC1566d
    public final float gold() {
        return this.quebec;
    }

    @Override // d0.InterfaceC1566d
    public final void golf(Outline outline, long j5) {
        boolean z2;
        this.india = j5;
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
        return this.oscar;
    }

    @Override // d0.InterfaceC1566d
    public final int green() {
        return this.kilo;
    }

    @Override // d0.InterfaceC1566d
    public final void hotel(int i4) {
        if (this.kilo == i4) {
            return;
        }
        this.kilo = i4;
        Paint paint = this.foxtrot;
        if (paint == null) {
            paint = new Paint();
            this.foxtrot = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(ao.coral(i4)));
        jade();
    }

    @Override // d0.InterfaceC1566d
    public final void india() {
        if (Build.VERSION.SDK_INT >= 24) {
            AbstractC1573k.alpha(this.delta);
        } else {
            AbstractC1572j.alpha(this.delta);
        }
    }

    public final void indigo() {
        boolean z2;
        boolean z10 = this.victor;
        boolean z11 = false;
        if (z10 && !this.hotel) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z10 && this.hotel) {
            z11 = true;
        }
        if (z2 != this.whiskey) {
            this.whiskey = z2;
            this.delta.setClipToBounds(z2);
        }
        if (z11 != this.xray) {
            this.xray = z11;
            this.delta.setClipToOutline(z11);
        }
    }

    public final void ivory(int i4) {
        RenderNode renderNode = this.delta;
        if (i4 == 1) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint(this.foxtrot);
            renderNode.setHasOverlappingRendering(true);
        } else if (i4 == 2) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.foxtrot);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.foxtrot);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    public final void jade() {
        int i4 = this.juliet;
        if (i4 != 1 && this.kilo == 3) {
            ivory(i4);
        } else {
            ivory(1);
        }
    }

    @Override // d0.InterfaceC1566d
    public final int juliet() {
        return this.juliet;
    }

    @Override // d0.InterfaceC1566d
    public final AbstractC0367u kilo() {
        return null;
    }

    @Override // d0.InterfaceC1566d
    public final void lima(float f5) {
        this.oscar = f5;
        this.delta.setScaleY(f5);
    }

    @Override // d0.InterfaceC1566d
    public final void mike(int i4, int i5, long j5) {
        int i10 = (int) (j5 >> 32);
        int i11 = (int) (4294967295L & j5);
        this.delta.setLeftTopRightBottom(i4, i5, i4 + i10, i5 + i11);
        if (!Q0.m.alpha(this.echo, j5)) {
            if (this.mike) {
                this.delta.setPivotX(i10 / 2.0f);
                this.delta.setPivotY(i11 / 2.0f);
            }
            this.echo = j5;
        }
    }

    @Override // d0.InterfaceC1566d
    public final float november() {
        return 0.0f;
    }

    @Override // d0.InterfaceC1566d
    public final boolean oscar() {
        return this.delta.isValid();
    }

    @Override // d0.InterfaceC1566d
    public final void papa(InterfaceC0364r interfaceC0364r) {
        DisplayListCanvas alpha = AbstractC0349c.alpha(interfaceC0364r);
        Intrinsics.charlie(alpha, "null cannot be cast to non-null type android.view.DisplayListCanvas");
        alpha.drawRenderNode(this.delta);
    }

    @Override // d0.InterfaceC1566d
    public final float quebec() {
        return this.tango;
    }

    @Override // d0.InterfaceC1566d
    public final void romeo(long j5) {
        if ((9223372034707292159L & j5) == 9205357640488583168L) {
            this.mike = true;
            this.delta.setPivotX(((int) (this.echo >> 32)) / 2.0f);
            this.delta.setPivotY(((int) (4294967295L & this.echo)) / 2.0f);
        } else {
            this.mike = false;
            this.delta.setPivotX(Float.intBitsToFloat((int) (j5 >> 32)));
            this.delta.setPivotY(Float.intBitsToFloat((int) (j5 & 4294967295L)));
        }
    }

    @Override // d0.InterfaceC1566d
    public final long sierra() {
        return this.romeo;
    }

    @Override // d0.InterfaceC1566d
    public final void tango() {
        this.delta.setRotationX(0.0f);
    }

    @Override // d0.InterfaceC1566d
    public final void uniform(float f5) {
        this.lima = f5;
        this.delta.setAlpha(f5);
    }

    @Override // d0.InterfaceC1566d
    public final float victor() {
        return this.papa;
    }

    @Override // d0.InterfaceC1566d
    public final void whiskey() {
        this.delta.setRotationY(0.0f);
    }

    @Override // d0.InterfaceC1566d
    public final long xray() {
        return this.sierra;
    }

    @Override // d0.InterfaceC1566d
    public final void yankee(long j5) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.romeo = j5;
            AbstractC1574l.charlie(this.delta, ao.beige(j5));
        }
    }

    @Override // d0.InterfaceC1566d
    public final void zulu() {
        jade();
    }
}
