package zendesk.core;

import Kd.a;
import android.content.Context;
import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class ZendeskApplicationModule_ProvideDeviceInfoFactory implements b {
    private final a contextProvider;

    public ZendeskApplicationModule_ProvideDeviceInfoFactory(a aVar) {
        this.contextProvider = aVar;
    }

    public static ZendeskApplicationModule_ProvideDeviceInfoFactory create(a aVar) {
        return new ZendeskApplicationModule_ProvideDeviceInfoFactory(aVar);
    }

    public static DeviceInfo provideDeviceInfo(Context context) {
        DeviceInfo provideDeviceInfo = ZendeskApplicationModule.provideDeviceInfo(context);
        AbstractC2763s0.delta(provideDeviceInfo);
        return provideDeviceInfo;
    }

    @Override // Kd.a
    public DeviceInfo get() {
        return provideDeviceInfo((Context) this.contextProvider.get());
    }
}
