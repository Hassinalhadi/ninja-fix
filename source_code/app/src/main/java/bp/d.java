package bp;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import s6.T7;
import t6.AbstractC3066u3;
import t6.Z3;

/* loaded from: classes3.dex */
public final class d {
    public Size alpha;
    public Rect bravo;
    public int charlie;
    public Matrix delta;
    public int echo;
    public boolean foxtrot;
    public boolean golf;
    public g hotel;

    public final void alpha(Size size, int i4, Rect rect) {
        Matrix matrix;
        if (!foxtrot()) {
            return;
        }
        Matrix matrix2 = new Matrix();
        if (!foxtrot()) {
            matrix = null;
        } else {
            Matrix matrix3 = new Matrix(this.delta);
            matrix3.postConcat(charlie(size, i4));
            matrix = matrix3;
        }
        matrix.invert(matrix2);
        Matrix matrix4 = new Matrix();
        matrix4.setRectToRect(new RectF(0.0f, 0.0f, rect.width(), rect.height()), new RectF(0.0f, 0.0f, 1.0f, 1.0f), Matrix.ScaleToFit.FILL);
        matrix2.postConcat(matrix4);
    }

    public final Size bravo() {
        if (bc.f.bravo(this.charlie)) {
            return new Size(this.bravo.height(), this.bravo.width());
        }
        return new Size(this.bravo.width(), this.bravo.height());
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Matrix charlie(Size size, int i4) {
        Matrix.ScaleToFit scaleToFit;
        RectF rectF;
        T7.golf(null, foxtrot());
        if (bc.f.charlie(size, true, bravo())) {
            rectF = new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight());
        } else {
            RectF rectF2 = new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight());
            Size bravo = bravo();
            RectF rectF3 = new RectF(0.0f, 0.0f, bravo.getWidth(), bravo.getHeight());
            Matrix matrix = new Matrix();
            g gVar = this.hotel;
            int ordinal = gVar.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            if (ordinal != 4) {
                                if (ordinal != 5) {
                                    AbstractC3066u3.charlie("PreviewTransform", "Unexpected crop rect: " + gVar);
                                    scaleToFit = Matrix.ScaleToFit.FILL;
                                    if (gVar == g.FIT_CENTER && gVar != g.FIT_START && gVar != g.FIT_END) {
                                        matrix.setRectToRect(rectF2, rectF3, scaleToFit);
                                        matrix.invert(matrix);
                                    } else {
                                        matrix.setRectToRect(rectF3, rectF2, scaleToFit);
                                    }
                                    matrix.mapRect(rectF3);
                                    if (i4 != 1) {
                                        float width = size.getWidth() / 2.0f;
                                        float f5 = width + width;
                                        rectF = new RectF(f5 - rectF3.right, rectF3.top, f5 - rectF3.left, rectF3.bottom);
                                    } else {
                                        rectF = rectF3;
                                    }
                                }
                            }
                        }
                    }
                    scaleToFit = Matrix.ScaleToFit.END;
                    if (gVar == g.FIT_CENTER) {
                    }
                    matrix.setRectToRect(rectF3, rectF2, scaleToFit);
                    matrix.mapRect(rectF3);
                    if (i4 != 1) {
                    }
                }
                scaleToFit = Matrix.ScaleToFit.CENTER;
                if (gVar == g.FIT_CENTER) {
                }
                matrix.setRectToRect(rectF3, rectF2, scaleToFit);
                matrix.mapRect(rectF3);
                if (i4 != 1) {
                }
            }
            scaleToFit = Matrix.ScaleToFit.START;
            if (gVar == g.FIT_CENTER) {
            }
            matrix.setRectToRect(rectF3, rectF2, scaleToFit);
            matrix.mapRect(rectF3);
            if (i4 != 1) {
            }
        }
        Matrix alpha = bc.f.alpha(new RectF(this.bravo), rectF, this.charlie, false);
        if (this.foxtrot && this.golf) {
            if (bc.f.bravo(this.charlie)) {
                alpha.preScale(1.0f, -1.0f, this.bravo.centerX(), this.bravo.centerY());
                return alpha;
            }
            alpha.preScale(-1.0f, 1.0f, this.bravo.centerX(), this.bravo.centerY());
        }
        return alpha;
    }

    public final Matrix delta() {
        int i4;
        T7.golf(null, foxtrot());
        RectF rectF = new RectF(0.0f, 0.0f, this.alpha.getWidth(), this.alpha.getHeight());
        if (!this.golf) {
            i4 = this.charlie;
        } else {
            i4 = -Z3.bravo(this.echo);
        }
        return bc.f.alpha(rectF, rectF, i4, false);
    }

    public final RectF echo(Size size, int i4) {
        T7.golf(null, foxtrot());
        Matrix charlie = charlie(size, i4);
        RectF rectF = new RectF(0.0f, 0.0f, this.alpha.getWidth(), this.alpha.getHeight());
        charlie.mapRect(rectF);
        return rectF;
    }

    public final boolean foxtrot() {
        boolean z2;
        if (this.golf && this.echo == -1) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (this.bravo != null && this.alpha != null && z2) {
            return true;
        }
        return false;
    }
}
