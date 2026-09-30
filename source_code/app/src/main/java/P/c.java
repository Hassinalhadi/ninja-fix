package P;

import Q0.r;
import androidx.compose.runtime.InterfaceC0581m;
import d.C1524c0;
import d.C1530f0;
import kotlin.Unit;
import vf.ad;

/* loaded from: classes3.dex */
public final /* synthetic */ class c extends kotlin.jvm.internal.a implements Xd.l {
    public final /* synthetic */ int alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i4, Object obj, Class cls, String str, String str2, int i5, int i10) {
        super(i4, i5, cls, obj, str, str2);
        this.alpha = i10;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        switch (this.alpha) {
            case 0:
                int intValue = ((Number) obj2).intValue();
                ((d) this.receiver).alpha((InterfaceC0581m) obj, intValue);
                return Unit.INSTANCE;
            default:
                long j5 = ((r) obj).alpha;
                C1530f0 c1530f0 = (C1530f0) this.receiver;
                ad.zulu(c1530f0.f11992g.charlie(), null, null, new C1524c0(c1530f0, j5, null), 3);
                return Unit.INSTANCE;
        }
    }
}
