package zendesk.support.guide;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.a;
import androidx.appcompat.app.i;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import av.q;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.zendesk.guide.sdk.R;
import com.zendesk.logger.Logger;
import com.zendesk.service.ErrorResponse;
import com.zendesk.service.SafeZendeskCallback;
import com.zendesk.service.ZendeskCallback;
import com.zendesk.util.CollectionUtils;
import com.zendesk.util.FileUtils;
import com.zendesk.util.StringUtils;
import i7.C1901g;
import java.nio.charset.Charset;
import java.text.DateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import s6.T6;
import zendesk.classic.messaging.Engine;
import zendesk.classic.messaging.MessagingActivity;
import zendesk.commonui.InsetType;
import zendesk.commonui.SystemWindowInsets;
import zendesk.configurations.ConfigurationHelper;
import zendesk.core.ActionDescription;
import zendesk.core.ActionHandler;
import zendesk.core.ActionHandlerRegistry;
import zendesk.core.AnonymousIdentity;
import zendesk.core.ApplicationConfiguration;
import zendesk.core.Identity;
import zendesk.core.NetworkAware;
import zendesk.core.NetworkInfoProvider;
import zendesk.core.UrlHelper;
import zendesk.core.Zendesk;
import zendesk.support.Article;
import zendesk.support.ArticleVoteStorage;
import zendesk.support.AttachmentType;
import zendesk.support.Constants;
import zendesk.support.HelpCenterAttachment;
import zendesk.support.HelpCenterProvider;
import zendesk.support.HelpCenterSettings;
import zendesk.support.HelpCenterSettingsProvider;
import zendesk.support.guide.ArticleConfiguration;

/* loaded from: classes.dex */
public class ViewArticleActivity extends i implements AdapterView.OnItemClickListener {
    private static final String ARTICLE_DETAIL_FORMAT_STRING = "%s %s <span dir=\"auto\">%s</span>";
    private static final String CSS_FILE = "file:///android_asset/help_center_article_style.css";
    private static final long FETCH_ATTACHMENTS_DELAY_MILLIS = 250;
    static final String LOG_TAG = "ViewArticleActivity";
    private static final Integer NETWORK_AWARE_ID = 57564;
    private static final String TYPE_TEXT_HTML = "text/html";
    private static final String UTF_8_ENCODING_TYPE = "UTF-8";
    ActionHandlerRegistry actionHandlerRegistry;
    private ArticleAttachmentAdapter adapter;
    private AppBarLayout appBarLayout;
    ApplicationConfiguration applicationConfiguration;
    private ArticleViewModel article;
    private WebView articleContentWebView;
    private Long articleId;
    ArticleVoteStorage articleVoteStorage;
    private ArticleVotingView articleVotingView;
    private ListView attachmentListView;
    private SafeZendeskCallback<List<HelpCenterAttachment>> attachmentRequestCallback;
    private ArticleConfiguration config;
    ConfigurationHelper configurationHelper;
    private CoordinatorLayout coordinatorLayout;
    private List<Engine> engines;
    HelpCenterProvider helpCenterProvider;
    NetworkInfoProvider networkInfoProvider;
    OkHttpClient okHttpClient;
    private ProgressBar progressView;
    HelpCenterSettingsProvider settingsProvider;
    private C1901g snackbar;
    private Toolbar toolbar;
    private View viewArticleFrame;
    private final AggregatedCallback<HelpCenterSettings> settingsAggregatedCallback = new AggregatedCallback<>();
    private final Handler handler = new Handler();
    private final NetworkAware networkConnectionCallbacks = new NetworkAware() { // from class: zendesk.support.guide.ViewArticleActivity.6
        boolean connected = true;

        @Override // zendesk.core.NetworkAware
        public void onNetworkAvailable() {
            if (NetworkUtils.isConnectedOrConnecting(ViewArticleActivity.this)) {
                ViewArticleActivity.this.dimissSnackBar();
                this.connected = true;
                if (ViewArticleActivity.this.articleId != null && ViewArticleActivity.this.article == null) {
                    ViewArticleActivity viewArticleActivity = ViewArticleActivity.this;
                    viewArticleActivity.fetchArticle(viewArticleActivity.articleId.longValue());
                } else if (ViewArticleActivity.this.article != null) {
                    ViewArticleActivity viewArticleActivity2 = ViewArticleActivity.this;
                    viewArticleActivity2.fetchAttachmentsForArticle(viewArticleActivity2.article.getId());
                }
            }
        }

        @Override // zendesk.core.NetworkAware
        @SuppressLint({"MissingPermission"})
        public void onNetworkUnavailable() {
            if (!NetworkUtils.isConnectedOrConnecting(ViewArticleActivity.this) && this.connected) {
                this.connected = false;
                ViewArticleActivity.this.dimissSnackBar();
                ViewArticleActivity viewArticleActivity = ViewArticleActivity.this;
                viewArticleActivity.snackbar = C1901g.golf(viewArticleActivity.coordinatorLayout, R.string.zg_general_no_connection_message, -2);
                ViewArticleActivity.this.snackbar.juliet();
            }
        }
    };

    /* renamed from: zendesk.support.guide.ViewArticleActivity$8, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass8 {
        static final /* synthetic */ int[] $SwitchMap$zendesk$support$guide$ViewArticleActivity$LoadingState;

        static {
            int[] iArr = new int[LoadingState.values().length];
            $SwitchMap$zendesk$support$guide$ViewArticleActivity$LoadingState = iArr;
            try {
                iArr[LoadingState.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$zendesk$support$guide$ViewArticleActivity$LoadingState[LoadingState.DISPLAYING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$zendesk$support$guide$ViewArticleActivity$LoadingState[LoadingState.ERRORED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$zendesk$support$guide$ViewArticleActivity$LoadingState[LoadingState.ERRORED_ATTACHMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static class ArticleAttachmentAdapter extends ArrayAdapter<HelpCenterAttachment> {
        public ArticleAttachmentAdapter(Context context) {
            super(context, R.layout.zs_row_article_attachment);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i4, View view, ViewGroup viewGroup) {
            ArticleAttachmentRow articleAttachmentRow;
            if (view instanceof ArticleAttachmentRow) {
                articleAttachmentRow = (ArticleAttachmentRow) view;
            } else {
                articleAttachmentRow = new ArticleAttachmentRow(getContext());
            }
            articleAttachmentRow.bind((HelpCenterAttachment) getItem(i4));
            return articleAttachmentRow;
        }
    }

    /* loaded from: classes.dex */
    public static class ArticleAttachmentRow extends RelativeLayout {
        private final TextView fileName;
        private final TextView fileSize;

        public ArticleAttachmentRow(Context context) {
            super(context);
            View.inflate(context, R.layout.zs_row_article_attachment, this);
            this.fileName = (TextView) findViewById(R.id.article_attachment_row_filename_text);
            this.fileSize = (TextView) findViewById(R.id.article_attachment_row_filesize_text);
        }

        public void bind(HelpCenterAttachment helpCenterAttachment) {
            this.fileName.setText(helpCenterAttachment.getFileName());
            this.fileSize.setText(FileUtils.humanReadableFileSize(helpCenterAttachment.getSize()));
        }
    }

    /* loaded from: classes.dex */
    public class AttachmentRequestCallback extends ZendeskCallback<List<HelpCenterAttachment>> {
        public AttachmentRequestCallback() {
        }

        @Override // com.zendesk.service.ZendeskCallback
        public void onError(ErrorResponse errorResponse) {
            ViewArticleActivity.this.adapter.clear();
            ViewArticleActivity.this.setLoadingState(LoadingState.ERRORED_ATTACHMENT);
            Logger.e(ViewArticleActivity.LOG_TAG, errorResponse);
        }

        @Override // com.zendesk.service.ZendeskCallback
        public void onSuccess(List<HelpCenterAttachment> list) {
            ViewArticleActivity.this.adapter.clear();
            ViewArticleActivity.this.adapter.addAll(list);
            ViewArticleActivity.setListViewHeightBasedOnChildren(ViewArticleActivity.this.attachmentListView);
            ViewArticleActivity.this.setLoadingState(LoadingState.DISPLAYING);
        }
    }

    /* loaded from: classes.dex */
    public enum LoadingState {
        LOADING,
        DISPLAYING,
        ERRORED,
        ERRORED_ATTACHMENT
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void applyVoteButtonSettings() {
        loadSettings(new ZendeskCallback<HelpCenterSettings>() { // from class: zendesk.support.guide.ViewArticleActivity.7
            @Override // com.zendesk.service.ZendeskCallback
            public void onError(ErrorResponse errorResponse) {
                ViewArticleActivity.this.articleVotingView.setVisibility(8);
            }

            @Override // com.zendesk.service.ZendeskCallback
            public void onSuccess(HelpCenterSettings helpCenterSettings) {
                if (helpCenterSettings.isArticleVotingEnabled()) {
                    ViewArticleActivity.this.articleVotingView.setVisibility(0);
                } else {
                    ViewArticleActivity.this.articleVotingView.setVisibility(8);
                }
            }
        });
    }

    private void applyWindowInsets() {
        SystemWindowInsets.applyWindowInsets(this.appBarLayout, InsetType.TOP);
        Toolbar toolbar = this.toolbar;
        InsetType insetType = InsetType.HORIZONTAL;
        SystemWindowInsets.applyWindowInsets(toolbar, insetType);
        SystemWindowInsets.applyWindowInsets(this.viewArticleFrame, insetType);
    }

    public static ArticleConfiguration.Builder builder(Article article) {
        return new ArticleConfiguration.Builder(article);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dimissSnackBar() {
        C1901g c1901g = this.snackbar;
        if (c1901g != null) {
            c1901g.alpha(3);
            this.snackbar = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fetchArticle(long j5) {
        setLoadingState(LoadingState.LOADING);
        this.helpCenterProvider.getArticle(Long.valueOf(j5), new ZendeskCallback<Article>() { // from class: zendesk.support.guide.ViewArticleActivity.3
            @Override // com.zendesk.service.ZendeskCallback
            public void onError(ErrorResponse errorResponse) {
                ViewArticleActivity.this.setLoadingState(LoadingState.ERRORED);
            }

            @Override // com.zendesk.service.ZendeskCallback
            public void onSuccess(Article article) {
                ViewArticleActivity.this.article = new ArticleViewModel(article);
                ViewArticleActivity.this.loadArticleBody();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fetchAttachmentsForArticle(long j5) {
        setLoadingState(LoadingState.LOADING);
        this.helpCenterProvider.getAttachments(Long.valueOf(j5), AttachmentType.BLOCK, this.attachmentRequestCallback);
    }

    private a initToolbar() {
        this.appBarLayout = (AppBarLayout) findViewById(R.id.appbar_view_article);
        this.toolbar = (Toolbar) findViewById(R.id.view_article_toolbar);
        findViewById(R.id.view_article_compat_shadow).setVisibility(8);
        setSupportActionBar(this.toolbar);
        return getSupportActionBar();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"RestrictedApi"})
    public void loadArticleBody() {
        String str;
        String str2;
        setTitle(getString(R.string.zs_view_article_loaded_accessibility, this.article.getTitle()));
        setLoadingState(LoadingState.DISPLAYING);
        a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.tango(UiUtils.decodeHtmlEntities(this.article.getTitle()));
        }
        String authorName = this.article.getAuthorName();
        if (this.article.getCreatedAt() != null) {
            str = DateFormat.getDateInstance(1, T6.alpha(getResources().getConfiguration()).alpha.get(0)).format(this.article.getCreatedAt());
        } else {
            str = null;
        }
        if (str != null && authorName != null) {
            Locale locale = Locale.US;
            str2 = authorName + " " + getString(R.string.view_article_seperator) + " <span dir=\"auto\">" + str + "</span>";
        } else {
            str2 = "";
        }
        this.articleContentWebView.loadDataWithBaseURL(this.applicationConfiguration.getZendeskUrl(), getString(R.string.view_article_html_body, CSS_FILE, this.article.getTitle(), this.article.getBody(), str2), TYPE_TEXT_HTML, UTF_8_ENCODING_TYPE, null);
        this.handler.postDelayed(new Runnable() { // from class: zendesk.support.guide.ViewArticleActivity.4
            @Override // java.lang.Runnable
            public void run() {
                ViewArticleActivity viewArticleActivity = ViewArticleActivity.this;
                viewArticleActivity.fetchAttachmentsForArticle(viewArticleActivity.article.getId());
                ViewArticleActivity.this.applyVoteButtonSettings();
            }
        }, FETCH_ATTACHMENTS_DELAY_MILLIS);
    }

    private void loadSettings(ZendeskCallback<HelpCenterSettings> zendeskCallback) {
        if (this.settingsAggregatedCallback.add(zendeskCallback)) {
            this.settingsProvider.getSettings(this.settingsAggregatedCallback);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void setListViewHeightBasedOnChildren(ListView listView) {
        ListAdapter adapter = listView.getAdapter();
        if (adapter == null) {
            return;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(listView.getWidth(), 0);
        View view = null;
        int i4 = 0;
        for (int i5 = 0; i5 < adapter.getCount(); i5++) {
            view = adapter.getView(i5, view, listView);
            if (i5 == 0) {
                view.setLayoutParams(new ViewGroup.LayoutParams(makeMeasureSpec, -2));
            }
            view.measure(makeMeasureSpec, 0);
            i4 += view.getMeasuredHeight();
        }
        ViewGroup.LayoutParams layoutParams = listView.getLayoutParams();
        layoutParams.height = ((adapter.getCount() - 1) * listView.getDividerHeight()) + i4;
        listView.setLayoutParams(layoutParams);
        listView.requestLayout();
    }

    private void setupRequestInterceptor() {
        WebView webView = this.articleContentWebView;
        if (webView == null) {
            Logger.w(LOG_TAG, "The webview is null. Make sure you initialise it before trying to add the interceptor", new Object[0]);
        } else {
            webView.setWebViewClient(new WebViewClient() { // from class: zendesk.support.guide.ViewArticleActivity.2
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v10, types: [java.io.InputStream] */
                /* JADX WARN: Type inference failed for: r0v14 */
                /* JADX WARN: Type inference failed for: r0v18, types: [java.io.InputStream] */
                /* JADX WARN: Type inference failed for: r0v20 */
                /* JADX WARN: Type inference failed for: r0v8 */
                /* JADX WARN: Type inference failed for: r0v9 */
                @Override // android.webkit.WebViewClient
                public WebResourceResponse shouldInterceptRequest(WebView webView2, String str) {
                    ?? r02;
                    String str2;
                    ?? r03;
                    String str3;
                    String zendeskUrl = ViewArticleActivity.this.applicationConfiguration.getZendeskUrl();
                    if (!StringUtils.isEmpty(zendeskUrl) && str.startsWith(zendeskUrl)) {
                        Identity identity = Zendesk.INSTANCE.getIdentity();
                        if (UrlHelper.isGuideRequest(str) && (identity instanceof AnonymousIdentity)) {
                            Logger.w(ViewArticleActivity.LOG_TAG, "Will not intercept request because it is anonymous guide request", new Object[0]);
                            return super.shouldInterceptRequest(webView2, str);
                        }
                        String str4 = null;
                        try {
                            Response execute = FirebasePerfOkHttpClient.execute(ViewArticleActivity.this.okHttpClient.newCall(new Request.Builder().url(str).build()));
                            if (execute != null && execute.getIsSuccessful() && execute.body() != null) {
                                r02 = execute.body().byteStream();
                                try {
                                    MediaType mediaType = execute.body().getMediaType();
                                    if (mediaType != null) {
                                        if (StringUtils.hasLength(mediaType.type()) && StringUtils.hasLength(mediaType.subtype())) {
                                            Locale locale = Locale.US;
                                            str2 = mediaType.type() + "/" + mediaType.subtype();
                                        } else {
                                            str2 = null;
                                        }
                                        try {
                                            Charset charset = mediaType.charset();
                                            if (charset != null) {
                                                str4 = charset.name();
                                            }
                                            str3 = str4;
                                        } catch (Exception e) {
                                            e = e;
                                            Logger.e(ViewArticleActivity.LOG_TAG, "Exception encountered when trying to intercept request", e, new Object[0]);
                                            r03 = r02;
                                            return new WebResourceResponse(str2, str4, r03);
                                        }
                                    } else {
                                        str3 = null;
                                        str2 = null;
                                    }
                                    str4 = r02;
                                } catch (Exception e4) {
                                    e = e4;
                                    str2 = null;
                                }
                            } else {
                                str3 = null;
                                str2 = null;
                            }
                            r03 = str4;
                            str4 = str3;
                        } catch (Exception e5) {
                            e = e5;
                            r02 = 0;
                            str2 = null;
                        }
                        return new WebResourceResponse(str2, str4, r03);
                    }
                    Logger.w(ViewArticleActivity.LOG_TAG, q.echo("Will not intercept request because the url is not hosted by Zendesk", str), new Object[0]);
                    return super.shouldInterceptRequest(webView2, str);
                }

                @Override // android.webkit.WebViewClient
                public boolean shouldOverrideUrlLoading(WebView webView2, String str) {
                    ActionHandler handlerByAction = ViewArticleActivity.this.actionHandlerRegistry.handlerByAction(str);
                    if (handlerByAction != null && str.contains(ViewArticleActivity.this.applicationConfiguration.getZendeskUrl())) {
                        HashMap hashMap = new HashMap();
                        hashMap.put(Constants.KEY_HELP_CENTER_ARTICLE_URL, str);
                        ViewArticleActivity viewArticleActivity = ViewArticleActivity.this;
                        viewArticleActivity.configurationHelper.addToMap(hashMap, viewArticleActivity.config);
                        handlerByAction.handle(hashMap, ViewArticleActivity.this);
                        return true;
                    }
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                    if (intent.resolveActivity(webView2.getContext().getPackageManager()) != null) {
                        webView2.getContext().startActivity(intent);
                        return true;
                    }
                    Logger.d(ViewArticleActivity.LOG_TAG, q.echo("No browser available to open url: ", str), new Object[0]);
                    return false;
                }
            });
        }
    }

    private boolean shouldShowContactUsButton() {
        boolean z2;
        if (this.actionHandlerRegistry.handlerByAction("action_contact_option") != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean isNotEmpty = CollectionUtils.isNotEmpty(this.engines);
        if (!this.config.isContactUsButtonVisible() || (!z2 && !isNotEmpty)) {
            return false;
        }
        return true;
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

    @Override // androidx.fragment.app.an, ae.o, f1.i, android.app.Activity
    @SuppressLint({"SetJavaScriptEnabled", "RestrictedApi"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getTheme().applyStyle(R.style.ZendeskActivityDefaultTheme, true);
        setContentView(R.layout.zs_activity_view_article);
        GuideSdkDependencyProvider guideSdkDependencyProvider = GuideSdkDependencyProvider.INSTANCE;
        if (!guideSdkDependencyProvider.isInitialized()) {
            Logger.e(LOG_TAG, GuideSdkDependencyProvider.NOT_INITIALIZED_LOG, new Object[0]);
            finish();
            return;
        }
        guideSdkDependencyProvider.provideGuideSdkComponent().inject(this);
        a initToolbar = initToolbar();
        ArticleConfiguration articleConfiguration = (ArticleConfiguration) this.configurationHelper.fromBundle(getIntent().getExtras(), ArticleConfiguration.class);
        this.config = articleConfiguration;
        if (articleConfiguration != null && articleConfiguration.getConfigurationState() != -1) {
            this.engines = this.config.getEngines();
            this.viewArticleFrame = findViewById(R.id.view_article_frame);
            this.attachmentListView = (ListView) findViewById(R.id.view_article_attachment_list);
            ArticleAttachmentAdapter articleAttachmentAdapter = new ArticleAttachmentAdapter(this);
            this.adapter = articleAttachmentAdapter;
            this.attachmentListView.setAdapter((ListAdapter) articleAttachmentAdapter);
            this.attachmentListView.setOnItemClickListener(this);
            if (initToolbar != null) {
                initToolbar.oscar(true);
            }
            WebView webView = (WebView) findViewById(R.id.view_article_content_webview);
            this.articleContentWebView = webView;
            webView.setWebChromeClient(new WebChromeClient());
            this.articleContentWebView.getSettings().setJavaScriptEnabled(true);
            setupRequestInterceptor();
            this.articleContentWebView.getSettings().setMixedContentMode(0);
            this.progressView = (ProgressBar) findViewById(R.id.view_article_progress);
            this.coordinatorLayout = (CoordinatorLayout) findViewById(R.id.view_article_attachment_coordinator);
            if (this.config.getConfigurationState() == 2) {
                ArticleViewModel article = this.config.getArticle();
                this.article = article;
                if (article != null) {
                    this.articleId = Long.valueOf(article.getId());
                }
                loadArticleBody();
            } else {
                fetchArticle(this.config.getArticleId());
                this.articleId = Long.valueOf(this.config.getArticleId());
            }
            if (shouldShowContactUsButton()) {
                FloatingActionButton floatingActionButton = (FloatingActionButton) findViewById(R.id.contact_us_button);
                floatingActionButton.setOnClickListener(new View.OnClickListener() { // from class: zendesk.support.guide.ViewArticleActivity.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        ViewArticleActivity.this.showContactZendesk();
                    }
                });
                floatingActionButton.setVisibility(0);
            }
            ArticleVotingView articleVotingView = (ArticleVotingView) findViewById(R.id.article_voting_container);
            this.articleVotingView = articleVotingView;
            articleVotingView.bindTo(this.articleId, this.articleVoteStorage, this.helpCenterProvider);
            this.articleVotingView.setVisibility(8);
            applyVoteButtonSettings();
            applyWindowInsets();
            return;
        }
        Logger.e(LOG_TAG, "No configuration found. Please use ViewArticleActivity.builder()", new Object[0]);
        finish();
    }

    @Override // androidx.appcompat.app.i, androidx.fragment.app.an, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.settingsAggregatedCallback.cancel();
        WebView webView = this.articleContentWebView;
        if (webView != null) {
            webView.destroy();
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j5) {
        Object itemAtPosition = adapterView.getItemAtPosition(i4);
        if (itemAtPosition instanceof HelpCenterAttachment) {
            HelpCenterAttachment helpCenterAttachment = (HelpCenterAttachment) itemAtPosition;
            if (helpCenterAttachment.getContentUrl() != null) {
                Uri parse = Uri.parse(helpCenterAttachment.getContentUrl());
                Intent intent = new Intent();
                intent.setAction("android.intent.action.VIEW");
                intent.setData(parse);
                startActivity(intent);
                return;
            }
            Logger.w(LOG_TAG, "Unable to launch viewer, unable to parse URI for attachment", new Object[0]);
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.appcompat.app.i, androidx.fragment.app.an, android.app.Activity
    public void onStart() {
        super.onStart();
        this.attachmentRequestCallback = SafeZendeskCallback.from(new AttachmentRequestCallback());
        this.networkInfoProvider.addNetworkAwareListener(NETWORK_AWARE_ID, this.networkConnectionCallbacks);
        this.networkInfoProvider.register();
    }

    @Override // androidx.appcompat.app.i, androidx.fragment.app.an, android.app.Activity
    public void onStop() {
        super.onStop();
        SafeZendeskCallback<List<HelpCenterAttachment>> safeZendeskCallback = this.attachmentRequestCallback;
        if (safeZendeskCallback != null) {
            safeZendeskCallback.cancel();
            this.attachmentRequestCallback = null;
        }
        this.networkInfoProvider.removeNetworkAwareListener(NETWORK_AWARE_ID);
        this.networkInfoProvider.unregister();
    }

    public void setLoadingState(LoadingState loadingState) {
        if (loadingState == null) {
            Logger.w(LOG_TAG, "LoadingState was null, nothing to do", new Object[0]);
            return;
        }
        int i4 = AnonymousClass8.$SwitchMap$zendesk$support$guide$ViewArticleActivity$LoadingState[loadingState.ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    if (i4 != 4) {
                        return;
                    }
                    showLoadingErrorState(R.string.view_article_attachments_error);
                    return;
                }
                showLoadingErrorState(R.string.zs_view_article_error);
                return;
            }
            UiUtils.setVisibility(this.progressView, 8);
            UiUtils.setVisibility(this.attachmentListView, 0);
            return;
        }
        UiUtils.setVisibility(this.progressView, 0);
        UiUtils.setVisibility(this.attachmentListView, 8);
    }

    public void showContactZendesk() {
        HashMap hashMap = new HashMap();
        this.configurationHelper.addToMap(hashMap, this.config);
        if (CollectionUtils.isNotEmpty(this.engines)) {
            MessagingActivity.builder().withEngines(this.engines).show(this, this.config.getConfigurations());
        } else {
            showCreateRequest(hashMap);
        }
    }

    public void showLoadingErrorState(int i4) {
        UiUtils.setVisibility(this.progressView, 8);
        UiUtils.setVisibility(this.attachmentListView, 8);
        dimissSnackBar();
        C1901g golf = C1901g.golf(this.coordinatorLayout, i4, -2);
        int i5 = R.string.zui_retry_button_label;
        golf.india(golf.hotel.getText(i5), new View.OnClickListener() { // from class: zendesk.support.guide.ViewArticleActivity.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (ViewArticleActivity.this.articleId != null && ViewArticleActivity.this.article == null) {
                    ViewArticleActivity viewArticleActivity = ViewArticleActivity.this;
                    viewArticleActivity.fetchArticle(viewArticleActivity.articleId.longValue());
                } else if (ViewArticleActivity.this.article != null) {
                    ViewArticleActivity viewArticleActivity2 = ViewArticleActivity.this;
                    viewArticleActivity2.fetchAttachmentsForArticle(viewArticleActivity2.article.getId());
                }
                ViewArticleActivity.this.dimissSnackBar();
            }
        });
        this.snackbar = golf;
        golf.juliet();
    }

    public static ArticleConfiguration.Builder builder(long j5) {
        return new ArticleConfiguration.Builder(j5);
    }

    public static ArticleConfiguration.Builder builder() {
        return new ArticleConfiguration.Builder();
    }
}
