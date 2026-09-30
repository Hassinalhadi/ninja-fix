package okhttp3.internal.connection;

import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal._UtilCommonKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0000¨\u0006\u0004"}, d2 = {"reorderForHappyEyeballs", "", "Ljava/net/InetAddress;", "addresses", "okhttp"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InetAddressOrderKt {
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final List<InetAddress> reorderForHappyEyeballs(@NotNull List<? extends InetAddress> addresses) {
        Intrinsics.echo(addresses, "addresses");
        if (addresses.size() >= 2) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : addresses) {
                if (((InetAddress) obj) instanceof Inet6Address) {
                    arrayList.add(obj);
                } else {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = arrayList;
            ArrayList arrayList4 = arrayList2;
            if (!arrayList3.isEmpty() && !arrayList4.isEmpty()) {
                return _UtilCommonKt.interleave(arrayList3, arrayList4);
            }
            return addresses;
        }
        return addresses;
    }
}
