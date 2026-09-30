package H2;

import A2.z;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* loaded from: classes3.dex */
public final class a extends d {
    public final /* synthetic */ int golf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Context context, L2.c cVar, int i4) {
        super(context, cVar);
        this.golf = i4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        if (r0.equals("android.intent.action.DEVICE_STORAGE_OK") == false) goto L20;
     */
    @Override // H2.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object alpha() {
        boolean z2;
        switch (this.golf) {
            case 0:
                Intent registerReceiver = this.bravo.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (registerReceiver == null) {
                    z.echo().charlie(b.alpha, "getInitialState - null intent received");
                    return Boolean.FALSE;
                }
                int intExtra = registerReceiver.getIntExtra("status", -1);
                if (intExtra != 2 && intExtra != 5) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case 1:
                Intent registerReceiver2 = this.bravo.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (registerReceiver2 == null) {
                    z.echo().charlie(c.alpha, "getInitialState - null intent received");
                    return Boolean.FALSE;
                }
                int intExtra2 = registerReceiver2.getIntExtra("status", -1);
                float intExtra3 = registerReceiver2.getIntExtra("level", -1) / registerReceiver2.getIntExtra("scale", -1);
                boolean z10 = true;
                if (intExtra2 != 1 && intExtra3 <= 0.15f) {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            default:
                Intent registerReceiver3 = this.bravo.registerReceiver(null, echo());
                boolean z11 = true;
                if (registerReceiver3 != null && registerReceiver3.getAction() != null) {
                    String action = registerReceiver3.getAction();
                    if (action != null) {
                        int hashCode = action.hashCode();
                        if (hashCode != -1181163412) {
                            if (hashCode == -730838620) {
                                break;
                            }
                        } else {
                            action.equals("android.intent.action.DEVICE_STORAGE_LOW");
                        }
                    }
                    z11 = false;
                }
                return Boolean.valueOf(z11);
        }
    }

    @Override // H2.d
    public final IntentFilter echo() {
        switch (this.golf) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.CHARGING");
                intentFilter.addAction("android.os.action.DISCHARGING");
                return intentFilter;
            case 1:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.BATTERY_OKAY");
                intentFilter2.addAction("android.intent.action.BATTERY_LOW");
                return intentFilter2;
            default:
                IntentFilter intentFilter3 = new IntentFilter();
                intentFilter3.addAction("android.intent.action.DEVICE_STORAGE_OK");
                intentFilter3.addAction("android.intent.action.DEVICE_STORAGE_LOW");
                return intentFilter3;
        }
    }

    @Override // H2.d
    public final void foxtrot(Intent intent) {
        switch (this.golf) {
            case 0:
                String action = intent.getAction();
                if (action != null) {
                    z.echo().alpha(b.alpha, "Received ".concat(action));
                    switch (action.hashCode()) {
                        case -1886648615:
                            if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                                bravo(Boolean.FALSE);
                                return;
                            }
                            return;
                        case -54942926:
                            if (action.equals("android.os.action.DISCHARGING")) {
                                bravo(Boolean.FALSE);
                                return;
                            }
                            return;
                        case 948344062:
                            if (action.equals("android.os.action.CHARGING")) {
                                bravo(Boolean.TRUE);
                                return;
                            }
                            return;
                        case 1019184907:
                            if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                                bravo(Boolean.TRUE);
                                return;
                            }
                            return;
                        default:
                            return;
                    }
                }
                return;
            case 1:
                if (intent.getAction() != null) {
                    z.echo().alpha(c.alpha, "Received " + intent.getAction());
                    String action2 = intent.getAction();
                    if (action2 != null) {
                        int hashCode = action2.hashCode();
                        if (hashCode != -1980154005) {
                            if (hashCode == 490310653 && action2.equals("android.intent.action.BATTERY_LOW")) {
                                bravo(Boolean.FALSE);
                                return;
                            }
                            return;
                        }
                        if (action2.equals("android.intent.action.BATTERY_OKAY")) {
                            bravo(Boolean.TRUE);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                if (intent.getAction() != null) {
                    z.echo().alpha(k.alpha, "Received " + intent.getAction());
                    String action3 = intent.getAction();
                    if (action3 != null) {
                        int hashCode2 = action3.hashCode();
                        if (hashCode2 != -1181163412) {
                            if (hashCode2 == -730838620 && action3.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                                bravo(Boolean.TRUE);
                                return;
                            }
                            return;
                        }
                        if (action3.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                            bravo(Boolean.FALSE);
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
