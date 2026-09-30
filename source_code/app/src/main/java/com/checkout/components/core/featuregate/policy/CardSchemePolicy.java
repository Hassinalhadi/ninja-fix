package com.checkout.components.core.featuregate.policy;

import B2.q;
import com.checkout.components.core.featuregate.guard.JaywanSchemeEnabledGuard;
import com.checkout.components.ui.model.CardScheme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.y;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/checkout/components/core/featuregate/policy/CardSchemePolicy;", "", "Lcom/checkout/components/core/featuregate/guard/JaywanSchemeEnabledGuard;", "jaywanSchemeEnabledGuard", "<init>", "(Lcom/checkout/components/core/featuregate/guard/JaywanSchemeEnabledGuard;)V", "", "Lcom/checkout/components/ui/model/CardScheme;", "schemes", "filter", "(Ljava/util/List;)Ljava/util/List;", "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CardSchemePolicy {
    public static final int $stable = 8;

    /* renamed from: a */
    private final Map f4803a;

    public CardSchemePolicy(@NotNull JaywanSchemeEnabledGuard jaywanSchemeEnabledGuard) {
        Intrinsics.echo(jaywanSchemeEnabledGuard, "jaywanSchemeEnabledGuard");
        this.f4803a = y.romeo(new Pair(CardScheme.JAYWAN, new q(6, jaywanSchemeEnabledGuard)));
    }

    public static final boolean a(JaywanSchemeEnabledGuard jaywanSchemeEnabledGuard) {
        return jaywanSchemeEnabledGuard.getF4800a();
    }

    public static /* synthetic */ boolean alpha(JaywanSchemeEnabledGuard jaywanSchemeEnabledGuard) {
        return a(jaywanSchemeEnabledGuard);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final List<CardScheme> filter(@NotNull List<? extends CardScheme> schemes) {
        boolean z2;
        Intrinsics.echo(schemes, "schemes");
        if (!schemes.isEmpty()) {
            Iterator it = schemes.iterator();
            while (it.hasNext()) {
                Function0 function0 = (Function0) this.f4803a.get((CardScheme) it.next());
                if (function0 != null && !((Boolean) function0.invoke()).booleanValue()) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : schemes) {
                        Function0 function02 = (Function0) this.f4803a.get((CardScheme) obj);
                        if (function02 != null) {
                            z2 = ((Boolean) function02.invoke()).booleanValue();
                        } else {
                            z2 = true;
                        }
                        if (z2) {
                            arrayList.add(obj);
                        }
                    }
                    return arrayList;
                }
            }
        }
        return schemes;
    }
}
