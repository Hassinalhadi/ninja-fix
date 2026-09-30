package zendesk.support.guide;

import ae.C0423b;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.a;
import androidx.appcompat.app.i;
import androidx.appcompat.widget.J0;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.C0606a;
import androidx.fragment.app.G;
import androidx.fragment.app.L;
import androidx.fragment.app.ai;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.zendesk.guide.sdk.R;
import com.zendesk.logger.Logger;
import com.zendesk.util.CollectionUtils;
import i7.C1901g;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import zendesk.classic.messaging.Engine;
import zendesk.classic.messaging.MessagingActivity;
import zendesk.commonui.InsetType;
import zendesk.commonui.SystemWindowInsets;
import zendesk.configurations.ConfigurationHelper;
import zendesk.core.ActionDescription;
import zendesk.core.ActionHandler;
import zendesk.core.ActionHandlerRegistry;
import zendesk.core.NetworkInfoProvider;
import zendesk.core.RetryAction;
import zendesk.support.HelpCenterProvider;
import zendesk.support.HelpCenterSettingsProvider;
import zendesk.support.SearchArticle;
import zendesk.support.guide.HelpCenterConfiguration;
import zendesk.support.guide.HelpCenterMvp;

/* loaded from: classes.dex */
public class HelpCenterActivity extends i implements HelpCenterMvp.View {
    static final String LOG_TAG = "HelpCenterActivity";
    ActionHandlerRegistry actionHandlerRegistry;
    private AppBarLayout appBarLayout;
    ConfigurationHelper configurationHelper;
    private FloatingActionButton contactUsButton;
    private MenuItem conversationsMenuItem;
    private List<Engine> engines;
    private C1901g errorSnackbar;
    private HelpCenterConfiguration helpCenterConfiguration;
    HelpCenterProvider helpCenterProvider;
    private View loadingView;
    NetworkInfoProvider networkInfoProvider;
    private HelpCenterMvp.Presenter presenter;
    private MenuItem searchViewMenuItem;
    HelpCenterSettingsProvider settingsProvider;
    private SnackbarStatus snackbarStatus = SnackbarStatus.NONE;
    private Toolbar toolbar;

    /* renamed from: zendesk.support.guide.HelpCenterActivity$5, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] $SwitchMap$zendesk$support$guide$HelpCenterMvp$ErrorType;

        static {
            int[] iArr = new int[HelpCenterMvp.ErrorType.values().length];
            $SwitchMap$zendesk$support$guide$HelpCenterMvp$ErrorType = iArr;
            try {
                iArr[HelpCenterMvp.ErrorType.CATEGORY_LOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$zendesk$support$guide$HelpCenterMvp$ErrorType[HelpCenterMvp.ErrorType.SECTION_LOAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$zendesk$support$guide$HelpCenterMvp$ErrorType[HelpCenterMvp.ErrorType.ARTICLES_LOAD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum SnackbarStatus {
        NO_CONNECTION,
        NONE,
        CONTENT_ERROR
    }

    private void addFragment(ai aiVar) {
        L supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        C0606a c0606a = new C0606a(supportFragmentManager);
        c0606a.delta(R.id.fragment_container, aiVar, aiVar.getClass().getSimpleName(), 1);
        c0606a.india();
    }

    private void addOnBackStackChangedListener() {
        L supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.oscar.add(new G() { // from class: zendesk.support.guide.HelpCenterActivity.2
            @Override // androidx.fragment.app.G
            public /* bridge */ /* synthetic */ void onBackStackChangeCancelled() {
            }

            @Override // androidx.fragment.app.G
            public /* bridge */ /* synthetic */ void onBackStackChangeCommitted(ai aiVar, boolean z2) {
            }

            @Override // androidx.fragment.app.G
            public /* bridge */ /* synthetic */ void onBackStackChangeProgressed(C0423b c0423b) {
            }

            @Override // androidx.fragment.app.G
            public /* bridge */ /* synthetic */ void onBackStackChangeStarted(ai aiVar, boolean z2) {
            }

            @Override // androidx.fragment.app.G
            public void onBackStackChanged() {
                if (HelpCenterActivity.this.getCurrentFragment().isHidden()) {
                    L supportFragmentManager2 = HelpCenterActivity.this.getSupportFragmentManager();
                    supportFragmentManager2.getClass();
                    C0606a c0606a = new C0606a(supportFragmentManager2);
                    c0606a.oscar(HelpCenterActivity.this.getCurrentFragment());
                    c0606a.india();
                    if (HelpCenterActivity.this.getCurrentFragment() instanceof HelpCenterFragment) {
                        ((HelpCenterFragment) HelpCenterActivity.this.getCurrentFragment()).setPresenter(HelpCenterActivity.this.presenter);
                    }
                }
            }
        });
    }

    private void applyWindowInsets() {
        SystemWindowInsets.applyWindowInsets(this.appBarLayout, InsetType.TOP);
        Toolbar toolbar = this.toolbar;
        InsetType insetType = InsetType.HORIZONTAL;
        SystemWindowInsets.applyWindowInsets(toolbar, insetType);
        SystemWindowInsets.applyWindowInsets(findViewById(R.id.fragment_container), InsetType.BOTTOM, insetType);
    }

    public static HelpCenterConfiguration.Builder builder() {
        return new HelpCenterConfiguration.Builder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ai getCurrentFragment() {
        return getSupportFragmentManager().black(R.id.fragment_container);
    }

    private HelpSearchFragment getSearchFragment() {
        if (getCurrentFragment() instanceof HelpSearchFragment) {
            Logger.d(LOG_TAG, "showSearchResults: current fragment is a HelpSearchFragment", new Object[0]);
            return (HelpSearchFragment) getCurrentFragment();
        }
        HelpSearchFragment newInstance = HelpSearchFragment.newInstance(this.helpCenterConfiguration, this.helpCenterProvider);
        L supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        C0606a c0606a = new C0606a(supportFragmentManager);
        c0606a.echo(newInstance, null, R.id.fragment_container);
        c0606a.charlie(null);
        c0606a.india();
        return newInstance;
    }

    private a initToolbar() {
        this.appBarLayout = (AppBarLayout) findViewById(R.id.appbar_help_center);
        this.toolbar = (Toolbar) findViewById(R.id.support_toolbar);
        findViewById(R.id.support_compat_shadow).setVisibility(8);
        setSupportActionBar(this.toolbar);
        return getSupportActionBar();
    }

    private boolean noFragmentAdded() {
        if (getCurrentFragment() == null) {
            return true;
        }
        return false;
    }

    private void showCreateRequest(Map<String, Object> map) {
        String simpleName;
        ActionHandler handlerByAction = this.actionHandlerRegistry.handlerByAction("action_contact_option");
        if (handlerByAction != null) {
            ActionDescription actionDescription = handlerByAction.getActionDescription();
            if (actionDescription != null) {
                simpleName = actionDescription.getLocalizedLabel();
            } else {
                simpleName = handlerByAction.getClass().getSimpleName();
            }
            Logger.d(LOG_TAG, "No Deflection ActionHandler Available, opening %s", simpleName);
            handlerByAction.handle(map, this);
        }
    }

    @Override // zendesk.support.guide.HelpCenterMvp.View
    public void announceContentLoaded() {
        this.contactUsButton.announceForAccessibility(getString(R.string.zs_help_center_content_loaded_accessibility));
    }

    @Override // zendesk.support.guide.HelpCenterMvp.View
    public void clearSearchResults() {
        if (getCurrentFragment() instanceof HelpSearchFragment) {
            ((HelpSearchFragment) getCurrentFragment()).clearResults();
        }
    }

    @Override // zendesk.support.guide.HelpCenterMvp.View
    public void dismissError() {
        C1901g c1901g = this.errorSnackbar;
        if (c1901g != null) {
            c1901g.alpha(3);
        }
        this.snackbarStatus = SnackbarStatus.NONE;
    }

    @Override // zendesk.support.guide.HelpCenterMvp.View
    public void exitActivity() {
        finish();
    }

    @Override // zendesk.support.guide.HelpCenterMvp.View
    public Context getContext() {
        return getApplicationContext();
    }

    @Override // zendesk.support.guide.HelpCenterMvp.View
    public void hideLoadingState() {
        this.loadingView.setVisibility(8);
    }

    @Override // zendesk.support.guide.HelpCenterMvp.View
    public boolean isShowingHelp() {
        return getCurrentFragment() instanceof HelpCenterFragment;
    }

    @Override // androidx.fragment.app.an, ae.o, f1.i, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Resources.Theme theme = getTheme();
        theme.applyStyle(R.style.ZendeskActivityDefaultTheme, true);
        theme.applyStyle(R.style.ZendeskSupportActivityThemeDefaultIcon, false);
        setContentView(R.layout.zs_activity_help_center);
        GuideSdkDependencyProvider guideSdkDependencyProvider = GuideSdkDependencyProvider.INSTANCE;
        if (!guideSdkDependencyProvider.isInitialized()) {
            Logger.e(LOG_TAG, GuideSdkDependencyProvider.NOT_INITIALIZED_LOG, new Object[0]);
            finish();
            return;
        }
        guideSdkDependencyProvider.provideGuideSdkComponent().inject(this);
        HelpCenterConfiguration helpCenterConfiguration = (HelpCenterConfiguration) this.configurationHelper.fromBundle(getIntent().getExtras(), HelpCenterConfiguration.class);
        this.helpCenterConfiguration = helpCenterConfiguration;
        if (helpCenterConfiguration == null) {
            Logger.e(LOG_TAG, "No configuration found. Please use HelpCenterActivity.builder()", new Object[0]);
            finish();
            return;
        }
        this.engines = helpCenterConfiguration.getEngines();
        initToolbar().oscar(true);
        this.loadingView = findViewById(R.id.loading_view);
        FloatingActionButton floatingActionButton = (FloatingActionButton) findViewById(R.id.contact_us_button);
        this.contactUsButton = floatingActionButton;
        floatingActionButton.setOnClickListener(new View.OnClickListener() { // from class: zendesk.support.guide.HelpCenterActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                HelpCenterActivity.this.showContactZendesk();
            }
        });
        HelpCenterPresenter helpCenterPresenter = new HelpCenterPresenter(this, new HelpCenterModel(this.helpCenterProvider, this.settingsProvider), this.networkInfoProvider, this.actionHandlerRegistry);
        this.presenter = helpCenterPresenter;
        helpCenterPresenter.init(this.helpCenterConfiguration, this.engines);
        addOnBackStackChangedListener();
        applyWindowInsets();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.zs_fragment_help_menu_conversations, menu);
        this.conversationsMenuItem = menu.findItem(R.id.fragment_help_menu_contact);
        MenuItem findItem = menu.findItem(R.id.fragment_help_menu_search);
        this.searchViewMenuItem = findItem;
        if (findItem != null) {
            if (!this.networkInfoProvider.isNetworkAvailable()) {
                this.searchViewMenuItem.setEnabled(false);
            }
            SearchView searchView = (SearchView) this.searchViewMenuItem.getActionView();
            searchView.setImeOptions(searchView.getImeOptions() | 268435456);
            searchView.setOnQueryTextListener(new J0() { // from class: zendesk.support.guide.HelpCenterActivity.3
                @Override // androidx.appcompat.widget.J0
                public boolean onQueryTextChange(String str) {
                    return false;
                }

                @Override // androidx.appcompat.widget.J0
                public boolean onQueryTextSubmit(String str) {
                    if (HelpCenterActivity.this.presenter != null) {
                        HelpCenterActivity.this.presenter.onSearchSubmit(str);
                        return true;
                    }
                    return false;
                }
            });
            return true;
        }
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            onBackPressed();
            return true;
        }
        if (itemId == R.id.fragment_help_menu_contact) {
            showRequestList();
            return true;
        }
        return false;
    }

    @Override // androidx.fragment.app.an, android.app.Activity
    public void onPause() {
        super.onPause();
        HelpCenterMvp.Presenter presenter = this.presenter;
        if (presenter != null) {
            presenter.onPause();
        }
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        boolean z2;
        MenuItem menuItem;
        HelpCenterMvp.Presenter presenter = this.presenter;
        if (presenter != null && (menuItem = this.searchViewMenuItem) != null) {
            menuItem.setVisible(presenter.shouldShowSearchMenuItem());
        }
        if (this.presenter != null && this.conversationsMenuItem != null) {
            boolean z10 = false;
            if (this.actionHandlerRegistry.handlerByAction("action_conversation_list") != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            MenuItem menuItem2 = this.conversationsMenuItem;
            if (this.presenter.shouldShowConversationsMenuItem() && z2) {
                z10 = true;
            }
            menuItem2.setVisible(z10);
        }
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // androidx.fragment.app.an, android.app.Activity
    public void onResume() {
        super.onResume();
        HelpCenterMvp.Presenter presenter = this.presenter;
        if (presenter != null) {
            presenter.onResume(this);
        }
    }

    @Override // androidx.appcompat.app.i, androidx.fragment.app.an, android.app.Activity
    public void onStart() {
        C1901g c1901g;
        super.onStart();
        if (this.snackbarStatus != SnackbarStatus.NONE && (c1901g = this.errorSnackbar) != null) {
            c1901g.juliet();
        }
    }

    @Override // zendesk.support.guide.HelpCenterMvp.View
    public void setSearchEnabled(boolean z2) {
        this.searchViewMenuItem.setEnabled(z2);
    }

    @Override // zendesk.support.guide.HelpCenterMvp.View
    public void showContactUsButton() {
        this.contactUsButton.setVisibility(0);
    }

    @Override // zendesk.support.guide.HelpCenterMvp.View
    public void showContactZendesk() {
        HashMap hashMap = new HashMap();
        this.configurationHelper.addToMap(hashMap, this.helpCenterConfiguration);
        if (CollectionUtils.isNotEmpty(this.engines)) {
            MessagingActivity.builder().withEngines(this.engines).show(this, this.helpCenterConfiguration.getConfigurations());
        } else {
            showCreateRequest(hashMap);
        }
    }

    @Override // zendesk.support.guide.HelpCenterMvp.View
    public void showHelp(HelpCenterConfiguration helpCenterConfiguration) {
        if (noFragmentAdded()) {
            HelpCenterFragment newInstance = HelpCenterFragment.newInstance(helpCenterConfiguration);
            newInstance.setPresenter(this.presenter);
            addFragment(newInstance);
        } else if (getCurrentFragment() instanceof HelpCenterFragment) {
            ((HelpCenterFragment) getCurrentFragment()).setPresenter(this.presenter);
        }
        invalidateOptionsMenu();
    }

    @Override // zendesk.support.guide.HelpCenterMvp.View
    public void showLoadArticleErrorWithRetry(HelpCenterMvp.ErrorType errorType, final RetryAction retryAction) {
        String string;
        if (errorType == null) {
            Logger.w(LOG_TAG, "ErrorType was null, falling back to 'retry' as label", new Object[0]);
            string = getString(R.string.zui_retry_button_label);
        } else {
            int i4 = AnonymousClass5.$SwitchMap$zendesk$support$guide$HelpCenterMvp$ErrorType[errorType.ordinal()];
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        Logger.w(LOG_TAG, "Unknown or unhandled error type, falling back to error type name as label", new Object[0]);
                        string = getString(R.string.support_help_search_no_results_label) + " " + errorType.name();
                    } else {
                        string = getString(R.string.support_articles_list_fragment_error_message);
                    }
                } else {
                    string = getString(R.string.support_sections_list_fragment_error_message);
                }
            } else {
                string = getString(R.string.support_categories_list_fragment_error_message);
            }
        }
        if (this.snackbarStatus == SnackbarStatus.NONE) {
            C1901g hotel = C1901g.hotel(this.contactUsButton, string, -2);
            this.errorSnackbar = hotel;
            hotel.india(hotel.hotel.getText(R.string.zui_retry_button_label), new View.OnClickListener() { // from class: zendesk.support.guide.HelpCenterActivity.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    HelpCenterActivity.this.errorSnackbar.alpha(3);
                    HelpCenterActivity.this.snackbarStatus = SnackbarStatus.NONE;
                    retryAction.onRetry();
                }
            });
            this.errorSnackbar.juliet();
            this.snackbarStatus = SnackbarStatus.CONTENT_ERROR;
        }
    }

    @Override // zendesk.support.guide.HelpCenterMvp.View
    public void showLoadingState() {
        ai currentFragment = getCurrentFragment();
        if (currentFragment != null && currentFragment.isVisible()) {
            L supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            C0606a c0606a = new C0606a(supportFragmentManager);
            c0606a.lima(getCurrentFragment());
            c0606a.india();
        }
        this.loadingView.setVisibility(0);
    }

    @Override // zendesk.support.guide.HelpCenterMvp.View
    public void showNoConnectionError() {
        SnackbarStatus snackbarStatus = this.snackbarStatus;
        SnackbarStatus snackbarStatus2 = SnackbarStatus.NO_CONNECTION;
        if (snackbarStatus != snackbarStatus2) {
            C1901g golf = C1901g.golf(this.contactUsButton, R.string.zg_general_no_connection_message, -2);
            this.errorSnackbar = golf;
            golf.juliet();
            this.snackbarStatus = snackbarStatus2;
        }
    }

    @Override // zendesk.support.guide.HelpCenterMvp.View
    public void showRequestList() {
        ActionHandler handlerByAction = this.actionHandlerRegistry.handlerByAction("action_conversation_list");
        if (handlerByAction != null) {
            HashMap hashMap = new HashMap();
            this.configurationHelper.addToMap(hashMap, this.helpCenterConfiguration);
            handlerByAction.handle(hashMap, this);
        }
    }

    @Override // zendesk.support.guide.HelpCenterMvp.View
    public void showSearchResults(List<SearchArticle> list, String str) {
        getSearchFragment().updateResults(list, str);
    }
}
