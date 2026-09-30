package Se;

import Lb.C;
import com.clevertap.android.sdk.Constants;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.ab;
import kotlin.reflect.jvm.internal.impl.types.al;
import kotlin.reflect.jvm.internal.impl.types.ap;
import me.AbstractC2120h;
import pe.InterfaceC2332h;

/* loaded from: classes2.dex */
public final class m implements ap {
    public final LinkedHashSet alpha;
    public final Lazy bravo;

    public m(LinkedHashSet linkedHashSet) {
        al.purple.getClass();
        al attributes = al.red;
        int i4 = ab.alpha;
        Intrinsics.echo(attributes, "attributes");
        ab.delta(hf.i.alpha(2, true, "unknown integer literal type"), CollectionsKt.emptyList(), attributes, this, false);
        this.bravo = LazyKt.lazy(new C(12, this));
        this.alpha = linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ap
    public final List getParameters() {
        return CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ap
    public final AbstractC2120h juliet() {
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ap
    public final InterfaceC2332h kilo() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ap
    public final Collection lima() {
        return (List) this.bravo.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ap
    public final boolean mike() {
        return false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntegerLiteralType");
        sb2.append(Constants.AES_PREFIX + CollectionsKt.maroon(this.alpha, Constants.SEPARATOR_COMMA, null, null, l.alpha, 30) + ']');
        return sb2.toString();
    }
}
