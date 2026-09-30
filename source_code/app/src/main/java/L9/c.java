package L9;

import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.GlideException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class c implements U3.f {
    public final /* synthetic */ Function1 alpha;

    public c(Function1 function1) {
        this.alpha = function1;
    }

    @Override // U3.f
    public final boolean hotel(GlideException glideException, V3.e target) {
        Intrinsics.echo(target, "target");
        return true;
    }

    @Override // U3.f
    public final boolean india(Object obj, Object model, E3.a dataSource) {
        Intrinsics.echo(model, "model");
        Intrinsics.echo(dataSource, "dataSource");
        this.alpha.invoke((Bitmap) obj);
        return true;
    }
}
