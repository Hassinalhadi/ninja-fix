package F2;

import Tf.ah;
import java.io.File;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import r6.u;

/* loaded from: classes3.dex */
public final class e extends Lambda implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Lambda purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(Function0 function0, int i4) {
        super(0);
        this.alpha = i4;
        switch (i4) {
            case 1:
                this.purple = (Lambda) function0;
                super(0);
                return;
            case 2:
                this.purple = (Lambda) function0;
                super(0);
                return;
            default:
                this.purple = (Lambda) function0;
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ?? r02 = this.purple;
        switch (this.alpha) {
            case 0:
                r02.invoke();
                return Unit.INSTANCE;
            case 1:
                File file = (File) r02.invoke();
                Intrinsics.echo(file, "<this>");
                String name = file.getName();
                Intrinsics.delta(name, "getName(...)");
                if (Intrinsics.areEqual(StringsKt.purple('.', name, ""), "preferences_pb")) {
                    String str = ah.purple;
                    File absoluteFile = file.getAbsoluteFile();
                    Intrinsics.delta(absoluteFile, "file.absoluteFile");
                    return u.charlie(absoluteFile);
                }
                throw new IllegalStateException(("File extension for file: " + file + " does not match required extension for Preferences file: preferences_pb").toString());
            default:
                return CollectionsKt.D((Iterable) r02.invoke());
        }
    }
}
