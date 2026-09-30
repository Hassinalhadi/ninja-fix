package N0;

import a0.C0355i;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import c0.e;
import c0.g;
import c0.h;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a extends CharacterStyle implements UpdateAppearance {
    public final e alpha;

    public a(e eVar) {
        this.alpha = eVar;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        Paint.Join join;
        Paint.Cap cap;
        DashPathEffect dashPathEffect;
        if (textPaint != null) {
            g gVar = g.alpha;
            e eVar = this.alpha;
            if (Intrinsics.areEqual(eVar, gVar)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (eVar instanceof h) {
                textPaint.setStyle(Paint.Style.STROKE);
                h hVar = (h) eVar;
                textPaint.setStrokeWidth(hVar.alpha);
                textPaint.setStrokeMiter(hVar.bravo);
                int i4 = hVar.delta;
                if (i4 == 0) {
                    join = Paint.Join.MITER;
                } else if (i4 == 1) {
                    join = Paint.Join.ROUND;
                } else if (i4 == 2) {
                    join = Paint.Join.BEVEL;
                } else {
                    join = Paint.Join.MITER;
                }
                textPaint.setStrokeJoin(join);
                int i5 = hVar.charlie;
                if (i5 == 0) {
                    cap = Paint.Cap.BUTT;
                } else if (i5 == 1) {
                    cap = Paint.Cap.ROUND;
                } else if (i5 == 2) {
                    cap = Paint.Cap.SQUARE;
                } else {
                    cap = Paint.Cap.BUTT;
                }
                textPaint.setStrokeCap(cap);
                C0355i c0355i = hVar.echo;
                if (c0355i != null) {
                    dashPathEffect = c0355i.alpha;
                } else {
                    dashPathEffect = null;
                }
                textPaint.setPathEffect(dashPathEffect);
                return;
            }
            throw new NoWhenBranchMatchedException();
        }
    }
}
