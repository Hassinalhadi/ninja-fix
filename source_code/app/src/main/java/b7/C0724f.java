package b7;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.Pair;
import java.util.ArrayList;
import s6.AbstractC2815x7;
import t6.N2;

/* renamed from: b7.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0724f extends t {
    public float foxtrot;
    public float golf;
    public float hotel;
    public float india;
    public float juliet;
    public float kilo;
    public int lima;
    public float mike;
    public boolean november;
    public float oscar;
    public final RectF papa;
    public final Pair quebec;

    public C0724f(C0730l c0730l) {
        super(c0730l);
        this.papa = new RectF();
        this.quebec = new Pair(new s(), new s());
    }

    @Override // b7.t
    public final void alpha(Canvas canvas, Rect rect, float f5, boolean z2, boolean z10) {
        float width = rect.width() / kilo();
        float height = rect.height() / kilo();
        C0730l c0730l = (C0730l) this.alpha;
        float f10 = (c0730l.papa / 2.0f) + c0730l.quebec;
        canvas.translate((f10 * width) + rect.left, (f10 * height) + rect.top);
        canvas.rotate(-90.0f);
        canvas.scale(width, height);
        if (c0730l.romeo != 0) {
            canvas.scale(1.0f, -1.0f);
            if (Build.VERSION.SDK_INT == 29) {
                canvas.rotate(0.1f);
            }
        }
        float f11 = -f10;
        canvas.clipRect(f11, f11, f10, f10);
        this.foxtrot = c0730l.alpha * f5;
        this.golf = Math.min(r9 / 2, c0730l.alpha()) * f5;
        this.hotel = c0730l.lima * f5;
        int i4 = c0730l.papa;
        int i5 = c0730l.alpha;
        float f12 = (i4 - i5) / 2.0f;
        this.india = f12;
        if (z2 || z10) {
            float f13 = ((1.0f - f5) * i5) / 2.0f;
            if ((z2 && c0730l.golf == 2) || (z10 && c0730l.hotel == 1)) {
                this.india = f12 + f13;
            } else if ((z2 && c0730l.golf == 1) || (z10 && c0730l.hotel == 2)) {
                this.india = f12 - f13;
            }
        }
        if (z10 && c0730l.hotel == 3) {
            this.oscar = f5;
        } else {
            this.oscar = 1.0f;
        }
    }

    @Override // b7.t
    public final void bravo(Canvas canvas, Paint paint, int i4, int i5) {
    }

    @Override // b7.t
    public final void charlie(Canvas canvas, Paint paint, r rVar, int i4) {
        int bravo = AbstractC2815x7.bravo(rVar.charlie, i4);
        canvas.save();
        canvas.rotate(rVar.golf);
        this.november = rVar.hotel;
        float f5 = rVar.alpha;
        float f10 = rVar.bravo;
        int i5 = rVar.delta;
        india(canvas, paint, f5, f10, bravo, i5, i5, rVar.echo, rVar.foxtrot, true);
        canvas.restore();
    }

    @Override // b7.t
    public final void delta(Canvas canvas, Paint paint, float f5, float f10, int i4, int i5, int i10) {
        int bravo = AbstractC2815x7.bravo(i4, i5);
        this.november = false;
        india(canvas, paint, f5, f10, bravo, i10, i10, 0.0f, 0.0f, false);
    }

    @Override // b7.t
    public final int echo() {
        return kilo();
    }

    @Override // b7.t
    public final int foxtrot() {
        return kilo();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // b7.t
    public final void golf() {
        int i4;
        int i5;
        Path path = this.bravo;
        path.rewind();
        path.moveTo(1.0f, 0.0f);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            i4 = 2;
            if (i11 >= 2) {
                break;
            }
            path.cubicTo(1.0f, 0.5522848f, 0.5522848f, 1.0f, 0.0f, 1.0f);
            path.cubicTo(-0.5522848f, 1.0f, -1.0f, 0.5522848f, -1.0f, 0.0f);
            path.cubicTo(-1.0f, -0.5522848f, -0.5522848f, -1.0f, 0.0f, -1.0f);
            path.cubicTo(0.5522848f, -1.0f, 1.0f, -0.5522848f, 1.0f, 0.0f);
            i11++;
        }
        Matrix matrix = this.echo;
        matrix.reset();
        float f5 = this.india;
        matrix.setScale(f5, f5);
        path.transform(matrix);
        C0730l c0730l = (C0730l) this.alpha;
        boolean bravo = c0730l.bravo(this.november);
        PathMeasure pathMeasure = this.delta;
        if (bravo) {
            pathMeasure.setPath(path, false);
            float f10 = this.kilo;
            path.rewind();
            float length = pathMeasure.getLength();
            if (this.november) {
                i5 = c0730l.juliet;
            } else {
                i5 = c0730l.kilo;
            }
            float f11 = 2.0f;
            int max = Math.max(3, (int) ((length / i5) / 2.0f)) * 2;
            this.juliet = length / max;
            ArrayList arrayList = new ArrayList();
            for (int i12 = 0; i12 < max; i12++) {
                s sVar = new s();
                float f12 = i12;
                pathMeasure.getPosTan(this.juliet * f12, sVar.alpha, sVar.bravo);
                s sVar2 = new s();
                float f13 = this.juliet;
                pathMeasure.getPosTan((f13 / 2.0f) + (f12 * f13), sVar2.alpha, sVar2.bravo);
                arrayList.add(sVar);
                sVar2.alpha(f10 * 2.0f);
                arrayList.add(sVar2);
            }
            arrayList.add((s) arrayList.get(0));
            s sVar3 = (s) arrayList.get(0);
            float[] fArr = sVar3.alpha;
            char c3 = 1;
            path.moveTo(fArr[0], fArr[1]);
            int i13 = 1;
            while (i13 < arrayList.size()) {
                s sVar4 = (s) arrayList.get(i13);
                float f14 = (this.juliet / f11) * 0.48f;
                float[] fArr2 = new float[i4];
                System.arraycopy(sVar3.alpha, i10, fArr2, i10, i4);
                System.arraycopy(sVar3.bravo, i10, new float[i4], i10, i4);
                new Matrix();
                float[] fArr3 = new float[i4];
                System.arraycopy(sVar4.alpha, i10, fArr3, i10, i4);
                System.arraycopy(sVar4.bravo, i10, new float[i4], i10, i4);
                new Matrix();
                char c4 = c3;
                float atan2 = (float) Math.atan2(r5[c3], r5[i10]);
                double d4 = fArr2[i10];
                double d9 = f14;
                int i14 = i10;
                PathMeasure pathMeasure2 = pathMeasure;
                double d10 = atan2;
                fArr2[i14] = (float) ((Math.cos(d10) * d9) + d4);
                fArr2[c4] = (float) ((Math.sin(d10) * d9) + fArr2[c4]);
                float f15 = -f14;
                double d11 = f15;
                double atan22 = (float) Math.atan2(r7[c4], r7[i14]);
                fArr3[i14] = (float) ((Math.cos(atan22) * d11) + fArr3[i14]);
                float sin = (float) ((Math.sin(atan22) * d11) + fArr3[c4]);
                fArr3[c4] = sin;
                float f16 = fArr2[i14];
                float f17 = fArr2[c4];
                float f18 = fArr3[i14];
                float[] fArr4 = sVar4.alpha;
                path.cubicTo(f16, f17, f18, sin, fArr4[i14], fArr4[c4]);
                i13++;
                sVar3 = sVar4;
                c3 = c4;
                i10 = i14;
                pathMeasure = pathMeasure2;
                i4 = 2;
                f11 = 2.0f;
            }
        }
        pathMeasure.setPath(path, i10);
    }

    public final void india(Canvas canvas, Paint paint, float f5, float f10, int i4, int i5, int i10, float f11, float f12, boolean z2) {
        float f13;
        boolean z10;
        Paint.Cap cap;
        int i11;
        float f14;
        Canvas canvas2;
        if (f10 >= f5) {
            f13 = f10 - f5;
        } else {
            f13 = (f10 + 1.0f) - f5;
        }
        float f15 = f5 % 1.0f;
        if (f15 < 0.0f) {
            f15 += 1.0f;
        }
        if (this.oscar < 1.0f) {
            float f16 = f15 + f13;
            if (f16 > 1.0f) {
                india(canvas, paint, f15, 1.0f, i4, i5, 0, f11, f12, z2);
                india(canvas, paint, 1.0f, f16, i4, 0, i10, f11, f12, z2);
                return;
            }
        }
        float degrees = (float) Math.toDegrees(this.golf / this.india);
        float f17 = f13 - 0.99f;
        if (f17 >= 0.0f) {
            float f18 = ((f17 * degrees) / 180.0f) / 0.01f;
            f13 += f18;
            if (!z2) {
                f15 -= f18 / 2.0f;
            }
        }
        float bravo = N2.bravo(1.0f - this.oscar, 1.0f, f15);
        float bravo2 = N2.bravo(0.0f, this.oscar, f13);
        float degrees2 = (float) Math.toDegrees(i5 / this.india);
        float degrees3 = ((bravo2 * 360.0f) - degrees2) - ((float) Math.toDegrees(i10 / this.india));
        float f19 = (bravo * 360.0f) + degrees2;
        if (degrees3 > 0.0f) {
            C0730l c0730l = (C0730l) this.alpha;
            if (c0730l.bravo(this.november) && z2 && f11 > 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            paint.setAntiAlias(true);
            paint.setColor(i4);
            paint.setStrokeWidth(this.foxtrot);
            float f20 = this.golf * 2.0f;
            float f21 = degrees * 2.0f;
            PathMeasure pathMeasure = this.delta;
            if (degrees3 < f21) {
                float f22 = degrees3 / f21;
                float f23 = (degrees * f22) + f19;
                s sVar = new s();
                if (!z10) {
                    sVar.charlie(f23 + 90.0f);
                    sVar.alpha(-this.india);
                } else {
                    float length = (pathMeasure.getLength() * (f23 / 360.0f)) / 2.0f;
                    float f24 = this.hotel * f11;
                    float f25 = this.india;
                    if (f25 != this.mike || f24 != this.kilo) {
                        this.kilo = f24;
                        this.mike = f25;
                        golf();
                    }
                    pathMeasure.getPosTan(length, sVar.alpha, sVar.bravo);
                }
                paint.setStyle(Paint.Style.FILL);
                juliet(canvas, paint, sVar, f20, this.foxtrot, f22);
                return;
            }
            paint.setStyle(Paint.Style.STROKE);
            if (c0730l.charlie()) {
                cap = Paint.Cap.ROUND;
            } else {
                cap = Paint.Cap.BUTT;
            }
            paint.setStrokeCap(cap);
            float f26 = f19 + degrees;
            float f27 = degrees3 - f21;
            Pair pair = this.quebec;
            ((s) pair.first).bravo();
            ((s) pair.second).bravo();
            if (!z10) {
                ((s) pair.first).charlie(f26 + 90.0f);
                ((s) pair.first).alpha(-this.india);
                ((s) pair.second).charlie(f26 + f27 + 90.0f);
                ((s) pair.second).alpha(-this.india);
                RectF rectF = this.papa;
                float f28 = this.india;
                float f29 = -f28;
                rectF.set(f29, f29, f28, f28);
                canvas.drawArc(rectF, f26, f27, false, paint);
                canvas2 = canvas;
            } else {
                Path path = this.charlie;
                float f30 = f26 / 360.0f;
                float f31 = f27 / 360.0f;
                float f32 = this.hotel * f11;
                if (this.november) {
                    i11 = c0730l.juliet;
                } else {
                    i11 = c0730l.kilo;
                }
                float f33 = this.india;
                if (f33 != this.mike || f32 != this.kilo || i11 != this.lima) {
                    this.kilo = f32;
                    this.lima = i11;
                    this.mike = f33;
                    golf();
                }
                path.rewind();
                float alpha = O6.c.alpha(f31, 0.0f, 1.0f);
                if (c0730l.bravo(this.november)) {
                    float f34 = f12 / ((float) ((this.india * 6.283185307179586d) / this.juliet));
                    f30 += f34;
                    f14 = 0.0f - (f34 * 360.0f);
                } else {
                    f14 = 0.0f;
                }
                float f35 = f30 % 1.0f;
                float length2 = (pathMeasure.getLength() * f35) / 2.0f;
                float length3 = (pathMeasure.getLength() * (f35 + alpha)) / 2.0f;
                pathMeasure.getSegment(length2, length3, path, true);
                s sVar2 = (s) pair.first;
                sVar2.bravo();
                pathMeasure.getPosTan(length2, sVar2.alpha, sVar2.bravo);
                s sVar3 = (s) pair.second;
                sVar3.bravo();
                pathMeasure.getPosTan(length3, sVar3.alpha, sVar3.bravo);
                Matrix matrix = this.echo;
                matrix.reset();
                matrix.setRotate(f14);
                sVar2.charlie(f14);
                sVar3.charlie(f14);
                path.transform(matrix);
                canvas2 = canvas;
                canvas2.drawPath(path, paint);
            }
            if (!c0730l.charlie() && this.golf > 0.0f) {
                paint.setStyle(Paint.Style.FILL);
                juliet(canvas2, paint, (s) pair.first, f20, this.foxtrot, 1.0f);
                juliet(canvas, paint, (s) pair.second, f20, this.foxtrot, 1.0f);
            }
        }
    }

    public final void juliet(Canvas canvas, Paint paint, s sVar, float f5, float f10, float f11) {
        float min = Math.min(f10, this.foxtrot);
        float f12 = f5 / 2.0f;
        float min2 = Math.min(f12, (this.golf * min) / this.foxtrot);
        RectF rectF = new RectF((-f5) / 2.0f, (-min) / 2.0f, f12, min / 2.0f);
        canvas.save();
        float[] fArr = sVar.alpha;
        canvas.translate(fArr[0], fArr[1]);
        canvas.rotate(t.hotel(sVar.bravo));
        canvas.scale(f11, f11);
        canvas.drawRoundRect(rectF, min2, min2, paint);
        canvas.restore();
    }

    public final int kilo() {
        AbstractC0723e abstractC0723e = this.alpha;
        return (((C0730l) abstractC0723e).quebec * 2) + ((C0730l) abstractC0723e).papa;
    }
}
