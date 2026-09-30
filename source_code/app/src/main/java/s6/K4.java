package s6;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class K4 {
    public static final Object alpha(ff.m mVar, ge.v p4) {
        Intrinsics.echo(mVar, "<this>");
        Intrinsics.echo(p4, "p");
        return mVar.invoke();
    }

    public static final File bravo(Context context, String name) {
        Intrinsics.echo(name, "name");
        String fileName = name.concat(".preferences_pb");
        Intrinsics.echo(fileName, "fileName");
        return new File(context.getApplicationContext().getFilesDir(), "datastore/".concat(fileName));
    }
}
