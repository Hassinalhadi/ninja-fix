package zendesk.support;

import Kd.a;
import v9.InterfaceC3179a;

/* loaded from: classes.dex */
public final class Guide_MembersInjector implements InterfaceC3179a {
    private final a blipsProvider;
    private final a guideModuleProvider;

    public Guide_MembersInjector(a aVar, a aVar2) {
        this.guideModuleProvider = aVar;
        this.blipsProvider = aVar2;
    }

    public static InterfaceC3179a create(a aVar, a aVar2) {
        return new Guide_MembersInjector(aVar, aVar2);
    }

    public static void injectBlipsProvider(Guide guide, HelpCenterBlipsProvider helpCenterBlipsProvider) {
        guide.blipsProvider = helpCenterBlipsProvider;
    }

    public static void injectGuideModule(Guide guide, GuideModule guideModule) {
        guide.guideModule = guideModule;
    }

    public void injectMembers(Guide guide) {
        injectGuideModule(guide, (GuideModule) this.guideModuleProvider.get());
        injectBlipsProvider(guide, (HelpCenterBlipsProvider) this.blipsProvider.get());
    }
}
