package com.checkout.components.interfaces.api;

import com.checkout.components.interfaces.annotations.CkoPublicApi;
import com.checkout.components.interfaces.model.StandaloneComponentName;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lcom/checkout/components/interfaces/api/StandaloneComponentFactory;", "", "create", "Lcom/checkout/components/interfaces/api/StandaloneComponent;", "componentName", "Lcom/checkout/components/interfaces/model/StandaloneComponentName;", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@CkoPublicApi
/* loaded from: classes3.dex */
public interface StandaloneComponentFactory {
    @NotNull
    StandaloneComponent create(@NotNull StandaloneComponentName componentName);
}
