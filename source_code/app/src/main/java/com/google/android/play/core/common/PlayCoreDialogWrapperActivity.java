package com.google.android.play.core.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;

/* loaded from: classes2.dex */
public class PlayCoreDialogWrapperActivity extends Activity {
    public ResultReceiver alpha;

    @Override // android.app.Activity
    public final void onActivityResult(int i4, int i5, Intent intent) {
        ResultReceiver resultReceiver;
        super.onActivityResult(i4, i5, intent);
        if (i4 == 0 && (resultReceiver = this.alpha) != null) {
            if (i5 == -1) {
                resultReceiver.send(1, new Bundle());
            } else if (i5 == 0) {
                resultReceiver.send(2, new Bundle());
            }
        }
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        Intent intent;
        PlayCoreDialogWrapperActivity playCoreDialogWrapperActivity;
        int intExtra = getIntent().getIntExtra("window_flags", 0);
        PendingIntent pendingIntent = null;
        if (intExtra != 0) {
            getWindow().getDecorView().setSystemUiVisibility(intExtra);
            Intent intent2 = new Intent();
            intent2.putExtra("window_flags", intExtra);
            intent = intent2;
        } else {
            intent = null;
        }
        super.onCreate(bundle);
        if (bundle == null) {
            this.alpha = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
            Bundle extras = getIntent().getExtras();
            if (extras != null) {
                pendingIntent = (PendingIntent) extras.get("confirmation_intent");
            }
            if (extras != null && pendingIntent != null) {
                try {
                    playCoreDialogWrapperActivity = this;
                    try {
                        playCoreDialogWrapperActivity.startIntentSenderForResult(pendingIntent.getIntentSender(), 0, intent, 0, 0, 0);
                    } catch (IntentSender.SendIntentException unused) {
                        ResultReceiver resultReceiver = playCoreDialogWrapperActivity.alpha;
                        if (resultReceiver != null) {
                            resultReceiver.send(3, new Bundle());
                        }
                        finish();
                    }
                } catch (IntentSender.SendIntentException unused2) {
                    playCoreDialogWrapperActivity = this;
                }
            } else {
                ResultReceiver resultReceiver2 = this.alpha;
                if (resultReceiver2 != null) {
                    resultReceiver2.send(3, new Bundle());
                }
                finish();
            }
        } else {
            this.alpha = (ResultReceiver) bundle.getParcelable("result_receiver");
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("result_receiver", this.alpha);
    }
}
