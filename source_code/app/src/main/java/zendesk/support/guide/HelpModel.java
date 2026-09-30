package zendesk.support.guide;

import com.zendesk.service.ErrorResponse;
import com.zendesk.service.ErrorResponseAdapter;
import com.zendesk.service.ZendeskCallback;
import com.zendesk.util.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import zendesk.support.Article;
import zendesk.support.ArticleItem;
import zendesk.support.HelpCenterProvider;
import zendesk.support.HelpItem;
import zendesk.support.HelpRequest;
import zendesk.support.SectionItem;
import zendesk.support.guide.HelpMvp;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class HelpModel implements HelpMvp.Model {
    private HelpCenterProvider provider;

    public HelpModel(HelpCenterProvider helpCenterProvider) {
        this.provider = helpCenterProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ArticleItem convertArticle(Article article) {
        return new ArticleItem(article.getId(), article.getSectionId(), article.getTitle());
    }

    @Override // zendesk.support.guide.HelpMvp.Model
    public void getArticles(List<Long> list, List<Long> list2, String[] strArr, ZendeskCallback<List<HelpItem>> zendeskCallback) {
        this.provider.getHelp(new HelpRequest.Builder().withCategoryIds(list).withSectionIds(list2).withLabelNames(strArr).includeCategories().includeSections().build(), zendeskCallback);
    }

    @Override // zendesk.support.guide.HelpMvp.Model
    public void getArticlesForSection(SectionItem sectionItem, String[] strArr, final ZendeskCallback<List<ArticleItem>> zendeskCallback) {
        if (sectionItem != null && sectionItem.getId() != null) {
            this.provider.getArticles(sectionItem.getId(), StringUtils.toCsvString(strArr), new ZendeskCallback<List<Article>>() { // from class: zendesk.support.guide.HelpModel.1
                @Override // com.zendesk.service.ZendeskCallback
                public void onError(ErrorResponse errorResponse) {
                    ZendeskCallback zendeskCallback2 = zendeskCallback;
                    if (zendeskCallback2 != null) {
                        zendeskCallback2.onError(errorResponse);
                    }
                }

                @Override // com.zendesk.service.ZendeskCallback
                public void onSuccess(List<Article> list) {
                    ArrayList arrayList = new ArrayList(list.size());
                    Iterator<Article> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(HelpModel.this.convertArticle(it.next()));
                    }
                    ZendeskCallback zendeskCallback2 = zendeskCallback;
                    if (zendeskCallback2 != null) {
                        zendeskCallback2.onSuccess(arrayList);
                    }
                }
            });
        } else {
            zendeskCallback.onError(new ErrorResponseAdapter("SectionItem or its ID was null, cannot load more articles."));
        }
    }
}
