package bp;

import A2.ao;
import a4.u;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.camera.core.M;
import androidx.lifecycle.RunnableC0643m;
import g1.AbstractC1735d;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import t6.AbstractC3003i;

/* loaded from: classes3.dex */
public final class r extends i {
    public TextureView echo;
    public SurfaceTexture foxtrot;
    public V0.k golf;
    public M hotel;
    public boolean india;
    public SurfaceTexture juliet;
    public AtomicReference kilo;
    public A2.p lima;

    @Override // bp.i
    public final View alpha() {
        return this.echo;
    }

    @Override // bp.i
    public final Bitmap bravo() {
        TextureView textureView = this.echo;
        if (textureView != null && textureView.isAvailable()) {
            return this.echo.getBitmap();
        }
        return null;
    }

    @Override // bp.i
    public final void charlie() {
        if (this.india && this.juliet != null) {
            SurfaceTexture surfaceTexture = this.echo.getSurfaceTexture();
            SurfaceTexture surfaceTexture2 = this.juliet;
            if (surfaceTexture != surfaceTexture2) {
                this.echo.setSurfaceTexture(surfaceTexture2);
                this.juliet = null;
                this.india = false;
            }
        }
    }

    @Override // bp.i
    public final void delta() {
        this.india = true;
    }

    @Override // bp.i
    public final void echo(M m4, A2.p pVar) {
        Size size = m4.bravo;
        this.alpha = size;
        this.lima = pVar;
        FrameLayout frameLayout = this.bravo;
        size.getClass();
        TextureView textureView = new TextureView(frameLayout.getContext());
        this.echo = textureView;
        textureView.setLayoutParams(new FrameLayout.LayoutParams(this.alpha.getWidth(), this.alpha.getHeight()));
        this.echo.setSurfaceTextureListener(new q(this));
        frameLayout.removeAllViews();
        frameLayout.addView(this.echo);
        M m5 = this.hotel;
        if (m5 != null) {
            m5.charlie();
        }
        this.hotel = m4;
        Executor delta = AbstractC1735d.delta(this.echo.getContext());
        m4.juliet.alpha(new RunnableC0643m(14, this, m4), delta);
        hotel();
    }

    @Override // bp.i
    public final com.google.common.util.concurrent.e golf() {
        return AbstractC3003i.alpha(new u(13, this));
    }

    public final void hotel() {
        SurfaceTexture surfaceTexture;
        Size size = this.alpha;
        if (size != null && (surfaceTexture = this.foxtrot) != null && this.hotel != null) {
            surfaceTexture.setDefaultBufferSize(size.getWidth(), this.alpha.getHeight());
            Surface surface = new Surface(this.foxtrot);
            M m4 = this.hotel;
            V0.k alpha = AbstractC3003i.alpha(new ao(23, this, surface));
            this.golf = alpha;
            alpha.purple.foxtrot(new B2.j(this, surface, alpha, m4, 6), AbstractC1735d.delta(this.echo.getContext()));
            this.delta = true;
            foxtrot();
        }
    }
}
