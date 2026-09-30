package com.checkout.components.core.ui;

import Cb.s;
import androidx.annotation.Keep;
import com.checkout.components.core.ui.model.FlowComponentConfig;
import com.clevertap.android.sdk.Constants;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 \t2\u00020\u0001:\u0001\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\b¨\u0006\n"}, d2 = {"Lcom/checkout/components/core/ui/FlowComponentFactory;", "", "<init>", "()V", "create", "Lcom/checkout/components/core/ui/FlowComponent;", Constants.KEY_CONFIG, "Lcom/checkout/components/core/ui/model/FlowComponentConfig;", "create$core_standardRelease", "Companion", "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FlowComponentFactory {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<FlowComponentFactory> INSTANCE$delegate = LazyKt.lazy(new s(27));

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\u0003\u0018\u00002\u00020\u0001R\u001b\u0010\u0007\u001a\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/checkout/components/core/ui/FlowComponentFactory$Companion;", "", "Lcom/checkout/components/core/ui/FlowComponentFactory;", "INSTANCE$delegate", "Lkotlin/Lazy;", "getINSTANCE", "()Lcom/checkout/components/core/ui/FlowComponentFactory;", "INSTANCE", "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NotNull
        public final FlowComponentFactory getINSTANCE() {
            return (FlowComponentFactory) FlowComponentFactory.INSTANCE$delegate.getValue();
        }
    }

    private FlowComponentFactory() {
    }

    public static final FlowComponentFactory INSTANCE_delegate$lambda$0() {
        return new FlowComponentFactory();
    }

    @NotNull
    public final FlowComponent create$core_standardRelease(@NotNull FlowComponentConfig r22) {
        Intrinsics.echo(r22, "config");
        return new FlowComponent(r22);
    }
}
