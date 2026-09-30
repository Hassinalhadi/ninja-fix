package d0;

import Q0.n;
import a0.AbstractC0349c;
import a0.AbstractC0367u;
import a0.C0348b;
import a0.C0365s;
import a0.C0366t;
import a0.InterfaceC0364r;
import a0.ao;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import bx.C0769g;
import e0.AbstractC1623a;

/* renamed from: d0.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1571i implements InterfaceC1566d {
    public static final C1570h yankee = new Canvas();
    public final AbstractC1623a bravo;
    public final C0365s charlie;
    public final C1575m delta;
    public final Resources echo;
    public final Rect foxtrot;
    public Paint golf;
    public int hotel;
    public int india;
    public long juliet;
    public boolean kilo;
    public boolean lima;
    public boolean mike;
    public int november;
    public int oscar;
    public float papa;
    public boolean quebec;
    public float romeo;
    public float sierra;
    public float tango;
    public float uniform;
    public long victor;
    public long whiskey;
    public float xray;

    public C1571i(AbstractC1623a abstractC1623a) {
        C0365s c0365s = new C0365s();
        c0.b bVar = new c0.b();
        this.bravo = abstractC1623a;
        this.charlie = c0365s;
        C1575m c1575m = new C1575m(abstractC1623a, c0365s, bVar);
        this.delta = c1575m;
        this.echo = abstractC1623a.getResources();
        this.foxtrot = new Rect();
        abstractC1623a.addView(c1575m);
        c1575m.setClipBounds(null);
        this.juliet = 0L;
        View.generateViewId();
        this.november = 3;
        this.oscar = 0;
        this.papa = 1.0f;
        this.romeo = 1.0f;
        this.sierra = 1.0f;
        long j5 = C0366t.bravo;
        this.victor = j5;
        this.whiskey = j5;
    }

    @Override // d0.InterfaceC1566d
    public final float alpha() {
        return this.papa;
    }

    @Override // d0.InterfaceC1566d
    public final void amber(float f5) {
        this.romeo = f5;
        this.delta.setScaleX(f5);
    }

    @Override // d0.InterfaceC1566d
    public final float azure() {
        return this.delta.getCameraDistance() / this.echo.getDisplayMetrics().densityDpi;
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
        boolean z10;
        boolean z11 = false;
        if (z2 && !this.lima) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.mike = z10;
        this.kilo = true;
        if (z2 && this.lima) {
            z11 = true;
        }
        this.delta.setClipToOutline(z11);
    }

    @Override // d0.InterfaceC1566d
    public final float bravo() {
        return this.romeo;
    }

    @Override // d0.InterfaceC1566d
    public final float bronze() {
        return 0.0f;
    }

    @Override // d0.InterfaceC1566d
    public final void charlie(float f5) {
        this.uniform = f5;
        this.delta.setElevation(f5);
    }

    @Override // d0.InterfaceC1566d
    public final void coral(Q0.d dVar, n nVar, C1564b c1564b, C0769g c0769g) {
        C1575m c1575m = this.delta;
        ViewParent parent = c1575m.getParent();
        AbstractC1623a abstractC1623a = this.bravo;
        if (parent == null) {
            abstractC1623a.addView(c1575m);
        }
        c1575m.yellow = dVar;
        c1575m.f12015a = nVar;
        c1575m.f12016b = c0769g;
        c1575m.f12017c = c1564b;
        if (c1575m.isAttachedToWindow()) {
            c1575m.setVisibility(4);
            c1575m.setVisibility(0);
            try {
                C0365s c0365s = this.charlie;
                C1570h c1570h = yankee;
                C0348b c0348b = c0365s.alpha;
                Canvas canvas = c0348b.alpha;
                c0348b.alpha = c1570h;
                abstractC1623a.alpha(c0348b, c1575m, c1575m.getDrawingTime());
                c0365s.alpha.alpha = canvas;
            } catch (ClassCastException unused) {
            }
        }
    }

    @Override // d0.InterfaceC1566d
    public final void crimson(int i4) {
        this.oscar = i4;
        ivory();
    }

    @Override // d0.InterfaceC1566d
    public final void cyan(long j5) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.whiskey = j5;
            this.delta.setOutlineSpotShadowColor(ao.beige(j5));
        }
    }

    @Override // d0.InterfaceC1566d
    public final void delta() {
        if (Build.VERSION.SDK_INT >= 31) {
            this.delta.setRenderEffect(null);
        }
    }

    @Override // d0.InterfaceC1566d
    public final void echo(float f5) {
        this.xray = f5;
        this.delta.setRotation(f5);
    }

    @Override // d0.InterfaceC1566d
    public final Matrix emerald() {
        return this.delta.getMatrix();
    }

    @Override // d0.InterfaceC1566d
    public final void foxtrot(float f5) {
        this.tango = f5;
        this.delta.setTranslationY(f5);
    }

    @Override // d0.InterfaceC1566d
    public final void fuchsia(float f5) {
        this.delta.setCameraDistance(f5 * this.echo.getDisplayMetrics().densityDpi);
    }

    @Override // d0.InterfaceC1566d
    public final float gold() {
        return this.uniform;
    }

    @Override // d0.InterfaceC1566d
    public final void golf(Outline outline, long j5) {
        boolean z2;
        C1575m c1575m = this.delta;
        c1575m.teal = outline;
        c1575m.invalidateOutline();
        boolean z10 = true;
        if (!this.mike && !c1575m.getClipToOutline()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2 && outline != null) {
            c1575m.setClipToOutline(true);
            if (this.mike) {
                this.mike = false;
                this.kilo = true;
            }
        }
        if (outline == null) {
            z10 = false;
        }
        this.lima = z10;
    }

    @Override // d0.InterfaceC1566d
    public final float gray() {
        return this.sierra;
    }

    @Override // d0.InterfaceC1566d
    public final int green() {
        return this.november;
    }

    @Override // d0.InterfaceC1566d
    public final void hotel(int i4) {
        this.november = i4;
        Paint paint = this.golf;
        if (paint == null) {
            paint = new Paint();
            this.golf = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(ao.coral(i4)));
        ivory();
    }

    @Override // d0.InterfaceC1566d
    public final void india() {
        this.bravo.removeViewInLayout(this.delta);
    }

    public final void indigo(int i4) {
        C1575m c1575m = this.delta;
        boolean z2 = true;
        if (i4 == 1) {
            c1575m.setLayerType(2, this.golf);
        } else if (i4 == 2) {
            c1575m.setLayerType(0, this.golf);
            z2 = false;
        } else {
            c1575m.setLayerType(0, this.golf);
        }
        c1575m.setCanUseCompositingLayer$ui_graphics_release(z2);
    }

    public final void ivory() {
        int i4 = this.oscar;
        if (i4 != 1 && this.november == 3) {
            indigo(i4);
        } else {
            indigo(1);
        }
    }

    @Override // d0.InterfaceC1566d
    public final int juliet() {
        return this.oscar;
    }

    @Override // d0.InterfaceC1566d
    public final AbstractC0367u kilo() {
        return null;
    }

    @Override // d0.InterfaceC1566d
    public final void lima(float f5) {
        this.sierra = f5;
        this.delta.setScaleY(f5);
    }

    @Override // d0.InterfaceC1566d
    public final void mike(int i4, int i5, long j5) {
        boolean alpha = Q0.m.alpha(this.juliet, j5);
        C1575m c1575m = this.delta;
        if (!alpha) {
            if (this.mike || c1575m.getClipToOutline()) {
                this.kilo = true;
            }
            int i10 = (int) (j5 >> 32);
            int i11 = (int) (4294967295L & j5);
            c1575m.layout(i4, i5, i4 + i10, i5 + i11);
            this.juliet = j5;
            if (this.quebec) {
                c1575m.setPivotX(i10 / 2.0f);
                c1575m.setPivotY(i11 / 2.0f);
            }
        } else {
            int i12 = this.hotel;
            if (i12 != i4) {
                c1575m.offsetLeftAndRight(i4 - i12);
            }
            int i13 = this.india;
            if (i13 != i5) {
                c1575m.offsetTopAndBottom(i5 - i13);
            }
        }
        this.hotel = i4;
        this.india = i5;
    }

    @Override // d0.InterfaceC1566d
    public final float november() {
        return 0.0f;
    }

    @Override // d0.InterfaceC1566d
    public final /* synthetic */ boolean oscar() {
        return true;
    }

    @Override // d0.InterfaceC1566d
    public final void papa(InterfaceC0364r interfaceC0364r) {
        Rect rect;
        boolean z2 = this.kilo;
        C1575m c1575m = this.delta;
        if (z2) {
            if ((this.mike || c1575m.getClipToOutline()) && !this.lima) {
                rect = this.foxtrot;
                rect.left = 0;
                rect.top = 0;
                rect.right = c1575m.getWidth();
                rect.bottom = c1575m.getHeight();
            } else {
                rect = null;
            }
            c1575m.setClipBounds(rect);
        }
        if (AbstractC0349c.alpha(interfaceC0364r).isHardwareAccelerated()) {
            this.bravo.alpha(interfaceC0364r, c1575m, c1575m.getDrawingTime());
        }
    }

    @Override // d0.InterfaceC1566d
    public final float quebec() {
        return this.xray;
    }

    @Override // d0.InterfaceC1566d
    public final void romeo(long j5) {
        long j6 = 9223372034707292159L & j5;
        C1575m c1575m = this.delta;
        if (j6 == 9205357640488583168L) {
            if (Build.VERSION.SDK_INT >= 28) {
                c1575m.resetPivot();
                return;
            }
            this.quebec = true;
            c1575m.setPivotX(((int) (this.juliet >> 32)) / 2.0f);
            c1575m.setPivotY(((int) (4294967295L & this.juliet)) / 2.0f);
            return;
        }
        this.quebec = false;
        c1575m.setPivotX(Float.intBitsToFloat((int) (j5 >> 32)));
        c1575m.setPivotY(Float.intBitsToFloat((int) (j5 & 4294967295L)));
    }

    @Override // d0.InterfaceC1566d
    public final long sierra() {
        return this.victor;
    }

    @Override // d0.InterfaceC1566d
    public final void tango() {
        this.delta.setRotationX(0.0f);
    }

    @Override // d0.InterfaceC1566d
    public final void uniform(float f5) {
        this.papa = f5;
        this.delta.setAlpha(f5);
    }

    @Override // d0.InterfaceC1566d
    public final float victor() {
        return this.tango;
    }

    @Override // d0.InterfaceC1566d
    public final void whiskey() {
        this.delta.setRotationY(0.0f);
    }

    @Override // d0.InterfaceC1566d
    public final long xray() {
        return this.whiskey;
    }

    @Override // d0.InterfaceC1566d
    public final void yankee(long j5) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.victor = j5;
            this.delta.setOutlineAmbientShadowColor(ao.beige(j5));
        }
    }

    @Override // d0.InterfaceC1566d
    public final void zulu() {
        Paint paint = this.golf;
        if (paint == null) {
            paint = new Paint();
            this.golf = paint;
        }
        paint.setColorFilter(null);
        ivory();
    }
}
