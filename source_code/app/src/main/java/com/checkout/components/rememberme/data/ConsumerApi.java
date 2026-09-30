package com.checkout.components.rememberme.data;

import Nd.c;
import androidx.annotation.Keep;
import com.checkout.components.interfaces.model.TokenDetailsResponse;
import com.checkout.components.rememberme.model.CreateMerchantTokenRequest;
import com.checkout.components.rememberme.model.GetWalletResponse;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import vg.aq;
import yg.a;
import yg.f;
import yg.i;
import yg.o;
import yg.s;

@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001J>\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u0002H§@¢\u0006\u0004\b\t\u0010\nJR\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000f\u0010\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Lcom/checkout/components/rememberme/data/ConsumerApi;", "", "", "jwtToken", "consumerId", "ckoServiceName", "ckoServiceVersion", "Lvg/aq;", "Lcom/checkout/components/rememberme/model/GetWalletResponse;", "getWallet", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LNd/c;)Ljava/lang/Object;", "Lcom/checkout/components/rememberme/model/CreateMerchantTokenRequest;", "body", "paymentMethodId", "Lcom/checkout/components/interfaces/model/TokenDetailsResponse;", "createMerchantToken", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/checkout/components/rememberme/model/CreateMerchantTokenRequest;Ljava/lang/String;Ljava/lang/String;LNd/c;)Ljava/lang/Object;", "rememberme_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ConsumerApi {
    @o("/consumers/{consumer_id}/payment-methods/{payment_method_id}/merchant-token")
    @Nullable
    Object createMerchantToken(@NotNull @i("Authorization") String str, @NotNull @i("Cko-Service-Name") String str2, @NotNull @i("Cko-Service-Version") String str3, @NotNull @a CreateMerchantTokenRequest createMerchantTokenRequest, @s("consumer_id") @NotNull String str4, @s("payment_method_id") @NotNull String str5, @NotNull c<? super aq<TokenDetailsResponse>> cVar);

    @f("/consumers/{consumer_id}")
    @Nullable
    Object getWallet(@NotNull @i("Authorization") String str, @s("consumer_id") @NotNull String str2, @NotNull @i("Cko-Service-Name") String str3, @NotNull @i("Cko-Service-Version") String str4, @NotNull c<? super aq<GetWalletResponse>> cVar);
}
