package com.checkout.components.rememberme.utils;

import Of.d;
import Ud.b;
import Ud.c;
import com.checkout.components.rememberme.B;
import com.checkout.components.rememberme.D;
import d5.C1589a;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a;
import org.jetbrains.annotations.NotNull;
import pe.AbstractC2327c;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001:\u0002\n\u000bB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/checkout/components/rememberme/utils/JWTTokenEncoder;", "", "<init>", "()V", "", "email", "phone", "countryCode", "encode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "com/checkout/components/rememberme/B", "com/checkout/components/rememberme/D", "rememberme_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class JWTTokenEncoder {
    public static final int $stable = 0;

    /* renamed from: a */
    private static final c f6341a;

    /* renamed from: b */
    private static final Lazy f6342b;

    static {
        c.foxtrot.getClass();
        c cVar = c.hotel;
        b bVar = b.purple;
        if (cVar.delta != bVar) {
            cVar = new c(cVar.alpha, cVar.bravo, cVar.charlie, bVar);
        }
        f6341a = cVar;
        f6342b = LazyKt.lazy(new C1589a(25));
    }

    public static final String a() {
        B b2 = new B();
        Of.c cVar = d.delta;
        cVar.getClass();
        String alpha = cVar.alpha(B.Companion.serializer(), b2);
        c cVar2 = f6341a;
        byte[] bytes = alpha.getBytes(a.alpha);
        Intrinsics.delta(bytes, "getBytes(...)");
        return c.bravo(cVar2, bytes);
    }

    public static /* synthetic */ String alpha() {
        return a();
    }

    @NotNull
    public final String encode(@NotNull String email, @NotNull String phone, @NotNull String countryCode) {
        Intrinsics.echo(email, "email");
        Intrinsics.echo(phone, "phone");
        Intrinsics.echo(countryCode, "countryCode");
        D d4 = new D(email, phone, "+".concat(countryCode), System.currentTimeMillis() / 1000);
        Of.c cVar = d.delta;
        cVar.getClass();
        String alpha = cVar.alpha(D.Companion.serializer(), d4);
        c cVar2 = f6341a;
        byte[] bytes = alpha.getBytes(a.alpha);
        Intrinsics.delta(bytes, "getBytes(...)");
        return AbstractC2327c.xray((String) f6342b.getValue(), ".", c.bravo(cVar2, bytes), ".");
    }
}
