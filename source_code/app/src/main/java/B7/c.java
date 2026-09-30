package B7;

import B9.ab;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import g1.AbstractC1732a;
import i8.InterfaceC1904b;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements InterfaceC1904b {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object bravo;
    public final /* synthetic */ Object charlie;

    public /* synthetic */ c(int i4, Object obj, Object obj2) {
        this.alpha = i4;
        this.bravo = obj;
        this.charlie = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, n8.a] */
    @Override // i8.InterfaceC1904b
    public final Object get() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        switch (this.alpha) {
            case 0:
                g gVar = (g) this.bravo;
                String delta = gVar.delta();
                Context context = (Context) this.charlie;
                ?? obj = new Object();
                int i4 = Build.VERSION.SDK_INT;
                if (i4 >= 24) {
                    if (i4 >= 24) {
                        context = AbstractC1732a.alpha(context);
                    } else {
                        context = null;
                    }
                }
                SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.common.prefs:" + delta, 0);
                boolean z2 = true;
                if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
                    z2 = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
                } else {
                    try {
                        PackageManager packageManager = context.getPackageManager();
                        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
                            z2 = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                obj.alpha = z2;
                return obj;
            case 1:
                I7.g gVar2 = (I7.g) this.bravo;
                gVar2.getClass();
                I7.b bVar = (I7.b) this.charlie;
                return bVar.foxtrot.create(new ab(bVar, gVar2));
            default:
                return new g8.g((Context) this.charlie, (String) this.bravo);
        }
    }

    public /* synthetic */ c(Context context, String str) {
        this.alpha = 2;
        this.charlie = context;
        this.bravo = str;
    }
}
