package com.incognia.internal;

import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;

/* loaded from: classes2.dex */
public final class rMG implements P0 {

    /* renamed from: W, reason: collision with root package name */
    public final wmy f11225W;

    /* renamed from: b, reason: collision with root package name */
    public final AP f11226b;

    /* renamed from: f9, reason: collision with root package name */
    public final Lazy f11227f9 = LazyKt.lazy(sI.f11288b);

    public rMG(AP ap2, wmy wmyVar) {
        this.f11226b = ap2;
        this.f11225W = wmyVar;
    }

    @Override // com.incognia.internal.P0
    public final String W() {
        return (String) this.f11227f9.getValue();
    }

    @Override // com.incognia.internal.P0
    public final boolean b() {
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(23:(7:1|2|3|4|5|(1:7)|8)|(21:10|11|12|13|(1:15)|16|(14:18|19|20|21|(1:23)|24|(7:26|27|28|29|30|31|32)|38|27|28|29|30|31|32)|41|19|20|21|(0)|24|(0)|38|27|28|29|30|31|32)|44|11|12|13|(0)|16|(0)|41|19|20|21|(0)|24|(0)|38|27|28|29|30|31|32) */
    /* JADX WARN: Can't wrap try/catch for region: R(29:1|2|3|4|5|(1:7)|8|(21:10|11|12|13|(1:15)|16|(14:18|19|20|21|(1:23)|24|(7:26|27|28|29|30|31|32)|38|27|28|29|30|31|32)|41|19|20|21|(0)|24|(0)|38|27|28|29|30|31|32)|44|11|12|13|(0)|16|(0)|41|19|20|21|(0)|24|(0)|38|27|28|29|30|31|32) */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002f A[Catch: all -> 0x0042, TryCatch #1 {all -> 0x0042, blocks: (B:13:0x0026, B:15:0x002f, B:16:0x0033, B:18:0x003b), top: B:12:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003b A[Catch: all -> 0x0042, TRY_LEAVE, TryCatch #1 {all -> 0x0042, blocks: (B:13:0x0026, B:15:0x002f, B:16:0x0033, B:18:0x003b), top: B:12:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004e A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:21:0x0045, B:23:0x004e, B:24:0x0052, B:26:0x005a), top: B:20:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005a A[Catch: all -> 0x0061, TRY_LEAVE, TryCatch #0 {all -> 0x0061, blocks: (B:21:0x0045, B:23:0x004e, B:24:0x0052, B:26:0x005a), top: B:20:0x0045 }] */
    @Override // com.incognia.internal.P0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(yE yEVar, WA wa2) {
        Object m206constructorimpl;
        wmy wmyVar;
        Integer num;
        String str;
        String str2;
        String str3;
        Uri actualDefaultRingtoneUri;
        Ringtone ringtone;
        Uri actualDefaultRingtoneUri2;
        Ringtone ringtone2;
        Ringtone ringtone3;
        try {
            Result.Companion companion = Result.INSTANCE;
            wmyVar = this.f11225W;
            num = null;
            try {
                Uri actualDefaultRingtoneUri3 = RingtoneManager.getActualDefaultRingtoneUri(wmyVar.f11762b, 1);
                if (actualDefaultRingtoneUri3 == null) {
                    actualDefaultRingtoneUri3 = RingtoneManager.getDefaultUri(1);
                }
                ringtone3 = RingtoneManager.getRingtone(wmyVar.f11762b, actualDefaultRingtoneUri3);
            } catch (Throwable unused) {
            }
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        if (ringtone3 != null) {
            str = ringtone3.getTitle(wmyVar.f11762b);
            wmy wmyVar2 = this.f11225W;
            actualDefaultRingtoneUri2 = RingtoneManager.getActualDefaultRingtoneUri(wmyVar2.f11762b, 4);
            if (actualDefaultRingtoneUri2 == null) {
                actualDefaultRingtoneUri2 = RingtoneManager.getDefaultUri(4);
            }
            ringtone2 = RingtoneManager.getRingtone(wmyVar2.f11762b, actualDefaultRingtoneUri2);
            if (ringtone2 != null) {
                str2 = ringtone2.getTitle(wmyVar2.f11762b);
                wmy wmyVar3 = this.f11225W;
                actualDefaultRingtoneUri = RingtoneManager.getActualDefaultRingtoneUri(wmyVar3.f11762b, 2);
                if (actualDefaultRingtoneUri == null) {
                    actualDefaultRingtoneUri = RingtoneManager.getDefaultUri(2);
                }
                ringtone = RingtoneManager.getRingtone(wmyVar3.f11762b, actualDefaultRingtoneUri);
                if (ringtone != null) {
                    str3 = ringtone.getTitle(wmyVar3.f11762b);
                    num = Integer.valueOf(this.f11226b.f8359b.getRingerMode());
                    m206constructorimpl = Result.m206constructorimpl(new Vpx((String) wGk.f11671Y3.getValue(), new HLa(num, str, str2, str3)));
                    Bo7.b(m206constructorimpl, wa2);
                }
                str3 = null;
                num = Integer.valueOf(this.f11226b.f8359b.getRingerMode());
                m206constructorimpl = Result.m206constructorimpl(new Vpx((String) wGk.f11671Y3.getValue(), new HLa(num, str, str2, str3)));
                Bo7.b(m206constructorimpl, wa2);
            }
            str2 = null;
            wmy wmyVar32 = this.f11225W;
            actualDefaultRingtoneUri = RingtoneManager.getActualDefaultRingtoneUri(wmyVar32.f11762b, 2);
            if (actualDefaultRingtoneUri == null) {
            }
            ringtone = RingtoneManager.getRingtone(wmyVar32.f11762b, actualDefaultRingtoneUri);
            if (ringtone != null) {
            }
            str3 = null;
            num = Integer.valueOf(this.f11226b.f8359b.getRingerMode());
            m206constructorimpl = Result.m206constructorimpl(new Vpx((String) wGk.f11671Y3.getValue(), new HLa(num, str, str2, str3)));
            Bo7.b(m206constructorimpl, wa2);
        }
        str = null;
        wmy wmyVar22 = this.f11225W;
        actualDefaultRingtoneUri2 = RingtoneManager.getActualDefaultRingtoneUri(wmyVar22.f11762b, 4);
        if (actualDefaultRingtoneUri2 == null) {
        }
        ringtone2 = RingtoneManager.getRingtone(wmyVar22.f11762b, actualDefaultRingtoneUri2);
        if (ringtone2 != null) {
        }
        str2 = null;
        wmy wmyVar322 = this.f11225W;
        actualDefaultRingtoneUri = RingtoneManager.getActualDefaultRingtoneUri(wmyVar322.f11762b, 2);
        if (actualDefaultRingtoneUri == null) {
        }
        ringtone = RingtoneManager.getRingtone(wmyVar322.f11762b, actualDefaultRingtoneUri);
        if (ringtone != null) {
        }
        str3 = null;
        num = Integer.valueOf(this.f11226b.f8359b.getRingerMode());
        m206constructorimpl = Result.m206constructorimpl(new Vpx((String) wGk.f11671Y3.getValue(), new HLa(num, str, str2, str3)));
        Bo7.b(m206constructorimpl, wa2);
    }
}
