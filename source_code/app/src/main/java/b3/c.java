package b3;

import R7.U;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.List;

/* loaded from: classes3.dex */
public final class c extends AbstractC0715a {
    public int alpha = 0;
    public final Context bravo;
    public P5.c charlie;
    public ServiceConnectionC0716b delta;

    public c(Context context) {
        this.bravo = context.getApplicationContext();
    }

    @Override // b3.AbstractC0715a
    public final e alpha() {
        if (this.alpha == 2 && this.charlie != null && this.delta != null) {
            Bundle bundle = new Bundle();
            bundle.putString("package_name", this.bravo.getPackageName());
            try {
                return new e(((P5.a) this.charlie).bravo(bundle));
            } catch (RemoteException e) {
                U.charlie("RemoteException getting install referrer information");
                this.alpha = 0;
                throw e;
            }
        }
        throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
    }

    public final void bravo(d dVar) {
        boolean z2;
        ServiceInfo serviceInfo;
        int i4 = this.alpha;
        if (i4 == 2 && this.charlie != null && this.delta != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            U.bravo("Service connection is valid. No need to re-initialize.");
            dVar.onInstallReferrerSetupFinished(0);
            return;
        }
        if (i4 == 1) {
            U.charlie("Client is already in the process of connecting to the service.");
            dVar.onInstallReferrerSetupFinished(3);
            return;
        }
        if (i4 == 3) {
            U.charlie("Client was already closed and can't be reused. Please create another instance.");
            dVar.onInstallReferrerSetupFinished(3);
            return;
        }
        U.bravo("Starting install referrer service setup.");
        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        Context context = this.bravo;
        List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
        if (queryIntentServices != null && !queryIntentServices.isEmpty() && (serviceInfo = queryIntentServices.get(0).serviceInfo) != null) {
            String str = serviceInfo.packageName;
            String str2 = serviceInfo.name;
            if ("com.android.vending".equals(str) && str2 != null) {
                try {
                    if (context.getPackageManager().getPackageInfo("com.android.vending", 128).versionCode >= 80837300) {
                        Intent intent2 = new Intent(intent);
                        ServiceConnectionC0716b serviceConnectionC0716b = new ServiceConnectionC0716b(0, this, dVar);
                        this.delta = serviceConnectionC0716b;
                        try {
                            if (context.bindService(intent2, serviceConnectionC0716b, 1)) {
                                U.bravo("Service was bonded successfully.");
                                return;
                            }
                            U.charlie("Connection to service is blocked.");
                            this.alpha = 0;
                            dVar.onInstallReferrerSetupFinished(1);
                            return;
                        } catch (SecurityException unused) {
                            U.charlie("No permission to connect to service.");
                            this.alpha = 0;
                            dVar.onInstallReferrerSetupFinished(4);
                            return;
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                }
            }
            U.charlie("Play Store missing or incompatible. Version 8.3.73 or later required.");
            this.alpha = 0;
            dVar.onInstallReferrerSetupFinished(2);
            return;
        }
        this.alpha = 0;
        U.bravo("Install Referrer service unavailable on device.");
        dVar.onInstallReferrerSetupFinished(2);
    }
}
