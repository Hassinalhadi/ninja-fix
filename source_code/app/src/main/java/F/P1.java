package F;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import q0.AbstractC2366B;
import q0.AbstractC2367C;
import q0.InterfaceC2380P;

/* loaded from: classes3.dex */
public final class P1 extends Lambda implements Function1 {
    public final /* synthetic */ ArrayList alpha;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.layout.a0 f1052c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2380P f1053d;
    public final /* synthetic */ int e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1054f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Integer f1055g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1056h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Integer f1057i;
    public final /* synthetic */ ArrayList purple;
    public final /* synthetic */ ArrayList red;
    public final /* synthetic */ ArrayList silver;
    public final /* synthetic */ C0121j0 teal;
    public final /* synthetic */ int white;
    public final /* synthetic */ int yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P1(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, C0121j0 c0121j0, int i4, int i5, androidx.compose.foundation.layout.a0 a0Var, InterfaceC2380P interfaceC2380P, int i10, int i11, Integer num, ArrayList arrayList5, Integer num2) {
        super(1);
        this.alpha = arrayList;
        this.purple = arrayList2;
        this.red = arrayList3;
        this.silver = arrayList4;
        this.teal = c0121j0;
        this.white = i4;
        this.yellow = i5;
        this.f1052c = a0Var;
        this.f1053d = interfaceC2380P;
        this.e = i10;
        this.f1054f = i11;
        this.f1055g = num;
        this.f1056h = arrayList5;
        this.f1057i = num2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i4;
        int i5;
        AbstractC2366B abstractC2366B = (AbstractC2366B) obj;
        ArrayList arrayList = this.alpha;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC2366B.hotel(abstractC2366B, (AbstractC2367C) arrayList.get(i10), 0, 0);
        }
        ArrayList arrayList2 = this.purple;
        int size2 = arrayList2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            AbstractC2366B.hotel(abstractC2366B, (AbstractC2367C) arrayList2.get(i11), 0, 0);
        }
        ArrayList arrayList3 = this.red;
        int size3 = arrayList3.size();
        int i12 = 0;
        while (true) {
            i4 = this.e;
            if (i12 >= size3) {
                break;
            }
            AbstractC2367C abstractC2367C = (AbstractC2367C) arrayList3.get(i12);
            int i13 = (this.white - this.yellow) / 2;
            InterfaceC2380P interfaceC2380P = this.f1053d;
            AbstractC2366B.hotel(abstractC2366B, abstractC2367C, this.f1052c.bravo(interfaceC2380P, interfaceC2380P.getLayoutDirection()) + i13, i4 - this.f1054f);
            i12++;
        }
        ArrayList arrayList4 = this.silver;
        int size4 = arrayList4.size();
        for (int i14 = 0; i14 < size4; i14++) {
            AbstractC2367C abstractC2367C2 = (AbstractC2367C) arrayList4.get(i14);
            Integer num = this.f1055g;
            if (num != null) {
                i5 = num.intValue();
            } else {
                i5 = 0;
            }
            AbstractC2366B.hotel(abstractC2366B, abstractC2367C2, 0, i4 - i5);
        }
        C0121j0 c0121j0 = this.teal;
        if (c0121j0 != null) {
            ArrayList arrayList5 = this.f1056h;
            int size5 = arrayList5.size();
            for (int i15 = 0; i15 < size5; i15++) {
                AbstractC2367C abstractC2367C3 = (AbstractC2367C) arrayList5.get(i15);
                Integer num2 = this.f1057i;
                Intrinsics.checkNotNull(num2);
                AbstractC2366B.hotel(abstractC2366B, abstractC2367C3, c0121j0.bravo, i4 - num2.intValue());
            }
        }
        return Unit.INSTANCE;
    }
}
