package as;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes3.dex */
public abstract class e implements ServiceConnection {
    private Context mApplicationContext;

    public Context getApplicationContext() {
        return this.mApplicationContext;
    }

    public abstract void onCustomTabsServiceConnected(ComponentName componentName, b bVar);

    /* JADX WARN: Type inference failed for: r1v3, types: [ab.b, java.lang.Object] */
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ab.d dVar;
        if (this.mApplicationContext != null) {
            int i4 = ab.c.golf;
            if (iBinder == null) {
                dVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface(ab.d.bravo);
                if (queryLocalInterface != null && (queryLocalInterface instanceof ab.d)) {
                    dVar = (ab.d) queryLocalInterface;
                } else {
                    ?? obj = new Object();
                    obj.golf = iBinder;
                    dVar = obj;
                }
            }
            onCustomTabsServiceConnected(componentName, new b(dVar, componentName));
            return;
        }
        throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
    }

    public void setApplicationContext(Context context) {
        this.mApplicationContext = context;
    }
}
