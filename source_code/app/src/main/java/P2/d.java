package P2;

import Tf.ah;
import Tf.ao;
import Tf.v;

/* loaded from: classes3.dex */
public final class d extends v {
    @Override // Tf.v, Tf.u
    public final ao sink(ah ahVar, boolean z2) {
        ah charlie = ahVar.charlie();
        if (charlie != null) {
            createDirectories(charlie);
        }
        return super.sink(ahVar, z2);
    }
}
