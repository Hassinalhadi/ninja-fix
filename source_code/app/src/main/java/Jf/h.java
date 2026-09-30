package Jf;

import ge.w;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final /* synthetic */ class h implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ ArrayList purple;

    public /* synthetic */ h(int i4, ArrayList arrayList) {
        this.alpha = i4;
        this.purple = arrayList;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i4;
        int ivory;
        switch (this.alpha) {
            case 0:
                return ((w) this.purple.get(0)).foxtrot();
            default:
                ArrayList arrayList = this.purple;
                if (arrayList.isEmpty()) {
                    return CollectionsKt.emptyList();
                }
                if (((CharSequence) CollectionsKt.gold(arrayList)).length() == 0 && arrayList.size() > 1) {
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                if (((CharSequence) CollectionsKt.ochre(arrayList)).length() == 0) {
                    ivory = CollectionsKt.ivory(arrayList);
                } else {
                    ivory = 1 + CollectionsKt.ivory(arrayList);
                }
                return arrayList.subList(i4, ivory);
        }
    }
}
