package com.checkout.components.kmp.rememberme.data.remote;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import sd.n;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 176)
/* loaded from: classes3.dex */
public final class NetworkClient$request$response$1$1 implements Function1<n, Unit> {
    final /* synthetic */ NetworkClient this$0;

    public NetworkClient$request$response$1$1(NetworkClient networkClient) {
        this.this$0 = networkClient;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(n nVar) {
        invoke2(nVar);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(n headers) {
        String str;
        String str2;
        Intrinsics.echo(headers, "$this$headers");
        str = this.this$0.serviceName;
        headers.F("Cko-Service-Name", str);
        str2 = this.this$0.serviceVersion;
        headers.F("Cko-Service-Version", str2);
    }
}
