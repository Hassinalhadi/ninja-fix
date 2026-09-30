package Ka;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vg.at;

/* loaded from: classes2.dex */
public final class a {
    @NotNull
    public final Ha.a provideCaptainsUniformsApi(@NotNull at retrofit) {
        Intrinsics.echo(retrofit, "retrofit");
        Object bravo = retrofit.bravo(Ha.a.class);
        Intrinsics.delta(bravo, "create(...)");
        return (Ha.a) bravo;
    }

    @NotNull
    public final Ia.a provideCaptainsUniformsRemoteDataSource(@NotNull Ha.a api) {
        Intrinsics.echo(api, "api");
        return new Ia.a(api);
    }

    @NotNull
    public final Na.b provideGetUniformStoresUseCase(@NotNull La.a repository) {
        Intrinsics.echo(repository, "repository");
        return new Na.b(repository);
    }
}
