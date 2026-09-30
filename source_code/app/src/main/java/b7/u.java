package b7;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.provider.Settings;
import androidx.appcompat.widget.P0;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class u extends q {

    /* renamed from: g, reason: collision with root package name */
    public final t f3361g;

    /* renamed from: h, reason: collision with root package name */
    public K3.b f3362h;

    /* renamed from: i, reason: collision with root package name */
    public androidx.vectordrawable.graphics.drawable.p f3363i;

    public u(Context context, AbstractC0723e abstractC0723e, t tVar, K3.b bVar) {
        super(context, abstractC0723e);
        this.f3361g = tVar;
        this.f3362h = bVar;
        bVar.purple = this;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0128  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        boolean z2;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        Canvas canvas2;
        int i4;
        androidx.vectordrawable.graphics.drawable.p pVar;
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(this.e)) {
            int i5 = 0;
            if (this.red != null && Settings.Global.getFloat(this.alpha.getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f) {
                z2 = true;
            } else {
                z2 = false;
            }
            AbstractC0723e abstractC0723e = this.purple;
            if (z2 && (pVar = this.f3363i) != null) {
                pVar.setBounds(getBounds());
                this.f3363i.setTint(abstractC0723e.echo[0]);
                this.f3363i.draw(canvas);
                return;
            }
            canvas.save();
            t tVar = this.f3361g;
            Rect bounds = getBounds();
            float bravo = bravo();
            ObjectAnimator objectAnimator = this.silver;
            if (objectAnimator != null && objectAnimator.isRunning()) {
                z10 = true;
            } else {
                z10 = false;
            }
            ObjectAnimator objectAnimator2 = this.teal;
            if (objectAnimator2 != null && objectAnimator2.isRunning()) {
                z11 = true;
            } else {
                z11 = false;
            }
            tVar.alpha.delta();
            tVar.alpha(canvas, bounds, bravo, z10, z11);
            int i10 = abstractC0723e.india;
            int i11 = this.f3360d;
            if (!(abstractC0723e instanceof z) && (!(abstractC0723e instanceof C0730l) || !((C0730l) abstractC0723e).sierra)) {
                z12 = false;
            } else {
                z12 = true;
            }
            if (z12 && i10 == 0 && !abstractC0723e.bravo(false)) {
                z13 = true;
            } else {
                z13 = false;
            }
            Paint paint = this.f3359c;
            if (z13) {
                canvas2 = canvas;
                this.f3361g.delta(canvas2, paint, 0.0f, 1.0f, abstractC0723e.foxtrot, i11, 0);
            } else {
                if (z12) {
                    r rVar = (r) ((ArrayList) this.f3362h.red).get(0);
                    r rVar2 = (r) P0.amber(1, (ArrayList) this.f3362h.red);
                    t tVar2 = this.f3361g;
                    if (tVar2 instanceof v) {
                        canvas2 = canvas;
                        i4 = i10;
                        tVar2.delta(canvas2, paint, 0.0f, rVar.alpha, abstractC0723e.foxtrot, i11, i4);
                        this.f3361g.delta(canvas2, paint, rVar2.bravo, 1.0f, abstractC0723e.foxtrot, i11, i4);
                    } else {
                        i4 = i10;
                        canvas.save();
                        canvas.rotate(rVar2.golf);
                        canvas2 = canvas;
                        this.f3361g.delta(canvas2, paint, rVar2.bravo, rVar.alpha + 1.0f, abstractC0723e.foxtrot, i11, i4);
                        canvas2.restore();
                    }
                    while (i5 < ((ArrayList) this.f3362h.red).size()) {
                        r rVar3 = (r) ((ArrayList) this.f3362h.red).get(i5);
                        rVar3.foxtrot = charlie();
                        this.f3361g.charlie(canvas2, paint, rVar3, this.f3360d);
                        if (i5 > 0 && !z13 && z12) {
                            this.f3361g.delta(canvas2, paint, ((r) ((ArrayList) this.f3362h.red).get(i5 - 1)).bravo, rVar3.alpha, abstractC0723e.foxtrot, i11, i4);
                        }
                        i5++;
                        canvas2 = canvas;
                    }
                    canvas.restore();
                }
                canvas2 = canvas;
            }
            i4 = i10;
            while (i5 < ((ArrayList) this.f3362h.red).size()) {
            }
            canvas.restore();
        }
    }

    @Override // b7.q
    public final boolean echo(boolean z2, boolean z10, boolean z11) {
        androidx.vectordrawable.graphics.drawable.p pVar;
        boolean echo = super.echo(z2, z10, z11);
        if (this.red != null && Settings.Global.getFloat(this.alpha.getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f && (pVar = this.f3363i) != null) {
            return pVar.setVisible(z2, z10);
        }
        if (!isRunning()) {
            this.f3362h.charlie();
        }
        if (z2 && z11) {
            this.f3362h.xray();
        }
        return echo;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f3361g.echo();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f3361g.foxtrot();
    }
}
