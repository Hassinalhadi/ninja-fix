package s1;

import android.view.ContentInfo;
import android.view.View;
import g.C1718a;
import java.util.Objects;

/* loaded from: classes3.dex */
public abstract class as {
    public static String[] alpha(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static C2573f bravo(View view, C2573f c2573f) {
        ContentInfo oscar = c2573f.alpha.oscar();
        Objects.requireNonNull(oscar);
        ContentInfo performReceiveContent = view.performReceiveContent(oscar);
        if (performReceiveContent == null) {
            return null;
        }
        if (performReceiveContent == oscar) {
            return c2573f;
        }
        return new C2573f(new C1718a(performReceiveContent));
    }
}
