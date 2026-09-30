package zendesk.commonui;

import android.app.Activity;
import f1.AbstractC1683c;
import g1.AbstractC1735d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lzendesk/commonui/PermissionsHandler;", "", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "checkPermission", "", "permission", "", "requestPermission", "", "requestCode", "", "common-ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PermissionsHandler {

    @NotNull
    private final Activity activity;

    public PermissionsHandler(@NotNull Activity activity) {
        Intrinsics.echo(activity, "activity");
        this.activity = activity;
    }

    public final boolean checkPermission(@NotNull String permission) {
        Intrinsics.echo(permission, "permission");
        if (AbstractC1735d.alpha(this.activity, permission) == 0) {
            return true;
        }
        return false;
    }

    public final void requestPermission(@NotNull String permission, int requestCode) {
        Intrinsics.echo(permission, "permission");
        AbstractC1683c.echo(this.activity, new String[]{permission}, requestCode);
    }
}
