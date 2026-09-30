package o;

import D0.am;
import Xd.o;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import kotlin.Unit;

/* renamed from: o.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C2184a implements o {
    @Override // Xd.o
    public final Object golf(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        long j5 = ((am) obj5).alpha;
        String obj6 = ((CharSequence) obj4).subSequence(am.foxtrot(j5), am.echo(j5)).toString();
        Intent putExtra = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain").putExtra("android.intent.extra.PROCESS_TEXT_READONLY", booleanValue);
        ActivityInfo activityInfo = ((ResolveInfo) obj2).activityInfo;
        Intent className = putExtra.setClassName(activityInfo.packageName, activityInfo.name);
        className.putExtra("android.intent.extra.PROCESS_TEXT", obj6);
        ((Context) obj).startActivity(className);
        return Unit.INSTANCE;
    }
}
