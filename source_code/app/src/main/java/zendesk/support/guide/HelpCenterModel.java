package zendesk.support.guide;

import com.zendesk.service.ZendeskCallback;
import java.util.List;
import zendesk.support.HelpCenterProvider;
import zendesk.support.HelpCenterSearch;
import zendesk.support.HelpCenterSettings;
import zendesk.support.HelpCenterSettingsProvider;
import zendesk.support.SearchArticle;
import zendesk.support.guide.HelpCenterMvp;

/* loaded from: classes.dex */
class HelpCenterModel implements HelpCenterMvp.Model {
    private final HelpCenterProvider provider;
    private final HelpCenterSettingsProvider settingsProvider;

    public HelpCenterModel(HelpCenterProvider helpCenterProvider, HelpCenterSettingsProvider helpCenterSettingsProvider) {
        this.provider = helpCenterProvider;
        this.settingsProvider = helpCenterSettingsProvider;
    }

    @Override // zendesk.support.guide.HelpCenterMvp.Model
    public void getSettings(ZendeskCallback<HelpCenterSettings> zendeskCallback) {
        this.settingsProvider.getSettings(zendeskCallback);
    }

    @Override // zendesk.support.guide.HelpCenterMvp.Model
    public void search(List<Long> list, List<Long> list2, String str, String[] strArr, ZendeskCallback<List<SearchArticle>> zendeskCallback) {
        this.provider.searchArticles(new HelpCenterSearch.Builder().withQuery(str).withCategoryIds(list).withSectionIds(list2).withLabelNames(strArr).build(), zendeskCallback);
    }
}
