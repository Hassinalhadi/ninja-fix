package y;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class af extends Pd.h implements Xd.l {
    public int purple;
    public /* synthetic */ Object red;
    public final /* synthetic */ Function1 silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af(Function1 function1, Nd.c cVar) {
        super(2, cVar);
        this.silver = function1;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        af afVar = new af(this.silver, cVar);
        afVar.red = obj;
        return afVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        ((af) create((m0.af) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
        return Od.a.alpha;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:7:0x002b -> B:5:0x002e). Please report as a decompilation issue!!! */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            Od.a r0 = Od.a.alpha
            int r1 = r4.purple
            r2 = 1
            if (r1 == 0) goto L19
            if (r1 != r2) goto L11
            java.lang.Object r1 = r4.red
            m0.af r1 = (m0.af) r1
            kotlin.ResultKt.alpha(r5)
            goto L2e
        L11:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L19:
            kotlin.ResultKt.alpha(r5)
            java.lang.Object r5 = r4.red
            m0.af r5 = (m0.af) r5
            r1 = r5
        L21:
            m0.l r5 = m0.l.alpha
            r4.red = r1
            r4.purple = r2
            java.lang.Object r5 = r1.charlie(r5, r4)
            if (r5 != r0) goto L2e
            return r0
        L2e:
            m0.k r5 = (m0.k) r5
            boolean r5 = t6.AbstractC3047q3.echo(r5)
            r5 = r5 ^ r2
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            kotlin.jvm.functions.Function1 r3 = r4.silver
            r3.invoke(r5)
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: y.af.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
