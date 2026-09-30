package kotlin.io;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import q0.AbstractC2366B;
import q0.AbstractC2367C;

/* loaded from: classes2.dex */
public final /* synthetic */ class k implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ ArrayList purple;

    public /* synthetic */ k(int i4, ArrayList arrayList) {
        this.alpha = i4;
        this.purple = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.alpha) {
            case 0:
                String it = (String) obj;
                Intrinsics.echo(it, "it");
                this.purple.add(it);
                return Unit.INSTANCE;
            case 1:
                AbstractC2366B abstractC2366B = (AbstractC2366B) obj;
                ArrayList arrayList = this.purple;
                int size = arrayList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    AbstractC2366B.juliet(abstractC2366B, (AbstractC2367C) arrayList.get(i4), 0, 0);
                }
                return Unit.INSTANCE;
            default:
                AbstractC2366B abstractC2366B2 = (AbstractC2366B) obj;
                ArrayList arrayList2 = this.purple;
                int size2 = arrayList2.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    AbstractC2366B.hotel(abstractC2366B2, (AbstractC2367C) arrayList2.get(i5), 0, 0);
                }
                return Unit.INSTANCE;
        }
    }
}
