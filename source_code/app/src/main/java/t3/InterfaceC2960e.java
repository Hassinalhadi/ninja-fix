package t3;

import com.app.network.network.models.reposition.RepositionActionResponseDto;
import com.app.network.network.models.reposition.RepositionAssignmentDto;
import com.clevertap.android.sdk.Constants;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yg.n;
import yg.s;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\fH§@¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lt3/e;", "", "", Constants.KEY_ID, "Lcom/app/network/network/models/reposition/RepositionAssignmentDto;", "bravo", "(JLNd/c;)Ljava/lang/Object;", "", Constants.KEY_ACTION, "Lcom/app/network/network/models/reposition/RepositionActionResponseDto;", "alpha", "(JLjava/lang/String;LNd/c;)Ljava/lang/Object;", "", "charlie", "(LNd/c;)Ljava/lang/Object;", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* renamed from: t3.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC2960e {
    @n("/api/v1/platform_zone_reposition_request_assignments/{id}/{action}")
    @Nullable
    Object alpha(@s("id") long j5, @s("action") @NotNull String str, @NotNull Nd.c<? super RepositionActionResponseDto> cVar);

    @yg.f("/api/v1/platform_zone_reposition_request_assignments/{id}")
    @Nullable
    Object bravo(@s("id") long j5, @NotNull Nd.c<? super RepositionAssignmentDto> cVar);

    @yg.f("/api/v1/platform_zone_reposition_request_assignments/pending")
    @Nullable
    Object charlie(@NotNull Nd.c<? super List<Long>> cVar);
}
