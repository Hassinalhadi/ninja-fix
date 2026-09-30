package com.checkout.components.core.utils.extension;

import kotlin.Metadata;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/checkout/components/core/utils/extension/ApiBaseUrlOverrideProvider;", "", "", "get", "()Ljava/lang/String;", "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ApiBaseUrlOverrideProvider {
    public static final int $stable = 0;

    @NotNull
    public static final ApiBaseUrlOverrideProvider INSTANCE = new ApiBaseUrlOverrideProvider();

    private ApiBaseUrlOverrideProvider() {
    }

    @Nullable
    public static final String get() {
        String property = System.getProperty(ApiBaseUrlOverrideProviderKt.API_BASE_URL_OVERRIDE_PROPERTY);
        if (property != null) {
            if (StringsKt.gray(property)) {
                property = null;
            }
            if (property != null) {
                return StringsKt.b(property).toString();
            }
        }
        return null;
    }
}
