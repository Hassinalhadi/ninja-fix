package com.checkout.components.core.common.components;

import N4.a;
import Xd.l;
import Xd.n;
import com.checkout.components.core.C0913c;
import com.checkout.components.core.common.components.LoggingConstants;
import com.checkout.components.core.network.adapter.ApmRequestJsonAdapter;
import com.checkout.components.core.risk.RiskManager;
import com.checkout.components.interfaces.api.PaymentMethodComponent;
import com.checkout.components.interfaces.component.ApmSubmitHandler;
import com.checkout.components.interfaces.component.ComponentCallback;
import com.checkout.components.interfaces.insight.Logger;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.t;
import kotlin.collections.y;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vf.ab;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u0005\b\u0001\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00050\u0001BW\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012.\u0010\u0013\u001a*\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000e¢\u0006\u0004\b\u0014\u0010\u0015J&\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00022\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J7\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00120\u001b2\u0006\u0010\u001a\u001a\u00020\f2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00120\u001bH\u0001¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lcom/checkout/components/core/common/components/ApmSubmitHandlerFactory;", "Lkotlin/Function2;", "Lcom/checkout/components/interfaces/component/ComponentCallback;", "Lkotlin/Function0;", "Lcom/checkout/components/interfaces/api/PaymentMethodComponent;", "Lcom/checkout/components/interfaces/component/ApmSubmitHandler;", "Lcom/checkout/components/interfaces/insight/Logger;", "logger", "Lvf/ab;", "networkScope", "Lcom/checkout/components/core/risk/RiskManager;", "riskManager", "", "effectiveAppIdentifier", "Lkotlin/Function4;", "Lcom/checkout/components/interfaces/model/PayRequestPayload;", "LNd/c;", "", "", "submitPayment", "<init>", "(Lcom/checkout/components/interfaces/insight/Logger;Lvf/ab;Lcom/checkout/components/core/risk/RiskManager;Ljava/lang/String;LXd/n;)V", "componentCallback", "getComponent", "invoke", "(Lcom/checkout/components/interfaces/component/ComponentCallback;Lkotlin/jvm/functions/Function0;)Lcom/checkout/components/interfaces/component/ApmSubmitHandler;", "apmType", "", "fields", "validateAndRemoveReservedKeys$core_standardRelease", "(Ljava/lang/String;Ljava/util/Map;)Ljava/util/Map;", "validateAndRemoveReservedKeys", "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ApmSubmitHandlerFactory implements l {
    public static final int $stable = 8;

    /* renamed from: a */
    private final Logger f4666a;

    /* renamed from: b */
    private final ab f4667b;

    /* renamed from: c */
    private final RiskManager f4668c;

    /* renamed from: d */
    private final String f4669d;
    private final n e;

    public ApmSubmitHandlerFactory(@NotNull Logger logger, @NotNull ab networkScope, @NotNull RiskManager riskManager, @NotNull String effectiveAppIdentifier, @NotNull n submitPayment) {
        Intrinsics.echo(logger, "logger");
        Intrinsics.echo(networkScope, "networkScope");
        Intrinsics.echo(riskManager, "riskManager");
        Intrinsics.echo(effectiveAppIdentifier, "effectiveAppIdentifier");
        Intrinsics.echo(submitPayment, "submitPayment");
        this.f4666a = logger;
        this.f4667b = networkScope;
        this.f4668c = riskManager;
        this.f4669d = effectiveAppIdentifier;
        this.e = submitPayment;
    }

    public static final /* synthetic */ String access$getEffectiveAppIdentifier$p(ApmSubmitHandlerFactory apmSubmitHandlerFactory) {
        return apmSubmitHandlerFactory.f4669d;
    }

    public static final /* synthetic */ RiskManager access$getRiskManager$p(ApmSubmitHandlerFactory apmSubmitHandlerFactory) {
        return apmSubmitHandlerFactory.f4668c;
    }

    public static final /* synthetic */ n access$getSubmitPayment$p(ApmSubmitHandlerFactory apmSubmitHandlerFactory) {
        return apmSubmitHandlerFactory.e;
    }

    @NotNull
    public final Map<String, Object> validateAndRemoveReservedKeys$core_standardRelease(@NotNull String apmType, @NotNull Map<String, ? extends Object> fields) {
        Intrinsics.echo(apmType, "apmType");
        Intrinsics.echo(fields, "fields");
        Set<String> keySet = fields.keySet();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : keySet) {
            ApmRequestJsonAdapter.INSTANCE.getClass();
            Set set = ApmRequestJsonAdapter.f4838a;
            String lowerCase = ((String) obj).toLowerCase(Locale.ROOT);
            Intrinsics.delta(lowerCase, "toLowerCase(...)");
            if (set.contains(lowerCase)) {
                linkedHashSet.add(obj);
            }
        }
        List o5 = CollectionsKt.o(linkedHashSet);
        if (o5.isEmpty()) {
            return fields;
        }
        ApmRequestJsonAdapter.INSTANCE.getClass();
        a.bravo(this.f4666a, LoggingConstants.Apm.SUBMITTED_RESERVED_KEY, LoggingConstants.Apm.SUBMITTED_RESERVED_KEY_NAME, "APM '" + apmType + "' submitted reserved key(s): " + o5 + ". Reserved keys " + ApmRequestJsonAdapter.f4838a + " are owned by the SDK. In release builds these keys are removed before submission.", null, true, 8, null);
        LinkedHashMap amber = y.amber(fields);
        Set keySet2 = amber.keySet();
        Intrinsics.echo(keySet2, "<this>");
        keySet2.removeAll(o5);
        int size = amber.size();
        if (size != 0) {
            if (size != 1) {
                return amber;
            }
            return y.azure(amber);
        }
        return t.alpha;
    }

    @Override // Xd.l
    @NotNull
    public final ApmSubmitHandler invoke(@NotNull ComponentCallback componentCallback, @NotNull Function0<? extends PaymentMethodComponent> getComponent) {
        Intrinsics.echo(componentCallback, "componentCallback");
        Intrinsics.echo(getComponent, "getComponent");
        return new C0913c(getComponent, this, componentCallback);
    }
}
