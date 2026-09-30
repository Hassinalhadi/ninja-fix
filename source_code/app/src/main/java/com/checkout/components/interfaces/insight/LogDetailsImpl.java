package com.checkout.components.interfaces.insight;

import av.q;
import com.checkout.components.interfaces.b;
import com.checkout.components.interfaces.model.ComponentName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001d\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\r¨\u0006!"}, d2 = {"Lcom/checkout/components/interfaces/insight/LogDetailsImpl;", "Lcom/checkout/components/interfaces/insight/LogDetails;", "", "mobileSessionId", "paymentSessionId", "Lcom/checkout/components/interfaces/model/ComponentName;", com.clevertap.android.sdk.Constants.KEY_TYPE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/checkout/components/interfaces/model/ComponentName;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/checkout/components/interfaces/model/ComponentName;", com.clevertap.android.sdk.Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/String;Lcom/checkout/components/interfaces/model/ComponentName;)Lcom/checkout/components/interfaces/insight/LogDetailsImpl;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getMobileSessionId", "b", "getPaymentSessionId", "c", "Lcom/checkout/components/interfaces/model/ComponentName;", "getType", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class LogDetailsImpl implements LogDetails {
    public static final int $stable = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String mobileSessionId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String paymentSessionId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ComponentName type;

    public LogDetailsImpl(@NotNull String mobileSessionId, @NotNull String paymentSessionId, @NotNull ComponentName type) {
        Intrinsics.echo(mobileSessionId, "mobileSessionId");
        Intrinsics.echo(paymentSessionId, "paymentSessionId");
        Intrinsics.echo(type, "type");
        this.mobileSessionId = mobileSessionId;
        this.paymentSessionId = paymentSessionId;
        this.type = type;
    }

    public static /* synthetic */ LogDetailsImpl copy$default(LogDetailsImpl logDetailsImpl, String str, String str2, ComponentName componentName, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = logDetailsImpl.mobileSessionId;
        }
        if ((i4 & 2) != 0) {
            str2 = logDetailsImpl.paymentSessionId;
        }
        if ((i4 & 4) != 0) {
            componentName = logDetailsImpl.type;
        }
        return logDetailsImpl.copy(str, str2, componentName);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getMobileSessionId() {
        return this.mobileSessionId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getPaymentSessionId() {
        return this.paymentSessionId;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final ComponentName getType() {
        return this.type;
    }

    @NotNull
    public final LogDetailsImpl copy(@NotNull String mobileSessionId, @NotNull String paymentSessionId, @NotNull ComponentName type) {
        Intrinsics.echo(mobileSessionId, "mobileSessionId");
        Intrinsics.echo(paymentSessionId, "paymentSessionId");
        Intrinsics.echo(type, "type");
        return new LogDetailsImpl(mobileSessionId, paymentSessionId, type);
    }

    public final boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LogDetailsImpl)) {
            return false;
        }
        LogDetailsImpl logDetailsImpl = (LogDetailsImpl) other;
        return Intrinsics.areEqual(this.mobileSessionId, logDetailsImpl.mobileSessionId) && Intrinsics.areEqual(this.paymentSessionId, logDetailsImpl.paymentSessionId) && Intrinsics.areEqual(this.type, logDetailsImpl.type);
    }

    @Override // com.checkout.components.interfaces.insight.LogDetails
    @NotNull
    public final String getMobileSessionId() {
        return this.mobileSessionId;
    }

    @Override // com.checkout.components.interfaces.insight.LogDetails
    @NotNull
    public final String getPaymentSessionId() {
        return this.paymentSessionId;
    }

    @Override // com.checkout.components.interfaces.insight.LogDetails
    @NotNull
    public final ComponentName getType() {
        return this.type;
    }

    public final int hashCode() {
        return this.type.hashCode() + b.a(this.paymentSessionId, this.mobileSessionId.hashCode() * 31, 31);
    }

    @NotNull
    public final String toString() {
        String str = this.mobileSessionId;
        String str2 = this.paymentSessionId;
        ComponentName componentName = this.type;
        StringBuilder india = q.india("LogDetailsImpl(mobileSessionId=", str, ", paymentSessionId=", str2, ", type=");
        india.append(componentName);
        india.append(")");
        return india.toString();
    }
}
