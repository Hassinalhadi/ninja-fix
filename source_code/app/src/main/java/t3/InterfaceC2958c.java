package t3;

import com.app.network.network.models.Allocation;
import com.app.network.network.models.CsatRatingRequest;
import com.app.network.network.models.CsatResponse;
import com.app.network.network.models.CustomerPhoneResponse;
import com.app.network.network.models.Order;
import com.app.network.network.models.OrderTask;
import com.app.network.network.response.DataResponse;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.variables.CTVariableUtils;
import io.reactivex.Single;
import kotlin.Metadata;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import vg.aq;
import yg.l;
import yg.n;
import yg.q;
import yg.s;
import yg.t;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\u0002H'¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\r0\u0004H'¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\u0012\u001a\u00020\u0002H'¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\rH§@¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00042\b\b\u0001\u0010\b\u001a\u00020\u0010H'¢\u0006\u0004\b\u0018\u0010\u0019J\u0095\u0001\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u00042\b\b\u0001\u0010\u001a\u001a\u00020\u00102\b\b\u0001\u0010\u0012\u001a\u00020\u00022\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u001b2\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\n\b\u0003\u0010 \u001a\u0004\u0018\u00010\u001e2\n\b\u0003\u0010!\u001a\u0004\u0018\u00010\u001b2\n\b\u0003\u0010\"\u001a\u0004\u0018\u00010\u001b2\n\b\u0003\u0010#\u001a\u0004\u0018\u00010\u001b2\n\b\u0003\u0010$\u001a\u0004\u0018\u00010\u001b2\n\b\u0003\u0010%\u001a\u0004\u0018\u00010\u001bH'¢\u0006\u0004\b'\u0010(Jq\u0010*\u001a\b\u0012\u0004\u0012\u00020&0\u00042\b\b\u0001\u0010\u001a\u001a\u00020\u00102\b\b\u0001\u0010\u0012\u001a\u00020\u00022\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u001b2\n\b\u0003\u0010)\u001a\u0004\u0018\u00010\u001b2\n\b\u0003\u0010\"\u001a\u0004\u0018\u00010\u001b2\n\b\u0003\u0010#\u001a\u0004\u0018\u00010\u001b2\n\b\u0003\u0010$\u001a\u0004\u0018\u00010\u001b2\n\b\u0003\u0010%\u001a\u0004\u0018\u00010\u001bH'¢\u0006\u0004\b*\u0010+J9\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\r0\u00042\b\b\u0001\u0010,\u001a\u00020\u00022\b\b\u0001\u0010-\u001a\u00020\u00022\b\b\u0001\u0010.\u001a\u00020\u0010H'¢\u0006\u0004\b/\u00100J\u001b\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000202010\u0004H'¢\u0006\u0004\b3\u0010\u000fJ*\u00107\u001a\b\u0012\u0004\u0012\u000206012\b\b\u0001\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u00105\u001a\u000204H§@¢\u0006\u0004\b7\u00108¨\u00069À\u0006\u0003"}, d2 = {"Lt3/c;", "", "", "allocationId", "Lio/reactivex/Single;", "Lcom/app/network/network/models/Allocation;", "india", "(Ljava/lang/String;)Lio/reactivex/Single;", "orderId", "contactMode", "Lcom/app/network/network/models/CustomerPhoneResponse;", "kilo", "(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/Single;", "Lcom/app/network/network/response/DataResponse;", "foxtrot", "()Lio/reactivex/Single;", "", Constants.KEY_ID, "status", "hotel", "(ILjava/lang/String;)Lio/reactivex/Single;", "Lcom/app/network/network/models/Order;", "juliet", "(LNd/c;)Ljava/lang/Object;", "alpha", "(I)Lio/reactivex/Single;", "taskId", "Lokhttp3/RequestBody;", "amount", "pinCode", "Lokhttp3/MultipartBody$Part;", CTVariableUtils.FILE, "taskConfirmationImage", "invoiceQrCode", "latitude", "longitude", "locationAccuracy", "locationCapturedAt", "Lcom/app/network/network/models/OrderTask;", "delta", "(ILjava/lang/String;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;)Lio/reactivex/Single;", "attendanceKey", "charlie", "(ILjava/lang/String;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;)Lio/reactivex/Single;", "startDate", "endDate", "pageId", "golf", "(Ljava/lang/String;Ljava/lang/String;I)Lio/reactivex/Single;", "Lvg/aq;", "Lcom/app/network/network/models/CsatResponse;", "bravo", "Lcom/app/network/network/models/CsatRatingRequest;", "body", "Ljava/lang/Void;", "echo", "(ILcom/app/network/network/models/CsatRatingRequest;LNd/c;)Ljava/lang/Object;", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* renamed from: t3.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC2958c {
    @yg.f("orders/{order_id}")
    @NotNull
    Single<Order> alpha(@s("order_id") int orderId);

    @yg.f("csat/latest")
    @NotNull
    Single<aq<CsatResponse>> bravo();

    @l
    @n("tasks/{taskId}/{status}")
    @NotNull
    Single<OrderTask> charlie(@s("taskId") int taskId, @s("status") @NotNull String status, @Nullable @q("deliveryConfirmationCode") RequestBody pinCode, @Nullable @q("attendanceKey") RequestBody attendanceKey, @Nullable @q("captainLatitude") RequestBody latitude, @Nullable @q("captainLongitude") RequestBody longitude, @Nullable @q("locationAccuracy") RequestBody locationAccuracy, @Nullable @q("locationCapturedAt") RequestBody locationCapturedAt);

    @l
    @n("tasks/{taskId}/{status}")
    @NotNull
    Single<OrderTask> delta(@s("taskId") int taskId, @s("status") @NotNull String status, @Nullable @q("amountPaid") RequestBody amount, @Nullable @q("deliveryConfirmationCode") RequestBody pinCode, @Nullable @q MultipartBody.Part file, @Nullable @q MultipartBody.Part taskConfirmationImage, @Nullable @q("invoiceQrCode") RequestBody invoiceQrCode, @Nullable @q("captainLatitude") RequestBody latitude, @Nullable @q("captainLongitude") RequestBody longitude, @Nullable @q("locationAccuracy") RequestBody locationAccuracy, @Nullable @q("locationCapturedAt") RequestBody locationCapturedAt);

    @n("csat/{id}")
    @Nullable
    Object echo(@s("id") int i4, @NotNull @yg.a CsatRatingRequest csatRatingRequest, @NotNull Nd.c<? super aq<Void>> cVar);

    @yg.f("allocation_windows")
    @NotNull
    Single<DataResponse<Allocation>> foxtrot();

    @yg.f("orders")
    @NotNull
    Single<DataResponse<Order>> golf(@t("startDate") @NotNull String startDate, @t("endDate") @NotNull String endDate, @t("pageId") int pageId);

    @n("allocation_windows/{allocation_window_id}/{status}")
    @NotNull
    Single<Allocation> hotel(@s("allocation_window_id") int id2, @s("status") @NotNull String status);

    @yg.f("allocation_windows/{allocation_window_id}")
    @NotNull
    Single<Allocation> india(@s("allocation_window_id") @NotNull String allocationId);

    @yg.f("orders/active")
    @Nullable
    Object juliet(@NotNull Nd.c<? super DataResponse<Order>> cVar);

    @yg.f("orders/{orderId}/customer-contact")
    @NotNull
    Single<CustomerPhoneResponse> kilo(@s("orderId") @NotNull String orderId, @t("contactMode") @NotNull String contactMode);
}
