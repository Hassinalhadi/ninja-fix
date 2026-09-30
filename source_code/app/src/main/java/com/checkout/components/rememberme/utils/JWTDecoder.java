package com.checkout.components.rememberme.utils;

import Ud.b;
import Ud.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0005¨\u0006\u0007"}, d2 = {"Lcom/checkout/components/rememberme/utils/JWTDecoder;", "", "<init>", "()V", "getSub", "", "token", "rememberme_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class JWTDecoder {
    public static final int $stable = 0;

    @Nullable
    public final String getSub(@NotNull String token) {
        Intrinsics.echo(token, "token");
        List navy = StringsKt.navy(token, new char[]{'.'});
        if (navy.size() == 3) {
            String str = (String) navy.get(1);
            c.foxtrot.getClass();
            c cVar = c.hotel;
            b bVar = b.red;
            if (cVar.delta != bVar) {
                cVar = new c(cVar.alpha, cVar.bravo, cVar.charlie, bVar);
            }
            return new JSONObject(new String(c.alpha(cVar, str), a.alpha)).getString("sub");
        }
        throw new Exception("Invalid JWT token format");
    }
}
