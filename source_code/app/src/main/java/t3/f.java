package t3;

import com.app.network.network.models.AttendanceRegistryRequest;
import com.app.network.network.models.AttendanceResponse;
import com.app.network.network.models.Branch;
import com.app.network.network.models.CancelShiftRequest;
import com.app.network.network.models.ReasonItem;
import com.app.network.network.models.Shift;
import com.app.network.network.models.ShiftSummary;
import com.app.network.network.models.StartingPoint;
import com.app.network.network.models.Zone;
import com.app.network.network.models.breaks.BreakResponse;
import com.app.network.network.models.breaks.CreateBreakRequest;
import com.app.network.network.response.DataResponse;
import com.clevertap.android.sdk.Constants;
import io.reactivex.Single;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yg.n;
import yg.o;
import yg.s;
import yg.t;

@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\t\u0010\u0007J]\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00122\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\r\u001a\u00020\f2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0010H'¢\u0006\u0004\b\u0013\u0010\u0014JC\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00040\u00122\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0015\u001a\u00020\u0002H'¢\u0006\u0004\b\u0017\u0010\u0018J+\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00122\b\b\u0001\u0010\u0019\u001a\u00020\f2\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\nH'¢\u0006\u0004\b\u001b\u0010\u001cJ$\u0010\u001f\u001a\u00020\u00052\b\b\u0001\u0010\u0019\u001a\u00020\f2\b\b\u0001\u0010\u001e\u001a\u00020\u001dH§@¢\u0006\u0004\b\u001f\u0010 J \u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00042\b\b\u0003\u0010!\u001a\u00020\nH§@¢\u0006\u0004\b#\u0010$J9\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\u00040\u00122\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010&\u001a\u00020%2\b\b\u0001\u0010'\u001a\u00020%H'¢\u0006\u0004\b)\u0010*J9\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\u00040\u00122\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010&\u001a\u00020%2\b\b\u0001\u0010'\u001a\u00020%H'¢\u0006\u0004\b,\u0010*J\u001f\u00100\u001a\b\u0012\u0004\u0012\u00020/0\u00122\b\b\u0001\u0010.\u001a\u00020-H'¢\u0006\u0004\b0\u00101J\u0016\u00103\u001a\b\u0012\u0004\u0012\u00020\u000202H§@¢\u0006\u0004\b3\u00104J\u001a\u00107\u001a\u0002062\b\b\u0001\u0010\u001e\u001a\u000205H§@¢\u0006\u0004\b7\u00108J\u0012\u00109\u001a\u0004\u0018\u000106H§@¢\u0006\u0004\b9\u00104¨\u0006:À\u0006\u0003"}, d2 = {"Lt3/f;", "", "", "pageId", "Lcom/app/network/network/response/DataResponse;", "Lcom/app/network/network/models/Shift;", "charlie", "(ILNd/c;)Ljava/lang/Object;", "Lcom/app/network/network/models/ShiftSummary;", "juliet", "", "areaType", "", "areaId", "dayOfWeek", "startingPointId", "", "isActive", "Lio/reactivex/Single;", "hotel", "(ILjava/lang/String;JLjava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;)Lio/reactivex/Single;", "pageSize", "Lcom/app/network/network/models/StartingPoint;", "mike", "(Ljava/lang/String;JII)Lio/reactivex/Single;", "shiftId", "incogniaRequestToken", "india", "(JLjava/lang/String;)Lio/reactivex/Single;", "Lcom/app/network/network/models/CancelShiftRequest;", "request", "kilo", "(JLcom/app/network/network/models/CancelShiftRequest;LNd/c;)Ljava/lang/Object;", Constants.KEY_TYPE, "Lcom/app/network/network/models/ReasonItem;", "alpha", "(Ljava/lang/String;LNd/c;)Ljava/lang/Object;", "", "latitude", "longitude", "Lcom/app/network/network/models/Branch;", "delta", "(IFF)Lio/reactivex/Single;", "Lcom/app/network/network/models/Zone;", "lima", "Lcom/app/network/network/models/AttendanceRegistryRequest;", "attendance", "Lcom/app/network/network/models/AttendanceResponse;", "echo", "(Lcom/app/network/network/models/AttendanceRegistryRequest;)Lio/reactivex/Single;", "", "foxtrot", "(LNd/c;)Ljava/lang/Object;", "Lcom/app/network/network/models/breaks/CreateBreakRequest;", "Lcom/app/network/network/models/breaks/BreakResponse;", "golf", "(Lcom/app/network/network/models/breaks/CreateBreakRequest;LNd/c;)Ljava/lang/Object;", "bravo", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface f {
    @yg.f("reasons")
    @Nullable
    Object alpha(@t("type") @NotNull String str, @NotNull Nd.c<? super DataResponse<ReasonItem>> cVar);

    @yg.f("platform_area_shift_captain_breaks/active")
    @Nullable
    Object bravo(@NotNull Nd.c<? super BreakResponse> cVar);

    @yg.f("captains/shifts")
    @Nullable
    Object charlie(@t("pageId") int i4, @NotNull Nd.c<? super DataResponse<Shift>> cVar);

    @yg.f("branches")
    @NotNull
    Single<DataResponse<Branch>> delta(@t("pageId") int pageId, @t("latitude") float latitude, @t("longitude") float longitude);

    @o("platform_area_attendances")
    @NotNull
    Single<AttendanceResponse> echo(@NotNull @yg.a AttendanceRegistryRequest attendance);

    @yg.f("platform_area_shift_captain_breaks/durations")
    @Nullable
    Object foxtrot(@NotNull Nd.c<? super List<Integer>> cVar);

    @o("platform_area_shift_captain_breaks")
    @Nullable
    Object golf(@NotNull @yg.a CreateBreakRequest createBreakRequest, @NotNull Nd.c<? super BreakResponse> cVar);

    @yg.f("shifts/booking")
    @NotNull
    Single<DataResponse<Shift>> hotel(@t("pageId") int pageId, @t("areaType") @NotNull String areaType, @t("areaId") long areaId, @t("dayOfWeek") @Nullable String dayOfWeek, @t("startingPointId") @Nullable Long startingPointId, @t("isActive") @Nullable Boolean isActive);

    @n("shifts/booking/{shiftId}/book")
    @NotNull
    Single<Shift> india(@s("shiftId") long shiftId, @Nullable @yg.i("Incognia-Request-Token") String incogniaRequestToken);

    @yg.f("captains/shifts/summaries")
    @Nullable
    Object juliet(@t("pageId") int i4, @NotNull Nd.c<? super DataResponse<ShiftSummary>> cVar);

    @n("shifts/booking/{shiftId}/cancel")
    @Nullable
    Object kilo(@s("shiftId") long j5, @NotNull @yg.a CancelShiftRequest cancelShiftRequest, @NotNull Nd.c<? super Shift> cVar);

    @yg.f("platform/zones")
    @NotNull
    Single<DataResponse<Zone>> lima(@t("pageId") int pageId, @t("latitude") float latitude, @t("longitude") float longitude);

    @yg.f("shifts/booking/starting-points")
    @NotNull
    Single<DataResponse<StartingPoint>> mike(@t("areaType") @NotNull String areaType, @t("areaId") long areaId, @t("pageId") int pageId, @t("pageSize") int pageSize);
}
