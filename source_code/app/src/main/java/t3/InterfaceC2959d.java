package t3;

import java.util.Map;
import kotlin.Metadata;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import yg.j;
import yg.o;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J?\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0005H'¢\u0006\u0004\b\t\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lt3/d;", "", "", "token", "installationUid", "", "integrityHeaders", "Lvg/d;", "Lokhttp3/ResponseBody;", "alpha", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lvg/d;", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* renamed from: t3.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC2959d {
    @o("captains/token/refresh")
    @NotNull
    vg.d<ResponseBody> alpha(@NotNull @yg.i("Authorization") String token, @NotNull @yg.i("installation-uid") String installationUid, @j @NotNull Map<String, String> integrityHeaders);
}
