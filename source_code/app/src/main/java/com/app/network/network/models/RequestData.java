package com.app.network.network.models;

import P8.c;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001a\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/app/network/network/models/RequestData;", "", "random", "", "<init>", "(Ljava/lang/Integer;)V", "getRandom", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", Constants.COPY_TYPE, "(Ljava/lang/Integer;)Lcom/app/network/network/models/RequestData;", "equals", "", "other", "hashCode", "toString", "", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RequestData {

    @c("random")
    @Nullable
    private final Integer random;

    public RequestData(@Nullable Integer num) {
        this.random = num;
    }

    public static /* synthetic */ RequestData copy$default(RequestData requestData, Integer num, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            num = requestData.random;
        }
        return requestData.copy(num);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Integer getRandom() {
        return this.random;
    }

    @NotNull
    public final RequestData copy(@Nullable Integer random) {
        return new RequestData(random);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RequestData) && Intrinsics.areEqual(this.random, ((RequestData) other).random);
    }

    @Nullable
    public final Integer getRandom() {
        return this.random;
    }

    public int hashCode() {
        Integer num = this.random;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    @NotNull
    public String toString() {
        return "RequestData(random=" + this.random + ")";
    }
}
