package com.google.android.gms.common.api;

import V5.x;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import ao.ad;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.internal.measurement.ai;

@KeepName
/* loaded from: classes2.dex */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {
    public static final /* synthetic */ int purple = 0;
    public int alpha = 0;

    @Override // android.app.Activity
    public final void onActivityResult(int i4, int i5, Intent intent) {
        super.onActivityResult(i4, i5, intent);
        if (i4 == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.alpha = 0;
            setResult(i5, intent);
            if (booleanExtra) {
                T5.e foxtrot = T5.e.foxtrot(this);
                if (i5 != -1) {
                    if (i5 == 0) {
                        foxtrot.golf(new ConnectionResult(13, null), getIntent().getIntExtra("failing_client_id", -1));
                    }
                } else {
                    ai aiVar = foxtrot.november;
                    aiVar.sendMessage(aiVar.obtainMessage(3));
                }
            }
        } else if (i4 == 2) {
            this.alpha = 0;
            setResult(i5, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.alpha = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        GoogleApiActivity googleApiActivity;
        super.onCreate(bundle);
        if (bundle != null) {
            this.alpha = bundle.getInt("resolution");
        }
        if (this.alpha != 1) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                Log.e("GoogleApiActivity", "Activity started without extras");
                finish();
                return;
            }
            PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
            Integer num = (Integer) extras.get("error_code");
            if (pendingIntent == null && num == null) {
                Log.e("GoogleApiActivity", "Activity started without resolution");
                finish();
                return;
            }
            if (pendingIntent != null) {
                try {
                    googleApiActivity = this;
                    try {
                        googleApiActivity.startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                        googleApiActivity.alpha = 1;
                    } catch (ActivityNotFoundException e) {
                        e = e;
                        if (extras.getBoolean("notify_manager", true)) {
                            T5.e.foxtrot(this).golf(new ConnectionResult(22, null), getIntent().getIntExtra("failing_client_id", -1));
                        } else {
                            String gray = ad.gray("Activity not found while launching ", pendingIntent.toString(), ".");
                            if (Build.FINGERPRINT.contains("generic")) {
                                gray = gray.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                            }
                            Log.e("GoogleApiActivity", gray, e);
                        }
                        googleApiActivity.alpha = 1;
                        finish();
                    } catch (IntentSender.SendIntentException e4) {
                        e = e4;
                        Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e);
                        finish();
                    }
                } catch (ActivityNotFoundException e5) {
                    e = e5;
                    googleApiActivity = this;
                } catch (IntentSender.SendIntentException e10) {
                    e = e10;
                }
            } else {
                x.hotel(num);
                GoogleApiAvailability.getInstance().showErrorDialogFragment(this, num.intValue(), 2, this);
                this.alpha = 1;
            }
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.alpha);
        super.onSaveInstanceState(bundle);
    }
}
