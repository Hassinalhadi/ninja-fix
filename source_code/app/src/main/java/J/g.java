package J;

import Xd.l;
import bv.am;
import kotlin.ResultKt;
import kotlin.Unit;
import pf.C2359i;

/* loaded from: classes3.dex */
public final class g extends Pd.h implements l {
    public Object[] purple;
    public long[] red;

    /* renamed from: s, reason: collision with root package name */
    public long f1624s;
    public int silver;

    /* renamed from: t, reason: collision with root package name */
    public int f1625t;
    public int teal;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f1626u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ h f1627v;
    public int white;
    public int yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, Nd.c cVar) {
        super(2, cVar);
        this.f1627v = hVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        g gVar = new g(this.f1627v, cVar);
        gVar.f1626u = obj;
        return gVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((C2359i) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0064  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004f -> B:14:0x0093). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0051 -> B:6:0x0062). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x006b -> B:5:0x008a). Please report as a decompilation issue!!! */
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
        int i5 = this.f1625t;
        if (i5 != 0) {
            if (i5 == 1) {
                int i10 = this.yellow;
                int i11 = this.white;
                long j6 = this.f1624s;
                i4 = this.teal;
                int i12 = this.silver;
                long[] jArr2 = this.red;
                Object[] objArr2 = this.purple;
                C2359i c2359i2 = (C2359i) this.f1626u;
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
                                        this.f1626u = c2359i2;
                                        this.purple = objArr2;
                                        this.red = jArr2;
                                        this.silver = i12;
                                        this.teal = i4;
                                        this.f1624s = j6;
                                        this.white = i11;
                                        this.yellow = i10;
                                        this.f1625t = 1;
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
            c2359i = (C2359i) this.f1626u;
            am amVar = this.f1627v.alpha;
            objArr = amVar.bravo;
            jArr = amVar.alpha;
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
