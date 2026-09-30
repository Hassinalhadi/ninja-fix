package l2;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class n extends RemoteCallbackList {
    public final /* synthetic */ MultiInstanceInvalidationService alpha;

    public n(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.alpha = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface, Object cookie) {
        h callback = (h) iInterface;
        Intrinsics.echo(callback, "callback");
        Intrinsics.echo(cookie, "cookie");
        this.alpha.purple.remove((Integer) cookie);
    }
}
