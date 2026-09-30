package i;

import androidx.compose.runtime.ax;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import q0.AbstractC2366B;

/* renamed from: i.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C1866o implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ ax purple;
    public final /* synthetic */ ArrayList red;
    public final /* synthetic */ List silver;

    public /* synthetic */ C1866o(ax axVar, ArrayList arrayList, List list, boolean z2, int i4) {
        this.alpha = i4;
        this.purple = axVar;
        this.red = arrayList;
        this.silver = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AbstractC2366B abstractC2366B = (AbstractC2366B) obj;
        switch (this.alpha) {
            case 0:
                ArrayList arrayList = this.red;
                abstractC2366B.alpha = true;
                int size = arrayList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    ((C1868q) arrayList.get(i4)).juliet(abstractC2366B);
                }
                List list = this.silver;
                int size2 = list.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    ((C1868q) list.get(i5)).juliet(abstractC2366B);
                }
                abstractC2366B.alpha = false;
                this.purple.getValue();
                return Unit.INSTANCE;
            default:
                ArrayList arrayList2 = this.red;
                abstractC2366B.alpha = true;
                int size3 = arrayList2.size();
                for (int i10 = 0; i10 < size3; i10++) {
                    ((j.m) arrayList2.get(i10)).juliet(abstractC2366B);
                }
                List list2 = this.silver;
                int size4 = list2.size();
                for (int i11 = 0; i11 < size4; i11++) {
                    ((j.m) list2.get(i11)).juliet(abstractC2366B);
                }
                abstractC2366B.alpha = false;
                this.purple.getValue();
                return Unit.INSTANCE;
        }
    }
}
