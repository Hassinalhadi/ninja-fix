package com.checkout.components.core.common.components;

import N4.a;
import androidx.appcompat.widget.P0;
import av.q;
import com.checkout.components.core.common.components.LoggingConstants;
import com.checkout.components.interfaces.api.PaymentMethodComponent;
import com.checkout.components.interfaces.component.ComponentProvider;
import com.checkout.components.interfaces.component.PaymentMethodComponentFactory;
import com.checkout.components.interfaces.insight.Logger;
import com.checkout.components.kmp.rememberme.logging.LogMessages;
import com.clevertap.android.sdk.Constants;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s6.AbstractC2689j6;
import x.j;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00040\u00020\u0001B\u001b\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00040\u0002H\u0096\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/checkout/components/core/common/components/DynamicComponentFactoriesProvider;", "Lkotlin/Function0;", "", "", "Lcom/checkout/components/interfaces/component/PaymentMethodComponentFactory;", "Lcom/checkout/components/interfaces/api/PaymentMethodComponent;", "Lcom/checkout/components/interfaces/insight/Logger;", "logger", "Ljava/lang/ClassLoader;", "classLoader", "<init>", "(Lcom/checkout/components/interfaces/insight/Logger;Ljava/lang/ClassLoader;)V", "invoke", "()Ljava/util/Map;", "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DynamicComponentFactoriesProvider implements Function0<Map<String, ? extends PaymentMethodComponentFactory<? extends PaymentMethodComponent>>> {
    public static final int $stable = 8;

    /* renamed from: a, reason: collision with root package name */
    private final Logger f4670a;

    /* renamed from: b, reason: collision with root package name */
    private final ClassLoader f4671b;

    /* renamed from: c, reason: collision with root package name */
    private final Lazy f4672c;

    public DynamicComponentFactoriesProvider(@NotNull Logger logger, @Nullable ClassLoader classLoader) {
        Intrinsics.echo(logger, "logger");
        this.f4670a = logger;
        this.f4671b = classLoader;
        this.f4672c = LazyKt.lazy(new j(4, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map a(DynamicComponentFactoriesProvider dynamicComponentFactoriesProvider) {
        dynamicComponentFactoriesProvider.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ClassLoader classLoader = dynamicComponentFactoriesProvider.f4671b;
        if (classLoader == null) {
            classLoader = ComponentProvider.class.getClassLoader();
        }
        Iterator it = ServiceLoader.load(ComponentProvider.class, classLoader).iterator();
        Intrinsics.delta(it, "iterator(...)");
        while (true) {
            Boolean a6 = dynamicComponentFactoriesProvider.a(it);
            if (a6 == null || !a6.booleanValue()) {
                break;
            }
            dynamicComponentFactoriesProvider.a(it, linkedHashMap);
        }
        return linkedHashMap;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<String, ? extends PaymentMethodComponentFactory<? extends PaymentMethodComponent>> invoke() {
        return (Map) this.f4672c.getValue();
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Map<String, ? extends PaymentMethodComponentFactory<? extends PaymentMethodComponent>> invoke2() {
        return (Map) this.f4672c.getValue();
    }

    public /* synthetic */ DynamicComponentFactoriesProvider(Logger logger, ClassLoader classLoader, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(logger, (i4 & 2) != 0 ? null : classLoader);
    }

    private final Boolean a(Iterator it) {
        try {
            return Boolean.valueOf(it.hasNext());
        } catch (ServiceConfigurationError e) {
            Logger logger = this.f4670a;
            String message = e.getMessage();
            if (message == null) {
                message = LogMessages.UNKNOWN_ERROR;
            }
            a.bravo(logger, LoggingConstants.ServiceLoader.HAS_NEXT_THREW, LoggingConstants.ServiceLoader.NAME, message, AbstractC2689j6.echo(e), false, 16, null);
            return null;
        }
    }

    private final void a(Iterator it, LinkedHashMap linkedHashMap) {
        try {
            ComponentProvider componentProvider = (ComponentProvider) it.next();
            if (linkedHashMap.containsKey(componentProvider.getComponentName())) {
                a(componentProvider, linkedHashMap);
            } else {
                linkedHashMap.put(componentProvider.getComponentName(), componentProvider.getFactory());
            }
        } catch (Exception e) {
            a(e);
        } catch (ServiceConfigurationError e4) {
            a(e4);
        }
    }

    private final void a(Throwable th) {
        Throwable cause = th.getCause();
        String foxtrot = cause != null ? q.foxtrot(" | caused by ", cause.getClass().getName(), ": ", cause.getMessage()) : null;
        if (foxtrot == null) {
            foxtrot = "";
        }
        Logger logger = this.f4670a;
        String simpleName = th.getClass().getSimpleName();
        String message = th.getMessage();
        if (message == null) {
            message = LogMessages.UNKNOWN_ERROR;
        }
        a.bravo(logger, LoggingConstants.ServiceLoader.COMPONENT_FAILED_TO_LOAD, LoggingConstants.ServiceLoader.NAME, q.golf(Constants.AES_PREFIX, simpleName, "] ", message, foxtrot), AbstractC2689j6.echo(th), false, 16, null);
    }

    private final void a(ComponentProvider componentProvider, LinkedHashMap linkedHashMap) {
        Logger logger = this.f4670a;
        String componentName = componentProvider.getComponentName();
        PaymentMethodComponentFactory paymentMethodComponentFactory = (PaymentMethodComponentFactory) linkedHashMap.get(componentProvider.getComponentName());
        a.bravo(logger, LoggingConstants.ServiceLoader.COMPONENT_ALREADY_REGISTERED, LoggingConstants.ServiceLoader.NAME, P0.gold(q.india("Duplicate ComponentProvider for '", componentName, "': ", paymentMethodComponentFactory != null ? paymentMethodComponentFactory.getClass().getName() : null, " is being overridden by "), componentProvider.getClass().getName(), "."), null, true, 8, null);
    }
}
