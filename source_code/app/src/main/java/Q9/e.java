package Q9;

import Y9.k;
import android.content.Context;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LQ9/e;", "", "<init>", "()V", "Landroid/content/Context;", "context", "LY9/k;", "getLocationManager", "(Landroid/content/Context;)LY9/k;", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@InstallIn({SingletonComponent.class})
/* loaded from: classes2.dex */
public final class e {
    @NotNull
    public final k getLocationManager(@NotNull Context context) {
        Intrinsics.echo(context, "context");
        return new k(context);
    }
}
