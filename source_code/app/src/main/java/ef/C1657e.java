package ef;

import java.util.Collection;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: ef.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1657e extends Lambda implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ C1659g purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1657e(C1659g c1659g, int i4) {
        super(0);
        this.alpha = i4;
        this.purple = c1659g;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.alpha) {
            case 0:
                Xe.f fVar = Xe.f.mike;
                Xe.n.alpha.getClass();
                return this.purple.india(fVar, Xe.l.bravo);
            default:
                C1659g c1659g = this.purple;
                c1659g.golf.getClass();
                C1661i classDescriptor = c1659g.juliet;
                Intrinsics.echo(classDescriptor, "classDescriptor");
                Collection lima = ((kotlin.reflect.jvm.internal.impl.types.i) classDescriptor.tango()).lima();
                Intrinsics.delta(lima, "classDescriptor.typeConstructor.supertypes");
                return lima;
        }
    }
}
