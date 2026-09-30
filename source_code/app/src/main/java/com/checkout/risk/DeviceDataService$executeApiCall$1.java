package com.checkout.risk;

import Pd.c;
import Pd.e;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@e(c = "com.checkout.risk.DeviceDataService", f = "DeviceDataService.kt", l = {65}, m = "executeApiCall")
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DeviceDataService$executeApiCall$1<T> extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DeviceDataService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceDataService$executeApiCall$1(DeviceDataService deviceDataService, Nd.c<? super DeviceDataService$executeApiCall$1> cVar) {
        super(cVar);
        this.this$0 = deviceDataService;
    }

    @Override // Pd.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object executeApiCall;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        executeApiCall = this.this$0.executeApiCall(null, this);
        return executeApiCall;
    }
}
