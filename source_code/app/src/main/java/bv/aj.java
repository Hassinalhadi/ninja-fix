package bv;

import kotlin.ResultKt;
import kotlin.Unit;
import pf.C2359i;

/* loaded from: classes3.dex */
public final class aj extends Pd.h implements Xd.l {
    public N.d purple;
    public ak red;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ak f3403s;
    public long[] silver;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ N.d f3404t;
    public int teal;
    public int white;
    public /* synthetic */ Object yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj(ak akVar, N.d dVar, Nd.c cVar) {
        super(2, cVar);
        this.f3403s = akVar;
        this.f3404t = dVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        aj ajVar = new aj(this.f3403s, this.f3404t, cVar);
        ajVar.yellow = obj;
        return ajVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((aj) create((C2359i) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        C2359i c2359i;
        ak akVar;
        long[] jArr;
        int i4;
        N.d dVar;
        Od.a aVar = Od.a.alpha;
        int i5 = this.white;
        if (i5 != 0) {
            if (i5 == 1) {
                i4 = this.teal;
                jArr = this.silver;
                akVar = this.red;
                dVar = this.purple;
                c2359i = (C2359i) this.yellow;
                ResultKt.alpha(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            c2359i = (C2359i) this.yellow;
            akVar = this.f3403s;
            ai aiVar = akVar.purple;
            jArr = aiVar.charlie;
            i4 = aiVar.echo;
            dVar = this.f3404t;
        }
        if (i4 != Integer.MAX_VALUE) {
            int i10 = (int) ((jArr[i4] >> 31) & 2147483647L);
            dVar.purple = i4;
            Object obj2 = akVar.purple.bravo[i4];
            this.yellow = c2359i;
            this.purple = dVar;
            this.red = akVar;
            this.silver = jArr;
            this.teal = i10;
            this.white = 1;
            c2359i.bravo(this, obj2);
            return aVar;
        }
        return Unit.INSTANCE;
    }
}
