package com.checkout.components.interfaces.model;

import com.checkout.components.interfaces.annotations.CkoPublicApi;
import com.checkout.components.interfaces.component.AddressConfiguration;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0006\u0007R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0003\b\t\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lcom/checkout/components/interfaces/model/ComponentName;", "", "value", "", "getValue", "()Ljava/lang/String;", "Flow", "Address", "Lcom/checkout/components/interfaces/model/ComponentName$Flow;", "Lcom/checkout/components/interfaces/model/PaymentMethodName;", "Lcom/checkout/components/interfaces/model/StandaloneComponentName;", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@CkoPublicApi
/* loaded from: classes3.dex */
public interface ComponentName {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/checkout/components/interfaces/model/ComponentName$Address;", "Lcom/checkout/components/interfaces/model/StandaloneComponentName;", "Lcom/checkout/components/interfaces/component/AddressConfiguration;", "configuration", "<init>", "(Lcom/checkout/components/interfaces/component/AddressConfiguration;)V", "component1", "()Lcom/checkout/components/interfaces/component/AddressConfiguration;", Constants.COPY_TYPE, "(Lcom/checkout/components/interfaces/component/AddressConfiguration;)Lcom/checkout/components/interfaces/model/ComponentName$Address;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Lcom/checkout/components/interfaces/component/AddressConfiguration;", "getConfiguration", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class Address extends StandaloneComponentName {
        public static final int $stable = 8;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final AddressConfiguration configuration;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Address(@NotNull AddressConfiguration configuration) {
            super("address", configuration, null);
            Intrinsics.echo(configuration, "configuration");
            this.configuration = configuration;
        }

        public static Address copy$default(Address address, AddressConfiguration configuration, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                configuration = address.configuration;
            }
            address.getClass();
            Intrinsics.echo(configuration, "configuration");
            return new Address(configuration);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final AddressConfiguration getConfiguration() {
            return this.configuration;
        }

        @NotNull
        public final Address copy(@NotNull AddressConfiguration configuration) {
            Intrinsics.echo(configuration, "configuration");
            return new Address(configuration);
        }

        public final boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Address) && Intrinsics.areEqual(this.configuration, ((Address) other).configuration);
        }

        @NotNull
        public final AddressConfiguration getConfiguration() {
            return this.configuration;
        }

        public final int hashCode() {
            return this.configuration.hashCode();
        }

        @NotNull
        public final String toString() {
            return "Address(configuration=" + this.configuration + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bÇ\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0004¨\u0006\u0010"}, d2 = {"Lcom/checkout/components/interfaces/model/ComponentName$Flow;", "Lcom/checkout/components/interfaces/model/ComponentName;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "value", "Ljava/lang/String;", "getValue", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class Flow implements ComponentName {
        public static final int $stable = 0;

        @NotNull
        public static final Flow INSTANCE = new Flow();

        private Flow() {
        }

        public final boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Flow);
        }

        @Override // com.checkout.components.interfaces.model.ComponentName
        @NotNull
        public final String getValue() {
            return "flow";
        }

        public final int hashCode() {
            return 1029944272;
        }

        @NotNull
        public final String toString() {
            return "Flow";
        }
    }

    @NotNull
    String getValue();
}
