package Pe;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.types.as;

/* loaded from: classes2.dex */
public final class p extends Lambda implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ t purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(t tVar, int i4) {
        super(1);
        this.alpha = i4;
        this.purple = tVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.alpha) {
            case 0:
                as it = (as) obj;
                Intrinsics.echo(it, "it");
                if (it.charlie()) {
                    return "*";
                }
                kotlin.reflect.jvm.internal.impl.types.y bravo = it.bravo();
                Intrinsics.delta(bravo, "it.type");
                String orange = this.purple.orange(bravo);
                if (it.alpha() == 1) {
                    return orange;
                }
                return com.google.android.material.datepicker.j.whiskey(it.alpha()) + ' ' + orange;
            case 1:
                Se.g it2 = (Se.g) obj;
                Intrinsics.echo(it2, "it");
                return this.purple.azure(it2);
            default:
                kotlin.reflect.jvm.internal.impl.types.y it3 = (kotlin.reflect.jvm.internal.impl.types.y) obj;
                Intrinsics.delta(it3, "it");
                return this.purple.orange(it3);
        }
    }
}
