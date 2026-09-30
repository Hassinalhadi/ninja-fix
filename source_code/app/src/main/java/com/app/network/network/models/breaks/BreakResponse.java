package com.app.network.network.models.breaks;

import com.clevertap.android.sdk.Constants;
import com.google.android.material.datepicker.j;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/app/network/network/models/breaks/BreakResponse;", "Ljava/io/Serializable;", "remainingBreakMillis", "", "<init>", "(J)V", "getRemainingBreakMillis", "()J", "component1", Constants.COPY_TYPE, "equals", "", "other", "", "hashCode", "", "toString", "", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BreakResponse implements Serializable {
    private final long remainingBreakMillis;

    public BreakResponse(long j5) {
        this.remainingBreakMillis = j5;
    }

    public static /* synthetic */ BreakResponse copy$default(BreakResponse breakResponse, long j5, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            j5 = breakResponse.remainingBreakMillis;
        }
        return breakResponse.copy(j5);
    }

    /* renamed from: component1, reason: from getter */
    public final long getRemainingBreakMillis() {
        return this.remainingBreakMillis;
    }

    @NotNull
    public final BreakResponse copy(long remainingBreakMillis) {
        return new BreakResponse(remainingBreakMillis);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BreakResponse) && this.remainingBreakMillis == ((BreakResponse) other).remainingBreakMillis;
    }

    public final long getRemainingBreakMillis() {
        return this.remainingBreakMillis;
    }

    public int hashCode() {
        long j5 = this.remainingBreakMillis;
        return (int) (j5 ^ (j5 >>> 32));
    }

    @NotNull
    public String toString() {
        return j.kilo("BreakResponse(remainingBreakMillis=", this.remainingBreakMillis, ")");
    }
}
