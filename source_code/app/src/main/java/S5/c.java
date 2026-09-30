package S5;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.tasks.Task;
import java.io.IOException;
import s6.V4;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements G6.c, G6.g {
    public static final /* synthetic */ c purple = new c(0);
    public static final /* synthetic */ c red = new c(1);
    public static final /* synthetic */ c silver = new c(2);
    public final /* synthetic */ int alpha;

    public /* synthetic */ c(int i4) {
        this.alpha = i4;
    }

    @Override // G6.c
    public Object ivory(Task task) {
        switch (this.alpha) {
            case 0:
                if (task.juliet()) {
                    return (Bundle) task.hotel();
                }
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Error making request: ".concat(String.valueOf(task.golf())));
                }
                throw new IOException("SERVICE_NOT_AVAILABLE", task.golf());
            default:
                Intent intent = (Intent) ((Bundle) task.hotel()).getParcelable("notification_data");
                if (intent != null) {
                    return new CloudMessage(intent);
                }
                return null;
        }
    }

    @Override // G6.g
    public Task then(Object obj) {
        Bundle bundle = (Bundle) obj;
        int i4 = a.hotel;
        if (bundle != null && bundle.containsKey("google.messenger")) {
            return V4.echo(null);
        }
        return V4.echo(bundle);
    }
}
