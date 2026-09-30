package se;

import kotlin.jvm.functions.Function1;
import xe.EnumC3339b;

/* renamed from: se.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2865o implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ C2866p purple;

    public /* synthetic */ C2865o(C2866p c2866p, int i4) {
        this.alpha = i4;
        this.purple = c2866p;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.alpha) {
            case 0:
                Ne.f fVar = (Ne.f) obj;
                C2866p c2866p = this.purple;
                if (fVar != null) {
                    return c2866p.juliet(fVar, c2866p.india().charlie(fVar, EnumC3339b.white));
                }
                c2866p.getClass();
                C2866p.hotel(8);
                throw null;
            default:
                Ne.f fVar2 = (Ne.f) obj;
                C2866p c2866p2 = this.purple;
                if (fVar2 != null) {
                    return c2866p2.juliet(fVar2, c2866p2.india().foxtrot(fVar2, EnumC3339b.white));
                }
                c2866p2.getClass();
                C2866p.hotel(4);
                throw null;
        }
    }
}
