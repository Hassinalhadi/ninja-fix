package a0;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: a0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0348b implements InterfaceC0364r {
    public Canvas alpha = AbstractC0349c.alpha;
    public Rect bravo;
    public Rect charlie;

    @Override // a0.InterfaceC0364r
    public final void alpha(long j5, long j6, ak akVar) {
        this.alpha.drawLine(Float.intBitsToFloat((int) (j5 >> 32)), Float.intBitsToFloat((int) (j5 & 4294967295L)), Float.intBitsToFloat((int) (j6 >> 32)), Float.intBitsToFloat((int) (j6 & 4294967295L)), (Paint) ((Be.e) akVar).bravo);
    }

    @Override // a0.InterfaceC0364r
    public final void bravo(float f5, float f10) {
        this.alpha.scale(f5, f10);
    }

    @Override // a0.InterfaceC0364r
    public final void charlie(float f5, float f10, float f11, float f12, float f13, float f14, ak akVar) {
        this.alpha.drawRoundRect(f5, f10, f11, f12, f13, f14, (Paint) ((Be.e) akVar).bravo);
    }

    @Override // a0.InterfaceC0364r
    public final void delta(float f5) {
        this.alpha.rotate(f5);
    }

    @Override // a0.InterfaceC0364r
    public final void echo(C0354h c0354h, ak akVar) {
        Canvas canvas = this.alpha;
        if (c0354h instanceof C0354h) {
            canvas.drawPath(c0354h.alpha, (Paint) ((Be.e) akVar).bravo);
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // a0.InterfaceC0364r
    public final void foxtrot(C0352f c0352f, long j5, long j6, long j7, ak akVar) {
        if (this.bravo == null) {
            this.bravo = new Rect();
            this.charlie = new Rect();
        }
        Canvas canvas = this.alpha;
        Bitmap juliet = ao.juliet(c0352f);
        Rect rect = this.bravo;
        Intrinsics.checkNotNull(rect);
        int i4 = (int) (j5 >> 32);
        rect.left = i4;
        int i5 = (int) (j5 & 4294967295L);
        rect.top = i5;
        rect.right = i4 + ((int) (j6 >> 32));
        rect.bottom = i5 + ((int) (j6 & 4294967295L));
        Rect rect2 = this.charlie;
        Intrinsics.checkNotNull(rect2);
        int i10 = (int) 0;
        rect2.left = i10;
        int i11 = (int) 0;
        rect2.top = i11;
        rect2.right = i10 + ((int) (j7 >> 32));
        rect2.bottom = i11 + ((int) (4294967295L & j7));
        canvas.drawBitmap(juliet, rect, rect2, (Paint) ((Be.e) akVar).bravo);
    }

    @Override // a0.InterfaceC0364r
    public final void golf() {
        this.alpha.save();
    }

    @Override // a0.InterfaceC0364r
    public final void hotel(float f5, float f10, float f11, float f12, float f13, float f14, ak akVar) {
        this.alpha.drawArc(f5, f10, f11, f12, f13, f14, false, (Paint) ((Be.e) akVar).bravo);
    }

    @Override // a0.InterfaceC0364r
    public final void india() {
        ao.november(this.alpha, false);
    }

    @Override // a0.InterfaceC0364r
    public final void juliet(float[] fArr) {
        if (!ao.papa(fArr)) {
            Matrix matrix = new Matrix();
            ao.uniform(matrix, fArr);
            this.alpha.concat(matrix);
        }
    }

    @Override // a0.InterfaceC0364r
    public final void kilo(C0354h c0354h) {
        Canvas canvas = this.alpha;
        if (c0354h instanceof C0354h) {
            canvas.clipPath(c0354h.alpha, Region.Op.INTERSECT);
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // a0.InterfaceC0364r
    public final void lima(float f5, float f10, float f11, float f12, int i4) {
        Region.Op op;
        Canvas canvas = this.alpha;
        if (i4 == 0) {
            op = Region.Op.DIFFERENCE;
        } else {
            op = Region.Op.INTERSECT;
        }
        canvas.clipRect(f5, f10, f11, f12, op);
    }

    @Override // a0.InterfaceC0364r
    public final void mike(float f5, float f10) {
        this.alpha.translate(f5, f10);
    }

    @Override // a0.InterfaceC0364r
    public final void november() {
        this.alpha.restore();
    }

    @Override // a0.InterfaceC0364r
    public final void oscar(C0352f c0352f, ak akVar) {
        this.alpha.drawBitmap(ao.juliet(c0352f), Float.intBitsToFloat((int) 0), Float.intBitsToFloat((int) 0), (Paint) ((Be.e) akVar).bravo);
    }

    @Override // a0.InterfaceC0364r
    public final void papa(Z.c cVar) {
        lima(cVar.alpha, cVar.bravo, cVar.charlie, cVar.delta, 1);
    }

    @Override // a0.InterfaceC0364r
    public final void quebec(Z.c cVar, ak akVar) {
        Canvas canvas = this.alpha;
        Paint paint = (Paint) ((Be.e) akVar).bravo;
        canvas.saveLayer(cVar.alpha, cVar.bravo, cVar.charlie, cVar.delta, paint, 31);
    }

    @Override // a0.InterfaceC0364r
    public final void romeo() {
        ao.november(this.alpha, true);
    }

    @Override // a0.InterfaceC0364r
    public final void sierra(float f5, float f10, float f11, float f12, ak akVar) {
        this.alpha.drawRect(f5, f10, f11, f12, (Paint) ((Be.e) akVar).bravo);
    }

    @Override // a0.InterfaceC0364r
    public final void tango(float f5, long j5, ak akVar) {
        this.alpha.drawCircle(Float.intBitsToFloat((int) (j5 >> 32)), Float.intBitsToFloat((int) (j5 & 4294967295L)), f5, (Paint) ((Be.e) akVar).bravo);
    }
}
