package okhttp3.internal.publicsuffix;

import Tf.ah;
import Tf.ap;
import Tf.u;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lokhttp3/internal/publicsuffix/ResourcePublicSuffixList;", "Lokhttp3/internal/publicsuffix/BasePublicSuffixList;", "LTf/ah;", "path", "LTf/u;", "fileSystem", "<init>", "(LTf/ah;LTf/u;)V", "LTf/ap;", "listSource", "()LTf/ap;", "LTf/ah;", "getPath", "()LTf/ah;", "LTf/u;", "getFileSystem", "()LTf/u;", "Companion", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ResourcePublicSuffixList extends BasePublicSuffixList {

    @NotNull
    public static final ah PUBLIC_SUFFIX_RESOURCE;

    @NotNull
    private final u fileSystem;

    @NotNull
    private final ah path;

    static {
        String str = ah.purple;
        PUBLIC_SUFFIX_RESOURCE = r6.u.bravo("okhttp3/internal/publicsuffix/PublicSuffixDatabase.list", false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ResourcePublicSuffixList() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @NotNull
    public final u getFileSystem() {
        return this.fileSystem;
    }

    @Override // okhttp3.internal.publicsuffix.BasePublicSuffixList
    @NotNull
    public ap listSource() {
        return this.fileSystem.source(getPath());
    }

    public /* synthetic */ ResourcePublicSuffixList(ah ahVar, u uVar, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? PUBLIC_SUFFIX_RESOURCE : ahVar, (i4 & 2) != 0 ? u.RESOURCES : uVar);
    }

    @Override // okhttp3.internal.publicsuffix.BasePublicSuffixList
    @NotNull
    public ah getPath() {
        return this.path;
    }

    public ResourcePublicSuffixList(@NotNull ah path, @NotNull u fileSystem) {
        Intrinsics.echo(path, "path");
        Intrinsics.echo(fileSystem, "fileSystem");
        this.path = path;
        this.fileSystem = fileSystem;
    }
}
