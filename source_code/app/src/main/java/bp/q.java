package bp;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import g1.AbstractC1735d;
import t6.AbstractC3066u3;

/* loaded from: classes3.dex */
public final class q implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ r alpha;

    public q(r rVar) {
        this.alpha = rVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i4, int i5) {
        AbstractC3066u3.bravo("TextureViewImpl", "SurfaceTexture available. Size: " + i4 + "x" + i5);
        r rVar = this.alpha;
        rVar.foxtrot = surfaceTexture;
        if (rVar.golf != null) {
            rVar.hotel.getClass();
            AbstractC3066u3.bravo("TextureViewImpl", "Surface invalidated " + rVar.hotel);
            rVar.hotel.kilo.alpha();
            return;
        }
        rVar.hotel();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        r rVar = this.alpha;
        rVar.foxtrot = null;
        V0.k kVar = rVar.golf;
        if (kVar != null) {
            J2.c cVar = new J2.c(25, this, surfaceTexture, false);
            kVar.foxtrot(new be.g(0, kVar, cVar), AbstractC1735d.delta(rVar.echo.getContext()));
            rVar.juliet = surfaceTexture;
            return false;
        }
        AbstractC3066u3.bravo("TextureViewImpl", "SurfaceTexture about to be destroyed");
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i4, int i5) {
        AbstractC3066u3.bravo("TextureViewImpl", "SurfaceTexture size changed: " + i4 + "x" + i5);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        V0.h hVar = (V0.h) this.alpha.kilo.getAndSet(null);
        if (hVar != null) {
            hVar.bravo(null);
        }
    }
}
