package w6;

import T5.r;
import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import av.ao;
import com.google.android.gms.common.Feature;
import com.google.android.gms.internal.measurement.AbstractC1394y;

/* loaded from: classes2.dex */
public final class g extends V5.f {
    public final int amber;
    public final String azure;
    public final int beige;
    public final boolean black;
    public final Context zulu;

    public g(Context context, Looper looper, ao aoVar, r rVar, r rVar2, int i4) {
        super(context, looper, 4, aoVar, rVar, rVar2);
        this.zulu = context;
        this.amber = i4;
        this.azure = null;
        this.beige = 1;
        this.black = true;
    }

    public final Bundle beige() {
        String packageName = this.zulu.getPackageName();
        Bundle bundle = new Bundle();
        bundle.putInt("com.google.android.gms.wallet.EXTRA_ENVIRONMENT", this.amber);
        bundle.putBoolean("com.google.android.gms.wallet.EXTRA_USING_ANDROID_PAY_BRAND", this.black);
        bundle.putString("androidPackageName", packageName);
        String str = this.azure;
        if (!TextUtils.isEmpty(str)) {
            bundle.putParcelable("com.google.android.gms.wallet.EXTRA_BUYER_ACCOUNT", new Account(str, "com.google"));
        }
        bundle.putInt("com.google.android.gms.wallet.EXTRA_THEME", this.beige);
        return bundle;
    }

    @Override // V5.e, com.google.android.gms.common.api.c
    public final int hotel() {
        return 12600000;
    }

    @Override // V5.e
    public final IInterface oscar(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wallet.internal.IOwService");
        if (queryLocalInterface instanceof d) {
            return (d) queryLocalInterface;
        }
        return new AbstractC1394y(iBinder, "com.google.android.gms.wallet.internal.IOwService", 6);
    }

    @Override // V5.e
    public final Feature[] quebec() {
        return H6.e.charlie;
    }

    @Override // V5.e
    public final String uniform() {
        return "com.google.android.gms.wallet.internal.IOwService";
    }

    @Override // V5.e
    public final String victor() {
        return "com.google.android.gms.wallet.service.BIND";
    }

    @Override // V5.e
    public final boolean yankee() {
        return true;
    }
}
