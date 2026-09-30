package com.checkout.components.rememberme.data;

import Nd.c;
import Od.a;
import androidx.recyclerview.widget.RecyclerView;
import com.checkout.components.rememberme.AbstractC0999z;
import com.checkout.components.rememberme.C0986u1;
import com.checkout.components.rememberme.C0989v1;
import com.checkout.components.rememberme.model.CvvTokenResponse;
import com.checkout.components.rememberme.utils.Constants;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Headers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J2\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n0\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/checkout/components/rememberme/data/TokeniseRepository;", "", "Lcom/checkout/components/rememberme/data/TokeniseApi;", "api", "<init>", "(Lcom/checkout/components/rememberme/data/TokeniseApi;)V", "", Constants.CVV_TYPE, "publicKey", "Lkotlin/Result;", "Lkotlin/Pair;", "Lokhttp3/Headers;", "Lcom/checkout/components/rememberme/model/CvvTokenResponse;", "createCvvToken-0E7RQCE", "(Ljava/lang/String;Ljava/lang/String;LNd/c;)Ljava/lang/Object;", "createCvvToken", "rememberme_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TokeniseRepository {
    public static final int $stable = 8;

    /* renamed from: a, reason: collision with root package name */
    private final TokeniseApi f5886a;

    public TokeniseRepository(@NotNull TokeniseApi api) {
        Intrinsics.echo(api, "api");
        this.f5886a = api;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Nullable
    /* renamed from: createCvvToken-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m129createCvvToken0E7RQCE(@NotNull String str, @NotNull String str2, @NotNull c<? super Result<Pair<Headers, CvvTokenResponse>>> cVar) {
        C0986u1 c0986u1;
        int i4;
        if (cVar instanceof C0986u1) {
            c0986u1 = (C0986u1) cVar;
            int i5 = c0986u1.e;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c0986u1.e = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj = c0986u1.f6322c;
                a aVar = a.alpha;
                i4 = c0986u1.e;
                if (i4 == 0) {
                    if (i4 == 1) {
                        ResultKt.alpha(obj);
                        return ((Result) obj).alpha;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.alpha(obj);
                C0989v1 c0989v1 = new C0989v1(this, str, str2, null);
                c0986u1.f6320a = null;
                c0986u1.f6321b = null;
                c0986u1.e = 1;
                Object a6 = AbstractC0999z.a(c0989v1, c0986u1);
                if (a6 == aVar) {
                    return aVar;
                }
                return a6;
            }
        }
        c0986u1 = new C0986u1(this, cVar);
        Object obj2 = c0986u1.f6322c;
        a aVar2 = a.alpha;
        i4 = c0986u1.e;
        if (i4 == 0) {
        }
    }
}
