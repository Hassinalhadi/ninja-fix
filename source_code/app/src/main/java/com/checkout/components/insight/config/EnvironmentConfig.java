package com.checkout.components.insight.config;

import com.checkout.components.insight.common.Constants;
import com.checkout.components.interfaces.Environment;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/checkout/components/insight/config/EnvironmentConfig;", "", "Lcom/checkout/components/interfaces/Environment;", "environment", "<init>", "(Lcom/checkout/components/interfaces/Environment;)V", "", "getLogEndpoint", "()Ljava/lang/String;", "insight_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EnvironmentConfig {

    /* renamed from: a, reason: collision with root package name */
    private final Environment f5132a;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Environment.values().length];
            try {
                iArr[Environment.PRODUCTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Environment.SANDBOX.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public EnvironmentConfig(Environment environment) {
        Intrinsics.echo(environment, "environment");
        this.f5132a = environment;
    }

    public final String getLogEndpoint() {
        int i4 = WhenMappings.$EnumSwitchMapping$0[this.f5132a.ordinal()];
        if (i4 != 1) {
            if (i4 == 2) {
                return Constants.INSIGHT_API_URL_SANDBOX;
            }
            throw new NoWhenBranchMatchedException();
        }
        return Constants.INSIGHT_API_URL_PRODUCTION;
    }
}
