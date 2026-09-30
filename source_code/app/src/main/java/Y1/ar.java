package Y1;

import android.net.Uri;
import android.os.Bundle;
import androidx.navigation.NavControllerViewModel;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ar {
    public static l alpha(H0.a aVar, aa destination, Bundle bundle, androidx.lifecycle.ab hostLifecycleState, NavControllerViewModel navControllerViewModel) {
        String uuid = UUID.randomUUID().toString();
        Intrinsics.delta(uuid, "toString(...)");
        Intrinsics.echo(destination, "destination");
        Intrinsics.echo(hostLifecycleState, "hostLifecycleState");
        return new l(aVar, destination, bundle, hostLifecycleState, navControllerViewModel, uuid, null);
    }

    public static String bravo(String s3) {
        Intrinsics.echo(s3, "s");
        String encode = Uri.encode(s3, null);
        Intrinsics.delta(encode, "encode(...)");
        return encode;
    }
}
