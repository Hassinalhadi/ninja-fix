package s0;

import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class S implements Comparator {
    public static final S purple = new S(0);
    public final /* synthetic */ int alpha;

    public /* synthetic */ S(int i4) {
        this.alpha = i4;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.alpha) {
            case 0:
                al alVar = (al) obj;
                al alVar2 = (al) obj2;
                int golf = Intrinsics.golf(alVar2.f13289h, alVar.f13289h);
                if (golf == 0) {
                    return Intrinsics.golf(alVar.hashCode(), alVar2.hashCode());
                }
                return golf;
            default:
                al alVar3 = (al) obj;
                al alVar4 = (al) obj2;
                int golf2 = Intrinsics.golf(alVar3.f13289h, alVar4.f13289h);
                if (golf2 == 0) {
                    return Intrinsics.golf(alVar3.hashCode(), alVar4.hashCode());
                }
                return golf2;
        }
    }
}
