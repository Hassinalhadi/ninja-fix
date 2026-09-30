package g7;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import g.C1718a;
import java.util.ArrayList;
import java.util.BitSet;
import s6.Q4;

/* loaded from: classes2.dex */
public final class o {
    public final w[] alpha = new w[4];
    public final Matrix[] bravo = new Matrix[4];
    public final Matrix[] charlie = new Matrix[4];
    public final PointF delta = new PointF();
    public final Path echo = new Path();
    public final Path foxtrot = new Path();
    public final w golf = new w();
    public final float[] hotel = new float[2];
    public final float[] india = new float[2];
    public final Path juliet = new Path();
    public final Path kilo = new Path();
    public final boolean lima = true;

    public o() {
        for (int i4 = 0; i4 < 4; i4++) {
            this.alpha[i4] = new w();
            this.bravo[i4] = new Matrix();
            this.charlie[i4] = new Matrix();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v6 */
    public final void alpha(m mVar, float[] fArr, float f5, RectF rectF, C1718a c1718a, Path path) {
        Matrix[] matrixArr;
        Matrix[] matrixArr2;
        w[] wVarArr;
        int i4;
        boolean z2;
        float[] fArr2;
        float f10;
        f fVar;
        boolean z10;
        d cVar;
        Q4 q4;
        int i5;
        o oVar = this;
        path.rewind();
        Path path2 = oVar.echo;
        path2.rewind();
        Path path3 = oVar.foxtrot;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i10 = 0;
        while (true) {
            matrixArr = oVar.charlie;
            matrixArr2 = oVar.bravo;
            wVarArr = oVar.alpha;
            i4 = 4;
            z2 = 0;
            fArr2 = oVar.hotel;
            if (i10 >= 4) {
                break;
            }
            if (fArr == null) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            cVar = mVar.foxtrot;
                        } else {
                            cVar = mVar.echo;
                        }
                    } else {
                        cVar = mVar.hotel;
                    }
                } else {
                    cVar = mVar.golf;
                }
            } else {
                cVar = new c(fArr[i10]);
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        q4 = mVar.bravo;
                    } else {
                        q4 = mVar.alpha;
                    }
                } else {
                    q4 = mVar.delta;
                }
            } else {
                q4 = mVar.charlie;
            }
            w wVar = wVarArr[i10];
            q4.getClass();
            q4.bravo(wVar, f5, cVar.alpha(rectF));
            int i11 = i10 + 1;
            float f11 = (i11 % 4) * 90;
            matrixArr2[i10].reset();
            PointF pointF = oVar.delta;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        i5 = i10;
                        pointF.set(rectF.right, rectF.top);
                    } else {
                        i5 = i10;
                        pointF.set(rectF.left, rectF.top);
                    }
                } else {
                    i5 = i10;
                    pointF.set(rectF.left, rectF.bottom);
                }
            } else {
                i5 = i10;
                pointF.set(rectF.right, rectF.bottom);
            }
            matrixArr2[i5].setTranslate(pointF.x, pointF.y);
            matrixArr2[i5].preRotate(f11);
            w wVar2 = wVarArr[i5];
            fArr2[0] = wVar2.bravo;
            fArr2[1] = wVar2.charlie;
            matrixArr2[i5].mapPoints(fArr2);
            matrixArr[i5].reset();
            matrixArr[i5].setTranslate(fArr2[0], fArr2[1]);
            matrixArr[i5].preRotate(f11);
            i10 = i11;
        }
        int i12 = 0;
        while (i12 < i4) {
            w wVar3 = wVarArr[i12];
            wVar3.getClass();
            fArr2[z2] = 0.0f;
            fArr2[1] = wVar3.alpha;
            matrixArr2[i12].mapPoints(fArr2);
            if (i12 == 0) {
                path.moveTo(fArr2[z2], fArr2[1]);
            } else {
                path.lineTo(fArr2[z2], fArr2[1]);
            }
            wVarArr[i12].bravo(matrixArr2[i12], path);
            if (c1718a != null) {
                w wVar4 = wVarArr[i12];
                Matrix matrix = matrixArr2[i12];
                i iVar = (i) c1718a.purple;
                BitSet bitSet = iVar.teal;
                wVar4.getClass();
                f10 = 0.0f;
                bitSet.set(i12, z2);
                wVar4.alpha(wVar4.echo);
                iVar.red[i12] = new p(new ArrayList(wVar4.golf), new Matrix(matrix));
            } else {
                f10 = 0.0f;
            }
            int i13 = i12 + 1;
            int i14 = i13 % 4;
            w wVar5 = wVarArr[i12];
            fArr2[0] = wVar5.bravo;
            fArr2[1] = wVar5.charlie;
            matrixArr2[i12].mapPoints(fArr2);
            w wVar6 = wVarArr[i14];
            wVar6.getClass();
            float[] fArr3 = oVar.india;
            fArr3[0] = f10;
            fArr3[1] = wVar6.alpha;
            matrixArr2[i14].mapPoints(fArr3);
            Matrix[] matrixArr3 = matrixArr2;
            w[] wVarArr2 = wVarArr;
            float max = Math.max(((float) Math.hypot(fArr2[0] - fArr3[0], fArr2[1] - fArr3[1])) - 0.001f, f10);
            w wVar7 = wVarArr2[i12];
            fArr2[0] = wVar7.bravo;
            fArr2[1] = wVar7.charlie;
            matrixArr3[i12].mapPoints(fArr2);
            if (i12 != 1 && i12 != 3) {
                Math.abs(rectF.centerY() - fArr2[1]);
            } else {
                Math.abs(rectF.centerX() - fArr2[0]);
            }
            w wVar8 = oVar.golf;
            wVar8.delta(0.0f, 270.0f, 0.0f);
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        fVar = mVar.juliet;
                    } else {
                        fVar = mVar.india;
                    }
                } else {
                    fVar = mVar.lima;
                }
            } else {
                fVar = mVar.kilo;
            }
            fVar.getClass();
            wVar8.charlie(max, 0.0f);
            Path path4 = oVar.juliet;
            path4.reset();
            wVar8.bravo(matrixArr[i12], path4);
            if (oVar.lima && (oVar.bravo(path4, i12) || oVar.bravo(path4, i14))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr2[0] = 0.0f;
                fArr2[1] = wVar8.alpha;
                matrixArr[i12].mapPoints(fArr2);
                path2.moveTo(fArr2[0], fArr2[1]);
                wVar8.bravo(matrixArr[i12], path2);
            } else {
                wVar8.bravo(matrixArr[i12], path);
            }
            if (c1718a != null) {
                Matrix matrix2 = matrixArr[i12];
                i iVar2 = (i) c1718a.purple;
                z10 = false;
                iVar2.teal.set(i12 + 4, false);
                wVar8.alpha(wVar8.echo);
                iVar2.silver[i12] = new p(new ArrayList(wVar8.golf), new Matrix(matrix2));
            } else {
                z10 = false;
            }
            z2 = z10;
            i12 = i13;
            wVarArr = wVarArr2;
            matrixArr2 = matrixArr3;
            i4 = 4;
            oVar = this;
        }
        path.close();
        path2.close();
        if (!path2.isEmpty()) {
            path.op(path2, Path.Op.UNION);
        }
    }

    public final boolean bravo(Path path, int i4) {
        Path path2 = this.kilo;
        path2.reset();
        this.alpha[i4].bravo(this.bravo[i4], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (!rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f)) {
            return true;
        }
        return false;
    }
}
