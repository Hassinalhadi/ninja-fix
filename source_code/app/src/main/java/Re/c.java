package Re;

import gf.C1794i;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.ab;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.as;
import kotlin.reflect.jvm.internal.impl.types.y;
import me.AbstractC2120h;
import pe.InterfaceC2332h;

/* loaded from: classes2.dex */
public final class c implements b {
    public final as alpha;
    public C1794i bravo;

    public c(as projection) {
        Intrinsics.echo(projection, "projection");
        this.alpha = projection;
        projection.alpha();
    }

    @Override // Re.b
    public final as alpha() {
        return this.alpha;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ap
    public final List getParameters() {
        return CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ap
    public final AbstractC2120h juliet() {
        AbstractC2120h juliet = this.alpha.bravo().green().juliet();
        Intrinsics.delta(juliet, "projection.type.constructor.builtIns");
        return juliet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ap
    public final /* bridge */ /* synthetic */ InterfaceC2332h kilo() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ap
    public final Collection lima() {
        y november;
        as asVar = this.alpha;
        if (asVar.alpha() == 3) {
            november = asVar.bravo();
        } else {
            november = juliet().november();
        }
        Intrinsics.delta(november, "if (projection.projectio… builtIns.nullableAnyType");
        return ab.juliet(november);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ap
    public final boolean mike() {
        return false;
    }

    public final String toString() {
        return "CapturedTypeConstructor(" + this.alpha + ')';
    }
}
