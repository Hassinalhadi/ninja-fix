package Jb;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import com.app.network.network.models.Captain;
import com.app.network.network.models.UserInfo;
import delivery.samurai.android.R;
import delivery.samurai.android.services.CaptainLocationMonitoringService;
import delivery.samurai.android.ui.homev2.HomeActivityV2;
import kotlin.jvm.internal.Intrinsics;
import t6.AbstractC3016k2;
import z3.C3462a;

/* loaded from: classes2.dex */
public final class ax extends BroadcastReceiver {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ HomeActivityV2 bravo;

    public /* synthetic */ ax(HomeActivityV2 homeActivityV2, int i4) {
        this.alpha = i4;
        this.bravo = homeActivityV2;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String str;
        Captain captain;
        int i4 = 1;
        boolean z2 = false;
        String str2 = null;
        switch (this.alpha) {
            case 0:
                int i5 = HomeActivityV2.f12269k0;
                final HomeActivityV2 homeActivityV2 = this.bravo;
                if (homeActivityV2.green()) {
                    if (intent != null) {
                        str = intent.getAction();
                    } else {
                        str = null;
                    }
                    if (Intrinsics.areEqual(str, homeActivityV2.lavender().action("ACCURACY_DEGRADED"))) {
                        C3462a.alpha("LocationFlow", 12, "Received accuracy degraded broadcast in HomeActivityV2", null);
                        if (context == null) {
                            context = homeActivityV2;
                        }
                        if (L9.d.victor(context)) {
                            C3462a.alpha("LocationFlow", 12, "[ACCURACY_FALSE_POSITIVE] Accuracy degraded broadcast received but accuracy is actually HIGH - ignoring (false positive)", null);
                            return;
                        }
                        C3462a.alpha("LocationFlow", 12, "[ACCURACY_VERIFIED] Accuracy is actually degraded - showing warning dialog", null);
                        if (homeActivityV2.green() && !homeActivityV2.f12296i0) {
                            homeActivityV2.f12296i0 = true;
                            Fe.c cVar = new Fe.c(homeActivityV2);
                            String string = homeActivityV2.getString(R.string.location_accuracy_reduced_title);
                            androidx.appcompat.app.d dVar = (androidx.appcompat.app.d) cVar.red;
                            dVar.delta = string;
                            dVar.foxtrot = homeActivityV2.getString(R.string.location_accuracy_reduced_message);
                            final int i10 = 7;
                            cVar.mike(homeActivityV2.getString(R.string.open_settings), new DialogInterface.OnClickListener() { // from class: Jb.an
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i11) {
                                    HomeActivityV2 homeActivityV22 = homeActivityV2;
                                    switch (i10) {
                                        case 0:
                                            int i12 = HomeActivityV2.f12269k0;
                                            try {
                                                homeActivityV22.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                                                return;
                                            } catch (Exception unused) {
                                                String string2 = homeActivityV22.getString(R.string.unable_to_open_settings);
                                                Intrinsics.delta(string2, "getString(...)");
                                                L9.d.pink(homeActivityV22, string2);
                                                return;
                                            }
                                        case 1:
                                            int i13 = HomeActivityV2.f12269k0;
                                            try {
                                                Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                                                intent2.setData(Uri.parse("package:" + homeActivityV22.getPackageName()));
                                                intent2.setFlags(268435456);
                                                homeActivityV22.startActivity(intent2);
                                                return;
                                            } catch (Exception unused2) {
                                                String string3 = homeActivityV22.getString(R.string.unable_to_open_settings);
                                                Intrinsics.delta(string3, "getString(...)");
                                                L9.d.pink(homeActivityV22, string3);
                                                return;
                                            }
                                        case 2:
                                            int i14 = HomeActivityV2.f12269k0;
                                            String string4 = homeActivityV22.getString(R.string.must_grant_precise_location);
                                            Intrinsics.delta(string4, "getString(...)");
                                            L9.d.pink(homeActivityV22, string4);
                                            return;
                                        case 3:
                                            int i15 = HomeActivityV2.f12269k0;
                                            try {
                                                Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                                                intent3.setData(Uri.parse("package:" + homeActivityV22.getPackageName()));
                                                intent3.setFlags(268435456);
                                                homeActivityV22.startActivity(intent3);
                                                return;
                                            } catch (Exception unused3) {
                                                String string5 = homeActivityV22.getString(R.string.unable_to_open_settings);
                                                Intrinsics.delta(string5, "getString(...)");
                                                L9.d.pink(homeActivityV22, string5);
                                                return;
                                            }
                                        case 4:
                                            int i16 = HomeActivityV2.f12269k0;
                                            String string6 = homeActivityV22.getString(R.string.background_location_required_blocking);
                                            Intrinsics.delta(string6, "getString(...)");
                                            L9.d.pink(homeActivityV22, string6);
                                            return;
                                        case 5:
                                            int i17 = HomeActivityV2.f12269k0;
                                            try {
                                                homeActivityV22.startActivity(new Intent("android.settings.APPLICATION_DEVELOPMENT_SETTINGS"));
                                                return;
                                            } catch (Exception unused4) {
                                                homeActivityV22.startActivity(new Intent("android.settings.SETTINGS"));
                                                return;
                                            }
                                        case 6:
                                            int i18 = HomeActivityV2.f12269k0;
                                            String string7 = homeActivityV22.getString(R.string.dialog_system_location_disabled_message);
                                            Intrinsics.delta(string7, "getString(...)");
                                            L9.d.pink(homeActivityV22, string7);
                                            return;
                                        case 7:
                                            int i19 = HomeActivityV2.f12269k0;
                                            try {
                                                homeActivityV22.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                                                return;
                                            } catch (Exception unused5) {
                                                String string8 = homeActivityV22.getString(R.string.unable_to_open_settings);
                                                Intrinsics.delta(string8, "getString(...)");
                                                L9.d.pink(homeActivityV22, string8);
                                                return;
                                            }
                                        case 8:
                                            int i20 = HomeActivityV2.f12269k0;
                                            try {
                                                Intent intent4 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                                                intent4.setData(Uri.parse("package:" + homeActivityV22.getPackageName()));
                                                intent4.setFlags(268435456);
                                                homeActivityV22.startActivity(intent4);
                                                return;
                                            } catch (Exception unused6) {
                                                String string9 = homeActivityV22.getString(R.string.unable_to_open_settings);
                                                Intrinsics.delta(string9, "getString(...)");
                                                L9.d.pink(homeActivityV22, string9);
                                                return;
                                            }
                                        case 9:
                                            int i21 = HomeActivityV2.f12269k0;
                                            String string10 = homeActivityV22.getString(R.string.must_grant_precise_location);
                                            Intrinsics.delta(string10, "getString(...)");
                                            L9.d.pink(homeActivityV22, string10);
                                            return;
                                        case 10:
                                            int i22 = HomeActivityV2.f12269k0;
                                            homeActivityV22.getSharedPreferences("LocationPermission", 0).edit().putBoolean("settings_opened_for_location", true).apply();
                                            homeActivityV22.getSharedPreferences("LocationPermission", 0).edit().putLong("settings_opened_timestamp", System.currentTimeMillis()).apply();
                                            try {
                                                Intent intent5 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                                                intent5.setData(Uri.parse("package:" + homeActivityV22.getPackageName()));
                                                intent5.setFlags(268435456);
                                                homeActivityV22.startActivity(intent5);
                                                return;
                                            } catch (Exception unused7) {
                                                String string11 = homeActivityV22.getString(R.string.unable_to_open_settings);
                                                Intrinsics.delta(string11, "getString(...)");
                                                L9.d.pink(homeActivityV22, string11);
                                                return;
                                            }
                                        case 11:
                                            int i23 = HomeActivityV2.f12269k0;
                                            String string12 = homeActivityV22.getString(R.string.support_feature_coming_soon);
                                            Intrinsics.delta(string12, "getString(...)");
                                            L9.d.pink(homeActivityV22, string12);
                                            return;
                                        case 12:
                                            int i24 = HomeActivityV2.f12269k0;
                                            new Ua.o().romeo(homeActivityV22.getSupportFragmentManager(), "LocationPermissionHelp");
                                            return;
                                        default:
                                            int i25 = HomeActivityV2.f12269k0;
                                            homeActivityV22.ivory();
                                            return;
                                    }
                                }
                            });
                            cVar.lima(homeActivityV2.getString(R.string.later), new ar(0));
                            dVar.mike = true;
                            dVar.november = new Ba.d(i4, homeActivityV2);
                            androidx.appcompat.app.g foxtrot = cVar.foxtrot();
                            homeActivityV2.f12295h0 = foxtrot;
                            foxtrot.show();
                            return;
                        }
                        return;
                    }
                    if (Intrinsics.areEqual(str, homeActivityV2.lavender().action("ACCURACY_RESTORED"))) {
                        C3462a.alpha("LocationFlow", 12, "Received accuracy restored broadcast in HomeActivityV2", null);
                        androidx.appcompat.app.g gVar = homeActivityV2.f12295h0;
                        if (gVar != null) {
                            gVar.dismiss();
                        }
                        homeActivityV2.f12295h0 = null;
                        homeActivityV2.f12296i0 = false;
                        return;
                    }
                    if (Intrinsics.areEqual(str, homeActivityV2.lavender().action("LOCATION_STUCK"))) {
                        C3462a.alpha("LocationFlow", 12, "Received location stuck broadcast in HomeActivityV2", null);
                        if (homeActivityV2.green()) {
                            Fe.c cVar2 = new Fe.c(homeActivityV2);
                            String string2 = homeActivityV2.getString(R.string.location_stuck_title);
                            androidx.appcompat.app.d dVar2 = (androidx.appcompat.app.d) cVar2.red;
                            dVar2.delta = string2;
                            dVar2.foxtrot = homeActivityV2.getString(R.string.location_stuck_message);
                            final int i11 = 5;
                            cVar2.mike(homeActivityV2.getString(R.string.location_stuck_open_settings), new DialogInterface.OnClickListener() { // from class: Jb.an
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i112) {
                                    HomeActivityV2 homeActivityV22 = homeActivityV2;
                                    switch (i11) {
                                        case 0:
                                            int i12 = HomeActivityV2.f12269k0;
                                            try {
                                                homeActivityV22.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                                                return;
                                            } catch (Exception unused) {
                                                String string22 = homeActivityV22.getString(R.string.unable_to_open_settings);
                                                Intrinsics.delta(string22, "getString(...)");
                                                L9.d.pink(homeActivityV22, string22);
                                                return;
                                            }
                                        case 1:
                                            int i13 = HomeActivityV2.f12269k0;
                                            try {
                                                Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                                                intent2.setData(Uri.parse("package:" + homeActivityV22.getPackageName()));
                                                intent2.setFlags(268435456);
                                                homeActivityV22.startActivity(intent2);
                                                return;
                                            } catch (Exception unused2) {
                                                String string3 = homeActivityV22.getString(R.string.unable_to_open_settings);
                                                Intrinsics.delta(string3, "getString(...)");
                                                L9.d.pink(homeActivityV22, string3);
                                                return;
                                            }
                                        case 2:
                                            int i14 = HomeActivityV2.f12269k0;
                                            String string4 = homeActivityV22.getString(R.string.must_grant_precise_location);
                                            Intrinsics.delta(string4, "getString(...)");
                                            L9.d.pink(homeActivityV22, string4);
                                            return;
                                        case 3:
                                            int i15 = HomeActivityV2.f12269k0;
                                            try {
                                                Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                                                intent3.setData(Uri.parse("package:" + homeActivityV22.getPackageName()));
                                                intent3.setFlags(268435456);
                                                homeActivityV22.startActivity(intent3);
                                                return;
                                            } catch (Exception unused3) {
                                                String string5 = homeActivityV22.getString(R.string.unable_to_open_settings);
                                                Intrinsics.delta(string5, "getString(...)");
                                                L9.d.pink(homeActivityV22, string5);
                                                return;
                                            }
                                        case 4:
                                            int i16 = HomeActivityV2.f12269k0;
                                            String string6 = homeActivityV22.getString(R.string.background_location_required_blocking);
                                            Intrinsics.delta(string6, "getString(...)");
                                            L9.d.pink(homeActivityV22, string6);
                                            return;
                                        case 5:
                                            int i17 = HomeActivityV2.f12269k0;
                                            try {
                                                homeActivityV22.startActivity(new Intent("android.settings.APPLICATION_DEVELOPMENT_SETTINGS"));
                                                return;
                                            } catch (Exception unused4) {
                                                homeActivityV22.startActivity(new Intent("android.settings.SETTINGS"));
                                                return;
                                            }
                                        case 6:
                                            int i18 = HomeActivityV2.f12269k0;
                                            String string7 = homeActivityV22.getString(R.string.dialog_system_location_disabled_message);
                                            Intrinsics.delta(string7, "getString(...)");
                                            L9.d.pink(homeActivityV22, string7);
                                            return;
                                        case 7:
                                            int i19 = HomeActivityV2.f12269k0;
                                            try {
                                                homeActivityV22.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                                                return;
                                            } catch (Exception unused5) {
                                                String string8 = homeActivityV22.getString(R.string.unable_to_open_settings);
                                                Intrinsics.delta(string8, "getString(...)");
                                                L9.d.pink(homeActivityV22, string8);
                                                return;
                                            }
                                        case 8:
                                            int i20 = HomeActivityV2.f12269k0;
                                            try {
                                                Intent intent4 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                                                intent4.setData(Uri.parse("package:" + homeActivityV22.getPackageName()));
                                                intent4.setFlags(268435456);
                                                homeActivityV22.startActivity(intent4);
                                                return;
                                            } catch (Exception unused6) {
                                                String string9 = homeActivityV22.getString(R.string.unable_to_open_settings);
                                                Intrinsics.delta(string9, "getString(...)");
                                                L9.d.pink(homeActivityV22, string9);
                                                return;
                                            }
                                        case 9:
                                            int i21 = HomeActivityV2.f12269k0;
                                            String string10 = homeActivityV22.getString(R.string.must_grant_precise_location);
                                            Intrinsics.delta(string10, "getString(...)");
                                            L9.d.pink(homeActivityV22, string10);
                                            return;
                                        case 10:
                                            int i22 = HomeActivityV2.f12269k0;
                                            homeActivityV22.getSharedPreferences("LocationPermission", 0).edit().putBoolean("settings_opened_for_location", true).apply();
                                            homeActivityV22.getSharedPreferences("LocationPermission", 0).edit().putLong("settings_opened_timestamp", System.currentTimeMillis()).apply();
                                            try {
                                                Intent intent5 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                                                intent5.setData(Uri.parse("package:" + homeActivityV22.getPackageName()));
                                                intent5.setFlags(268435456);
                                                homeActivityV22.startActivity(intent5);
                                                return;
                                            } catch (Exception unused7) {
                                                String string11 = homeActivityV22.getString(R.string.unable_to_open_settings);
                                                Intrinsics.delta(string11, "getString(...)");
                                                L9.d.pink(homeActivityV22, string11);
                                                return;
                                            }
                                        case 11:
                                            int i23 = HomeActivityV2.f12269k0;
                                            String string12 = homeActivityV22.getString(R.string.support_feature_coming_soon);
                                            Intrinsics.delta(string12, "getString(...)");
                                            L9.d.pink(homeActivityV22, string12);
                                            return;
                                        case 12:
                                            int i24 = HomeActivityV2.f12269k0;
                                            new Ua.o().romeo(homeActivityV22.getSupportFragmentManager(), "LocationPermissionHelp");
                                            return;
                                        default:
                                            int i25 = HomeActivityV2.f12269k0;
                                            homeActivityV22.ivory();
                                            return;
                                    }
                                }
                            });
                            dVar2.india = dVar2.alpha.getText(android.R.string.ok);
                            dVar2.juliet = null;
                            cVar2.november();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 1:
                C3462a.alpha("LocationFlow", 12, "Received compliance violation broadcast from service", null);
                HomeActivityV2.gold(this.bravo);
                return;
            case 2:
                this.bravo.plum();
                return;
            default:
                if (intent != null) {
                    str2 = intent.getAction();
                }
                if (Intrinsics.areEqual(str2, "SOCKET_CONNECT_MESSAGE")) {
                    boolean z10 = CaptainLocationMonitoringService.f12066D;
                    d3.k kVar = this.bravo;
                    if (AbstractC3016k2.bravo(kVar)) {
                        UserInfo userInfo = (UserInfo) kVar.oscar().getValue();
                        if (userInfo != null && (captain = userInfo.getCaptain()) != null) {
                            z2 = Intrinsics.areEqual(captain.getReadyToWork(), Boolean.TRUE);
                        }
                        if (z2 && CaptainLocationMonitoringService.f12069G.get()) {
                            kVar.november().echo(kVar);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
