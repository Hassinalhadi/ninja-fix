package Y1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.widget.P0;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import pf.AbstractC2360j;

@as("activity")
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LY1/c;", "LY1/at;", "LY1/b;", "navigation-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public class c extends at {
    public final Context charlie;
    public final Activity delta;

    public c(Context context) {
        Object obj;
        Intrinsics.echo(context, "context");
        this.charlie = context;
        Iterator it = AbstractC2360j.lima(context, new X9.i(1)).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((Context) obj) instanceof Activity) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        this.delta = (Activity) obj;
    }

    @Override // Y1.at
    public final aa alpha() {
        return new aa(this);
    }

    @Override // Y1.at
    public final aa charlie(aa aaVar, Bundle bundle, aj ajVar) {
        Intent intent;
        int intExtra;
        aq aqVar;
        String encode;
        b bVar = (b) aaVar;
        Intent intent2 = bVar.yellow;
        He.b bVar2 = bVar.purple;
        if (intent2 != null) {
            Intent intent3 = new Intent(bVar.yellow);
            if (bundle != null) {
                intent3.putExtras(bundle);
                String str = bVar.f2267a;
                if (str != null && str.length() != 0) {
                    StringBuffer stringBuffer = new StringBuffer();
                    Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(str);
                    while (matcher.find()) {
                        String key = matcher.group(1);
                        Intrinsics.checkNotNull(key);
                        Intrinsics.echo(key, "key");
                        if (bundle.containsKey(key)) {
                            matcher.appendReplacement(stringBuffer, "");
                            k kVar = (k) bVar.india().get(key);
                            if (kVar != null) {
                                aqVar = kVar.alpha;
                            } else {
                                aqVar = null;
                            }
                            if (aqVar != null) {
                                encode = aqVar.foxtrot(aqVar.alpha(bundle, key));
                            } else {
                                encode = Uri.encode(String.valueOf(bundle.get(key)));
                            }
                            stringBuffer.append(encode);
                        } else {
                            throw new IllegalArgumentException(("Could not find " + key + " in " + bundle + " to fill data pattern " + str).toString());
                        }
                    }
                    matcher.appendTail(stringBuffer);
                    intent3.setData(Uri.parse(stringBuffer.toString()));
                }
            }
            Activity activity = this.delta;
            if (activity == null) {
                intent3.addFlags(268435456);
            }
            if (ajVar != null && ajVar.alpha) {
                intent3.addFlags(536870912);
            }
            int i4 = 0;
            if (activity != null && (intent = activity.getIntent()) != null && (intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:current", 0)) != 0) {
                intent3.putExtra("android-support-navigation:ActivityNavigator:source", intExtra);
            }
            intent3.putExtra("android-support-navigation:ActivityNavigator:current", bVar2.charlie);
            Context context = this.charlie;
            Resources resources = context.getResources();
            if (ajVar != null) {
                int i5 = ajVar.hotel;
                int i10 = ajVar.india;
                if ((i5 > 0 && Intrinsics.areEqual(resources.getResourceTypeName(i5), "animator")) || (i10 > 0 && Intrinsics.areEqual(resources.getResourceTypeName(i10), "animator"))) {
                    Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring popEnter resource " + resources.getResourceName(i5) + " and popExit resource " + resources.getResourceName(i10) + " when launching " + bVar);
                } else {
                    intent3.putExtra("android-support-navigation:ActivityNavigator:popEnterAnim", i5);
                    Intrinsics.checkNotNull(intent3.putExtra("android-support-navigation:ActivityNavigator:popExitAnim", i10));
                }
            }
            context.startActivity(intent3);
            if (ajVar != null && activity != null) {
                int i11 = ajVar.foxtrot;
                int i12 = ajVar.golf;
                if ((i11 > 0 && Intrinsics.areEqual(resources.getResourceTypeName(i11), "animator")) || (i12 > 0 && Intrinsics.areEqual(resources.getResourceTypeName(i12), "animator"))) {
                    Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring enter resource " + resources.getResourceName(i11) + " and exit resource " + resources.getResourceName(i12) + "when launching " + bVar);
                    return null;
                }
                if (i11 >= 0 || i12 >= 0) {
                    if (i11 < 0) {
                        i11 = 0;
                    }
                    if (i12 >= 0) {
                        i4 = i12;
                    }
                    activity.overridePendingTransition(i11, i4);
                }
            }
            return null;
        }
        throw new IllegalStateException(P0.cyan(new StringBuilder("Destination "), bVar2.charlie, " does not have an Intent set.").toString());
    }

    @Override // Y1.at
    public final boolean juliet() {
        Activity activity = this.delta;
        if (activity != null) {
            activity.finish();
            return true;
        }
        return false;
    }
}
