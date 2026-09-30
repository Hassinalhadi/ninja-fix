package g7;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import f7.C1694a;

/* loaded from: classes2.dex */
public final class q extends v {
    public final s charlie;

    public q(s sVar) {
        this.charlie = sVar;
    }

    @Override // g7.v
    public final void alpha(Matrix matrix, C1694a c1694a, int i4, Canvas canvas) {
        boolean z2;
        s sVar = this.charlie;
        float f5 = sVar.foxtrot;
        float f10 = sVar.golf;
        RectF rectF = new RectF(sVar.bravo, sVar.charlie, sVar.delta, sVar.echo);
        c1694a.getClass();
        if (f10 < 0.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        Path path = c1694a.golf;
        int[] iArr = C1694a.kilo;
        if (z2) {
            iArr[0] = 0;
            iArr[1] = c1694a.foxtrot;
            iArr[2] = c1694a.echo;
            iArr[3] = c1694a.delta;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f5, f10);
            path.close();
            float f11 = -i4;
            rectF.inset(f11, f11);
            iArr[0] = 0;
            iArr[1] = c1694a.delta;
            iArr[2] = c1694a.echo;
            iArr[3] = c1694a.foxtrot;
        }
        float width = rectF.width() / 2.0f;
        if (width <= 0.0f) {
            return;
        }
        float f12 = 1.0f - (i4 / width);
        float[] fArr = C1694a.lima;
        fArr[1] = f12;
        fArr[2] = ((1.0f - f12) / 2.0f) + f12;
        RadialGradient radialGradient = new RadialGradient(rectF.centerX(), rectF.centerY(), width, iArr, fArr, Shader.TileMode.CLAMP);
        Paint paint = c1694a.bravo;
        paint.setShader(radialGradient);
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z2) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, c1694a.hotel);
        }
        canvas.drawArc(rectF, f5, f10, true, paint);
        canvas.restore();
    }
}
