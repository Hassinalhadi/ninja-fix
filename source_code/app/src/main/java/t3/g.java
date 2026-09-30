package t3;

import com.app.network.network.models.CreateTicketApiResponse;
import com.app.network.network.models.Root;
import com.clevertap.android.sdk.Constants;
import java.util.List;
import kotlin.Metadata;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yg.l;
import yg.o;
import yg.q;
import yg.t;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J,\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b\b\u0010\tJF\u0010\u0011\u001a\u00020\u00102\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\n2\u0010\b\u0001\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\nH§@¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013À\u0006\u0003"}, d2 = {"Lt3/g;", "", "", Constants.KEY_TYPE, "", "orderId", "", "Lcom/app/network/network/models/Root;", "bravo", "(Ljava/lang/String;Ljava/lang/Integer;LNd/c;)Ljava/lang/Object;", "Lokhttp3/RequestBody;", "actionId", Constants.KEY_CONTENT, "", "Lokhttp3/MultipartBody$Part;", "attachments", "Lcom/app/network/network/models/CreateTicketApiResponse;", "alpha", "(Lokhttp3/RequestBody;Lokhttp3/RequestBody;[Lokhttp3/MultipartBody$Part;Lokhttp3/RequestBody;LNd/c;)Ljava/lang/Object;", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface g {
    @l
    @o("tickets/create")
    @Nullable
    Object alpha(@Nullable @q("actionId") RequestBody requestBody, @Nullable @q("content") RequestBody requestBody2, @Nullable @q MultipartBody.Part[] partArr, @Nullable @q("orderId") RequestBody requestBody3, @NotNull Nd.c<? super CreateTicketApiResponse> cVar);

    @yg.f("tickets/roots")
    @Nullable
    Object bravo(@t("type") @NotNull String str, @t("orderId") @Nullable Integer num, @NotNull Nd.c<? super List<Root>> cVar);
}
