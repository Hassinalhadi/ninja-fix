package b;

import kotlin.Unit;

/* loaded from: classes3.dex */
public final class J extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ K purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(K k6, Nd.c cVar) {
        super(2, cVar);
        this.purple = k6;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new J(this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        ((J) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
        return Od.a.alpha;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0030 -> B:8:0x0021). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004d -> B:6:0x0050). Please report as a decompilation issue!!! */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            Od.a r0 = Od.a.alpha
            int r1 = r7.alpha
            b.K r2 = r7.purple
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1e
            if (r1 == r4) goto L1a
            if (r1 != r3) goto L12
            kotlin.ResultKt.alpha(r8)
            goto L50
        L12:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1a:
            kotlin.ResultKt.alpha(r8)
            goto L2e
        L1e:
            kotlin.ResultKt.alpha(r8)
        L21:
            xf.e r8 = r2.f3290d
            if (r8 == 0) goto L2e
            r7.alpha = r4
            java.lang.Object r8 = r8.india(r7)
            if (r8 != r0) goto L2e
            goto L4f
        L2e:
            b.W r8 = r2.white
            if (r8 == 0) goto L21
            a5.c r8 = new a5.c
            r1 = 11
            r8.<init>(r1)
            r7.alpha = r3
            Nd.h r1 = r7.getContext()
            androidx.compose.runtime.at r1 = androidx.compose.runtime.C0564b.sierra(r1)
            S.a r5 = new S.a
            r6 = 1
            r5.<init>(r6, r8)
            java.lang.Object r8 = r1.blue(r5, r7)
            if (r8 != r0) goto L50
        L4f:
            return r0
        L50:
            b.W r8 = r2.white
            if (r8 == 0) goto L21
            b.Y r8 = (b.Y) r8
            r8.delta()
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: b.J.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
