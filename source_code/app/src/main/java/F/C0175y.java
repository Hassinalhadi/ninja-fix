package F;

import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.InterfaceC0539e;
import androidx.compose.foundation.layout.InterfaceC0541g;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import q0.AbstractC2366B;
import q0.AbstractC2367C;

/* renamed from: F.y, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0175y extends Lambda implements Function1 {
    public final /* synthetic */ AbstractC2367C alpha;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0541g f1260c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1261d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int purple;
    public final /* synthetic */ AbstractC2367C red;
    public final /* synthetic */ InterfaceC0539e silver;
    public final /* synthetic */ long teal;
    public final /* synthetic */ AbstractC2367C white;
    public final /* synthetic */ q0.ar yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0175y(AbstractC2367C abstractC2367C, int i4, AbstractC2367C abstractC2367C2, InterfaceC0539e interfaceC0539e, long j5, AbstractC2367C abstractC2367C3, q0.ar arVar, InterfaceC0541g interfaceC0541g, int i5, int i10) {
        super(1);
        this.alpha = abstractC2367C;
        this.purple = i4;
        this.red = abstractC2367C2;
        this.silver = interfaceC0539e;
        this.teal = j5;
        this.white = abstractC2367C3;
        this.yellow = arVar;
        this.f1260c = interfaceC0541g;
        this.f1261d = i5;
        this.e = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int max;
        int hotel;
        AbstractC2366B abstractC2366B = (AbstractC2366B) obj;
        AbstractC2367C abstractC2367C = this.alpha;
        int i4 = abstractC2367C.purple;
        int i5 = this.purple;
        int i10 = 0;
        AbstractC2366B.juliet(abstractC2366B, abstractC2367C, 0, (i5 - i4) / 2);
        J1.e eVar = AbstractC0542h.echo;
        InterfaceC0539e interfaceC0539e = this.silver;
        boolean areEqual = Intrinsics.areEqual(interfaceC0539e, eVar);
        AbstractC2367C abstractC2367C2 = this.red;
        AbstractC2367C abstractC2367C3 = this.white;
        long j5 = this.teal;
        if (areEqual) {
            int hotel2 = Q0.a.hotel(j5);
            int i11 = abstractC2367C2.alpha;
            max = (hotel2 - i11) / 2;
            int i12 = abstractC2367C.alpha;
            if (max < i12) {
                hotel = i12 - max;
            } else if (i11 + max > Q0.a.hotel(j5) - abstractC2367C3.alpha) {
                hotel = (Q0.a.hotel(j5) - abstractC2367C3.alpha) - (abstractC2367C2.alpha + max);
            }
            max += hotel;
        } else if (Intrinsics.areEqual(interfaceC0539e, AbstractC0542h.bravo)) {
            max = (Q0.a.hotel(j5) - abstractC2367C2.alpha) - abstractC2367C3.alpha;
        } else {
            max = Math.max(this.yellow.ochre(ag.delta), abstractC2367C.alpha);
        }
        InterfaceC0541g interfaceC0541g = this.f1260c;
        if (Intrinsics.areEqual(interfaceC0541g, eVar)) {
            i10 = (i5 - abstractC2367C2.purple) / 2;
        } else if (Intrinsics.areEqual(interfaceC0541g, AbstractC0542h.delta)) {
            int i13 = this.f1261d;
            if (i13 == 0) {
                i10 = i5 - abstractC2367C2.purple;
            } else {
                int i14 = abstractC2367C2.purple;
                int i15 = i13 - (i14 - this.e);
                int i16 = i14 + i15;
                if (i16 > Q0.a.golf(j5)) {
                    i15 -= i16 - Q0.a.golf(j5);
                }
                i10 = (i5 - abstractC2367C2.purple) - Math.max(0, i15);
            }
        }
        AbstractC2366B.juliet(abstractC2366B, abstractC2367C2, max, i10);
        AbstractC2366B.juliet(abstractC2366B, abstractC2367C3, Q0.a.hotel(j5) - abstractC2367C3.alpha, (i5 - abstractC2367C3.purple) / 2);
        return Unit.INSTANCE;
    }
}
