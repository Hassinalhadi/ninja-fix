package com.checkout.components.kmp.rememberme.data.remote;

import Xd.l;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import sd.AbstractC2850a;
import sd.aa;
import sd.ac;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 176)
/* loaded from: classes3.dex */
public final class NetworkClient$request$response$1$2 implements l {
    final /* synthetic */ String $baseURL;
    final /* synthetic */ String $path;

    public NetworkClient$request$response$1$2(String str, String str2) {
        this.$baseURL = str;
        this.$path = str2;
    }

    public final void invoke(aa url, aa it) {
        Intrinsics.echo(url, "$this$url");
        Intrinsics.echo(it, "it");
        ac value = ac.silver;
        Intrinsics.echo(value, "value");
        url.delta = value;
        String str = this.$baseURL;
        Intrinsics.echo(str, "<set-?>");
        url.alpha = str;
        String[] strArr = {this.$path};
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(AbstractC2850a.foxtrot(3, strArr[0]));
        url.hotel = arrayList;
    }

    @Override // Xd.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((aa) obj, (aa) obj2);
        return Unit.INSTANCE;
    }
}
