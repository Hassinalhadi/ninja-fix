package com.google.android.gms.measurement.internal;

import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import java.io.IOException;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final /* synthetic */ class F implements InterfaceC1463p0 {
    public final G alpha;

    public /* synthetic */ F(G g2) {
        this.alpha = g2;
    }

    public void alpha(Bundle bundle, String str) {
        String uri;
        G g2 = this.alpha;
        E e = g2.f7508c;
        G.foxtrot(e);
        e.W();
        if (!g2.alpha()) {
            if (bundle.isEmpty()) {
                uri = null;
            } else {
                if (true == str.isEmpty()) {
                    str = "auto";
                }
                Uri.Builder builder = new Uri.Builder();
                builder.path(str);
                for (String str2 : bundle.keySet()) {
                    builder.appendQueryParameter(str2, bundle.getString(str2));
                }
                uri = builder.build().toString();
            }
            if (!TextUtils.isEmpty(uri)) {
                ax axVar = g2.f7506a;
                G.delta(axVar);
                axVar.f7653q.oscar(uri);
                g2.f7511g.getClass();
                axVar.f7654r.bravo(System.currentTimeMillis());
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1463p0
    public void bravo(int i4, IOException iOException, byte[] bArr) {
        ar arVar;
        BroadcastOptions makeBasic;
        BroadcastOptions shareIdentityEnabled;
        Bundle bundle;
        int i5 = i4;
        G g2 = this.alpha;
        if (i5 != 200 && i5 != 204) {
            if (i5 == 304) {
                i5 = 304;
            }
            ar arVar2 = g2.f7507b;
            G.foxtrot(arVar2);
            arVar2.f7632b.charlie(Integer.valueOf(i5), iOException, "Network Request for Deferred Deep Link failed. response, exception");
        }
        if (iOException == null) {
            ax axVar = g2.f7506a;
            G.delta(axVar);
            axVar.f7650n.bravo(true);
            ar arVar3 = g2.f7507b;
            if (bArr != null && bArr.length != 0) {
                try {
                    JSONObject jSONObject = new JSONObject(new String(bArr));
                    String optString = jSONObject.optString("deeplink", "");
                    if (TextUtils.isEmpty(optString)) {
                        G.foxtrot(arVar3);
                        arVar3.f7635f.alpha("Deferred Deep Link is empty.");
                        return;
                    }
                    String optString2 = jSONObject.optString("gclid", "");
                    String optString3 = jSONObject.optString("gbraid", "");
                    String optString4 = jSONObject.optString("gad_source", "");
                    double optDouble = jSONObject.optDouble("timestamp", 0.0d);
                    Bundle bundle2 = new Bundle();
                    d1 d1Var = g2.e;
                    G.delta(d1Var);
                    G g5 = (G) d1Var.alpha;
                    if (TextUtils.isEmpty(optString)) {
                        arVar = arVar3;
                    } else {
                        Context context = g5.alpha;
                        arVar = arVar3;
                        try {
                            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0);
                            if (queryIntentActivities != null && !queryIntentActivities.isEmpty()) {
                                if (!TextUtils.isEmpty(optString3)) {
                                    bundle2.putString("gbraid", optString3);
                                }
                                if (!TextUtils.isEmpty(optString4)) {
                                    bundle2.putString("gad_source", optString4);
                                }
                                bundle2.putString("gclid", optString2);
                                bundle2.putString("_cis", "ddp");
                                g2.f7513i.h0("auto", "_cmp", bundle2);
                                if (!TextUtils.isEmpty(optString)) {
                                    try {
                                        SharedPreferences.Editor edit = context.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                                        edit.putString("deeplink", optString);
                                        edit.putLong("timestamp", Double.doubleToRawLongBits(optDouble));
                                        if (edit.commit()) {
                                            Intent intent = new Intent("android.google.analytics.action.DEEPLINK_ACTION");
                                            Context context2 = g5.alpha;
                                            if (Build.VERSION.SDK_INT >= 34) {
                                                makeBasic = BroadcastOptions.makeBasic();
                                                shareIdentityEnabled = makeBasic.setShareIdentityEnabled(true);
                                                bundle = shareIdentityEnabled.toBundle();
                                                context2.sendBroadcast(intent, null, bundle);
                                                return;
                                            }
                                            context2.sendBroadcast(intent);
                                            return;
                                        }
                                        return;
                                    } catch (RuntimeException e) {
                                        ar arVar4 = g5.f7507b;
                                        G.foxtrot(arVar4);
                                        arVar4.white.bravo(e, "Failed to persist Deferred Deep Link. exception");
                                        return;
                                    }
                                }
                                return;
                            }
                        } catch (JSONException e4) {
                            e = e4;
                            arVar3 = arVar;
                            G.foxtrot(arVar3);
                            arVar3.white.bravo(e, "Failed to parse the Deferred Deep Link response. exception");
                            return;
                        }
                    }
                    G.foxtrot(arVar);
                    arVar.f7632b.delta("Deferred Deep Link validation failed. gclid, gbraid, deep link", optString2, optString3, optString);
                    return;
                } catch (JSONException e5) {
                    e = e5;
                }
            } else {
                G.foxtrot(arVar3);
                arVar3.f7635f.alpha("Deferred Deep Link response empty.");
                return;
            }
        }
        ar arVar22 = g2.f7507b;
        G.foxtrot(arVar22);
        arVar22.f7632b.charlie(Integer.valueOf(i5), iOException, "Network Request for Deferred Deep Link failed. response, exception");
    }

    public boolean charlie() {
        ax axVar = this.alpha.f7506a;
        G.delta(axVar);
        if (axVar.f7654r.alpha() > 0) {
            return true;
        }
        return false;
    }

    public boolean delta() {
        if (charlie()) {
            G g2 = this.alpha;
            g2.f7511g.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            ax axVar = g2.f7506a;
            G.delta(axVar);
            if (currentTimeMillis - axVar.f7654r.alpha() > g2.yellow.e0(null, ac.f7587b)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
