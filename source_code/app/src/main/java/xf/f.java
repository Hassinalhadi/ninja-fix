package xf;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class f extends kotlin.jvm.internal.i implements Xd.l {
    public static final f alpha = new kotlin.jvm.internal.i(2, g.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        long longValue = ((Number) obj).longValue();
        m mVar = (m) obj2;
        m mVar2 = g.alpha;
        e eVar = mVar.echo;
        Intrinsics.checkNotNull(eVar);
        return new m(longValue, mVar, eVar, 0);
    }
}
