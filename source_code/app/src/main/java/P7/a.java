package P7;

import A2.p;
import G6.h;
import G6.q;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public abstract class a {
    public static final ap.a alpha = new ap.a(1);

    public static q alpha(Task task, Task task2) {
        G6.b bVar = new G6.b();
        h hVar = new h(bVar.alpha);
        p pVar = new p(hVar, new AtomicBoolean(false), bVar, 9);
        ap.a aVar = alpha;
        task.foxtrot(aVar, pVar);
        task2.foxtrot(aVar, pVar);
        return hVar.alpha;
    }
}
