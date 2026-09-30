package av;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import t6.Q3;
import t6.j4;

/* loaded from: classes3.dex */
public final class A {
    public final h alpha;
    public final androidx.lifecycle.az bravo = new androidx.lifecycle.au(0);
    public final boolean charlie;
    public final bd.h delta;
    public boolean echo;
    public V0.h foxtrot;
    public boolean golf;

    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.lifecycle.au, androidx.lifecycle.az] */
    public A(h hVar, androidx.camera.camera2.internal.compat.j jVar, bd.h hVar2) {
        this.alpha = hVar;
        this.delta = hVar2;
        this.charlie = Q3.alpha(new a4.u(5, jVar));
        hVar.alpha(new g() { // from class: av.ay
            @Override // av.g
            public final boolean charlie(TotalCaptureResult totalCaptureResult) {
                boolean z2;
                A a6 = A.this;
                if (a6.foxtrot != null) {
                    Integer num = (Integer) totalCaptureResult.getRequest().get(CaptureRequest.FLASH_MODE);
                    if (num != null && num.intValue() == 2) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2 == a6.golf) {
                        a6.foxtrot.bravo(null);
                        a6.foxtrot = null;
                    }
                }
                return false;
            }
        });
    }

    public static void alpha(androidx.lifecycle.az azVar, Integer num) {
        if (j4.charlie()) {
            azVar.setValue(num);
        } else {
            azVar.postValue(num);
        }
    }
}
