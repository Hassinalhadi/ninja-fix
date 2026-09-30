package com.incognia.internal;

import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;

/* loaded from: classes2.dex */
public final class m3 implements P0 {

    /* renamed from: W, reason: collision with root package name */
    public final G5G f10872W;

    /* renamed from: b, reason: collision with root package name */
    public final q8 f10873b;

    /* renamed from: f9, reason: collision with root package name */
    public final Lazy f10874f9 = LazyKt.lazy(Xt4.f9960b);

    public m3(vp8 vp8Var, q8 q8Var, G5G g5g) {
        this.f10873b = q8Var;
        this.f10872W = g5g;
    }

    @Override // com.incognia.internal.P0
    public final String W() {
        return (String) this.f10874f9.getValue();
    }

    @Override // com.incognia.internal.P0
    public final boolean b() {
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:1|(2:2|3)|(2:5|(1:7)(18:38|9|10|11|12|13|(1:15)(1:35)|16|(1:18)(1:34)|19|(1:21)(1:33)|22|(1:24)(1:32)|25|26|27|28|29))(1:39)|8|9|10|11|12|13|(0)(0)|16|(0)(0)|19|(0)(0)|22|(0)(0)|25|26|27|28|29) */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x003d, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0051 A[Catch: all -> 0x001f, TryCatch #1 {all -> 0x001f, blocks: (B:3:0x0002, B:5:0x0010, B:7:0x0018, B:9:0x0031, B:13:0x003e, B:15:0x0051, B:16:0x0059, B:18:0x0073, B:19:0x007b, B:21:0x00c7, B:22:0x00cf, B:24:0x0105, B:26:0x0120, B:39:0x0025), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0073 A[Catch: all -> 0x001f, TryCatch #1 {all -> 0x001f, blocks: (B:3:0x0002, B:5:0x0010, B:7:0x0018, B:9:0x0031, B:13:0x003e, B:15:0x0051, B:16:0x0059, B:18:0x0073, B:19:0x007b, B:21:0x00c7, B:22:0x00cf, B:24:0x0105, B:26:0x0120, B:39:0x0025), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c7 A[Catch: all -> 0x001f, TryCatch #1 {all -> 0x001f, blocks: (B:3:0x0002, B:5:0x0010, B:7:0x0018, B:9:0x0031, B:13:0x003e, B:15:0x0051, B:16:0x0059, B:18:0x0073, B:19:0x007b, B:21:0x00c7, B:22:0x00cf, B:24:0x0105, B:26:0x0120, B:39:0x0025), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0105 A[Catch: all -> 0x001f, TryCatch #1 {all -> 0x001f, blocks: (B:3:0x0002, B:5:0x0010, B:7:0x0018, B:9:0x0031, B:13:0x003e, B:15:0x0051, B:16:0x0059, B:18:0x0073, B:19:0x007b, B:21:0x00c7, B:22:0x00cf, B:24:0x0105, B:26:0x0120, B:39:0x0025), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0058  */
    @Override // com.incognia.internal.P0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(yE yEVar, WA wa2) {
        Object m206constructorimpl;
        CnH cnH;
        String valueOf;
        String str;
        try {
            Result.Companion companion = Result.INSTANCE;
            cnH = CnH.f8484b;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        if (CnH.b(cnH, 0, 31, 1)) {
            q8 q8Var = this.f10873b;
            if (CnH.b(cnH, 0, 31, 1)) {
                valueOf = q8Var.b("data_roaming");
            } else {
                str = null;
                String str2 = Locale.getDefault().getLanguage();
                Integer b2 = this.f10873b.b();
                q8 q8Var2 = this.f10873b;
                CnH cnH2 = CnH.f8484b;
                String W5 = !CnH.b(cnH2, 21, 0, 2) ? q8Var2.W("accessibility_display_inversion_enabled") : null;
                m206constructorimpl = Result.m206constructorimpl(new Y9((String) wGk.UhN.getValue(), new hvw(str2, b2, W5, this.f10873b.f9("screen_brightness"), this.f10873b.f9("screen_brightness_mode"), !CnH.b(cnH2, 23, 0, 2) ? this.f10873b.f9("dtmf_tone_type") : null, this.f10873b.f9("dtmf_tone"), this.f10873b.f9("sound_effects_enabled"), this.f10873b.f9("user_rotation"), this.f10873b.f9("time_12_24"), this.f10873b.f9("font_scale"), this.f10873b.f9("end_button_behavior"), this.f10873b.f9("vibrate_on"), !CnH.b(cnH2, 23, 0, 2) ? this.f10873b.f9("vibrate_when_ringing") : null, this.f10873b.b("device_provisioned"), this.f10873b.b("http_proxy"), this.f10873b.b("auto_time"), this.f10873b.b("airplane_mode_radios"), str, this.f10873b.b("adb_enabled"), !CnH.b(cnH2, 0, 29, 1) ? this.f10873b.b("wifi_sleep_policy") : null)));
                Bo7.b(m206constructorimpl, wa2);
            }
        } else {
            valueOf = String.valueOf(this.f10872W.PqK());
        }
        str = valueOf;
        String str22 = Locale.getDefault().getLanguage();
        Integer b22 = this.f10873b.b();
        q8 q8Var22 = this.f10873b;
        CnH cnH22 = CnH.f8484b;
        if (!CnH.b(cnH22, 21, 0, 2)) {
        }
        if (!CnH.b(cnH22, 23, 0, 2)) {
        }
        if (!CnH.b(cnH22, 23, 0, 2)) {
        }
        m206constructorimpl = Result.m206constructorimpl(new Y9((String) wGk.UhN.getValue(), new hvw(str22, b22, W5, this.f10873b.f9("screen_brightness"), this.f10873b.f9("screen_brightness_mode"), !CnH.b(cnH22, 23, 0, 2) ? this.f10873b.f9("dtmf_tone_type") : null, this.f10873b.f9("dtmf_tone"), this.f10873b.f9("sound_effects_enabled"), this.f10873b.f9("user_rotation"), this.f10873b.f9("time_12_24"), this.f10873b.f9("font_scale"), this.f10873b.f9("end_button_behavior"), this.f10873b.f9("vibrate_on"), !CnH.b(cnH22, 23, 0, 2) ? this.f10873b.f9("vibrate_when_ringing") : null, this.f10873b.b("device_provisioned"), this.f10873b.b("http_proxy"), this.f10873b.b("auto_time"), this.f10873b.b("airplane_mode_radios"), str, this.f10873b.b("adb_enabled"), !CnH.b(cnH22, 0, 29, 1) ? this.f10873b.b("wifi_sleep_policy") : null)));
        Bo7.b(m206constructorimpl, wa2);
    }
}
