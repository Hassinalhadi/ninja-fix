package a0;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: a0.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0354h {
    public final Path alpha;
    public RectF bravo;
    public float[] charlie;
    public Matrix delta;

    public C0354h(Path path) {
        this.alpha = path;
    }

    public final Z.c alpha() {
        if (this.bravo == null) {
            this.bravo = new RectF();
        }
        RectF rectF = this.bravo;
        Intrinsics.checkNotNull(rectF);
        this.alpha.computeBounds(rectF, true);
        return new Z.c(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public final void bravo(float f5, float f10) {
        this.alpha.lineTo(f5, f10);
    }

    public final boolean charlie(C0354h c0354h, C0354h c0354h2, int i4) {
        Path.Op op;
        if (i4 == 0) {
            op = Path.Op.DIFFERENCE;
        } else if (i4 == 1) {
            op = Path.Op.INTERSECT;
        } else if (i4 == 4) {
            op = Path.Op.REVERSE_DIFFERENCE;
        } else if (i4 == 2) {
            op = Path.Op.UNION;
        } else {
            op = Path.Op.XOR;
        }
        if (c0354h instanceof C0354h) {
            Path path = c0354h.alpha;
            if (c0354h2 instanceof C0354h) {
                return this.alpha.op(path, c0354h2.alpha, op);
            }
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    public final void delta() {
        this.alpha.reset();
    }

    public final void echo(int i4) {
        Path.FillType fillType;
        if (i4 == 1) {
            fillType = Path.FillType.EVEN_ODD;
        } else {
            fillType = Path.FillType.WINDING;
        }
        this.alpha.setFillType(fillType);
    }

    public final void foxtrot(long j5) {
        Matrix matrix = this.delta;
        if (matrix == null) {
            this.delta = new Matrix();
        } else {
            Intrinsics.checkNotNull(matrix);
            matrix.reset();
        }
        Matrix matrix2 = this.delta;
        Intrinsics.checkNotNull(matrix2);
        matrix2.setTranslate(Float.intBitsToFloat((int) (j5 >> 32)), Float.intBitsToFloat((int) (j5 & 4294967295L)));
        Matrix matrix3 = this.delta;
        Intrinsics.checkNotNull(matrix3);
        this.alpha.transform(matrix3);
    }
}
