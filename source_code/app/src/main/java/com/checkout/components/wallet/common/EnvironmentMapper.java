package com.checkout.components.wallet.common;

import com.checkout.components.interfaces.Environment;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/checkout/components/wallet/common/EnvironmentMapper;", "", "Lcom/checkout/components/interfaces/Environment;", "environment", "", "mapToWalletEnvironment$wallet_standardRelease", "(Lcom/checkout/components/interfaces/Environment;)I", "mapToWalletEnvironment", "wallet_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EnvironmentMapper {
    public static final int $stable = 0;
    public static final EnvironmentMapper INSTANCE = new EnvironmentMapper();

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Environment.values().length];
            try {
                iArr[Environment.SANDBOX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Environment.PRODUCTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private EnvironmentMapper() {
    }

    public final int mapToWalletEnvironment$wallet_standardRelease(Environment environment) {
        Intrinsics.echo(environment, "environment");
        int i4 = WhenMappings.$EnumSwitchMapping$0[environment.ordinal()];
        if (i4 != 1) {
            if (i4 == 2) {
                return 1;
            }
            throw new NoWhenBranchMatchedException();
        }
        return 3;
    }
}
