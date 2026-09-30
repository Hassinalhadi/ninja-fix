package Ua;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.common.LocationInfoActivity;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class f implements View.OnClickListener {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ LocationInfoActivity purple;
    public final /* synthetic */ androidx.appcompat.app.g red;

    public /* synthetic */ f(androidx.appcompat.app.g gVar, LocationInfoActivity locationInfoActivity) {
        this.alpha = 0;
        this.red = gVar;
        this.purple = locationInfoActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        androidx.appcompat.app.g gVar = this.red;
        LocationInfoActivity locationInfoActivity = this.purple;
        switch (this.alpha) {
            case 0:
                int i4 = LocationInfoActivity.Q;
                gVar.dismiss();
                if (locationInfoActivity.jade()) {
                    L9.d.blue(locationInfoActivity);
                }
                locationInfoActivity.finish();
                return;
            case 1:
                locationInfoActivity.f12244P = false;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + locationInfoActivity.getPackageName()));
                    intent.setFlags(268435456);
                    locationInfoActivity.startActivity(intent);
                    locationInfoActivity.lavender();
                    gVar.dismiss();
                    return;
                } catch (Exception unused) {
                    String string = locationInfoActivity.getString(R.string.unable_to_open_settings);
                    Intrinsics.delta(string, "getString(...)");
                    L9.d.pink(locationInfoActivity, string);
                    locationInfoActivity.f12244P = true;
                    return;
                }
            case 2:
                locationInfoActivity.f12244P = false;
                if (Build.VERSION.SDK_INT < 31) {
                    gVar.dismiss();
                    locationInfoActivity.gold();
                    return;
                }
                try {
                    Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent2.setData(Uri.parse("package:" + locationInfoActivity.getPackageName()));
                    intent2.setFlags(268435456);
                    locationInfoActivity.startActivity(intent2);
                    locationInfoActivity.lavender();
                    gVar.dismiss();
                    return;
                } catch (Exception unused2) {
                    String string2 = locationInfoActivity.getString(R.string.unable_to_open_settings);
                    Intrinsics.delta(string2, "getString(...)");
                    L9.d.pink(locationInfoActivity, string2);
                    locationInfoActivity.f12244P = true;
                    return;
                }
            default:
                int i5 = LocationInfoActivity.Q;
                try {
                    Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent3.setData(Uri.parse("package:" + locationInfoActivity.getPackageName()));
                    intent3.setFlags(268435456);
                    locationInfoActivity.startActivity(intent3);
                    locationInfoActivity.lavender();
                    gVar.dismiss();
                    return;
                } catch (Exception unused3) {
                    String string3 = locationInfoActivity.getString(R.string.unable_to_open_settings);
                    Intrinsics.delta(string3, "getString(...)");
                    L9.d.pink(locationInfoActivity, string3);
                    return;
                }
        }
    }

    public /* synthetic */ f(LocationInfoActivity locationInfoActivity, androidx.appcompat.app.g gVar, int i4) {
        this.alpha = i4;
        this.purple = locationInfoActivity;
        this.red = gVar;
    }
}
