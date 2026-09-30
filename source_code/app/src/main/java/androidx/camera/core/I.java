package androidx.camera.core;

import android.view.Surface;
import be.InterfaceC0757c;
import r1.InterfaceC2482a;
import s6.T7;

/* loaded from: classes3.dex */
public final class I implements InterfaceC0757c {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;
    public final /* synthetic */ Object red;

    public /* synthetic */ I(int i4, Object obj, Object obj2) {
        this.alpha = i4;
        this.purple = obj;
        this.red = obj2;
    }

    @Override // be.InterfaceC0757c
    public final void b(Throwable th) {
        switch (this.alpha) {
            case 0:
                if (th instanceof SurfaceRequest$RequestCancelledException) {
                    T7.golf(null, ((V0.k) this.red).cancel(false));
                    return;
                } else {
                    T7.golf(null, ((V0.h) this.purple).bravo(null));
                    return;
                }
            default:
                T7.golf("Camera surface session should only fail with request cancellation. Instead failed due to:\n" + th, th instanceof SurfaceRequest$RequestCancelledException);
                ((InterfaceC2482a) this.purple).accept(new C0501h(1, (Surface) this.red));
                return;
        }
    }

    @Override // be.InterfaceC0757c
    public final void onSuccess(Object obj) {
        switch (this.alpha) {
            case 0:
                T7.golf(null, ((V0.h) this.purple).bravo(null));
                return;
            default:
                ((InterfaceC2482a) this.purple).accept(new C0501h(0, (Surface) this.red));
                return;
        }
    }
}
