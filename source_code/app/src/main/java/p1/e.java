package p1;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class e implements Callable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ String purple;
    public final /* synthetic */ Context red;
    public final /* synthetic */ int silver;
    public final /* synthetic */ Object teal;

    public /* synthetic */ e(String str, Context context, Object obj, int i4, int i5) {
        this.alpha = i5;
        this.purple = str;
        this.red = context;
        this.teal = obj;
        this.silver = i4;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i4 = this.silver;
        Object obj = this.teal;
        Context context = this.red;
        String str = this.purple;
        switch (this.alpha) {
            case 0:
                Object[] objArr = {(d) obj};
                ArrayList arrayList = new ArrayList(1);
                Object obj2 = objArr[0];
                Objects.requireNonNull(obj2);
                arrayList.add(obj2);
                return g.bravo(str, context, Collections.unmodifiableList(arrayList), i4);
            default:
                try {
                    return g.bravo(str, context, (ArrayList) obj, i4);
                } catch (Throwable unused) {
                    return new f(-3);
                }
        }
    }
}
