package g7;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import f7.C1694a;

/* loaded from: classes2.dex */
public final class r extends v {
    public final t charlie;
    public final float delta;
    public final float echo;

    public r(t tVar, float f5, float f10) {
        this.charlie = tVar;
        this.delta = f5;
        this.echo = f10;
    }

    @Override // g7.v
    public final void alpha(Matrix matrix, C1694a c1694a, int i4, Canvas canvas) {
        t tVar = this.charlie;
        float f5 = tVar.charlie;
        float f10 = this.echo;
        float f11 = tVar.bravo;
        float f12 = this.delta;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f5 - f10, f11 - f12), 0.0f);
        Matrix matrix2 = this.alpha;
        matrix2.set(matrix);
        matrix2.preTranslate(f12, f10);
        matrix2.preRotate(bravo());
        c1694a.getClass();
        rectF.bottom += i4;
        rectF.offset(0.0f, -i4);
        int[] iArr = C1694a.india;
        iArr[0] = c1694a.foxtrot;
        iArr[1] = c1694a.echo;
        iArr[2] = c1694a.delta;
        Paint paint = c1694a.charlie;
        float f13 = rectF.left;
        paint.setShader(new LinearGradient(f13, rectF.top, f13, rectF.bottom, iArr, C1694a.juliet, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float bravo() {
        t tVar = this.charlie;
        return (float) Math.toDegrees(Math.atan((tVar.charlie - this.echo) / (tVar.bravo - this.delta)));
    }
}
