package com.checkout.components.interfaces.model;

import com.checkout.components.interfaces.component.StandaloneComponentOption;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\u0082\u0001\u0001\u000e¨\u0006\u000f"}, d2 = {"Lcom/checkout/components/interfaces/model/StandaloneComponentName;", "Lcom/checkout/components/interfaces/model/ComponentName;", "", "a", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "value", "Lcom/checkout/components/interfaces/component/StandaloneComponentOption;", "b", "Lcom/checkout/components/interfaces/component/StandaloneComponentOption;", "getOption", "()Lcom/checkout/components/interfaces/component/StandaloneComponentOption;", "option", "Lcom/checkout/components/interfaces/model/ComponentName$Address;", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class StandaloneComponentName implements ComponentName {
    public static final int $stable = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String value;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final StandaloneComponentOption option;

    public StandaloneComponentName(String str, StandaloneComponentOption standaloneComponentOption, DefaultConstructorMarker defaultConstructorMarker) {
        this.value = str;
        this.option = standaloneComponentOption;
    }

    @NotNull
    public final StandaloneComponentOption getOption() {
        return this.option;
    }

    @Override // com.checkout.components.interfaces.model.ComponentName
    @NotNull
    public final String getValue() {
        return this.value;
    }
}
