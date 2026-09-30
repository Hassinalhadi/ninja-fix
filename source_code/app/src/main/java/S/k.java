package S;

import kotlin.ResultKt;
import kotlin.Unit;
import pf.C2359i;

/* loaded from: classes3.dex */
public final class k extends Pd.h implements Xd.l {
    public long[] purple;
    public int red;
    public int silver;
    public int teal;
    public /* synthetic */ Object white;
    public final /* synthetic */ l yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, Nd.c cVar) {
        super(2, cVar);
        this.yellow = lVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        k kVar = new k(this.yellow, cVar);
        kVar.white = obj;
        return kVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((C2359i) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00a9  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x00c8 -> B:7:0x00ca). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0087 -> B:20:0x009e). Please report as a decompilation issue!!! */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j5;
        C2359i c2359i;
        long[] jArr;
        int length;
        int i4;
        C2359i c2359i2;
        int i5;
        C2359i c2359i3;
        int i10;
        Od.a aVar = Od.a.alpha;
        int i11 = this.teal;
        l lVar = this.yellow;
        long j6 = lVar.alpha;
        long j7 = lVar.red;
        long j10 = lVar.purple;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        int i12 = this.red;
                        c2359i3 = (C2359i) this.white;
                        ResultKt.alpha(obj);
                        j5 = 1;
                        i10 = i12 + 1;
                        if (i10 < 64) {
                            if (((j5 << i10) & j6) != 0) {
                                Long l10 = new Long(j7 + i10 + 64);
                                this.white = c2359i3;
                                this.purple = null;
                                this.red = i10;
                                this.teal = 3;
                                c2359i3.bravo(this, l10);
                                Od.a aVar2 = Od.a.alpha;
                                return aVar;
                            }
                            i12 = i10;
                            i10 = i12 + 1;
                            if (i10 < 64) {
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i5 = this.red;
                c2359i2 = (C2359i) this.white;
                ResultKt.alpha(obj);
                j5 = 1;
                i5++;
                if (i5 < 64) {
                    if ((j10 & (j5 << i5)) != 0) {
                        Long l11 = new Long(j7 + i5);
                        this.white = c2359i2;
                        this.purple = null;
                        this.red = i5;
                        this.teal = 2;
                        c2359i2.bravo(this, l11);
                        Od.a aVar3 = Od.a.alpha;
                        return aVar;
                    }
                    i5++;
                    if (i5 < 64) {
                    }
                } else {
                    c2359i = c2359i2;
                    if (j6 != 0) {
                        c2359i3 = c2359i;
                        i10 = 0;
                        if (i10 < 64) {
                        }
                    }
                    return Unit.INSTANCE;
                }
            } else {
                length = this.silver;
                int i13 = this.red;
                j5 = 1;
                jArr = this.purple;
                c2359i = (C2359i) this.white;
                ResultKt.alpha(obj);
                i4 = i13 + 1;
            }
        } else {
            j5 = 1;
            ResultKt.alpha(obj);
            c2359i = (C2359i) this.white;
            jArr = lVar.silver;
            if (jArr != null) {
                length = jArr.length;
                i4 = 0;
            }
            if (j10 != 0) {
                c2359i2 = c2359i;
                i5 = 0;
                if (i5 < 64) {
                }
            }
            if (j6 != 0) {
            }
            return Unit.INSTANCE;
        }
        if (i4 < length) {
            Long l12 = new Long(jArr[i4]);
            this.white = c2359i;
            this.purple = jArr;
            this.red = i4;
            this.silver = length;
            this.teal = 1;
            c2359i.bravo(this, l12);
            return aVar;
        }
        if (j10 != 0) {
        }
        if (j6 != 0) {
        }
        return Unit.INSTANCE;
    }
}
