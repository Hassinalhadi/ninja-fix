package com.google.firebase.messaging;

import B9.C0058p;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import bv.aw;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Map;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public final class RemoteMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RemoteMessage> CREATOR = new Y5.b(20);
    public final Bundle alpha;
    public bv.e purple;
    public C0058p red;

    public RemoteMessage(Bundle bundle) {
        this.alpha = bundle;
    }

    public final C0058p E() {
        if (this.red == null) {
            Bundle bundle = this.alpha;
            if (com.google.android.material.internal.s.jade(bundle)) {
                this.red = new C0058p(new com.google.android.material.internal.s(bundle));
            }
        }
        return this.red;
    }

    public final int getPriority() {
        Bundle bundle = this.alpha;
        String string = bundle.getString("google.delivered_priority");
        if (string == null) {
            if ("1".equals(bundle.getString("google.priority_reduced"))) {
                return 2;
            }
            string = bundle.getString("google.priority");
        }
        if (Constants.PRIORITY_HIGH.equals(string)) {
            return 1;
        }
        if (Constants.PRIORITY_NORMAL.equals(string)) {
            return 2;
        }
        return 0;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [bv.e, bv.aw] */
    public final Map o() {
        if (this.purple == null) {
            ?? awVar = new aw(0);
            Bundle bundle = this.alpha;
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        awVar.put(str, str2);
                    }
                }
            }
            this.purple = awVar;
        }
        return this.purple;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.bravo(parcel, 2, this.alpha);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
