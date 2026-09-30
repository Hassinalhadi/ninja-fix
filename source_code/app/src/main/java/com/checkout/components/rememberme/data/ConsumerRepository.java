package com.checkout.components.rememberme.data;

import Nd.c;
import Od.a;
import androidx.recyclerview.widget.RecyclerView;
import com.checkout.components.interfaces.model.TokenDetailsResponse;
import com.checkout.components.rememberme.AbstractC0999z;
import com.checkout.components.rememberme.C0963n;
import com.checkout.components.rememberme.C0966o;
import com.checkout.components.rememberme.C0969p;
import com.checkout.components.rememberme.C0972q;
import com.checkout.components.rememberme.model.GetWalletResponse;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.k;
import okhttp3.Headers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\u000b\u0010\fJB\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00100\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/checkout/components/rememberme/data/ConsumerRepository;", "", "Lcom/checkout/components/rememberme/data/ConsumerApi;", "api", "<init>", "(Lcom/checkout/components/rememberme/data/ConsumerApi;)V", "", "jwtToken", "consumerId", "Lkotlin/Result;", "Lcom/checkout/components/rememberme/model/GetWalletResponse;", "getWallet-0E7RQCE", "(Ljava/lang/String;Ljava/lang/String;LNd/c;)Ljava/lang/Object;", "getWallet", "publicKey", "paymentMethodId", "Lkotlin/Pair;", "Lokhttp3/Headers;", "Lcom/checkout/components/interfaces/model/TokenDetailsResponse;", "createMerchantToken-yxL6bBk", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LNd/c;)Ljava/lang/Object;", "createMerchantToken", "rememberme_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ConsumerRepository {
    public static final int $stable = 8;

    /* renamed from: a, reason: collision with root package name */
    private final ConsumerApi f5883a;

    public ConsumerRepository(@NotNull ConsumerApi api) {
        Intrinsics.echo(api, "api");
        this.f5883a = api;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Nullable
    /* renamed from: createMerchantToken-yxL6bBk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m127createMerchantTokenyxL6bBk(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull c<? super Result<Pair<Headers, TokenDetailsResponse>>> cVar) {
        C0963n c0963n;
        int i4;
        if (cVar instanceof C0963n) {
            c0963n = (C0963n) cVar;
            int i5 = c0963n.f6151g;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c0963n.f6151g = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj = c0963n.e;
                a aVar = a.alpha;
                i4 = c0963n.f6151g;
                if (i4 == 0) {
                    if (i4 == 1) {
                        ResultKt.alpha(obj);
                        return ((Result) obj).alpha;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.alpha(obj);
                C0966o c0966o = new C0966o(this, str, str2, str3, str4, null);
                c0963n.f6146a = null;
                c0963n.f6147b = null;
                c0963n.f6148c = null;
                c0963n.f6149d = null;
                c0963n.f6151g = 1;
                Object a6 = AbstractC0999z.a(c0966o, c0963n);
                if (a6 == aVar) {
                    return aVar;
                }
                return a6;
            }
        }
        c0963n = new C0963n(this, cVar);
        Object obj2 = c0963n.e;
        a aVar2 = a.alpha;
        i4 = c0963n.f6151g;
        if (i4 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0057 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Nullable
    /* renamed from: getWallet-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m128getWallet0E7RQCE(@NotNull String str, @NotNull String str2, @NotNull c<? super Result<GetWalletResponse>> cVar) {
        C0969p c0969p;
        int i4;
        Object a6;
        if (cVar instanceof C0969p) {
            c0969p = (C0969p) cVar;
            int i5 = c0969p.e;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c0969p.e = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj = c0969p.f6172c;
                a aVar = a.alpha;
                i4 = c0969p.e;
                if (i4 == 0) {
                    if (i4 == 1) {
                        ResultKt.alpha(obj);
                        a6 = ((Result) obj).alpha;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    C0972q c0972q = new C0972q(this, str, str2, null);
                    c0969p.f6170a = null;
                    c0969p.f6171b = null;
                    c0969p.e = 1;
                    a6 = AbstractC0999z.a(c0972q, c0969p);
                    if (a6 == aVar) {
                        return aVar;
                    }
                }
                Result.Companion companion = Result.INSTANCE;
                if (a6 instanceof k) {
                    try {
                        return Result.m206constructorimpl((GetWalletResponse) ((Pair) a6).getSecond());
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.INSTANCE;
                        return Result.m206constructorimpl(ResultKt.createFailure(th));
                    }
                }
                return Result.m206constructorimpl(a6);
            }
        }
        c0969p = new C0969p(this, cVar);
        Object obj2 = c0969p.f6172c;
        a aVar2 = a.alpha;
        i4 = c0969p.e;
        if (i4 == 0) {
        }
        Result.Companion companion3 = Result.INSTANCE;
        if (a6 instanceof k) {
        }
    }
}
