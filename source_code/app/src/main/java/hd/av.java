package hd;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import z0.C3460i;

/* loaded from: classes2.dex */
public final /* synthetic */ class av extends kotlin.jvm.internal.a implements Function1 {
    public final /* synthetic */ int alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ av(int i4, Object obj, Class cls, String str, String str2, int i5, int i10) {
        super(i4, i5, cls, obj, str, str2);
        this.alpha = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.alpha) {
            case 0:
                Object delta = ((Dd.f) this.receiver).delta((Nd.c) obj);
                if (delta != Od.a.alpha) {
                    return Unit.INSTANCE;
                }
                return delta;
            default:
                ((J.e) this.receiver).bravo((C3460i) obj);
                return Unit.INSTANCE;
        }
    }
}
