package bp;

import A2.s;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.PixelCopy;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.camera.core.M;
import androidx.camera.core.impl.ai;
import g1.AbstractC1735d;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import t6.AbstractC3066u3;

/* loaded from: classes3.dex */
public final class p extends i {
    public SurfaceView echo;
    public final o foxtrot;

    public p(FrameLayout frameLayout, d dVar) {
        super(frameLayout, dVar);
        this.foxtrot = new o(this);
    }

    @Override // bp.i
    public final View alpha() {
        return this.echo;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [bp.n] */
    @Override // bp.i
    public final Bitmap bravo() {
        SurfaceView surfaceView = this.echo;
        if (surfaceView != null && surfaceView.getHolder().getSurface() != null && this.echo.getHolder().getSurface().isValid()) {
            final Semaphore semaphore = new Semaphore(0);
            Bitmap createBitmap = Bitmap.createBitmap(this.echo.getWidth(), this.echo.getHeight(), Bitmap.Config.ARGB_8888);
            HandlerThread handlerThread = new HandlerThread("pixelCopyRequest Thread");
            handlerThread.start();
            PixelCopy.request(this.echo, createBitmap, (PixelCopy.OnPixelCopyFinishedListener) new PixelCopy.OnPixelCopyFinishedListener() { // from class: bp.n
                @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                public final void onPixelCopyFinished(int i4) {
                    Semaphore semaphore2 = semaphore;
                    if (i4 == 0) {
                        AbstractC3066u3.bravo("SurfaceViewImpl", "PreviewView.SurfaceViewImplementation.getBitmap() succeeded");
                    } else {
                        AbstractC3066u3.charlie("SurfaceViewImpl", "PreviewView.SurfaceViewImplementation.getBitmap() failed with error " + i4);
                    }
                    semaphore2.release();
                }
            }, new Handler(handlerThread.getLooper()));
            try {
                if (!semaphore.tryAcquire(1, 100L, TimeUnit.MILLISECONDS)) {
                    AbstractC3066u3.charlie("SurfaceViewImpl", "Timed out while trying to acquire screenshot.");
                }
                return createBitmap;
            } catch (InterruptedException e) {
                AbstractC3066u3.delta("SurfaceViewImpl", "Interrupted while trying to acquire screenshot.", e);
                return createBitmap;
            } finally {
                handlerThread.quitSafely();
            }
        }
        return null;
    }

    @Override // bp.i
    public final void charlie() {
    }

    @Override // bp.i
    public final void delta() {
    }

    @Override // bp.i
    public final void echo(M m4, A2.p pVar) {
        SurfaceView surfaceView = this.echo;
        boolean equals = Objects.equals(this.alpha, m4.bravo);
        if (surfaceView == null || !equals) {
            Size size = m4.bravo;
            this.alpha = size;
            FrameLayout frameLayout = this.bravo;
            size.getClass();
            SurfaceView surfaceView2 = new SurfaceView(frameLayout.getContext());
            this.echo = surfaceView2;
            surfaceView2.setLayoutParams(new FrameLayout.LayoutParams(this.alpha.getWidth(), this.alpha.getHeight()));
            frameLayout.removeAllViews();
            frameLayout.addView(this.echo);
            this.echo.getHolder().addCallback(this.foxtrot);
        }
        Executor delta = AbstractC1735d.delta(this.echo.getContext());
        m4.juliet.alpha(new ai(19, pVar), delta);
        this.echo.post(new s(this, m4, pVar, 23));
    }

    @Override // bp.i
    public final com.google.common.util.concurrent.e golf() {
        return be.j.red;
    }
}
