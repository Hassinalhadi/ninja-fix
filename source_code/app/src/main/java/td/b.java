package td;

import java.util.Iterator;
import kotlin.ResultKt;
import kotlin.Unit;
import pf.C2359i;

/* loaded from: classes2.dex */
public final class b extends Pd.h implements Xd.l {
    public Iterator purple;
    public int[] red;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c f13965s;
    public int silver;
    public int teal;
    public int white;
    public /* synthetic */ Object yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Nd.c cVar2) {
        super(2, cVar2);
        this.f13965s = cVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        b bVar = new b(this.f13965s, cVar);
        bVar.yellow = obj;
        return bVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((C2359i) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0046  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0064 -> B:5:0x0068). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0039 -> B:6:0x0043). Please report as a decompilation issue!!! */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C2359i c2359i;
        Iterator it;
        int i4;
        Od.a aVar = Od.a.alpha;
        int i5 = this.white;
        c cVar = this.f13965s;
        if (i5 != 0) {
            if (i5 == 1) {
                int i10 = this.teal;
                int i11 = this.silver;
                int[] iArr = this.red;
                Iterator it2 = this.purple;
                C2359i c2359i2 = (C2359i) this.yellow;
                ResultKt.alpha(obj);
                c2359i = c2359i2;
                i10 += 6;
                int[] iArr2 = iArr;
                int i12 = i11 + 6;
                Iterator it3 = it2;
                int[] iArr3 = iArr2;
                if (i10 < iArr3.length) {
                    it = it3;
                    i4 = i12;
                    if (!it.hasNext()) {
                        iArr3 = (int[]) it.next();
                        i12 = i4;
                        it3 = it;
                        i10 = 0;
                        if (i10 < iArr3.length) {
                            if (cVar.alpha(i12) != -1) {
                                Integer num = new Integer(i12);
                                this.yellow = c2359i;
                                this.purple = it3;
                                this.red = iArr3;
                                this.silver = i12;
                                this.teal = i10;
                                this.white = 1;
                                c2359i.bravo(this, num);
                                Od.a aVar2 = Od.a.alpha;
                                return aVar;
                            }
                            int[] iArr4 = iArr3;
                            it2 = it3;
                            i11 = i12;
                            iArr = iArr4;
                            i10 += 6;
                            int[] iArr22 = iArr;
                            int i122 = i11 + 6;
                            Iterator it32 = it2;
                            int[] iArr32 = iArr22;
                            if (i10 < iArr32.length) {
                            }
                        }
                    } else {
                        return Unit.INSTANCE;
                    }
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            c2359i = (C2359i) this.yellow;
            it = cVar.alpha.iterator();
            i4 = 0;
            if (!it.hasNext()) {
            }
        }
    }
}
