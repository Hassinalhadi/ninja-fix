package com.checkout.components.core.common.components;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/checkout/components/core/common/components/LoggingConstants;", "", "ServiceLoader", "Apm", "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LoggingConstants {
    public static final int $stable = 0;

    @NotNull
    public static final LoggingConstants INSTANCE = new LoggingConstants();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/checkout/components/core/common/components/LoggingConstants$Apm;", "", "", "SUBMITTED_RESERVED_KEY", "Ljava/lang/String;", "SUBMITTED_RESERVED_KEY_NAME", "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Apm {
        public static final int $stable = 0;

        @NotNull
        public static final Apm INSTANCE = new Apm();

        @NotNull
        public static final String SUBMITTED_RESERVED_KEY = "apm_submitted_reserved_key";

        @NotNull
        public static final String SUBMITTED_RESERVED_KEY_NAME = "ApmSubmittedReservedKey";

        private Apm() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/checkout/components/core/common/components/LoggingConstants$ServiceLoader;", "", "", "NAME", "Ljava/lang/String;", "HAS_NEXT_THREW", "COMPONENT_FAILED_TO_LOAD", "COMPONENT_ALREADY_REGISTERED", "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class ServiceLoader {
        public static final int $stable = 0;

        @NotNull
        public static final String COMPONENT_ALREADY_REGISTERED = "component_already_registered";

        @NotNull
        public static final String COMPONENT_FAILED_TO_LOAD = "component_failed_to_load";

        @NotNull
        public static final String HAS_NEXT_THREW = "service_loader_has_next_threw";

        @NotNull
        public static final ServiceLoader INSTANCE = new ServiceLoader();

        @NotNull
        public static final String NAME = "ServiceLoaderError";

        private ServiceLoader() {
        }
    }

    private LoggingConstants() {
    }
}
