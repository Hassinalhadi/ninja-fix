package Id;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.ArraysKt;
import td.e;

/* loaded from: classes2.dex */
public final class a extends c {
    public final /* synthetic */ int white;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i4, int i5) {
        super(i4);
        this.white = i5;
    }

    @Override // Id.c
    public Object charlie(Object obj) {
        switch (this.white) {
            case 1:
                td.c cVar = (td.c) obj;
                ArrayList arrayList = cVar.alpha;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    e.alpha.s((int[]) it.next());
                }
                arrayList.clear();
                return cVar;
            case 2:
                int[] iArr = (int[]) obj;
                ArraysKt.crimson(-1, iArr);
                return iArr;
            default:
                return obj;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [td.c, java.lang.Object] */
    @Override // Id.c
    public final Object echo() {
        switch (this.white) {
            case 0:
                return new byte[4096];
            case 1:
                ?? obj = new Object();
                obj.alpha = new ArrayList();
                return obj;
            case 2:
                int[] iArr = new int[768];
                for (int i4 = 0; i4 < 768; i4++) {
                    iArr[i4] = -1;
                }
                return iArr;
            default:
                return new char[2048];
        }
    }
}
