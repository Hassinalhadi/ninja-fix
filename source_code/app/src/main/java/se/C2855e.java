package se;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import me.AbstractC2120h;
import pe.InterfaceC2332h;

/* renamed from: se.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2855e implements kotlin.reflect.jvm.internal.impl.types.ap {
    public final /* synthetic */ ef.s alpha;

    public C2855e(ef.s sVar) {
        this.alpha = sVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ap
    public final List getParameters() {
        List list = this.alpha.f12615i;
        if (list != null) {
            return list;
        }
        Intrinsics.lima("typeConstructorParameters");
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ap
    public final AbstractC2120h juliet() {
        return Ue.e.echo(this.alpha);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ap
    public final InterfaceC2332h kilo() {
        return this.alpha;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ap
    public final Collection lima() {
        Collection lima = this.alpha.b0().green().lima();
        Intrinsics.delta(lima, "declarationDescriptor.un…pe.constructor.supertypes");
        return lima;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ap
    public final boolean mike() {
        return true;
    }

    public final String toString() {
        return "[typealias " + this.alpha.getName().bravo() + ']';
    }
}
