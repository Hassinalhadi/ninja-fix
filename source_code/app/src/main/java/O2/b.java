package O2;

import Tf.ap;
import Tf.x;
import java.io.IOException;
import vg.w;

/* loaded from: classes3.dex */
public final class b extends x {
    public final /* synthetic */ int alpha = 0;
    public Object purple;

    public /* synthetic */ b(ap apVar) {
        super(apVar);
    }

    @Override // Tf.x, Tf.ap
    public final long read(Tf.k kVar, long j5) {
        switch (this.alpha) {
            case 0:
                try {
                    return super.read(kVar, j5);
                } catch (Exception e) {
                    this.purple = e;
                    throw e;
                }
            default:
                try {
                    return super.read(kVar, j5);
                } catch (IOException e4) {
                    ((w) this.purple).red = e4;
                    throw e4;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(w wVar, Tf.m mVar) {
        super(mVar);
        this.purple = wVar;
    }
}
