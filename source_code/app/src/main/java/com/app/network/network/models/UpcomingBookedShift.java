package com.app.network.network.models;

import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/app/network/network/models/UpcomingBookedShift;", "Ljava/io/Serializable;", "<init>", "()V", "shiftId", "", "getShiftId", "()Ljava/lang/Long;", "setShiftId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "shiftStartAt", "", "getShiftStartAt", "()Ljava/lang/String;", "setShiftStartAt", "(Ljava/lang/String;)V", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UpcomingBookedShift implements Serializable {

    @Nullable
    private Long shiftId;

    @Nullable
    private String shiftStartAt;

    @Nullable
    public final Long getShiftId() {
        return this.shiftId;
    }

    @Nullable
    public final String getShiftStartAt() {
        return this.shiftStartAt;
    }

    public final void setShiftId(@Nullable Long l10) {
        this.shiftId = l10;
    }

    public final void setShiftStartAt(@Nullable String str) {
        this.shiftStartAt = str;
    }
}
