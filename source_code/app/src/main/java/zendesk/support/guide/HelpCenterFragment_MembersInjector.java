package zendesk.support.guide;

import Kd.a;
import v9.InterfaceC3179a;
import zendesk.core.NetworkInfoProvider;
import zendesk.support.HelpCenterProvider;

/* loaded from: classes.dex */
public final class HelpCenterFragment_MembersInjector implements InterfaceC3179a {
    private final a helpCenterProvider;
    private final a networkInfoProvider;

    public HelpCenterFragment_MembersInjector(a aVar, a aVar2) {
        this.helpCenterProvider = aVar;
        this.networkInfoProvider = aVar2;
    }

    public static InterfaceC3179a create(a aVar, a aVar2) {
        return new HelpCenterFragment_MembersInjector(aVar, aVar2);
    }

    public static void injectHelpCenterProvider(HelpCenterFragment helpCenterFragment, HelpCenterProvider helpCenterProvider) {
        helpCenterFragment.helpCenterProvider = helpCenterProvider;
    }

    public static void injectNetworkInfoProvider(HelpCenterFragment helpCenterFragment, NetworkInfoProvider networkInfoProvider) {
        helpCenterFragment.networkInfoProvider = networkInfoProvider;
    }

    public void injectMembers(HelpCenterFragment helpCenterFragment) {
        injectHelpCenterProvider(helpCenterFragment, (HelpCenterProvider) this.helpCenterProvider.get());
        injectNetworkInfoProvider(helpCenterFragment, (NetworkInfoProvider) this.networkInfoProvider.get());
    }
}
