package bv;

import kotlin.ResultKt;
import kotlin.Unit;
import pf.C2359i;

/* loaded from: classes3.dex */
public final class an extends Pd.h implements Xd.l {
    public N.d purple;
    public ao red;

    /* renamed from: s, reason: collision with root package name */
    public int f3405s;
    public long[] silver;

    /* renamed from: t, reason: collision with root package name */
    public long f3406t;
    public int teal;

    /* renamed from: u, reason: collision with root package name */
    public int f3407u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f3408v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ao f3409w;
    public int white;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ N.d f3410x;
    public int yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public an(ao aoVar, N.d dVar, Nd.c cVar) {
        super(2, cVar);
        this.f3409w = aoVar;
        this.f3410x = dVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        an anVar = new an(this.f3409w, this.f3410x, cVar);
        anVar.f3408v = obj;
        return anVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((an) create((C2359i) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0069  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0052 -> B:14:0x00a2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0054 -> B:6:0x0067). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0070 -> B:5:0x0097). Please report as a decompilation issue!!! */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C2359i c2359i;
        ao aoVar;
        long[] jArr;
        int length;
        N.d dVar;
        int i4;
        long j5;
        Od.a aVar = Od.a.alpha;
        int i5 = this.f3407u;
        if (i5 != 0) {
            if (i5 == 1) {
                int i10 = this.f3405s;
                int i11 = this.yellow;
                long j6 = this.f3406t;
                int i12 = this.white;
                int i13 = this.teal;
                long[] jArr2 = this.silver;
                ao aoVar2 = this.red;
                N.d dVar2 = this.purple;
                C2359i c2359i2 = (C2359i) this.f3408v;
                ResultKt.alpha(obj);
                j6 >>= 8;
                i10++;
                if (i10 < i11) {
                    if (i11 == 8) {
                        length = i13;
                        jArr = jArr2;
                        aoVar = aoVar2;
                        c2359i = c2359i2;
                        i4 = i12;
                        dVar = dVar2;
                        if (i4 != length) {
                            i4++;
                            j5 = jArr[i4];
                            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                c2359i2 = c2359i;
                                i10 = 0;
                                aoVar2 = aoVar;
                                jArr2 = jArr;
                                i11 = 8 - ((~(i4 - length)) >>> 31);
                                dVar2 = dVar;
                                i12 = i4;
                                i13 = length;
                                j6 = j5;
                                if (i10 < i11) {
                                    if ((255 & j6) < 128) {
                                        int i14 = (i12 << 3) + i10;
                                        dVar2.purple = i14;
                                        Object obj2 = aoVar2.purple.bravo[i14];
                                        this.f3408v = c2359i2;
                                        this.purple = dVar2;
                                        this.red = aoVar2;
                                        this.silver = jArr2;
                                        this.teal = i13;
                                        this.white = i12;
                                        this.f3406t = j6;
                                        this.yellow = i11;
                                        this.f3405s = i10;
                                        this.f3407u = 1;
                                        c2359i2.bravo(this, obj2);
                                        Od.a aVar2 = Od.a.alpha;
                                        return aVar;
                                    }
                                    j6 >>= 8;
                                    i10++;
                                    if (i10 < i11) {
                                    }
                                }
                            }
                            if (i4 != length) {
                            }
                        }
                    }
                    return Unit.INSTANCE;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            c2359i = (C2359i) this.f3408v;
            aoVar = this.f3409w;
            jArr = aoVar.purple.alpha;
            length = jArr.length - 2;
            if (length >= 0) {
                dVar = this.f3410x;
                i4 = 0;
                j5 = jArr[i4];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                }
                if (i4 != length) {
                }
            }
            return Unit.INSTANCE;
        }
    }
}
