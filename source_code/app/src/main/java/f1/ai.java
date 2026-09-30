package f1;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class ai implements Iterable {
    public final ArrayList alpha = new ArrayList();
    public final Context purple;

    public ai(Context context) {
        this.purple = context;
    }

    public final void alpha(Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null) {
            component = intent.resolveActivity(this.purple.getPackageManager());
        }
        if (component != null) {
            bravo(component);
        }
        this.alpha.add(intent);
    }

    public final void bravo(ComponentName componentName) {
        Context context = this.purple;
        ArrayList arrayList = this.alpha;
        int size = arrayList.size();
        try {
            for (Intent alpha = AbstractC1686f.alpha(context, componentName); alpha != null; alpha = AbstractC1686f.alpha(context, alpha.getComponent())) {
                arrayList.add(size, alpha);
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    public final void delta() {
        ArrayList arrayList = this.alpha;
        if (!arrayList.isEmpty()) {
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            this.purple.startActivities(intentArr, null);
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.alpha.iterator();
    }
}
