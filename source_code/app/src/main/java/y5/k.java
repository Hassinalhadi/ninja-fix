package y5;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes3.dex */
public final class k implements GestureDetector.OnDoubleTapListener {
    public final /* synthetic */ o alpha;

    public k(o oVar) {
        this.alpha = oVar;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        o oVar = this.alpha;
        try {
            float delta = oVar.delta();
            float x4 = motionEvent.getX();
            float y10 = motionEvent.getY();
            float f5 = oVar.silver;
            if (delta < f5) {
                oVar.echo(f5, x4, y10, true);
            } else {
                if (delta >= f5) {
                    float f10 = oVar.teal;
                    if (delta < f10) {
                        oVar.echo(f10, x4, y10, true);
                    }
                }
                oVar.echo(oVar.red, x4, y10, true);
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        RectF rectF;
        o oVar = this.alpha;
        View.OnClickListener onClickListener = oVar.f14146i;
        if (onClickListener != null) {
            onClickListener.onClick(oVar.f14139a);
        }
        oVar.bravo();
        Matrix charlie = oVar.charlie();
        if (oVar.f14139a.getDrawable() != null) {
            rectF = oVar.f14144g;
            rectF.set(0.0f, 0.0f, r2.getIntrinsicWidth(), r2.getIntrinsicHeight());
            charlie.mapRect(rectF);
        } else {
            rectF = null;
        }
        float x4 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (rectF != null && rectF.contains(x4, y10)) {
            rectF.width();
            rectF.height();
            return true;
        }
        return false;
    }
}
