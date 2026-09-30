package av;

import androidx.camera.core.CameraControl$OperationCanceledException;
import ba.C0742c;
import com.airbnb.lottie.LottieCompositionFactory;
import com.incognia.internal.Lsv;
import java.io.InputStream;
import t6.AbstractC3003i;

/* loaded from: classes3.dex */
public final /* synthetic */ class l implements Runnable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ boolean purple;
    public final /* synthetic */ Object red;

    public /* synthetic */ l(Object obj, boolean z2, int i4) {
        this.alpha = i4;
        this.red = obj;
        this.purple = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.alpha) {
            case 0:
                s sVar = (s) this.red;
                boolean z2 = this.purple;
                sVar.f3280v = z2;
                if (z2 && sVar.A == 4) {
                    sVar.emerald(false);
                    return;
                }
                return;
            case 1:
                C0742c c0742c = (C0742c) this.red;
                boolean z10 = c0742c.alpha;
                boolean z11 = this.purple;
                if (z10 != z11) {
                    c0742c.alpha = z11;
                    if (z11) {
                        if (c0742c.bravo) {
                            h hVar = c0742c.charlie;
                            hVar.getClass();
                            be.h.delta(AbstractC3003i.alpha(new a4.u(4, hVar))).foxtrot(new androidx.camera.core.impl.ai(7, c0742c), c0742c.delta);
                            c0742c.bravo = false;
                            return;
                        }
                        return;
                    }
                    CameraControl$OperationCanceledException cameraControl$OperationCanceledException = new CameraControl$OperationCanceledException("The camera control has became inactive.");
                    V0.h hVar2 = c0742c.golf;
                    if (hVar2 != null) {
                        hVar2.delta(cameraControl$OperationCanceledException);
                        c0742c.golf = null;
                        return;
                    }
                    return;
                }
                return;
            case 2:
                LottieCompositionFactory.lambda$fromJsonInputStream$7(this.purple, (InputStream) this.red);
                return;
            default:
                Lsv.W((Throwable) this.red, this.purple);
                return;
        }
    }

    public /* synthetic */ l(boolean z2, InputStream inputStream) {
        this.alpha = 2;
        this.purple = z2;
        this.red = inputStream;
    }
}
