package com.checkout.components.core.network.adapter;

import com.checkout.components.core.network.model.response.ErrorResponse;
import com.squareup.moshi.FromJson;
import com.squareup.moshi.ToJson;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.y;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007H\u0007J\u001e\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0007¨\u0006\u000b"}, d2 = {"Lcom/checkout/components/core/network/adapter/ErrorResponseAdapter;", "", "<init>", "()V", "fromJson", "Lcom/checkout/components/core/network/model/response/ErrorResponse;", "json", "", "", "toJson", "errorResponse", "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ErrorResponseAdapter {
    public static final int $stable = 0;

    @FromJson
    @NotNull
    public final ErrorResponse fromJson(@NotNull Map<String, ? extends Object> json) {
        String str;
        String str2;
        List list;
        Intrinsics.echo(json, "json");
        Object obj = json.get("request_id");
        ArrayList arrayList = null;
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        Object obj2 = json.get("error_type");
        if (obj2 instanceof String) {
            str2 = (String) obj2;
        } else {
            str2 = null;
        }
        Object obj3 = json.get("error_codes");
        if (obj3 instanceof List) {
            list = (List) obj3;
        } else {
            list = null;
        }
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj4 : list) {
                if (obj4 instanceof String) {
                    arrayList.add(obj4);
                }
            }
        }
        return new ErrorResponse(str, str2, arrayList);
    }

    @ToJson
    @NotNull
    public final Map<String, Object> toJson(@NotNull ErrorResponse errorResponse) {
        Intrinsics.echo(errorResponse, "errorResponse");
        return y.sierra(new Pair("request_id", errorResponse.getRequestId()), new Pair("error_type", errorResponse.getErrorType()), new Pair("error_codes", errorResponse.getErrorCodes()));
    }
}
