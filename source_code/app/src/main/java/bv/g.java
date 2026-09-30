package bv;

import kotlin.ResultKt;
import kotlin.Unit;
import pf.C2359i;

/* loaded from: classes3.dex */
public final class g extends Pd.h implements Xd.l {
    public h purple;
    public long[] red;

    /* renamed from: s, reason: collision with root package name */
    public long f3415s;
    public int silver;

    /* renamed from: t, reason: collision with root package name */
    public int f3416t;
    public int teal;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f3417u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ h f3418v;
    public int white;
    public int yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, Nd.c cVar) {
        super(2, cVar);
        this.f3418v = hVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        g gVar = new g(this.f3418v, cVar);
        gVar.f3417u = obj;
        return gVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((C2359i) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0064  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004e -> B:14:0x00a0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0050 -> B:6:0x0062). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x006b -> B:5:0x0097). Please report as a decompilation issue!!! */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C2359i c2359i;
        h hVar;
        long[] jArr;
        int length;
        int i4;
        long j5;
        Od.a aVar = Od.a.alpha;
        int i5 = this.f3416t;
        if (i5 != 0) {
            if (i5 == 1) {
                int i10 = this.yellow;
                int i11 = this.white;
                long j6 = this.f3415s;
                i4 = this.teal;
                int i12 = this.silver;
                long[] jArr2 = this.red;
                h hVar2 = this.purple;
                C2359i c2359i2 = (C2359i) this.f3417u;
                ResultKt.alpha(obj);
                j6 >>= 8;
                i10++;
                if (i10 < i11) {
                    if (i11 == 8) {
                        length = i12;
                        jArr = jArr2;
                        hVar = hVar2;
                        c2359i = c2359i2;
                        if (i4 != length) {
                            i4++;
                            j5 = jArr[i4];
                            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                hVar2 = hVar;
                                i11 = 8 - ((~(i4 - length)) >>> 31);
                                c2359i2 = c2359i;
                                i10 = 0;
                                jArr2 = jArr;
                                i12 = length;
                                j6 = j5;
                                if (i10 < i11) {
                                    if ((255 & j6) < 128) {
                                        int i13 = (i4 << 3) + i10;
                                        al alVar = hVar2.purple;
                                        M.a aVar2 = new M.a(1, alVar.bravo[i13], alVar.charlie[i13]);
                                        this.f3417u = c2359i2;
                                        this.purple = hVar2;
                                        this.red = jArr2;
                                        this.silver = i12;
                                        this.teal = i4;
                                        this.f3415s = j6;
                                        this.white = i11;
                                        this.yellow = i10;
                                        this.f3416t = 1;
                                        c2359i2.bravo(this, aVar2);
                                        Od.a aVar3 = Od.a.alpha;
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
            c2359i = (C2359i) this.f3417u;
            hVar = this.f3418v;
            jArr = hVar.purple.alpha;
            length = jArr.length - 2;
            if (length >= 0) {
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
