package h9;

import android.content.Context;
import com.incognia.internal.EDm;
import com.incognia.internal.IZZ;
import com.incognia.internal.d7p;

/* renamed from: h9.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1825c implements d7p {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Context bravo;

    public /* synthetic */ C1825c(Context context, int i4) {
        this.alpha = i4;
        this.bravo = context;
    }

    @Override // com.incognia.internal.d7p
    public final void run() {
        switch (this.alpha) {
            case 0:
                EDm.W(this.bravo);
                return;
            default:
                IZZ.W(this.bravo);
                return;
        }
    }
}
