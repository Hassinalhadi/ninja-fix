package Fc;

import android.app.NotificationManager;
import android.content.Intent;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.app.network.network.models.AppState;
import com.app.network.network.models.AppUpdate;
import com.app.network.network.models.UpdateActions;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.common.LocationInfoActivity;
import delivery.samurai.android.ui.splash.SplashActivity;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;

/* loaded from: classes2.dex */
public final /* synthetic */ class ae implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ SplashActivity purple;

    public /* synthetic */ ae(SplashActivity splashActivity, int i4) {
        this.alpha = i4;
        this.purple = splashActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        UpdateActions updateActions;
        int i4;
        switch (this.alpha) {
            case 0:
                Pair pair = (Pair) obj;
                int i5 = SplashActivity.f12488L;
                SplashActivity splashActivity = this.purple;
                ((ProgressBar) splashActivity.gold().charlie).setVisibility(8);
                int intValue = ((Number) pair.getFirst()).intValue();
                if (intValue != 401) {
                    if (intValue != 905) {
                        switch (intValue) {
                            case 901:
                                String string = splashActivity.getString(R.string.app_name);
                                Intrinsics.delta(string, "getString(...)");
                                String string2 = splashActivity.getString(R.string.server_time_out_retry);
                                Intrinsics.delta(string2, "getString(...)");
                                String string3 = splashActivity.getString(R.string.retry);
                                Intrinsics.delta(string3, "getString(...)");
                                L9.d.olive(splashActivity, string, string2, string3, new af(splashActivity, 4), null, null, 48);
                                break;
                            case 902:
                                String string4 = splashActivity.getString(R.string.app_name);
                                Intrinsics.delta(string4, "getString(...)");
                                String string5 = splashActivity.getString(R.string.no_internet_retry);
                                Intrinsics.delta(string5, "getString(...)");
                                String string6 = splashActivity.getString(R.string.retry);
                                Intrinsics.delta(string6, "getString(...)");
                                L9.d.olive(splashActivity, string4, string5, string6, new af(splashActivity, 3), null, null, 48);
                                break;
                            case 903:
                                String string7 = splashActivity.getString(R.string.app_name);
                                Intrinsics.delta(string7, "getString(...)");
                                String string8 = splashActivity.getString(R.string.server_error_retry);
                                Intrinsics.delta(string8, "getString(...)");
                                String string9 = splashActivity.getString(R.string.retry);
                                Intrinsics.delta(string9, "getString(...)");
                                L9.d.olive(splashActivity, string7, string8, string9, new af(splashActivity, 6), null, null, 48);
                                break;
                        }
                    } else {
                        String string10 = splashActivity.getString(R.string.app_name);
                        Intrinsics.delta(string10, "getString(...)");
                        String str = (String) pair.getSecond();
                        String string11 = splashActivity.getString(android.R.string.ok);
                        Intrinsics.delta(string11, "getString(...)");
                        L9.d.olive(splashActivity, string10, str, string11, new af(splashActivity, 0), null, null, 48);
                    }
                } else {
                    L9.d.blue(splashActivity.lima());
                    Object systemService = splashActivity.getSystemService("notification");
                    Intrinsics.charlie(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
                    ((NotificationManager) systemService).cancelAll();
                    splashActivity.gray();
                }
                return Unit.INSTANCE;
            default:
                AppState appState = (AppState) obj;
                int i10 = SplashActivity.f12488L;
                if (appState != null) {
                    int i11 = ag.$EnumSwitchMapping$1[appState.ordinal()];
                    SplashActivity splashActivity2 = this.purple;
                    switch (i11) {
                        case 1:
                        case 8:
                            break;
                        case 2:
                            splashActivity2.gray();
                            break;
                        case 3:
                            splashActivity2.overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                            splashActivity2.xray((ImageView) splashActivity2.gold().bravo);
                            break;
                        case 4:
                            splashActivity2.romeo();
                            splashActivity2.november().golf();
                            splashActivity2.november().bravo();
                            break;
                        case 5:
                            AppUpdate india = L9.d.india(splashActivity2.lima());
                            if (india != null) {
                                updateActions = india.getUpdateAction();
                            } else {
                                updateActions = null;
                            }
                            if (updateActions == null) {
                                i4 = -1;
                            } else {
                                i4 = ag.$EnumSwitchMapping$0[updateActions.ordinal()];
                            }
                            if (i4 != -1 && i4 != 1) {
                                if (i4 != 2) {
                                    if (i4 == 3) {
                                        d3.k.azure(splashActivity2, india, null, 4);
                                        break;
                                    } else {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                } else {
                                    d3.k.azure(splashActivity2, india, new af(splashActivity2, 2), 2);
                                    break;
                                }
                            } else {
                                splashActivity2.juliet(new af(splashActivity2, 1));
                                break;
                            }
                        case 6:
                            splashActivity2.gray();
                            break;
                        case 7:
                            Intent intent = new Intent(splashActivity2, (Class<?>) LocationInfoActivity.class);
                            intent.putExtra("isFromLogin", false);
                            splashActivity2.startActivityForResult(intent, WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY);
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                }
                return Unit.INSTANCE;
        }
    }
}
