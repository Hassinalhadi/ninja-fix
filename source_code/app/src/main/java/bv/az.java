package bv;

import kotlin.ResultKt;
import kotlin.Unit;
import pf.C2359i;

/* loaded from: classes3.dex */
public final class az extends Pd.h implements Xd.l {
    public Object[] purple;
    public long[] red;

    /* renamed from: s, reason: collision with root package name */
    public long f3411s;
    public int silver;

    /* renamed from: t, reason: collision with root package name */
    public int f3412t;
    public int teal;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f3413u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ A f3414v;
    public int white;
    public int yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public az(A a6, Nd.c cVar) {
        super(2, cVar);
        this.f3414v = a6;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        az azVar = new az(this.f3414v, cVar);
        azVar.f3413u = obj;
        return azVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((az) create((C2359i) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0066  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0051 -> B:14:0x0095). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0053 -> B:6:0x0064). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x006d -> B:5:0x008c). Please report as a decompilation issue!!! */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C2359i c2359i;
        Object[] objArr;
        long[] jArr;
        int length;
        int i4;
        long j5;
        Od.a aVar = Od.a.alpha;
        int i5 = this.f3412t;
        if (i5 != 0) {
            if (i5 == 1) {
                int i10 = this.yellow;
                int i11 = this.white;
                long j6 = this.f3411s;
                i4 = this.teal;
                int i12 = this.silver;
                long[] jArr2 = this.red;
                Object[] objArr2 = this.purple;
                C2359i c2359i2 = (C2359i) this.f3413u;
                ResultKt.alpha(obj);
                j6 >>= 8;
                i10++;
                if (i10 < i11) {
                    if (i11 == 8) {
                        length = i12;
                        jArr = jArr2;
                        objArr = objArr2;
                        c2359i = c2359i2;
                        if (i4 != length) {
                            i4++;
                            j5 = jArr[i4];
                            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                c2359i2 = c2359i;
                                i10 = 0;
                                jArr2 = jArr;
                                i12 = length;
                                i11 = 8 - ((~(i4 - length)) >>> 31);
                                objArr2 = objArr;
                                j6 = j5;
                                if (i10 < i11) {
                                    if ((255 & j6) < 128) {
                                        Object obj2 = objArr2[(i4 << 3) + i10];
                                        this.f3413u = c2359i2;
                                        this.purple = objArr2;
                                        this.red = jArr2;
                                        this.silver = i12;
                                        this.teal = i4;
                                        this.f3411s = j6;
                                        this.white = i11;
                                        this.yellow = i10;
                                        this.f3412t = 1;
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
            c2359i = (C2359i) this.f3413u;
            al alVar = (al) this.f3414v.purple;
            objArr = alVar.charlie;
            jArr = alVar.alpha;
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
