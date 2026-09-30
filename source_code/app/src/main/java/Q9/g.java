package Q9;

import android.content.Context;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;
import ea.C1645c;
import ea.InterfaceC1643a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LQ9/g;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lea/a;", "provideAnalyticsTracker", "(Landroid/content/Context;)Lea/a;", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@InstallIn({SingletonComponent.class})
/* loaded from: classes2.dex */
public final class g {

    @NotNull
    public static final g alpha = new g();

    private g() {
    }

    @NotNull
    public final InterfaceC1643a provideAnalyticsTracker(@ApplicationContext @NotNull Context context) {
        Intrinsics.echo(context, "context");
        return new C1645c(context);
    }
}
