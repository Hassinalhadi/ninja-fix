package t3;

import com.app.network.network.models.Bank;
import com.app.network.network.models.ChangePasswordRequest;
import com.app.network.network.models.City;
import com.app.network.network.models.Country;
import com.app.network.network.models.DeviceInfo;
import com.app.network.network.models.PlatformListResponse;
import com.app.network.network.models.PreferredVerticalResponse;
import com.app.network.network.models.ResetPasswordRequest;
import com.app.network.network.models.SignInRequestModel;
import com.app.network.network.models.SignUpResponse;
import com.app.network.network.models.UserIdentityRequestResponse;
import com.app.network.network.models.UserInfo;
import com.app.network.network.response.DataResponse;
import com.clevertap.android.sdk.Constants;
import io.reactivex.Single;
import java.util.List;
import kotlin.Metadata;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yg.k;
import yg.l;
import yg.n;
import yg.o;
import yg.p;
import yg.q;
import yg.s;
import yg.t;

@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\u0006J\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0003\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\u000b\u0010\fJ>\u0010\u0013\u001a\u00020\n2\b\b\u0001\u0010\u000e\u001a\u00020\r2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u000fH§@¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004H'¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u00042\b\b\u0001\u0010\u0019\u001a\u00020\u0018H'¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00150\u00042\b\b\u0001\u0010\u0019\u001a\u00020\u001cH'¢\u0006\u0004\b\u001d\u0010\u001eJ \u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!2\b\b\u0003\u0010 \u001a\u00020\u001fH§@¢\u0006\u0004\b#\u0010$J\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%H§@¢\u0006\u0004\b'\u0010(J\u0016\u0010*\u001a\b\u0012\u0004\u0012\u00020)0%H§@¢\u0006\u0004\b*\u0010(J \u0010,\u001a\b\u0012\u0004\u0012\u00020)0%2\b\b\u0001\u0010+\u001a\u00020\u001fH§@¢\u0006\u0004\b,\u0010$J\u0016\u0010.\u001a\b\u0012\u0004\u0012\u00020-0!H§@¢\u0006\u0004\b.\u0010(J*\u00100\u001a\b\u0012\u0004\u0012\u00020/0!2\b\b\u0001\u0010+\u001a\u00020\u001f2\b\b\u0001\u0010 \u001a\u00020\u001fH§@¢\u0006\u0004\b0\u00101J\u0080\u0002\u0010I\u001a\u00020\u00012\b\b\u0001\u00103\u001a\u0002022\b\b\u0001\u00104\u001a\u0002022\b\b\u0001\u00105\u001a\u0002022\b\b\u0001\u00106\u001a\u0002022\n\b\u0001\u00107\u001a\u0004\u0018\u0001022\n\b\u0001\u00108\u001a\u0004\u0018\u0001022\n\b\u0001\u00109\u001a\u0004\u0018\u0001022\b\b\u0001\u0010:\u001a\u0002022\b\b\u0001\u0010+\u001a\u0002022\b\b\u0001\u0010;\u001a\u0002022\b\b\u0001\u0010<\u001a\u0002022\n\b\u0001\u0010=\u001a\u0004\u0018\u0001022\b\b\u0001\u0010>\u001a\u0002022\b\b\u0001\u0010?\u001a\u0002022\n\b\u0001\u0010@\u001a\u0004\u0018\u0001022\n\b\u0001\u0010A\u001a\u0004\u0018\u0001022\b\b\u0001\u0010B\u001a\u0002022\b\b\u0001\u0010C\u001a\u0002022\n\b\u0001\u0010E\u001a\u0004\u0018\u00010D2\n\b\u0001\u0010F\u001a\u0004\u0018\u00010D2\n\b\u0001\u0010G\u001a\u0004\u0018\u00010D2\n\b\u0001\u0010H\u001a\u0004\u0018\u00010DH§@¢\u0006\u0004\bI\u0010JJ\u0096\u0002\u0010L\u001a\u00020\u00012\b\b\u0001\u0010K\u001a\u00020\u000f2\n\b\u0001\u00103\u001a\u0004\u0018\u0001022\n\b\u0001\u00104\u001a\u0004\u0018\u0001022\n\b\u0001\u00105\u001a\u0004\u0018\u0001022\n\b\u0001\u00106\u001a\u0004\u0018\u0001022\n\b\u0001\u00107\u001a\u0004\u0018\u0001022\n\b\u0001\u00108\u001a\u0004\u0018\u0001022\n\b\u0001\u00109\u001a\u0004\u0018\u0001022\n\b\u0001\u0010:\u001a\u0004\u0018\u0001022\n\b\u0001\u0010+\u001a\u0004\u0018\u0001022\n\b\u0001\u0010;\u001a\u0004\u0018\u0001022\n\b\u0001\u0010<\u001a\u0004\u0018\u0001022\n\b\u0001\u0010=\u001a\u0004\u0018\u0001022\n\b\u0001\u0010>\u001a\u0004\u0018\u0001022\n\b\u0001\u0010?\u001a\u0004\u0018\u0001022\n\b\u0001\u0010@\u001a\u0004\u0018\u0001022\n\b\u0001\u0010B\u001a\u0004\u0018\u0001022\n\b\u0001\u0010C\u001a\u0004\u0018\u0001022\n\b\u0001\u0010E\u001a\u0004\u0018\u00010D2\n\b\u0001\u0010F\u001a\u0004\u0018\u00010D2\n\b\u0001\u0010G\u001a\u0004\u0018\u00010D2\n\b\u0001\u0010H\u001a\u0004\u0018\u00010DH§@¢\u0006\u0004\bL\u0010MJ\u001a\u0010P\u001a\u00020O2\b\b\u0001\u0010N\u001a\u00020\u000fH§@¢\u0006\u0004\bP\u0010QJ\u001a\u0010U\u001a\u00020T2\b\b\u0001\u0010S\u001a\u00020RH§@¢\u0006\u0004\bU\u0010V¨\u0006WÀ\u0006\u0003"}, d2 = {"Lt3/a;", "", "Lcom/app/network/network/models/DeviceInfo;", "deviceInfo", "Lio/reactivex/Single;", "india", "(Lcom/app/network/network/models/DeviceInfo;)Lio/reactivex/Single;", "hotel", "", "isAppOpen", "Lcom/app/network/network/models/UserInfo;", "foxtrot", "(Z)Lio/reactivex/Single;", "Lcom/app/network/network/models/SignInRequestModel;", "signInRequestModel", "", "playIntegrityToken", "playIntegrityStatus", "incogniaRequestToken", "oscar", "(Lcom/app/network/network/models/SignInRequestModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LNd/c;)Ljava/lang/Object;", "Lokhttp3/ResponseBody;", "lima", "()Lio/reactivex/Single;", "Lcom/app/network/network/models/ChangePasswordRequest;", "resetPasswordRequest", "alpha", "(Lcom/app/network/network/models/ChangePasswordRequest;)Lio/reactivex/Single;", "Lcom/app/network/network/models/ResetPasswordRequest;", "mike", "(Lcom/app/network/network/models/ResetPasswordRequest;)Lio/reactivex/Single;", "", "page", "Lcom/app/network/network/response/DataResponse;", "Lcom/app/network/network/models/Country;", "charlie", "(ILNd/c;)Ljava/lang/Object;", "", "Lcom/app/network/network/models/PreferredVerticalResponse;", "quebec", "(LNd/c;)Ljava/lang/Object;", "Lcom/app/network/network/models/PlatformListResponse;", "bravo", "countryId", "november", "Lcom/app/network/network/models/Bank;", "golf", "Lcom/app/network/network/models/City;", "delta", "(IILNd/c;)Ljava/lang/Object;", "Lokhttp3/RequestBody;", "name", "idNumber", "dateOfBirth", "preference", "preferredPlatformId", "vehiclePlateNumber", "vehicleSequenceNumber", "nationality", "cityId", "mobileNumber", "fintechAccountId", "ibanName", "iban", "bankId", "refereeCode", "urPayAccountIban", "urPayIdNumber", "Lokhttp3/MultipartBody$Part;", "identity", "drivingLicense", "registrationLicense", "profilePicture", "kilo", "(Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;LNd/c;)Ljava/lang/Object;", "requestId", "papa", "(Ljava/lang/String;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;LNd/c;)Ljava/lang/Object;", "forRequestId", "Lcom/app/network/network/models/SignUpResponse;", "echo", "(Ljava/lang/String;LNd/c;)Ljava/lang/Object;", "", Constants.KEY_ID, "Lcom/app/network/network/models/UserIdentityRequestResponse;", "juliet", "(JLNd/c;)Ljava/lang/Object;", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* renamed from: t3.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC2956a {
    @o("captains/reset-password")
    @NotNull
    Single<ResponseBody> alpha(@NotNull @yg.a ChangePasswordRequest resetPasswordRequest);

    @yg.f("platforms/captain_self_register_enabled")
    @Nullable
    Object bravo(@NotNull Nd.c<? super List<PlatformListResponse>> cVar);

    @yg.f("countries")
    @Nullable
    Object charlie(@t("pageId") int i4, @NotNull Nd.c<? super DataResponse<Country>> cVar);

    @yg.f("cities")
    @Nullable
    Object delta(@t("countryId") int i4, @t("pageId") int i5, @NotNull Nd.c<? super DataResponse<City>> cVar);

    @yg.f("captains/requests/{request_id}")
    @Nullable
    Object echo(@s("request_id") @NotNull String str, @NotNull Nd.c<? super SignUpResponse> cVar);

    @yg.f("devices/me")
    @NotNull
    Single<UserInfo> foxtrot(@t("isAppOpen") boolean isAppOpen);

    @yg.f("banks")
    @Nullable
    Object golf(@NotNull Nd.c<? super DataResponse<Bank>> cVar);

    @n("devices")
    @NotNull
    Single<DeviceInfo> hotel(@NotNull @yg.a DeviceInfo deviceInfo);

    @o("devices/register")
    @NotNull
    Single<DeviceInfo> india(@NotNull @yg.a DeviceInfo deviceInfo);

    @yg.f("user_identity_requests/{id}")
    @Nullable
    Object juliet(@s("id") long j5, @NotNull Nd.c<? super UserIdentityRequestResponse> cVar);

    @l
    @o("captains/requests")
    @Nullable
    Object kilo(@NotNull @q("name") RequestBody requestBody, @NotNull @q("idNumber") RequestBody requestBody2, @NotNull @q("dateOfBirth") RequestBody requestBody3, @NotNull @q("preferredVertical") RequestBody requestBody4, @Nullable @q("preferredPlatformId") RequestBody requestBody5, @Nullable @q("vehiclePlateNumber") RequestBody requestBody6, @Nullable @q("vehicleSequenceNumber") RequestBody requestBody7, @NotNull @q("nationality") RequestBody requestBody8, @NotNull @q("countryId") RequestBody requestBody9, @NotNull @q("cityId") RequestBody requestBody10, @NotNull @q("mobileNumber") RequestBody requestBody11, @Nullable @q("fintechAccountId") RequestBody requestBody12, @NotNull @q("ibanName") RequestBody requestBody13, @NotNull @q("iban") RequestBody requestBody14, @Nullable @q("bankId") RequestBody requestBody15, @Nullable @q("refereeCode") RequestBody requestBody16, @NotNull @q("urPayAccountIban") RequestBody requestBody17, @NotNull @q("urPayIdNumber") RequestBody requestBody18, @Nullable @q MultipartBody.Part part, @Nullable @q MultipartBody.Part part2, @Nullable @q MultipartBody.Part part3, @Nullable @q MultipartBody.Part part4, @NotNull Nd.c<Object> cVar);

    @p("captains/logout")
    @NotNull
    Single<ResponseBody> lima();

    @o("captains/recreate-password")
    @NotNull
    Single<ResponseBody> mike(@NotNull @yg.a ResetPasswordRequest resetPasswordRequest);

    @yg.f("platforms/captain_self_register_enabled")
    @Nullable
    Object november(@t("countryId") int i4, @NotNull Nd.c<? super List<PlatformListResponse>> cVar);

    @k({"No-Auth: true"})
    @o("captains/login")
    @Nullable
    Object oscar(@NotNull @yg.a SignInRequestModel signInRequestModel, @Nullable @yg.i("X-Play-Integrity-Token") String str, @Nullable @yg.i("X-Play-Integrity-Status") String str2, @Nullable @yg.i("Incognia-Request-Token") String str3, @NotNull Nd.c<? super UserInfo> cVar);

    @l
    @p("captains/requests/{request_id}")
    @Nullable
    Object papa(@s("request_id") @NotNull String str, @Nullable @q("name") RequestBody requestBody, @Nullable @q("idNumber") RequestBody requestBody2, @Nullable @q("dateOfBirth") RequestBody requestBody3, @Nullable @q("preferredVertical") RequestBody requestBody4, @Nullable @q("preferredPlatformId") RequestBody requestBody5, @Nullable @q("vehiclePlateNumber") RequestBody requestBody6, @Nullable @q("vehicleSequenceNumber") RequestBody requestBody7, @Nullable @q("nationality") RequestBody requestBody8, @Nullable @q("countryId") RequestBody requestBody9, @Nullable @q("cityId") RequestBody requestBody10, @Nullable @q("mobileNumber") RequestBody requestBody11, @Nullable @q("fintechAccountId") RequestBody requestBody12, @Nullable @q("ibanName") RequestBody requestBody13, @Nullable @q("iban") RequestBody requestBody14, @Nullable @q("bankId") RequestBody requestBody15, @Nullable @q("urPayAccountIban") RequestBody requestBody16, @Nullable @q("urPayIdNumber") RequestBody requestBody17, @Nullable @q MultipartBody.Part part, @Nullable @q MultipartBody.Part part2, @Nullable @q MultipartBody.Part part3, @Nullable @q MultipartBody.Part part4, @NotNull Nd.c<Object> cVar);

    @yg.f("captains/requests/verticals")
    @Nullable
    Object quebec(@NotNull Nd.c<? super List<PreferredVerticalResponse>> cVar);
}
