package com.app.network.network.response;

import P8.c;
import androidx.annotation.Keep;
import com.checkout.components.redirecthandler.utils.RedirectionConstants;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.db.Column;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\b\u0017\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR$\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u00020\u00148\u0006X\u0087D¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u00020\u00148\u0006X\u0087D¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u00148\u0006X\u0087D¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00148\u0006X\u0087D¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016¨\u0006\u001d"}, d2 = {"Lcom/app/network/network/response/DataResponse;", "T", "", "<init>", "()V", RedirectionConstants.REDIRECT_SUCCESS_VALUE, "", "getSuccess", "()Z", Constants.KEY_MESSAGE, "", "getMessage", "()Ljava/lang/String;", "items", "", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "totalElements", "", "getTotalElements", "()I", "pageCount", "getPageCount", "perPage", "getPerPage", "page", "getPage", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public class DataResponse<T> {

    @c("page")
    private final int page;

    @c("pageCount")
    private final int pageCount;

    @c("perPage")
    private final int perPage;

    @c(RedirectionConstants.REDIRECT_SUCCESS_VALUE)
    private final boolean success;

    @c("totalElements")
    private final int totalElements;

    @c(Constants.KEY_MESSAGE)
    @NotNull
    private final String message = "";

    @c(Column.DATA)
    @NotNull
    private List<? extends T> items = new ArrayList();

    @NotNull
    public final List<T> getItems() {
        return this.items;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    public final int getPage() {
        return this.page;
    }

    public final int getPageCount() {
        return this.pageCount;
    }

    public final int getPerPage() {
        return this.perPage;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public final int getTotalElements() {
        return this.totalElements;
    }

    public final void setItems(@NotNull List<? extends T> list) {
        Intrinsics.echo(list, "<set-?>");
        this.items = list;
    }
}
