package U0;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import q0.AbstractC2366B;
import q0.AbstractC2367C;

/* loaded from: classes3.dex */
public final class e extends Lambda implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ ArrayList purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i4, ArrayList arrayList) {
        super(1);
        this.alpha = i4;
        this.purple = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.alpha) {
            case 0:
                AbstractC2366B abstractC2366B = (AbstractC2366B) obj;
                ArrayList arrayList = this.purple;
                int size = arrayList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    AbstractC2366B.juliet(abstractC2366B, (AbstractC2367C) arrayList.get(i4), 0, 0);
                }
                return Unit.INSTANCE;
            case 1:
                AbstractC2366B abstractC2366B2 = (AbstractC2366B) obj;
                ArrayList arrayList2 = this.purple;
                int ivory = CollectionsKt.ivory(arrayList2);
                if (ivory >= 0) {
                    int i5 = 0;
                    while (true) {
                        AbstractC2366B.juliet(abstractC2366B2, (AbstractC2367C) arrayList2.get(i5), 0, 0);
                        if (i5 != ivory) {
                            i5++;
                        }
                    }
                }
                return Unit.INSTANCE;
            case 2:
                AbstractC2366B abstractC2366B3 = (AbstractC2366B) obj;
                ArrayList arrayList3 = this.purple;
                int size2 = arrayList3.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    AbstractC2366B.hotel(abstractC2366B3, (AbstractC2367C) arrayList3.get(i10), 0, 0);
                }
                return Unit.INSTANCE;
            default:
                AbstractC2366B abstractC2366B4 = (AbstractC2366B) obj;
                ArrayList arrayList4 = this.purple;
                int size3 = arrayList4.size();
                for (int i11 = 0; i11 < size3; i11++) {
                    AbstractC2366B.kilo(abstractC2366B4, (AbstractC2367C) arrayList4.get(i11), 0, 0);
                }
                return Unit.INSTANCE;
        }
    }
}
