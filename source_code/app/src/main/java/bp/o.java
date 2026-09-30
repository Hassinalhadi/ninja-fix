package bp;

import android.util.Size;
import android.view.Surface;
import android.view.SurfaceHolder;
import androidx.camera.core.M;
import bb.C0745c;
import g1.AbstractC1735d;
import java.util.Objects;
import t6.AbstractC3066u3;

/* loaded from: classes3.dex */
public final class o implements SurfaceHolder.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f3402a;
    public Size alpha;
    public M purple;
    public M red;
    public A2.p silver;
    public Size teal;
    public boolean white = false;
    public boolean yellow = false;

    public o(p pVar) {
        this.f3402a = pVar;
    }

    public final void alpha() {
        if (this.purple != null) {
            AbstractC3066u3.bravo("SurfaceViewImpl", "Request canceled: " + this.purple);
            this.purple.charlie();
        }
    }

    public final boolean bravo() {
        p pVar = this.f3402a;
        Surface surface = pVar.echo.getHolder().getSurface();
        if (!this.white && this.purple != null && Objects.equals(this.alpha, this.teal)) {
            AbstractC3066u3.bravo("SurfaceViewImpl", "Surface set on Preview.");
            A2.p pVar2 = this.silver;
            M m4 = this.purple;
            Objects.requireNonNull(m4);
            m4.alpha(surface, AbstractC1735d.delta(pVar.echo.getContext()), new C0745c(2, pVar2));
            this.white = true;
            pVar.delta = true;
            pVar.foxtrot();
            return true;
        }
        return false;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i4, int i5, int i10) {
        AbstractC3066u3.bravo("SurfaceViewImpl", "Surface changed. Size: " + i5 + "x" + i10);
        this.teal = new Size(i5, i10);
        bravo();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        M m4;
        AbstractC3066u3.bravo("SurfaceViewImpl", "Surface created.");
        if (this.yellow && (m4 = this.red) != null) {
            m4.charlie();
            m4.india.bravo(null);
            this.red = null;
            this.yellow = false;
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        AbstractC3066u3.bravo("SurfaceViewImpl", "Surface destroyed.");
        if (this.white) {
            if (this.purple != null) {
                AbstractC3066u3.bravo("SurfaceViewImpl", "Surface closed " + this.purple);
                this.purple.kilo.alpha();
            }
        } else {
            alpha();
        }
        this.yellow = true;
        M m4 = this.purple;
        if (m4 != null) {
            this.red = m4;
        }
        this.white = false;
        this.purple = null;
        this.silver = null;
        this.teal = null;
        this.alpha = null;
    }
}
