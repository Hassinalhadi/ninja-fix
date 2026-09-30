package t3;

import com.app.network.network.models.HeatMapLocation;
import com.app.network.network.models.Shift;
import com.app.network.network.response.DataResponse;
import io.reactivex.Single;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import yg.s;
import yg.t;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00042\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\f\u001a\u00020\u000bH'¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lt3/i;", "", "", "pageId", "Lio/reactivex/Single;", "Lcom/app/network/network/response/DataResponse;", "Lcom/app/network/network/models/Shift;", "bravo", "(I)Lio/reactivex/Single;", "", "areaType", "", "areaId", "", "Lcom/app/network/network/models/HeatMapLocation;", "alpha", "(Ljava/lang/String;J)Lio/reactivex/Single;", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface i {
    @yg.f("captains/shifts/area/{areaType}/{areaId}/heat-map")
    @NotNull
    Single<List<HeatMapLocation>> alpha(@s("areaType") @NotNull String areaType, @s("areaId") long areaId);

    @yg.f("captains/shifts/active")
    @NotNull
    Single<DataResponse<Shift>> bravo(@t("pageId") int pageId);
}
