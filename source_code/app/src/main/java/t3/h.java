package t3;

import com.app.network.network.models.tickets.TicketCommentResponse;
import com.app.network.network.models.tickets.TicketResponse;
import com.app.network.network.response.DataResponse;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yg.l;
import yg.o;
import yg.q;
import yg.s;
import yg.t;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J*\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJ4\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\b\u000b\u0010\fJ4\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u000f\u001a\u00020\r2\u000e\b\u0003\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H§@¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00062\b\b\u0001\u0010\u000e\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018À\u0006\u0003"}, d2 = {"Lt3/h;", "", "", "pageId", "pageSize", "Lcom/app/network/network/response/DataResponse;", "Lcom/app/network/network/models/tickets/TicketResponse;", "bravo", "(IILNd/c;)Ljava/lang/Object;", "", "status", "delta", "(IILjava/lang/String;LNd/c;)Ljava/lang/Object;", "Lokhttp3/RequestBody;", "ticketId", Constants.KEY_MESSAGE, "", "Lokhttp3/MultipartBody$Part;", "attachments", "Lcom/app/network/network/models/tickets/TicketCommentResponse;", "alpha", "(Lokhttp3/RequestBody;Lokhttp3/RequestBody;[Lokhttp3/MultipartBody$Part;LNd/c;)Ljava/lang/Object;", "charlie", "(ILNd/c;)Ljava/lang/Object;", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface h {
    @l
    @o("/api/v1/ticket_comments")
    @Nullable
    Object alpha(@NotNull @q("ticketId") RequestBody requestBody, @NotNull @q("message") RequestBody requestBody2, @NotNull @q MultipartBody.Part[] partArr, @NotNull Nd.c<? super TicketCommentResponse> cVar);

    @yg.f("/api/v1/tickets/open")
    @Nullable
    Object bravo(@t("pageId") int i4, @t("pageSize") int i5, @NotNull Nd.c<? super DataResponse<TicketResponse>> cVar);

    @yg.f("/api/v1/tickets/{ticketId}")
    @Nullable
    Object charlie(@s("ticketId") int i4, @NotNull Nd.c<? super TicketResponse> cVar);

    @yg.f("/api/v1/tickets")
    @Nullable
    Object delta(@t("pageId") int i4, @t("pageSize") int i5, @t("status") @NotNull String str, @NotNull Nd.c<? super DataResponse<TicketResponse>> cVar);
}
