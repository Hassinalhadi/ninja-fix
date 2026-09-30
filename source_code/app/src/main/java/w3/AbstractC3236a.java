package w3;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.util.Pair;
import java.util.Arrays;

/* renamed from: w3.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3236a {
    public static final void alpha(Activity activity, Intent intent, Pair... pairArr) {
        activity.startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(activity, (Pair[]) Arrays.copyOf(pairArr, pairArr.length)).toBundle());
    }
}
