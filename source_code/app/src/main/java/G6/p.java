package G6;

import android.location.Location;
import com.google.android.gms.tasks.Task;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class p implements f, c, e {
    public final h alpha;

    public /* synthetic */ p(h hVar) {
        this.alpha = hVar;
    }

    @Override // G6.f
    public void alpha() {
        this.alpha.alpha.quebec();
    }

    @Override // G6.c
    public /* synthetic */ Object ivory(Task task) {
        boolean juliet = task.juliet();
        h hVar = this.alpha;
        if (juliet) {
            hVar.delta((Location) task.hotel());
            return null;
        }
        Exception golf = task.golf();
        Objects.requireNonNull(golf);
        hVar.charlie(golf);
        return null;
    }

    @Override // G6.e
    public /* synthetic */ void onComplete(Task task) {
        if (!task.juliet()) {
            Exception golf = task.golf();
            Objects.requireNonNull(golf);
            this.alpha.charlie(golf);
        }
    }
}
