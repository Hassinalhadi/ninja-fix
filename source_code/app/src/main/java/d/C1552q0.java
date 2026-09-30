package d;

import kotlin.Unit;

/* renamed from: d.q0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1552q0 extends Pd.h implements Xd.l {
    public long purple;
    public int red;
    public /* synthetic */ Object silver;
    public final /* synthetic */ m0.r teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1552q0(m0.r rVar, Nd.c cVar) {
        super(2, cVar);
        this.teal = rVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        C1552q0 c1552q0 = new C1552q0(this.teal, cVar);
        c1552q0.silver = obj;
        return c1552q0;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C1552q0) create((m0.af) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0047 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003e A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x003c -> B:5:0x003f). Please report as a decompilation issue!!! */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            Od.a r0 = Od.a.alpha
            int r1 = r7.red
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 != r2) goto L13
            long r3 = r7.purple
            java.lang.Object r1 = r7.silver
            m0.af r1 = (m0.af) r1
            kotlin.ResultKt.alpha(r8)
            goto L3f
        L13:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1b:
            kotlin.ResultKt.alpha(r8)
            java.lang.Object r8 = r7.silver
            m0.af r8 = (m0.af) r8
            m0.r r1 = r7.teal
            t0.C0 r3 = r8.golf()
            r3.getClass()
            r3 = 40
            long r5 = r1.bravo
            long r3 = r3 + r5
            r1 = r8
        L31:
            r7.silver = r1
            r7.purple = r3
            r7.red = r2
            r8 = 3
            java.lang.Object r8 = d.O0.charlie(r1, r7, r8)
            if (r8 != r0) goto L3f
            return r0
        L3f:
            m0.r r8 = (m0.r) r8
            long r5 = r8.bravo
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 < 0) goto L31
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: d.C1552q0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
