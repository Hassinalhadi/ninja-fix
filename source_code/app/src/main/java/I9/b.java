package I9;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b {
    public static void alpha(Context context, String str, String str2) {
        Intrinsics.echo(context, "context");
    }

    public static void bravo(File sourceFile, String str) {
        Intrinsics.echo(sourceFile, "sourceFile");
    }

    public static void charlie(File sourceFile, Throwable th, String str) {
        Intrinsics.echo(sourceFile, "sourceFile");
    }

    public static void delta(String str, String reason) {
        Intrinsics.echo(reason, "reason");
    }

    public static void echo(File file, String str, String str2) {
        System.currentTimeMillis();
        Intrinsics.echo(file, "file");
    }

    public static void foxtrot(Context context, String str, String str2) {
        Intrinsics.echo(context, "context");
    }
}
