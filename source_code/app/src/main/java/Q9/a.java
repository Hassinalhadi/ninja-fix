package Q9;

import android.content.Context;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;
import delivery.samurai.android.AndroidApp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import t6.V2;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"LQ9/a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Ldelivery/samurai/android/AndroidApp;", "provideAndroidApp", "(Landroid/content/Context;)Ldelivery/samurai/android/AndroidApp;", "provideContext$app_ProductionRelease", "()Landroid/content/Context;", "provideContext", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@InstallIn({SingletonComponent.class})
/* loaded from: classes2.dex */
public final class a {
    @NotNull
    public final AndroidApp provideAndroidApp(@ApplicationContext @NotNull Context context) {
        Intrinsics.echo(context, "context");
        return (AndroidApp) context;
    }

    @NotNull
    public final Context provideContext$app_ProductionRelease() {
        AndroidApp androidApp = AndroidApp.yellow;
        return V2.charlie();
    }
}
