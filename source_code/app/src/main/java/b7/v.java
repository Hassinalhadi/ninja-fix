package b7;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Pair;
import s6.AbstractC2815x7;
import t6.N2;

/* loaded from: classes2.dex */
public final class v extends t {
    public float foxtrot;
    public float golf;
    public float hotel;
    public float india;
    public float juliet;
    public float kilo;
    public int lima;
    public boolean mike;
    public float november;
    public Pair oscar;

    @Override // b7.t
    public final void alpha(Canvas canvas, Rect rect, float f5, boolean z2, boolean z10) {
        if (this.foxtrot != rect.width()) {
            this.foxtrot = rect.width();
            golf();
        }
        float echo = echo();
        canvas.translate((rect.width() / 2.0f) + rect.left, Math.max(0.0f, (rect.height() - echo) / 2.0f) + (rect.height() / 2.0f) + rect.top);
        z zVar = (z) this.alpha;
        if (zVar.quebec) {
            canvas.scale(-1.0f, 1.0f);
        }
        float f10 = this.foxtrot / 2.0f;
        float f11 = echo / 2.0f;
        canvas.clipRect(-f10, -f11, f10, f11);
        this.golf = zVar.alpha * f5;
        this.hotel = Math.min(r0 / 2, zVar.alpha()) * f5;
        this.juliet = zVar.lima * f5;
        this.india = Math.min(zVar.alpha / 2.0f, zVar.echo()) * f5;
        if (z2 || z10) {
            if ((z2 && zVar.golf == 2) || (z10 && zVar.hotel == 1)) {
                canvas.scale(1.0f, -1.0f);
            }
            if (z2 || (z10 && zVar.hotel != 3)) {
                canvas.translate(0.0f, ((1.0f - f5) * zVar.alpha) / 2.0f);
            }
        }
        if (z10 && zVar.hotel == 3) {
            this.november = f5;
        } else {
            this.november = 1.0f;
        }
    }

    @Override // b7.t
    public final void bravo(Canvas canvas, Paint paint, int i4, int i5) {
        float f5;
        int bravo = AbstractC2815x7.bravo(i4, i5);
        this.mike = false;
        z zVar = (z) this.alpha;
        if (zVar.romeo > 0 && bravo != 0) {
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(bravo);
            Integer num = zVar.sierra;
            if (num != null) {
                f5 = (zVar.romeo / 2.0f) + num.floatValue();
            } else {
                f5 = this.golf / 2.0f;
            }
            s sVar = new s(new float[]{(this.foxtrot / 2.0f) - f5, 0.0f}, new float[]{1.0f, 0.0f});
            int i10 = zVar.romeo;
            juliet(canvas, paint, sVar, i10, i10, (this.hotel * i10) / this.golf, null, 0.0f, 0.0f, 0.0f, false);
        }
    }

    @Override // b7.t
    public final void charlie(Canvas canvas, Paint paint, r rVar, int i4) {
        int bravo = AbstractC2815x7.bravo(rVar.charlie, i4);
        this.mike = rVar.hotel;
        float f5 = rVar.alpha;
        float f10 = rVar.bravo;
        int i5 = rVar.delta;
        india(canvas, paint, f5, f10, bravo, i5, i5, rVar.echo, rVar.foxtrot, true);
    }

    @Override // b7.t
    public final void delta(Canvas canvas, Paint paint, float f5, float f10, int i4, int i5, int i10) {
        int bravo = AbstractC2815x7.bravo(i4, i5);
        this.mike = false;
        india(canvas, paint, f5, f10, bravo, i10, i10, 0.0f, 0.0f, false);
    }

    @Override // b7.t
    public final int echo() {
        AbstractC0723e abstractC0723e = this.alpha;
        return (((z) abstractC0723e).lima * 2) + ((z) abstractC0723e).alpha;
    }

    @Override // b7.t
    public final int foxtrot() {
        return -1;
    }

    @Override // b7.t
    public final void golf() {
        int i4;
        Path path = this.bravo;
        path.rewind();
        z zVar = (z) this.alpha;
        if (zVar.bravo(this.mike)) {
            if (this.mike) {
                i4 = zVar.juliet;
            } else {
                i4 = zVar.kilo;
            }
            float f5 = this.foxtrot;
            int i5 = (int) (f5 / i4);
            this.kilo = f5 / i5;
            for (int i10 = 0; i10 <= i5; i10++) {
                int i11 = i10 * 2;
                float f10 = i11 + 1;
                path.cubicTo(i11 + 0.48f, 0.0f, f10 - 0.48f, 1.0f, f10, 1.0f);
                float f11 = f10 + 0.48f;
                float f12 = i11 + 2;
                path.cubicTo(f11, 1.0f, f12 - 0.48f, 0.0f, f12, 0.0f);
            }
            Matrix matrix = this.echo;
            matrix.reset();
            matrix.setScale(this.kilo / 2.0f, -2.0f);
            matrix.postTranslate(0.0f, 1.0f);
            path.transform(matrix);
        } else {
            path.lineTo(this.foxtrot, 0.0f);
        }
        this.delta.setPath(path, false);
    }

    public final void india(Canvas canvas, Paint paint, float f5, float f10, int i4, int i5, int i10, float f11, float f12, boolean z2) {
        float f13;
        float f14;
        boolean z10;
        Paint.Cap cap;
        z zVar;
        int i11;
        float f15;
        Canvas canvas2;
        Pair pair;
        float alpha = O6.c.alpha(f5, 0.0f, 1.0f);
        float alpha2 = O6.c.alpha(f10, 0.0f, 1.0f);
        float bravo = N2.bravo(1.0f - this.november, 1.0f, alpha);
        float bravo2 = N2.bravo(1.0f - this.november, 1.0f, alpha2);
        int alpha3 = (int) ((O6.c.alpha(bravo, 0.0f, 0.01f) * i5) / 0.01f);
        int alpha4 = (int) (((1.0f - O6.c.alpha(bravo2, 0.99f, 1.0f)) * i10) / 0.01f);
        float f16 = this.foxtrot;
        int i12 = (int) ((bravo * f16) + alpha3);
        int i13 = (int) ((bravo2 * f16) - alpha4);
        float f17 = this.hotel;
        float f18 = this.india;
        if (f17 != f18) {
            float max = Math.max(f17, f18);
            float f19 = this.foxtrot;
            float f20 = max / f19;
            f13 = N2.bravo(this.hotel, this.india, O6.c.alpha(i12 / f19, 0.0f, f20) / f20);
            float f21 = this.hotel;
            float f22 = this.india;
            float f23 = this.foxtrot;
            f14 = N2.bravo(f21, f22, O6.c.alpha((f23 - i13) / f23, 0.0f, f20) / f20);
        } else {
            f13 = f17;
            f14 = f13;
        }
        float f24 = (-this.foxtrot) / 2.0f;
        z zVar2 = (z) this.alpha;
        if (zVar2.bravo(this.mike) && z2 && f11 > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i12 <= i13) {
            float f25 = i12 + f13;
            float f26 = i13 - f14;
            float f27 = f13 * 2.0f;
            float f28 = f14 * 2.0f;
            paint.setColor(i4);
            paint.setAntiAlias(true);
            paint.setStrokeWidth(this.golf);
            Pair pair2 = this.oscar;
            ((s) pair2.first).bravo();
            ((s) pair2.second).bravo();
            ((s) pair2.first).echo(f25 + f24);
            ((s) pair2.second).echo(f24 + f26);
            if (i12 == 0 && f26 + f14 < f25 + f13) {
                s sVar = (s) pair2.first;
                float f29 = this.golf;
                juliet(canvas, paint, sVar, f27, f29, f13, (s) pair2.second, f28, f29, f14, true);
                return;
            }
            if (f25 - f13 > f26 - f14) {
                s sVar2 = (s) pair2.second;
                float f30 = this.golf;
                juliet(canvas, paint, sVar2, f28, f30, f14, (s) pair2.first, f27, f30, f13, false);
                return;
            }
            float f31 = f14;
            paint.setStyle(Paint.Style.STROKE);
            if (zVar2.charlie()) {
                cap = Paint.Cap.ROUND;
            } else {
                cap = Paint.Cap.BUTT;
            }
            paint.setStrokeCap(cap);
            if (!z10) {
                float[] fArr = ((s) pair2.first).alpha;
                float f32 = fArr[0];
                float f33 = fArr[1];
                float[] fArr2 = ((s) pair2.second).alpha;
                canvas.drawLine(f32, f33, fArr2[0], fArr2[1], paint);
                canvas2 = canvas;
                zVar = zVar2;
                f15 = f27;
            } else {
                PathMeasure pathMeasure = this.delta;
                Path path = this.charlie;
                float f34 = this.foxtrot;
                float f35 = f25 / f34;
                float f36 = f26 / f34;
                if (this.mike) {
                    zVar = zVar2;
                    i11 = zVar.juliet;
                } else {
                    zVar = zVar2;
                    i11 = zVar.kilo;
                }
                if (i11 != this.lima) {
                    this.lima = i11;
                    golf();
                }
                path.rewind();
                float f37 = (-this.foxtrot) / 2.0f;
                boolean bravo3 = zVar.bravo(this.mike);
                if (bravo3) {
                    float f38 = this.foxtrot;
                    float f39 = this.kilo;
                    float f40 = f38 / f39;
                    float f41 = f12 / f40;
                    float f42 = f40 / (f40 + 1.0f);
                    f35 = (f35 + f41) * f42;
                    f36 = (f36 + f41) * f42;
                    f37 -= f12 * f39;
                }
                float length = pathMeasure.getLength() * f35;
                float length2 = pathMeasure.getLength() * f36;
                pathMeasure.getSegment(length, length2, path, true);
                s sVar3 = (s) pair2.first;
                sVar3.bravo();
                f15 = f27;
                pathMeasure.getPosTan(length, sVar3.alpha, sVar3.bravo);
                s sVar4 = (s) pair2.second;
                sVar4.bravo();
                pathMeasure.getPosTan(length2, sVar4.alpha, sVar4.bravo);
                Matrix matrix = this.echo;
                matrix.reset();
                matrix.setTranslate(f37, 0.0f);
                sVar3.echo(f37);
                sVar4.echo(f37);
                if (bravo3) {
                    float f43 = this.juliet * f11;
                    matrix.postScale(1.0f, f43);
                    sVar3.delta(f43);
                    sVar4.delta(f43);
                }
                path.transform(matrix);
                canvas2 = canvas;
                canvas2.drawPath(path, paint);
            }
            if (!zVar.charlie()) {
                if (f25 > 0.0f && f13 > 0.0f) {
                    pair = pair2;
                    juliet(canvas2, paint, (s) pair2.first, f15, this.golf, f13, null, 0.0f, 0.0f, 0.0f, false);
                } else {
                    pair = pair2;
                }
                if (f26 < this.foxtrot && f31 > 0.0f) {
                    juliet(canvas, paint, (s) pair.second, f28, this.golf, f31, null, 0.0f, 0.0f, 0.0f, false);
                }
            }
        }
    }

    public final void juliet(Canvas canvas, Paint paint, s sVar, float f5, float f10, float f11, s sVar2, float f12, float f13, float f14, boolean z2) {
        float f15;
        float f16;
        float min = Math.min(f10, this.golf);
        float f17 = (-f5) / 2.0f;
        float f18 = (-min) / 2.0f;
        float f19 = f5 / 2.0f;
        float f20 = min / 2.0f;
        RectF rectF = new RectF(f17, f18, f19, f20);
        paint.setStyle(Paint.Style.FILL);
        canvas.save();
        if (sVar2 != null) {
            float min2 = Math.min(f13, this.golf);
            float min3 = Math.min(f12 / 2.0f, (f14 * min2) / this.golf);
            RectF rectF2 = new RectF();
            float[] fArr = sVar2.alpha;
            if (z2) {
                float f21 = (fArr[0] - min3) - (sVar.alpha[0] - f11);
                if (f21 > 0.0f) {
                    sVar2.echo((-f21) / 2.0f);
                    f16 = f12 + f21;
                } else {
                    f16 = f12;
                }
                rectF2.set(0.0f, f18, f19, f20);
            } else {
                float f22 = (fArr[0] + min3) - (sVar.alpha[0] + f11);
                if (f22 < 0.0f) {
                    sVar2.echo((-f22) / 2.0f);
                    f15 = f12 - f22;
                } else {
                    f15 = f12;
                }
                rectF2.set(f17, f18, 0.0f, f20);
                f16 = f15;
            }
            RectF rectF3 = new RectF((-f16) / 2.0f, (-min2) / 2.0f, f16 / 2.0f, min2 / 2.0f);
            canvas.translate(fArr[0], fArr[1]);
            float[] fArr2 = sVar2.bravo;
            canvas.rotate(t.hotel(fArr2));
            Path path = new Path();
            path.addRoundRect(rectF3, min3, min3, Path.Direction.CCW);
            canvas.clipPath(path);
            canvas.rotate(-t.hotel(fArr2));
            canvas.translate(-fArr[0], -fArr[1]);
            float[] fArr3 = sVar.alpha;
            canvas.translate(fArr3[0], fArr3[1]);
            canvas.rotate(t.hotel(sVar.bravo));
            canvas.drawRect(rectF2, paint);
            canvas.drawRoundRect(rectF, f11, f11, paint);
        } else {
            float[] fArr4 = sVar.alpha;
            canvas.translate(fArr4[0], fArr4[1]);
            canvas.rotate(t.hotel(sVar.bravo));
            canvas.drawRoundRect(rectF, f11, f11, paint);
        }
        canvas.restore();
    }
}
