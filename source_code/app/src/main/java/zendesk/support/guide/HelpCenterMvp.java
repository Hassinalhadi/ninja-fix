package zendesk.support.guide;

import android.content.Context;
import com.zendesk.service.ZendeskCallback;
import java.util.List;
import zendesk.classic.messaging.Engine;
import zendesk.core.RetryAction;
import zendesk.support.HelpCenterSettings;
import zendesk.support.SearchArticle;

/* loaded from: classes.dex */
interface HelpCenterMvp {

    /* loaded from: classes.dex */
    public enum ErrorType {
        CATEGORY_LOAD,
        SECTION_LOAD,
        ARTICLES_LOAD
    }

    /* loaded from: classes.dex */
    public interface Model {
        void getSettings(ZendeskCallback<HelpCenterSettings> zendeskCallback);

        void search(List<Long> list, List<Long> list2, String str, String[] strArr, ZendeskCallback<List<SearchArticle>> zendeskCallback);
    }

    /* loaded from: classes.dex */
    public interface Presenter {
        void init(HelpCenterConfiguration helpCenterConfiguration, List<Engine> list);

        void onErrorWithRetry(ErrorType errorType, RetryAction retryAction);

        void onLoad();

        void onPause();

        void onResume(View view);

        void onSearchSubmit(String str);

        boolean shouldShowConversationsMenuItem();

        boolean shouldShowSearchMenuItem();
    }

    /* loaded from: classes.dex */
    public interface View {
        void announceContentLoaded();

        void clearSearchResults();

        void dismissError();

        void exitActivity();

        Context getContext();

        void hideLoadingState();

        boolean isShowingHelp();

        void setSearchEnabled(boolean z2);

        void showContactUsButton();

        void showContactZendesk();

        void showHelp(HelpCenterConfiguration helpCenterConfiguration);

        void showLoadArticleErrorWithRetry(ErrorType errorType, RetryAction retryAction);

        void showLoadingState();

        void showNoConnectionError();

        void showRequestList();

        void showSearchResults(List<SearchArticle> list, String str);
    }
}
