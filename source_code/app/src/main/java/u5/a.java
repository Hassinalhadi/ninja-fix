package u5;

import com.clevertap.android.sdk.inapp.images.repo.FileResourcesRepoImpl;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ FileResourcesRepoImpl purple;

    public /* synthetic */ a(FileResourcesRepoImpl fileResourcesRepoImpl, int i4) {
        this.alpha = i4;
        this.purple = fileResourcesRepoImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.alpha) {
            case 0:
                return FileResourcesRepoImpl.alpha(this.purple, (String) obj);
            case 1:
                return FileResourcesRepoImpl.echo(this.purple, (Pair) obj);
            default:
                return Long.valueOf(FileResourcesRepoImpl.delta(this.purple, (String) obj));
        }
    }
}
