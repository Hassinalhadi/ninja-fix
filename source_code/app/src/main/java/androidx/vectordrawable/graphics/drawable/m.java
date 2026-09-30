package androidx.vectordrawable.graphics.drawable;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import bv.aw;
import j1.C1931e;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class m {
    public static final Matrix papa = new Matrix();
    public final Path alpha;
    public final Path bravo;
    public final Matrix charlie;
    public Paint delta;
    public Paint echo;
    public PathMeasure foxtrot;
    public final j golf;
    public float hotel;
    public float india;
    public float juliet;
    public float kilo;
    public int lima;
    public String mike;
    public Boolean november;
    public final bv.e oscar;

    /* JADX WARN: Type inference failed for: r0v4, types: [bv.e, bv.aw] */
    public m() {
        this.charlie = new Matrix();
        this.hotel = 0.0f;
        this.india = 0.0f;
        this.juliet = 0.0f;
        this.kilo = 0.0f;
        this.lima = 255;
        this.mike = null;
        this.november = null;
        this.oscar = new aw(0);
        this.golf = new j();
        this.alpha = new Path();
        this.bravo = new Path();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void alpha(j jVar, Matrix matrix, Canvas canvas, int i4, int i5) {
        float f5;
        char c3;
        float f10;
        boolean z2;
        float f11;
        int i10;
        Path.FillType fillType;
        Path.FillType fillType2;
        j jVar2 = jVar;
        char c4 = 1;
        jVar2.alpha.set(matrix);
        Matrix matrix2 = jVar2.juliet;
        Matrix matrix3 = jVar2.alpha;
        matrix3.preConcat(matrix2);
        canvas.save();
        char c10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = jVar2.bravo;
            if (i11 < arrayList.size()) {
                k kVar = (k) arrayList.get(i11);
                if (kVar instanceof j) {
                    alpha((j) kVar, matrix3, canvas, i4, i5);
                } else if (kVar instanceof l) {
                    l lVar = (l) kVar;
                    float f12 = i4 / this.juliet;
                    float f13 = i5 / this.kilo;
                    float min = Math.min(f12, f13);
                    Matrix matrix4 = this.charlie;
                    matrix4.set(matrix3);
                    matrix4.postScale(f12, f13);
                    float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                    matrix3.mapVectors(fArr);
                    float hypot = (float) Math.hypot(fArr[c10], fArr[c4]);
                    boolean z10 = c4;
                    boolean z11 = c10;
                    float hypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                    float f14 = (fArr[z11 ? 1 : 0] * fArr[3]) - (fArr[z10 ? 1 : 0] * fArr[2]);
                    float max = Math.max(hypot, hypot2);
                    if (max > 0.0f) {
                        f5 = Math.abs(f14) / max;
                    } else {
                        f5 = 0.0f;
                    }
                    if (f5 != 0.0f) {
                        lVar.getClass();
                        Path path = this.alpha;
                        path.reset();
                        C1931e[] c1931eArr = lVar.alpha;
                        if (c1931eArr != null) {
                            C1931e.bravo(c1931eArr, path);
                        }
                        Path path2 = this.bravo;
                        path2.reset();
                        if (lVar instanceof h) {
                            if (lVar.charlie == 0) {
                                fillType2 = Path.FillType.WINDING;
                            } else {
                                fillType2 = Path.FillType.EVEN_ODD;
                            }
                            path2.setFillType(fillType2);
                            path2.addPath(path, matrix4);
                            canvas.clipPath(path2);
                        } else {
                            i iVar = (i) lVar;
                            float f15 = iVar.india;
                            if (f15 != 0.0f || iVar.juliet != 1.0f) {
                                float f16 = iVar.kilo;
                                float f17 = (f15 + f16) % 1.0f;
                                float f18 = (iVar.juliet + f16) % 1.0f;
                                if (this.foxtrot == null) {
                                    this.foxtrot = new PathMeasure();
                                }
                                this.foxtrot.setPath(path, z11);
                                float length = this.foxtrot.getLength();
                                float f19 = f17 * length;
                                float f20 = f18 * length;
                                path.reset();
                                if (f19 > f20) {
                                    this.foxtrot.getSegment(f19, length, path, z10);
                                    f10 = 0.0f;
                                    this.foxtrot.getSegment(0.0f, f20, path, z10);
                                } else {
                                    f10 = 0.0f;
                                    this.foxtrot.getSegment(f19, f20, path, z10);
                                }
                                path.rLineTo(f10, f10);
                            }
                            path2.addPath(path, matrix4);
                            B0.a aVar = iVar.foxtrot;
                            if (((Shader) aVar.charlie) != null || aVar.bravo != 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z2) {
                                if (this.echo == null) {
                                    i10 = 16777215;
                                    Paint paint = new Paint(1);
                                    this.echo = paint;
                                    paint.setStyle(Paint.Style.FILL);
                                } else {
                                    i10 = 16777215;
                                }
                                Paint paint2 = this.echo;
                                Shader shader = (Shader) aVar.charlie;
                                if (shader != null) {
                                    shader.setLocalMatrix(matrix4);
                                    paint2.setShader(shader);
                                    paint2.setAlpha(Math.round(iVar.hotel * 255.0f));
                                    f11 = 255.0f;
                                } else {
                                    paint2.setShader(null);
                                    paint2.setAlpha(255);
                                    int i12 = aVar.bravo;
                                    float f21 = iVar.hotel;
                                    PorterDuff.Mode mode = p.f3159c;
                                    f11 = 255.0f;
                                    paint2.setColor((i12 & i10) | (((int) (Color.alpha(i12) * f21)) << 24));
                                }
                                paint2.setColorFilter(null);
                                if (iVar.charlie == 0) {
                                    fillType = Path.FillType.WINDING;
                                } else {
                                    fillType = Path.FillType.EVEN_ODD;
                                }
                                path2.setFillType(fillType);
                                canvas.drawPath(path2, paint2);
                            } else {
                                f11 = 255.0f;
                                i10 = 16777215;
                            }
                            B0.a aVar2 = iVar.delta;
                            if (((Shader) aVar2.charlie) != null || aVar2.bravo != 0) {
                                if (this.delta == null) {
                                    Paint paint3 = new Paint(1);
                                    this.delta = paint3;
                                    paint3.setStyle(Paint.Style.STROKE);
                                }
                                Paint paint4 = this.delta;
                                Paint.Join join = iVar.mike;
                                if (join != null) {
                                    paint4.setStrokeJoin(join);
                                }
                                Paint.Cap cap = iVar.lima;
                                if (cap != null) {
                                    paint4.setStrokeCap(cap);
                                }
                                paint4.setStrokeMiter(iVar.november);
                                Shader shader2 = (Shader) aVar2.charlie;
                                if (shader2 != null) {
                                    shader2.setLocalMatrix(matrix4);
                                    paint4.setShader(shader2);
                                    paint4.setAlpha(Math.round(iVar.golf * f11));
                                } else {
                                    paint4.setShader(null);
                                    paint4.setAlpha(255);
                                    int i13 = aVar2.bravo;
                                    float f22 = iVar.golf;
                                    PorterDuff.Mode mode2 = p.f3159c;
                                    paint4.setColor((i13 & i10) | (((int) (Color.alpha(i13) * f22)) << 24));
                                }
                                paint4.setColorFilter(null);
                                paint4.setStrokeWidth(iVar.echo * min * f5);
                                canvas.drawPath(path2, paint4);
                            }
                        }
                    }
                    c3 = 1;
                    i11++;
                    jVar2 = jVar;
                    c4 = c3;
                    c10 = 0;
                }
                c3 = c4;
                i11++;
                jVar2 = jVar;
                c4 = c3;
                c10 = 0;
            } else {
                canvas.restore();
                return;
            }
        }
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.lima;
    }

    public void setAlpha(float f5) {
        setRootAlpha((int) (f5 * 255.0f));
    }

    public void setRootAlpha(int i4) {
        this.lima = i4;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [bv.e, bv.aw] */
    public m(m mVar) {
        this.charlie = new Matrix();
        this.hotel = 0.0f;
        this.india = 0.0f;
        this.juliet = 0.0f;
        this.kilo = 0.0f;
        this.lima = 255;
        this.mike = null;
        this.november = null;
        ?? awVar = new aw(0);
        this.oscar = awVar;
        this.golf = new j(mVar.golf, awVar);
        this.alpha = new Path(mVar.alpha);
        this.bravo = new Path(mVar.bravo);
        this.hotel = mVar.hotel;
        this.india = mVar.india;
        this.juliet = mVar.juliet;
        this.kilo = mVar.kilo;
        this.lima = mVar.lima;
        this.mike = mVar.mike;
        String str = mVar.mike;
        if (str != null) {
            awVar.put(str, this);
        }
        this.november = mVar.november;
    }
}
