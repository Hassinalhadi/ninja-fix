package com.app.network.network.models;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"mappedStatus", "Lcom/app/network/network/models/UserIdentityStatus;", "Lcom/app/network/network/models/UserIdentityRequestResponse;", "network_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UserIdentityStatusKt {
    @NotNull
    public static final UserIdentityStatus mappedStatus(@NotNull UserIdentityRequestResponse userIdentityRequestResponse) {
        String str;
        Intrinsics.echo(userIdentityRequestResponse, "<this>");
        String status = userIdentityRequestResponse.getStatus();
        if (status != null) {
            str = status.toUpperCase(Locale.ROOT);
            Intrinsics.delta(str, "toUpperCase(...)");
        } else {
            str = null;
        }
        if (str != null) {
            switch (str.hashCode()) {
                case -1757359925:
                    if (str.equals("INITIATED")) {
                        return UserIdentityStatus.INITIATED;
                    }
                    break;
                case -591252731:
                    if (str.equals("EXPIRED")) {
                        return UserIdentityStatus.EXPIRED;
                    }
                    break;
                case 174130302:
                    if (str.equals("REJECTED")) {
                        return UserIdentityStatus.REJECTED;
                    }
                    break;
                case 1967871671:
                    if (str.equals("APPROVED")) {
                        return UserIdentityStatus.APPROVED;
                    }
                    break;
                case 2066319421:
                    if (str.equals("FAILED")) {
                        return UserIdentityStatus.FAILED;
                    }
                    break;
            }
        }
        return UserIdentityStatus.UNKNOWN;
    }
}
