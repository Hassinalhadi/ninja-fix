package D9;

import E9.b;
import E9.c;
import E9.d;
import J2.n;
import android.content.Context;
import dagger.hilt.android.qualifiers.ApplicationContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class a {
    public static final a alpha = new Object();

    /* JADX WARN: Type inference failed for: r0v0, types: [E9.a, java.lang.Object] */
    @NotNull
    public final E9.a provideImageCompressor() {
        return new Object();
    }

    @NotNull
    public final b provideImagePreparer(@ApplicationContext @NotNull Context context, @NotNull d imageValidator, @NotNull E9.a imageCompressor, @NotNull c storageProvider) {
        Intrinsics.echo(context, "context");
        Intrinsics.echo(imageValidator, "imageValidator");
        Intrinsics.echo(imageCompressor, "imageCompressor");
        Intrinsics.echo(storageProvider, "storageProvider");
        return new n(context, imageValidator, imageCompressor, storageProvider);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [E9.c, java.lang.Object] */
    @NotNull
    public final c provideImageStorageProvider() {
        return new Object();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, E9.d] */
    @NotNull
    public final d provideImageValidator() {
        return new Object();
    }

    @NotNull
    public final J9.a provideUploadRequestValidator(@NotNull d imageValidator) {
        Intrinsics.echo(imageValidator, "imageValidator");
        return new J9.a(imageValidator);
    }
}
